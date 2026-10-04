package com.example.opponotificationrelay;
import android.content.*;import android.database.Cursor;import android.database.sqlite.*;
import java.io.*;import java.util.*;import org.json.*;
import com.heytap.health.osahssdkself.bean.*;
/** Recording ownership is local and immutable; imported official results remain separate. */
public final class SnoreSessionStore extends SQLiteOpenHelper {
    public static final long MIN_SAMPLES=3600L*8000,MAX_SAMPLES=36000L*8000;
    private final File directory;
    public SnoreSessionStore(Context context){this(context,"snore-sessions.db","snore-recordings");}
    SnoreSessionStore(Context context,String database,String folder){super(context,database,null,1);directory=new File(context.getFilesDir(),folder);setWriteAheadLoggingEnabled(true);}
    @Override public void onConfigure(SQLiteDatabase db){db.setForeignKeyConstraintsEnabled(true);}
    @Override public void onCreate(SQLiteDatabase db){
        db.execSQL("CREATE TABLE sessions(id TEXT PRIMARY KEY,device TEXT NOT NULL,scope TEXT NOT NULL,started INTEGER NOT NULL,ended INTEGER NOT NULL DEFAULT 0,samples INTEGER NOT NULL DEFAULT 0,state TEXT NOT NULL,reason TEXT NOT NULL DEFAULT '',source INTEGER NOT NULL,slot INTEGER UNIQUE,summary TEXT NOT NULL DEFAULT '')");
        db.execSQL("CREATE TABLE features(session TEXT NOT NULL REFERENCES sessions(id) ON DELETE CASCADE,frame INTEGER NOT NULL,kind TEXT NOT NULL,body TEXT NOT NULL,PRIMARY KEY(session,frame,kind))");
    }
    @Override public void onUpgrade(SQLiteDatabase db,int a,int b){throw new IllegalStateException("SNORE_DB_VERSION");}
    public static final class Session {
        public final String id,device,scope,state,reason,summary;public final long started,ended,samples;public final int source;
        Session(Cursor c){id=c.getString(0);device=c.getString(1);scope=c.getString(2);started=c.getLong(3);ended=c.getLong(4);samples=c.getLong(5);state=c.getString(6);reason=c.getString(7);source=c.getInt(8);summary=c.getString(9);}
        public boolean active(){return state.equals("PREPARING")||state.equals("RECORDING")||state.equals("FINALIZING");}
    }
    private static final String COLUMNS="id,device,scope,started,ended,samples,state,reason,source,summary";
    public synchronized List<Session> list(){List<Session> rows=new ArrayList<>();try(Cursor c=getReadableDatabase().rawQuery("SELECT "+COLUMNS+" FROM sessions ORDER BY started DESC LIMIT 50",null)){while(c.moveToNext())rows.add(new Session(c));}return rows;}
    public synchronized Session get(String id){try(Cursor c=getReadableDatabase().rawQuery("SELECT "+COLUMNS+" FROM sessions WHERE id=?",new String[]{id})){return c.moveToFirst()?new Session(c):null;}}
    public File file(String id,boolean partial)throws IOException{if(id==null||!id.matches("[0-9a-f-]{36}"))throw new IOException("SNORE_ID");return new File(directory,id+(partial?".wav.part":".wav"));}
    public synchronized String create(String device,int source,long started)throws IOException {
        if(!directory.isDirectory()&&!directory.mkdirs())throw new IOException("SNORE_STORAGE");
        String id=UUID.randomUUID().toString();ContentValues v=new ContentValues();v.put("id",id);v.put("device",device==null?"":device);v.put("scope","local");v.put("started",started);v.put("state","PREPARING");v.put("source",source);v.put("slot",1);
        try{getWritableDatabase().insertOrThrow("sessions",null,v);}catch(SQLiteConstraintException busy){throw new IOException("SNORE_ALREADY_RECORDING");}return id;
    }
    public synchronized void progress(String id,String state,long samples){ContentValues v=new ContentValues();v.put("state",state);v.put("samples",samples);if(getWritableDatabase().update("sessions",v,"id=? AND slot=1",new String[]{id})!=1)throw new IllegalStateException("SNORE_SESSION_LOST");}
    private static JSONArray floats(float[] values)throws JSONException{JSONArray a=new JSONArray();if(values!=null){if(values.length>4096)throw new JSONException("SNORE_FEATURE_SIZE");for(float f:values)a.put(Float.isNaN(f)||Float.isInfinite(f)?JSONObject.NULL:(double)f);}return a;}
    private static JSONObject summary(OsaSummaryBean s)throws JSONException{return new JSONObject().put("resultCode",s.resultCode).put("AI",finite(s.AI)).put("REI",finite(s.REI)).put("audioStates",s.audioStates).put("meanRespRate",finite(s.meanRespRate)).put("silencedRatio",finite(s.silencedRatio)).put("silencedTime",s.silencedTime).put("snoreFeats",floats(s.snoreFeats)).put("snoreFreq",finite(s.snoreFreq)).put("snoreNum",s.snoreNum).put("totalSignalLen",s.totalSignalLen).put("validSignalLen",s.validSignalLen);}
    private static Object finite(float f){return Float.isNaN(f)||Float.isInfinite(f)?JSONObject.NULL:(double)f;}
    private void feature(String id,long frame,String kind,JSONObject body){ContentValues v=new ContentValues();v.put("session",id);v.put("frame",frame);v.put("kind",kind);v.put("body",body.toString());getWritableDatabase().insertOrThrow("features",null,v);}
    public synchronized void features(String id,long frame,SnoreInfoBean info)throws JSONException {
        if(info.snoreNum<0||info.snoreNum>128)throw new JSONException("SNORE_COUNT");
        if(info.snoreNum==0&&info.osaModelUpdateFlag==0)return;
        SQLiteDatabase db=getWritableDatabase();db.beginTransaction();try{
            if(info.snoreNum>0&&info.snoreDetailsBeanArray!=null){JSONArray array=new JSONArray();if(info.snoreDetailsBeanArray.length>128)throw new JSONException("SNORE_COUNT");for(SnoreDetailsBean b:info.snoreDetailsBeanArray)if(b!=null)array.put(new JSONObject().put("start",b.snoreStartTime).put("end",b.snoreEndTime).put("features",floats(b.snoreFeatureArray)));feature(id,frame,"snore",new JSONObject().put("count",info.snoreNum).put("details",array));}
            if(info.osaModelUpdateFlag!=0&&info.osaDetailsBean!=null){OsaDetailsBean b=info.osaDetailsBean;feature(id,frame,"model",new JSONObject().put("totalSignalLen",b.totalSignalLen).put("currentCount",b.curFrameSnoreNum).put("previousCount",b.lastFrameSnoreNum).put("features",floats(b.osaModelFeatureArray)));}
            db.setTransactionSuccessful();
        }finally{db.endTransaction();}
    }
    public synchronized void noise(String id,long minute,int[] bins)throws JSONException{JSONArray a=new JSONArray();for(int n:bins)a.put(n);feature(id,minute,"noise",new JSONObject().put("counts",a));}
    public synchronized void finish(String id,String state,String reason,long samples,OsaSummaryBean result)throws JSONException {
        ContentValues v=new ContentValues();v.put("state",state);v.put("reason",reason);v.put("samples",samples);Session old=get(id);if(old==null)throw new IllegalStateException("SNORE_SESSION_LOST");v.put("ended",old.started+samples*1000/8000);v.putNull("slot");if(result!=null)v.put("summary",summary(result).toString());
        if(getWritableDatabase().update("sessions",v,"id=? AND slot=1",new String[]{id})!=1)throw new IllegalStateException("SNORE_SESSION_LOST");
    }
    public synchronized void recoverAbandoned()throws IOException,JSONException {
        List<Session> active=new ArrayList<>();try(Cursor c=getReadableDatabase().rawQuery("SELECT "+COLUMNS+" FROM sessions WHERE slot=1",null)){while(c.moveToNext())active.add(new Session(c));}
        for(Session s:active){long n=s.samples;String reason="PROCESS_INTERRUPTED";try{n=SnoreWavWriter.recover(file(s.id,true),file(s.id,false));}catch(IOException e){reason="FILE_RECOVERY_FAILED";}finish(s.id,"INTERRUPTED",reason,n,null);}
    }
    public synchronized boolean delete(String id)throws IOException {
        Session s=get(id);if(s==null)return true;if(s.active())return false;
        for(boolean partial:new boolean[]{true,false}){File f=file(id,partial);if(f.exists()&&!f.delete())throw new IOException("SNORE_DELETE_FAILED");}
        return getWritableDatabase().delete("sessions","id=? AND slot IS NULL",new String[]{id})==1;
    }
    public long freeBytes(){return directory.isDirectory()?directory.getUsableSpace():directory.getParentFile().getUsableSpace();}
}
