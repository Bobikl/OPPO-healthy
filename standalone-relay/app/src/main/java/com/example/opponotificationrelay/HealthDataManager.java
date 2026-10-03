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
    private volatile HealthMetricsData data;private volatile String message="";private volatile boolean busy;private boolean localPending;private volatile long localRevision=-1;private volatile int observers;private volatile HealthSnapshotWindow selected=HealthSnapshotWindow.home(LocalDate.now());
    private HealthDataManager(Context c){context=c;}
    void add(Listener l){listeners.add(l);observers=listeners.size();if(data!=null&&selected.same(data.window)&&data.device.equalsIgnoreCase(RelayConfig.getTargetMac(context)))l.changed(data,message,busy);local();}
    void remove(Listener l){listeners.remove(l);observers=listeners.size();if(observers==0){data=null;localRevision=-1;requestGeneration++;requestedWindow="";}}
    HealthMetricsData snapshot(){HealthMetricsData d=data;return d!=null&&selected.same(d.window)&&d.device.equalsIgnoreCase(RelayConfig.getTargetMac(context))?d:null;}
    private void publish(){main.post(()->{String device=RelayConfig.getTargetMac(context);HealthMetricsData value=data!=null&&selected.same(data.window)&&data.device.equalsIgnoreCase(device)?data:null;for(Listener l:new ArrayList<>(listeners))l.changed(value,message,busy);});}
    private long revision(String mac)throws Exception{return HealthArchive.get(context).revision(mac)+HealthMetricsStore.get(context).revision(mac);}
    private void load(String mac,boolean force)throws Exception{
        if(observers==0)return;HealthSnapshotWindow wanted=selected;if(!wanted.zone.equals(ZoneId.systemDefault())){wanted=new HealthSnapshotWindow(wanted.start,wanted.end,wanted.anchor);selected=wanted;HealthSnapshotWindow refreshed=wanted;main.post(()->{if(observers>0&&refreshed.same(selected))requestRange(refreshed.start,refreshed.end,refreshed.anchor,false,false);});}HealthMetricsStore.get(context).ensureZone(mac,wanted.zone);long revision=revision(mac);
        if(force||data==null||!data.device.equalsIgnoreCase(mac)||localRevision!=revision||!wanted.same(data.window)){
            HealthMetricsData value=HealthMetricsStore.get(context).load(context,mac,wanted);
            if(observers==0||!wanted.zone.equals(ZoneId.systemDefault())||!wanted.same(selected)||!mac.equalsIgnoreCase(RelayConfig.getTargetMac(context)))return;
            data=value;localRevision=revision;publish();
        }
    }
    synchronized void local(){if(observers==0||localPending)return;localPending=true;String mac=RelayConfig.getTargetMac(context);
        worker.execute(()->{HealthSnapshotWindow wanted=selected;try{load(mac,false);}catch(Exception e){message="暂时无法读取本地记录";publish();}
            finally{synchronized(this){localPending=false;}if(observers>0&&!wanted.same(selected))local();}});
    }
    private volatile long requestGeneration;private String requestedWindow="";
    void request(LocalDate anchor,boolean raw,boolean force){
        requestRange(raw?anchor:anchor.minusDays(62),anchor.plusDays(1),anchor,raw,force);
    }
    void request(HealthMetricsData.Period period,LocalDate anchor,boolean force){
        long length=java.time.temporal.ChronoUnit.DAYS.between(period.start,period.end)+1;
        LocalDate previous=period.mode==0?period.start.minusDays(1):period.start.minusDays(length);
        HealthMetricsData.Period calendar=new HealthMetricsData.Period(period.start,period.mode);
        if(calendar.start.equals(period.start)&&calendar.end.equals(period.end))previous=period.previous().start;
        requestRange(previous,period.end.plusDays(1),anchor,false,force);
    }
    private void requestRange(LocalDate a,LocalDate b,LocalDate anchor,boolean raw,boolean force){
        LocalDate today=LocalDate.now();if(b.isAfter(today.plusDays(1)))b=today.plusDays(1);if(a.isBefore(LocalDate.of(2019,1,1)))a=LocalDate.of(2019,1,1);if(!a.isBefore(b))return;
        if(anchor.isAfter(today))anchor=today;if(!raw){HealthSnapshotWindow wanted=new HealthSnapshotWindow(a,b,anchor);if(!wanted.same(selected))selected=wanted;local();}
        final HealthReadWindow window=new HealthReadWindow(a,b);final String mac=RelayConfig.getTargetMac(context),key=mac+":"+a+":"+b+":"+anchor+":"+raw+":"+selected.zone.getId();
        final long generation;final String pendingKey;
        synchronized(this){
            if(!raw&&!key.equals(requestedWindow)){requestedWindow=key;requestGeneration++;attempted.clear();}generation=requestGeneration;pendingKey=key+":"+generation;
            Long last=attempted.get(key);if(!force&&last!=null&&SystemClock.elapsedRealtime()-last<60000)return;
            if(!pending.add(pendingKey))return;if(attempted.size()>256)attempted.clear();attempted.put(key,SystemClock.elapsedRealtime());
        }
        worker.execute(()->{try{
            if(!current(mac,raw,generation))return;load(mac,false);HealthMetricsStore store=HealthMetricsStore.get(context);
            boolean refresh=force||context.getSharedPreferences("health_ui",0).getInt("detail_projection",0)!=10;
            busy=true;message=data==null||!data.officialLoaded?"正在读取历史记录…":"";publish();
            boolean imported=false;
            for(HealthReadWindow page:window.pages()){
                if(!current(mac,raw,generation))return;
                boolean changed=readPage(mac,page,raw,refresh,generation,store);
                // Show the newest completed page promptly; rebuild the final snapshot once after the rest.
                if(changed&&!imported){message="";load(mac,false);}imported|=changed;
            }
            if(!current(mac,raw,generation))return;
            if(!raw)context.getSharedPreferences("health_ui",0).edit().putInt("detail_projection",10).apply();
            message="";if(imported)load(mac,false);
        }catch(Exception e){if(current(mac,raw,generation)){String code=e.getMessage();message="BUSY".equals(code)?"历史记录稍后重试":HealthReadWindow.capacity(code)?"部分日期记录过多 · 已保存的数据仍可查看":"历史记录读取未完成 · 已保存的数据仍可查看";FileLogger.w("HealthDetails",code!=null&&code.matches("[A-Z_]{1,64}")?code:"READ_FAILED");}}
        finally{try{if(current(mac,raw,generation))load(mac,false);}catch(Exception ignored){}busy=false;synchronized(this){pending.remove(pendingKey);if(!current(mac,raw,generation))attempted.remove(key);}publish();}});
    }
    private boolean current(String mac,boolean raw,long generation){return observers>0&&mac.equalsIgnoreCase(RelayConfig.getTargetMac(context))&&generation==requestGeneration&&selected.zone.equals(ZoneId.systemDefault());}
    private boolean readPage(String mac,HealthReadWindow page,boolean raw,boolean force,long generation,HealthMetricsStore store)throws Exception {
        if(!current(mac,raw,generation))return false;
        String zone=selected.zone.getId();long start=page.start.atStartOfDay(selected.zone).toInstant().toEpochMilli(),end=page.end.atStartOfDay(selected.zone).toInstant().toEpochMilli();
        if(!force&&store.fresh(mac,start,end,raw,15*60000L))return false;
        JSONObject result;
        try{result=new OfficialSettingsClient(context).health(mac,start,end,raw,zone);}
        catch(Exception e){LocalDate middle=page.midpoint();if(raw||middle==null||!HealthReadWindow.capacity(e.getMessage()))throw e;
            boolean right=readPage(mac,new HealthReadWindow(middle,page.end),false,force,generation,store);
            boolean left=readPage(mac,new HealthReadWindow(page.start,middle),false,force,generation,store);return right||left;
        }
        if(!current(mac,raw,generation))return false;
        // Validate and commit the page before advancing; a later failure cannot erase earlier pages.
        store.save(mac,result,raw);if(!raw)HealthArchive.get(context).importOfficialActivity(mac,result.getJSONObject("activity"));
        return true;
    }
}
