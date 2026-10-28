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
        synchronized(SyncCommit.LOCK){if(!prefs(c).edit().putBoolean("allow_official",allowed).commit())throw new IllegalStateException("HISTORY_SAVE");}
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
    static long[] merge(SQLiteDatabase db,File incoming,Progress progress)throws Exception {return merge(db,incoming,progress,new ArrayList<>());}
    static long[] merge(SQLiteDatabase db,File incoming,Progress progress,List<String> preserved)throws Exception {
        db.execSQL("ATTACH DATABASE ? AS incoming",new Object[]{incoming.getPath()});long added=0,updated=0;List<String> names=tables(db);
        try{
            List<String> incomingNames=new ArrayList<>();try(Cursor rows=db.rawQuery("SELECT name FROM incoming.sqlite_master WHERE type='table' AND name NOT LIKE 'sqlite_%' AND name<>'room_master_table' ORDER BY name",null)){while(rows.moveToNext())incomingNames.add(rows.getString(0));}
            if(!names.equals(incomingNames))throw new IOException("HISTORY_SCHEMA_CHANGED");
            for(String table:names){List<String> first=new ArrayList<>(),second=new ArrayList<>();for(String source:new String[]{"main","incoming"})try(Cursor rows=db.rawQuery("PRAGMA "+source+".table_info("+q(table)+")",null)){while(rows.moveToNext())(source.equals("main")?first:second).add(rows.getString(1)+":"+rows.getString(2)+":"+rows.getInt(3)+":"+rows.getInt(5));}if(!first.equals(second))throw new IOException("HISTORY_SCHEMA_CHANGED");}
            db.beginTransaction();try{int index=0;for(String table:names){
                String t=q(table);List<String> columns=new ArrayList<>(),primary=new ArrayList<>();String timestamp=null;
                try(Cursor rows=db.rawQuery("PRAGMA table_info("+t+")",null)){while(rows.moveToNext()){String column=rows.getString(1);columns.add(column);if(rows.getInt(5)>0)primary.add(column);}}
                boolean auto=false;try(Cursor rows=db.rawQuery("SELECT sql FROM sqlite_master WHERE type='table' AND name=?",new String[]{table})){if(rows.moveToFirst())auto=rows.getString(0).toUpperCase(Locale.ROOT).contains("AUTOINCREMENT");}
                List<String> registered=HistoryKeys.known(table),keys=registered!=null?registered:primary.isEmpty()?columns:primary;
                if(auto&&registered==null){if(scalar(db,"SELECT count(*) FROM incoming."+t)>0)preserved.add(table);continue;}
                if(!columns.containsAll(keys))throw new IOException("HISTORY_SCHEMA_CHANGED");
                for(String candidate:new String[]{"modified_timestamp","modified_time","update_timestamp","update_time"})if(columns.contains(candidate)){timestamp=candidate;break;}
                List<String> copied=new ArrayList<>(columns);if(auto)copied.removeAll(primary);
                String fields=joinFields(copied,""),identity=joinKeys(keys,"old","src"),dedupe="";
                if(registered!=null){String same=joinKeys(keys,"newer","src");String newer=timestamp==null?"newer.rowid>src.rowid":"(COALESCE(newer."+q(timestamp)+",0)>COALESCE(src."+q(timestamp)+",0) OR (COALESCE(newer."+q(timestamp)+",0)=COALESCE(src."+q(timestamp)+",0) AND newer.rowid>src.rowid))";dedupe=" AND NOT EXISTS (SELECT 1 FROM incoming."+t+" AS newer WHERE "+same+" AND "+newer+")";}
                long before=scalar(db,"SELECT count(*) FROM main."+t),expected=scalar(db,"SELECT count(*) FROM incoming."+t+" AS src WHERE NOT EXISTS (SELECT 1 FROM main."+t+" AS old WHERE "+identity+")"+dedupe);
                String dirty=columns.contains("sync_status")?" AND COALESCE(old.sync_status,1)<>0":"";if(columns.contains("updated"))dirty+=" AND COALESCE(old.updated,0)=0";
                String newer=timestamp==null?"":" AND COALESCE(src."+q(timestamp)+",0)>=COALESCE(old."+q(timestamp)+",0)",different="",patch="";
                for(String column:copied)if(!keys.contains(column)){
                    different+=(different.isEmpty()?"":" OR ")+"old."+q(column)+" IS NOT src."+q(column);
                    String value="src."+q(column);
                    if(table.equals("DBPhysicalMentalStat")&&column.equals("avg_sleep_hrv"))value="CASE WHEN COALESCE(src."+q(column)+",0)<=0 AND old."+q(column)+">0 THEN old."+q(column)+" ELSE "+value+" END";
                    patch+=(patch.isEmpty()?"":",")+q(column)+"=(SELECT "+value+" FROM incoming."+t+" AS src WHERE "+identity+dedupe+" LIMIT 1)";
                }
                if(!patch.isEmpty()){
                    db.execSQL("UPDATE main."+t+" AS old SET "+patch+" WHERE EXISTS (SELECT 1 FROM incoming."+t+" AS src WHERE "+identity+dedupe+" AND ("+different+")"+newer+")"+dirty);updated+=scalar(db,"SELECT changes()");
                }
                db.execSQL("INSERT OR IGNORE INTO main."+t+" ("+fields+") SELECT "+joinFields(copied,"src.")+" FROM incoming."+t+" AS src WHERE NOT EXISTS (SELECT 1 FROM main."+t+" AS old WHERE "+identity+")"+dedupe);
                long after=scalar(db,"SELECT count(*) FROM main."+t);if(after-before!=expected)throw new IOException("HISTORY_MERGE_CONFLICT");added+=after-before;
                progress.update(45+(++index*35/Math.max(1,names.size())),"正在合并个人数据（"+index+"/"+names.size()+" 张表）");
            }db.setTransactionSuccessful();}finally{db.endTransaction();}
        }finally{db.execSQL("DETACH DATABASE incoming");}return new long[]{added,updated};
    }
    private static String joinFields(List<String> columns,String prefix){List<String> fields=new ArrayList<>();for(String column:columns)fields.add(prefix+q(column));return String.join(",",fields);}
    private static String joinKeys(List<String> keys,String left,String right){List<String> fields=new ArrayList<>();for(String key:keys)fields.add(left+"."+q(key)+" IS "+right+"."+q(key));return String.join(" AND ",fields);}
    static String latest(SQLiteDatabase db)throws Exception {
        LocalDate latest=null,today=LocalDate.now();for(String table:tables(db)){List<String> columns=new ArrayList<>();try(Cursor c=db.rawQuery("PRAGMA table_info("+q(table)+")",null)){while(c.moveToNext())columns.add(c.getString(1));}
            for(String name:new String[]{"date","data_created_timestamp","start_timestamp","measurement_timestamp","sleep_out_timestamp","start_time"}){if(!columns.contains(name))continue;long value=scalar(db,"SELECT max("+q(name)+") FROM "+q(table));LocalDate day=null;
                try{if(value>=20100101&&value<=20991231)day=LocalDate.parse(Long.toString(value),java.time.format.DateTimeFormatter.BASIC_ISO_DATE);else if(value>=1262304000000L&&value<=System.currentTimeMillis()+86400000L)day=Instant.ofEpochMilli(value).atZone(ZoneId.systemDefault()).toLocalDate();}catch(Exception ignored){}
                if(day!=null&&!day.isAfter(today)&&(latest==null||day.isAfter(latest)))latest=day;
            }
        }return latest==null?"暂无带日期的记录":latest.toString();
    }
    static String importAll(Context c,Progress progress)throws Exception {
        requireAllowed(c);long accountEpoch=HealthAccountStore.generation();File root=root(c);if(!root.exists()&&!root.mkdirs())throw new IOException("HISTORY_DIRECTORY");
        if(root.getUsableSpace()<400L*1024*1024)throw new IOException("HISTORY_SPACE");File stage=new File(root,"stage-"+UUID.randomUUID());if(!stage.mkdir())throw new IOException("HISTORY_DIRECTORY");boolean published=false;
        try{
            progress.update(5,"正在读取官方主库和备份库，包含所有历史表…");
            new OfficialSettingsClient(c).exportHistory(stage);
            requireAllowed(c);progress.update(35,"正在核对完整数据库及个人资料…");JSONObject meta=json(new File(stage,"manifest.json"));File imported=new File(stage,"databases/database.db");
            try(SQLiteDatabase db=open(imported)){integrity(db);JSONObject counts=meta.getJSONObject("tables");for(String table:tables(db))if(scalar(db,"SELECT count(*) FROM "+q(table))!=counts.getLong(table))throw new IOException("HISTORY_COUNT_MISMATCH");}
            long added=0,updated=0;String latest;int count;List<String> preserved=new ArrayList<>();
            synchronized(LOCK){requireAllowed(c);HealthAccountStore.requireAccount(c,meta.getString("account"));File old=current(c);
                if(old!=null){JSONObject previous=json(new File(old,"manifest.json"));if(!meta.getString("account").equals(previous.getString("account")))throw new IOException("HISTORY_ACCOUNT_CHANGED");
                    File incoming=new File(stage,"databases/incoming.db");if(!imported.renameTo(incoming))throw new IOException("HISTORY_RENAME");Files.copy(new File(old,"databases/database.db").toPath(),imported.toPath());
                    try(SQLiteDatabase db=SQLiteDatabase.openDatabase(imported.getPath(),null,SQLiteDatabase.OPEN_READWRITE|SQLiteDatabase.NO_LOCALIZED_COLLATORS)){long[] changes=merge(db,incoming,progress,preserved);added=changes[0];updated=changes[1];integrity(db);}
                    if(preserved.isEmpty())remove(incoming);else if(!incoming.renameTo(new File(stage,"databases/source-"+UUID.randomUUID()+".db")))throw new IOException("HISTORY_RENAME");
                    File[] priorSources=new File(old,"databases").listFiles();if(priorSources!=null)for(File source:priorSources)if(source.getName().matches("source-[0-9a-f-]{36}\\.db")){if(Files.isSymbolicLink(source.toPath()))throw new IOException("HISTORY_LINK");Files.copy(source.toPath(),new File(stage,"databases/"+source.getName()).toPath());}
                }else {progress.update(65,"首次导入：保存全部个人数据及原始表结构…");try(SQLiteDatabase db=open(imported)){for(String table:tables(db))added+=scalar(db,"SELECT count(*) FROM "+q(table));}}
                progress.update(85,"正在检查合并结果与最新记录日期…");
                try(SQLiteDatabase db=open(imported)){integrity(db);latest=latest(db);count=tables(db).size();JSONObject counts=new JSONObject();for(String table:tables(db))counts.put(table,scalar(db,"SELECT count(*) FROM "+q(table)));meta.put("tables",counts);}
                meta.put("preservedRawTables",new JSONArray(preserved)).put("added",added).put("updated",updated).put("latestDate",latest).put("mergedAt",System.currentTimeMillis());
                try(FileOutputStream out=new FileOutputStream(new File(stage,"manifest.json"))){out.write(meta.toString().getBytes(StandardCharsets.UTF_8));out.getFD().sync();}
                requireAllowed(c);String result="合并成功\n新增 "+added+" 条，更新 "+updated+" 条\n最新记录日期："+latest+"\n已保存主库与备份库，主库共 "+count+" 张表\n错误：无";
                synchronized(SyncCommit.LOCK){
                    requireAllowed(c);if(HealthAccountStore.generation()!=accountEpoch)throw new IOException("HISTORY_ACCOUNT_CHANGED");HealthAccountStore.requireAccount(c,meta.getString("account"));
                    if(!prefs(c).edit().putString("current",stage.getName()).putString("last_result",result).commit())throw new IOException("HISTORY_SAVE");published=true;
                }
                // The pointer is committed only after all checks; previous data remains intact on failure.
                if(old!=null)try{remove(old);}catch(Exception ignored){}
                try{HealthDataManager.get(c).historyChanged();}catch(Exception ignored){}progress.update(100,result);return result;
            }
        }finally{if(!published)try{remove(stage);}catch(Exception ignored){}}
    }
}
