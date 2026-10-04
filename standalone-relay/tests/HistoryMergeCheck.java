package com.example.opponotificationrelay;
import android.database.sqlite.SQLiteDatabase;
import java.io.File;
public final class HistoryMergeCheck {
 static void check(boolean value,String reason){if(!value)throw new AssertionError(reason);}
 static void schema(SQLiteDatabase db){db.execSQL("CREATE TABLE readings(account TEXT NOT NULL,stamp INTEGER NOT NULL,value INTEGER,modified_time INTEGER,PRIMARY KEY(account,stamp))");db.execSQL("CREATE TABLE profile(id INTEGER PRIMARY KEY,value TEXT)");db.execSQL("CREATE TABLE z_unique(id INTEGER PRIMARY KEY,name TEXT UNIQUE)");}
 public static void main(String[] args)throws Exception {
  File dir=new File("/data/local/tmp/history-merge-check-170");if(!dir.exists()&&!dir.mkdir())throw new Exception("DIRECTORY");File a=new File(dir,"a.db"),b=new File(dir,"b.db");
  try(SQLiteDatabase old=SQLiteDatabase.openOrCreateDatabase(a,null);SQLiteDatabase incoming=SQLiteDatabase.openOrCreateDatabase(b,null)){
   schema(old);schema(incoming);old.execSQL("INSERT INTO readings VALUES('test',1,10,100),('test',2,20,300),('test',3,30,100)");incoming.execSQL("INSERT INTO readings VALUES('test',1,11,200),('test',2,99,200),('test',4,40,100)");
   old.execSQL("INSERT INTO profile VALUES(1,'old')");incoming.execSQL("INSERT INTO profile VALUES(1,'new')");
   long[] first=OfficialHistoryStore.merge(old,b,(p,m)->{});check(first[0]==1&&first[1]==2,"COUNTS");check(OfficialHistoryStore.scalar(old,"SELECT value FROM readings WHERE stamp=2")==20,"NEWER_LOCAL_PRESERVED");check(OfficialHistoryStore.scalar(old,"SELECT count(*) FROM readings WHERE stamp=3")==1,"ABSENT_ROW_PRESERVED");
   long[] second=OfficialHistoryStore.merge(old,b,(p,m)->{});check(second[0]==0&&second[1]==0,"REPEAT_DEDUP");
   incoming.execSQL("INSERT INTO readings VALUES('test',5,50,100)");old.execSQL("INSERT INTO z_unique VALUES(1,'duplicate')");incoming.execSQL("INSERT INTO z_unique VALUES(2,'duplicate')");
   boolean conflict=false;try{OfficialHistoryStore.merge(old,b,(p,m)->{});}catch(Exception failure){conflict="HISTORY_MERGE_CONFLICT".equals(failure.getMessage());}
   check(conflict,"CONFLICT_ERROR");check(OfficialHistoryStore.scalar(old,"SELECT count(*) FROM readings WHERE stamp=5")==0,"TRANSACTION_ROLLBACK");check(OfficialHistoryStore.scalar(old,"SELECT id FROM z_unique")==1,"ORIGINAL_PRESERVED");
   incoming.execSQL("CREATE TABLE unexpected(id INTEGER PRIMARY KEY)");boolean changed=false;try{OfficialHistoryStore.merge(old,b,(p,m)->{});}catch(Exception failure){changed="HISTORY_SCHEMA_CHANGED".equals(failure.getMessage());}check(changed,"SCHEMA_REJECTED");
   OfficialHistoryStore.integrity(old);System.out.println("HISTORY_TEST PASS additions=1 updates=2 repeat=0 newer-preserved=true missing-preserved=true conflict-rollback=true schema-rejected=true");
  }finally{for(File f:dir.listFiles())if(!f.delete())throw new Exception("CLEANUP");if(!dir.delete())throw new Exception("CLEANUP");}
 }
}