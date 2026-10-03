package com.example.opponotificationrelay;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.widget.Toast;
import java.util.List;

/** No watchdog, periodic alarm, or force-stop bypass. */
public final class BackgroundStart {
    public static volatile String status="";
    private BackgroundStart() { }
    public static boolean shouldRestore(Context c) {
        return StartupPolicy.restore(RelayConfig.autoRestore(c),RelayForegroundService.enabled(c));
    }
    public static void restore(Context c,String cause) {
        if(!shouldRestore(c)) return;
        try {
            RelayForegroundService.resumeSaved(c);
            status="已请求恢复上次运行状态，实际状态见通知监听与蓝牙链路";
            FileLogger.i("Startup","恢复请求："+cause);
        } catch(RuntimeException e) {
            status="系统限制后台启动，请允许后台自启动后重新打开本应用";
            FileLogger.w("Startup",status+" ("+e.getClass().getSimpleName()+")");
        }
    }
    public static void logLastExit(Context c) {
        if(Build.VERSION.SDK_INT<30) return;
        try {
            List<ApplicationExitInfo> exits=c.getSystemService(ActivityManager.class).getHistoricalProcessExitReasons(c.getPackageName(),0,1);
            if(!exits.isEmpty()) {
                ApplicationExitInfo e=exits.get(0);
                FileLogger.i("Startup","上次进程退出 reason="+e.getReason()+" status="+e.getStatus()+" time="+e.getTimestamp());
            }
        } catch(RuntimeException ignored) { }
    }
    public static void openAutostart(Activity a) {
        Intent miui=new Intent().setComponent(new ComponentName("com.miui.securitycenter","com.miui.permcenter.autostart.AutoStartManagementActivity"));
        if(!open(a,miui)) openDetails(a);
    }
    public static void openBattery(Activity a) {
        Intent miui=new Intent().setComponent(new ComponentName("com.miui.powerkeeper","com.miui.powerkeeper.ui.HiddenAppsConfigActivity"))
            .putExtra("package_name",a.getPackageName()).putExtra("package_label","手表通知转发");
        if(!open(a,miui)) openDetails(a);
    }
    private static void openDetails(Activity a) {
        if(!open(a,new Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS,Uri.parse("package:"+a.getPackageName()))))
            Toast.makeText(a,"请在系统设置中查找本应用的后台自启动和省电设置",Toast.LENGTH_LONG).show();
    }
    private static boolean open(Activity a,Intent intent) {
        try {a.startActivity(intent);return true;} catch(RuntimeException e) {return false;}
    }
}
