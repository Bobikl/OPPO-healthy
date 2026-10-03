package com.example.opponotificationrelay;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothSocket;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.SystemClock;
import org.json.JSONObject;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import android.os.Handler;
import android.os.Looper;

/** 独立 OAF MCU 通知连接，不加载健康 APK 或 Xposed 类。 */
public final class RfcommWearTransport implements WearTransport {
    public static final UUID RFCOMM_UUID = UUID.fromString("a49ebb15-cb06-495c-9f4f-bb80a90cdf00");
    public static final int STATE_DISCONNECTED = 0, STATE_CONNECTING = 1, STATE_HANDSHAKE = 2, STATE_READY = 3, STATE_YIELDED = 4;
    private static volatile RfcommWearTransport instance;
    private final Context context;
    private volatile ConnectionQueue<Pending> queue = new ConnectionQueue<>(64,MessageBudget.MAX_QUEUE_BYTES,p -> MessageBudget.envelopeBytes(p.event));
    private final ScheduledThreadPoolExecutor timer = new ScheduledThreadPoolExecutor(1,r -> {
        Thread t = new Thread(r, "OAF-timeout"); t.setDaemon(true); return t;
    });
    private final Handler statusHandler=new Handler(Looper.getMainLooper());
    private final ConnectionState control=new ConnectionState();
    private volatile OnStatusChangeListener listener;
    private volatile BluetoothSocket socket;
    private volatile boolean ownershipAllowed;
    private volatile long ownershipUntil;
    private Thread worker;
    private volatile DeviceLink deviceLink;
    private static final class DeviceLink {
        final long token;final String mac;final BluetoothSocket socket;final ConnectionQueue<Pending> queue;
        volatile OafDeviceChannel channel;volatile OafHealthChannel health;volatile ConnectionQueue.Session session;
        final java.util.concurrent.atomic.AtomicBoolean foreground=new java.util.concurrent.atomic.AtomicBoolean();
        DeviceLink(long token,String mac,BluetoothSocket socket,ConnectionQueue<Pending> queue){this.token=token;this.mac=mac;this.socket=socket;this.queue=queue;}
        void wake(){ConnectionQueue.Session s=session;if(s!=null)queue.wake(s);}
    }
    public DeviceTelemetry deviceTelemetry() {
        DeviceLink link=deviceLink;
        if(link==null || link.channel==null || !active(link.token) || !ownsChannel() || socket!=link.socket
                || getState()!=STATE_READY || !link.mac.equalsIgnoreCase(RelayConfig.getTargetMac(context)))return DeviceTelemetry.EMPTY;
        return link.channel.snapshot();
    }
    public void requestDeviceStatus() {
        DeviceLink link=deviceLink;
        if(link!=null && active(link.token) && ownsChannel() && socket==link.socket && getState()==STATE_READY){link.foreground.set(true);link.wake();}
    }
    private boolean validHealthLink(DeviceLink link){DeviceIdentity identity=DeviceIdentityStore.read(context);return identity!=null && "OWW251".equals(identity.model) && link!=null && link.health!=null && active(link.token) && ownsChannel() && socket==link.socket && getState()==STATE_READY && link.mac.equalsIgnoreCase(RelayConfig.getTargetMac(context));}
    public OafHealthChannel.Snapshot healthSettings(){DeviceLink link=deviceLink;return validHealthLink(link)?link.health.snapshot():OafHealthChannel.Snapshot.unavailable("请先连接手表，连接后刷新读取设置");}
    public long healthConnection(){DeviceLink link=deviceLink;return validHealthLink(link)?link.token:-1;}
    public long healthGeneration(){DeviceLink link=deviceLink;return validHealthLink(link) && link.health.snapshot().connected?link.token*2048+link.health.reserved():-1;}
    public boolean sleepCommand(SleepSettingsProtocol.Request request,OafHealthChannel.SleepReply reply){DeviceLink link=deviceLink;if(!validHealthLink(link))return false;boolean ok=link.health.sleep(request,reply);if(ok)link.wake();return ok;}
    public boolean readHealthHistory(HealthSyncProtocol.Request request,OafHealthChannel.SleepReply reply){DeviceLink link=deviceLink;if(!validHealthLink(link))return false;boolean ok=link.health.history(request,reply);if(ok)link.wake();return ok;}
    public boolean requestHealthSettings(){DeviceLink link=deviceLink;if(!validHealthLink(link))return false;link.health.refresh();link.wake();return true;}
    public boolean changeHealthSetting(HealthSetting key,int value,long revision){DeviceLink link=deviceLink;if(!validHealthLink(link))return false;boolean accepted=link.health.change(key,value,revision);if(accepted)link.wake();return accepted;}
    private final RetrySignal retrySignal=new RetrySignal();
    private volatile boolean receiverRegistered;
    private final BroadcastReceiver bluetoothEvents=new BroadcastReceiver() {
        @Override public void onReceive(Context c,Intent intent) {
            if(BluetoothAdapter.ACTION_STATE_CHANGED.equals(intent.getAction())) {
                if(intent.getIntExtra(BluetoothAdapter.EXTRA_STATE,BluetoothAdapter.ERROR)==BluetoothAdapter.STATE_ON)
                    retrySignal.signal();
            } else if(Intent.ACTION_SCREEN_ON.equals(intent.getAction()) || Intent.ACTION_SCREEN_OFF.equals(intent.getAction())
                    || Intent.ACTION_USER_PRESENT.equals(intent.getAction())) syncNotificationSettings();
        }
    };
    public interface OnStatusChangeListener { void onStatusChanged(int state, String message); }
    private static class Pending {
        final RelayPayloadEncoder.EventEnvelope event;
        final long time,notificationRevision;
        Pending(RelayPayloadEncoder.EventEnvelope e,long time,long revision) {event=e;this.time=time;notificationRevision=revision;}
    }
    private RfcommWearTransport(Context c) {
        context = c.getApplicationContext();timer.setRemoveOnCancelPolicy(true);
    }
    public static synchronized RfcommWearTransport getInstance(Context c) {
        if (instance == null) instance = new RfcommWearTransport(c);
        return instance;
    }
    public void setOnStatusChangeListener(OnStatusChangeListener l) {
        listener = l;
        if (l != null) {ConnectionState.Snapshot s=control.snapshot();l.onStatusChanged(s.state,s.message);}
    }
    private void publish(ConnectionState.Snapshot s) {
        if(s==null) return;
        statusHandler.post(() -> {
            if(!control.current(s)) return;
            FileLogger.i("OAF",s.message);RelayForegroundService.update(s.message);
            OnStatusChangeListener l=listener;if(l!=null) l.onStatusChanged(s.state,s.message);
        });
    }
    private void status(int s,String m) {publish(control.status(s,m));}
    private void status(long token,int s,String m) {publish(control.status(token,s,m));}
    public int getState() { return control.snapshot().state; }
    public String getStatusMessage() { return control.snapshot().message; }
    public synchronized long notificationGeneration() {return ownsChannel() && control.running()?control.generation():0;}
    public synchronized boolean currentNotificationGeneration(long token) {return token!=0 && active(token) && ownsChannel();}
    public boolean ownsChannel() { return ownershipAllowed && SystemClock.elapsedRealtime() <= ownershipUntil; }
    public synchronized void setOwnership(boolean allowed, String reason, long until) {
        ownershipUntil = until;
        ownershipAllowed = allowed;
        if (!allowed) {
            if (control.running()) stop();
            queue.clear();
            ConnectionState.Snapshot previous=control.snapshot();
            if (previous.state != STATE_YIELDED || !reason.equals(previous.message)) status(STATE_YIELDED,reason);
        } else if (RelayForegroundService.enabled(context) && !control.running()) start();
    }
    @Override public boolean isAvailable() { return getState() == STATE_READY; }
    public synchronized void start() {
        if (!ownsChannel()) return;
        final long token=control.begin();if(token==0) return;
        final ConnectionQueue<Pending> generationQueue=new ConnectionQueue<>(64,MessageBudget.MAX_QUEUE_BYTES,p -> MessageBudget.envelopeBytes(p.event));
        queue=generationQueue;
        registerBluetoothEvents();
        worker = new Thread(() -> run(token,generationQueue), "OAF-connection");
        worker.start();
    }
    public synchronized void stop() {
        ConnectionState.Snapshot stopped=control.stop(STATE_DISCONNECTED,"连接已停止");
        close(socket); socket = null;
        DeviceLink old=deviceLink;deviceLink=null;if(old!=null && old.channel!=null)old.channel.close();if(old!=null && old.health!=null)old.health.close();
        if (worker != null) worker.interrupt();
        retrySignal.signal();
        if(receiverRegistered) {
            try {context.unregisterReceiver(bluetoothEvents);} catch(IllegalArgumentException ignored) { }
            receiverRegistered=false;
        }
        queue.clear();
        publish(stopped);
    }
    private boolean active(long token) { return control.active(token); }
    private void registerBluetoothEvents() {
        if(receiverRegistered) return;
        IntentFilter filter=new IntentFilter(BluetoothAdapter.ACTION_STATE_CHANGED);
        filter.addAction(Intent.ACTION_SCREEN_ON);filter.addAction(Intent.ACTION_SCREEN_OFF);filter.addAction(Intent.ACTION_USER_PRESENT);
        try {
            // Bluetooth broadcasts can originate from a privileged non-system UID.
            if(Build.VERSION.SDK_INT>=33) context.registerReceiver(bluetoothEvents,filter,Context.RECEIVER_EXPORTED);
            else context.registerReceiver(bluetoothEvents,filter);
            receiverRegistered=true;
        } catch(RuntimeException e) {FileLogger.w("OAF","蓝牙状态事件不可用，改用低频重试");}
    }
    private static void close(BluetoothSocket s) { if (s != null) try { s.close(); } catch (IOException ignored) {} }
    @Override public void send(RelayPayloadEncoder.EventEnvelope event) {enqueue(event,0,SystemClock.elapsedRealtime(),NotificationPreferences.revision());}
    public boolean send(RelayPayloadEncoder.EventEnvelope event,long token,long time) {return enqueue(event,token,time,NotificationPreferences.revision());}
    public boolean send(RelayPayloadEncoder.EventEnvelope event,long token,long time,long revision) {return enqueue(event,token,time,revision);}
    private synchronized boolean enqueue(RelayPayloadEncoder.EventEnvelope event,long token,long time,long revision) {
        ConnectionQueue<Pending> destination=queue;
        if (event == null || !control.running() || !ownsChannel() || !eligible(event)
                || (token!=0 && !active(token))) return false;
        try {MessageBudget.validate(event);} catch(MessageBudget.Rejected e) {
            RelayStore.decision(event.sourcePackage,e.getMessage());FileLogger.w("OAF",e.getMessage());return false;
        }
        Pending pending = new Pending(event,time,revision);
        if (!destination.offer(pending)) FileLogger.w("OAF","发送队列达到条数或字节上限，丢弃最旧通知");
        return true;
    }
    private boolean eligible(RelayPayloadEncoder.EventEnvelope event) {
        return NotificationForwardPolicy.allows(NotificationPreferences.enabled(context),RelayConfig.shouldForward(context,event.sourcePackage),
            context.getPackageName().equals(event.sourcePackage),0,0);
    }
    public void syncNotificationSettings() {
        if(!isAvailable() || !ownsChannel()) return;
        DeviceLink link=deviceLink;if(link!=null)link.wake();
    }
    private void run(long token,ConnectionQueue<Pending> queue) {
        if(!active(token) || !ownsChannel()) return;
        NotificationSettings.refreshBaseline(context);
        ReconnectPolicy retry=new ReconnectPolicy();
        while (active(token)) {
            long retryCheckpoint=retrySignal.checkpoint();
            long connectedAt=0;
            BluetoothSocket connection = null;
            ScheduledFuture<?> timeout = null;
            DeviceLink statusLink=null;
            try {
                if (!ownsChannel()) throw new IOException("官方状态检测已过期，暂停通信");
                JSONObject credentials = RelayConfig.credentials(context);
                BluetoothAdapter adapter = BluetoothAdapter.getDefaultAdapter();
                if(adapter==null) throw new IllegalStateException("设备不支持蓝牙");
                if(!adapter.isEnabled()) {
                    status(token,STATE_DISCONNECTED,"手机蓝牙关闭，等待开启后恢复（不循环建连）");
                    retrySignal.await(retryCheckpoint,receiverRegistered ? 0 : 300000);
                    retry.reset();continue;
                }
                status(token,STATE_CONNECTING,"连接 OAF 通知通道");
                final String connectedMac=credentials.getString("mac");
                connection = adapter.getRemoteDevice(connectedMac).createRfcommSocketToServiceRecord(RFCOMM_UUID);
                final BluetoothSocket target = connection;
                synchronized (this) {
                    if (!active(token)) { close(target); return; }
                    socket = target;
                }
                timeout = timer.schedule(() -> close(target), 35, TimeUnit.SECONDS);
                connection.connect();
                status(token,STATE_HANDSHAKE,"蓝牙已连接，协商 OAF 端点");
                OafWire wire = new OafWire(connection.getInputStream(), connection.getOutputStream());
                final DeviceLink link=new DeviceLink(token,connectedMac,target,queue);
                link.channel=new OafDeviceChannel(wire,new OafDeviceChannel.Events(){
                    public void status(String message){if(deviceLink==link && active(token))FileLogger.i("DeviceStatus",message);}
                    public void changed(){if(deviceLink==link && active(token))link.wake();}
                    public long now(){return SystemClock.elapsedRealtime();}
                },link.mac,1);
                link.health=new OafHealthChannel(wire,new OafHealthChannel.Events(){
                    public long now(){return SystemClock.elapsedRealtime();}
                    public void changed(){if(deviceLink==link && active(token))link.wake();}
                    public void status(String message){if(deviceLink==link && active(token))FileLogger.i("HealthSettings",message);}
                });
                statusLink=link;deviceLink=link;
                OafSession session = new OafSession(wire, new OafSession.Events() {
                    public void status(String value) { FileLogger.i("OAF",value); }
                    public boolean traceEnabled() {return FileLogger.wireTraceEnabled();}
                    public void ready() { /* 初始设置写入后再发布就绪，保证接管提醒不抢先。 */ }
                },link.channel,link.health);
                session.authenticate(RelayConfig.field(credentials,"ksc"), RelayConfig.field(credentials,"localDeviceId"),
                    RelayConfig.field(credentials,"kscAlias"), RelayConfig.peerId(context), SystemClock.elapsedRealtime()/1000);
                while (active(token) && !session.isReady()) session.readAndHandle();
                if (!active(token) || !ownsChannel()) return;
                if(!link.mac.equalsIgnoreCase(RelayConfig.getTargetMac(context)))throw new IOException("目标设备已更改，重新确认连接");
                RelayPayloadEncoder.EventEnvelope initialSettings=NotificationSettings.envelope(context);
                byte[] lastSettings=null;
                if(initialSettings!=null) {
                    session.send(initialSettings);lastSettings=initialSettings.payload;
                    NotificationSettings.written(initialSettings);
                }
                boolean lastScreenStatus=ScreenGate.usingPhone(context);
                session.send(RelayPayloadEncoder.encodePhoneScreen(lastScreenStatus,context.getPackageName()));
                if(!active(token) || !ownsChannel()) return;
                RelayConfig.markCredentialsVerified(context,credentials);
                status(token,STATE_READY,"OAF 身份已验证，通知服务就绪");
                RelayAlerts.onIndependentReady(context);
                timeout.cancel(false); timeout = null;
                final SendDeadline deadline=new SendDeadline(timer,20000,() -> close(target));
                wire.setDeadline(deadline);
                connectedAt=SystemClock.elapsedRealtime();
                retryCheckpoint=retrySignal.checkpoint();
                final ConnectionQueue.Session sendSession=queue.open();link.session=sendSession;
                session.startDeviceStatus();
                Thread reader = new Thread(() -> {
                    try { while (active(token)) session.readAndHandle(); }
                    catch (Exception e) { if (active(token)) FileLogger.w("OAF","接收结束：" + e.getMessage()); }
                    finally { queue.close(sendSession);close(target); }
                }, "OAF-reader");
                reader.start();link.wake();
                while (active(token)) {
                    Pending pending = queue.poll(sendSession,link.health.waitMillis(DeviceTelemetry.REFRESH_INTERVAL));
                    if (!active(token) || queue.closed(sendSession)) break;
                    if (!ownsChannel()) throw new IOException("官方状态检测已过期，暂停发送");
                    if(!link.mac.equalsIgnoreCase(RelayConfig.getTargetMac(context)))throw new IOException("目标设备已更改，暂停旧设备设置同步");
                    if(deviceLink==link && socket==target && link.mac.equalsIgnoreCase(RelayConfig.getTargetMac(context)))
                        link.channel.refresh(link.foreground.getAndSet(false));
                    session.pumpHealthSettings();
                    // Screen/settings events coalesce without taking a notification queue slot.
                    RelayPayloadEncoder.EventEnvelope settings=NotificationSettings.envelope(context);
                    boolean settingsChanged=settings!=null && !java.util.Arrays.equals(lastSettings,settings.payload);
                    if(settingsChanged) {
                        deadline.run(() -> session.send(settings));lastSettings=settings.payload;NotificationSettings.written(settings);
                    }
                    boolean usingPhone=ScreenGate.usingPhone(context);
                    if(settingsChanged || usingPhone!=lastScreenStatus) {
                        deadline.run(() -> session.send(RelayPayloadEncoder.encodePhoneScreen(usingPhone,context.getPackageName())));
                        lastScreenStatus=usingPhone;FileLogger.i("NotificationSettings","手机使用状态 CID=146 已写入 usingPhone="+usingPhone);
                    }
                    if(pending==null || pending.event.commandId==RelayPayloadEncoder.COMMAND_NOTIFICATION_SWITCHES) continue;
                    if (SystemClock.elapsedRealtime() - pending.time > 60000) continue;
                    if (!eligible(pending.event)) continue;
                    boolean own=context.getPackageName().equals(pending.event.sourcePackage);
                    if(!NotificationForwardPolicy.allows(NotificationPreferences.enabled(context),RelayConfig.shouldForward(context,pending.event.sourcePackage),
                            own,pending.notificationRevision,NotificationPreferences.revision()))continue;
                    boolean removed=pending.event.commandId==RelayPayloadEncoder.COMMAND_DISMISS
                        || pending.event.commandId==RelayPayloadEncoder.COMMAND_REMOVED;
                    if(ScreenGate.blocks(context,removed,own)) {
                        RelayStore.decision(pending.event.sourcePackage,"发送前手机已亮屏且解锁，丢弃排队消息（不补发）");continue;
                    }
                    RelayPayloadEncoder.EventEnvelope outgoing=NapQuietSettings.apply(context,pending.event);
                    try {deadline.run(() -> session.send(outgoing));} catch(MessageBudget.Rejected e) {
                        RelayStore.decision(pending.event.sourcePackage,e.getMessage());FileLogger.w("OAF",e.getMessage());continue;
                    }

                    if(!own) RelayStore.decision(pending.event.sourcePackage,"通知帧已写入蓝牙（不代表手表已显示）");
                    FileLogger.i("OAF","通知帧已写入 CID="+outgoing.commandId+" bytes="+outgoing.payload.length
                        +" iconBytes="+(outgoing.picture==null?0:outgoing.picture.payload.length)+" napFlagAdded="+(outgoing!=pending.event));
                }
            } catch (GeneralSecurityException e) {
                publish(control.fail(token,STATE_DISCONNECTED,"配对认证失败，请重新迁移凭据",true));
                return;
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); return;
            } catch (Exception e) {
                if (e instanceof SecurityException || !(e instanceof IOException)) {
                    publish(control.fail(token,STATE_DISCONNECTED,"连接失败："+e.getMessage(),true));return;
                }
                status(token,STATE_DISCONNECTED,"连接失败："+e.getMessage());
            } finally {
                if (timeout != null) timeout.cancel(false);
                close(connection);
                if(statusLink!=null && statusLink.channel!=null)statusLink.channel.close();if(statusLink!=null && statusLink.health!=null)statusLink.health.close();
                if(deviceLink==statusLink)deviceLink=null;
                synchronized (this) { if (socket == connection) socket = null; }
            }
            if (!active(token)) return;
            long delay=retry.failed(connectedAt==0 ? 0 : SystemClock.elapsedRealtime()-connectedAt);
            status(token,STATE_DISCONNECTED,"连接中断，"+(delay/1000)+" 秒后重试；开启手机蓝牙可提前唤醒");
            try {if(retrySignal.await(retryCheckpoint,delay)) retry.reset();}
            catch (InterruptedException e) { Thread.currentThread().interrupt(); return; }
        }
    }
}
