package com.example.opponotificationrelay;
import android.content.*;import android.database.Cursor;import android.database.sqlite.SQLiteDatabase;
import java.io.*;import java.util.*;import java.util.concurrent.atomic.AtomicBoolean;import org.json.*;
/** Offline Android upload pipeline fixtures; all HTTP calls are simulated. */
public final class CloudUploadProbe {
 static int checks;
 static void check(boolean value,String name){checks++;if(!value)throw new AssertionError(name);if(checks%5==0)System.out.println("UPLOAD_VERIFY {\"stage\":\"offline-progress\",\"checks\":"+checks+"}");}
 static JSONObject row(int date,int steps)throws Exception{return new JSONObject().put("date",date).put("sportMode",-3).put("totalSteps",steps);}
 static String clientFixtureLayer(String value)throws Exception{byte[] iv=new byte[16];javax.crypto.Cipher cipher=javax.crypto.Cipher.getInstance("AES/CTR/NoPadding");cipher.init(javax.crypto.Cipher.ENCRYPT_MODE,new javax.crypto.spec.SecretKeySpec("0123456789abcdef".getBytes(java.nio.charset.StandardCharsets.UTF_8),"AES"),new javax.crypto.spec.IvParameterSpec(iv));return android.util.Base64.encodeToString(OafCrypto.concat(iv,cipher.doFinal(value.getBytes(java.nio.charset.StandardCharsets.UTF_8))),android.util.Base64.NO_WRAP);}
 static final class Fake implements CloudUpload.Remote {
  final CloudStore store;final CloudStream stream;JSONObject value;int sends;long version=100;
  boolean timeout,missing,mismatch,notSent;AtomicBoolean allowed;
  Fake(CloudStore store,CloudStream stream){this.store=store;this.stream=stream;}
  public void check()throws Exception{store.check();}
  public void refresh()throws Exception{if(value!=null&&!missing)store.saveReceipt(stream,new JSONArray().put(value),version,null);}
  public JSONObject send(JSONObject payload)throws Exception{
   if(notSent)throw new CloudHttp.NotSent(new java.net.UnknownHostException());
   sends++;value=new JSONObject(payload.toString()).put("modifiedTime",++version);if(mismatch)value.put("totalSteps",value.getInt("totalSteps")+1);
   if(timeout)throw new java.net.SocketTimeoutException();
   return new JSONObject().put("body",new JSONObject().put("modifiedTime",version));
  }
  public void receipt(long version)throws Exception{refresh();}
 }
 static void pipeline(Context c)throws Exception {
  CloudStream stream=null;for(CloudStream s:CloudStream.all(c))if(s.id.equals("activity-stat"))stream=s;
  AtomicBoolean allowed=new AtomicBoolean(true);
  try(CloudStore store=new CloudStore(c,"fixture",allowed::get)){
   Fake remote=new Fake(store,stream);JSONObject a=row(20261007,123);
   store.enqueue(stream,a,"event-A");CloudUpload.Result first=CloudUpload.synchronize(store,stream,remote,10);
   check(first.confirmed==1&&remote.sends==1&&store.pendingCount(stream)==0,"NEW_UPLOAD_SERVER_READBACK_ACK");
   check(store.cursor(stream)==0,"RECEIPT_CANNOT_ADVANCE_DOWNLOAD_CURSOR");
   check(store.remote(stream,a).getInt("totalSteps")==123,"CONFIRMED_LOCAL_MERGE");
   store.enqueue(stream,a,"event-A");check(store.pendingCount(stream)==0,"SOURCE_REPLAY_NO_REUPLOAD");
   store.enqueue(stream,row(20261007,234),"event-B");remote.timeout=true;boolean failed=false;
   try{CloudUpload.synchronize(store,stream,remote,10);}catch(java.net.SocketTimeoutException expected){failed=true;}
   check(failed&&store.pending(stream).get(0).getString("state").equals("ACK_UNKNOWN"),"TIMEOUT_PERSISTS_UNKNOWN");
   int sentBefore=remote.sends;remote.timeout=false;CloudUpload.Result recovered=CloudUpload.synchronize(store,stream,remote,10);
   check(recovered.confirmed==1&&remote.sends==sentBefore,"UNKNOWN_RECOVERY_READBACK_WITHOUT_RESEND");
   store.enqueue(stream,row(20261007,345),"event-C");remote.timeout=true;remote.missing=true;
   try{CloudUpload.synchronize(store,stream,remote,10);}catch(java.net.SocketTimeoutException expected){}
   sentBefore=remote.sends;remote.timeout=false;CloudUpload.Result unknown=CloudUpload.synchronize(store,stream,remote,10);
   check(unknown.waiting==1&&remote.sends==sentBefore,"MISSING_UNKNOWN_RECEIPT_DOES_NOT_RESEND");
   remote.missing=false;CloudUpload.synchronize(store,stream,remote,10);
   store.enqueue(stream,row(20261007,456),"event-D");remote.value=row(20261007,999).put("modifiedTime",++remote.version);sentBefore=remote.sends;
   CloudUpload.Result conflict=CloudUpload.synchronize(store,stream,remote,10);
   check(conflict.conflicts==1&&remote.sends==sentBefore,"REMOTE_CHANGE_BLOCKS_LOCAL_OVERWRITE");
   store.enqueue(stream,row(20261008,567),"event-E");remote.value=null;remote.mismatch=true;
   CloudUpload.Result rejected=CloudUpload.synchronize(store,stream,remote,10);
   check(rejected.waiting==1&&store.pendingCount(stream)==1,"HTTP_SUCCESS_WITH_WRONG_RECORD_NOT_ACKED");
   JSONObject expected=row(20261008,567);check(!stream.sameBusiness(expected,row(20261008,568)),"BUSINESS_VALUE_COMPARE");
   check(!stream.sameBusiness(expected,row(20261009,567)),"BUSINESS_IDENTITY_COMPARE");
   check(CloudUpload.receiptVersion(new JSONObject().put("body",new JSONObject().put("modifiedTimestamp",789)))==789,"SERVER_MODIFIED_TIMESTAMP_RECEIPT");
   check(CloudUpload.receiptVersion(new JSONObject().put("body","success"))==0,"GENERIC_SUCCESS_NOT_VERSION");
   allowed.set(false);failed=false;try{store.acknowledge(stream,store.pending(stream).get(0),890);}catch(IOException cancelled){failed=true;}
   check(failed,"CANCELLED_RUN_CANNOT_ACK");allowed.set(true);
   for(String name:new String[]{"mental","wrist","sunshine","sunshine-stat"})for(CloudStream group:CloudStream.all(c))if(group.id.equals(name)){
    JSONObject raw=new JSONObject().put("dataClient","01:02:03:04:05:06").put("clientModel","OWW251").put("display",1).put("value",60).put("dataCreatedTimestamp",1700000000000L).put("startTimestamp",1700000000000L).put("endTimestamp",1700000060000L).put("type",1).put("stress",20).put("stressState",2).put("confidence",3).put("status",1).put("baseLine",10).put("lightIntensity",50).put("sunBathing",1).put("vitaminDIngestion",4).put("date",20261007).put("totalDuration",10).put("targetDuration",20).put("vitaminD",30).put("avgVD",3).put("goalComplete",0).put("favoriteTime",2).put("sunshineType",1).put("vitaminDIngestionTime",1700000000000L);
    JSONObject restored=group.expanded(new JSONArray().put(group.uploadPlainRow(raw))).getJSONObject(0);
    check(group.sameBusiness(raw,restored),"GROUP_ROUNDTRIP_"+name);
    if(name.equals("sunshine-stat"))check(!restored.has("favoriteTime")&&!restored.has("vitaminDIngestion"),"GROUP_LOCAL_DERIVED_FIELDS_EXCLUDED");
   }
   // Imported dirty flags cannot rebase old values onto the latest server version.
   JSONObject old=row(20261010,10).put("modifiedTime",1),fresh=row(20261010,20).put("modifiedTime",500);
   store.saveReceipt(stream,new JSONArray().put(fresh),500,null);store.enqueue(stream,old);
   check(store.conflictCount(stream)==2,"LEGACY_OLDER_VERSION_BLOCKED_AT_ENQUEUE");
   // Old pending queues receive the same protection after schema migration.
   JSONObject migrated=row(20261011,30).put("modifiedTime",1),newer=row(20261011,40).put("modifiedTime",600);
   store.saveReceipt(stream,new JSONArray().put(newer),600,null);store.enqueue(stream,migrated,"migrated-queue");
   try(SQLiteDatabase db=SQLiteDatabase.openDatabase(c.getDatabasePath("cloud-journal-v1.db").getPath(),null,SQLiteDatabase.OPEN_READWRITE)){db.execSQL("UPDATE mutations_v2 SET source_kind='legacy' WHERE source_event='migrated-queue'");}
   remote.value=null;remote.mismatch=false;sentBefore=remote.sends;CloudUpload.synchronize(store,stream,remote,10);
   check(store.conflictCount(stream)==3&&remote.sends==sentBefore,"MIGRATED_OLD_PENDING_CANNOT_OVERWRITE");
   JSONObject dns=row(20261012,50);store.enqueue(stream,dns,"dns-before-write");remote.notSent=true;failed=false;
   try{CloudUpload.synchronize(store,stream,remote,10);}catch(CloudHttp.NotSent expectedFailure){failed=true;}
   boolean ready=false;for(JSONObject mutation:store.pending(stream))if(mutation.getString("sourceEventId").equals("dns-before-write"))ready=mutation.getString("state").equals("READY");
   check(failed&&ready,"DNS_BEFORE_WRITE_REMAINS_RETRYABLE");remote.notSent=false;
   // Successful OAF authentication must survive harmless JSON formatting differences.
   SharedPreferences credentials=RelayConfig.getPrefs(c);JSONObject pairing=new JSONObject().put("schema",2).put("uuidType",1).put("transport",2).put("mac","01:02:03:04:05:06").put("ksc",android.util.Base64.encodeToString(new byte[16],android.util.Base64.NO_WRAP)).put("localDeviceId",android.util.Base64.encodeToString(new byte[6],android.util.Base64.NO_WRAP)).put("kscAlias",android.util.Base64.encodeToString(new byte[6],android.util.Base64.NO_WRAP));
   credentials.edit().putString("target_mac",pairing.getString("mac")).putString("oaf_credentials",pairing.toString(2)).commit();RelayConfig.markCredentialsVerified(c,pairing);
   check(credentials.getLong("credentials_verified_at",0)>0,"AUTH_MARKER_USES_CREDENTIAL_VALUES_NOT_JSON_FORMAT");
   credentials.edit().remove("credentials_verified_at").commit();JSONObject changed=new JSONObject(pairing.toString()).put("ksc",android.util.Base64.encodeToString(new byte[]{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},android.util.Base64.NO_WRAP));RelayConfig.markCredentialsVerified(c,changed);
   check(credentials.getLong("credentials_verified_at",0)==0,"AUTH_MARKER_REJECTS_CHANGED_KEY");
   credentials.edit().putString("target_mac","01:02:03:04:05:07").commit();RelayConfig.markCredentialsVerified(c,pairing);
   check(credentials.getLong("credentials_verified_at",0)==0,"LATE_AUTH_CANNOT_VERIFY_CHANGED_TARGET");
   byte[] point=HealthProto.numbers(1,0,2,75,3,2,4,1).encode();
   JSONObject heart=CloudNativeProjection.project("heart","fixture","01:02:03:04:05:06",1700000000L,1700000001000L,point,"Asia/Singapore","OWW251");
   check(heart.getInt("heartRateValue")==75&&heart.getInt("heartRateType")==1&&heart.getInt("reliability")==2&&heart.getLong("dataCreatedTimestamp")==1700000000000L,"NATIVE_HEART_FULL_FIELDS_SECONDS_TO_MILLIS");
   byte[] minute=HealthProto.numbers(1,0,2,4,3,5,4,6,5,7,6,1,7,8).encode();
   JSONObject activity=CloudNativeProjection.project("activity-detail","fixture","01:02:03:04:05:06",1700000000L,1700000001000L,minute,"Asia/Singapore","OWW251");
   check(activity.getLong("calories")==4000&&activity.getInt("distance")==5&&activity.getInt("altitudeOffset")==6&&activity.getInt("sportMode")==7&&activity.getInt("workout")==1&&activity.getInt("steps")==8&&activity.getLong("endTimestamp")-activity.getLong("startTimestamp")==60000,"NATIVE_ACTIVITY_OFFICIAL_UNITS_AND_IDENTITY");
   for(CloudStream nativeStream:CloudStream.all(c)){
    if(nativeStream.id.equals("heart")){JSONObject prepared=CloudNativeProducer.prepare(nativeStream,heart,null,new JSONObject());check(prepared.getInt("updated")==1&&prepared.getLong("modifiedTimestamp")==0,"NATIVE_UPLOAD_SYNC_METADATA");}
    if(nativeStream.id.equals("activity-detail")){
     boolean blocked=false;try{CloudNativeProducer.prepare(nativeStream,activity,null,new JSONObject());}catch(IOException expectedFailure){blocked=true;}check(blocked,"NATIVE_DEVICE_CATEGORY_NOT_GUESSED");
     JSONObject prepared=CloudNativeProducer.prepare(nativeStream,activity,null,new JSONObject().put("deviceType","fixture-watch-category"));check(prepared.getString("deviceType").equals("fixture-watch-category"),"NATIVE_DEVICE_CATEGORY_FROZEN");
    }
   }
   for(CloudStream nativeStream:CloudStream.all(c))if(nativeStream.id.equals("heart")){
    JSONObject mutation=new JSONObject().put("id","01234567-89ab-cdef-0123-456789abcdef").put("payload",heart);
    String stable=CloudUpload.requestPayload(nativeStream,mutation).getString("clientDataId");
    check(stable.equals("0123456789abcdef0123456789abcdef")&&stable.equals(CloudUpload.requestPayload(nativeStream,mutation).getString("clientDataId")),"CLIENT_RECORD_ID_STABLE_ACROSS_RETRIES");
    JSONObject existing=new JSONObject(heart.toString()).put("clientDataId","existing-client-record");mutation.put("payload",existing);check(CloudUpload.requestPayload(nativeStream,mutation).getString("clientDataId").equals("existing-client-record"),"EXISTING_CLIENT_RECORD_ID_PRESERVED");
    HealthArchive archive=HealthArchive.get(c);long stamp=1700000000L;String device="01:02:03:04:05:06";
    check(archive.getWritableDatabase().getPath().equals(c.getDatabasePath("health-archive.db").getPath()),"SQLITE_HELPER_USES_ISOLATED_DATABASE");
    HealthSyncProtocol.Request request=HealthSyncProtocol.range(HealthSyncProtocol.Kind.HEART,(int)stamp,(int)stamp+60);
    archive.save(device,request,HealthProto.numbers(1,0,2,(int)stamp,3,(int)stamp+60).withMessage(4,HealthProto.parse(point)).encode(),Collections.emptyMap());
    try(Cursor rows=archive.getReadableDatabase().rawQuery("SELECT count(*) FROM cloud_source_events",null)){rows.moveToFirst();check(rows.getInt(0)==0,"UNOWNED_RAW_DATA_IS_ARCHIVED_WITHOUT_UPLOAD_EVENT");}
    archive.getWritableDatabase().execSQL("INSERT INTO cloud_source_events(event_id,scope,device,kind,stamp,received_at,packet_hash,body,zone,model) VALUES(?,?,?,'HEART',?,?,'fixture',?,'Asia/Singapore','OWW251')",new Object[]{"owned-source-fixture",store.scope,device,stamp,stamp*1000+1,point});
    try(Cursor event=archive.getReadableDatabase().rawQuery("SELECT sequence,event_id,device,stamp,received_at,body,zone,model,metadata FROM cloud_source_events WHERE event_id='owned-source-fixture'",null)){check(event.moveToFirst()&&CloudNativeProducer.eventRow(c,store,nativeStream,event)!=null&&store.producerCursor(nativeStream)==0,"EVENT_PROJECTION_DOES_NOT_SKIP_OLDER_SOURCE_CHECKPOINT");}
    CloudNativeProducer.capture(c,store,nativeStream);long checkpoint=store.producerCursor(nativeStream);check(checkpoint>0&&store.nativePendingCount(nativeStream)==1,"SOURCE_QUEUE_AND_CHECKPOINT_COMMIT_TOGETHER");
    store.producerCursor(nativeStream,0);JSONObject baseline=new JSONObject(heart.toString()).put("vendorAddedField",5).put("modifiedTimestamp",700);java.lang.reflect.Constructor<CloudCrypto> constructor=CloudCrypto.class.getDeclaredConstructor(String.class);constructor.setAccessible(true);CloudCrypto fixtureCrypto=constructor.newInstance("0123456789abcdef");store.saveReceipt(nativeStream,new JSONArray().put(baseline),700,fixtureCrypto);
    CloudNativeProducer.capture(c,store,nativeStream);check(store.nativePendingCount(nativeStream)==1&&store.producerCursor(nativeStream)==checkpoint,"SOURCE_REPLAY_USES_FROZEN_REVISION_AFTER_BASELINE_CHANGES");archive.close();
   }
   for(CloudStream daily:CloudStream.all(c))if(daily.id.equals("activity-stat")){
    byte[] body=HealthProto.numbers(1,0,2,40,3,5000,4,5,5,2,6,10,7,4,8,100,9,2,10,3).encode();
    JSONObject observed=CloudNativeProjection.project(daily.id,"fixture","01:02:03:04:05:06",1700000000L,1700000001000L,body,"Asia/Tokyo","OWW251");
    java.time.LocalDate date=java.time.Instant.ofEpochSecond(1700000000L).atZone(java.time.ZoneId.of("Asia/Tokyo")).toLocalDate();
    check(observed.getLong("startTimestamp")==date.atTime(java.time.LocalTime.MIN).atZone(java.time.ZoneId.of("Asia/Tokyo")).toInstant().toEpochMilli()&&observed.getLong("endTimestamp")==date.atTime(java.time.LocalTime.MAX).atZone(java.time.ZoneId.of("Asia/Tokyo")).toInstant().toEpochMilli(),"DAILY_INTERVAL_MATCHES_PINNED_OFFICIAL_STORE");
    JSONObject cloud=new JSONObject(observed.toString()).put("totalSteps",6000).put("totalCalories",50000).put("currentDayStepsGoal",5000).put("currentDayCaloriesGoal",40000).put("exerciseGoal",5).put("activitiesGoal",3);
    JSONObject merged=CloudNativeProducer.prepare(daily,observed,cloud,new JSONObject());check(merged.getLong("totalSteps")==6000&&merged.getLong("totalCalories")==50000&&merged.getInt("dayGoalComplete")==1,"DAILY_CUMULATIVE_MERGE_PRESERVES_CLOUD_TOTALS");
    JSONObject newDaily=CloudNativeProducer.prepare(daily,new JSONObject(observed.toString()),null,new JSONObject().put("goals",new JSONArray().put(5000).put(100).put(10).put(4)));check(newDaily.getLong("currentDayCaloriesGoal")==100000&&newDaily.has("totalDuration"),"DAILY_GOALS_AND_PRIMITIVE_DTO_FIELDS");
   }
   for(CloudStream glucose:CloudStream.all(c))if(glucose.id.equals("glucose-stat")){
    check(!glucose.hasMeasurements(new JSONObject().put("date",20261007).put("average",0).put("min",0).put("max",0)),"EMPTY_GLUCOSE_PLACEHOLDER_NOT_UPLOADED");
    check(glucose.hasMeasurements(new JSONObject().put("average",5.5)),"REAL_GLUCOSE_OBSERVATION_ELIGIBLE");
   }
   for(CloudStream schema:CloudStream.all(c)){
    if(schema.id.equals("sleep-heart")){JSONObject values=new JSONObject().put("date",20261007).put("minHeartRate",0).put("avgSleepHeartRate",60).put("maxHeartRate",80).put("reasonableRangeLow",0).put("reasonableRangeHigh",0);JSONObject wire=schema.uploadPlainRow(values);check(!wire.has("minHeartRate")&&!wire.has("reasonableRangeLow")&&!wire.has("reasonableRangeHigh")&&wire.getInt("avgSleepHeartRate")==60,"SLEEP_HEART_OPTIONAL_FIELDS_MATCH_OFFICIAL_VALIDATION");}
    if(schema.id.equals("mental-stat")){JSONObject wire=schema.uploadPlainRow(new JSONObject().put("stressState",0).put("avgRestingHeartRate",0).put("avgSleepHrv",50));check(!wire.has("stressState")&&!wire.has("avgRestingHeartRate")&&wire.getInt("avgSleepHrv")==50,"MENTAL_OPTIONAL_FIELDS_DO_NOT_INVENT_VALUES");}
    if(schema.id.equals("sleep")){JSONObject left=new JSONObject().put("deviceUniqueId","01:02:03:04:05:06").put("startTimestamp",1).put("sleepType",1).put("sleepState",2).put("algOriginData",0).put("metadata","{\"b\":2,\"a\":1}");JSONObject right=new JSONObject(left.toString());right.remove("algOriginData");right.put("metadata","{\"a\":1,\"b\":2}");check(schema.sameBusiness(left,right),"SLEEP_JSON_METADATA_KEY_ORDER_AND_LOCAL_ALGORITHM_FIELD");right.put("sleepState",3);check(!schema.sameBusiness(left,right),"SLEEP_CLINICAL_STATE_DIFFERENCE_BLOCKS_ACK");}
    if(schema.id.equals("sleep-stat")){JSONObject left=new JSONObject().put("date",20261007).put("totalSleepTime",100).put("deviceUniqueId","fixture-phone");JSONObject right=new JSONObject(left.toString()).put("deviceUniqueId","fixture-watch");check(schema.sameBusiness(left,right),"SLEEP_AGGREGATE_SOURCE_ANNOTATION_MATCHES_OFFICIAL_ACK");right.put("totalSleepTime",101);check(!schema.sameBusiness(left,right),"SLEEP_AGGREGATE_DURATION_DIFFERENCE_BLOCKS_ACK");}
    if(schema.id.equals("sunshine-stat")){JSONObject raw=new JSONObject().put("dataClient","01:02:03:04:05:06").put("date",20261007).put("totalDuration",1).put("favoriteTime",1).put("sunshineType",1);JSONObject wire=schema.uploadPlainRow(raw).getJSONArray("details").getJSONObject(0);check(!wire.has("favoriteTime")&&!wire.has("sunshineType"),"SUNSHINE_DERIVED_FIELDS_NOT_IN_WIRE_DTO");}
    if(schema.id.equals("activity-detail")){JSONObject detail=new JSONObject().put("deviceUniqueId","01:02:03:04:05:06").put("startTimestamp",1700000000000L).put("endTimestamp",1700000060000L).put("sportMode",-3).put("steps",100).put("modifiedTime",-1).put("modifiedTimestamp",-1);java.lang.reflect.Constructor<CloudCrypto> ctor=CloudCrypto.class.getDeclaredConstructor(String.class);ctor.setAccessible(true);store.saveReceipt(schema,new JSONArray().put(detail),800,ctor.newInstance("0123456789abcdef"));check(schema.modified(store.remote(schema,detail))==800,"NEGATIVE_ROW_VERSION_USES_REAL_PAGE_RECEIPT");}
   }
   Fake recoveredDns=new Fake(store,stream);CloudUpload.synchronize(store,stream,recoveredDns,10);check(recoveredDns.sends==1,"WRITE_NOT_STARTED_READY_RECORD_CAN_RECOVER");
   Fake chain=new Fake(store,stream);store.enqueue(stream,row(20261020,100),"chain-A");store.enqueue(stream,row(20261020,200),"chain-B");store.enqueue(stream,row(20261020,100),"chain-A-again");
   CloudUpload.Result chained=CloudUpload.synchronize(store,stream,chain,10);System.out.println("UPLOAD_VERIFY "+new JSONObject().put("stage","fixture-chain").put("confirmed",chained.confirmed).put("sends",chain.sends).put("pending",chained.waiting).put("conflicts",chained.conflicts));check(chained.confirmed==3&&chain.sends==3,"QUEUED_A_B_A_FOLLOWS_EXACT_OWN_ACK");
   Fake nativeChain=new Fake(store,stream);int conflictBefore=store.conflictCount(stream);
   store.enqueueNative(stream,row(20261021,100),"watch-chain-1");store.enqueueNative(stream,row(20261021,200),"watch-chain-2");store.enqueueNative(stream,row(20261021,150),"watch-chain-lower");
   CloudUpload.Result nativeChained=CloudUpload.synchronize(store,stream,nativeChain,10);check(nativeChained.confirmed==2&&nativeChain.sends==2,"NATIVE_QUEUE_FOLLOWS_CONFIRMED_PREDECESSOR");check(store.conflictCount(stream)==conflictBefore+1,"NATIVE_DAILY_CONTINUATION_CANNOT_LOWER_TOTALS");
   store.enqueueNative(stream,row(20261021,300),"watch-chain-external-change");nativeChain.value=row(20261021,250).put("modifiedTime",++nativeChain.version);int attempts=nativeChain.sends;CloudUpload.synchronize(store,stream,nativeChain,10);check(nativeChain.sends==attempts,"EXTERNAL_VERSION_CANNOT_BE_TREATED_AS_OWN_PREDECESSOR");
   Fake tombstone=new Fake(store,stream);store.enqueueNative(stream,row(20261022,100).put("display",1),"watch-deleted-source");tombstone.value=row(20261022,100).put("display",0).put("modifiedTime",++tombstone.version);CloudUpload.Result deleted=CloudUpload.synchronize(store,stream,tombstone,10);check(deleted.confirmed==0&&tombstone.sends==0,"DELETED_SERVER_RECORD_CANNOT_ACK_OR_RESURRECT_LIVE_SOURCE");
   Fake uncertainChain=new Fake(store,stream);store.enqueue(stream,row(20261023,100),"uncertain-parent-A");CloudUpload.synchronize(store,stream,uncertainChain,10);
   store.enqueue(stream,row(20261023,200),"uncertain-parent-B");store.enqueue(stream,row(20261023,100),"uncertain-child-A");uncertainChain.timeout=true;try{CloudUpload.synchronize(store,stream,uncertainChain,10);}catch(java.net.SocketTimeoutException expectedFailure){}
   uncertainChain.timeout=false;uncertainChain.missing=true;int uncertainAttempts=uncertainChain.sends;CloudUpload.Result blockedChain=CloudUpload.synchronize(store,stream,uncertainChain,10);check(blockedChain.confirmed==0&&uncertainChain.sends==uncertainAttempts,"UNKNOWN_PREDECESSOR_BLOCKS_EQUIVALENT_CHILD_ACK_AND_SEND");check(blockedChain.ready==0,"BLOCKED_READY_QUEUE_DOES_NOT_TRIGGER_INFINITE_RETRY");
   uncertainChain.missing=false;CloudUpload.Result continuedChain=CloudUpload.synchronize(store,stream,uncertainChain,10);check(continuedChain.confirmed==2&&uncertainChain.sends==uncertainAttempts+1,"UNKNOWN_PARENT_READBACK_RELEASES_QUEUED_A_B_A");
   Fake newerSource=new Fake(store,stream);newerSource.value=row(20261024,100).put("modifiedTime",100);newerSource.refresh();store.enqueue(stream,row(20261024,200),"older-explicit-ready");store.enqueueNative(stream,row(20261024,100),"newer-authoritative-source");CloudUpload.Result replaced=CloudUpload.synchronize(store,stream,newerSource,10);check(replaced.confirmed==1&&newerSource.sends==0,"OLDER_READY_CANNOT_OVERWRITE_NEWER_CONFIRMED_SOURCE");
   check(CloudNativeProjection.project("heart","fixture","01:02:03:04:05:06",1700000000L,1700000001000L,point,"Asia/Singapore","UNKNOWN")==null,"UNKNOWN_MODEL_NOT_GUESSED");
   store.enqueue(stream,row(20300101,100),"selected-A");store.enqueue(stream,row(20300102,200),"selected-B");String selectedA=null,selectedB=null;
   for(JSONObject m:store.pending(stream)){if(m.getString("sourceEventId").equals("selected-A"))selectedA=m.getString("id");if(m.getString("sourceEventId").equals("selected-B"))selectedB=m.getString("id");}
   check(selectedA!=null&&selectedB!=null,"SELECTED_IDS_EXIST_IN_AUTHORITATIVE_QUEUE");
   Fake selected=new Fake(store,stream);CloudUpload.Result onlyA=CloudUpload.synchronize(store,stream,selected,1,selectedA);
   check(onlyA.confirmed==1&&selected.sends==1&&store.pending(stream,selectedB).size()==1,"SELECTED_UPLOAD_LEAVES_OTHER_RECORD_PENDING");
   check(CloudUpload.synchronize(store,stream,selected,1,selectedA).sent==0&&store.pending(stream,selectedA).isEmpty(),"ACKED_SELECTED_RECORD_CANNOT_BE_SENT_AGAIN");
   check(store.pending(stream,"' OR 1=1 --").isEmpty(),"SELECTED_ID_USES_SQL_ARGUMENT_AND_STATE_FILTER");
   store.enqueue(stream,row(20300103,100),"selected-unknown-parent");String parent=null;
   for(JSONObject m:store.pending(stream))if(m.getString("sourceEventId").equals("selected-unknown-parent"))parent=m.getString("id");
   Fake selectedUnknown=new Fake(store,stream);selectedUnknown.timeout=true;boolean timeoutSeen=false;
   try{CloudUpload.synchronize(store,stream,selectedUnknown,1,parent);}catch(java.net.SocketTimeoutException expectedFailure){timeoutSeen=true;}
   check(timeoutSeen&&store.pending(stream,parent).get(0).getString("state").equals("ACK_UNKNOWN"),"SELECTED_TIMEOUT_PERSISTS_IN_AUTHORITATIVE_QUEUE");
   store.enqueue(stream,row(20300103,200),"selected-unknown-child");String child=null;
   for(JSONObject m:store.pending(stream))if(m.getString("sourceEventId").equals("selected-unknown-child"))child=m.getString("id");
   selectedUnknown.timeout=false;selectedUnknown.missing=true;int beforeSelected=selectedUnknown.sends;
   CloudUpload.Result blockedSelected=CloudUpload.synchronize(store,stream,selectedUnknown,1,child);
   check(blockedSelected.confirmed==0&&selectedUnknown.sends==beforeSelected&&store.pending(stream,child).size()==1,"SELECTING_CHILD_CANNOT_BYPASS_UNCERTAIN_PREDECESSOR");
   java.lang.reflect.Constructor<CloudCrypto> codecConstructor=CloudCrypto.class.getDeclaredConstructor(String.class);codecConstructor.setAccessible(true);CloudCrypto codec=codecConstructor.newInstance("0123456789abcdef");String fixtureDevice="01:02:03:04:05:06",oneLayer=clientFixtureLayer(fixtureDevice),twoLayers=clientFixtureLayer(oneLayer);
   check(codec.client(oneLayer,false).equals(fixtureDevice),"SINGLE_CLIENT_ENCRYPTION_STILL_DECODES");
   check(codec.client(twoLayers,false).equals(fixtureDevice),"OFFICIAL_NESTED_CLIENT_DECRYPTS_TO_EXACT_DEVICE");
   check(codec.client(oneLayer,true).equals(oneLayer),"EXISTING_ENCRYPTED_CLIENT_IS_NOT_ENCRYPTED_AGAIN");
   boolean damagedLayerRejected=false;try{codec.client(clientFixtureLayer("not-a-valid-encrypted-device-identifier-longer-than-32"),false);}catch(Exception expectedFailure){damagedLayerRejected=true;}check(damagedLayerRejected,"INVALID_SECOND_CLIENT_LAYER_IS_NOT_ACCEPTED_AS_DEVICE_ID");
  }
 }
 static JSONObject mentalRow(CloudStream stream,int date)throws Exception {
  JSONObject row=new JSONObject().put("ssoid","fixture").put("date",date).put("dataClient","01:02:03:04:05:06").put("clientModel","OWW251");
  Iterator<String> fields=stream.wireTypes.keys();while(fields.hasNext()){String name=fields.next();if(!row.has(name)&&stream.wireTypes.getString(name).length()==1)row.put(name,0);}
  return row.put("display",1).put("avgHrv",30).put("avgStress",20).put("stressState",2).put("baseHrv",31).put("avgSleepHrv",48).put("minSleepHrv",40).put("maxSleepHrv",60).put("avgRestingHeartRate",65);
 }
 interface Action {void run()throws Exception;}
 static final class MentalRemote implements CloudUpload.Remote {
  final CloudStore store;final CloudStream stream;final CloudCrypto crypto;JSONObject value;long version=5000;int sends;String damage="";Action afterReceipt;
  MentalRemote(CloudStore store,CloudStream stream)throws Exception{this.store=store;this.stream=stream;java.lang.reflect.Constructor<CloudCrypto> ctor=CloudCrypto.class.getDeclaredConstructor(String.class);ctor.setAccessible(true);crypto=ctor.newInstance("0123456789abcdef");}
  public void check()throws Exception{store.check();}
  public void refresh()throws Exception{if(value!=null)store.saveReceipt(stream,new JSONArray().put(value),version,crypto);}
  public JSONObject send(JSONObject payload)throws Exception{sends++;value=new JSONObject(payload.toString()).put("modifiedTimestamp",++version);value.remove("avgSleepHrv");if(damage.equals("missing"))value.remove("avgStress");if(damage.equals("changed"))value.put("avgStress",999);if(damage.equals("null"))value.put("avgSleepHrv",JSONObject.NULL);if(damage.equals("device"))value.put("dataClient","01:02:03:04:05:07");if(damage.equals("deleted"))value.put("display",0);return new JSONObject().put("body",new JSONObject().put("modifiedTimestamp",version));}
  public void receipt(long version)throws Exception{refresh();if(afterReceipt!=null){Action next=afterReceipt;afterReceipt=null;next.run();}}
 }
 static String mentalState(Context c,String event)throws Exception {try(SQLiteDatabase db=SQLiteDatabase.openDatabase(c.getDatabasePath("cloud-journal-v1.db").getPath(),null,SQLiteDatabase.OPEN_READONLY);Cursor r=db.rawQuery("SELECT state FROM mutations_v2 WHERE source_event=?",new String[]{event})){return r.moveToFirst()?r.getString(0):"MISSING";}}
 static long mentalValue(Context c,int date,String column)throws Exception {File folder=OfficialHistoryStore.current(c);try(SQLiteDatabase db=OfficialHistoryStore.open(new File(folder,"databases/database.db"));Cursor r=db.rawQuery("SELECT "+OfficialHistoryStore.q(column)+" FROM DBPhysicalMentalStat WHERE ssoid='fixture' AND date=?",new String[]{Integer.toString(date)})){if(!r.moveToFirst())throw new IOException("FIXTURE_ROW_MISSING");return r.getLong(0);}}
 static void mentalPartial(Context c)throws Exception {
  CloudStream stream=null;for(CloudStream s:CloudStream.all(c))if(s.id.equals("mental-stat"))stream=s;AtomicBoolean allowed=new AtomicBoolean(true);
  try(CloudStore store=new CloudStore(c,"fixture",allowed::get)){
   JSONObject source=mentalRow(stream,20310101);store.enqueueNative(stream,source,"partial-first");MentalRemote remote=new MentalRemote(store,stream);CloudUpload.Result result=CloudUpload.synchronize(store,stream,remote,10);
   check(result.confirmed==0&&remote.sends==1&&mentalState(c,"partial-first").equals("PARTIAL")&&store.pendingCount(stream)==0,"MENTAL_MISSING_AVERAGE_HAS_DURABLE_PARTIAL_RECEIPT");
   check(result.partial==1&&result.waiting==0&&result.ready==0&&result.pending(),"PARTIAL_VISIBLE_WITHOUT_AUTOMATIC_SEND_RETRY");
   check(mentalValue(c,20310101,"avg_sleep_hrv")==48&&mentalValue(c,20310101,"sync_status")==1,"PARTIAL_RETAINS_AVERAGE_AND_CLEARS_ONLY_SEND_FLAG");
   check(!stream.sameBusiness(source,remote.value),"PARTIAL_DOES_NOT_WEAKEN_STRICT_FULL_COMPARISON");
   for(CloudStream other:CloudStream.all(c))if(other.id.equals("activity-stat"))check(!other.partiallyMatches(source,remote.value),"PARTIAL_ALLOWLIST_DOES_NOT_SPREAD_TO_OTHER_STREAMS");
   check(!stream.partiallyMatches(new JSONObject(source.toString()).put("avgSleepHrv",JSONObject.NULL),remote.value),"NULL_LOCAL_HRV_NOT_PARTIALLY_CONFIRMED");
   CloudUpload.synchronize(store,stream,remote,10);check(remote.sends==1,"PARTIAL_IS_NOT_SENT_AGAIN");
   try(CloudStore restarted=new CloudStore(c,"fixture",allowed::get)){CloudUpload.synchronize(restarted,stream,remote,10);check(restarted.pendingCount(stream)==0&&remote.sends==1,"PARTIAL_SURVIVES_STORE_RESTART");}
   JSONObject next=new JSONObject(source.toString()).put("avgStress",25);store.enqueueNative(stream,next,"partial-next");CloudUpload.synchronize(store,stream,remote,10);
   check(remote.sends==2&&mentalState(c,"partial-next").equals("PARTIAL"),"OTHER_FIELD_EDIT_FOLLOWS_EXACT_PARTIAL_BASELINE");
   JSONObject hrvEdit=new JSONObject(next.toString()).put("avgSleepHrv",77);store.enqueueNative(stream,hrvEdit,"partial-hrv-only");CloudUpload.synchronize(store,stream,remote,10);
   check(remote.sends==2&&mentalState(c,"partial-hrv-only").equals("PARTIAL")&&mentalValue(c,20310101,"avg_sleep_hrv")==77,"HRV_ONLY_EDIT_RETAINED_WITHOUT_WHOLE_RECORD_RESEND");
   remote.value.put("avgSleepHrv",99).put("avgStress",30).put("modifiedTimestamp",++remote.version);CloudUpload.synchronize(store,stream,remote,10);
   check(mentalValue(c,20310101,"avg_sleep_hrv")==77&&mentalValue(c,20310101,"avg_stress")==30&&mentalState(c,"partial-hrv-only").equals("PARTIAL"),"UNVERIFIED_REMOTE_AVERAGE_CANNOT_OVERWRITE_LOCAL_PARTIAL");
   remote.value.put("avgSleepHrv",JSONObject.NULL).put("modifiedTimestamp",++remote.version);CloudUpload.synchronize(store,stream,remote,10);
   check(mentalValue(c,20310101,"avg_sleep_hrv")==77&&mentalState(c,"partial-hrv-only").equals("PARTIAL"),"REMOTE_NULL_AVERAGE_PRESERVES_LOCAL_PARTIAL_VALUE");
   remote.value=new JSONObject(hrvEdit.toString()).put("modifiedTimestamp",++remote.version);result=CloudUpload.synchronize(store,stream,remote,10);
   check(result.confirmed==1&&remote.sends==2&&mentalState(c,"partial-hrv-only").equals("ACKED"),"FULL_HRV_READBACK_UPGRADES_PARTIAL_WITHOUT_SEND");
   check(store.partialCount(stream)==0,"OLD_PARTIAL_REVISIONS_NOT_COUNTED_AFTER_FULL_HEAD_ACK");
   for(String damage:new String[]{"missing","changed","null","device","deleted"}){
    int date=20310201+Arrays.asList("missing","changed","null","device","deleted").indexOf(damage);JSONObject row=mentalRow(stream,date);String event="partial-negative-"+damage;store.enqueueNative(stream,row,event);MentalRemote bad=new MentalRemote(store,stream);bad.damage=damage;
    String id=null;for(JSONObject m:store.pending(stream))if(event.equals(m.getString("sourceEventId")))id=m.getString("id");CloudUpload.synchronize(store,stream,bad,1,id);
    check(mentalState(c,event).equals("ACK_UNKNOWN"),"PARTIAL_REJECTS_"+damage.toUpperCase(Locale.ROOT));
   }
   JSONObject older=mentalRow(stream,20310301),newer=new JSONObject(older.toString()).put("avgSleepHrv",88);store.enqueueNative(stream,older,"partial-older");MentalRemote late=new MentalRemote(store,stream);CloudStream metric=stream;late.afterReceipt=()->store.enqueueNative(metric,newer,"partial-newer");String id=null;for(JSONObject m:store.pending(stream))if(m.getString("sourceEventId").equals("partial-older"))id=m.getString("id");CloudUpload.synchronize(store,stream,late,1,id);
   check(mentalState(c,"partial-older").equals("PARTIAL")&&mentalState(c,"partial-newer").equals("READY")&&mentalValue(c,20310301,"avg_sleep_hrv")==88&&mentalValue(c,20310301,"sync_status")==0,"OLDER_PARTIAL_CANNOT_CLEAR_NEW_LOCAL_EDIT");
   File folder=OfficialHistoryStore.current(c),incoming=new File(c.getFilesDir(),"partial-import-fixture.db");java.nio.file.Files.copy(new File(folder,"databases/database.db").toPath(),incoming.toPath());
   try(SQLiteDatabase db=SQLiteDatabase.openDatabase(incoming.getPath(),null,SQLiteDatabase.OPEN_READWRITE)){db.execSQL("UPDATE DBPhysicalMentalStat SET avg_sleep_hrv=0,avg_stress=35,modified_timestamp=99999 WHERE date=20310101");}
   try(SQLiteDatabase db=SQLiteDatabase.openDatabase(new File(folder,"databases/database.db").getPath(),null,SQLiteDatabase.OPEN_READWRITE)){OfficialHistoryStore.merge(db,incoming,(percent,message)->{});}
   check(mentalValue(c,20310101,"avg_sleep_hrv")==77&&mentalValue(c,20310101,"avg_stress")==35,"OFFICIAL_IMPORT_PLACEHOLDER_PRESERVES_REAL_HRV");
   try(SQLiteDatabase db=SQLiteDatabase.openDatabase(incoming.getPath(),null,SQLiteDatabase.OPEN_READWRITE)){db.execSQL("UPDATE DBPhysicalMentalStat SET avg_sleep_hrv=91,modified_timestamp=100000 WHERE date=20310101");}
   try(SQLiteDatabase db=SQLiteDatabase.openDatabase(new File(folder,"databases/database.db").getPath(),null,SQLiteDatabase.OPEN_READWRITE)){OfficialHistoryStore.merge(db,incoming,(percent,message)->{});}
   check(mentalValue(c,20310101,"avg_sleep_hrv")==91,"OFFICIAL_NEW_POSITIVE_HRV_STILL_MERGES");
   incoming.delete();
   JSONObject valid=mentalRow(stream,20310401);store.enqueueNative(stream,valid,"partial-zero-version");MentalRemote zero=new MentalRemote(store,stream);zero.version=0;zero.value=new JSONObject(valid.toString()).put("modifiedTimestamp",0);zero.value.remove("avgSleepHrv");String zeroId=null;for(JSONObject m:store.pending(stream))if(m.getString("sourceEventId").equals("partial-zero-version"))zeroId=m.getString("id");boolean invalid=false;
   try{CloudUpload.synchronize(store,stream,zero,1,zeroId);}catch(IOException expectedFailure){invalid=true;}
   check(invalid&&zero.sends==0&&mentalState(c,"partial-zero-version").equals("READY"),"ZERO_VERSION_CANNOT_COMMIT_PARTIAL");
   JSONObject cancelled=mentalRow(stream,20310402);store.enqueueNative(stream,cancelled,"partial-cancelled");MentalRemote cancel=new MentalRemote(store,stream);cancel.afterReceipt=()->allowed.set(false);String cancelId=null;for(JSONObject m:store.pending(stream))if(m.getString("sourceEventId").equals("partial-cancelled"))cancelId=m.getString("id");boolean stopped=false;
   try{CloudUpload.synchronize(store,stream,cancel,1,cancelId);}catch(IOException expectedFailure){stopped=true;}allowed.set(true);
   check(stopped&&mentalState(c,"partial-cancelled").equals("ACK_UNKNOWN"),"CANCELLED_PARTIAL_CANNOT_COMMIT");
   CloudUpload.synchronize(store,stream,cancel,1,cancelId);check(cancel.sends==1&&mentalState(c,"partial-cancelled").equals("PARTIAL"),"CANCELLED_UNKNOWN_RECOVERS_PARTIAL_WITHOUT_RESEND");
   JSONObject edit=new JSONObject(cancelled.toString()).put("avgStress",30);store.enqueueNative(stream,edit,"partial-external-change");cancel.value.put("avgStress",99).put("modifiedTimestamp",++cancel.version);String editId=null;for(JSONObject m:store.pending(stream))if(m.getString("sourceEventId").equals("partial-external-change"))editId=m.getString("id");CloudUpload.synchronize(store,stream,cancel,1,editId);
   check(cancel.sends==1&&mentalState(c,"partial-external-change").equals("CONFLICT"),"PARTIAL_PREDECESSOR_DOES_NOT_BYPASS_EXTERNAL_CHANGE");
  }
 }
 public static void main(String[] args)throws Exception {
  android.os.Looper.prepareMainLooper();Class<?> at=Class.forName("android.app.ActivityThread");Object thread=at.getMethod("systemMain").invoke(null);Context system=(Context)at.getMethod("getSystemContext").invoke(thread);Context base=system.createPackageContext("com.example.opponotificationrelay",Context.CONTEXT_IGNORE_SECURITY);
  File root=new File(base.getCacheDir(),"upload-fixture-"+UUID.randomUUID());root.mkdirs();String prefix="upload-fixture-"+UUID.randomUUID();Set<String> prefsNames=new HashSet<>();
  Context fixture=new ContextWrapper(base){public Context getApplicationContext(){return this;}public File getFilesDir(){return root;}public File getNoBackupFilesDir(){return root;}public File getDatabasePath(String name){return new File(root,name);}public SQLiteDatabase openOrCreateDatabase(String name,int mode,SQLiteDatabase.CursorFactory factory){return openOrCreateDatabase(name,mode,factory,null);}public SQLiteDatabase openOrCreateDatabase(String name,int mode,SQLiteDatabase.CursorFactory factory,android.database.DatabaseErrorHandler handler){int flags=SQLiteDatabase.CREATE_IF_NECESSARY;if((mode&Context.MODE_ENABLE_WRITE_AHEAD_LOGGING)!=0)flags|=SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING;return SQLiteDatabase.openDatabase(getDatabasePath(name).getPath(),factory,flags,handler);}public SharedPreferences getSharedPreferences(String name,int mode){prefsNames.add(prefix+name);return super.getSharedPreferences(prefix+name,mode);}};
  int exit=0;try{pipeline(fixture);mentalPartial(fixture);System.out.println("UPLOAD_VERIFY "+new JSONObject().put("stage","offline").put("checks",checks).put("status","PASS").put("network","simulated"));}
  catch(Throwable failure){exit=1;JSONObject out=new JSONObject().put("stage","offline").put("status","FAIL").put("checks",checks).put("error",failure.getClass().getSimpleName());String code=failure.getMessage();if(code!=null&&code.matches("[A-Z0-9_]{1,100}"))out.put("code",code);System.out.println("UPLOAD_VERIFY "+out);}
  finally{OfficialHistoryStore.remove(root);for(String name:prefsNames)base.deleteSharedPreferences(name);}
  System.exit(exit);
 }
}
