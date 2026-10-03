package com.example.opponotificationrelay;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.service.notification.NotificationListenerService;

/** Bounded recovery after startup/upgrade; no periodic background polling. */
public final class ListenerRecovery {
    private static final Handler main=new Handler(Looper.getMainLooper());
    private static boolean pending;
    private static int generation;
    private static boolean rootBusy;
    private static final String REPAIR_PENDING="listener_component_repair_pending";
    public static volatile String detail="";
    private ListenerRecovery() { }
    public static boolean authorized(Context c) {
        String value=Settings.Secure.getString(c.getContentResolver(),"enabled_notification_listeners");
        if(value==null) return false;
        ComponentName target=new ComponentName(c,RelayNotificationListenerService.class);
        for(String item:value.split(":")) if(target.equals(ComponentName.unflattenFromString(item))) return true;
        return false;
    }
    public static void request(Context context) {
        Context app=context.getApplicationContext();
        main.post(() -> {
            restoreInterruptedRepair(app);
            if(rootBusy || RelayNotificationListenerService.bound || pending || !authorized(app)) return;
            pending=true; int token=++generation;
            for(long delay:new long[]{0,3000,10000}) main.postDelayed(() -> {
                if(token!=generation || RelayNotificationListenerService.bound || !authorized(app)) return;
                detail="正在请求系统重新绑定通知监听";
                try {
                    NotificationListenerService.requestRebind(new ComponentName(app,RelayNotificationListenerService.class));
                    FileLogger.i("ListenerRecovery","已请求重绑，等待系统 onListenerConnected");
                } catch(RuntimeException e) { detail="系统拒绝重绑，请重新开关通知使用权"; }
            },delay);
            main.postDelayed(() -> {
                if(token!=generation) return;
                pending=false;
                if(!RelayNotificationListenerService.bound) {
                    detail="系统尚未重新绑定：请检查系统后台自启动，或点击“修复监听组件”；必要时关闭再开启通知使用权。蓝牙就绪不代表监听正常";
                    FileLogger.w("ListenerRecovery",detail);
                }
            },15000);
        });
    }
    /** Only called after an explicit user repair click, never a periodic component toggle. */
    public static void repairComponent(Context context) {
        Context app=context.getApplicationContext();
        main.post(() -> {
            if(rootBusy) {detail="Root 重绑正在进行，请稍候";return;}
            if(RelayNotificationListenerService.bound) {detail="监听已经绑定，无需修复";return;}
            if(!authorized(app)) {detail="尚未授权，请先在系统设置授予通知使用权";return;}
            generation++;pending=false;
            ComponentName component=new ComponentName(app,RelayNotificationListenerService.class);
            PackageManager pm=app.getPackageManager();
            if(!RelayConfig.getPrefs(app).edit().putBoolean(REPAIR_PENDING,true).commit()) {
                detail="无法保存修复状态，未修改监听组件";return;
            }
            try {
                pm.setComponentEnabledSetting(component,PackageManager.COMPONENT_ENABLED_STATE_DISABLED,PackageManager.DONT_KILL_APP);
                detail="已请求重建本应用监听组件，等待系统重新连接";
                FileLogger.i("ListenerRecovery","用户请求重建本应用通知监听组件");
            } catch(RuntimeException e) {detail="组件重建被系统拒绝，请在系统设置重新开关通知使用权";}
            finally {restoreInterruptedRepair(app);}
            main.postDelayed(() -> request(app),1000);
        });
    }
    /** If a process died mid-repair, restore only the component marked by our own repair. */
    public static void restoreInterruptedRepair(Context c) {
        if(!RelayConfig.getPrefs(c).getBoolean(REPAIR_PENDING,false)) return;
        try {
            c.getPackageManager().setComponentEnabledSetting(new ComponentName(c,RelayNotificationListenerService.class),
                PackageManager.COMPONENT_ENABLED_STATE_ENABLED,PackageManager.DONT_KILL_APP);
            RelayConfig.getPrefs(c).edit().remove(REPAIR_PENDING).commit();
        } catch(RuntimeException e) {detail="监听组件恢复失败，请重新打开本应用或检查系统设置";}
    }
    public static void connected() {main.post(() -> {generation++;pending=false;detail="";});}

    /** Explicit, one-shot system authorization reset; never an automatic root loop. */
    public static void repairRoot(Context context) {
        Context app=context.getApplicationContext();
        main.post(() -> {
            if(rootBusy) return;
            if(RelayNotificationListenerService.bound) {detail="监听已经绑定，无需修复";return;}
            if(!authorized(app)) {detail="请先在系统设置授予通知使用权，再执行 Root 重绑";return;}
            restoreInterruptedRepair(app);
            rootBusy=true;generation++;pending=false;
            detail="正在请求 Root 系统级重绑，请处理可能出现的 Root 授权弹窗";
            new Thread(() -> {
                int result=-1;
                Process process=null;
                try {
                    process=new ProcessBuilder("su","-c",RootListenerCommands.script(android.os.Process.myUid()/100000))
                        .redirectErrorStream(true).start();
                    final Process running=process;
                    Thread drain=new Thread(() -> {
                        try(java.io.InputStream in=running.getInputStream()) {
                            byte[] buffer=new byte[1024];while(in.read(buffer)!=-1) { }
                        } catch(java.io.IOException ignored) { }
                    },"Listener-root-output");
                    drain.setDaemon(true);drain.start();
                    if(process.waitFor(45,java.util.concurrent.TimeUnit.SECONDS)) result=process.exitValue();
                    else process.destroy();
                } catch(Exception e) {
                    if(process!=null) process.destroy();
                }
                final int code=result;
                main.post(() -> {
                    rootBusy=false;
                    FileLogger.i("ListenerRecovery","Root 重绑命令结束，退出码="+code+"；是否绑定以系统回调为准");
                    if(RelayNotificationListenerService.bound) {detail="";return;}
                    if(code!=0) {
                        detail="Root 重绑未完成（退出码 "+code+"），请检查 Root 授权及系统通知使用权；若授权关闭，请手动重新开启";
                        return;
                    }
                    detail="系统重置命令已完成，正在等待实际绑定回调";
                    int token=++generation;
                    try {NotificationListenerService.requestRebind(new ComponentName(app,RelayNotificationListenerService.class));}
                    catch(RuntimeException ignored) { }
                    pending=true;
                    main.postDelayed(() -> {
                        if(token!=generation) return;
                        pending=false;
                        if(!RelayNotificationListenerService.bound)
                            detail="Root 命令已完成，但系统仍未实际绑定；请检查通知使用权与系统后台限制";
                    },15000);
                });
            },"Listener-root-repair").start();
        });
    }
}
