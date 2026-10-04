package com.example.opponotificationrelay;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import org.json.*;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.time.*;
import java.util.*;
/** Private, complete official-schema archives. Readers never open another app's files. */
final class OfficialHistoryStore {
    static final Object LOCK=new Object();
    private static SharedPreferences prefs(Context c){return c.getSharedPreferences("official_history",0);}
    static boolean allowed(Context c){return prefs(c).getBoolean("allow_official",true);}
    static void requireAllowed(Context c){if(!allowed(c))throw new IllegalStateException("OFFICIAL_ACCESS_DISABLED");}
    private static final Set<Process> officialReaders=new HashSet<>();
    static synchronized Process launch(Context c,ProcessBuilder builder)throws Exception {requireAllowed(c);Process child=builder.start();officialReaders.add(child);return child;}
    static synchronized void release(Process process){officialReaders.remove(process);}
    static synchronized void setAllowed(Context c,boolean allowed){
        if(!prefs(c).edit().putBoolean("allow_official",allowed).commit())throw new IllegalStateException("HISTORY_SAVE");
        if(!allowed){for(Process child:officialReaders){try{child.getOutputStream().close();}catch(Exception ignored){}child.destroy();}officialReaders.clear();}
    }
    static File root(Context c){return new File(c.getFilesDir(),"official-history");}
    static File current(Context c){String name=prefs(c).getString("current","");return name.matches("stage-[0-9a-f-]{36}")?new File(root(c),name):null;}
    static boolean available(Context c){File f=current(c);return f!=null&&new File(f,"manifest.json").isFile();}
    static String status(Context c){return prefs(c).getString("last_result",available(c)?"已保存完整历史副本":"尚未导入完整个人数据");}
    static JSONObject json(File file)throws Exception {return new JSONObject(new String(Files.readAllBytes(file.toPath()),StandardCharsets.UTF_8));}
    static SQLiteDatabase open(File f){SQLiteDatabase db=SQLiteDatabase.openDatabase(f.getPath(),null,SQLiteDatabase.OPEN_READONLY|SQLiteDatabase.NO_LOCALIZED_COLLATORS,failed->{throw new IllegalStateException("HISTORY_CORRUPT");});db.execSQL("PRAGMA query_only=ON");return db;}
    static JSONObject read(Context c,JSONObject request)throws Exception {
        synchronized(LOCK){File directory=current(c);if(directory==null)throw new IOException("HISTORY_NOT_IMPORTED");JSONObject meta=json(new File(directory,"manifest.json"));
            try(SQLiteDatabase db=open(new File(directory,"databases/database.db"))){String op=request.getString("operation"),account=meta.getString("account"),scope=meta.getString("scope"),field;JSONObject value;
                if("readHealth".equals(op)||"readHeartRaw".equals(op)){field="health";value=RootHealthDataReader.readLocal(db,account,scope,request);}
                else if("readSleep".equals(op)){field="sleep";value=RootSleepSettingsReader.readLocal(db,account,meta.getString("sleepScope"));}
                else if("readActivity".equals(op)){field="activity";value=RootActivityBridge.readLocal(db,account,request.getString("device").toUpperCase(Locale.ROOT),scope,"20150101","21000101");}
                else throw new IOException("OFFICIAL_ACCESS_DISABLED");
                return new JSONObject().put("schema",1).put("status","OK").put(field,value);
            }
        }
    }
    interface Progress {void update(int percent,String message);}
    static void remove(File f)throws Exception {if(f==null||!f.exists())return;if(Files.isSymbolicLink(f.toPath()))throw new IOException("HISTORY_LINK");if(f.isDirectory()){File[] files=f.listFiles();if(files==null)throw new IOException("HISTORY_LIST");for(File child:files)remove(child);}if(!f.delete())throw new IOException("HISTORY_CLEANUP");}
    static String q(String s){return "\""+s.replace("\"","\"\"")+"\"";}
    static long scalar(SQLiteDatabase db,String sql){try(Cursor c=db.rawQuery(sql,null)){if(!c.moveToFirst())return 0;return c.getLong(0);}}
    static void integrity(SQLiteDatabase db)throws Exception {try(Cursor c=db.rawQuery("PRAGMA integrity_check",null)){if(!c.moveToFirst()||!"ok".equals(c.getString(0))||c.moveToNext())throw new IOException("HISTORY_INTEGRITY");}}
    static List<String> tables(SQLiteDatabase db){List<String> names=new ArrayList<>();try(Cursor c=db.rawQuery("SELECT name FROM sqlite_master WHERE type='table' AND name NOT LIKE 'sqlite_%' AND name<>'room_master_table' ORDER BY name",null)){while(c.moveToNext())names.add(c.getString(0));}return names;}
    static long[] merge(SQLiteDatabase db,File incoming,Progress progress)throws Exception {
        db.execSQL("ATTACH DATABASE ? AS incoming",new Object[]{incoming.getPath()});long added=0,updated=0;List<String> names=tables(db);
        try{
            List<String> incomingNames=new ArrayList<>();try(Cursor c=db.rawQuery("SELECT name FROM incoming.sqlite_master WHERE type='table' AND name NOT LIKE 'sqlite_%' AND name<>'room_master_table' ORDER BY name",null)){while(c.moveToNext())incomingNames.add(c.getString(0));}
            if(!names.equals(incomingNames))throw new IOException("HISTORY_SCHEMA_CHANGED");
            for(String table:names){List<String> a=new ArrayList<>(),b=new ArrayList<>();for(String source:new String[]{"main","incoming"})try(Cursor c=db.rawQuery("PRAGMA "+source+".table_info("+q(table)+")",null)){while(c.moveToNext())(source.equals("main")?a:b).add(c.getString(1)+":"+c.getString(2)+":"+c.getInt(3)+":"+c.getInt(5));}if(!a.equals(b))throw new IOException("HISTORY_SCHEMA_CHANGED");}
            db.beginTransaction();try{int index=0;for(String table:names){String t=q(table);List<String> columns=new ArrayList<>(),primary=new ArrayList<>();String timestamp=null;
                    try(Cursor c=db.rawQuery("PRAGMA table_info("+t+")",null)){while(c.moveToNext()){String col=c.getString(1);columns.add(col);if(c.getInt(5)>0)primary.add(col);}}
                    for(String stamp:new String[]{"modified_timestamp","modified_time","update_timestamp","update_time"})if(columns.contains(stamp)){timestamp=stamp;break;}
                    String fields="";for(String col:columns)fields+=(fields.isEmpty()?"":",")+q(col);
                    long before=scalar(db,"SELECT count(*) FROM main."+t);String identity="";
                    for(String key:primary.isEmpty()?columns:primary)identity+=(identity.isEmpty()?"":" AND ")+"old."+q(key)+" IS src."+q(key);
                    long expected=scalar(db,"SELECT count(*) FROM incoming."+t+" AS src WHERE NOT EXISTS (SELECT 1 FROM main."+t+" AS old WHERE "+identity+")");
                    if(!primary.isEmpty()){String join="",different="";for(String key:primary)join+=(join.isEmpty()?"":" AND ")+"old."+q(key)+" IS src."+q(key);
                        for(String col:columns)if(!primary.contains(col))different+=(different.isEmpty()?"":" OR ")+"old."+q(col)+" IS NOT src."+q(col);
                        if(!different.isEmpty()){String newer=timestamp==null?"":" AND COALESCE(src."+q(timestamp)+",0)>=COALESCE(old."+q(timestamp)+",0)";
                            db.execSQL("INSERT OR REPLACE INTO main."+t+" ("+fields+") SELECT "+fields+" FROM incoming."+t+" AS src WHERE EXISTS (SELECT 1 FROM main."+t+" AS old WHERE "+join+" AND ("+different+")"+newer+")");updated+=scalar(db,"SELECT changes()");}}
                    if(primary.isEmpty()){String equal="";for(String col:columns)equal+=(equal.isEmpty()?"":" AND ")+"old."+q(col)+" IS src."+q(col);
                        db.execSQL("INSERT OR IGNORE INTO main."+t+" ("+fields+") SELECT "+fields+" FROM incoming."+t+" AS src WHERE NOT EXISTS (SELECT 1 FROM main."+t+" AS old WHERE "+equal+")");
                    }else db.execSQL("INSERT OR IGNORE INTO main."+t+" ("+fields+") SELECT "+fields+" FROM incoming."+t);
                    long after=scalar(db,"SELECT count(*) FROM main."+t);if(after-before!=expected)throw new IOException("HISTORY_MERGE_CONFLICT");added+=after-before;
                    progress.update(45+(++index*35/Math.max(1,names.size())),"正在合并个人数据（"+index+"/"+names.size()+" 张表）");
                }db.setTransactionSuccessful();}finally{db.endTransaction();}
        }finally{db.execSQL("DETACH DATABASE incoming");}return new long[]{added,updated};
    }
    static String latest(SQLiteDatabase db)throws Exception {
        LocalDate latest=null,today=LocalDate.now();for(String table:tables(db)){List<String> columns=new ArrayList<>();try(Cursor c=db.rawQuery("PRAGMA table_info("+q(table)+")",null)){while(c.moveToNext())columns.add(c.getString(1));}
            for(String name:new String[]{"date","data_created_timestamp","start_timestamp","measurement_timestamp","sleep_out_timestamp","start_time"}){if(!columns.contains(name))continue;long value=scalar(db,"SELECT max("+q(name)+") FROM "+q(table));LocalDate day=null;
                try{if(value>=20100101&&value<=20991231)day=LocalDate.parse(Long.toString(value),java.time.format.DateTimeFormatter.BASIC_ISO_DATE);else if(value>=1262304000000L&&value<=System.currentTimeMillis()+86400000L)day=Instant.ofEpochMilli(value).atZone(ZoneId.systemDefault()).toLocalDate();}catch(Exception ignored){}
                if(day!=null&&!day.isAfter(today)&&(latest==null||day.isAfter(latest)))latest=day;
            }
        }return latest==null?"暂无带日期的记录":latest.toString();
    }
    static String importAll(Context c,Progress progress)throws Exception {
        requireAllowed(c);File root=root(c);if(!root.exists()&&!root.mkdirs())throw new IOException("HISTORY_DIRECTORY");
        if(root.getUsableSpace()<400L*1024*1024)throw new IOException("HISTORY_SPACE");File stage=new File(root,"stage-"+UUID.randomUUID());if(!stage.mkdir())throw new IOException("HISTORY_DIRECTORY");boolean published=false;
        try{
            progress.update(5,"正在读取官方主库和备份库，包含所有历史表…");
            new OfficialSettingsClient(c).exportHistory(stage);
            requireAllowed(c);progress.update(35,"正在核对完整数据库及个人资料…");JSONObject meta=json(new File(stage,"manifest.json"));File imported=new File(stage,"databases/database.db");
            try(SQLiteDatabase db=open(imported)){integrity(db);JSONObject counts=meta.getJSONObject("tables");for(String table:tables(db))if(scalar(db,"SELECT count(*) FROM "+q(table))!=counts.getLong(table))throw new IOException("HISTORY_COUNT_MISMATCH");}
            long added=0,updated=0;String latest;int count;
            synchronized(LOCK){requireAllowed(c);File old=current(c);
                if(old!=null){JSONObject previous=json(new File(old,"manifest.json"));if(!meta.getString("account").equals(previous.getString("account")))throw new IOException("HISTORY_ACCOUNT_CHANGED");
                    File incoming=new File(stage,"databases/incoming.db");if(!imported.renameTo(incoming))throw new IOException("HISTORY_RENAME");Files.copy(new File(old,"databases/database.db").toPath(),imported.toPath());
                    try(SQLiteDatabase db=SQLiteDatabase.openDatabase(imported.getPath(),null,SQLiteDatabase.OPEN_READWRITE|SQLiteDatabase.NO_LOCALIZED_COLLATORS)){long[] changes=merge(db,incoming,progress);added=changes[0];updated=changes[1];integrity(db);}remove(incoming);
                }else {progress.update(65,"首次导入：保存全部个人数据及原始表结构…");try(SQLiteDatabase db=open(imported)){for(String table:tables(db))added+=scalar(db,"SELECT count(*) FROM "+q(table));}}
                progress.update(85,"正在检查合并结果与最新记录日期…");
                try(SQLiteDatabase db=open(imported)){integrity(db);latest=latest(db);count=tables(db).size();JSONObject counts=new JSONObject();for(String table:tables(db))counts.put(table,scalar(db,"SELECT count(*) FROM "+q(table)));meta.put("tables",counts);}
                meta.put("added",added).put("updated",updated).put("latestDate",latest).put("mergedAt",System.currentTimeMillis());
                try(FileOutputStream out=new FileOutputStream(new File(stage,"manifest.json"))){out.write(meta.toString().getBytes(StandardCharsets.UTF_8));out.getFD().sync();}
                requireAllowed(c);String result="合并成功\n新增 "+added+" 条，更新 "+updated+" 条\n最新记录日期："+latest+"\n已保存主库与备份库，主库共 "+count+" 张表\n错误：无";
                if(!prefs(c).edit().putString("current",stage.getName()).putString("last_result",result).commit())throw new IOException("HISTORY_SAVE");published=true;
                // The pointer is committed only after all checks; previous data remains intact on failure.
                if(old!=null)try{remove(old);}catch(Exception ignored){}
                try{HealthDataManager.get(c).historyChanged();}catch(Exception ignored){}progress.update(100,result);return result;
            }
        }finally{if(!published)try{remove(stage);}catch(Exception ignored){}}
    }
}
