package com.example.opponotificationrelay;

import android.database.Cursor;
import android.system.Os;
import android.util.Base64;
import org.json.*;
import java.io.*;
import java.lang.reflect.*;
import java.nio.charset.StandardCharsets;
import java.security.KeyStore;
import java.util.*;
import javax.crypto.*;
import javax.crypto.spec.GCMParameterSpec;

/** 官方 UID 短任务：设置只读或经官方接口保存；活动桥在停用状态下备份并事务写入。 */
public final class RootOfficialSettingsReader {
    static final String BASE="/data/user/0/com.heytap.health";
    static final String[] NAP={"SILENCE_NOTIFICATIONS_DURING_NAP_SWITCH","NAP_START_TIME","NAP_DURATION"};
    static final Set<String> WRAPPED=new HashSet<>(Arrays.asList("unique_key","unique_keyIV","db_key","db_keyIV"));
    static int uid;static String stage="ARGUMENT";
    static final List<byte[]> secrets=new ArrayList<>();
    static final List<Map<String,byte[]>> snapshots=new ArrayList<>();
    static byte[] keep(byte[] b) {secrets.add(b);return b;}
    static File official(String relative) throws Exception {
        File f=new File(BASE,relative);
        if(!f.getCanonicalPath().equals(BASE+"/"+relative) || Os.stat(f.getPath()).st_uid!=uid)
            throw new SecurityException("FILE_OWNER_OR_LINK");
        return f;
    }
    static Map<String,byte[]> mmkv(String name,byte[] key,Set<String> wanted) throws Exception {
        File f=official("files/mmkv/"+name);official("files/mmkv/"+name+".crc");
        Map<String,byte[]> result=MmkvSnapshot.load(f,key,wanted);snapshots.add(result);return result;
    }
    static byte[] unwrap(KeyStore store,String alias,Map<String,byte[]> mk,Map<String,String> ds) throws Exception {
        String iv=ds.get(alias+"IV"),value=ds.get(alias);
        if(iv==null || iv.isEmpty()) iv=MmkvSnapshot.string(mk,alias+"IV");
        if(value==null || value.isEmpty()) value=MmkvSnapshot.string(mk,alias);
        if(iv==null || value==null || iv.length()>128 || value.length()>4096) throw new IOException("WRAPPED_KEY_ABSENT");
        SecretKey secret=(SecretKey)store.getKey(alias,null);
        if(secret==null) throw new IOException("EXISTING_KEY_ABSENT");
        byte[] ivBytes=keep(Base64.decode(iv,Base64.NO_WRAP)),ciphertext=keep(Base64.decode(value,Base64.NO_WRAP));
        if(ivBytes.length!=12 || ciphertext.length<17) throw new IOException("GCM_SHAPE");
        Cipher cipher=Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(Cipher.DECRYPT_MODE,secret,new GCMParameterSpec(128,ivBytes));
        byte[] key=keep(cipher.doFinal(ciphertext));
        if(key.length<16 || key.length>256) throw new IOException("KEY_SIZE");
        return key;
    }
    static Cursor query(Object db,String sql,String[] args) throws Exception {
        return (Cursor)db.getClass().getMethod("rawQuery",String.class,String[].class).invoke(db,sql,args);
    }
    static String errorCode(Throwable e) {
        while(e instanceof InvocationTargetException && e.getCause()!=null)e=e.getCause();
        String reason=e.getMessage();
        return reason!=null && reason.matches("[A-Z_]{1,64}")?reason:stage;
    }
    static JSONObject readApps() throws Exception {
        stage="NOTIFICATION_LIST";
        File file=official("databases/notification-new.db");
        JSONArray rows=new JSONArray();Set<String> seen=new HashSet<>();int total=0,skipped=0,self=0;
        int flags=android.database.sqlite.SQLiteDatabase.OPEN_READONLY|android.database.sqlite.SQLiteDatabase.NO_LOCALIZED_COLLATORS;
        try(android.database.sqlite.SQLiteDatabase db=android.database.sqlite.SQLiteDatabase.openDatabase(file.getPath(),null,flags,
            failed->{throw new IllegalStateException("READ_ONLY_CORRUPTION_ABORT");})) {
            db.execSQL("PRAGMA query_only=ON");
            try(Cursor c=db.rawQuery("SELECT packageName,isOpen FROM notification_packages LIMIT 4001",null)) {
                while(c.moveToNext()) {
                    if(++total>OfficialSettingsPreview.MAX_APPS)throw new IOException("APP_LIMIT");
                    String pkg=c.getString(0);int on=c.getInt(1);
                    if(pkg==null || !seen.add(pkg) || c.isNull(1) || (on!=0&&on!=1))throw new IOException("INVALID_APP_RECORD");
                    if(OfficialSettingsPreview.SELF.equals(pkg)){self++;continue;}
                    if(!OfficialSettingsPreview.ordinary(pkg)){skipped++;continue;}
                    rows.put(new JSONArray().put(pkg).put(on==1));
                }
            }
        }
        return new JSONObject().put("status","OK").put("rows",rows).put("skipped",skipped).put("selfRows",self);
    }
    static JSONObject readNap(String scratch,JSONObject request) throws Exception {
        Object database=null;
        try {
            stage="WRAPPED_KEY_SNAPSHOTS";
            Map<String,byte[]> wrapped=mmkv("AndroidKeyStore",null,WRAPPED);
            File dsFile=new File(BASE,"files/datastore/dataStore_databasePlatform.preferences_pb");
            Map<String,String> ds=dsFile.exists()?MmkvSnapshot.dataStore(official("files/datastore/dataStore_databasePlatform.preferences_pb"),WRAPPED):Collections.emptyMap();
            stage="MMKV_KEY_MODE";
            Map<String,byte[]> modes=mmkv("mmkvUniqueKeyRecord",null,Collections.singleton("health_share_preference"));
            if(!MmkvSnapshot.flag(modes,"health_share_preference")) throw new IOException("LEGACY_KEY_MODE_UNSUPPORTED");
            stage="KEYSTORE_IDENTITY";
            if(android.os.Process.myUid()!=uid || Os.getgid()!=uid)
                throw new SecurityException("OFFICIAL_UID_REQUIRED");
            stage="KEYSTORE_PROVIDER";
            if(java.security.Security.getProvider("AndroidKeyStore")==null)
                Class.forName("android.security.keystore2.AndroidKeyStoreProvider").getMethod("install").invoke(null);
            stage="KEYSTORE_LOAD";
            KeyStore store=KeyStore.getInstance("AndroidKeyStore");store.load(null);
            stage="UNWRAP_MMKV_KEY";
            byte[] mmkvKey=unwrap(store,"unique_key",wrapped,ds);
            stage="ACCOUNT_SNAPSHOT";
            Map<String,byte[]> preferences=mmkv("health_share_preference",mmkvKey,Collections.singleton("user_ssoid_encode"));
            String encodedAccount=MmkvSnapshot.string(preferences,"user_ssoid_encode");
            String account=encodedAccount==null?null:MmkvSnapshot.gunzip(keep(Base64.decode(encodedAccount,Base64.NO_WRAP)),256);
            if(account==null || account.isEmpty() || account.length()>256 || account.codePoints().anyMatch(Character::isISOControl))
                throw new IOException("ACCOUNT_UNAVAILABLE");
            if(request!=null && "exportAccount".equals(request.optString("operation"))){
                if(request.length()!=1)throw new IOException("READ_ARGUMENT");
                return RootAccountExport.read(mmkvKey,account,encodedAccount);
            }
            stage="UNWRAP_DATABASE_KEY";
            byte[] dbKey=unwrap(store,"db_key",wrapped,ds);
            stage="SQLCIPHER_LOAD";
            System.load(scratch+"/libsqlcipher.so");
            Class<?> type=Class.forName("net.zetetic.database.sqlcipher.SQLiteDatabase");
            Class<?> factory=Class.forName("net.zetetic.database.sqlcipher.SQLiteDatabase$CursorFactory");
            Class<?> handler=Class.forName("net.zetetic.database.DatabaseErrorHandler");
            Class<?> hook=Class.forName("net.zetetic.database.sqlcipher.SQLiteDatabaseHook");
            Object noRepair=Proxy.newProxyInstance(handler.getClassLoader(),new Class<?>[]{handler},
                (proxy,method,arguments) -> {throw new IllegalStateException("READ_ONLY_CORRUPTION_ABORT");});
            stage="SQLCIPHER_READ_ONLY_OPEN";
            int flags=type.getField("OPEN_READONLY").getInt(null)|type.getField("NO_LOCALIZED_COLLATORS").getInt(null);
            database=type.getMethod("openDatabase",String.class,byte[].class,factory,int.class,handler,hook)
                .invoke(null,official("databases/database.db").getPath(),dbKey,null,flags,noRepair,null);
            if(!Boolean.TRUE.equals(type.getMethod("isReadOnly").invoke(database))) throw new SecurityException("NOT_READ_ONLY");
            type.getMethod("execSQL",String.class).invoke(database,"PRAGMA query_only=ON");
            if(((Integer)type.getMethod("getVersion").invoke(database))!=66)throw new IOException("DATABASE_VERSION");
            stage="NAP_QUERY";
            if(request!=null && "exportHistory".equals(request.optString("operation"))){
                stage="HISTORY_EXPORT";JSONObject result=RootHistoryExport.run(database,account,dbKey,scratch);
                RootNapWriter.accountUnchanged(mmkvKey,encodedAccount);return result;
            }
            if(request!=null && ("readActivity".equals(request.optString("operation"))||"syncActivity".equals(request.optString("operation"))))
                return RootActivityBridge.run(database,account,dbKey,mmkvKey,encodedAccount,request);
            if(request!=null && ("readHealth".equals(request.optString("operation"))||"readHeartRaw".equals(request.optString("operation")))){
                JSONObject result=RootHealthDataReader.read(database,account,dbKey,request);
                RootNapWriter.accountUnchanged(mmkvKey,encodedAccount);return result;
            }
            if(request!=null && "readSleep".equals(request.optString("operation"))){
                if(request.length()!=1)throw new IOException("READ_ARGUMENT");
                JSONObject result=RootSleepSettingsReader.read(database,account,dbKey);
                RootNapWriter.accountUnchanged(mmkvKey,encodedAccount);return result;
            }
            if(request!=null)return RootNapWriter.save(database,account,dbKey,mmkvKey,encodedAccount,request);
            NapWritePolicy.State state=RootNapWriter.snapshot(database,account,dbKey);
            RootNapWriter.accountUnchanged(mmkvKey,encodedAccount);
            return RootNapWriter.json(state);
        } finally {
            if(database!=null)try{database.getClass().getMethod("close").invoke(database);}catch(Exception ignored){}
            for(byte[] b:secrets)Arrays.fill(b,(byte)0);
            for(Map<String,byte[]> m:snapshots)MmkvSnapshot.wipe(m);
            secrets.clear();snapshots.clear();
        }
    }
    public static void main(String[] args) {
        Thread parent=new Thread(()->{try{while(System.in.read()!=-1){}}catch(IOException ignored){}System.exit(0);},"settings-reader-parent");
        parent.setDaemon(true);parent.start();
        Thread deadline=new Thread(()->{try{Thread.sleep(180000);}catch(InterruptedException ignored){return;}System.exit(2);},"settings-reader-deadline");
        deadline.setDaemon(true);deadline.start();
        JSONObject out=new JSONObject();
        try {
            if(args.length!=2 && args.length!=3)throw new IOException("ARGUMENT");
            uid=Integer.parseInt(args[0]);
            if(uid<10000 || uid>=100000 || android.os.Process.myUid()!=uid || Os.getgid()!=uid)
                throw new IOException("OFFICIAL_UID_REQUIRED");
            if(!args[1].matches("/data/local/tmp/oppo-settings-preview-[0-9]+") || Os.stat(args[1]).st_uid!=0)
                throw new IOException("SCRATCH_PATH");
            official("databases");
            out.put("schema",1).put("status","OK");
            if(args.length==3) {
                if(args[2].length()>32768 || !args[2].matches("[A-Za-z0-9+/=]+"))throw new IOException("WRITE_ARGUMENT");
                JSONObject request=new JSONObject(new String(Base64.decode(args[2],Base64.NO_WRAP),StandardCharsets.UTF_8));
                out.put("exportAccount".equals(request.optString("operation"))?"account":("readHealth".equals(request.optString("operation"))||"readHeartRaw".equals(request.optString("operation")))?"health":request.optString("operation").endsWith("Activity")?"activity":"readSleep".equals(request.optString("operation"))?"sleep":"write",readNap(args[1],request));
            } else {
                try{out.put("apps",readApps());}catch(Throwable e){out.put("apps",new JSONObject().put("status","ERROR").put("code",errorCode(e)));}
                try{out.put("nap",readNap(args[1],null));}catch(Throwable e){out.put("nap",new JSONObject().put("status","ERROR").put("code",errorCode(e)));}
            }
        } catch(Throwable e) {
            try{out=new JSONObject().put("schema",1).put("status","ERROR").put("code",errorCode(e));}catch(Exception ignored){}
        } finally {
            System.out.println(SettingsPreviewProtocol.PREFIX+out.toString());
            System.out.println(SettingsPreviewProtocol.END);System.out.flush();System.exit(0);
        }
    }
}
