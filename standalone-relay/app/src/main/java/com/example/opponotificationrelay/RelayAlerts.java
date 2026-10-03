package com.example.opponotificationrelay;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/** Official route uses a normal phone notification, never a competing connection. */
public final class RelayAlerts {
    private static final String CHANNEL="relay_handover";
    private static final Handler main=new Handler(Looper.getMainLooper());
    private static final HandoverNoticePolicy policy=new HandoverNoticePolicy();
    private static long revision;
    private static HandoverPolicy.Presence sample=HandoverPolicy.Presence.UNKNOWN;
    private static boolean pendingYield;
    private RelayAlerts() { }
    public static synchronized void onPresence(Context c,HandoverPolicy.Presence value) {
        if(sample==value) return;
        sample=value;
        final long token=++revision;
        if(policy.presence(value)) pendingYield=true;
        if(value==HandoverPolicy.Presence.OFFLINE) pendingYield=false;
        if(!RelayConfig.handoverNotices(c)) {pendingYield=false;return;}
        if(value!=HandoverPolicy.Presence.ONLINE || !pendingYield) return;
        final Context app=c.getApplicationContext();
        main.postDelayed(() -> {
            synchronized(RelayAlerts.class) {
                if(token!=revision || !RelayConfig.handoverNotices(app) || !RelayForegroundService.enabled(app)
                        || OfficialHealthMonitor.snapshot().presence!=HandoverPolicy.Presence.ONLINE) return;
                pendingYield=false;
                phone(app,7201,"官方已启动，独立转发已让出","当前由官方负责通知；此提醒能否到达手表取决于官方通知白名单和连接状态。");
            }
        },2000);
    }
    public static synchronized void onNoticePreferenceChanged(Context c,boolean enabled) {
        if(enabled) return;
        revision++;pendingYield=false;
        NotificationManager manager=c.getSystemService(NotificationManager.class);
        if(manager!=null) manager.cancel(7201);
    }
    public static synchronized void cancel() { revision++; pendingYield=false;sample=HandoverPolicy.Presence.UNKNOWN; }
    public static void onIndependentReady(Context c) {
        RfcommWearTransport t=RfcommWearTransport.getInstance(c);
        if(t.ownsChannel() && t.isAvailable()
                && OfficialHealthMonitor.snapshot().presence==HandoverPolicy.Presence.OFFLINE && policy.ready() && RelayConfig.handoverNotices(c))
            direct(c,RelayNotificationListenerService.bound ? "独立转发已接管" : "独立蓝牙已接管，通知监听待恢复",
                RelayNotificationListenerService.bound ? "官方未运行，独立通知通道已完成鉴权。"
                : "蓝牙已鉴权，但通知监听尚未绑定，暂时无法转发应用新消息。请打开手机端恢复监听。");
    }
    public static String test(Context c) {
        if(OfficialHealthMonitor.snapshot().presence==HandoverPolicy.Presence.ONLINE) {
            return phone(c,7202,"官方通道测试","独立转发已让出，此通知交由官方转发到手表。")
                ? "已发布手机测试通知；请在官方健康的通知白名单中允许本应用。是否送达请查看手表。"
                : "手机通知权限未开启，请先允许本应用发送通知。";
        }
        RfcommWearTransport t=RfcommWearTransport.getInstance(c);
        if(!t.ownsChannel() || !t.isAvailable()) return "独立通道尚未完成鉴权；请等待接管就绪后重试。";
        if(RelayConfig.getProtocolCid(c)!=RelayPayloadEncoder.COMMAND_POST_PARSED)
            return "图标核对需要在首页选择“Watch X2 通知协议（CID=200）”，然后再次点击测试。";
        t.syncNotificationSettings();
        RelayIcon icon=AppIconStore.createWatchMainIcon(c,c.getPackageName());
        if(icon==null) {
            FileLogger.w("IconProbe","新图片测试未发送：无法读取本应用图标");
            return "无法读取本应用图标，图标测试未发送。请稍后重试并查看日志。";
        }
        RelayIcon probe=icon.withFreshKey();
        FileLogger.i("IconProbe","官方主图对照已提交 field=17 type=_large format=BMP bmpBytes="+probe.data.length
            +" width="+probe.width+" height="+probe.height+" keySha256="+OafTraceMetadata.digest(probe.key.getBytes(java.nio.charset.StandardCharsets.UTF_8),0,probe.key.getBytes(java.nio.charset.StandardCharsets.UTF_8).length));
        t.send(RelayPayloadEncoder.encodeBitmapMainProbe(directEvent(c,"独立图标测试（BMP主图）",
            "请查看消息旁是否显示“手表通知转发”的真实图标。"),probe));
        return "官方主图对照已提交。请查看手表上的“独立图标测试（BMP主图）”，确认真实应用图标或默认图标（提交不代表已送达）。";
    }
    private static void direct(Context c,String title,String body) {
        RfcommWearTransport.getInstance(c).send(RelayPayloadEncoder.encode(directEvent(c,title,body),RelayConfig.getProtocolCid(c),
            AppIconStore.get(c,c.getPackageName()),false));
    }
    private static RelayEvent directEvent(Context c,String title,String body) {
        long now=System.currentTimeMillis();
        return RelayEvent.posted((int)(now%100000),"relay_status","relay_status_"+now,
            c.getPackageName(),"手表通知转发",title,body,"",now,false);
    }
    private static boolean phone(Context c,int id,String title,String body) {
        try {
            NotificationManager manager=c.getSystemService(NotificationManager.class);
            manager.createNotificationChannel(new NotificationChannel(CHANNEL,"接管切换与测试",NotificationManager.IMPORTANCE_DEFAULT));
            if(!manager.areNotificationsEnabled() || manager.getNotificationChannel(CHANNEL).getImportance()==NotificationManager.IMPORTANCE_NONE) return false;
            manager.notify(id,new Notification.Builder(c,CHANNEL).setSmallIcon(android.R.drawable.stat_notify_sync)
                .setContentTitle(title).setContentText(body).setStyle(new Notification.BigTextStyle().bigText(body))
                .setAutoCancel(true).build());
            return true;
        } catch(RuntimeException e) { return false; }
    }
}
