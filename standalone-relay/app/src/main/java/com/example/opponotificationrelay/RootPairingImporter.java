package com.example.opponotificationrelay;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.system.Os;
import android.util.Base64;
import android.util.Xml;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.security.KeyStore;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/**
 * 用户点击后的一次性只读导入。不启动官方应用/蓝牙、不注入模块。
 * 新版记录仅调用指定官方 APK 的配置解码与纯算法/消息解析，不初始化 Application。
 * 由 su 直接以目录所属官方 UID 启动；不在已启动的 ART 进程中切换身份。
 * 只 getKey(ksc_key_alias) 并解密目标记录，不创建/删除/枚举任何 Keystore 项。
 * 敏感结果仅通过父子匿名管道返回，不落共享文件，不打印异常或密钥日志。
 */
public final class RootPairingImporter {
    private static String stage="ROOT_REQUIRED";
    public static void main(String[] args) {
        Thread parent=new Thread(() -> {
            try {while(System.in.read()!=-1) { }} catch(IOException ignored) { }
            System.exit(0);
        },"OAF-import-parent");
        parent.setDaemon(true);parent.start();
        Thread deadline=new Thread(() -> {
            try {Thread.sleep(25000);} catch(InterruptedException ignored) {return;}
            System.out.println("OAFIMPORT1 ERROR IMPORT_TIMEOUT");System.out.flush();System.exit(0);
        },"OAF-import-deadline");
        deadline.setDaemon(true);deadline.start();
        byte[] clear=null,encrypted=null;
        try {
            stage="ARGUMENT_INVALID";
            if(args.length!=3 || !("com.heytap.health".equals(args[0]) || "com.coloros.health".equals(args[0]))) throw new IllegalArgumentException();
            String pkg=args[0],mac=args[2]; int uid=Integer.parseInt(args[1]);
            if(uid<10000 || !mac.matches("(?i)([0-9a-f]{2}:){5}[0-9a-f]{2}")) throw new IllegalArgumentException();
            stage="OFFICIAL_UID_REQUIRED";
            if(android.os.Process.myUid()!=uid || Os.getuid()!=uid || Os.getgid()!=uid)throw new SecurityException();
            int user=uid/100000;
            String de="/data/user_de/"+user+"/"+pkg,ce="/data/user/"+user+"/"+pkg;
            // 当前连接持有独立记录；历史 ksc.db 中同别名存在不代表仍在使用。
            File current=new File(ce+"/shared_prefs/bounded_oaf.xml");
            if(current.isFile()) {
                stage="CURRENT_RECORD_FAILED";
                if(Os.stat(ce).st_uid!=uid || Os.stat(current.getPath()).st_uid!=uid
                        || !current.getCanonicalPath().equals(ce+"/shared_prefs/bounded_oaf.xml"))throw new SecurityException();
                JSONObject result=currentRecord(current,mac);
                System.out.println("OAFIMPORT1 OK "+b64(result.toString().getBytes(StandardCharsets.UTF_8)));return;
            }
            stage="OFFICIAL_RECORD_UNAVAILABLE";
            String base=new File(de+"/shared_prefs/AccessoryPreferences.xml").isFile() ? de : ce;
            if(Os.stat(base).st_uid!=uid) throw new SecurityException();
            String discovery=preference(base+"/shared_prefs/AccessoryPreferences.xml","DiscoveryData");
            stage="PAIRING_NOT_FOUND";
            if(discovery==null || discovery.isEmpty())throw new IOException();
            PairingRecord record=PairingRecord.find(discovery,mac);
            stage="LOCAL_ID_NOT_FOUND";
            byte[] localId=PairingRecord.hex(preference(base+"/shared_prefs/fast_pair_sdk_preferences.xml","sp_key_duid"));
            if(localId.length!=6) throw new IllegalArgumentException();
            stage="DATABASE_READ_FAILED";
            String[] row=readRecord(base+"/databases/ksc.db",record);
            encrypted=PairingRecord.hex(row[0]); byte[] iv=PairingRecord.hex(row[1]);
            if(encrypted.length!=16 || iv.length!=16) throw new IllegalArgumentException();
            stage="KEYSTORE_PROVIDER_FAILED";
            if(java.security.Security.getProvider("AndroidKeyStore")==null) {
                Class<?> provider;
                try {provider=Class.forName("android.security.keystore2.AndroidKeyStoreProvider");}
                catch(ClassNotFoundException older){provider=Class.forName("android.security.keystore.AndroidKeyStoreProvider");}
                provider.getMethod("install").invoke(null);
            }
            stage="KEYSTORE_LOAD_FAILED";
            KeyStore store=KeyStore.getInstance("AndroidKeyStore");store.load(null);
            stage="KEYSTORE_ACCESS_FAILED";
            SecretKey wrapping=(SecretKey)store.getKey("ksc_key_alias",null);
            if(wrapping==null) throw new SecurityException();
            Cipher cipher=Cipher.getInstance("AES/CBC/NoPadding");
            cipher.init(Cipher.DECRYPT_MODE,wrapping,new IvParameterSpec(iv));
            clear=cipher.doFinal(encrypted);
            if(clear.length!=16) throw new SecurityException();
            JSONObject result=new JSONObject().put("schema",2).put("mac",record.mac).put("transport",2).put("uuidType",1)
                .put("ksc",b64(clear)).put("localDeviceId",b64(localId))
                .put("peerDeviceId",b64(PairingRecord.hex(record.deviceId))).put("kscAlias",b64(PairingRecord.hex(record.alias)))
                .put("importSource","official_readonly").put("importedAt",System.currentTimeMillis());
            System.out.println("OAFIMPORT1 OK "+b64(result.toString().getBytes(StandardCharsets.UTF_8)));
        } catch(Exception e) {System.out.println("OAFIMPORT1 ERROR "+stage);}
        finally {
            if(clear!=null) Arrays.fill(clear,(byte)0);
            if(encrypted!=null) Arrays.fill(encrypted,(byte)0);
            System.out.flush();System.exit(0);
        }
    }
    private static String b64(byte[] bytes) {return Base64.encodeToString(bytes,Base64.NO_WRAP);}
    private static byte[] messageField(Object record,String getter,int size)throws Exception {
        Object bytes=record.getClass().getMethod(getter).invoke(record);
        byte[] value=(byte[])bytes.getClass().getMethod("toByteArray").invoke(bytes);
        if(value.length!=size)throw new IOException();return value;
    }
    private static String decode(String value,byte[] key,byte[] iv)throws Exception {
        Cipher cipher=Cipher.getInstance("AES/CBC/PKCS7Padding");
        cipher.init(Cipher.DECRYPT_MODE,new SecretKeySpec(key,"AES"),new IvParameterSpec(iv));
        return new String(cipher.doFinal(PairingRecord.hex(value)),StandardCharsets.UTF_8);
    }
    private static JSONObject currentRecord(File file,String mac)throws Exception {
        byte[] key=null,packed=null,ksc=null;
        try {
            if(file.length()>65536)throw new IOException();
            Class<?> config=Class.forName("com.heytap.health.BuildConfig");
            if(!"6.6.7_097c6ef_260803".equals(config.getField("VERSION_NAME").get(null))
                    || ((Number)config.getField("VERSION_CODE").get(null)).longValue()!=6060700L)throw new IOException();
            String dynamic=(String)Class.forName("com.oplus.aiunit.vision.mpa").getMethod("a",String.class,String.class).invoke(null,
                config.getField("DYNAMIC_KEY").get(null),config.getField("STATIC_KEY").get(null));
            String hardware=(String)Class.forName("com.oplus.aiunit.vision.ebm").getMethod("e",String.class,String.class).invoke(null,config.getField("hwkey").get(null),dynamic);
            if(hardware==null || hardware.length()<16)throw new IOException();
            key=(byte[])Class.forName("com.oplus.aiunit.vision.taa").getMethod("b",byte[].class,int.class).invoke(null,hardware.getBytes(StandardCharsets.UTF_8),32);
            byte[] iv=hardware.substring(0,16).getBytes(StandardCharsets.UTF_8);String selected=null;int count=0;
            try(Reader in=new InputStreamReader(new FileInputStream(file),StandardCharsets.UTF_8)) {
                XmlPullParser parser=Xml.newPullParser();parser.setInput(in);
                for(int event=parser.getEventType();event!=XmlPullParser.END_DOCUMENT;event=parser.next()) {
                    if(event!=XmlPullParser.START_TAG || !"string".equals(parser.getName()))continue;
                    if(++count>64)throw new IOException();
                    String name=decode(parser.getAttributeValue(null,"name"),key,iv),value=parser.nextText();
                    if(!name.equalsIgnoreCase("OAF_"+mac))continue;
                    if(selected!=null)throw new IOException();selected=decode(value,key,iv);
                }
            }
            if(selected==null)throw new IOException();packed=Base64.decode(selected,Base64.DEFAULT);
            Object record=Class.forName("com.heytap.wearable.oaf.proto.OafRecorder$DeviceRecode").getMethod("parseFrom",byte[].class).invoke(null,packed);
            Object node=record.getClass().getMethod("getNodeRecode").invoke(record);ksc=messageField(node,"getKsc",16);
            return new JSONObject().put("schema",2).put("mac",mac).put("transport",2).put("uuidType",1).put("ksc",b64(ksc))
                .put("localDeviceId",b64(messageField(node,"getLocalDeviceId",6))).put("peerDeviceId",b64(messageField(node,"getRemoteDeviceId",6)))
                .put("kscAlias",b64(messageField(node,"getKscAlias",6))).put("importSource","official_current_readonly").put("importedAt",System.currentTimeMillis());
        } finally {if(key!=null)Arrays.fill(key,(byte)0);if(packed!=null)Arrays.fill(packed,(byte)0);if(ksc!=null)Arrays.fill(ksc,(byte)0);}
    }
    private static String preference(String path,String key) throws Exception {
        File file=new File(path);
        if(!file.isFile() || file.length()>512*1024) throw new IOException();
        try(Reader in=new InputStreamReader(new FileInputStream(file),StandardCharsets.UTF_8)) {
            XmlPullParser parser=Xml.newPullParser();parser.setInput(in);
            for(int event=parser.getEventType();event!=XmlPullParser.END_DOCUMENT;event=parser.next()) {
                if(event==XmlPullParser.START_TAG && "string".equals(parser.getName()) && key.equals(parser.getAttributeValue(null,"name")))
                    return parser.nextText();
            }
        }
        return null;
    }
    private static String[] readRecord(String path,PairingRecord record) throws Exception {
        if(!new File(path).isFile()) throw new IOException();
        try(SQLiteDatabase db=SQLiteDatabase.openDatabase(path,null,SQLiteDatabase.OPEN_READONLY | SQLiteDatabase.NO_LOCALIZED_COLLATORS)) {
            for(String device:new String[]{record.deviceId,""}) {
                try(Cursor c=db.rawQuery("SELECT ksc,iv FROM ksc_info WHERE deviceId = ? COLLATE NOCASE AND alias = ? COLLATE NOCASE LIMIT 2",new String[]{device,record.alias})) {
                    if(!c.moveToFirst()) continue;
                    String[] row={c.getString(0),c.getString(1)};
                    if(c.moveToNext()) throw new IOException();
                    return row;
                }
            }
        }
        throw new IOException();
    }
}
