package com.example.opponotificationrelay;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.concurrent.*;

/**
 * 由本 APK 的 dex 启动的只读 Root 辅助进程。
 * 优先订阅指定 UID；旧接口回调先按 UID 过滤，再查询状态、peek 已有 Binder 并 linkToDeath。
 * 不绑定/启动/停止服务，不读取官方私有文件，不发送官方业务事务。
 */
public final class RootHealthObserver {
    private final Map<String,Integer> packages = new LinkedHashMap<>();
    private final Set<Integer> uids = new HashSet<>();
    private final Map<String,Link> links = new HashMap<>();
    private final ScheduledExecutorService events = Executors.newSingleThreadScheduledExecutor();
    private final ObserverStateGate stateGate=new ObserverStateGate();
    private final CoalescedRecheck uidChanges;
    private Object am, observer;
    private Method query, peek, unregister;
    private boolean registered;
    private volatile boolean closed;
    private int nonexistent;
    private IBinder managerBinder;
    private IBinder.DeathRecipient managerDeath;
    private HandoverPolicy.Presence last = HandoverPolicy.Presence.UNKNOWN;
    private RootHealthObserver() {
        uidChanges=new CoalescedRecheck(events,() -> {
            if(closed) return;
            // ONLINE already yielded ownership; no UNKNOWN/ONLINE churn is necessary.
            if(last!=HandoverPolicy.Presence.ONLINE) invalidate("UID");
            refresh(0,"UID");
        });
    }
    private static final class Link {
        final IBinder binder;
        final IBinder.DeathRecipient death;
        Link(IBinder b, IBinder.DeathRecipient d) { binder=b; death=d; }
    }
    private static synchronized void emit(String text) {
        System.out.println(ObserverMessage.PREFIX + " " + text);
        System.out.flush();
    }
    private void submit(Runnable task) {
        if (!closed) try { events.execute(task); } catch (RejectedExecutionException ignored) { }
    }
    private final class Callback extends Binder {
        private final Map<Integer,String> codes = new HashMap<>();
        Callback() throws Exception {
            for (Field f:Class.forName("android.app.IUidObserver$Stub").getDeclaredFields()) {
                if (f.getName().startsWith("TRANSACTION_")) {
                    f.setAccessible(true); codes.put(f.getInt(null),f.getName());
                }
            }
        }
        @Override protected boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            if (code == INTERFACE_TRANSACTION) {
                if(reply != null) reply.writeString("android.app.IUidObserver");
                return true;
            }
            String name=codes.get(code);
            if(name == null) return super.onTransact(code,data,reply,flags);
            data.enforceInterface("android.app.IUidObserver");
            int uid=data.readInt();
            if(uids.contains(uid) && !closed && ("TRANSACTION_onUidGone".equals(name)
                    || "TRANSACTION_onUidStateChanged".equals(name))) {
                try {uidChanges.signal();} catch(RejectedExecutionException ignored) { }
            }
            return true;
        }
    }
    private void init(String[] args) throws Exception {
        if(android.os.Process.myUid() != 0) throw new SecurityException("Root required");
        boolean compact=args.length>0 && "--compact".equals(args[0]);
        if(compact) args=Arrays.copyOfRange(args,1,args.length);
        if(args.length < 1 || args.length > 2) throw new IllegalArgumentException("package count");
        for(String arg:args) {
            String[] pair=arg.split(":");
            if(pair.length != 2 || !("com.heytap.health".equals(pair[0]) || "com.coloros.health".equals(pair[0])))
                throw new IllegalArgumentException("package not allowed");
            int uid=Integer.parseInt(pair[1]);
            if(uid < 0) throw new IllegalArgumentException("uid");
            packages.put(pair[0],uid); uids.add(uid);
        }
        Class<?> activity=Class.forName("android.app.ActivityManager");
        am=activity.getMethod("getService").invoke(null);
        Class<?> api=Class.forName("android.app.IActivityManager"), type=Class.forName("android.app.IUidObserver");
        query=api.getMethod("getUidProcessState",int.class,String.class);
        peek=api.getMethod("peekService",Intent.class,String.class,String.class);
        unregister=api.getMethod("unregisterUidObserver",type);
        Field absent=activity.getDeclaredField("PROCESS_STATE_NONEXISTENT"); absent.setAccessible(true); nonexistent=absent.getInt(null);
        int cutpoint=-1;
        try {
            Field cached=activity.getDeclaredField("PROCESS_STATE_CACHED_EMPTY");cached.setAccessible(true);
            cutpoint=ObserverStateGate.cutpoint(nonexistent,cached.getInt(null));
        } catch(ReflectiveOperationException ignored) { /* Unknown layout: retain full state callbacks. */ }
        int flags=0;
        for(String n:new String[]{"UID_OBSERVER_PROCSTATE","UID_OBSERVER_GONE"}) {
            Field f=activity.getDeclaredField(n); f.setAccessible(true); flags |= f.getInt(null);
        }
        Callback callback=new Callback();
        observer=Proxy.newProxyInstance(type.getClassLoader(),new Class<?>[]{type},(p,m,a) -> {
            if("asBinder".equals(m.getName())) return callback;
            if("toString".equals(m.getName())) return "OafHealthUidObserver";
            if("hashCode".equals(m.getName())) return System.identityHashCode(p);
            if("equals".equals(m.getName())) return p == a[0];
            return null;
        });
        int[] selected=new int[uids.size()]; int index=0;
        for(int uid:uids) selected[index++]=uid;
        ObserverRegistration.register(am,api,type,observer,flags,cutpoint,selected);
        registered=true;
        managerBinder=((IInterface)am).asBinder();
        managerDeath=() -> { emit("ERROR SYSTEM_SERVICE_DIED"); System.exit(2); };
        managerBinder.linkToDeath(managerDeath,0);
        emit("READY");
        refresh(0,"INITIAL");
        // 启动后补取尚未发布的 Binder，两次一次性尝试，不设后台扫描循环。
        events.schedule(this::supplement,2,TimeUnit.SECONDS);
        events.schedule(() -> {supplement();if(compact) trimStartupMemory();},10,TimeUnit.SECONDS);
    }
    /** Best effort, once after initialization. Never a periodic GC/trim loop. */
    private void trimStartupMemory() {
        try {
            Class<?> vm=Class.forName("dalvik.system.VMRuntime");
            Object runtime=vm.getMethod("getRuntime").invoke(null);
            vm.getMethod("setTargetHeapUtilization",float.class).invoke(runtime,0.8f);
            vm.getMethod("trimHeap").invoke(runtime);
        } catch(Exception ignored) { /* OEM runtimes may not expose these optional hints. */ }
    }
    private void refresh(long request,String reason) {
        if(closed) return;
        long revision=uidChanges.revision();
        // A queued UID change invalidates any in-flight takeover confirmation first.
        if(request!=0 && uidChanges.pending()) invalidate("UID");
        try {
            boolean online=false;
            for(int uid:uids) {
                int state=(Integer)query.invoke(am,uid,"com.android.shell");
                if(state < 0 || state > nonexistent) throw new IllegalStateException("unexpected state");
                if(state != nonexistent) online=true;
            }
            if(revision!=uidChanges.revision()) {invalidate("UID");return;}
            last=online ? HandoverPolicy.Presence.ONLINE : HandoverPolicy.Presence.OFFLINE;
            if(!online) clearLinks();
            // 先汇报主状态，不能让可选的服务查询拖延官方优先决策。
            publishState(request,reason);
            if(online) supplement();
        } catch(Exception e) {
            last=HandoverPolicy.Presence.UNKNOWN;
            emit("ERROR UID_QUERY_FAILED");
        }
    }
    private void invalidate(String reason) {if(stateGate.invalidate()) emit("DIRTY "+reason);}
    private void publishState(long request,String reason) {
        if(stateGate.publish(request,last,links.size())) emit("STATE "+request+" "+last+" "+links.size()+" "+reason);
    }
    private void supplement() {
        if(closed || last != HandoverPolicy.Presence.ONLINE) return;
        int before=links.size();
        for(String pkg:packages.keySet()) {
            if("com.heytap.health".equals(pkg)) attach(pkg,"com.heytap.health.service.CompanionDeviceDaemonService");
            attach(pkg,"androidx.room.MultiInstanceInvalidationService");
        }
        if(before != links.size()) publishState(0,"AUX");
    }
    private void attach(String pkg,String component) {
        final String key=pkg+"/"+component;
        if(links.containsKey(key)) return;
        try {
            Intent intent=new Intent().setComponent(new ComponentName(pkg,component));
            IBinder b=(IBinder)peek.invoke(am,intent,null,"com.android.shell");
            if(b == null) return;
            IBinder.DeathRecipient d=() -> submit(() -> {
                Link dead=links.get(key);
                if(dead == null || dead.binder != b) return;
                links.remove(key);
                try { dead.binder.unlinkToDeath(dead.death,0); } catch(Exception ignored) { }
                if(last!=HandoverPolicy.Presence.ONLINE) invalidate("BINDER");
                // Binder 死亡只触发主 UID 再确认，绝不直接宣布全部官方进程退出。
                refresh(0,"BINDER");
            });
            b.linkToDeath(d,0);
            links.put(key,new Link(b,d));
        } catch(Exception ignored) { /* 辅助不可用不使 UID 主监听失效。 */ }
    }
    private void clearLinks() {
        for(Link l:links.values()) try { l.binder.unlinkToDeath(l.death,0); } catch(Exception ignored) { }
        links.clear();
    }
    private void cleanup() {
        closed=true;
        if(registered) try { unregister.invoke(am,observer); } catch(Exception ignored) { }
        clearLinks();
        if(managerBinder != null && managerDeath != null) try { managerBinder.unlinkToDeath(managerDeath,0); } catch(Exception ignored) { }
    }
    public static void main(String[] args) {
        RootHealthObserver monitor=new RootHealthObserver();
        try {
            monitor.events.submit(() -> {
                try { monitor.init(args); }
                catch(Throwable e) { emit("ERROR "+ObserverRegistration.failure(e)); throw new RuntimeException(e); }
            }).get(30,TimeUnit.SECONDS);
            try(BufferedReader in=new BufferedReader(new InputStreamReader(System.in,StandardCharsets.UTF_8))) {
                String line;
                while((line=in.readLine()) != null) {
                    if("QUIT".equals(line)) break;
                    if(!line.startsWith("CHECK ") || line.length() > 40) throw new IllegalArgumentException("command");
                    long request=Long.parseLong(line.substring(6));
                    if(request <= 0) throw new IllegalArgumentException("request");
                    monitor.submit(() -> monitor.refresh(request,"CONFIRM"));
                }
            }
        } catch(Exception e) { emit("ERROR CHANNEL_CLOSED"); }
        finally {
            try { monitor.events.submit(monitor::cleanup).get(3,TimeUnit.SECONDS); } catch(Exception ignored) { }
            monitor.events.shutdownNow();
            // 父进程死亡/关闭 stdin 时必须退出，不能遗留 Root 辅助进程。
            System.exit(0);
        }
    }
}
