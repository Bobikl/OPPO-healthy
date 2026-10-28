package com.example.opponotificationrelay;
import android.content.*;import android.database.Cursor;import android.database.sqlite.SQLiteDatabase;
import java.io.*;import java.nio.charset.StandardCharsets;import java.util.*;import java.util.concurrent.atomic.*;import org.json.*;
/** Offline Android regression fixtures. Run under the relay UID; no server access. */
public final class SyncConsistencyProbe {
 static int checks;static void check(boolean b,String code){checks++;if(!b)throw new AssertionError(code);}
 static long scalar(SQLiteDatabase db,String sql){return OfficialHistoryStore.scalar(db,sql);}
 static JSONObject copy(JSONObject row)throws Exception{return new JSONObject(row.toString());}
 static void merge(File root,Context c)throws Exception {
  File first=new File(root,"first.db"),second=new File(root,"second.db");
  try(SQLiteDatabase a=SQLiteDatabase.openOrCreateDatabase(first,null);SQLiteDatabase b=SQLiteDatabase.openOrCreateDatabase(second,null)){
   for(SQLiteDatabase db:new SQLiteDatabase[]{a,b}){db.execSQL("CREATE TABLE DBSportDataStat(_id INTEGER PRIMARY KEY AUTOINCREMENT,ssoid TEXT NOT NULL,date INTEGER NOT NULL,sport_mode INTEGER NOT NULL,total_steps INTEGER,modified_timestamp INTEGER,sync_status INTEGER,updated INTEGER)");db.execSQL("CREATE TABLE unknown(_id INTEGER PRIMARY KEY AUTOINCREMENT,value TEXT)");}
   a.execSQL("INSERT INTO DBSportDataStat VALUES(1,'fixture',20261003,-3,10,100,1,0),(2,'fixture',20261005,-3,50,300,1,0),(3,'fixture',20261006,-3,60,100,0,1)");
   b.execSQL("INSERT INTO DBSportDataStat VALUES(1,'fixture',20261004,-3,40,200,1,0),(9,'fixture',20261003,-3,30,200,1,0),(10,'fixture',20261003,-3,31,250,1,0),(11,'fixture',20261005,-3,99,200,1,0),(12,'fixture',20261006,-3,99,200,1,0)");
   b.execSQL("INSERT INTO unknown VALUES(1,'raw')");List<String> preserved=new ArrayList<>();long[] counts=OfficialHistoryStore.merge(a,second,(p,m)->{},preserved);
   check(counts[0]==1&&counts[1]==1,"BUSINESS_COUNTS");check(scalar(a,"SELECT count(*) FROM DBSportDataStat")==4,"NO_ID_COLLISION");
   check(scalar(a,"SELECT total_steps FROM DBSportDataStat WHERE date=20261003")==31,"LATEST_DUPLICATE");check(scalar(a,"SELECT _id FROM DBSportDataStat WHERE date=20261003")==1,"STABLE_LOCAL_ID");
   check(scalar(a,"SELECT total_steps FROM DBSportDataStat WHERE date=20261005")==50,"PRESERVE_NEWER");check(scalar(a,"SELECT total_steps FROM DBSportDataStat WHERE date=20261006")==60,"PRESERVE_DIRTY");
   check(preserved.equals(Arrays.asList("unknown"))&&scalar(a,"SELECT count(*) FROM unknown")==0,"PRESERVE_UNKNOWN_RAW");
   counts=OfficialHistoryStore.merge(a,second,(p,m)->{});check(counts[0]==0&&counts[1]==0,"REPEAT_DEDUP");OfficialHistoryStore.integrity(a);
  }
 }
 static void queue(Context c)throws Exception {
  CloudStream sport=null,preference=null,group=null;for(CloudStream stream:CloudStream.all(c)){if(stream.table.equals("DBSportDataStat"))sport=stream;if(stream.id.equals("preferences"))preference=stream;if(stream.definition.has("group")&&group==null)group=stream;}
  check(sport!=null&&preference!=null&&group!=null,"ASSET_STREAMS");
  AtomicBoolean allowed=new AtomicBoolean(true);java.lang.reflect.Constructor<CloudCrypto> constructor=CloudCrypto.class.getDeclaredConstructor(String.class);constructor.setAccessible(true);CloudCrypto crypto=constructor.newInstance("0123456789abcdef");
  try(CloudStore store=new CloudStore(c,"fixture",allowed::get)){
   JSONObject seed=new JSONObject().put("date",20261003).put("sportMode",-3).put("totalSteps",100).put("modifiedTimestamp",100);
   store.savePage(sport,new JSONArray().put(seed),100,crypto);File history=new File(OfficialHistoryStore.current(c),"databases/database.db");JSONObject a;
   try(SQLiteDatabase db=SQLiteDatabase.openOrCreateDatabase(history,null)){db.execSQL("UPDATE DBSportDataStat SET sync_status=0");try(Cursor row=db.rawQuery("SELECT * FROM DBSportDataStat",null)){row.moveToFirst();a=sport.fromCursor(row);}}
   store.enqueue(sport,a);List<JSONObject> items=store.pending(sport);check(items.size()==1,"FIRST_REVISION");JSONObject old=items.get(0);store.mutationState(old.getString("id"),"ACKED",101);
   store.enqueue(sport,copy(a).put("totalSteps",200));store.enqueue(sport,a);items=store.pending(sport);check(items.size()==2&&items.get(1).getLong("localRevision")==3,"A_B_A_REVISIONS");
   store.acknowledge(sport,old,102);try(SQLiteDatabase db=SQLiteDatabase.openOrCreateDatabase(history,null)){check(scalar(db,"SELECT sync_status FROM DBSportDataStat")==0,"OLD_ACK_PRESERVES_NEW_DIRTY");}
   store.acknowledge(sport,items.get(1),103);try(SQLiteDatabase db=SQLiteDatabase.openOrCreateDatabase(history,null)){check(scalar(db,"SELECT sync_status FROM DBSportDataStat")==1,"CURRENT_ACK_CONFIRMED");}
   JSONObject next=copy(a).put("totalSteps",300);store.enqueue(sport,next,"fixture-event");int before=store.pending(sport).size();store.enqueue(sport,next,"fixture-event");check(store.pending(sport).size()==before,"SOURCE_EVENT_IDEMPOTENT");
   boolean rejected=false;try{store.enqueue(sport,a,"fixture-event");}catch(IOException failure){rejected="CLOUD_SOURCE_EVENT_CHANGED".equals(failure.getMessage());}check(rejected,"SOURCE_EVENT_IMMUTABLE");
   JSONObject snapshot=new JSONObject().put("settingKey","SLEEP_GOAL").put("settingValue","480");store.savePage(preference,new JSONArray().put(snapshot),4102444800000L,crypto);store.savePage(preference,new JSONArray().put(copy(snapshot).put("settingValue","420")),1,crypto);
   try(SQLiteDatabase db=SQLiteDatabase.openOrCreateDatabase(history,null);Cursor row=db.rawQuery("SELECT preference_value,modified_time FROM DBUserPreference WHERE preference_key='SLEEP_GOAL'",null)){check(row.moveToFirst()&&row.getString(0).equals("420")&&row.getLong(1)<4102444800000L,"SNAPSHOT_CLOCK_INDEPENDENT");}
   long cursor=store.cursor(sport);allowed.set(false);rejected=false;try{store.savePage(sport,new JSONArray().put(copy(seed).put("date",20261004)),200,crypto);}catch(IOException failure){rejected="CLOUD_CANCELLED".equals(failure.getMessage());}check(rejected,"CANCELLED_PAGE_REJECTED");allowed.set(true);check(store.cursor(sport)==cursor,"CANCELLED_CURSOR_UNCHANGED");
   JSONObject definition=copy(group.definition);definition.put("group",new JSONObject().put("array","children"));CloudStream flat=new CloudStream(definition);AtomicInteger serialized=new AtomicInteger();JSONObject parent=new JSONObject(){@Override public String toString(){serialized.incrementAndGet();return super.toString();}};
   JSONArray children=new JSONArray();for(int i=0;i<2000;i++)children.put(new JSONObject().put("value",i));parent.put("children",children).put("metadata","fixture");JSONArray expanded=flat.expanded(new JSONArray().put(parent));check(expanded.length()==2000&&serialized.get()==0,"LINEAR_EXPANSION");
   AtomicInteger calls=new AtomicInteger();rejected=false;try{flat.expanded(new JSONArray().put(parent),()->calls.incrementAndGet()<10);}catch(IOException failure){rejected=true;}check(rejected&&calls.get()==10,"EXPANSION_CANCELLED");
  }
 }
 static void insert(SQLiteDatabase db,String table,ContentValues extra){
  ContentValues values=new ContentValues();try(Cursor columns=db.rawQuery("PRAGMA table_info("+table+")",null)){while(columns.moveToNext()){String name=columns.getString(1),type=columns.getString(2);if(name.equals("_id")&&columns.getInt(5)>0)continue;if(columns.getInt(3)!=0){if(type.equals("TEXT"))values.put(name,"");else values.put(name,0);}}}values.putAll(extra);db.insertOrThrow(table,null,values);
 }
 static void projection(Context c)throws Exception {
  File file=new File(OfficialHistoryStore.current(c),"databases/database.db");String device="00:00:00:00:00:01";java.time.ZoneId zone=java.time.ZoneId.of("Asia/Tokyo");java.time.LocalDate day=java.time.LocalDate.now(zone);long start=day.atStartOfDay(zone).toInstant().toEpochMilli(),end=day.plusDays(1).atStartOfDay(zone).toInstant().toEpochMilli(),from=start-120000,to=start+120000;int date=Integer.parseInt(day.toString().replace("-",""));
  try(SQLiteDatabase db=SQLiteDatabase.openOrCreateDatabase(file,null)){
   ContentValues stat=new ContentValues();stat.put("ssoid","fixture");stat.put("device_unique_id",device);stat.put("date",date);stat.put("fall_asleep",from);stat.put("sleep_out",to);stat.put("total_sleep_time",3);stat.put("modified_timestamp",200);insert(db,"DBSleepDataStatTable",stat);
   for(int i=0;i<4;i++){ContentValues stage=new ContentValues();stage.put("ssoid","fixture");stage.put("device_unique_id",device);stage.put("start_time",from+i*60000);stage.put("end_time",from+(i+1)*60000);stage.put("sleep_state",new int[]{4,2,5,3}[i]);stage.put("display",1);insert(db,"DBSleepTable",stage);}
   ContentValues heart=new ContentValues();heart.put("ssoid","fixture");heart.put("date",date);heart.put("avg_sleep_heart_rate",60);heart.put("min_hr",50);heart.put("max_hr",70);insert(db,"DBSleepHeartRateStat",heart);
   java.util.TimeZone before=java.util.TimeZone.getDefault();JSONObject request=new JSONObject().put("operation","readHealth").put("device",device).put("start",start).put("end",end).put("zone",zone.getId());JSONObject result=RootHealthDataReader.readLocal(db,"fixture",CloudSyncEngine.accountKey("fixture"),request);
   check(java.util.TimeZone.getDefault().getID().equals(before.getID()),"READER_DOES_NOT_CHANGE_DEFAULT_ZONE");check(result.getJSONArray("sleepNight").length()==1&&result.getJSONArray("sleepNight").getJSONArray(0).getLong(1)==from,"CLOUD_SLEEP_NIGHT_INTERVAL");check(result.getJSONArray("sleepSegments").length()==4&&result.getJSONArray("sleepSegments").getJSONArray(2).getInt(2)==4,"CLOUD_SLEEP_STAGES_AND_AWAKE");check(result.getJSONArray("sleepIndex").length()==1&&result.getJSONArray("sleepIndex").getJSONArray(0).getInt(2)==60,"CLOUD_SLEEP_HEART_FALLBACK");
   long earliest=java.time.LocalDate.of(2019,1,1).atStartOfDay(zone).toInstant().toEpochMilli();RootHealthDataReader.readLocal(db,"fixture",CloudSyncEngine.accountKey("fixture"),copy(request).put("start",earliest).put("end",earliest+86400000));check(true,"TOKYO_2019_BOUNDARY");
  }
  try(SQLiteDatabase db=SQLiteDatabase.openOrCreateDatabase(file,null)){
   ContentValues weight=new ContentValues();weight.put("ssoid","fixture");weight.put("user_tag_id","fixture");weight.put("measurement_timestamp",start-100*86400000L);weight.put("weight","65000");weight.put("weight_id","fixture-old-weight");insert(db,"DBWeightBodyFatTable",weight);
   JSONObject request=new JSONObject().put("operation","readHealth").put("device",device).put("start",start).put("end",end).put("zone",zone.getId());JSONObject result=RootHealthDataReader.readLocal(db,"fixture",CloudSyncEngine.accountKey("fixture"),request);check(result.getJSONArray("weightRows").length()==0&&result.getJSONArray("latestWeight").length()==1,"WEIGHT_PREDECESSOR_OUTSIDE_WINDOW");
  }
  HealthMetricsStore details=HealthMetricsStore.get(c);SQLiteDatabase cache=details.getWritableDatabase();cache.execSQL("INSERT INTO scopes(device,scope,read_at,revision,zone) VALUES(?,?,1,1,?)",new Object[]{device,CloudSyncEngine.accountKey("fixture"),java.time.ZoneId.systemDefault().getId()});
  java.time.ZoneId localZone=java.time.ZoneId.systemDefault();java.time.LocalDate home=java.time.LocalDate.now();long homeStart=home.minusDays(62).atStartOfDay(localZone).toInstant().toEpochMilli(),homeEnd=home.plusDays(1).atStartOfDay(localZone).toInstant().toEpochMilli();
  try(SQLiteDatabase db=SQLiteDatabase.openOrCreateDatabase(file,null)){JSONObject full=RootHealthDataReader.readLocal(db,"fixture",CloudSyncEngine.accountKey("fixture"),new JSONObject().put("operation","readHealth").put("device",device).put("start",homeStart).put("end",homeEnd).put("zone",localZone.getId()));details.save(device,full,false);}
  HealthMetricsData homeData=details.load(c,device,new HealthSnapshotWindow(home.minusDays(62),home.plusDays(1),home));Map.Entry<Long,Integer> latest=homeData.weights.floorEntry(homeEnd-1);check(latest!=null&&latest.getValue()==65000&&latest.getKey()<homeStart,"WEIGHT_PREDECESSOR_REACHES_HOME_CARD");
  java.time.LocalDate current=java.time.LocalDate.now();long minute=current.atStartOfDay(java.time.ZoneId.systemDefault()).plusHours(12).toInstant().toEpochMilli();HealthProto.Node row=HealthProto.numbers(1,0).withBytes(2,new byte[]{0,(byte)(30<<2)}).withBytes(3,new byte[]{(byte)((98-69)<<3),(byte)((94-69)<<3)});
  SQLiteDatabase archive=HealthArchive.get(c).getWritableDatabase();check(archive.getPath().equals(c.getDatabasePath("health-archive.db").getPath())&&cache.getPath().equals(c.getDatabasePath("health-details.db").getPath()),"HELPERS_USE_ISOLATED_DATABASES");archive.execSQL("INSERT INTO records(device,kind,stamp,received_at,origin_start,source_end,body) VALUES(?,'OXYGEN',?,1,?,?,?)",new Object[]{device,minute/1000,minute/1000,minute/1000,row.encode()});
  HealthMetricsData data=details.load(c,device,new HealthSnapshotWindow(current,current.plusDays(1),current));HealthMetricsData.Day today=data.find(current);check(today!=null&&today.oxygenCount==2&&today.oxygenMean==96&&today.oxygenLatest==94,"NATIVE_OXYGEN_VISIBLE");check(data.oxygen.size()==2,"NATIVE_OXYGEN_CHART");Map<java.time.LocalDate,Float> dates=new HashMap<>();LocalHealthCalendar.read(c,device,"oxygen",java.time.ZoneId.systemDefault(),dates);check(dates.containsKey(current),"NATIVE_OXYGEN_CALENDAR");details.close();HealthArchive.get(c).close();
 }
 static void overlay(Context c)throws Exception {
  SharedPreferences prefs=c.getSharedPreferences("sleep_habits_v1",0);String key="fixture-watch:fixture-scope";
  JSONObject initial=new JSONObject().put("goal",420).put("bedOn",0).put("bedTime",1320),saved=new JSONObject().put("goal",480).put("bedOn",1).put("bedTime",1260);
  prefs.edit().putString(key+":fields",new JSONObject().put("goal",new JSONObject().put("value",480).put("revision","fixture-revision")).toString()).commit();
  JSONObject value=SleepHabitsRepository.overlay(prefs,key,initial,saved.toString());check(value.getInt("goal")==480&&value.getInt("bedOn")==0&&value.getInt("bedTime")==1320,"ONLY_EDITED_FIELD_OVERRIDES");
  check(CloudPreferences.changes("bedOn",saved).keySet().equals(Collections.singleton("BED_TIME_SWITCH")),"BED_SWITCH_DOES_NOT_QUEUE_TIME");check(CloudPreferences.changes("bedTime",saved).keySet().equals(Collections.singleton("BED_TIME")),"BED_TIME_DOES_NOT_QUEUE_SWITCH");
  JSONObject recovery=SleepHabitsRepository.baseline(new JSONObject().put("SLEEP_GOAL","800"));prefs.edit().putString("fixture-watch:old-scope",recovery.toString()).putString("fixture-watch:old-scope:pending","fixture-journal").commit();check(SleepHabitsRepository.cachedRecovery(prefs,"fixture-watch","old-scope").getInt("goal")==800,"RECOVERY_WITHOUT_NEW_DATABASE_SCOPE");check(SleepHabitsRepository.cachedRecovery(prefs,"fixture-other-watch","old-scope")==null,"RECOVERY_DEVICE_SCOPED");
  SleepHabitsRepository.overlay(prefs,key,copy(initial).put("goal",480),saved.toString());check(new JSONObject(prefs.getString(key+":fields","{}")).length()==0,"CONFIRMED_OVERLAY_RETIRED");
 }
 public static void main(String[] args)throws Exception {
  android.os.Looper.prepareMainLooper();Class<?> at=Class.forName("android.app.ActivityThread");Object thread=at.getMethod("systemMain").invoke(null);Context system=(Context)at.getMethod("getSystemContext").invoke(thread);Context base=system.createPackageContext("com.example.opponotificationrelay",Context.CONTEXT_IGNORE_SECURITY);
  File root=new File(base.getCacheDir(),"sync-fixture-"+UUID.randomUUID());if(!root.mkdirs())throw new IOException("FIXTURE_DIRECTORY");String prefix="sync-fixture-"+UUID.randomUUID();Set<String> prefsNames=new HashSet<>();
  Context test=new ContextWrapper(base){public Context getApplicationContext(){return this;}public File getFilesDir(){return root;}public File getNoBackupFilesDir(){return root;}public File getDatabasePath(String name){return new File(root,name);}public SQLiteDatabase openOrCreateDatabase(String name,int mode,SQLiteDatabase.CursorFactory factory){return openOrCreateDatabase(name,mode,factory,null);}public SQLiteDatabase openOrCreateDatabase(String name,int mode,SQLiteDatabase.CursorFactory factory,android.database.DatabaseErrorHandler handler){int flags=SQLiteDatabase.CREATE_IF_NECESSARY;if((mode&Context.MODE_ENABLE_WRITE_AHEAD_LOGGING)!=0)flags|=SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING;return SQLiteDatabase.openDatabase(getDatabasePath(name).getPath(),factory,flags,handler);}public SharedPreferences getSharedPreferences(String name,int mode){prefsNames.add(prefix+name);return super.getSharedPreferences(prefix+name,mode);}public Object getSystemService(String name){if(Context.JOB_SCHEDULER_SERVICE.equals(name))return null;return super.getSystemService(name);}};
  try{
   merge(root,test);queue(test);overlay(test);projection(test);
   // Logout still revokes a broken session even when configuration recovery fails.
   try(FileOutputStream out=new FileOutputStream(new File(root,"health-account-session.bin"))){out.write(new byte[]{0});}
   long operation=HealthAccountStore.begin();try{HealthAccountStore.clear(test,operation);}catch(NullPointerException noScheduler){}
   check(!HealthAccountStore.exists(test)&&HealthAccountStore.load(test)==null,"BROKEN_SESSION_REVOKED");long next=HealthAccountStore.begin();boolean stale=false;try{HealthAccountStore.clear(test,operation);}catch(IOException failure){stale=true;}check(stale&&HealthAccountStore.valid(next),"OLD_LOGOUT_CANNOT_REVOKE_NEW_OPERATION");
   AccountSdk.silence(test);for(String name:new String[]{"com.oplus.aiunit.vision.ih","com.oplus.accountsdk.service.account.trace.AcIdTraceManager"}){Class<?> type=Class.forName(name);Object helper=type.getMethod(name.endsWith(".ih")?"b":"getInstance",Context.class).invoke(null,test);Class<?> superclass=helper.getClass();while(superclass!=null&&!superclass.getSimpleName().equals("AcBaseTraceHelper"))superclass=superclass.getSuperclass();java.lang.reflect.Field enabled=superclass.getDeclaredField("mTraceEnable");enabled.setAccessible(true);check(!enabled.getBoolean(helper),"SDK_TRACE_DISABLED");}
   System.out.println("SYNC_CONSISTENCY PASS checks="+checks+" offline=true");
  }finally{OfficialHistoryStore.remove(root);for(String name:prefsNames)base.deleteSharedPreferences(name);}
  System.exit(0);
 }
}