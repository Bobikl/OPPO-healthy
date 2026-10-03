package com.example.opponotificationrelay;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;

/** 连接由前台服务持有，Activity 退出和监听器重绑定不会中断蓝牙。 */
public final class RelayForegroundService extends Service {
    private static final String CHANNEL = "relay_connection";
    private static final int ID = 42;
    private static volatile RelayForegroundService active;
    private OfficialHealthMonitor monitor;
    public static void start(Context context) {
        RelayConfig.getPrefs(context).edit().putBoolean("relay_enabled", true).apply();
        context.startForegroundService(new Intent(context, RelayForegroundService.class));
    }
    public static void restartMonitoring(Context context) {
        RelayConfig.getPrefs(context).edit().putBoolean("relay_enabled", true).apply();
        context.startForegroundService(new Intent(context, RelayForegroundService.class).setAction("RECHECK"));
    }
    public static void resumeSaved(Context context) {
        // Unlike a user Start, a lifecycle recovery never flips an explicit saved Stop back on.
        if(enabled(context)) context.startForegroundService(new Intent(context,RelayForegroundService.class).setAction("RESUME"));
    }
    public static void refreshRestartPolicy(Context context) {
        if(active!=null && enabled(context)) context.startForegroundService(new Intent(context,RelayForegroundService.class).setAction("POLICY"));
    }
    public static void stop(Context context) {
        RelayConfig.getPrefs(context).edit().putBoolean("relay_enabled", false).apply();
        context.stopService(new Intent(context, RelayForegroundService.class));
        RfcommWearTransport.getInstance(context).stop();
    }
    public static boolean enabled(Context context) { return RelayConfig.getPrefs(context).getBoolean("relay_enabled", false); }
    public static void update(String status) {
        RelayForegroundService service = active;
        if (service != null) {
            try { service.getSystemService(NotificationManager.class).notify(ID, service.notification(status)); }
            catch (RuntimeException e) { FileLogger.w("OAF", "无法更新常驻通知，蓝牙连接不受影响"); }
        }
    }
    private Notification notification(String text) {
        PendingIntent open = PendingIntent.getActivity(this, 0, new Intent(this, MainActivity.class), PendingIntent.FLAG_IMMUTABLE | PendingIntent.FLAG_UPDATE_CURRENT);
        PendingIntent stop = PendingIntent.getService(this, 1, new Intent(this, RelayForegroundService.class).setAction("STOP"), PendingIntent.FLAG_IMMUTABLE | PendingIntent.FLAG_UPDATE_CURRENT);
        return new Notification.Builder(this, CHANNEL).setSmallIcon(android.R.drawable.stat_sys_data_bluetooth)
            .setContentTitle("独立通知转发").setContentText(text).setContentIntent(open).setOngoing(true)
            .addAction(new Notification.Action.Builder(null, "停止转发", stop).build()).build();
    }
    @Override public void onCreate() {
        super.onCreate(); FileLogger.init(this);
        getSystemService(NotificationManager.class).createNotificationChannel(new NotificationChannel(CHANNEL, "蓝牙连接状态", NotificationManager.IMPORTANCE_LOW));
        active = this;
    }
    @Override public int onStartCommand(Intent intent, int flags, int startId) {
        startForeground(ID, notification(RfcommWearTransport.getInstance(this).getStatusMessage()));
        if ((intent != null && "STOP".equals(intent.getAction())) || !enabled(this)) {
            stop(this); stopSelf(); return START_NOT_STICKY;
        }
        if(intent==null && !RelayConfig.autoRestore(this)) {stopSelf();return START_NOT_STICKY;}
        if(monitor==null) { monitor=new OfficialHealthMonitor(this); monitor.start(); }
        else if(intent!=null && "RECHECK".equals(intent.getAction())) monitor.recheck();
        HealthSyncManager.get(this).start();
        ListenerRecovery.request(this);
        return RelayConfig.autoRestore(this) ? START_STICKY : START_NOT_STICKY;
    }
    @Override public void onTaskRemoved(Intent rootIntent) {
        FileLogger.i("Startup","最近任务已移除；保留当前前台服务，不执行主动停止");
        super.onTaskRemoved(rootIntent);
    }
    @Override public void onDestroy() {
        active = null;RelayStore.flush();
        HealthSyncManager.get(this).stop();
        if(monitor!=null) { monitor.stop(); monitor=null; }
        RfcommWearTransport.getInstance(this).stop();
        super.onDestroy();
    }
    @Override public IBinder onBind(Intent intent) { return null; }
}
