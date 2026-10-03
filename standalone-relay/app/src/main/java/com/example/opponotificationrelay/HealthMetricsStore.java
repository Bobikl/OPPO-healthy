package com.example.opponotificationrelay;

import android.content.*;
import android.database.Cursor;
import android.database.sqlite.*;
import org.json.*;
import java.io.IOException;
import java.time.*;
import java.util.*;

/** Private cache. Original official rows are read-only; watch packets stay in HealthArchive. */
final class HealthMetricsStore extends SQLiteOpenHelper {
    private static HealthMetricsStore instance;
    static synchronized HealthMetricsStore get(Context c){if(instance==null)instance=new HealthMetricsStore(c.getApplicationContext());return instance;}
    private HealthMetricsStore(Context c){super(c,"health-details.db",null,4);setWriteAheadLoggingEnabled(true);}
    @Override public void onCreate(SQLiteDatabase db){
        db.execSQL("CREATE TABLE items(device TEXT NOT NULL,scope TEXT NOT NULL,kind TEXT NOT NULL,stamp INTEGER NOT NULL,body TEXT NOT NULL,day INTEGER NOT NULL DEFAULT 0,PRIMARY KEY(device,scope,kind,stamp))");
        db.execSQL("CREATE TABLE scopes(device TEXT PRIMARY KEY,scope TEXT NOT NULL,read_at INTEGER NOT NULL,revision INTEGER NOT NULL DEFAULT 1,zone TEXT NOT NULL DEFAULT '')");
        db.execSQL("CREATE TABLE ranges(device TEXT NOT NULL,scope TEXT NOT NULL,kind TEXT NOT NULL,start INTEGER NOT NULL,end INTEGER NOT NULL,read_at INTEGER NOT NULL,PRIMARY KEY(device,scope,kind,start,end))");
    }
    @Override public void onUpgrade(SQLiteDatabase db,int a,int b){
        if(a<2){db.execSQL("ALTER TABLE items ADD COLUMN day INTEGER NOT NULL DEFAULT 0");
            try(Cursor c=db.rawQuery("SELECT device,scope,stamp,body FROM items WHERE kind='sleepSegments'",null)){
                while(c.moveToNext()){ContentValues v=new ContentValues();try{v.put("day",new JSONArray(c.getString(3)).getInt(4));}catch(JSONException e){throw new IllegalStateException("DETAIL_MIGRATION",e);}
                    db.update("items",v,"device=? AND scope=? AND kind='sleepSegments' AND stamp=?",new String[]{c.getString(0),c.getString(1),c.getString(2)});}
            }
        }
        if(a<3)db.execSQL("ALTER TABLE scopes ADD COLUMN revision INTEGER NOT NULL DEFAULT 1");
        if(a<4)db.execSQL("ALTER TABLE scopes ADD COLUMN zone TEXT NOT NULL DEFAULT ''");
    }
    void ensureZone(String mac,ZoneId zone)throws Exception {
        if(!zone.equals(ZoneId.systemDefault()))throw new IOException("HEALTH_TIMEZONE_CHANGED");String device=HealthArchive.device(mac);SQLiteDatabase db=getWritableDatabase();try(Cursor current=db.rawQuery("SELECT zone FROM scopes WHERE device=?",new String[]{device})){if(!current.moveToFirst()||zone.getId().equals(current.getString(0)))return;}db.beginTransaction();try{
            boolean invalid=false;try(Cursor c=db.rawQuery("SELECT zone FROM scopes WHERE device=?",new String[]{device})){invalid=c.moveToFirst()&&!zone.getId().equals(c.getString(0));}
            if(invalid){db.delete("items","device=? AND kind IN('bins','activityBins','activityHalves','moveHours','oxygenDays')",new String[]{device});db.delete("ranges","device=?",new String[]{device});db.execSQL("UPDATE scopes SET zone=?,revision=revision+1 WHERE device=?",new Object[]{zone.getId(),device});}
            db.setTransactionSuccessful();
        }finally{db.endTransaction();}
    }
    long revision(String mac)throws Exception{String device=HealthArchive.device(mac);long value=0;
        try(Cursor c=getReadableDatabase().rawQuery("SELECT revision FROM scopes WHERE device=?",new String[]{device})){if(c.moveToFirst())value=c.getLong(0);}
        return value;
    }
    boolean fresh(String mac,long from,long to,boolean raw,long age)throws Exception {
        List<long[]> spans=new ArrayList<>();long cutoff=System.currentTimeMillis()-age;
        try(Cursor c=getReadableDatabase().rawQuery("SELECT r.start,r.end FROM ranges r JOIN scopes s ON r.device=s.device AND r.scope=s.scope WHERE r.device=? AND r.kind=? AND r.read_at>? AND r.end>? AND r.start<? ORDER BY r.start",new String[]{HealthArchive.device(mac),raw?"raw3":"bins",Long.toString(cutoff),Long.toString(from),Long.toString(to)})){
            while(c.moveToNext())spans.add(new long[]{c.getLong(0),c.getLong(1)});
        }return HealthReadWindow.covered(from,to,spans);
    }
    void save(String mac,JSONObject data,boolean raw)throws Exception {
        ZoneId zone=ZoneId.of(data.optString("zone",ZoneId.systemDefault().getId()));if(!zone.equals(ZoneId.systemDefault()))throw new IOException("HEALTH_TIMEZONE_CHANGED");ensureZone(mac,zone);
        String device=HealthArchive.device(mac),scope=data.getString("scope");if(!scope.matches("[a-f0-9]{64}"))throw new IOException("HEALTH_SCOPE");
        long start=data.getLong("start"),end=data.getLong("end"),readAt=data.getLong("readAt");
        if(start<1546272000000L||end<=start||end-start>367L*86400000L||readAt<=0)throw new IOException("HEALTH_RANGE");
        SQLiteDatabase db=getWritableDatabase();db.beginTransaction();try{
            long revision=0;boolean changed=false;try(Cursor prior=db.rawQuery("SELECT scope,revision FROM scopes WHERE device=?",new String[]{device})){if(prior.moveToFirst()){revision=prior.getLong(1);changed=!scope.equals(prior.getString(0));}else changed=true;}
            for(String kind:raw?new String[]{"raw","oxygen","glucoseRaw"}:new String[]{"heart","sleep","bins","warnings","latest","activityBins","activityHalves","moveHours","sleepNight","sleepSegments","sleepIndex","sleepWrist","oxygenDays","mentalDays","mentalRaw","sunshineDays","relaxRows","weightRows","glucoseDays","apneaDays"}){
                JSONArray rows=(kind.equals("oxygen")||kind.equals("oxygenDays")||kind.startsWith("mental")||kind.equals("sunshineDays")||kind.equals("relaxRows")||kind.equals("weightRows")||kind.startsWith("glucose")||kind.equals("apneaDays"))?data.optJSONArray(kind):data.getJSONArray(kind);if(rows==null)rows=new JSONArray();int limit=(kind.equals("sleepSegments")?40000:(kind.equals("raw")||kind.equals("oxygen")||kind.equals("mentalRaw")||kind.equals("glucoseRaw"))?20000:kind.equals("bins")||kind.equals("activityHalves")?18000:kind.equals("activityBins")||kind.equals("moveHours")?9000:5000);if(rows.length()>limit)throw new IOException("HEALTH_ROW_LIMIT");
                String column=kind.equals("sleepSegments")?"day":"stamp";
                boolean dateKind=kind.equals("sleepSegments")||kind.equals("heart")||kind.equals("sleep")||kind.equals("sleepNight")||kind.equals("sleepWrist")||kind.equals("mentalDays")||kind.equals("sunshineDays")||kind.equals("glucoseDays")||kind.equals("apneaDays");
                String from=dateKind?HealthMetricsData.date(start).toString().replace("-",""):Long.toString(start),to=dateKind?HealthMetricsData.date(end).toString().replace("-",""):Long.toString(end);
                Map<Long,String> old=new HashMap<>();try(Cursor prior=db.rawQuery("SELECT stamp,body FROM items WHERE device=? AND scope=? AND kind=? AND "+column+">=? AND "+column+"<?",new String[]{device,scope,kind,from,to})){while(prior.moveToNext())old.put(prior.getLong(0),prior.getString(1));}
                Set<Long> seen=new HashSet<>();
                for(int i=0;i<rows.length();i++){JSONArray row=rows.getJSONArray(i);int width=kind.equals("glucoseDays")?6:kind.equals("apneaDays")?4:kind.equals("glucoseRaw")?3:kind.equals("mentalDays")?7:kind.equals("mentalRaw")?5:kind.equals("sunshineDays")||kind.equals("relaxRows")?4:kind.equals("sleepNight")?9:kind.equals("sleepSegments")||kind.equals("activityHalves")?5:kind.equals("sleepIndex")?10:kind.equals("sleepWrist")?4:kind.equals("heart")||kind.equals("bins")||kind.equals("oxygenDays")?7:kind.equals("sleep")?8:kind.equals("activityBins")?4:kind.equals("raw")?3:kind.equals("warnings")?6:2;
                    if(row.length()!=width&&!(kind.equals("mentalDays")&&(row.length()==9||row.length()==10))&&!(kind.equals("relaxRows")&&row.length()==8))throw new IOException("HEALTH_ROW_SHAPE");long stamp=row.getLong(0);if(!seen.add(stamp))throw new IOException("HEALTH_DUPLICATE");
                    if(kind.equals("heart")||kind.equals("sleep")||kind.equals("sleepNight")||kind.equals("sleepWrist")||kind.equals("mentalDays")||kind.equals("sunshineDays")||kind.equals("glucoseDays")||kind.equals("apneaDays")){LocalDate d=HealthMetricsData.dateCode((int)stamp);if(d.isBefore(HealthMetricsData.date(start))||!d.isBefore(HealthMetricsData.date(end)))throw new IOException("HEALTH_DATE");}
                    else if(kind.equals("sleepSegments")){LocalDate owner=HealthMetricsData.dateCode(row.getInt(4));if(owner.isBefore(HealthMetricsData.date(start))||!owner.isBefore(HealthMetricsData.date(end))||stamp<1420070400000L||stamp>System.currentTimeMillis()+86400000L)throw new IOException("HEALTH_STAMP");}
                    else if(stamp<start||stamp>=end)throw new IOException("HEALTH_STAMP");
                    for(int k=1;k<row.length();k++){if(row.isNull(k))continue;long value=row.getLong(k);if(value<0)throw new IOException("HEALTH_VALUE");}
                    if(kind.equals("raw")&&(row.getInt(1)<=0||row.getInt(1)>300))throw new IOException("HEALTH_VALUE");
                    if(kind.equals("oxygen")&&(row.getInt(1)<=0||row.getInt(1)>100))throw new IOException("HEALTH_VALUE");
                    if(kind.equals("oxygenDays")){
                        int lo=row.getInt(1),hi=row.getInt(2),mean=row.getInt(3),latest=row.getInt(4);long measured=row.getLong(5);
                        if(lo<=0||hi>100||hi<lo||mean<lo||mean>hi||latest<lo||latest>hi||row.getInt(6)<=0)throw new IOException("HEALTH_VALUE");
                        if(stamp!=HealthMetricsData.time(HealthMetricsData.date(stamp))||measured<stamp||measured>=HealthMetricsData.time(HealthMetricsData.date(stamp).plusDays(1))||measured<start||measured>=end)throw new IOException("HEALTH_STAMP");
                    }
                    if(kind.equals("mentalDays")||kind.equals("sunshineDays")||kind.equals("glucoseDays")||kind.equals("apneaDays")){long t=HealthMetricsData.time(HealthMetricsData.dateCode((int)stamp));if(t<start||t>=end)throw new IOException("HEALTH_STAMP");}
                    if(kind.equals("mentalDays")||kind.equals("mentalRaw")){if(row.getInt(1)<1||row.getInt(1)>100||row.getInt(2)<1||row.getInt(2)>4)throw new IOException("HEALTH_VALUE");}
                    if(kind.equals("sunshineDays")&&(row.getInt(1)>1440||row.getInt(2)>1440))throw new IOException("HEALTH_VALUE");
                    if(kind.equals("relaxRows")&&(row.getInt(1)<=0||row.getInt(1)>86400))throw new IOException("HEALTH_VALUE");
                    if(kind.equals("weightRows")&&(row.getInt(1)<=0||row.getInt(1)>1000000))throw new IOException("HEALTH_VALUE");
                    if(kind.equals("glucoseRaw")&&(row.getInt(1)<=0||row.getInt(1)>1000000))throw new IOException("HEALTH_VALUE");
                    if(kind.equals("glucoseDays")){for(int j=1;j<6;j++)if(!row.isNull(j)&&row.getLong(j)>1000000)throw new IOException("HEALTH_VALUE");int lo=row.optInt(1),hi=row.optInt(2),mean=row.optInt(3);if(mean>0&&(lo<=0||hi<lo||mean<lo||mean>hi))throw new IOException("HEALTH_VALUE");int low=row.optInt(4),high=row.optInt(5);if(low>0&&high>0&&low>=high)throw new IOException("HEALTH_VALUE");}
                    if(kind.equals("apneaDays")&&(row.getInt(1)>4||(!row.isNull(2)&&row.getLong(2)>1000000)))throw new IOException("HEALTH_VALUE");
                    String body=row.toString();if(body.equals(old.remove(stamp)))continue;changed=true;
                    ContentValues v=new ContentValues();v.put("device",device);v.put("scope",scope);v.put("kind",kind);v.put("stamp",stamp);v.put("body",body);if(kind.equals("sleepSegments"))v.put("day",row.getInt(4));db.insertWithOnConflict("items",null,v,SQLiteDatabase.CONFLICT_REPLACE);
                }
                for(long removed:old.keySet()){db.delete("items","device=? AND scope=? AND kind=? AND stamp=?",new String[]{device,scope,kind,Long.toString(removed)});changed=true;}
            }
            if(!raw){JSONArray articles=data.optJSONArray("knowledge");if(articles!=null){if(articles.length()>120)throw new IOException("KNOWLEDGE_LIMIT");Map<Long,String> oldArticles=new HashMap<>();try(Cursor prior=db.rawQuery("SELECT stamp,body FROM items WHERE device=? AND scope=? AND kind='knowledge'",new String[]{device,scope})){while(prior.moveToNext())oldArticles.put(prior.getLong(0),prior.getString(1));}for(int i=0;i<articles.length();i++){JSONArray row=articles.getJSONArray(i);if(row.length()!=8||!row.getString(1).matches("2005|2006|2007|2008|2011|2014|2021")||row.getString(3).length()>200||row.getString(4).length()>2000||RootKnowledgeReader.safeUrl(row.getString(5)).isEmpty())throw new IOException("KNOWLEDGE_VALUE");if(row.toString().equals(oldArticles.remove((long)i+1)))continue;changed=true;ContentValues article=new ContentValues();article.put("device",device);article.put("scope",scope);article.put("kind","knowledge");article.put("stamp",i+1);article.put("body",row.toString());db.insertWithOnConflict("items",null,article,SQLiteDatabase.CONFLICT_REPLACE);}for(long removed:oldArticles.keySet()){db.delete("items","device=? AND scope=? AND kind='knowledge' AND stamp=?",new String[]{device,scope,Long.toString(removed)});changed=true;}}}
            ContentValues state=new ContentValues();state.put("device",device);state.put("scope",scope);state.put("read_at",readAt);state.put("revision",revision+(changed?1:0));state.put("zone",zone.getId());db.insertWithOnConflict("scopes",null,state,SQLiteDatabase.CONFLICT_REPLACE);
            ContentValues range=new ContentValues();range.put("device",device);range.put("scope",scope);range.put("kind",raw?"raw3":"bins");range.put("start",start);range.put("end",end);range.put("read_at",readAt);db.insertWithOnConflict("ranges",null,range,SQLiteDatabase.CONFLICT_REPLACE);
            if(!zone.equals(ZoneId.systemDefault()))throw new IOException("HEALTH_TIMEZONE_CHANGED");db.setTransactionSuccessful();
        }finally{db.endTransaction();}
    }
    HealthMetricsData load(Context context,String mac)throws Exception {return load(context,mac,HealthSnapshotWindow.home(LocalDate.now()));}
    HealthMetricsData load(Context context,String mac,HealthSnapshotWindow window)throws Exception {
        ensureZone(mac,window.zone);
        String device=HealthArchive.device(mac);HealthMetricsData out=new HealthMetricsData();out.window=window;out.device=device;out.loadedAt=System.currentTimeMillis();try(Cursor state=getReadableDatabase().rawQuery("SELECT read_at FROM scopes WHERE device=?",new String[]{device})){if(state.moveToFirst())out.officialAt=state.getLong(0);}out.officialLoaded=out.officialAt>0;
        TreeMap<Long,Long> officialHours=new TreeMap<>(),officialHalves=new TreeMap<>();
        Set<LocalDate> officialSleep=new HashSet<>();
        String[] dateKinds={"heart","sleep","sleepNight","sleepWrist","mentalDays","sunshineDays","glucoseDays","apneaDays"};
        Set<String> dailyKinds=new HashSet<>(Arrays.asList(dateKinds)),detailKinds=new HashSet<>(Arrays.asList("raw","oxygen","glucoseRaw","activityBins","activityHalves","moveHours"));
        for(String itemKind:new String[]{"heart","sleep","sleepNight","sleepWrist","mentalDays","sunshineDays","glucoseDays","apneaDays","bins","sleepIndex","oxygenDays","mentalRaw","relaxRows","weightRows","latest","warnings","raw","oxygen","glucoseRaw","activityBins","activityHalves","moveHours","sleepSegments","knowledge"}){
            boolean daily=dailyKinds.contains(itemKind),segment=itemKind.equals("sleepSegments"),detailed=detailKinds.contains(itemKind);
            LocalDate first=segment?window.detailStart:window.start,last=segment?window.detailEnd:window.end;
            String from=daily||segment?first.toString().replace("-",""):Long.toString(detailed?window.detailFrom:window.from),to=daily||segment?last.toString().replace("-",""):Long.toString(detailed?window.detailTo:window.to);
            String select="SELECT i.kind,i.body FROM items i JOIN scopes s ON i.device=s.device AND i.scope=s.scope WHERE i.device=? AND i.kind=?",column=segment?"i.day":"i.stamp";
            boolean knowledge=itemKind.equals("knowledge");String[] args=knowledge?new String[]{device,itemKind}:new String[]{device,itemKind,from,to};
            try(Cursor c=getReadableDatabase().rawQuery(select+(knowledge?"":" AND "+column+">=? AND "+column+"<?")+" ORDER BY i.stamp",args)){
            while(c.moveToNext()){String kind=c.getString(0);JSONArray r=new JSONArray(c.getString(1));long stamp=r.getLong(0);
                if(kind.equals("heart")){HealthMetricsData.Day d=out.day(HealthMetricsData.dateCode((int)stamp));d.range(r.optInt(1),r.optInt(2));d.rest=r.optInt(4);d.walk=r.optInt(5);d.sleepHeart=r.optInt(6);}
                else if(kind.equals("sleep")){HealthMetricsData.Day d=out.day(HealthMetricsData.dateCode((int)stamp));d.sleepScore=r.optInt(2)>0?r.optInt(2):r.optInt(1);d.sleepMinutes=r.optInt(3);d.deep=r.optInt(4);d.light=r.optInt(5);d.rem=r.optInt(6);d.awake=r.optInt(7);}
                else if(kind.equals("bins")){HealthMetricsData.Bin b=new HealthMetricsData.Bin(stamp);b.min=r.getInt(1);b.max=r.getInt(2);b.sum=r.getLong(3);b.count=r.getInt(4);b.lastTime=r.getLong(5);b.last=r.getInt(6);if(window.detail(stamp))out.bins.put(stamp,b);HealthMetricsData.Day d=out.day(HealthMetricsData.date(stamp));d.range(b.min,b.max);if(b.lastTime>d.latestTime){d.latestTime=b.lastTime;d.latest=b.last;}}
                else if(kind.equals("activityBins")){out.activityHours.put(stamp,new int[]{r.getInt(1),r.getInt(2)});officialHours.put(stamp,r.getLong(3));}
                else if(kind.equals("activityHalves")){out.activityHalves.put(stamp,new int[]{r.getInt(1),r.getInt(2),r.getInt(3)});officialHalves.put(stamp,r.getLong(4));}
                else if(kind.equals("moveHours")){out.moveHours.put(stamp,r.getInt(1));}
                else if(kind.equals("sleepNight")){HealthMetricsData.Day d=out.day(HealthMetricsData.dateCode((int)stamp));d.sleepIn=r.getLong(1);d.sleepOut=r.getLong(2);d.sleepMinutes=r.getInt(3);d.deep=r.getInt(4);d.light=r.getInt(5);d.rem=r.getInt(6);d.awake=r.getInt(7);d.wakes=r.getInt(8);if(d.sleepIn>0&&d.sleepOut>d.sleepIn)officialSleep.add(d.date);}
                else if(kind.equals("sleepSegments")){LocalDate date=HealthMetricsData.dateCode(r.getInt(4));out.sleepSegments.computeIfAbsent(date,k->new ArrayList<>()).add(new HealthMetricsData.SleepSegment(stamp,r.getLong(1),r.getInt(2),r.getInt(3)!=0));}
                else if(kind.equals("sleepIndex")){HealthMetricsData.Day d=out.day(HealthMetricsData.date(stamp));d.spo2=r.optInt(1);if(r.optInt(2)>0)d.sleepHeart=r.optInt(2);d.sleepHrLow=r.optInt(3);d.sleepHrHigh=r.optInt(4);d.breathLow=r.optInt(5);d.breathHigh=r.optInt(6);d.hrv=r.optInt(7);d.hrvLow=r.optInt(8);d.hrvHigh=r.optInt(9);}
                else if(kind.equals("sleepWrist")){HealthMetricsData.Day d=out.day(HealthMetricsData.dateCode((int)stamp));d.wristBase=r.optInt(1);d.wristConfidence=r.optInt(2);d.wristValue=r.optInt(3);}
                else if(kind.equals("oxygenDays")){HealthMetricsData.Day d=out.day(HealthMetricsData.date(stamp));d.oxygenMin=r.getInt(1);d.oxygenMax=r.getInt(2);d.oxygenMean=r.getInt(3);d.oxygenLatest=r.getInt(4);d.oxygenTime=r.getLong(5);d.oxygenCount=r.getInt(6);}
                else if(kind.equals("knowledge")){HealthMetricsData.Knowledge k=new HealthMetricsData.Knowledge();k.page=r.getString(1);k.card=r.getString(2);k.title=r.getString(3);k.description=r.getString(4);k.url=r.getString(5);k.start=r.optLong(6);k.end=r.optLong(7);out.knowledge.add(k);}
                else if(kind.equals("mentalDays")){HealthMetricsData.Day d=out.day(HealthMetricsData.dateCode((int)stamp));d.mentalAverage=r.getInt(1);d.mentalState=r.getInt(2);d.mentalHrv=r.getInt(3);d.mentalBaseLow=r.getInt(4);d.mentalBaseMiddle=r.getInt(5);d.mentalBaseHigh=r.getInt(6);d.mentalSleepHrv=r.optInt(7);d.mentalRestHeart=r.optInt(8);d.mentalReminders=r.optInt(9,-1);}
                else if(kind.equals("mentalRaw")){HealthMetricsData.Mental point=new HealthMetricsData.Mental(stamp,r.getInt(1),r.getInt(2),r.getInt(3),r.getInt(4));if(window.detail(stamp))out.mental.put(stamp,point);HealthMetricsData.Day d=out.day(HealthMetricsData.date(stamp));if(d.mentalMin==null||point.value<=d.mentalMin.value)d.mentalMin=point;if(d.mentalMax==null||point.value>=d.mentalMax.value)d.mentalMax=point;if(stamp>=d.mentalTime){d.mentalTime=stamp;d.mentalLatest=point.value;d.mentalLatestState=point.state;}}
                else if(kind.equals("sunshineDays")){HealthMetricsData.Day d=out.day(HealthMetricsData.dateCode((int)stamp));d.sunshineMinutes=r.getInt(1);d.sunshineTarget=r.getInt(2);d.sunshineType=r.getInt(3);}
                else if(kind.equals("relaxRows")){HealthMetricsData.Relax item=new HealthMetricsData.Relax(stamp,r.getInt(1),r.getInt(2),r.getInt(3));item.minHeart=r.optInt(4,0);item.maxHeart=r.optInt(5,0);item.mental=r.optInt(6,0);item.stress=r.optInt(7,0);out.relax.put(stamp,item);HealthMetricsData.Day d=out.day(HealthMetricsData.date(stamp));d.relaxSeconds+=item.seconds;d.relaxCount++;}
                else if(kind.equals("weightRows")){int grams=r.getInt(1);out.weights.put(stamp,grams);HealthMetricsData.Day d=out.day(HealthMetricsData.date(stamp));if(stamp>=d.weightTime){d.weightTime=stamp;d.weightGrams=grams;}}
                else if(kind.equals("glucoseDays")){HealthMetricsData.Day d=out.day(HealthMetricsData.dateCode((int)stamp));d.glucoseMin=r.optInt(1);d.glucoseMax=r.optInt(2);d.glucoseMean=r.optInt(3);if(r.optInt(4)>0&&r.optInt(5)>r.optInt(4)){d.glucoseLow=r.getInt(4);d.glucoseHigh=r.getInt(5);}}
                else if(kind.equals("glucoseRaw")){HealthMetricsData.Glucose point=new HealthMetricsData.Glucose(stamp,r.getInt(1),r.getInt(2));out.glucose.put(stamp,point);HealthMetricsData.Day d=out.day(HealthMetricsData.date(stamp));if(stamp>=d.glucoseTime){d.glucoseTime=stamp;d.glucoseLatest=point.milli;d.glucoseTrend=point.trend;}}
                else if(kind.equals("apneaDays")){HealthMetricsData.Day d=out.day(HealthMetricsData.dateCode((int)stamp));d.apneaLevel=r.getInt(1)-1;d.apneaAhi=r.isNull(2)?-1:r.getInt(2);d.apneaVersion=r.getInt(3);}
                else if(kind.equals("raw")){out.raw.put(stamp,r.getInt(1));}
                else if(kind.equals("oxygen")){out.oxygen.put(stamp,r.getInt(1));}
                else if(kind.equals("latest")){HealthMetricsData.Day d=out.day(HealthMetricsData.date(stamp));if(stamp>d.latestTime){d.latestTime=stamp;d.latest=r.getInt(1);}}
                else if(kind.equals("warnings")){HealthMetricsData.Warning w=new HealthMetricsData.Warning();w.start=stamp;w.end=r.getLong(1);w.type=r.getInt(2);w.heartType=r.getInt(3);w.min=r.getInt(4);w.max=r.getInt(5);out.day(HealthMetricsData.date(stamp)).warningCount++;out.warnings.add(w);if(out.warnings.size()>1000)out.warnings.remove(0);}
            }
        }
        }
        HealthArchive archive=HealthArchive.get(context);SQLiteDatabase local=archive.getReadableDatabase();
        try(Cursor c=local.rawQuery("SELECT a.day,a.body FROM official_activity a JOIN official_activity_scope s ON a.scope=s.scope AND a.device=s.device WHERE a.device=? AND a.day>=? AND a.day<?",new String[]{device,window.start.toString(),window.end.toString()})){while(c.moveToNext()){HealthMetricsData.Day d=out.day(LocalDate.parse(c.getString(0)));JSONArray values=new JSONObject(c.getString(1)).getJSONArray("values");d.steps=values.getInt(0);d.calories=(int)(values.getLong(1)/1000);}}
        try(Cursor c=local.rawQuery("SELECT day,steps,kcal FROM daily WHERE device=? AND day>=? AND day<?",new String[]{device,window.start.toString(),window.end.toString()})){while(c.moveToNext()){HealthMetricsData.Day d=out.day(LocalDate.parse(c.getString(0)));d.steps=Math.max(d.steps,c.getInt(1));d.calories=Math.max(d.calories,c.getInt(2));}}
        TreeMap<Long,HealthMetricsData.Bin> watchBins=new TreeMap<>();
        try(Cursor c=local.rawQuery("SELECT stamp,body FROM records WHERE device=? AND kind='HEART' AND stamp>=? AND stamp<? ORDER BY stamp",new String[]{device,Long.toString(window.from/1000),Long.toString(window.to/1000)})){
            while(c.moveToNext()){long stamp=c.getLong(0)*1000;HealthProto.Node r=HealthProto.parse(c.getBlob(1));int value=r.number(2,0),type=r.number(4,0);if(value<=0||value>300)continue;HealthMetricsData.Day d=out.day(HealthMetricsData.date(stamp));
                if(type==1){d.rest=value;continue;}if(type==4){d.walk=value;continue;}if(type==5){d.sleepHeart=value;continue;}
                d.range(value,value);if(stamp>=d.latestTime){d.latestTime=stamp;d.latest=value;}if(!window.detail(stamp))continue;long key=HealthTime.bucket(stamp,30,window.zone);
                HealthMetricsData.Bin b=watchBins.get(key);if(b==null){b=new HealthMetricsData.Bin(key);watchBins.put(key,b);}b.add(value,stamp);out.raw.put(stamp,value);
            }
        }
        for(HealthMetricsData.Bin b:watchBins.values()){HealthMetricsData.Bin old=out.bins.get(b.stamp);if(old!=null){b.min=Math.min(b.min,old.min);b.max=Math.max(b.max,old.max);if(old.lastTime>b.lastTime){b.lastTime=old.lastTime;b.last=old.last;}if(old.count>b.count){b.count=old.count;b.sum=old.sum;}}out.bins.put(b.stamp,b);}
        try(Cursor c=local.rawQuery("SELECT stamp,body FROM records WHERE device=? AND kind='ACTIVITY' AND stamp>=? AND stamp<? ORDER BY stamp",new String[]{device,Long.toString(window.detailFrom/1000),Long.toString(window.detailTo/1000)})){
            while(c.moveToNext()){long stamp=c.getLong(0)*1000,key=HealthTime.bucket(stamp,60,window.zone);Long through=officialHours.get(key);
                HealthProto.Node row=HealthProto.parse(c.getBlob(1));int steps=row.number(7,0),calories=row.number(2,0);if(steps>10000||calories>1000000)continue;
                long half=HealthTime.bucket(stamp,30,window.zone);Long halfThrough=officialHalves.get(half);
                if(halfThrough==null||stamp>=halfThrough){int[] h=out.activityHalves.get(half);if(h==null){h=new int[3];out.activityHalves.put(half,h);}h[0]+=steps;h[1]+=calories;h[2]+=row.number(6,0);}
                // OWW251's per-minute activity uses the official non-Watch category threshold (>30 steps).
                if(steps>30)out.moveHours.put(key,1);
                if(through!=null&&stamp<through)continue;
                int[] values=out.activityHours.get(key);if(values==null){values=new int[2];out.activityHours.put(key,values);}values[0]+=steps;values[1]+=calories;
            }
        }
        try(Cursor c=local.rawQuery("SELECT stamp,body FROM records WHERE device=? AND kind='SLEEP' AND stamp>=? AND stamp<? ORDER BY stamp",new String[]{device,Long.toString(window.from/1000),Long.toString(window.to/1000)})){
            while(c.moveToNext()){HealthProto.Node r=HealthProto.parse(c.getBlob(1));int value=r.number(2,0);if(value>0&&value<=100){HealthMetricsData.Day d=out.day(HealthMetricsData.date(c.getLong(0)*1000));d.sleepScore=value;int minutes=r.number(7,0);if(minutes>0&&minutes<=1440)d.sleepMinutes=minutes;
                    int oxygen=r.number(4,0);if(oxygen>0&&oxygen<=100)d.spo2=oxygen;
                    HealthProto.Node heart=r.message(12),breath=r.message(13),hrv=r.message(11);
                    if(heart!=null){if(heart.number(1,0)>0)d.sleepHeart=heart.number(1,0);if(heart.number(2,0)>0){d.sleepHrLow=heart.number(2,0);d.sleepHrHigh=heart.number(3,0);}}
                    if(breath!=null&&breath.number(2,0)>0){d.breathLow=breath.number(2,0);d.breathHigh=breath.number(3,0);}
                    if(hrv!=null&&hrv.number(1,0)>0){d.hrv=hrv.number(1,0);d.hrvLow=hrv.number(2,0);d.hrvHigh=hrv.number(3,0);}}}
        }
        // Stream one sleep day at a time instead of duplicating every minute in multiple history maps.
        TreeMap<Long,Integer> sleepMinutes=new TreeMap<>();LocalDate sleepDate=null;
        try(Cursor c=local.rawQuery("SELECT stamp,body FROM records WHERE device=? AND kind='SLEEP_STAGE' AND stamp>=? AND stamp<? ORDER BY stamp",new String[]{device,Long.toString((window.from-4*3600000L)/1000),Long.toString((window.to-4*3600000L)/1000)})){
            while(c.moveToNext()){long stamp=c.getLong(0)*1000;LocalDate owner=HealthMetricsData.date(stamp+4*3600000L);
                if(sleepDate!=null&&!sleepDate.equals(owner)){sleepDay(out,sleepMinutes,sleepDate,window,officialSleep);sleepMinutes.clear();}sleepDate=owner;
                if(!officialSleep.contains(owner)||window.detail(owner))sleepMinutes.put(stamp,HealthProto.parse(c.getBlob(1)).number(2,0));
            }
        }
        if(sleepDate!=null)sleepDay(out,sleepMinutes,sleepDate,window,officialSleep);
        return out;
    }
    private static void sleepDay(HealthMetricsData out,TreeMap<Long,Integer> minutes,LocalDate date,HealthSnapshotWindow window,Set<LocalDate> official){
        if(!official.contains(date)||window.detail(date))WatchSleepProjection.apply(out,minutes);
        if(!window.detail(date))out.sleepSegments.remove(date);
    }
}
