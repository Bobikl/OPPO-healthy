package com.example.opponotificationrelay;

import android.content.*;
import android.database.Cursor;
import android.database.sqlite.*;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.*;
import org.json.*;

/** App-private durable archive. Packet bytes retain every field, including unknown firmware fields. */
final class HealthArchive extends SQLiteOpenHelper {
    private static HealthArchive instance;
    static synchronized HealthArchive get(Context c){if(instance==null)instance=new HealthArchive(c.getApplicationContext());return instance;}
    private HealthArchive(Context c){super(c,"health-archive.db",null,3);setWriteAheadLoggingEnabled(true);}
    @Override public void onConfigure(SQLiteDatabase db){super.onConfigure(db);db.execSQL("PRAGMA synchronous=FULL");}
    @Override public void onCreate(SQLiteDatabase db){
        db.execSQL("CREATE TABLE packets(device TEXT NOT NULL,kind TEXT NOT NULL,hash TEXT NOT NULL,request_start INTEGER,request_end INTEGER,response_start INTEGER,response_end INTEGER,received_at INTEGER NOT NULL,body BLOB NOT NULL,PRIMARY KEY(device,kind,hash))");
        db.execSQL("CREATE TABLE records(device TEXT NOT NULL,kind TEXT NOT NULL,stamp INTEGER NOT NULL,received_at INTEGER NOT NULL,origin_start INTEGER NOT NULL,source_end INTEGER NOT NULL,body BLOB NOT NULL,PRIMARY KEY(device,kind,stamp))");
        db.execSQL("CREATE TABLE daily(device TEXT NOT NULL,day TEXT NOT NULL,stamp INTEGER,steps INTEGER,kcal INTEGER,minutes INTEGER,moves INTEGER,step_goal INTEGER,kcal_goal INTEGER,minute_goal INTEGER,move_goal INTEGER,source_end INTEGER NOT NULL,saved_at INTEGER NOT NULL,PRIMARY KEY(device,day))");
        db.execSQL("CREATE TABLE cursors(device TEXT NOT NULL,kind TEXT NOT NULL,through INTEGER NOT NULL,PRIMARY KEY(device,kind))");
        createGoalSchema(db);createOfficialActivity(db);
        db.execSQL("CREATE INDEX packets_time ON packets(device,received_at)");
    }
    private static void createGoalSchema(SQLiteDatabase db){db.execSQL("CREATE TABLE IF NOT EXISTS goal_schema(device TEXT PRIMARY KEY,verified_at INTEGER NOT NULL)");}
    private static void createOfficialActivity(SQLiteDatabase db){
        db.execSQL("CREATE TABLE IF NOT EXISTS official_activity(scope TEXT NOT NULL,device TEXT NOT NULL,day TEXT NOT NULL,body TEXT NOT NULL,saved_at INTEGER NOT NULL,PRIMARY KEY(scope,device,day))");
        db.execSQL("CREATE TABLE IF NOT EXISTS official_activity_scope(device TEXT PRIMARY KEY,scope TEXT NOT NULL)");
    }
    @Override public void onUpgrade(SQLiteDatabase db,int oldVersion,int newVersion){if(oldVersion>=1&&oldVersion<3&&newVersion==3){if(oldVersion<2)createGoalSchema(db);createOfficialActivity(db);}else throw new IllegalStateException("Archive migration required");}
    private boolean goalSchema(SQLiteDatabase db,String device){try(Cursor c=db.rawQuery("SELECT 1 FROM goal_schema WHERE device=?",new String[]{device})){return c.moveToFirst();}}
    private void repairGoals(SQLiteDatabase db,String device)throws IOException{
        try(Cursor c=db.rawQuery("SELECT stamp,body FROM records WHERE device=? AND kind='ACTIVITY_SUMMARY'",new String[]{device})){
            while(c.moveToNext()){
                int[] goals=DailyActivityData.wireGoals(HealthProto.parse(c.getBlob(1)));if(goals==null)continue;
                ContentValues v=new ContentValues();v.put("step_goal",goals[0]);v.put("kcal_goal",goals[1]);v.put("minute_goal",goals[2]);v.put("move_goal",goals[3]);
                db.update("daily",v,"device=? AND day=?",new String[]{device,DailyActivityData.day(c.getInt(0))});
            }
        }
    }
    static String device(String mac)throws IOException{if(mac==null||!mac.matches("(?i)[0-9a-f]{2}(:[0-9a-f]{2}){5}"))throw new IOException("SYNC_NO_DEVICE");return mac.toUpperCase(Locale.ROOT);}
    static String hash(byte[] bytes){try{byte[] d=MessageDigest.getInstance("SHA-256").digest(bytes);StringBuilder s=new StringBuilder();for(byte b:d)s.append(String.format(Locale.ROOT,"%02x",b&255));return s.toString();}catch(Exception e){throw new IllegalStateException(e);}}
    /** Archive and projections commit together. A cursor is only advanced after the entire window succeeds. */
    void save(String mac,HealthSyncProtocol.Request request,byte[] bytes,Map<HealthSetting,Integer> goals)throws IOException{
        String device=device(mac);HealthSyncProtocol.Summary summary=HealthSyncProtocol.parse(request,bytes);
        List<HealthProto.Node> rows=HealthProto.parse(bytes).messages(4);long now=System.currentTimeMillis();SQLiteDatabase db=getWritableDatabase();db.beginTransaction();
        try{
            boolean verifiedGoals=goalSchema(db,device);
            if(!verifiedGoals && request.kind==HealthSyncProtocol.Kind.ACTIVITY_SUMMARY){
                for(HealthProto.Node row:rows)if(DailyActivityData.day(row.number(1,0)).equals(java.time.LocalDate.now().toString()) && DailyActivityData.wireGoalsMatch(row,goals)){
                    ContentValues schema=new ContentValues();schema.put("device",device);schema.put("verified_at",now);db.insertOrThrow("goal_schema",null,schema);verifiedGoals=true;repairGoals(db,device);break;
                }
            }
            ContentValues p=new ContentValues();p.put("device",device);p.put("kind",request.kind.name());p.put("hash",hash(bytes));p.put("request_start",request.start);p.put("request_end",request.end);p.put("response_start",summary.start);p.put("response_end",summary.end);p.put("received_at",now);p.put("body",bytes);
            db.insertWithOnConflict("packets",null,p,SQLiteDatabase.CONFLICT_IGNORE);
            for(HealthProto.Node row:rows){
                int stamp=request.kind.daily()?row.number(1,0):summary.start+row.number(1,0)*(request.kind==HealthSyncProtocol.Kind.HEART?1:60);
                ContentValues r=new ContentValues();r.put("device",device);r.put("kind",request.kind.name());r.put("stamp",stamp);r.put("received_at",now);r.put("origin_start",summary.start);r.put("source_end",summary.end);r.put("body",row.encode());
                try(Cursor previous=db.rawQuery("SELECT source_end FROM records WHERE device=? AND kind=? AND stamp=?",new String[]{device,request.kind.name(),String.valueOf(stamp)})){
                    if(!previous.moveToFirst() || previous.getInt(0)<=summary.end)db.insertWithOnConflict("records",null,r,SQLiteDatabase.CONFLICT_REPLACE);
                }
                if(request.kind==HealthSyncProtocol.Kind.ACTIVITY_SUMMARY){
                    DailyActivityData d=DailyActivityData.parse(row,goals,now,verifiedGoals);String day=DailyActivityData.day(d.timestamp);
                    // Backfill may contain an older snapshot of today's totals. Keep the latest observation.
                    try(Cursor previous=db.rawQuery("SELECT source_end FROM daily WHERE device=? AND day=?",new String[]{device,day})){
                        if(previous.moveToFirst() && previous.getInt(0)>summary.end)continue;
                    }
                    boolean today=day.equals(java.time.LocalDate.now().toString()) || (verifiedGoals && DailyActivityData.wireGoals(row)!=null);
                    DailyActivityData old=daily(db,device,day);
                    ContentValues v=new ContentValues();v.put("device",device);v.put("day",day);v.put("stamp",d.timestamp);v.put("steps",d.steps);v.put("kcal",d.calories);v.put("minutes",d.minutes);v.put("moves",d.moves);
                    v.put("step_goal",today&&d.stepGoal>0?d.stepGoal:old==null?-1:old.stepGoal);v.put("kcal_goal",today&&d.calorieGoal>0?d.calorieGoal:old==null?-1:old.calorieGoal);v.put("minute_goal",today&&d.minuteGoal>0?d.minuteGoal:old==null?-1:old.minuteGoal);v.put("move_goal",today&&d.moveGoal>0?d.moveGoal:old==null?-1:old.moveGoal);v.put("source_end",summary.end);v.put("saved_at",now);
                    db.insertWithOnConflict("daily",null,v,SQLiteDatabase.CONFLICT_REPLACE);
                }
            }
            db.setTransactionSuccessful();
        }finally{db.endTransaction();}
    }
    private DailyActivityData daily(SQLiteDatabase db,String device,String day){
        try(Cursor c=db.rawQuery("SELECT stamp,steps,kcal,minutes,moves,step_goal,kcal_goal,minute_goal,move_goal,saved_at FROM daily WHERE device=? AND day=?",new String[]{device,day})){
            return c.moveToFirst()?new DailyActivityData(c.getInt(0),c.getInt(1),c.getInt(2),c.getInt(3),c.getInt(4),c.getInt(5),c.getInt(6),c.getInt(7),c.getInt(8),c.getLong(9)):null;
        }
    }
    DailyActivityData daily(String mac,String day)throws IOException{
        SQLiteDatabase db=getReadableDatabase();String device=device(mac);DailyActivityData watch=daily(db,device,day),official=null;
        try(Cursor c=db.rawQuery("SELECT a.body,a.saved_at FROM official_activity a JOIN official_activity_scope s ON a.scope=s.scope AND a.device=s.device WHERE a.device=? AND a.day=?",new String[]{device,day})){
            if(c.moveToFirst()){JSONArray v=new JSONObject(c.getString(0)).getJSONArray("values");int stamp=(int)java.time.LocalDate.parse(day).atStartOfDay(java.time.ZoneId.systemDefault()).toEpochSecond();
                official=new DailyActivityData(stamp,v.getInt(0),(int)(v.getLong(1)/1000),v.getInt(2),v.getInt(3),v.getInt(4),(int)(v.getLong(5)/1000),v.getInt(6),v.getInt(7),c.getLong(1));}
        }catch(JSONException e){throw new IOException("ACTIVITY_CACHE",e);}
        if(watch==null)return official;if(official==null)return watch;
        // The official DAO uses maxima for cumulative values across local sources.
        return new DailyActivityData(watch.timestamp,Math.max(watch.steps,official.steps),Math.max(watch.calories,official.calories),Math.max(watch.minutes,official.minutes),Math.max(watch.moves,official.moves),
            watch.stepGoal>0?watch.stepGoal:official.stepGoal,watch.calorieGoal>0?watch.calorieGoal:official.calorieGoal,watch.minuteGoal>0?watch.minuteGoal:official.minuteGoal,watch.moveGoal>0?watch.moveGoal:official.moveGoal,Math.max(watch.savedAt,official.savedAt));
    }
    JSONArray watchActivity(String mac)throws Exception {
        JSONArray rows=new JSONArray();try(Cursor c=getReadableDatabase().rawQuery("SELECT day,steps,kcal,minutes,moves,step_goal,kcal_goal,minute_goal,move_goal FROM daily WHERE device=? ORDER BY day DESC LIMIT 31",new String[]{device(mac)})){
            while(c.moveToNext()){JSONArray v=new JSONArray();for(int i=1;i<=8;i++){long n=Math.max(0,c.getLong(i));v.put(i==2||i==6?n*1000:n);}rows.put(new JSONObject().put("date",Integer.parseInt(c.getString(0).replace("-",""))).put("values",v));}
        }return rows;
    }
    int importOfficialActivity(String mac,JSONObject result)throws Exception {
        String device=device(mac),scope=result.getString("scope");if(!scope.matches("[a-f0-9]{64}"))throw new IOException("ACTIVITY_SCOPE");JSONArray rows=result.getJSONArray("rows");if(rows.length()>5000)throw new IOException("ACTIVITY_LIMIT");
        SQLiteDatabase db=getWritableDatabase();Set<String> seen=new HashSet<>();db.beginTransaction();try{
            for(int i=0;i<rows.length();i++){JSONObject row=rows.getJSONObject(i);int date=row.getInt("date");JSONArray values=row.getJSONArray("values");long[] v=new long[8];if(values.length()!=8)throw new IOException("ACTIVITY_VALUES");for(int j=0;j<8;j++)v[j]=values.getLong(j);ActivityBridgePolicy.valid(date,v);
                String day=java.time.LocalDate.of(date/10000,(date/100)%100,date%100).toString();if(!seen.add(day))throw new IOException("ACTIVITY_DUPLICATE");ContentValues value=new ContentValues();value.put("scope",scope);value.put("device",device);value.put("day",day);value.put("body",row.toString());value.put("saved_at",System.currentTimeMillis());db.insertWithOnConflict("official_activity",null,value,SQLiteDatabase.CONFLICT_REPLACE);
            }
            ContentValues active=new ContentValues();active.put("device",device);active.put("scope",scope);db.insertWithOnConflict("official_activity_scope",null,active,SQLiteDatabase.CONFLICT_REPLACE);db.setTransactionSuccessful();return rows.length();
        }finally{db.endTransaction();}
    }
    List<String> days(String mac)throws IOException{List<String> out=new ArrayList<>();try(Cursor c=getReadableDatabase().rawQuery("SELECT day FROM daily WHERE device=? ORDER BY day DESC LIMIT 366",new String[]{device(mac)})){while(c.moveToNext())out.add(c.getString(0));}return out;}
    int cursor(String mac,HealthSyncProtocol.Kind kind,int initial)throws IOException{
        try(Cursor c=getReadableDatabase().rawQuery("SELECT through FROM cursors WHERE device=? AND kind=?",new String[]{device(mac),kind.name()})){return c.moveToFirst()?c.getInt(0):initial;}
    }
    void ensureCursor(String mac,HealthSyncProtocol.Kind kind,int initial)throws IOException{
        ContentValues v=new ContentValues();v.put("device",device(mac));v.put("kind",kind.name());v.put("through",initial);getWritableDatabase().insertWithOnConflict("cursors",null,v,SQLiteDatabase.CONFLICT_IGNORE);
    }
    void advance(String mac,HealthSyncProtocol.Kind kind,int through)throws IOException{
        ContentValues v=new ContentValues();v.put("device",device(mac));v.put("kind",kind.name());v.put("through",through);getWritableDatabase().insertWithOnConflict("cursors",null,v,SQLiteDatabase.CONFLICT_REPLACE);
    }
    long[] counts(String mac)throws IOException{String device=device(mac);long[] out=new long[2];int i=0;for(String table:new String[]{"packets","records"})try(Cursor c=getReadableDatabase().rawQuery("SELECT count(*) FROM "+table+" WHERE device=?",new String[]{device})){c.moveToFirst();out[i++]=c.getLong(0);}return out;}
}