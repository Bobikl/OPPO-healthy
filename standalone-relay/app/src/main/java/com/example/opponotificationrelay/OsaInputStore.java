package com.example.opponotificationrelay;
import android.content.*;import android.database.Cursor;import android.database.sqlite.*;import java.util.*;
/** Verified watch samples only; no account association or derived risk is inferred. */
public final class OsaInputStore extends SQLiteOpenHelper {
 public OsaInputStore(Context context){super(context,"osa-inputs.db",null,1);setWriteAheadLoggingEnabled(true);}
 @Override public void onCreate(SQLiteDatabase db){db.execSQL("CREATE TABLE samples(device TEXT NOT NULL,kind TEXT NOT NULL,stamp INTEGER NOT NULL,value INTEGER NOT NULL,PRIMARY KEY(device,kind,stamp))");db.execSQL("CREATE TABLE ranges(device TEXT NOT NULL,kind TEXT NOT NULL,start INTEGER NOT NULL,end INTEGER NOT NULL,read_at INTEGER NOT NULL,PRIMARY KEY(device,kind,start,end))");}
 @Override public void onUpgrade(SQLiteDatabase db,int a,int b){throw new IllegalStateException("OSA_INPUT_VERSION");}
 public synchronized void commit(String device,String kind,int start,int end,List<OsaWatchProtocol.Samples> pages){if(device==null||device.isEmpty()||(!kind.equals("sensor")&&!kind.equals("hrv")))throw new IllegalArgumentException("OSA_INPUT_SCOPE");SQLiteDatabase db=getWritableDatabase();db.beginTransaction();try{
  for(OsaWatchProtocol.Samples page:pages)for(int i=0;i<page.timestamps.length;i++){int stamp=page.timestamps[i];if(stamp<start||stamp>end)continue;ContentValues v=new ContentValues();v.put("device",device);v.put("kind",kind);v.put("stamp",stamp);v.put("value",page.values[i]);db.insertWithOnConflict("samples",null,v,SQLiteDatabase.CONFLICT_REPLACE);}
  ContentValues v=new ContentValues();v.put("device",device);v.put("kind",kind);v.put("start",start);v.put("end",end);v.put("read_at",System.currentTimeMillis());db.insertWithOnConflict("ranges",null,v,SQLiteDatabase.CONFLICT_REPLACE);db.setTransactionSuccessful();
 }finally{db.endTransaction();}}
 public synchronized NavigableMap<Integer,Integer> samples(String device,String kind,int start,int end){NavigableMap<Integer,Integer> result=new TreeMap<>();try(Cursor c=getReadableDatabase().rawQuery("SELECT stamp,value FROM samples WHERE device=? AND kind=? AND stamp>=? AND stamp<? ORDER BY stamp LIMIT 2881",new String[]{device,kind,""+start,""+end})){while(c.moveToNext())result.put(c.getInt(0),c.getInt(1));}return result;}
}
