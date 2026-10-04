package com.example.opponotificationrelay;
import android.Manifest;import android.app.*;import android.content.*;import android.content.pm.*;import android.media.*;import android.os.*;
import java.io.*;import java.util.concurrent.*;
/** Microphone starts only from the visible monitoring page after runtime permission. */
public final class SnoreRecordingService extends Service {
    private static final Object GUARD=new Object();private static volatile boolean running;private static volatile String currentId="",lastError="";
    private static final String START="snore.START",STOP="snore.STOP",CHANNEL="snore_recording";private static final int NOTIFICATION=4108;
    private final Handler main=new Handler(Looper.getMainLooper());private volatile boolean stopRequested;private volatile MicSource microphone;
    private ExecutorService worker;
    private final Runnable timeLimit=()->{stopRequested=true;MicSource source=microphone;if(source!=null)source.requestStop();};
    public static boolean isRunning(){return running;}public static String currentId(){return currentId;}public static String lastError(){return lastError;}
    public static void recoverIfIdle(SnoreSessionStore store)throws Exception{synchronized(GUARD){if(!running)store.recoverAbandoned();}}
    public static void start(Activity activity){activity.startForegroundService(new Intent(activity,SnoreRecordingService.class).setAction(START));}
    public static void stop(Context context){if(running)context.startService(new Intent(context,SnoreRecordingService.class).setAction(STOP));}
    @Override public void onCreate(){super.onCreate();worker=Executors.newSingleThreadExecutor(r->new Thread(r,"snore-capture"));getSystemService(NotificationManager.class).createNotificationChannel(new NotificationChannel(CHANNEL,"睡眠录音",NotificationManager.IMPORTANCE_LOW));}
    @Override public IBinder onBind(Intent intent){return null;}
    @Override public int onStartCommand(Intent intent,int flags,int startId){
        if(intent==null||!START.equals(intent.getAction())){stopRequested=true;MicSource source=microphone;if(source!=null)source.requestStop();if(!running)stopSelf();return START_NOT_STICKY;}
        synchronized(GUARD){if(running)return START_NOT_STICKY;running=true;stopRequested=false;currentId="";lastError="";}
        try {
            if(checkSelfPermission(Manifest.permission.RECORD_AUDIO)!=PackageManager.PERMISSION_GRANTED)throw new SecurityException("MIC_PERMISSION");
            startForeground(NOTIFICATION,notification("正在准备录音…"),ServiceInfo.FOREGROUND_SERVICE_TYPE_MICROPHONE);
            main.postDelayed(timeLimit,36000000L);final String device=RelayConfig.getTargetMac(this);worker.execute(()->capture(device));
        }catch(RuntimeException error){lastError="无法开始录音，请检查麦克风权限后重试";synchronized(GUARD){running=false;currentId="";}stopForeground(STOP_FOREGROUND_REMOVE);stopSelf();}
        return START_NOT_STICKY;
    }
    private Notification notification(String text){
        PendingIntent open=PendingIntent.getActivity(this,0,new Intent(this,SnoreMonitoringActivity.class),PendingIntent.FLAG_UPDATE_CURRENT|PendingIntent.FLAG_IMMUTABLE);
        PendingIntent stop=PendingIntent.getService(this,0,new Intent(this,SnoreRecordingService.class).setAction(STOP),PendingIntent.FLAG_UPDATE_CURRENT|PendingIntent.FLAG_IMMUTABLE);
        return new Notification.Builder(this,CHANNEL).setSmallIcon(R.drawable.ic_relay).setContentTitle("睡眠录音进行中").setContentText(text).setOngoing(true).setOnlyAlertOnce(true).setContentIntent(open).addAction(new Notification.Action.Builder(null,"结束录音",stop).build()).build();
    }
    private void capture(String device){PowerManager.WakeLock wake=getSystemService(PowerManager.class).newWakeLock(PowerManager.PARTIAL_WAKE_LOCK,getPackageName()+":snore");
        try(SnoreSessionStore store=new SnoreSessionStore(this)){
            store.recoverAbandoned();wake.acquire(36060000L);MicSource source=new MicSource(this);microphone=source;
            SnoreCaptureSession.run(store,source,device,()->stopRequested,new SnoreCaptureSession.Listener(){
                public void started(String id){currentId=id;}
                public void progress(String id,long samples){if(samples%480000<8000)main.post(()->{if(running&&!stopRequested)getSystemService(NotificationManager.class).notify(NOTIFICATION,notification("已录音 "+(samples/480000)+" 分钟 · 点击结束录音可保存"));});}
            });
        }catch(Exception|LinkageError failure){lastError="录音未完成，请检查可用空间和权限后重试";}
        finally{MicSource source=microphone;if(source!=null)source.close();microphone=null;if(wake.isHeld())wake.release();main.post(()->{main.removeCallbacks(timeLimit);synchronized(GUARD){running=false;currentId="";}stopForeground(STOP_FOREGROUND_REMOVE);stopSelf();});}
    }
    @Override public void onDestroy(){main.removeCallbacks(timeLimit);stopRequested=true;MicSource source=microphone;if(source!=null)source.requestStop();worker.shutdown();super.onDestroy();}
    static final class MicSource implements SnoreCaptureSession.Source {
        private final int source;private volatile AudioRecord record;
        MicSource(Context context){AudioManager manager=context.getSystemService(AudioManager.class);source="true".equals(manager.getProperty(AudioManager.PROPERTY_SUPPORT_AUDIO_SOURCE_UNPROCESSED))?MediaRecorder.AudioSource.UNPROCESSED:MediaRecorder.AudioSource.MIC;}
        public int audioSource(){return source;}
        public void start()throws IOException {
            int minimum=AudioRecord.getMinBufferSize(8000,AudioFormat.CHANNEL_IN_MONO,AudioFormat.ENCODING_PCM_16BIT);
            if(minimum<=0)throw new IOException("SNORE_AUDIO_UNSUPPORTED");
            AudioRecord created=new AudioRecord(source,8000,AudioFormat.CHANNEL_IN_MONO,AudioFormat.ENCODING_PCM_16BIT,Math.max(minimum*10,8192));record=created;
            if(created.getState()!=AudioRecord.STATE_INITIALIZED)throw new IOException("SNORE_AUDIO_INIT");created.startRecording();
            if(created.getRecordingState()!=AudioRecord.RECORDSTATE_RECORDING)throw new IOException("SNORE_AUDIO_START");
        }
        public int read(short[] data,int offset,int count)throws IOException {AudioRecord r=record;if(r==null)throw new IOException("SNORE_AUDIO_CLOSED");int value=r.read(data,offset,count,AudioRecord.READ_BLOCKING);if(value<0)throw new IOException("SNORE_AUDIO_READ");return value;}
        public void check()throws IOException{AudioRecord r=record;AudioRecordingConfiguration config=r==null?null:r.getActiveRecordingConfiguration();if(config!=null&&config.isClientSilenced())throw new IOException("SNORE_MICROPHONE_SILENCED");}
        public void requestStop(){AudioRecord r=record;if(r!=null)try{r.stop();}catch(IllegalStateException ignored){}}
        public void close(){AudioRecord r=record;record=null;if(r!=null){try{r.stop();}catch(IllegalStateException ignored){}r.release();}}
    }
}
