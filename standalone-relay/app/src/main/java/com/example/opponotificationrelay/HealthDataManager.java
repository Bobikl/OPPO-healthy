package com.example.opponotificationrelay;

import android.content.Context;
import android.database.Cursor;
import android.os.*;
import org.json.*;
import java.time.*;
import java.util.*;
import java.util.concurrent.*;

/** Single worker; cached data first, official read-only import on a bounded refresh cadence. */
final class HealthDataManager {
    interface Listener {void changed(HealthMetricsData data,String message,boolean busy);}
    private static HealthDataManager instance;
    static synchronized HealthDataManager get(Context c){if(instance==null)instance=new HealthDataManager(c.getApplicationContext());return instance;}
    private final Context context;private final Handler main=new Handler(Looper.getMainLooper());
    private final ExecutorService worker=Executors.newSingleThreadExecutor(r->new Thread(r,"health-detail-read"));
    private final Set<Listener> listeners=new HashSet<>();private final Set<String> pending=new HashSet<>();private final Map<String,Long> attempted=new HashMap<>();
    private volatile HealthMetricsData data;private volatile String message="";private volatile boolean busy;private boolean localPending;private long localRevision=-1;
    private HealthDataManager(Context c){context=c;}
    void add(Listener l){listeners.add(l);if(data!=null&&data.device.equalsIgnoreCase(RelayConfig.getTargetMac(context)))l.changed(data,message,busy);local();}
    void remove(Listener l){listeners.remove(l);}
    HealthMetricsData snapshot(){HealthMetricsData d=data;return d!=null&&d.device.equalsIgnoreCase(RelayConfig.getTargetMac(context))?d:null;}
    private void publish(){main.post(()->{String device=RelayConfig.getTargetMac(context);HealthMetricsData value=data!=null&&data.device.equalsIgnoreCase(device)?data:null;for(Listener l:new ArrayList<>(listeners))l.changed(value,message,busy);});}
    private long revision(String mac)throws Exception{long saved=0;try(Cursor c=HealthArchive.get(context).getReadableDatabase().rawQuery("SELECT max(received_at) FROM records WHERE device=? AND kind IN('HEART','SLEEP','SLEEP_STAGE','ACTIVITY','ACTIVITY_SUMMARY')",new String[]{HealthArchive.device(mac)})){if(c.moveToFirst())saved=c.getLong(0);}return saved+HealthMetricsStore.get(context).revision(mac);}
    private void load(String mac,boolean force)throws Exception{long revision=revision(mac);if(force||data==null||!data.device.equalsIgnoreCase(mac)||localRevision!=revision){HealthMetricsData value=HealthMetricsStore.get(context).load(context,mac);if(!mac.equalsIgnoreCase(RelayConfig.getTargetMac(context)))return;data=value;localRevision=revision;publish();}}
    synchronized void local(){if(localPending)return;localPending=true;String mac=RelayConfig.getTargetMac(context);worker.execute(()->{try{load(mac,false);}catch(Exception e){message="暂时无法读取本地记录";publish();}finally{synchronized(this){localPending=false;}}});}
    void request(LocalDate anchor,boolean raw,boolean force){
        if(anchor.isAfter(LocalDate.now()))anchor=LocalDate.now();LocalDate a=raw?anchor:anchor.withDayOfYear(1),b=raw?anchor.plusDays(1):anchor.withDayOfYear(1).plusYears(1);
        if(b.isAfter(LocalDate.now().plusDays(1)))b=LocalDate.now().plusDays(1);
        final long start=HealthMetricsData.time(a),end=HealthMetricsData.time(b);final String mac=RelayConfig.getTargetMac(context),key=mac+":"+start+":"+end+":"+raw;
        synchronized(this){Long last=attempted.get(key);if(!force&&last!=null&&SystemClock.elapsedRealtime()-last<60000)return;if(!pending.add(key))return;attempted.put(key,SystemClock.elapsedRealtime());}
        worker.execute(()->{try{
            load(mac,false);HealthMetricsStore store=HealthMetricsStore.get(context);
            if(!force&&store.fresh(mac,start,end,raw,15*60000L)&&context.getSharedPreferences("health_ui",0).getInt("detail_projection",0)==9)return;
            busy=true;message=data==null||!data.officialLoaded?"正在读取历史记录…":"";publish();
            JSONObject result=new OfficialSettingsClient(context).health(mac,start,end,raw);
            if(!mac.equalsIgnoreCase(RelayConfig.getTargetMac(context)))return;
            if(!raw)HealthArchive.get(context).importOfficialActivity(mac,result.getJSONObject("activity"));
            store.save(mac,result,raw);if(!raw)context.getSharedPreferences("health_ui",0).edit().putInt("detail_projection",9).apply();message="";load(mac,true);
        }catch(Exception e){String code=e.getMessage();message="BUSY".equals(code)?"历史记录稍后重试":"历史记录读取未完成 · 已保存的数据仍可查看";FileLogger.w("HealthDetails",code!=null&&code.matches("[A-Z_]{1,64}")?code:"READ_FAILED");}
        finally{busy=false;synchronized(this){pending.remove(key);}publish();}});
    }
}
