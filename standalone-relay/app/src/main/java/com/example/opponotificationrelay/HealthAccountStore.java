package com.example.opponotificationrelay;
import android.content.Context;
import android.security.keystore.*;
import android.util.AtomicFile;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.security.KeyStore;
import java.util.Arrays;
import javax.crypto.*;
import javax.crypto.spec.GCMParameterSpec;
import org.json.JSONObject;

/** Authenticated encrypted session, excluded from backup. */
final class HealthAccountStore {
    private static volatile long generation;
    static long generation(){return generation;}
    static synchronized long begin(){return ++generation;}
    static synchronized void cancel(long expected){if(expected==generation)generation++;}
    private static final String ALIAS="health_account_session_v1";
    private static final byte[] AAD="oppo-relay/health-account/v1".getBytes(StandardCharsets.UTF_8);
    private static AtomicFile file(Context c){return new AtomicFile(new File(c.getNoBackupFilesDir(),"health-account-session.bin"));}
    private static SecretKey key(boolean create)throws Exception {
        KeyStore store=KeyStore.getInstance("AndroidKeyStore");store.load(null);
        if(store.containsAlias(ALIAS))return (SecretKey)store.getKey(ALIAS,null);
        if(!create)throw new IOException("SESSION_KEY_MISSING");
        KeyGenerator generator=KeyGenerator.getInstance(KeyProperties.KEY_ALGORITHM_AES,"AndroidKeyStore");
        generator.init(new KeyGenParameterSpec.Builder(ALIAS,KeyProperties.PURPOSE_ENCRYPT|KeyProperties.PURPOSE_DECRYPT)
            .setBlockModes(KeyProperties.BLOCK_MODE_GCM).setEncryptionPaddings(KeyProperties.ENCRYPTION_PADDING_NONE).setKeySize(256).build());
        return generator.generateKey();
    }
    static synchronized boolean exists(Context c){return file(c).getBaseFile().exists();}
    static synchronized JSONObject load(Context c)throws Exception {return decrypt(file(c),true);}
    static synchronized JSONObject configuration(Context c)throws Exception {
        AtomicFile config=new AtomicFile(new File(c.getNoBackupFilesDir(),"health-account-configuration.bin"));
        JSONObject value=decrypt(config,false);
        if(value!=null)return value;
        JSONObject saved=load(c);if(saved==null)return null;
        value=configurationOnly(saved);encrypt(config,value);return value;
    }
    private static JSONObject decrypt(AtomicFile storage,boolean session)throws Exception {
        if(!storage.getBaseFile().exists())return null;
        byte[] stored=storage.readFully();if(stored.length<30||stored.length>65536||stored[0]!=1)throw new IOException("SESSION_FORMAT");
        Cipher cipher=Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(Cipher.DECRYPT_MODE,key(false),new GCMParameterSpec(128,Arrays.copyOfRange(stored,1,13)));cipher.updateAAD(AAD);
        byte[] plain=cipher.doFinal(stored,13,stored.length-13);
        try{JSONObject value=new JSONObject(new String(plain,StandardCharsets.UTF_8));return session?validate(value):value;}finally{Arrays.fill(plain,(byte)0);}
    }
    static JSONObject validate(JSONObject value)throws Exception {
        if(value.getInt("schema")!=1)throw new IOException("SESSION_FORMAT");
        for(String field:new String[]{"account","token","deviceId","wirePackage","appId","httpSecret","appVersion","versionName"}){
            String text=value.getString(field);
            if(text.isEmpty()||text.length()>8192||text.codePoints().anyMatch(Character::isISOControl))throw new IOException("SESSION_FORMAT");
        }
        if(!"com.heytap.health".equals(value.getString("wirePackage")))throw new IOException("SESSION_AUDIENCE");
        return value;
    }
    static synchronized void save(Context c,JSONObject value,long expected)throws Exception {
        if(expected!=generation)throw new IOException("ACCOUNT_OPERATION_CANCELLED");
        validate(value);
        java.io.File history=OfficialHistoryStore.current(c);
        if(history!=null && new java.io.File(history,"manifest.json").isFile() &&
            !value.getString("account").equals(OfficialHistoryStore.json(new java.io.File(history,"manifest.json")).getString("account")))
            throw new IOException("ACCOUNT_HISTORY_MISMATCH");
        encrypt(new AtomicFile(new File(c.getNoBackupFilesDir(),"health-account-configuration.bin")),configurationOnly(value));
        encrypt(file(c),value);
        CloudSyncEngine.cancel();CloudSyncScheduler.schedule(c,true);
    }
    private static JSONObject configurationOnly(JSONObject value)throws Exception {
        JSONObject result=new JSONObject(value.toString());
        for(String field:new String[]{"account","token","deviceId","source","verifiedAt","verification","lastError"})result.remove(field);
        return result;
    }
    private static void encrypt(AtomicFile storage,JSONObject value)throws Exception {
        byte[] plain=value.toString().getBytes(StandardCharsets.UTF_8);FileOutputStream out=null;
        try{
            Cipher cipher=Cipher.getInstance("AES/GCM/NoPadding");cipher.init(Cipher.ENCRYPT_MODE,key(true));cipher.updateAAD(AAD);
            byte[] iv=cipher.getIV();if(iv.length!=12)throw new IOException("SESSION_IV");
            byte[] encrypted=cipher.doFinal(plain);out=storage.startWrite();out.write(1);out.write(iv);out.write(encrypted);storage.finishWrite(out);out=null;
        }finally{Arrays.fill(plain,(byte)0);if(out!=null)storage.failWrite(out);}
    }
    static synchronized void clear(Context c)throws Exception {
        configuration(c);generation++;file(c).delete();
        CloudSyncEngine.cancel();CloudSyncScheduler.schedule(c,true);CloudSyncScheduler.cancelManual(c);
    }
}
