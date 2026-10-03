package com.example.opponotificationrelay;

import android.system.Os;
import android.util.Base64;
import org.json.*;
import java.io.*;
import java.security.KeyStore;
import java.util.*;

/** One-shot MMKV snapshots under the existing official UID. No official app initialization or writes. */
public final class RootDeviceInfoReader {
    public static void main(String[] args){
        Thread parent=new Thread(()->{try{while(System.in.read()!=-1){}}catch(IOException ignored){}System.exit(0);},"device-info-parent");parent.setDaemon(true);parent.start();
        Thread deadline=new Thread(()->{try{Thread.sleep(18000);}catch(InterruptedException ignored){return;}System.exit(2);},"device-info-deadline");deadline.setDaemon(true);deadline.start();
        JSONObject result=new JSONObject();
        try{
            if(args.length!=3)throw new IOException("ARGUMENT");int uid=Integer.parseInt(args[0]);String mac=args[1];
            if(uid<10000 || uid>=100000 || android.os.Process.myUid()!=uid || Os.getgid()!=uid || !DeviceStatusProtocol.validMac(mac))throw new IOException("OFFICIAL_UID_REQUIRED");
            RootSettingsBootstrap.approvedApk(args[2]);RootOfficialSettingsReader.uid=uid;
            RootOfficialSettingsReader.official("files/mmkv");
            Set<String> wrappedNames=new HashSet<>(Arrays.asList("unique_key","unique_keyIV"));
            Map<String,byte[]> wrapped=RootOfficialSettingsReader.mmkv("AndroidKeyStore",null,wrappedNames);
            File ds=new File(RootOfficialSettingsReader.BASE,"files/datastore/dataStore_databasePlatform.preferences_pb");
            Map<String,String> storeValues=ds.exists()?MmkvSnapshot.dataStore(RootOfficialSettingsReader.official("files/datastore/dataStore_databasePlatform.preferences_pb"),wrappedNames):Collections.emptyMap();
            Map<String,byte[]> modes=RootOfficialSettingsReader.mmkv("mmkvUniqueKeyRecord",null,new HashSet<>(Arrays.asList("health_share_preference","DMDBManager")));
            if(!MmkvSnapshot.flag(modes,"health_share_preference") || !MmkvSnapshot.flag(modes,"DMDBManager"))throw new IOException("LEGACY_KEY_MODE_UNSUPPORTED");
            if(java.security.Security.getProvider("AndroidKeyStore")==null)Class.forName("android.security.keystore2.AndroidKeyStoreProvider").getMethod("install").invoke(null);
            KeyStore store=KeyStore.getInstance("AndroidKeyStore");store.load(null);
            byte[] key=RootOfficialSettingsReader.unwrap(store,"unique_key",wrapped,storeValues);
            Map<String,byte[]> prefs=RootOfficialSettingsReader.mmkv("health_share_preference",key,Collections.singleton("user_ssoid_encode"));
            String encoded=MmkvSnapshot.string(prefs,"user_ssoid_encode");if(encoded==null)throw new IOException("ACCOUNT_UNAVAILABLE");
            String account=MmkvSnapshot.gunzip(RootOfficialSettingsReader.keep(Base64.decode(encoded,Base64.NO_WRAP)),256);
            if(account.isEmpty() || account.codePoints().anyMatch(Character::isISOControl))throw new IOException("ACCOUNT_UNAVAILABLE");
            String json=MmkvSnapshot.string(RootOfficialSettingsReader.mmkv("DMDBManager",key,Collections.singleton(account)),account);
            if(json==null)throw new IOException("DEVICE_UNAVAILABLE");JSONArray list=new JSONArray(json);JSONObject found=null;
            if(list.length()>32)throw new IOException("DEVICE_LIMIT");
            for(int i=0;i<list.length();i++){JSONObject d=list.getJSONObject(i);
                if(mac.equalsIgnoreCase(d.optString("mac")) || mac.equalsIgnoreCase(d.optString("deviceUniqueId")) || mac.equalsIgnoreCase(d.optString("microMac"))){if(found!=null)throw new IOException("DEVICE_DUPLICATE");found=d;}}
            if(found==null)throw new IOException("DEVICE_UNAVAILABLE");
            DeviceIdentity identity=new DeviceIdentity(found.optString("model"),found.optString("skuCode"),found.optString("sku"),found.optString("deviceMarketName"));
            // Re-check active account before publishing the target's narrow metadata.
            String current=MmkvSnapshot.string(RootOfficialSettingsReader.mmkv("health_share_preference",key,Collections.singleton("user_ssoid_encode")),"user_ssoid_encode");
            if(!encoded.equals(current))throw new IOException("ACCOUNT_CHANGED");
            result.put("status","OK").put("model",identity.model).put("skuCode",identity.skuCode).put("sku",identity.skuLabel).put("name",identity.name);
        }catch(Throwable e){try{String code=e.getMessage();result=new JSONObject().put("status","ERROR").put("code",code!=null && code.matches("[A-Z_]{1,64}")?code:"DEVICE_READ_FAILED");}catch(Exception ignored){}}
        finally{
            for(byte[] b:RootOfficialSettingsReader.secrets)Arrays.fill(b,(byte)0);
            for(Map<String,byte[]> map:RootOfficialSettingsReader.snapshots)MmkvSnapshot.wipe(map);
            System.out.println(SettingsPreviewProtocol.PREFIX+result);System.out.println(SettingsPreviewProtocol.END);System.out.flush();System.exit(0);
        }
    }
}
