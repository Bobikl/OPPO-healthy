package com.example.opponotificationrelay;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.SystemClock;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicLong;

/** 精准 UID 回调为主，Binder 死亡通知为辅；正常运行没有周期进程扫描。 */
public final class OfficialHealthMonitor {
    private static final String[] PACKAGES={"com.heytap.health","com.coloros.health"};
    public static final class Snapshot {
        public final HandoverPolicy.Presence presence;
        public final String detail, ownership;
        public final int binders;
        public final boolean listening;
        public final long updatedAt;
        Snapshot(HandoverPolicy.Presence p,String d,String o,int b,boolean l,long t) {
            presence=p; detail=d; ownership=o; binders=b; listening=l; updatedAt=t;
        }
    }
    private static volatile Snapshot current=new Snapshot(HandoverPolicy.Presence.UNKNOWN,
        "尚未开启状态监听", "未开启自动接管",0,false,0);
    public static Snapshot snapshot() { return current; }
    private static final AtomicLong ownerSequence=new AtomicLong();
    private final long ownerId=ownerSequence.incrementAndGet();
    private final Context context;
    private final RfcommWearTransport transport;
    private final HandoverPolicy policy=new HandoverPolicy();
    private final ScheduledExecutorService events=Executors.newSingleThreadScheduledExecutor(r -> new Thread(r,"OAF-owner"));
    private Process process;
    private BufferedWriter commands;
    private volatile boolean stopped;
    private boolean receiverRegistered,ready,noOfficial;
    private boolean compactRuntime=true,nativeAllowed=true,activeNative;
    private long epoch,nextRequest,pendingRequest,pendingRevision,retrySeconds=30;
    private int binderCount;
    private String detail="正在启动精准 UID 监听，请允许本应用的 Root 权限";
    private ScheduledFuture<?> startupTimeout,graceTimer,checkTimeout,retryTimer;
    private final BroadcastReceiver packageChanges=new BroadcastReceiver() {
        @Override public void onReceive(Context c,Intent intent) {
            String pkg=intent.getData()==null ? "" : intent.getData().getSchemeSpecificPart();
            if(Arrays.asList(PACKAGES).contains(pkg)) submit(OfficialHealthMonitor.this::restart);
        }
    };
    public OfficialHealthMonitor(Context c) { context=c.getApplicationContext(); transport=RfcommWearTransport.getInstance(c); }
    /** 用户手动重试时重建订阅，不依赖下一次恰好发生的 UID 事件。 */
    public void recheck() { submit(this::restart); }
    private void submit(Runnable action) {
        if(!stopped) try {events.execute(() -> {if(!stopped) action.run();});} catch(RejectedExecutionException ignored) { }
    }
    public void start() {
        IntentFilter filter=new IntentFilter();
        filter.addAction(Intent.ACTION_PACKAGE_ADDED); filter.addAction(Intent.ACTION_PACKAGE_REMOVED);
        filter.addAction(Intent.ACTION_PACKAGE_CHANGED); filter.addAction(Intent.ACTION_PACKAGE_REPLACED);
        filter.addDataScheme("package");
        try {
            if(Build.VERSION.SDK_INT >= 33) context.registerReceiver(packageChanges,filter,Context.RECEIVER_NOT_EXPORTED);
            else context.registerReceiver(packageChanges,filter);
            receiverRegistered=true;
        } catch(RuntimeException e) {
            detail="无法注册应用变更监听，已暂停接管"; publish(); return;
        }
        submit(this::restart);
    }
    private Map<String,Integer> installed() throws Exception {
        Map<String,Integer> found=new LinkedHashMap<>();
        for(String pkg:PACKAGES) try {
            ApplicationInfo info=context.getPackageManager().getApplicationInfo(pkg,PackageManager.MATCH_DISABLED_COMPONENTS);
            found.put(pkg,info.uid);
        } catch(PackageManager.NameNotFoundException ignored) { }
        return found;
    }
    private void restart() {
        if(stopped) return;
        cancel(retryTimer); retryTimer=null;
        disconnect();
        detail="正在建立精准 UID 监听；首次使用请授予本应用 Root 权限";
        publish();
        try {
            Map<String,Integer> packages=installed();
            noOfficial=packages.isEmpty();
            if(noOfficial) {
                ready=true; policy.open(); policy.sample(HandoverPolicy.Presence.OFFLINE,now());
                detail="未安装官方健康应用；通过系统应用变更广播监听安装情况";
                publish(); scheduleGrace(); return;
            }
            String classpath=context.getApplicationInfo().sourceDir;
            if(compactRuntime) try {classpath=ObserverDex.path(context);}
            catch(Exception e) {compactRuntime=false;FileLogger.w("OAF-owner","精简监听 DEX 不可用，使用兼容模式");}
            activeNative=false;String executable=null;
            if(nativeAllowed && NativeObserver.supported()) try {executable=NativeObserver.path(context);}
            catch(Exception e) {nativeAllowed=false;FileLogger.w("OAF-owner","原生观察器不可用，回退 Java 监听");}
            activeNative=executable!=null;
            String command=activeNative ? ObserverLaunch.nativeCommand(executable,classpath,packages) :
                ObserverLaunch.command(classpath,packages,compactRuntime);
            FileLogger.i("OAF-owner",activeNative ? "启动原生 Root 监听（短命 Java 引导）" :
                compactRuntime ? "启动精简 DEX / 低内存 Root 监听" : "启动兼容 Root 监听");
            final Process child=new ProcessBuilder("su","-c",command).redirectErrorStream(true).start();
            process=child; commands=new BufferedWriter(new OutputStreamWriter(child.getOutputStream(),StandardCharsets.UTF_8));
            final long token=epoch;
            startupTimeout=events.schedule(() -> {
                if(!stopped && token==epoch) {
                    if(!ready && !activeNative) compactRuntime=false;
                    fail("Root 授权或监听初始化超时，请检查授权后重试");
                }
            },45,TimeUnit.SECONDS);
            Thread reader=new Thread(() -> {
                try(BufferedReader in=new BufferedReader(new InputStreamReader(child.getInputStream(),StandardCharsets.UTF_8))) {
                    String line;
                    while((line=in.readLine()) != null) {
                        if(!line.startsWith(ObserverMessage.PREFIX+" ")) continue;
                        final String value=line;
                        submit(() -> {if(token==epoch) receive(value);});
                    }
                } catch(IOException ignored) { }
                finally { submit(() -> {
                    if(token==epoch) {
                        if(!ready && !activeNative && compactRuntime) {
                            compactRuntime=false;
                            FileLogger.w("OAF-owner","精简运行时未就绪，下次改用兼容模式；保持暂停接管");
                        }
                        fail("状态监听已断开，已暂停接管；请检查 Root 授权");
                    }
                }); }
            },"OAF-health-events");
            reader.setDaemon(true);reader.start();
        } catch(Exception e) { fail("无法启动状态监听，请检查 Root 授权或系统兼容性"); }
    }
    private void receive(String line) {
        try {
            ObserverMessage m=ObserverMessage.parse(line);
            if(m==null) return;
            if("ERROR".equals(m.type)) {
                if(!ready && !activeNative && compactRuntime) compactRuntime=false;
                fail("系统状态监听不可用（"+m.reason+"），已暂停接管");return;
            }
            if("READY".equals(m.type)) {
                if(ready) throw new IllegalArgumentException("duplicate ready");
                ready=true; policy.open();
                // READY 不等于取得初始状态；超时要等首次 STATE 才取消。
                detail="精准 UID 监听已注册，正在读取官方状态";publish();return;
            }
            if(!ready) throw new IllegalArgumentException("message before ready");
            if("DIRTY".equals(m.type)) {
                cancelConfirmation(); policy.sample(HandoverPolicy.Presence.UNKNOWN,now());
                detail="BINDER".equals(m.reason) ? "收到官方服务死亡通知，正在复核全部官方 UID" : "收到官方 UID 变化，正在确认状态";
                publish(); return;
            }
            cancel(startupTimeout); startupTimeout=null; retrySeconds=30;
            // 已取消的旧确认不能恢复旧状态，更不能重新开启接管。
            if(m.request!=0 && m.request!=pendingRequest) return;
            binderCount=m.binders;
            policy.sample(m.presence,now());
            detail=activeNative ? "原生精准 UID 回调已连接 · 无周期进程扫描" : "Java 精准 UID 回调已连接 · 无周期进程扫描";
            if(m.presence==HandoverPolicy.Presence.UNKNOWN) {fail("系统返回未知状态，已暂停接管");return;}
            if(m.request!=0) {
                if(m.presence==HandoverPolicy.Presence.OFFLINE) policy.confirmOffline(pendingRevision,now());
                pendingRequest=0; cancel(checkTimeout);checkTimeout=null;
            }
            if(m.presence!=HandoverPolicy.Presence.OFFLINE) cancelConfirmation();
            publish();scheduleGrace();
        } catch(RuntimeException e) { fail("状态监听协议异常，已暂停接管"); }
    }
    private void scheduleGrace() {
        if(graceTimer!=null || pendingRequest!=0 || policy.canOwn(now())) return;
        long delay=policy.remaining(now());
        if(delay<0) return;
        final long token=epoch,revision=policy.revision();
        graceTimer=events.schedule(() -> {
            graceTimer=null;
            if(stopped || token!=epoch || revision!=policy.revision()) return;
            if(!policy.needsConfirmation(now())) {scheduleGrace();return;}
            try {
                if(noOfficial) {
                    if(!installed().isEmpty()) {restart();return;}
                    policy.confirmOffline(revision,now());publish();return;
                }
                pendingRequest=++nextRequest;pendingRevision=revision;
                commands.write("CHECK "+pendingRequest+"\n");commands.flush();
                final long request=pendingRequest;
                checkTimeout=events.schedule(() -> {
                    if(!stopped && token==epoch && request==pendingRequest) fail("接管前确认超时，已暂停接管");
                },5,TimeUnit.SECONDS);
                publish();
            } catch(Exception e) {fail("无法再次确认官方退出，已暂停接管");}
        },delay,TimeUnit.MILLISECONDS);
    }
    private void cancelConfirmation() {
        cancel(graceTimer);graceTimer=null;cancel(checkTimeout);checkTimeout=null;pendingRequest=0;
    }
    private void fail(String why) {
        if(activeNative) {
            nativeAllowed=false;activeNative=false;
            FileLogger.w("OAF-owner","原生状态监听失败，下次回退 Java；保持暂停接管");
        }
        disconnect();detail=why;publish();
        if(!stopped) {
            cancel(retryTimer);
            retryTimer=events.schedule(this::restart,retrySeconds,TimeUnit.SECONDS);
            retrySeconds=Math.min(300,retrySeconds*2);
        }
    }
    private void publish() {
        if(ownerId!=ownerSequence.get()) return;
        long time=now();
        String ownership=stopped ? "自动接管已停止" : policy.reason(time);
        Snapshot previous=current;
        if(previous.presence==policy.presence() && previous.binders==binderCount && previous.listening==ready
                && previous.detail.equals(detail) && previous.ownership.equals(ownership)) return;
        current=new Snapshot(policy.presence(),detail,ownership,binderCount,ready,time);
        // 订阅由活管道维持；EOF/错误/停止立即撤销。安静时不需要刷新租约。
        transport.setOwnership(!stopped && policy.canOwn(time),ownership,Long.MAX_VALUE);
        RelayAlerts.onPresence(context,policy.presence());
    }
    private void disconnect() {
        epoch++;ready=false;noOfficial=false;binderCount=0;policy.close();
        if(ownerId==ownerSequence.get()) transport.setOwnership(false,"官方状态未知，已暂停接管",0);
        cancelConfirmation();cancel(startupTimeout);startupTimeout=null;
        BufferedWriter writer=commands;commands=null;
        if(writer!=null) try {writer.close();} catch(IOException ignored) { }
        Process child=process;process=null;
        if(child!=null) child.destroy();
    }
    private static long now() {return SystemClock.elapsedRealtime();}
    private static void cancel(ScheduledFuture<?> task) {if(task!=null)task.cancel(false);}
    public void stop() {
        stopped=true;
        if(ownerId==ownerSequence.get()) {
            transport.setOwnership(false,"自动接管已停止",0);
            RelayAlerts.cancel();
            current=new Snapshot(HandoverPolicy.Presence.UNKNOWN,"状态监听已停止","自动接管已停止",0,false,now());
        }
        if(receiverRegistered) {context.unregisterReceiver(packageChanges);receiverRegistered=false;}
        try {
            events.execute(() -> {cancel(retryTimer);disconnect();detail="状态监听已停止";publish();events.shutdown();});
        } catch(RejectedExecutionException ignored) { }
    }
}
