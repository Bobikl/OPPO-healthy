package com.example.opponotificationrelay;
import android.content.*;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.*;
import java.util.function.BooleanSupplier;
import org.json.*;

/** Raw pages, cursor and official-schema projection share one SQLite transaction. */
final class CloudStore implements AutoCloseable {
    private final Context context;final String account,scope;private final BooleanSupplier allowed;private final long deadline;
    CloudStore(Context c,String account,BooleanSupplier allowed){this(c,account,allowed,Long.MAX_VALUE);}
    CloudStore(Context c,String account,BooleanSupplier allowed,long deadline){this.deadline=deadline;context=c.getApplicationContext();this.account=account;this.scope=CloudSyncEngine.accountKey(account);this.allowed=allowed;}
    void check()throws IOException {if(!allowed.getAsBoolean()||Thread.currentThread().isInterrupted())throw new IOException("CLOUD_CANCELLED");if(android.os.SystemClock.elapsedRealtime()>=deadline)throw new IOException("CLOUD_BUDGET_YIELD");}
    private File prepare()throws Exception {
        check();File folder=OfficialHistoryStore.current(context);
        if(folder!=null){if(!account.equals(OfficialHistoryStore.json(new File(folder,"manifest.json")).getString("account")))throw new IOException("CLOUD_ACCOUNT_MISMATCH");return folder;}
        File root=OfficialHistoryStore.root(context);if(!root.exists()&&!root.mkdirs())throw new IOException("CLOUD_STORAGE");
        File stage=new File(root,"stage-"+UUID.randomUUID()),databases=new File(stage,"databases");
        if(!databases.mkdirs())throw new IOException("CLOUD_STORAGE");boolean published=false;
        try{
            try(SQLiteDatabase db=SQLiteDatabase.openOrCreateDatabase(new File(databases,"database.db"),null)){
                JSONArray sql=new JSONArray(CloudStream.asset(context,"cloud-empty-schema.json"));
                db.beginTransaction();try{for(int i=0;i<sql.length();i++)db.execSQL(sql.getString(i));db.setTransactionSuccessful();}finally{db.endTransaction();}
            }
            JSONObject meta=new JSONObject().put("account",account).put("scope",scope).put("sleepScope",scope).put("source","cloud").put("tables",new JSONObject());
            try(FileOutputStream out=new FileOutputStream(new File(stage,"manifest.json"))){out.write(meta.toString().getBytes(StandardCharsets.UTF_8));out.getFD().sync();}
            SyncCommit.run(allowed,()->{check();HealthAccountStore.requireAccount(context,account);if(!context.getSharedPreferences("official_history",0).edit().putString("current",stage.getName()).commit())throw new IOException("CLOUD_STORAGE");});
            published=true;return stage;
        }finally{if(!published)OfficialHistoryStore.remove(stage);}
    }
    private static void journal(SQLiteDatabase db,String schema)throws Exception {
        try(Cursor c=db.rawQuery("PRAGMA "+schema+".journal_mode=DELETE",null)){if(!c.moveToFirst()||!"delete".equalsIgnoreCase(c.getString(0)))throw new IOException("CLOUD_JOURNAL_MODE");}
    }
    private SQLiteDatabase open()throws Exception {
        File folder=prepare(),path=context.getDatabasePath("cloud-journal-v1.db");File parent=path.getParentFile();if(!parent.exists()&&!parent.mkdirs())throw new IOException("CLOUD_STORAGE");
        SQLiteDatabase db=SQLiteDatabase.openOrCreateDatabase(path,null);boolean ready=false;
        try{
            journal(db,"main");db.execSQL("PRAGMA synchronous=FULL");db.execSQL("PRAGMA foreign_keys=ON");
            db.execSQL("CREATE TABLE IF NOT EXISTS records(scope TEXT NOT NULL,stream TEXT NOT NULL,identity TEXT NOT NULL,version INTEGER NOT NULL,payload TEXT NOT NULL,PRIMARY KEY(scope,stream,identity))");
            db.execSQL("CREATE TABLE IF NOT EXISTS checkpoints(scope TEXT NOT NULL,stream TEXT NOT NULL,cursor INTEGER NOT NULL,complete INTEGER NOT NULL DEFAULT 0,PRIMARY KEY(scope,stream))");
            db.execSQL("CREATE TABLE IF NOT EXISTS mutations(id TEXT PRIMARY KEY,scope TEXT NOT NULL,stream TEXT NOT NULL,identity TEXT NOT NULL,payload TEXT NOT NULL,hash TEXT NOT NULL,state TEXT NOT NULL,remote_version INTEGER NOT NULL DEFAULT 0,created_at INTEGER NOT NULL,UNIQUE(scope,stream,identity,hash))");
            db.execSQL("CREATE TABLE IF NOT EXISTS raw_pages(scope TEXT NOT NULL,stream TEXT NOT NULL,version INTEGER NOT NULL,payload TEXT NOT NULL,PRIMARY KEY(scope,stream,version))");
            db.execSQL("CREATE INDEX IF NOT EXISTS mutations_pending ON mutations(scope,stream,state)");
            db.execSQL("CREATE TABLE IF NOT EXISTS mutations_v2(sequence INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT NOT NULL UNIQUE,scope TEXT NOT NULL,stream TEXT NOT NULL,identity TEXT NOT NULL,local_revision INTEGER NOT NULL,source_event TEXT NOT NULL,payload TEXT NOT NULL,hash TEXT NOT NULL,state TEXT NOT NULL,remote_version INTEGER NOT NULL DEFAULT 0,created_at INTEGER NOT NULL,UNIQUE(scope,stream,source_event))");
            db.execSQL("CREATE TABLE IF NOT EXISTS record_heads(scope TEXT NOT NULL,stream TEXT NOT NULL,identity TEXT NOT NULL,local_revision INTEGER NOT NULL,hash TEXT NOT NULL,PRIMARY KEY(scope,stream,identity))");
            db.execSQL("CREATE INDEX IF NOT EXISTS mutations_v2_pending ON mutations_v2(scope,stream,state,sequence)");
            db.execSQL("CREATE INDEX IF NOT EXISTS mutations_v2_lineage ON mutations_v2(scope,stream,identity,local_revision,state)");

            columns(db,"mutations_v2",new String[]{"base_version INTEGER NOT NULL DEFAULT 0","base_hash TEXT NOT NULL DEFAULT ''","source_kind TEXT NOT NULL DEFAULT 'legacy'"});
            db.execSQL("CREATE TABLE IF NOT EXISTS dirty_checkpoints(scope TEXT NOT NULL,stream TEXT NOT NULL,last_row INTEGER NOT NULL,PRIMARY KEY(scope,stream))");
            db.execSQL("CREATE TABLE IF NOT EXISTS producer_checkpoints(scope TEXT NOT NULL,stream TEXT NOT NULL,sequence INTEGER NOT NULL,PRIMARY KEY(scope,stream))");
            db.execSQL("ATTACH DATABASE ? AS history",new Object[]{new File(folder,"databases/database.db").getPath()});
            journal(db,"history");db.execSQL("PRAGMA history.synchronous=FULL");
            ready=true;return db;
        }finally{if(!ready)db.close();}
    }
    private static void columns(SQLiteDatabase db,String table,String[] additions){
        Set<String> present=new HashSet<>();try(Cursor cursor=db.rawQuery("PRAGMA table_info("+table+")",null)){while(cursor.moveToNext())present.add(cursor.getString(1));}
        for(String definition:additions)if(!present.contains(definition.split(" ")[0]))db.execSQL("ALTER TABLE "+table+" ADD COLUMN "+definition);
    }
    private static String producerKey(CloudStream stream){return stream.id.equals("activity-stat")?stream.id+":converter-v2":stream.id;}
    void supersedeNativeReady(CloudStream stream,String prefix)throws Exception {
        synchronized(OfficialHistoryStore.LOCK){check();try(SQLiteDatabase db=open()){SyncCommit.run(allowed,()->{check();db.execSQL("UPDATE mutations_v2 SET state='SUPERSEDED' WHERE scope=? AND stream=? AND source_kind='watch' AND state='READY' AND source_event LIKE ?",new Object[]{scope,stream.id,prefix+"%"});});}}
    }
    long producerCursor(CloudStream stream)throws Exception {synchronized(OfficialHistoryStore.LOCK){check();try(SQLiteDatabase db=open();Cursor c=db.rawQuery("SELECT sequence FROM producer_checkpoints WHERE scope=? AND stream=?",new String[]{scope,producerKey(stream)})){return c.moveToFirst()?c.getLong(0):0;}}}
    void producerCursor(CloudStream stream,long sequence)throws Exception {synchronized(OfficialHistoryStore.LOCK){check();try(SQLiteDatabase db=open()){SyncCommit.run(allowed,()->{check();db.execSQL("INSERT OR REPLACE INTO producer_checkpoints(scope,stream,sequence) VALUES(?,?,?)",new Object[]{scope,producerKey(stream),sequence});});}}}
    int readyCount(CloudStream stream)throws Exception{return stateCount(stream,"state='READY' AND NOT EXISTS(SELECT 1 FROM mutations_v2 prior WHERE prior.scope=mutations_v2.scope AND prior.stream=mutations_v2.stream AND prior.identity=mutations_v2.identity AND prior.local_revision<mutations_v2.local_revision AND prior.state IN ('SENDING','ACK_UNKNOWN'))");}
    int pendingCount(CloudStream stream)throws Exception{return stateCount(stream,"state IN ('READY','SENDING','ACK_UNKNOWN')");}
    int partialCount(CloudStream stream)throws Exception{return stateCount(stream,"state='PARTIAL' AND local_revision=(SELECT local_revision FROM record_heads h WHERE h.scope=mutations_v2.scope AND h.stream=mutations_v2.stream AND h.identity=mutations_v2.identity)");}
    int conflictCount(CloudStream stream)throws Exception{return stateCount(stream,"state='CONFLICT'");}
    int nativePendingCount(CloudStream stream)throws Exception{return stateCount(stream,"source_kind='watch' AND state IN ('READY','SENDING','ACK_UNKNOWN')");}
    private int stateCount(CloudStream stream,String condition)throws Exception {synchronized(OfficialHistoryStore.LOCK){check();try(SQLiteDatabase db=open();Cursor c=db.rawQuery("SELECT count(*) FROM mutations_v2 WHERE scope=? AND stream=? AND "+condition,new String[]{scope,stream.id})){c.moveToFirst();return c.getInt(0);}}}
    long cursor(CloudStream stream)throws Exception {synchronized(OfficialHistoryStore.LOCK){check();try(SQLiteDatabase db=open();Cursor c=db.rawQuery("SELECT cursor FROM checkpoints WHERE scope=? AND stream=?",new String[]{scope,stream.id})){return c.moveToFirst()?c.getLong(0):0;}}}
    boolean complete(CloudStream stream)throws Exception {synchronized(OfficialHistoryStore.LOCK){check();try(SQLiteDatabase db=open();Cursor c=db.rawQuery("SELECT complete FROM checkpoints WHERE scope=? AND stream=?",new String[]{scope,stream.id})){return c.moveToFirst()&&c.getInt(0)==1;}}}
    void complete(CloudStream stream,long cursor)throws Exception {synchronized(OfficialHistoryStore.LOCK){check();try(SQLiteDatabase db=open()){SyncCommit.run(allowed,()->{check();db.execSQL("INSERT OR REPLACE INTO checkpoints(scope,stream,cursor,complete) VALUES(?,?,?,1)",new Object[]{scope,stream.id,cursor});});}}}
    int savePage(CloudStream stream,JSONArray incoming,long version,CloudCrypto crypto)throws Exception {return save(stream,incoming,version,crypto,true);}
    int saveReceipt(CloudStream stream,JSONArray incoming,long version,CloudCrypto crypto)throws Exception {return save(stream,incoming,version,crypto,false);}
    private int save(CloudStream stream,JSONArray incoming,long version,CloudCrypto crypto,boolean advance)throws Exception {
        if(incoming.length()>20000)throw new IOException("CLOUD_RECORD_LIMIT");
        check();String raw=incoming.toString();try{incoming=stream.expanded(incoming,()->allowed.getAsBoolean()&&android.os.SystemClock.elapsedRealtime()<deadline);}catch(IOException interrupted){check();throw interrupted;}
        List<JSONObject> rows=new ArrayList<>();List<ContentValues> values=new ArrayList<>();List<String> identities=new ArrayList<>();
        for(int i=0;i<incoming.length();i++){check();JSONObject row=stream.decoded(incoming.getJSONObject(i),account,crypto);ContentValues val=stream.values(row,account,true);
            rows.add(row);values.add(val);identities.add(stream.identity(val));}
        synchronized(OfficialHistoryStore.LOCK){check();try(SQLiteDatabase db=open()){
            db.beginTransaction();try{
                for(int i=0;i<rows.size();i++){
                    check();JSONObject row=rows.get(i);ContentValues full=values.get(i);String identity=identities.get(i);
                    long modified=stream.modified(row);if(modified<=0&&!stream.definition.optBoolean("snapshot")){
                        modified=version;String stamp=stream.field(stream.modifiedColumn());if(stamp!=null)row.put(stamp,version);
                    }
                    try(Cursor previous=db.rawQuery("SELECT version FROM records WHERE scope=? AND stream=? AND identity=?",new String[]{scope,stream.id,identity})){
                        if(!stream.definition.optBoolean("snapshot")&&previous.moveToFirst()&&previous.getLong(0)>modified)continue;
                    }
                    merge(db,stream,row,full,modified);
                    db.execSQL("INSERT OR REPLACE INTO records(scope,stream,identity,version,payload) VALUES(?,?,?,?,?)",new Object[]{scope,stream.id,identity,modified,row.toString()});
                }
                check();db.execSQL("INSERT OR REPLACE INTO raw_pages(scope,stream,version,payload) VALUES(?,?,?,?)",new Object[]{scope,stream.id,version,raw});
                check();if(advance)db.execSQL("INSERT OR REPLACE INTO checkpoints(scope,stream,cursor,complete) VALUES(?,?,?,0)",new Object[]{scope,stream.id,version});
                SyncCommit.run(allowed,()->{check();db.setTransactionSuccessful();db.endTransaction();});
            }finally{if(db.inTransaction())db.endTransaction();}
        }}
        return rows.size();
    }
    private void merge(SQLiteDatabase db,CloudStream stream,JSONObject row,ContentValues full,long version)throws Exception {
        String table="history."+OfficialHistoryStore.q(stream.table),where=stream.where();String[] args=stream.arguments(full);
        try(Cursor old=db.rawQuery("SELECT rowid,* FROM "+table+" WHERE "+where,args)){
            if(old.moveToFirst()){
                do{long rowid=old.getLong(0);int sync=old.getColumnIndex("sync_status"),updated=old.getColumnIndex("updated");
                String stamp=stream.modifiedColumn();int pos=stamp.isEmpty()?-1:old.getColumnIndex(stamp);
                boolean dirty=sync>=0&&old.getInt(sync)==0||updated>=0&&old.getInt(updated)!=0;
                if(dirty||!stream.definition.optBoolean("snapshot")&&pos>=0&&old.getLong(pos)>version)continue;
                ContentValues patch=stream.values(row,account,false);
                if(stream.id.equals("mental-stat")&&latestPartial(db,stream,stream.identity(full)))patch.remove("avg_sleep_hrv");
                if(!stamp.isEmpty())patch.put(stamp,version);
                db.update(table,patch,"rowid=?",new String[]{Long.toString(rowid)});
                }while(old.moveToNext());
                // Keep every existing local ID while updating eligible copies of the same identity.
                return;
            }
        }
        String stamp=stream.modifiedColumn();if(!stamp.isEmpty()&&version>0)full.put(stamp,version);
        db.insertOrThrow(table,null,full);
    }
    static String canonical(Object value)throws Exception {
        if(value instanceof JSONObject){JSONObject j=(JSONObject)value;List<String> keys=new ArrayList<>();Iterator<String> it=j.keys();while(it.hasNext())keys.add(it.next());Collections.sort(keys);
            List<String> parts=new ArrayList<>();for(String k:keys)parts.add(JSONObject.quote(k)+":"+canonical(j.get(k)));return "{"+String.join(",",parts)+"}";}
        if(value instanceof JSONArray){JSONArray a=(JSONArray)value;List<String> parts=new ArrayList<>();for(int i=0;i<a.length();i++)parts.add(canonical(a.get(i)));return "["+String.join(",",parts)+"]";}
        return value==null||value==JSONObject.NULL?"null":value instanceof String?JSONObject.quote((String)value):value.toString();
    }
    private boolean latestPartial(SQLiteDatabase db,CloudStream stream,String identity){
        try(Cursor c=db.rawQuery("SELECT 1 FROM mutations_v2 m JOIN record_heads h ON h.scope=m.scope AND h.stream=m.stream AND h.identity=m.identity AND h.local_revision=m.local_revision WHERE m.scope=? AND m.stream=? AND m.identity=? AND m.state='PARTIAL' LIMIT 1",new String[]{scope,stream.id,identity})){return c.moveToFirst();}
    }
    static String fingerprint(JSONObject row)throws Exception {
        JSONObject business=new JSONObject(row.toString());for(String f:new String[]{"modifiedTime","modifiedTimestamp","syncStatus","updated","ssoid","clientDataId"})business.remove(f);
        return HealthArchive.hash(canonical(business).getBytes(StandardCharsets.UTF_8));
    }
    /** Enqueue only explicitly scoped native/user revisions; imported history is reconciled separately. */
    void enqueue(CloudStream stream,JSONObject immutable)throws Exception {enqueue(stream,immutable,null);}
    void enqueue(CloudStream stream,JSONObject immutable,String sourceEvent)throws Exception {enqueue(stream,immutable,sourceEvent,false,-1);}
    void enqueueNative(CloudStream stream,JSONObject immutable,String sourceEvent)throws Exception {enqueue(stream,immutable,sourceEvent,true,-1);}
    void enqueueNative(CloudStream stream,JSONObject immutable,String sourceEvent,long sequence)throws Exception {enqueue(stream,immutable,sourceEvent,true,sequence);}
    /** Recover a queue commit made before an older producer could save its checkpoint. */
    boolean replayNative(CloudStream stream,String event,long sequence)throws Exception {
        synchronized(OfficialHistoryStore.LOCK){check();try(SQLiteDatabase db=open();Cursor found=db.rawQuery("SELECT 1 FROM mutations_v2 WHERE scope=? AND stream=? AND source_event=?",new String[]{scope,stream.id,event})){
            if(!found.moveToFirst())return false;
            SyncCommit.run(allowed,()->{check();db.execSQL("INSERT OR REPLACE INTO producer_checkpoints(scope,stream,sequence) VALUES(?,?,?)",new Object[]{scope,producerKey(stream),sequence});});return true;
        }}
    }
    private void enqueue(CloudStream stream,JSONObject immutable,String sourceEvent,boolean project,long sequence)throws Exception {
        check();ContentValues val=stream.values(immutable,account,true);String identity=stream.identity(val),hash=fingerprint(immutable);
        synchronized(OfficialHistoryStore.LOCK){check();try(SQLiteDatabase db=open()){
            db.beginTransaction();try{
                if(sourceEvent!=null)try(Cursor prior=db.rawQuery("SELECT identity,hash FROM mutations_v2 WHERE scope=? AND stream=? AND source_event=?",new String[]{scope,stream.id,sourceEvent})){if(prior.moveToFirst()){if(!identity.equals(prior.getString(0))||!hash.equals(prior.getString(1)))throw new IOException("CLOUD_SOURCE_EVENT_CHANGED");return;}}
                long revision=0;try(Cursor current=db.rawQuery("SELECT local_revision,hash FROM record_heads WHERE scope=? AND stream=? AND identity=?",new String[]{scope,stream.id,identity})){if(current.moveToFirst()){revision=current.getLong(0);if(sourceEvent==null&&hash.equals(current.getString(1)))return;}}
                revision=Math.addExact(revision,1);String event=sourceEvent==null?UUID.randomUUID().toString():sourceEvent;
                JSONObject baseline=null;long baseVersion=stream.modified(immutable);
                try(Cursor base=db.rawQuery("SELECT payload,version FROM records WHERE scope=? AND stream=? AND identity=?",new String[]{scope,stream.id,identity})){if(base.moveToFirst()){baseline=new JSONObject(base.getString(0));baseVersion=base.getLong(1);}}
                String baseHash=baseline==null?"":fingerprint(baseline),origin=project?"watch":sourceEvent==null?"legacy":"explicit";
                // A newly read server baseline cannot establish that an imported dirty row was edited from it.
                boolean stale=origin.equals("legacy")&&baseline!=null&&!stream.sameBusiness(immutable,baseline)&&!stream.partiallyMatches(immutable,baseline)&&stream.modified(immutable)!=baseVersion;
                String state=stale?"CONFLICT":"READY";
                db.execSQL("INSERT INTO mutations_v2(id,scope,stream,identity,local_revision,source_event,payload,hash,state,created_at,base_version,base_hash,source_kind) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)",new Object[]{UUID.randomUUID().toString(),scope,stream.id,identity,revision,event,immutable.toString(),hash,state,System.currentTimeMillis(),baseVersion,baseHash,origin});
                db.execSQL("INSERT OR REPLACE INTO record_heads(scope,stream,identity,local_revision,hash) VALUES(?,?,?,?,?)",new Object[]{scope,stream.id,identity,revision,hash});
                if(project){
                    String table="history."+OfficialHistoryStore.q(stream.table);ContentValues patch=stream.values(immutable,account,false);
                    if(stream.has("sync_status")){val.put("sync_status",0);patch.put("sync_status",0);}if(stream.has("updated")){val.put("updated",1);patch.put("updated",1);}
                    if(db.update(table,patch,stream.where(),stream.arguments(val))==0)db.insertOrThrow(table,null,val);
                }
                if(sequence>=0)db.execSQL("INSERT OR REPLACE INTO producer_checkpoints(scope,stream,sequence) VALUES(?,?,?)",new Object[]{scope,producerKey(stream),sequence});
                SyncCommit.run(allowed,()->{check();db.setTransactionSuccessful();db.endTransaction();});
            }finally{if(db.inTransaction())db.endTransaction();}
        }}
    }
    List<JSONObject> pending(CloudStream stream)throws Exception {
        return pending(stream,null);
    }
    List<JSONObject> pending(CloudStream stream,String mutationId)throws Exception {
        return mutations(stream,mutationId,false,100);
    }
    List<JSONObject> partials(CloudStream stream,String mutationId,int limit)throws Exception {
        return mutations(stream,mutationId,true,Math.max(1,Math.min(100,limit)));
    }
    private List<JSONObject> mutations(CloudStream stream,String mutationId,boolean partial,int limit)throws Exception {
        String state=partial?"state='PARTIAL' AND local_revision=(SELECT local_revision FROM record_heads h WHERE h.scope=mutations_v2.scope AND h.stream=mutations_v2.stream AND h.identity=mutations_v2.identity)":"state IN ('READY','SENDING','ACK_UNKNOWN')";
        List<JSONObject> result=new ArrayList<>();synchronized(OfficialHistoryStore.LOCK){check();try(SQLiteDatabase db=open();Cursor c=db.rawQuery(
            "SELECT id,payload,state,local_revision,source_event,base_version,base_hash,remote_version,source_kind FROM mutations_v2 WHERE scope=? AND stream=? AND "+state+(mutationId==null?"":" AND id=?")+" ORDER BY CASE state WHEN 'SENDING' THEN 0 WHEN 'ACK_UNKNOWN' THEN 0 ELSE 1 END,CASE source_kind WHEN 'watch' THEN 0 ELSE 1 END,sequence LIMIT "+limit,
            mutationId==null?new String[]{scope,stream.id}:new String[]{scope,stream.id,mutationId})){while(c.moveToNext())result.add(new JSONObject().put("id",c.getString(0)).put("payload",new JSONObject(c.getString(1))).put("state",c.getString(2)).put("localRevision",c.getLong(3)).put("sourceEventId",c.getString(4)).put("baseVersion",c.getLong(5)).put("baseHash",c.getString(6)).put("remoteVersion",c.getLong(7)).put("sourceKind",c.getString(8)));}}return result;
    }
    void mutationState(String id,String state,long version)throws Exception {
        synchronized(OfficialHistoryStore.LOCK){check();try(SQLiteDatabase db=open()){SyncCommit.run(allowed,()->{check();db.execSQL("UPDATE mutations_v2 SET state=?,remote_version=? WHERE scope=? AND id=?",new Object[]{state,version,scope,id});});}}
    }
    JSONObject remote(CloudStream stream,JSONObject local)throws Exception {
        ContentValues val=stream.values(local,account,true);String identity=stream.identity(val);
        synchronized(OfficialHistoryStore.LOCK){check();try(SQLiteDatabase db=open();Cursor c=db.rawQuery("SELECT payload FROM records WHERE scope=? AND stream=? AND identity=?",new String[]{scope,stream.id,identity})){return c.moveToFirst()?new JSONObject(c.getString(0)):null;}}
    }
    boolean earlierUncertain(CloudStream stream,JSONObject mutation)throws Exception{return revisionExists(stream,mutation,"local_revision<? AND state IN ('SENDING','ACK_UNKNOWN')");}
    boolean newerAcknowledged(CloudStream stream,JSONObject mutation)throws Exception{return revisionExists(stream,mutation,"local_revision>? AND state IN ('ACKED','PARTIAL')");}
    private boolean revisionExists(CloudStream stream,JSONObject mutation,String condition)throws Exception {
        String identity=stream.identity(stream.values(mutation.getJSONObject("payload"),account,true));
        synchronized(OfficialHistoryStore.LOCK){check();try(SQLiteDatabase db=open();Cursor row=db.rawQuery("SELECT 1 FROM mutations_v2 WHERE scope=? AND stream=? AND identity=? AND "+condition+" LIMIT 1",new String[]{scope,stream.id,identity,Long.toString(mutation.getLong("localRevision"))})){return row.moveToFirst();}}
    }
    /** A sibling revision may follow our exact confirmed server revision, never an unrelated fresh baseline. */
    boolean followsAcknowledged(CloudStream stream,JSONObject mutation,JSONObject current)throws Exception {
        String source=mutation.optString("sourceKind","legacy");if(current==null||!(source.equals("watch")||source.equals("explicit")))return false;
        JSONObject sent=mutation.getJSONObject("payload");
        if(source.equals("watch")&&stream.id.equals("activity-stat"))for(String field:new String[]{"totalSteps","totalDistance","totalCalories","totalAltitudeOffset","totalDuration","totalWorkoutMinutes","totalMoveAboutTimes","totalStaticCal","sedentaryCounts","sedentaryTime"})if(sent.optLong(field)<current.optLong(field))return false;
        synchronized(OfficialHistoryStore.LOCK){check();try(SQLiteDatabase db=open();Cursor prior=db.rawQuery("SELECT payload,remote_version,state FROM mutations_v2 WHERE scope=? AND stream=? AND identity=? AND local_revision<? AND state IN ('ACKED','PARTIAL') ORDER BY local_revision DESC LIMIT 1",new String[]{scope,stream.id,stream.identity(stream.values(sent,account,true)),Long.toString(mutation.getLong("localRevision"))})){
            if(!prior.moveToFirst()||prior.getLong(1)<=0||prior.getLong(1)!=stream.modified(current))return false;
            JSONObject previous=new JSONObject(prior.getString(0));return stream.sameBusiness(previous,current)||prior.getString(2).equals("PARTIAL")&&stream.partiallyMatches(previous,current);
        }}
    }
    /** Only account-scoped official-schema rows with explicit dirty flags are candidates. */
    int captureDirty(CloudStream stream)throws Exception {
        if(stream.push.isEmpty()||pendingCount(stream)>=200)return 0;
        String dirty=stream.has("sync_status")?"sync_status=0":"";
        if(stream.has("updated"))dirty=dirty.isEmpty()?"updated<>0":"("+dirty+" OR updated<>0)";
        if(dirty.isEmpty())return 0;
        List<JSONObject> rows=new ArrayList<>();long through=0,last=0;
        synchronized(OfficialHistoryStore.LOCK){check();try(SQLiteDatabase db=open();Cursor marker=db.rawQuery("SELECT last_row FROM dirty_checkpoints WHERE scope=? AND stream=?",new String[]{scope,stream.id})){if(marker.moveToFirst())through=marker.getLong(0);}
        try(SQLiteDatabase db=open();Cursor c=db.rawQuery(
            "SELECT rowid,* FROM history."+OfficialHistoryStore.q(stream.table)+" WHERE ssoid=? AND "+dirty+" AND rowid>? ORDER BY rowid LIMIT 100",
            new String[]{account,Long.toString(through)})){while(c.moveToNext()){check();last=c.getLong(0);rows.add(stream.fromCursor(c));}}}
        for(JSONObject row:rows){
            if(!stream.hasMeasurements(row))continue;
            JSONObject baseline=remote(stream,row);
            if(baseline!=null){JSONObject merged=new JSONObject(baseline.toString());Iterator<String> names=row.keys();while(names.hasNext()){String field=names.next();merged.put(field,row.get(field));}row=merged;}
            enqueue(stream,row);
        }
        final long next=last;synchronized(OfficialHistoryStore.LOCK){check();try(SQLiteDatabase db=open()){SyncCommit.run(allowed,()->{check();db.execSQL("INSERT OR REPLACE INTO dirty_checkpoints(scope,stream,last_row) VALUES(?,?,?)",new Object[]{scope,stream.id,next});});}}
        return rows.size();
    }
    void acknowledge(CloudStream stream,JSONObject mutation,long version)throws Exception {
        acknowledge(stream,mutation,version,false);
    }
    void acknowledgePartial(CloudStream stream,JSONObject mutation,long version)throws Exception {
        acknowledge(stream,mutation,version,true);
    }
    private void acknowledge(CloudStream stream,JSONObject mutation,long version,boolean partial)throws Exception {
        JSONObject sent=mutation.getJSONObject("payload");ContentValues val=stream.values(sent,account,true);
        synchronized(OfficialHistoryStore.LOCK){check();try(SQLiteDatabase db=open()){
            db.beginTransaction();try{
                if(partial)try(Cursor receipt=db.rawQuery("SELECT payload FROM records WHERE scope=? AND stream=? AND identity=?",new String[]{scope,stream.id,stream.identity(val)})){
                    if(!receipt.moveToFirst())throw new IOException("CLOUD_PARTIAL_RECEIPT_MISSING");JSONObject current=new JSONObject(receipt.getString(0));
                    if(version<=0||version!=stream.modified(current)||!stream.partiallyMatches(sent,current)||current.has("display")&&current.optInt("display",1)==0&&sent.optInt("display",1)!=0)throw new IOException("CLOUD_PARTIAL_RECEIPT_MISMATCH");
                }
                String table="history."+OfficialHistoryStore.q(stream.table);
                long sentRevision;String identity=stream.identity(val);
                try(Cursor sentRow=db.rawQuery("SELECT local_revision FROM mutations_v2 WHERE scope=? AND stream=? AND identity=? AND id=?",new String[]{scope,stream.id,identity,mutation.getString("id")})){if(!sentRow.moveToFirst())throw new IOException("CLOUD_MUTATION_MISSING");sentRevision=sentRow.getLong(0);}
                long currentRevision=-1;try(Cursor head=db.rawQuery("SELECT local_revision FROM record_heads WHERE scope=? AND stream=? AND identity=?",new String[]{scope,stream.id,identity})){if(head.moveToFirst())currentRevision=head.getLong(0);}
                if(currentRevision==sentRevision)try(Cursor c=db.rawQuery("SELECT rowid,* FROM "+table+" WHERE "+stream.where(),stream.arguments(val))){
                    while(c.moveToNext()){
                        if(!stream.projectionFingerprint(stream.fromCursor(c)).equals(stream.projectionFingerprint(sent)))continue;
                        ContentValues patch=new ContentValues();
                        if(stream.has("sync_status"))patch.put("sync_status",1);
                        if(stream.has("updated"))patch.put("updated",0);
                        String column=stream.modifiedColumn();if(!column.isEmpty())patch.put(column,version);
                        if(patch.size()>0)db.update(table,patch,"rowid=?",new String[]{Long.toString(c.getLong(0))});
                    }
                }
                check();db.execSQL("UPDATE mutations_v2 SET state=?,remote_version=? WHERE scope=? AND id=?",
                    new Object[]{partial?"PARTIAL":"ACKED",version,scope,mutation.getString("id")});
                SyncCommit.run(allowed,()->{check();db.setTransactionSuccessful();db.endTransaction();});
            }finally{if(db.inTransaction())db.endTransaction();}
        }}
    }
    public void close(){}
}
