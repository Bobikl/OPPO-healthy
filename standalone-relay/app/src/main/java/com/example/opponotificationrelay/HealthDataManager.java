package com.example.opponotificationrelay;

import android.content.Context;
import android.database.Cursor;
import android.os.*;
import org.json.*;
import java.time.*;
import java.util.*;
import java.util.concurrent.*;

/** Independent cache and import workers; cached views never wait for the root reader. */
final class HealthDataManager {
    interface Listener {void changed(HealthMetricsData data,String message,boolean busy);}
    private static HealthDataManager instance;
    static synchronized HealthDataManager get(Context c){if(instance==null)instance=new HealthDataManager(c.getApplicationContext());return instance;}
    private final Context context;private final Handler main=new Handler(Looper.getMainLooper());
    private final ExecutorService worker=Executors.newSingleThreadExecutor(r->new Thread(r,"health-detail-read"));
    private final ExecutorService snapshots=Executors.newSingleThreadExecutor(r->new Thread(r,"health-cache-read"));
    private long localDemand;
    private volatile HealthMetricsData homeData;private volatile long homeRevision=-1;
    private final Set<Listener> listeners=new HashSet<>();private final Set<String> pending=new HashSet<>();private final Map<String,Long> attempted=new HashMap<>();
    private volatile HealthMetricsData data;private volatile String message="";private volatile boolean busy;private boolean localPending;private volatile long localRevision=-1;private volatile int observers;private volatile HealthSnapshotWindow selected=HealthSnapshotWindow.home(LocalDate.now());
    private HealthDataManager(Context c){context=c;}
    void add(Listener l){listeners.add(l);observers=listeners.size();HealthMetricsData cached=snapshot();if(cached!=null&&cached.window.content==HealthSnapshotWindow.Content.ALL)l.changed(cached,message,busy);local();}
    void remove(Listener l){listeners.remove(l);observers=listeners.size();if(observers==0){requestGeneration++;requestedWindow="";}}
    HealthMetricsData snapshot(){return snapshot(selected);}
    HealthMetricsData snapshot(HealthSnapshotWindow wanted){
        if(!wanted.zone.equals(ZoneId.systemDefault()))return null;String mac=RelayConfig.getTargetMac(context);HealthMetricsData cached=data;
        if(cached!=null&&wanted.same(cached.window)&&cached.device.equalsIgnoreCase(mac))return cached;
        cached=homeData;return cached!=null&&wanted.same(cached.window)&&cached.device.equalsIgnoreCase(mac)?cached:null;
    }
    synchronized boolean hasPendingRequests(){String suffix=":"+requestGeneration;for(String key:pending)if(key.endsWith(suffix))return true;return false;}
    boolean locallyReady(HealthMetricsData value){return value!=null&&value==data&&!localPending&&selected.same(value.window);}
    boolean settled(HealthMetricsData value){return locallyReady(value)&&!hasPendingRequests();}
    boolean presentationReady(HealthMetricsData value,HealthPageReadiness.Content content,LocalDate date){
        if(value==null||value.window==null||!date.equals(value.window.anchor)
                ||!value.device.equalsIgnoreCase(RelayConfig.getTargetMac(context))
                ||!value.window.zone.equals(ZoneId.systemDefault()))return false;
        return settled(value)||locallyReady(value)&&HealthPageReadiness.complete(value,content,date);
    }
    private void publish(){main.post(()->{String device=RelayConfig.getTargetMac(context);HealthMetricsData value=data!=null&&selected.same(data.window)&&data.device.equalsIgnoreCase(device)?data:null;if(value==null&&busy&&data!=null&&data.device.equalsIgnoreCase(device))return;for(Listener l:new ArrayList<>(listeners))if(!HealthCalendar.closing(l))l.changed(value,message,busy);});}
    private long revision(String mac)throws Exception{return HealthArchive.get(context).revision(mac)+HealthMetricsStore.get(context).revision(mac);}
    private void load(String mac,boolean force)throws Exception{
        if(observers==0)return;long generation;HealthSnapshotWindow wanted;synchronized(this){generation=requestGeneration;wanted=selected;}if(!wanted.zone.equals(ZoneId.systemDefault())){wanted=new HealthSnapshotWindow(wanted.start,wanted.end,wanted.anchor,wanted.content);selected=wanted;HealthSnapshotWindow refreshed=wanted;main.post(()->{if(observers>0&&refreshed.same(selected))requestRange(refreshed.start,refreshed.end,refreshed.anchor,false,false,false,refreshed.content);});}HealthMetricsStore.get(context).ensureZone(mac,wanted.zone);long revision=revision(mac);
        HealthMetricsData previous=data;
        if(force||previous==null||!previous.device.equalsIgnoreCase(mac)||localRevision!=revision||!wanted.same(previous.window)){
            HealthMetricsData value=HealthMetricsStore.get(context).load(context,mac,wanted);
            if(observers==0||generation!=requestGeneration||!wanted.zone.equals(ZoneId.systemDefault())||!wanted.same(selected)||!mac.equalsIgnoreCase(RelayConfig.getTargetMac(context)))return;
            if(revision(mac)!=revision){local();return;}
            HealthSnapshotWindow window=wanted;main.post(()->{if(observers==0||generation!=requestGeneration||!window.same(selected)||!window.zone.equals(ZoneId.systemDefault())||!mac.equalsIgnoreCase(RelayConfig.getTargetMac(context)))return;data=value;localRevision=revision;if(HealthSnapshotWindow.home(window.anchor).same(window)){homeData=value;homeRevision=revision;}publish();});
        }
    }
    synchronized void local(){
        if(observers==0)return;localDemand++;if(localPending)return;localPending=true;
        snapshots.execute(()->{
            final long demand; synchronized(this){demand=localDemand;}
            long version=requestGeneration;HealthSnapshotWindow wanted=selected;String mac=RelayConfig.getTargetMac(context);
            try{load(mac,false);}catch(Exception e){message="暂时无法读取本地记录";publish();}
            finally{main.post(()->{boolean again;synchronized(this){localPending=false;again=observers>0&&(demand!=localDemand||version!=requestGeneration||!wanted.same(selected)||!mac.equalsIgnoreCase(RelayConfig.getTargetMac(context)));}if(again)local();else publish();});}
        });
    }
    void historyChanged(){HealthMetricsStore.get(context).invalidateRanges();synchronized(this){requestGeneration++;attempted.clear();requestedWindow="";data=null;localRevision=-1;homeData=null;homeRevision=-1;}context.getSharedPreferences("health_ui",0).edit().putInt("detail_projection",0).apply();main.post(()->{if(observers>0){HealthSnapshotWindow wanted=selected;requestRange(wanted.start,wanted.end,wanted.anchor,false,true,false,wanted.content);requestRange(wanted.detailStart,wanted.detailEnd,wanted.anchor,true,true);}});}
    void calendar(String metric,java.util.function.BiConsumer<Map<LocalDate,Float>,String> callback){
        String device=RelayConfig.getTargetMac(context),zone=ZoneId.systemDefault().getId();
        worker.execute(()->{Map<LocalDate,Float> dates=new HashMap<>();String error="";try{
            LocalHealthCalendar.read(context,device,metric,ZoneId.of(zone),dates);
            JSONObject result=OfficialHistoryStore.available(context)?new OfficialSettingsClient(context).calendar(device,metric,zone):new JSONObject().put("calendar",new JSONArray());JSONArray rows=result.getJSONArray("calendar");if(rows.length()>10000)throw new java.io.IOException("CALENDAR_LIMIT");
            for(int i=0;i<rows.length();i++){LocalDate date=LocalDate.parse(rows.getString(i));if(date.isBefore(LocalDate.of(2019,1,1))||date.isAfter(LocalDate.now()))throw new java.io.IOException("CALENDAR_DATE");dates.put(date,1f);}
        }catch(Exception e){error="历史日期尚未读取完整，请稍后重新打开日历";}
            String message=error;main.post(()->{if(device.equals(RelayConfig.getTargetMac(context))&&zone.equals(ZoneId.systemDefault().getId()))callback.accept(dates,message);});
        });
    }
    void requestOxygenDay(LocalDate anchor){requestRange(anchor.minusDays(1),anchor.plusDays(1),anchor,false,false,true);}
    private volatile long requestGeneration;private String requestedWindow="";
    void request(LocalDate anchor,boolean raw,boolean force){
        requestRange(raw?anchor:anchor.minusDays(62),anchor.plusDays(1),anchor,raw,force);
    }
    void request(HealthMetricsData.Period period,LocalDate anchor,boolean force){
        request(period,anchor,force,HealthSnapshotWindow.Content.ALL);
    }
    void request(HealthMetricsData.Period period,LocalDate anchor,boolean force,HealthSnapshotWindow.Content content){
        long length=java.time.temporal.ChronoUnit.DAYS.between(period.start,period.end)+1;
        LocalDate previous=period.mode==0?period.start.minusDays(1):period.start.minusDays(length);
        HealthMetricsData.Period calendar=new HealthMetricsData.Period(period.start,period.mode);
        if(calendar.start.equals(period.start)&&calendar.end.equals(period.end))previous=period.previous().start;
        requestRange(previous,period.end.plusDays(1),anchor,false,force,false,content);
    }
    private void requestRange(LocalDate a,LocalDate b,LocalDate anchor,boolean raw,boolean force){requestRange(a,b,anchor,raw,force,false);}
    private void requestRange(LocalDate a,LocalDate b,LocalDate anchor,boolean raw,boolean force,boolean rawFirst){
        requestRange(a,b,anchor,raw,force,rawFirst,HealthSnapshotWindow.Content.ALL);
    }
    private void requestRange(LocalDate a,LocalDate b,LocalDate anchor,boolean raw,boolean force,boolean rawFirst,HealthSnapshotWindow.Content content){
        LocalDate today=LocalDate.now();if(b.isAfter(today.plusDays(1)))b=today.plusDays(1);if(a.isBefore(LocalDate.of(2019,1,1)))a=LocalDate.of(2019,1,1);if(!a.isBefore(b))return;
        if(anchor.isAfter(today))anchor=today;final HealthSnapshotWindow wanted=raw?selected:new HealthSnapshotWindow(a,b,anchor,content);
        final HealthReadWindow rawDay=new HealthReadWindow(anchor,anchor.plusDays(1));final HealthReadWindow window=new HealthReadWindow(a,b);final String mac=RelayConfig.getTargetMac(context),key=mac+":"+a+":"+b+":"+anchor+":"+raw+":"+rawFirst+":"+wanted.content+":"+wanted.zone.getId();
        final long generation;final String pendingKey;
        synchronized(this){
            if(!raw&&!key.equals(requestedWindow)){if(!wanted.same(selected)||!requestedWindow.isEmpty()||hasPendingRequests())requestGeneration++;requestedWindow=key;attempted.clear();}
            if(!raw){if(!wanted.same(selected)){selected=wanted;HealthMetricsData cached=snapshot(wanted);if(cached!=null){data=cached;if(cached==homeData)localRevision=homeRevision;publish();}}local();}
            generation=requestGeneration;pendingKey=key+":"+generation;
            Long last=attempted.get(key);if(!force&&last!=null&&SystemClock.elapsedRealtime()-last<60000)return;
            if(!pending.add(pendingKey))return;if(attempted.size()>256)attempted.clear();attempted.put(key,SystemClock.elapsedRealtime());
        }
        worker.execute(()->{try{
            if(!current(mac,raw,generation))return;local();HealthMetricsStore store=HealthMetricsStore.get(context);
            boolean refresh=force||context.getSharedPreferences("health_ui",0).getInt("detail_projection",0)!=11;
            busy=true;message=data==null||!data.officialLoaded?"正在读取历史记录…":"";publish();
            boolean imported=false;
            if(rawFirst){imported=readPage(mac,rawDay,true,refresh,generation,store);if(imported)local();}
            for(HealthReadWindow page:window.pages()){
                if(!current(mac,raw,generation))return;
                boolean changed=readPage(mac,page,raw,refresh,generation,store);
                // Show the newest completed page promptly; rebuild the final snapshot once after the rest.
                if(changed&&!imported){message="";local();}imported|=changed;
            }
            if(!current(mac,raw,generation))return;
            if(!raw)context.getSharedPreferences("health_ui",0).edit().putInt("detail_projection",11).apply();
            message="";if(imported)local();
        }catch(Exception e){if(current(mac,raw,generation)){String code=e.getMessage();message="BUSY".equals(code)?"历史记录稍后重试":HealthReadWindow.capacity(code)?"部分日期记录过多 · 已保存的数据仍可查看":"历史记录读取未完成 · 已保存的数据仍可查看";FileLogger.w("HealthDetails",code!=null&&code.matches("[A-Z_]{1,64}")?code:"READ_FAILED");}}
        finally{try{if(current(mac,raw,generation))local();}catch(Exception ignored){}busy=false;synchronized(this){pending.remove(pendingKey);if(!current(mac,raw,generation))attempted.remove(key);}publish();}});
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
