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
    private final Context context;final String account,scope;private final BooleanSupplier allowed;
    CloudStore(Context c,String account,BooleanSupplier allowed){context=c.getApplicationContext();this.account=account;this.scope=CloudSyncEngine.accountKey(account);this.allowed=allowed;}
    void check()throws IOException {if(!allowed.getAsBoolean()||Thread.currentThread().isInterrupted())throw new IOException("CLOUD_CANCELLED");}
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
            check();if(!context.getSharedPreferences("official_history",0).edit().putString("current",stage.getName()).commit())throw new IOException("CLOUD_STORAGE");
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
            db.execSQL("ATTACH DATABASE ? AS history",new Object[]{new File(folder,"databases/database.db").getPath()});
            journal(db,"history");db.execSQL("PRAGMA history.synchronous=FULL");
            ready=true;return db;
        }finally{if(!ready)db.close();}
    }
    long cursor(CloudStream stream)throws Exception {synchronized(OfficialHistoryStore.LOCK){check();try(SQLiteDatabase db=open();Cursor c=db.rawQuery("SELECT cursor FROM checkpoints WHERE scope=? AND stream=?",new String[]{scope,stream.id})){return c.moveToFirst()?c.getLong(0):0;}}}
    boolean complete(CloudStream stream)throws Exception {synchronized(OfficialHistoryStore.LOCK){check();try(SQLiteDatabase db=open();Cursor c=db.rawQuery("SELECT complete FROM checkpoints WHERE scope=? AND stream=?",new String[]{scope,stream.id})){return c.moveToFirst()&&c.getInt(0)==1;}}}
    void complete(CloudStream stream,long cursor)throws Exception {synchronized(OfficialHistoryStore.LOCK){check();try(SQLiteDatabase db=open()){db.execSQL("INSERT OR REPLACE INTO checkpoints(scope,stream,cursor,complete) VALUES(?,?,?,1)",new Object[]{scope,stream.id,cursor});}}}
    int savePage(CloudStream stream,JSONArray incoming,long version,CloudCrypto crypto)throws Exception {
        if(incoming.length()>20000)throw new IOException("CLOUD_RECORD_LIMIT");
        String raw=incoming.toString();incoming=stream.expanded(incoming);
        List<JSONObject> rows=new ArrayList<>();List<ContentValues> values=new ArrayList<>();List<String> identities=new ArrayList<>();
        for(int i=0;i<incoming.length();i++){check();JSONObject row=stream.decoded(incoming.getJSONObject(i),account,crypto);ContentValues val=stream.values(row,account,true);
            rows.add(row);values.add(val);identities.add(stream.identity(val));}
        synchronized(OfficialHistoryStore.LOCK){check();try(SQLiteDatabase db=open()){
            db.beginTransaction();try{
                for(int i=0;i<rows.size();i++){
                    check();JSONObject row=rows.get(i);ContentValues full=values.get(i);String identity=identities.get(i);
                    long modified=stream.modified(row);if(modified==0)modified=version;
                    try(Cursor previous=db.rawQuery("SELECT version FROM records WHERE scope=? AND stream=? AND identity=?",new String[]{scope,stream.id,identity})){
                        if(previous.moveToFirst()&&previous.getLong(0)>modified)continue;
                    }
                    merge(db,stream,row,full,modified);
                    db.execSQL("INSERT OR REPLACE INTO records(scope,stream,identity,version,payload) VALUES(?,?,?,?,?)",new Object[]{scope,stream.id,identity,modified,row.toString()});
                }
                check();db.execSQL("INSERT OR REPLACE INTO raw_pages(scope,stream,version,payload) VALUES(?,?,?,?)",new Object[]{scope,stream.id,version,raw});
                check();db.execSQL("INSERT OR REPLACE INTO checkpoints(scope,stream,cursor,complete) VALUES(?,?,?,0)",new Object[]{scope,stream.id,version});
                db.setTransactionSuccessful();
            }finally{db.endTransaction();}
        }}
        return rows.size();
    }
    private void merge(SQLiteDatabase db,CloudStream stream,JSONObject row,ContentValues full,long version)throws Exception {
        String table="history."+OfficialHistoryStore.q(stream.table),where=stream.where();String[] args=stream.arguments(full);
        try(Cursor old=db.rawQuery("SELECT rowid,* FROM "+table+" WHERE "+where,args)){
            if(old.moveToFirst()){
                long rowid=old.getLong(0);int sync=old.getColumnIndex("sync_status"),updated=old.getColumnIndex("updated");
                String stamp=stream.modifiedColumn();int pos=stamp.isEmpty()?-1:old.getColumnIndex(stamp);
                boolean dirty=sync>=0&&old.getInt(sync)==0||updated>=0&&old.getInt(updated)!=0;
                if(dirty||pos>=0&&old.getLong(pos)>version)return;
                ContentValues patch=stream.values(row,account,false);
                if(!stamp.isEmpty())patch.put(stamp,version);
                db.update(table,patch,"rowid=?",new String[]{Long.toString(rowid)});
                // Old official auto-ID tables may contain duplicate logical rows. Do not delete them here.
                return;
            }
        }
        String stamp=stream.modifiedColumn();if(!stamp.isEmpty())full.put(stamp,version);
        db.insertOrThrow(table,null,full);
    }
    static String canonical(Object value)throws Exception {
        if(value instanceof JSONObject){JSONObject j=(JSONObject)value;List<String> keys=new ArrayList<>();Iterator<String> it=j.keys();while(it.hasNext())keys.add(it.next());Collections.sort(keys);
            List<String> parts=new ArrayList<>();for(String k:keys)parts.add(JSONObject.quote(k)+":"+canonical(j.get(k)));return "{"+String.join(",",parts)+"}";}
        if(value instanceof JSONArray){JSONArray a=(JSONArray)value;List<String> parts=new ArrayList<>();for(int i=0;i<a.length();i++)parts.add(canonical(a.get(i)));return "["+String.join(",",parts)+"]";}
        return value==null||value==JSONObject.NULL?"null":value instanceof String?JSONObject.quote((String)value):value.toString();
    }
    static String fingerprint(JSONObject row)throws Exception {
        JSONObject business=new JSONObject(row.toString());for(String f:new String[]{"modifiedTime","modifiedTimestamp","syncStatus","updated","ssoid","clientDataId"})business.remove(f);
        return HealthArchive.hash(canonical(business).getBytes(StandardCharsets.UTF_8));
    }
    /** Enqueue only explicitly scoped native/user revisions; imported history is reconciled separately. */
    void enqueue(CloudStream stream,JSONObject immutable)throws Exception {
        check();ContentValues val=stream.values(immutable,account,true);String identity=stream.identity(val),hash=fingerprint(immutable);
        synchronized(OfficialHistoryStore.LOCK){check();try(SQLiteDatabase db=open()){
            db.execSQL("INSERT OR IGNORE INTO mutations(id,scope,stream,identity,payload,hash,state,created_at) VALUES(?,?,?,?,?,?,'READY',?)",
                new Object[]{UUID.randomUUID().toString(),scope,stream.id,identity,immutable.toString(),hash,System.currentTimeMillis()});
        }}
    }
    List<JSONObject> pending(CloudStream stream)throws Exception {
        List<JSONObject> result=new ArrayList<>();synchronized(OfficialHistoryStore.LOCK){check();try(SQLiteDatabase db=open();Cursor c=db.rawQuery(
            "SELECT id,payload,state FROM mutations WHERE scope=? AND stream=? AND state IN ('READY','ACK_UNKNOWN') ORDER BY created_at,id LIMIT 100",
            new String[]{scope,stream.id})){while(c.moveToNext())result.add(new JSONObject().put("id",c.getString(0)).put("payload",new JSONObject(c.getString(1))).put("state",c.getString(2)));}}return result;
    }
    void mutationState(String id,String state,long version)throws Exception {
        synchronized(OfficialHistoryStore.LOCK){check();try(SQLiteDatabase db=open()){db.execSQL("UPDATE mutations SET state=?,remote_version=? WHERE scope=? AND id=?",new Object[]{state,version,scope,id});}}
    }
    JSONObject remote(CloudStream stream,JSONObject local)throws Exception {
        ContentValues val=stream.values(local,account,true);String identity=stream.identity(val);
        synchronized(OfficialHistoryStore.LOCK){check();try(SQLiteDatabase db=open();Cursor c=db.rawQuery("SELECT payload FROM records WHERE scope=? AND stream=? AND identity=?",new String[]{scope,stream.id,identity})){return c.moveToFirst()?new JSONObject(c.getString(0)):null;}}
    }
    /** Only account-scoped official-schema rows with explicit dirty flags are candidates. */
    int captureDirty(CloudStream stream)throws Exception {
        if(stream.push.isEmpty())return 0;
        String dirty=stream.has("sync_status")?"sync_status=0":"";
        if(stream.has("updated"))dirty=dirty.isEmpty()?"updated<>0":"("+dirty+" OR updated<>0)";
        if(dirty.isEmpty())return 0;
        List<JSONObject> rows=new ArrayList<>();
        synchronized(OfficialHistoryStore.LOCK){check();try(SQLiteDatabase db=open();Cursor c=db.rawQuery(
            "SELECT * FROM history."+OfficialHistoryStore.q(stream.table)+" WHERE ssoid=? AND "+dirty+" LIMIT 100",
            new String[]{account})){while(c.moveToNext()){check();rows.add(stream.fromCursor(c));}}}
        for(JSONObject row:rows)enqueue(stream,row);return rows.size();
    }
    void acknowledge(CloudStream stream,JSONObject mutation,long version)throws Exception {
        JSONObject sent=mutation.getJSONObject("payload");ContentValues val=stream.values(sent,account,true);
        synchronized(OfficialHistoryStore.LOCK){check();try(SQLiteDatabase db=open()){
            db.beginTransaction();try{
                String table="history."+OfficialHistoryStore.q(stream.table);
                try(Cursor c=db.rawQuery("SELECT rowid,* FROM "+table+" WHERE "+stream.where(),stream.arguments(val))){
                    while(c.moveToNext()){
                        if(!fingerprint(stream.fromCursor(c)).equals(fingerprint(sent)))continue;
                        ContentValues patch=new ContentValues();
                        if(stream.has("sync_status"))patch.put("sync_status",1);
                        if(stream.has("updated"))patch.put("updated",0);
                        String column=stream.modifiedColumn();if(!column.isEmpty())patch.put(column,version);
                        if(patch.size()>0)db.update(table,patch,"rowid=?",new String[]{Long.toString(c.getLong(0))});
                    }
                }
                check();db.execSQL("UPDATE mutations SET state='ACKED',remote_version=? WHERE scope=? AND id=?",
                    new Object[]{version,scope,mutation.getString("id")});
                db.setTransactionSuccessful();
            }finally{db.endTransaction();}
        }}
    }
    public void close(){}
}
