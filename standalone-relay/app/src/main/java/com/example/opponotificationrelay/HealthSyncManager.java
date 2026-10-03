package com.example.opponotificationrelay;

import android.content.Context;
import android.os.*;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.*;

/** One bounded worker, sharing the notification transport; no second Bluetooth connection. */
final class HealthSyncManager {
    private static HealthSyncManager instance;
    static synchronized HealthSyncManager get(Context c){if(instance==null)instance=new HealthSyncManager(c.getApplicationContext());return instance;}
    private final Context context;private final Handler main=new Handler(Looper.getMainLooper());
    private final ExecutorService worker=Executors.newSingleThreadExecutor(r->new Thread(r,"health-archive"));
    private volatile boolean running,interactive;private boolean scheduled;private volatile int generation;
    private volatile String message="连接手表后自动同步",messageDevice="";
    private long nextRun;private String lastDevice="";
    private final Runnable tick=new Runnable(){public void run(){if(!scheduled)return;request(false);main.postDelayed(this,60000);}};
    private HealthSyncManager(Context context){this.context=context;}
    boolean running(){return running;}
    void interactive(boolean value){interactive=value;if(value)generation++;}
    String message(){return messageDevice.equalsIgnoreCase(RelayConfig.getTargetMac(context))?message:"连接手表后自动同步";}
    void start(){if(scheduled)return;scheduled=true;main.post(tick);}
    void stop(){scheduled=false;generation++;main.removeCallbacks(tick);}
    synchronized void request(boolean force){
        String mac=RelayConfig.getTargetMac(context);if(running||interactive)return;
        RfcommWearTransport transport=RfcommWearTransport.getInstance(context);
        if(transport.getState()!=RfcommWearTransport.STATE_READY){messageDevice=mac;message="等待手表连接 · 已保存的数据可离线查看";return;}
        long now=SystemClock.elapsedRealtime();if(!force && mac.equalsIgnoreCase(lastDevice) && now<nextRun)return;
        running=true;lastDevice=mac;messageDevice=mac;message="正在同步健康数据…";final int token=generation;
        worker.execute(()->sync(mac,token));
    }
    private void valid(String mac,int token)throws IOException{
        if(interactive || token!=generation || !mac.equalsIgnoreCase(RelayConfig.getTargetMac(context)) || RfcommWearTransport.getInstance(context).getState()!=RfcommWearTransport.STATE_READY)throw new IOException("SYNC_DISCONNECTED");
    }
    private static final class Received {
        final byte[] bytes;final Map<HealthSetting,Integer> goals;
        Received(byte[] bytes,Map<HealthSetting,Integer> goals){this.bytes=bytes;this.goals=goals;}
    }
    private Received read(String mac,int token,HealthSyncProtocol.Request request,long limit)throws Exception{
        RfcommWearTransport transport=RfcommWearTransport.getInstance(context);long until=Math.min(limit,SystemClock.elapsedRealtime()+25000);
        OafHealthChannel.Snapshot state=transport.healthSettings();if(!state.connected&&!state.busy)transport.requestHealthSettings();
        while(true){valid(mac,token);state=transport.healthSettings();if(state.connected&&!state.busy)break;if(SystemClock.elapsedRealtime()>=until)throw new IOException("SYNC_BUSY");Thread.sleep(100);}
        Map<HealthSetting,Integer> goals=new EnumMap<>(HealthSetting.class);goals.putAll(state.values);
        long connection=transport.healthConnection();CountDownLatch done=new CountDownLatch(1);boolean[] ok={false};byte[][] body={null};
        if(!transport.readHealthHistory(request,(success,bytes,msg)->{ok[0]=success;body[0]=bytes;done.countDown();}))throw new IOException("SYNC_BUSY");
        while(!done.await(100,TimeUnit.MILLISECONDS)){valid(mac,token);if(SystemClock.elapsedRealtime()>=until)throw new IOException("SYNC_TIMEOUT");}
        valid(mac,token);if(!ok[0]||connection!=transport.healthConnection())throw new IOException("SYNC_REPLY_FAILED");return new Received(body[0],goals);
    }
    private void window(String mac,int token,HealthSyncProtocol.Kind kind,int start,int end,long limit)throws Exception{
        HealthArchive archive=HealthArchive.get(context);int cursor=start;
        for(int page=0;page<128;page++){
            if(SystemClock.elapsedRealtime()>=limit)throw new IOException("SYNC_YIELD");
            HealthSyncProtocol.Request request=HealthSyncProtocol.range(kind,cursor,end);Received packet=read(mac,token,request,limit);byte[] bytes=packet.bytes;
            HealthSyncProtocol.Summary s=HealthSyncProtocol.parse(request,bytes);valid(mac,token);
            archive.save(mac,request,bytes,packet.goals);
            if(!s.more)return;
            if(s.end<=cursor || s.end>=end)throw new IOException("SYNC_CURSOR_STALLED");cursor=s.end;
        }
        throw new IOException("SYNC_PAGE_LIMIT");
    }
    private static String error(Exception e){String m=e.getMessage();return m!=null&&m.matches("[A-Z_]{1,64}")?m:"READ_OR_STORAGE_ERROR";}
    private void sync(String mac,int token){
        int end=(int)(System.currentTimeMillis()/1000);long limit=SystemClock.elapsedRealtime()+90000;
        boolean failed=false,pending=false;int fresh=0;
        try{
            HealthArchive archive=HealthArchive.get(context);
            for(HealthSyncProtocol.Kind kind:HealthSyncProtocol.Kind.values())archive.ensureCursor(mac,kind,end-172800);
            OafHealthChannel.Snapshot settings=RfcommWearTransport.getInstance(context).healthSettings();
            if(!settings.busy)RfcommWearTransport.getInstance(context).requestHealthSettings();
            // Current data comes first. A failed category does not prevent other categories being archived.
            for(HealthSyncProtocol.Kind kind:HealthSyncProtocol.Kind.values()){
                valid(mac,token);message="正在同步"+kind.title+"…";
                try{window(mac,token,kind,end-kind.seconds,end,limit);fresh++;}
                catch(Exception e){failed=true;FileLogger.w("HealthArchive",kind.name()+" 本轮读取未完成："+error(e));}
                if(SystemClock.elapsedRealtime()>=limit)break;
            }
            // Start with two days still on the watch. Preserve an interrupted backlog across app restarts.
            for(HealthSyncProtocol.Kind kind:HealthSyncProtocol.Kind.values()){
                int cursor=archive.cursor(mac,kind,end-172800);
                if(cursor>end)cursor=end-172800; // Wall-clock rollback: query overlap, never erase old data.
                int turns=0;
                while(cursor<end && turns++<32 && SystemClock.elapsedRealtime()<limit){
                    valid(mac,token);message="正在补存"+kind.title+"…";int stop=(int)Math.min((long)end,(long)cursor+kind.seconds-60);
                    try{window(mac,token,kind,Math.max(1500000000,cursor-60),stop,limit);archive.advance(mac,kind,stop);cursor=stop;}
                    catch(Exception e){failed=true;FileLogger.w("HealthArchive",kind.name()+" 补存暂停："+error(e));break;}
                }
                if(cursor<end)pending=true;
            }
            message=failed?"部分数据待重试 · 已收到的数据已保存":pending?"最新数据已保存 · 历史记录继续补存":"健康数据已保存";
        }catch(Exception e){failed=true;message="同步已暂停 · 连接后继续补存";}
        finally{
            nextRun=SystemClock.elapsedRealtime()+((failed||pending)?60000:15*60000);
            running=false;HealthDataManager.get(context).local();FileLogger.i("HealthArchive","本轮完成，最新数据类别="+fresh+"/"+HealthSyncProtocol.Kind.values().length+"，待补存="+pending+"，待重试="+failed);
        }
    }
}