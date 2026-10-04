package com.example.opponotificationrelay;
import android.database.Cursor;
import android.system.Os;
import org.json.*;
import java.io.*;
import java.nio.charset.StandardCharsets;
/** Complete logical snapshots, including the WAL; never writes the source database. */
final class RootHistoryExport {
    static String identifier(String s){return "\""+s.replace("\"","\"\"")+"\"";}
    static void exec(Object db,String sql)throws Exception {RootOfficialSettingsReader.stage="HISTORY_"+(sql.startsWith("ATTACH")?"ATTACH":sql.startsWith("BEGIN")?"BEGIN":sql.startsWith("COMMIT")?"COMMIT":sql.startsWith("PRAGMA")?"PRAGMA":"EXEC");if(sql.equals("BEGIN")||sql.equals("COMMIT")||sql.equals("ROLLBACK"))db.getClass().getMethod("rawExecSQL",String.class,Object[].class).invoke(db,sql,new Object[0]);else db.getClass().getMethod("execSQL",String.class).invoke(db,sql);}
    static JSONObject snapshot(Object source,File target,byte[] key)throws Exception {
        Class<?> type=source.getClass(),factory=Class.forName("net.zetetic.database.sqlcipher.SQLiteDatabase$CursorFactory"),handler=Class.forName("net.zetetic.database.DatabaseErrorHandler"),hook=Class.forName("net.zetetic.database.sqlcipher.SQLiteDatabaseHook");
        Object noRepair=java.lang.reflect.Proxy.newProxyInstance(handler.getClassLoader(),new Class<?>[]{handler},(p,m,a)->{throw new IOException("HISTORY_CORRUPT");});
        Object db=null;JSONObject counts=new JSONObject();
        try {
            RootOfficialSettingsReader.stage="HISTORY_OPEN_COPY";
            int flags=type.getField("OPEN_READWRITE").getInt(null)|type.getField("CREATE_IF_NECESSARY").getInt(null)|type.getField("NO_LOCALIZED_COLLATORS").getInt(null);
            db=type.getMethod("openDatabase",String.class,byte[].class,factory,int.class,handler,hook).invoke(null,target.getPath(),new byte[0],null,flags,noRepair,null);
            String path=(String)type.getMethod("getPath").invoke(source);
            RootOfficialSettingsReader.stage="HISTORY_ATTACH_READONLY";
            type.getMethod("execSQL",String.class,Object[].class).invoke(db,"ATTACH DATABASE ? AS official_source KEY ?",new Object[]{"file:"+path+"?mode=ro",key});
            exec(db,"BEGIN");
            try {
                RootOfficialSettingsReader.stage="HISTORY_COPY";
                try(Cursor c=RootOfficialSettingsReader.query(db,"SELECT count(*) FROM official_source.sqlite_master",null)){c.moveToFirst();}
                try(Cursor c=RootOfficialSettingsReader.query(db,"SELECT sqlcipher_export('main','official_source')",null)){c.moveToFirst();}
                RootOfficialSettingsReader.stage="HISTORY_COUNTS";
                try(Cursor tables=RootOfficialSettingsReader.query(db,"SELECT name FROM official_source.sqlite_master WHERE type='table' AND name NOT LIKE 'sqlite_%' ORDER BY name",null)){
                    while(tables.moveToNext()){String table=tables.getString(0),q=identifier(table);long a,b;
                        try(Cursor c=RootOfficialSettingsReader.query(db,"SELECT count(*) FROM official_source."+q,null)){c.moveToFirst();a=c.getLong(0);}
                        try(Cursor c=RootOfficialSettingsReader.query(db,"SELECT count(*) FROM main."+q,null)){c.moveToFirst();b=c.getLong(0);}
                        if(a!=b)throw new IOException("HISTORY_COUNT_MISMATCH");counts.put(table,a);
                    }
                }
                int version;try(Cursor c=RootOfficialSettingsReader.query(db,"PRAGMA official_source.user_version",null)){c.moveToFirst();version=c.getInt(0);}
                exec(db,"PRAGMA main.user_version="+version);exec(db,"COMMIT");
            }catch(Exception e){try{exec(db,"ROLLBACK");}catch(Exception ignored){}throw e;}
            exec(db,"DETACH DATABASE official_source");
            try(Cursor c=RootOfficialSettingsReader.query(db,"PRAGMA integrity_check",null)){if(!c.moveToFirst()||!"ok".equals(c.getString(0))||c.moveToNext())throw new IOException("HISTORY_INTEGRITY");}
        }finally{if(db!=null)type.getMethod("close").invoke(db);}
        Os.chmod(target.getPath(),0600);return counts;
    }
    static JSONObject run(Object main,String account,byte[] dbKey,String scratch)throws Exception {
        File out=new File(scratch,"export"),databases=new File(out,"databases");if(!databases.mkdir())throw new IOException("HISTORY_DIRECTORY");Os.chmod(databases.getPath(),0700);
        JSONObject manifest=new JSONObject().put("schema",1).put("account",account).put("scope",RootActivityBridge.scope(account,dbKey)).put("sleepScope",RootSleepSettingsReader.scope(account,dbKey)).put("readAt",System.currentTimeMillis());
        manifest.put("tables",snapshot(main,new File(databases,"database.db"),dbKey));
        File backup=RootOfficialSettingsReader.official("databases/bak_database.db");Object db=null;
        try{
            Class<?> type=main.getClass(),factory=Class.forName("net.zetetic.database.sqlcipher.SQLiteDatabase$CursorFactory"),handler=Class.forName("net.zetetic.database.DatabaseErrorHandler"),hook=Class.forName("net.zetetic.database.sqlcipher.SQLiteDatabaseHook");
            Object noRepair=java.lang.reflect.Proxy.newProxyInstance(handler.getClassLoader(),new Class<?>[]{handler},(p,m,a)->{throw new IOException("HISTORY_BACKUP_CORRUPT");});
            int flags=type.getField("OPEN_READONLY").getInt(null)|type.getField("NO_LOCALIZED_COLLATORS").getInt(null);
            db=type.getMethod("openDatabase",String.class,byte[].class,factory,int.class,handler,hook).invoke(null,backup.getPath(),dbKey,null,flags,noRepair,null);
            manifest.put("backupTables",snapshot(db,new File(databases,"bak_database.db"),dbKey));
        }finally{if(db!=null)db.getClass().getMethod("close").invoke(db);}
        File metadata=new File(out,"manifest.json");try(FileOutputStream stream=new FileOutputStream(metadata)){stream.write(manifest.toString().getBytes(StandardCharsets.UTF_8));stream.getFD().sync();}Os.chmod(metadata.getPath(),0600);
        return new JSONObject().put("status","OK").put("tables",manifest.getJSONObject("tables").length()).put("databases",2);
    }
}
