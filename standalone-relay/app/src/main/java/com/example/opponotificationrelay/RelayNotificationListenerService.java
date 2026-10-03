package com.example.opponotificationrelay;
import android.app.Notification;
import android.os.Bundle;
import android.os.Build;
import android.os.SystemClock;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;

public final class RelayNotificationListenerService extends NotificationListenerService {
    private static final String TAG="OppoRelay";
    private RfcommWearTransport transport;
    public static volatile boolean bound;
    private static volatile RelayNotificationListenerService connectedInstance;
    private volatile long listenerEpoch;
    private BoundedWorker<Work> worker;
    private static final class Work {
        final RelayEvent event;final long generation,epoch,notificationRevision,time=SystemClock.elapsedRealtime();
        Work(RelayEvent e,long g,long epoch,long revision){event=e;generation=g;this.epoch=epoch;notificationRevision=revision;}
    }
    @Override public void onCreate() {
        super.onCreate();FileLogger.init(this);transport=RfcommWearTransport.getInstance(this);
        worker=new BoundedWorker<>("OAF-notification-work",32,256*1024,w -> w.event.retainedBytes(),this::process,
            e -> FileLogger.w(TAG,"通知处理失败 type="+e.getClass().getSimpleName()));
        AppLabelCache.install(this);FileLogger.i(TAG,"通知监听服务已创建，等待系统绑定");
    }
    @Override public void onListenerConnected() {
        super.onListenerConnected();listenerEpoch++;connectedInstance=this;bound=true;
        ListenerRecovery.connected();FileLogger.i(TAG,"通知监听已由系统实际绑定");
        BackgroundStart.restore(this,"通知监听重新连接");transport.syncNotificationSettings();
    }
    @Override public void onListenerDisconnected() {
        if(connectedInstance!=null && connectedInstance!=this){super.onListenerDisconnected();return;}
        listenerEpoch++;if(worker!=null)worker.clear();connectedInstance=null;bound=false;RelayStore.flush();
        FileLogger.w(TAG,"通知监听已断开，申请系统重新绑定");
        ListenerRecovery.request(this);transport.syncNotificationSettings();super.onListenerDisconnected();
    }
    @Override public void onDestroy() {
        listenerEpoch++;if(worker!=null){worker.close();worker=null;}RelayStore.flush();
        if(connectedInstance==this){connectedInstance=null;bound=false;if(transport!=null)transport.syncNotificationSettings();}
        super.onDestroy();
    }
    @Override public void onNotificationPosted(StatusBarNotification sbn) {receive(sbn,false);}
    @Override public void onNotificationRemoved(StatusBarNotification sbn) {receive(sbn,true);}
    private void receive(StatusBarNotification sbn,boolean removed) {
        if(sbn==null || getPackageName().equals(sbn.getPackageName()))return;
        Notification n=sbn.getNotification();
        if(NotificationContent.skip(removed,n==null?0:n.flags))return;
        long revision=NotificationPreferences.revision();
        if(!eligible(sbn.getPackageName(),removed))return;
        try {
            long generation=transport.notificationGeneration();if(generation==0 || worker==null)return;
            RelayEvent event=removed?RelayEvent.removed(sbn.getId(),sbn.getTag(),sbn.getKey(),sbn.getPackageName()):extract(sbn);
            if(!worker.offer(new Work(event,generation,listenerEpoch,revision)))FileLogger.w(TAG,"通知处理队列达到条数或字节上限，丢弃最旧事件");
        } catch(MessageBudget.Rejected e){RelayStore.decision(sbn.getPackageName(),e.getMessage());FileLogger.w(TAG,e.getMessage());}
    }
    private boolean eligible(String pkg,boolean removed) {
        if(!NotificationPreferences.enabled(this) || !RelayConfig.shouldForward(this,pkg))return false;
        if(!RelayForegroundService.enabled(this)){RelayStore.decision(pkg,"自动接管未开启");return false;}
        if(!transport.ownsChannel()){RelayStore.decision(pkg,"独立通道已让出或官方状态待确认");return false;}
        if(ScreenGate.blocks(this,removed,false)){RelayStore.decision(pkg,"手机亮屏且已解锁，已跳过（不补发）");return false;}
        return true;
    }
    private void process(Work work) {
        if(work.notificationRevision!=NotificationPreferences.revision() || connectedInstance!=this || !bound || listenerEpoch!=work.epoch || SystemClock.elapsedRealtime()-work.time>60000
                || !transport.currentNotificationGeneration(work.generation) || !eligible(work.event.packageName,work.event.removed))return;
        RelayEvent event=work.event.removed?work.event:work.event.withAppName(AppLabelCache.get(this,work.event.packageName));
        if(!transport.currentNotificationGeneration(work.generation) || listenerEpoch!=work.epoch)return;
        RelayPayloadEncoder.EventEnvelope envelope=RelayPayloadEncoder.encode(event,RelayConfig.getProtocolCid(this),
            event.removed?null:AppIconStore.get(this,event.packageName),RelayConfig.sourceInTitle(this));
        if(listenerEpoch!=work.epoch || !transport.send(envelope,work.generation,work.time,work.notificationRevision))return;
        RelayStore.save(this,event);
        RelayStore.decision(event.packageName,event.removed?"删除事件已提交":"真实通知已提交发送队列（不代表手表已收到）");
        FileLogger.i(TAG,(event.removed?"通知删除":"通知到达")+" package="+event.packageName+" id="+event.id+" CID="+envelope.commandId);
    }
    private RelayEvent extract(StatusBarNotification sbn) {
        Notification n=sbn.getNotification();Bundle extras=n==null?null:n.extras;
        String[] content=NotificationContent.read(extras);String title=content[0],body=content[1],sub=content[2];
        long posted=sbn.getPostTime(),when=n==null || n.when==0?posted:n.when;
        int flags=n==null?0:n.flags;
        return RelayEvent.posted(sbn.getId(),sbn.getTag(),sbn.getKey(),sbn.getPackageName(),"",title,body,sub,posted,when,flags,
            n==null?"":n.getGroup(),sbn.getGroupKey(),(flags&Notification.FLAG_GROUP_SUMMARY)!=0,false,
            (flags&Notification.FLAG_ONGOING_EVENT)==0,(flags&Notification.FLAG_ONLY_ALERT_ONCE)!=0,
            n!=null && Build.VERSION.SDK_INT>=26?n.getGroupAlertBehavior():0,hasRemoteInput(n));
    }
    private static boolean hasRemoteInput(Notification n) {
        if(n==null || n.actions==null)return false;
        for(Notification.Action a:n.actions)if(a!=null && a.getRemoteInputs()!=null && a.getRemoteInputs().length>0)return true;
        return false;
    }
}
