package com.example.opponotificationrelay;
import android.util.Base64;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.*;
import org.json.JSONObject;

/** Explicit one-shot migration; result consumed in memory and never logged. */
final class RootAccountExport {
    static String string(Map<String,byte[]> values,String name)throws Exception {
        String value=MmkvSnapshot.string(values,name);
        if(value==null){String encoded=MmkvSnapshot.string(values,name+"_encode");
            if(encoded!=null)value=MmkvSnapshot.gunzip(RootOfficialSettingsReader.keep(Base64.decode(encoded,Base64.NO_WRAP)),8192);}
        if(value==null||value.isEmpty()||value.length()>8192||value.codePoints().anyMatch(Character::isISOControl))throw new IOException("ACCOUNT_FIELD_MISSING");
        return value;
    }
    static JSONObject read(byte[] key,String account,String encodedAccount)throws Exception {
        RootOfficialSettingsReader.stage="ACCOUNT_CREDENTIALS";
        Map<String,byte[]> values=RootOfficialSettingsReader.mmkv("health_share_preference",key,new HashSet<>(Arrays.asList(
            "account_token","account_token_encode","account_device_id","account_device_id_encode")));
        String token=string(values,"account_token"),device=string(values,"account_device_id");
        Class<?> config=Class.forName("com.heytap.health.BuildConfig");
        String decodedKey=(String)Class.forName("com.oplus.aiunit.vision.mpa").getMethod("a",String.class,String.class).invoke(null,
            config.getField("DYNAMIC_KEY").get(null),config.getField("STATIC_KEY").get(null));
        Method decode=Class.forName("com.oplus.aiunit.vision.ebm").getMethod("e",String.class,String.class);
        JSONObject result=new JSONObject().put("status","OK").put("schema",1).put("account",account).put("token",token)
            .put("deviceId",device).put("wirePackage","com.heytap.health").put("source","migrated")
            .put("appVersion",String.valueOf(config.getField("VERSION_CODE").get(null))).put("versionName",config.getField("VERSION_NAME").get(null));
        for(String[] field:new String[][]{{"appId","appid"},{"httpSecret","httpSecret"},{"sdkAppId","mspAppID"},{"sdkAppKey","mspAppKey"}}){
            String value=(String)decode.invoke(null,config.getField(field[1]).get(null),decodedKey);
            if(value==null||value.isEmpty())throw new IOException("ACCOUNT_CONFIG_MISSING");result.put(field[0],value);
        }
        RootNapWriter.accountUnchanged(key,encodedAccount);
        return result;
    }
}
