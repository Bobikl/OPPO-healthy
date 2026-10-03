package com.example.opponotificationrelay;

import android.content.ContentValues;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.system.Os;
import org.json.*;
import java.io.*;
import java.lang.reflect.*;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/** Bounded offline compatibility bridge for the pinned official database version. */
final class RootActivityBridge {
    static final String TABLE="DBSportDataStat";
    static final String[] FIELDS={"total_steps","total_calories","total_workout_minutes","total_move_about_times","current_day_steps_goal","current_day_calories_goal","current_day_workout_goal","current_day_move_about_times_goal"};
    static final String[] COMPLETE={"steps_goal_complete","calories_goal_complete","workout_goal_complete","move_about_times_goal_complete","day_goal_complete"};
    static void offline(int uid)throws Exception {
        Object pm=Class.forName("android.app.AppGlobals").getMethod("getPackageManager").invoke(null);
        Class<?> api=Class.forName("android.content.pm.IPackageManager");
        ApplicationInfo info=(ApplicationInfo)api.getMethod("getApplicationInfo",String.class,long.class,int.class).invoke(pm,"com.heytap.health",512L,0);
        if(info==null||info.uid!=uid||info.enabled)throw new IOException("ACTIVITY_OFFICIAL_RUNNING");
        File[] processes=new File("/proc").listFiles();if(processes==null)throw new IOException("ACTIVITY_PROCESS_CHECK");
        for(File p:processes){if(!p.getName().matches("[0-9]+")||p.getName().equals(Integer.toString(android.os.Process.myPid())))continue;
            try{if(Os.stat(p.getPath()).st_uid==uid)throw new IOException("ACTIVITY_OFFICIAL_RUNNING");}catch(android.system.ErrnoException ignored){}
        }
    }
    static Cursor query(Object db,String sql,String...args)throws Exception{return RootOfficialSettingsReader.query(db,sql,args);}
    static long[] values(Cursor c){long[] out=new long[8];for(int i=0;i<8;i++)out[i]=c.getLong(c.getColumnIndexOrThrow(FIELDS[i]));return out;}
    static long[] values(JSONArray a)throws Exception {if(a.length()!=8)throw new IOException("ACTIVITY_VALUES");long[] out=new long[8];for(int i=0;i<8;i++){Object n=a.get(i);if(!(n instanceof Number)||((Number)n).doubleValue()!=((Number)n).longValue())throw new IOException("ACTIVITY_VALUES");out[i]=a.getLong(i);}return out;}
    static String scope(String account,byte[] key)throws Exception {Mac mac=Mac.getInstance("HmacSHA256");mac.init(new SecretKeySpec(key,"HmacSHA256"));byte[] bytes=mac.doFinal(("activity-account-v1:"+account).getBytes(StandardCharsets.UTF_8));StringBuilder s=new StringBuilder();for(byte b:bytes)s.append(String.format(Locale.ROOT,"%02x",b&255));Arrays.fill(bytes,(byte)0);return s.toString();}
    static JSONObject read(Object db,String account,String device,byte[] key)throws Exception {
        JSONArray rows=new JSONArray();Set<Integer> days=new HashSet<>();
        try(Cursor c=query(db,"SELECT * FROM DBSportDataStat WHERE ssoid=? AND upper(device_unique_id)=? AND sport_mode=-3 ORDER BY date LIMIT 5001",account,device)) {
            while(c.moveToNext()) {int date=c.getInt(c.getColumnIndexOrThrow("date"));long[] v=values(c);ActivityBridgePolicy.valid(date,v);
                if(!days.add(date)||rows.length()>=5000)throw new IOException("ACTIVITY_DUPLICATE_OR_LIMIT");
                rows.put(new JSONObject().put("date",date).put("values",new JSONArray(v)).put("observed",c.getLong(c.getColumnIndexOrThrow("update_timestamp"))));
            }
        }
        return new JSONObject().put("status","OK").put("scope",scope(account,key)).put("rows",rows);
    }
    static final class Change {final int date;final long id;final long[] values;Change(int d,long id,long[] v){date=d;this.id=id;values=v;}}
    static List<Change> plan(Object db,String account,String device,JSONArray input)throws Exception {
        if(input.length()>31)throw new IOException("ACTIVITY_WRITE_LIMIT");List<Change> result=new ArrayList<>();Set<Integer> dates=new HashSet<>();
        for(int i=0;i<input.length();i++) {JSONObject row=input.getJSONObject(i);if(row.length()!=2)throw new IOException("ACTIVITY_ARGUMENT");int date=row.getInt("date");long[] next=values(row.getJSONArray("values"));ActivityBridgePolicy.valid(date,next);if(!dates.add(date))throw new IOException("ACTIVITY_DUPLICATE");
            try(Cursor c=query(db,"SELECT * FROM DBSportDataStat WHERE ssoid=? AND date=? AND sport_mode=-3",account,Integer.toString(date))) {
                if(c.moveToFirst()) {String owner=c.getString(c.getColumnIndexOrThrow("device_unique_id"));if(owner==null||!device.equalsIgnoreCase(owner))throw new IOException("ACTIVITY_DEVICE_CONFLICT");
                    long id=c.getLong(c.getColumnIndexOrThrow("_id"));long[] old=values(c),merged=ActivityBridgePolicy.merge(old,next);if(c.moveToNext())throw new IOException("ACTIVITY_DUPLICATE");if(!Arrays.equals(old,merged))result.add(new Change(date,id,merged));
                }else {for(int g=4;g<8;g++)if(next[g]<=0)throw new IOException("ACTIVITY_GOALS_UNKNOWN");result.add(new Change(date,0,next));}
            }
        }return result;
    }
    static String backup()throws Exception {
        File dir=new File(RootOfficialSettingsReader.BASE,"files/relay-activity-backups");if(!dir.exists()&&!dir.mkdir())throw new IOException("ACTIVITY_BACKUP");
        if(!dir.getCanonicalPath().equals(dir.getPath())||Os.stat(dir.getPath()).st_uid!=RootOfficialSettingsReader.uid)throw new IOException("ACTIVITY_BACKUP_OWNER");
        File[] existing=dir.listFiles();if(existing==null||existing.length>=20)throw new IOException("ACTIVITY_BACKUP_LIMIT");
        File target=new File(dir,"before-"+System.currentTimeMillis()+"-"+UUID.randomUUID().toString());if(!target.mkdir())throw new IOException("ACTIVITY_BACKUP");Os.chmod(target.getPath(),0700);
        JSONObject manifest=new JSONObject();long total=0;
        for(String suffix:new String[]{"","-wal","-shm"}) {File src=new File(RootOfficialSettingsReader.BASE,"databases/database.db"+suffix);if(!src.exists())continue;src=RootOfficialSettingsReader.official("databases/database.db"+suffix);
            if(src.length()>256L*1024*1024 || (total+=src.length())>300L*1024*1024)throw new IOException("ACTIVITY_BACKUP_SIZE");
            File dest=new File(target,src.getName());MessageDigest md=MessageDigest.getInstance("SHA-256");long n=0;
            try(InputStream in=new FileInputStream(src);FileOutputStream out=new FileOutputStream(dest)){byte[] b=new byte[65536];int k;while((k=in.read(b))!=-1){out.write(b,0,k);md.update(b,0,k);n+=k;}out.getFD().sync();}
            Os.chmod(dest.getPath(),0600);if(n!=src.length()||n!=dest.length())throw new IOException("ACTIVITY_BACKUP_CHANGED");
            byte[] expected=md.digest();md.reset();try(InputStream in=new FileInputStream(dest)){byte[] b=new byte[65536];int k;while((k=in.read(b))!=-1)md.update(b,0,k);}if(!Arrays.equals(expected,md.digest()))throw new IOException("ACTIVITY_BACKUP_VERIFY");
            StringBuilder hash=new StringBuilder();for(byte b:expected)hash.append(String.format(Locale.ROOT,"%02x",b&255));manifest.put(src.getName(),new JSONObject().put("bytes",n).put("sha256",hash));
        }
        try(FileOutputStream out=new FileOutputStream(new File(target,"manifest.json"))){out.write(manifest.toString().getBytes(StandardCharsets.UTF_8));out.getFD().sync();}
        return target.getName();
    }
    static Object writable(byte[] key)throws Exception {
        Class<?> t=Class.forName("net.zetetic.database.sqlcipher.SQLiteDatabase"),f=Class.forName("net.zetetic.database.sqlcipher.SQLiteDatabase$CursorFactory"),h=Class.forName("net.zetetic.database.DatabaseErrorHandler"),hook=Class.forName("net.zetetic.database.sqlcipher.SQLiteDatabaseHook");
        Object noRepair=Proxy.newProxyInstance(h.getClassLoader(),new Class<?>[]{h},(p,m,a)->{throw new IOException("ACTIVITY_CORRUPTION");});
        return t.getMethod("openDatabase",String.class,byte[].class,f,int.class,h,hook).invoke(null,RootOfficialSettingsReader.official("databases/database.db").getPath(),key,null,t.getField("NO_LOCALIZED_COLLATORS").getInt(null),noRepair,null);
    }
    static void apply(Object db,String account,String device,Change c)throws Exception {
        ContentValues v=new ContentValues();for(int i=0;i<8;i++)v.put(FIELDS[i],c.values[i]);int[] complete=ActivityBridgePolicy.completed(c.values);for(int i=0;i<5;i++)v.put(COMPLETE[i],complete[i]);
        v.put("sync_status",0); // Same pending-local state as the official watch importer; no network invocation.
        if(c.id!=0) {
            try(Cursor cursor=query(db,"SELECT modified_time,updated,update_timestamp FROM DBSportDataStat WHERE _id=? AND ssoid=?",Long.toString(c.id),account)){if(!cursor.moveToFirst())throw new IOException("ACTIVITY_CHANGED");v.put("updated",cursor.getLong(0)>0?1:cursor.getInt(1));v.put("update_timestamp",Math.max(cursor.getLong(2),System.currentTimeMillis()));}
            int count=(Integer)db.getClass().getMethod("update",String.class,ContentValues.class,String.class,String[].class).invoke(db,TABLE,v,"_id=? AND ssoid=? AND upper(device_unique_id)=? AND sport_mode=-3",new String[]{Long.toString(c.id),account,device});if(count!=1)throw new IOException("ACTIVITY_UPDATE_COUNT");
        }else {
            try(Cursor schema=query(db,"PRAGMA table_info(DBSportDataStat)")){while(schema.moveToNext()){String name=schema.getString(1);if(schema.getInt(3)!=0&&schema.getInt(5)==0&&!v.containsKey(name)){if(!"INTEGER".equals(schema.getString(2)))throw new IOException("ACTIVITY_SCHEMA");v.put(name,0);}}}
            LocalDate d=LocalDate.of(c.date/10000,(c.date/100)%100,c.date%100);ZonedDateTime start=d.atStartOfDay(ZoneId.systemDefault());v.put("date",c.date);v.put("start_time",start.toInstant().toEpochMilli());v.put("end_time",d.plusDays(1).atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli()-1);
            v.put("sport_mode",-3);v.put("ssoid",account);v.put("device_unique_id",device);v.put("client_data_id",UUID.randomUUID().toString().replace("-",""));v.put("timezone",start.format(DateTimeFormatter.ofPattern("xx")));v.put("display",1);v.put("update_timestamp",System.currentTimeMillis());
            long id=(Long)db.getClass().getMethod("insertOrThrow",String.class,String.class,ContentValues.class).invoke(db,TABLE,null,v);if(id<=0)throw new IOException("ACTIVITY_INSERT_FAILED");
        }
    }
    static JSONObject run(Object db,String account,byte[] dbKey,byte[] mmkvKey,String encoded,JSONObject request)throws Exception {
        String operation=request.getString("operation"),device=request.getString("device");boolean write="syncActivity".equals(operation);
        if(!device.matches("[0-9A-F]{2}(:[0-9A-F]{2}){5}")||request.length()!=(write?3:2))throw new IOException("ACTIVITY_ARGUMENT");
        // DBDeviceInfo may contain only the phone; the watch is registered in a separate official store.
        // Require an existing account-scoped watch history row before permitting this compatibility bridge.
        try(Cursor c=query(db,"SELECT count(*) FROM DBSportDataStat WHERE ssoid=? AND upper(device_unique_id)=? AND sport_mode=-3",account,device)){if(!c.moveToFirst()||c.getInt(0)<1)throw new IOException("ACTIVITY_DEVICE_UNSUPPORTED");}
        RootNapWriter.accountUnchanged(mmkvKey,encoded);String backup="";int count=0;
        if(write){offline(RootOfficialSettingsReader.uid);JSONArray rows=request.getJSONArray("rows");List<Change> planned=plan(db,account,device,rows);
            if(!planned.isEmpty()) {backup=backup();offline(RootOfficialSettingsReader.uid);Object writer=writable(dbKey);Class<?> type=writer.getClass();boolean transaction=false;
                try{type.getMethod("beginTransaction").invoke(writer);transaction=true;List<Change> actual=plan(writer,account,device,rows);
                    for(Change c:actual)apply(writer,account,device,c);RootNapWriter.accountUnchanged(mmkvKey,encoded);offline(RootOfficialSettingsReader.uid);
                    try(Cursor c=query(writer,"PRAGMA quick_check")){if(!c.moveToFirst()||!"ok".equals(c.getString(0)))throw new IOException("ACTIVITY_INTEGRITY");}
                    if(!plan(writer,account,device,rows).isEmpty())throw new IOException("ACTIVITY_VERIFY");type.getMethod("setTransactionSuccessful").invoke(writer);count=actual.size();
                }finally{try{if(transaction)type.getMethod("endTransaction").invoke(writer);}finally{type.getMethod("close").invoke(writer);}}
            }
        }
        JSONObject result=read(db,account,device,dbKey);RootNapWriter.accountUnchanged(mmkvKey,encoded);return result.put("written",count).put("backup",backup);
    }
}
