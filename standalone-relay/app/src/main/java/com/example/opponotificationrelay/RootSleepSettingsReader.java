package com.example.opponotificationrelay;

import android.database.Cursor;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.*;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.json.*;

/** A bounded, read-only projection of the current account's sleep preferences. */
final class RootSleepSettingsReader {
    static final String[] KEYS={"USER_REST_NEW","SLEEP_MODEL_SETTINGS","SLEEP_GOAL","BED_TIME_SWITCH","BED_TIME","STAY_UP_BED_TIME_SWITCH","STAY_UP_BED_TIME","CLOSE_MUSIC"};
    static String scope(String account,byte[] key)throws Exception {
    Mac mac=Mac.getInstance("HmacSHA256");mac.init(new SecretKeySpec(key,"HmacSHA256"));
        byte[] digest=mac.doFinal(("sleep-account-v1:"+account).getBytes(StandardCharsets.UTF_8));
        StringBuilder scope=new StringBuilder();for(byte b:digest)scope.append(String.format(Locale.ROOT,"%02x",b&255));Arrays.fill(digest,(byte)0);
        return scope.toString();
    }
    static JSONObject read(Object db,String account,byte[] key)throws Exception {
        return readLocal(db,account,scope(account,key));
    }
    static JSONObject readLocal(Object db,String account,String scope)throws Exception {
        JSONObject values=new JSONObject(),modified=new JSONObject();
        for(String name:KEYS)try(Cursor c=RootOfficialSettingsReader.query(db,
            "SELECT preference_value,modified_time FROM DBUserPreference WHERE ssoid=? AND preference_key=? LIMIT 2",new String[]{account,name})){
            if(c.moveToFirst()){
                String value=c.getString(0);if(value==null || value.length()>16000)throw new IOException("SLEEP_VALUE_LIMIT");
                values.put(name,value);modified.put(name,c.getLong(1));if(c.moveToNext())throw new IOException("SLEEP_DUPLICATE");
            }
        }
        return new JSONObject().put("status","OK").put("values",values).put("modified",modified).put("scope",scope);
    }
}
