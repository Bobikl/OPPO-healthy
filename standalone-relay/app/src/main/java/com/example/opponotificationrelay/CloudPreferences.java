package com.example.opponotificationrelay;
import android.content.*;
import java.io.*;
import java.util.*;
import java.util.function.BooleanSupplier;
import org.json.*;

/** Account-scoped preference edits are committed with the confirmed watch edit. */
final class CloudPreferences {
    static final Object LOCK=new Object();
    private static String prefix(String account){return "cloud."+CloudSyncEngine.accountKey(account)+".";}
    static void remember(Context c,SharedPreferences.Editor editor,String sleepScope,String field,JSONObject proposed)throws Exception {
        JSONObject session=HealthAccountStore.load(c);File history=OfficialHistoryStore.current(c);
        if(session==null||history==null)return;
        JSONObject manifest=OfficialHistoryStore.json(new File(history,"manifest.json"));
        if(!session.getString("account").equals(manifest.optString("account"))||!sleepScope.equals(manifest.optString("sleepScope")))return;
        Map<String,JSONObject> changes=new LinkedHashMap<>();
        if(field.equals("rests"))changes.put("USER_REST_NEW",new JSONObject().put("patch",new JSONObject().put("mSleepRests",proposed.getJSONArray("rests"))));
        else if(field.equals("accord"))changes.put("SLEEP_MODEL_SETTINGS",new JSONObject().put("patch",new JSONObject().put("mAccordRestSwitch",proposed.getInt("accord"))));
        else if(field.equals("goal"))changes.put("SLEEP_GOAL",new JSONObject().put("value",String.valueOf(proposed.getInt("goal"))));
        else if(field.equals("music"))changes.put("CLOSE_MUSIC",new JSONObject().put("value",String.valueOf(proposed.getInt("music"))));
        else if(field.equals("bedOn")||field.equals("bedTime")){
            changes.put("BED_TIME_SWITCH",new JSONObject().put("value",String.valueOf(proposed.getInt("bedOn"))));
            changes.put("BED_TIME",new JSONObject().put("value",String.valueOf(proposed.getInt("bedTime"))));
        }else if(field.equals("stayOn")||field.equals("stayTime")){
            changes.put("STAY_UP_BED_TIME_SWITCH",new JSONObject().put("value",String.valueOf(proposed.getInt("stayOn"))));
            changes.put("STAY_UP_BED_TIME",new JSONObject().put("value",String.valueOf(proposed.getInt("stayTime"))));
        }
        for(Map.Entry<String,JSONObject> entry:changes.entrySet())
            editor.putString(prefix(session.getString("account"))+entry.getKey(),entry.getValue().put("revision",UUID.randomUUID().toString()).toString());
    }
    static int pending(Context c,String account){
        int count=0;String prefix=prefix(account);synchronized(LOCK){for(String key:c.getSharedPreferences("sleep_habits_v1",0).getAll().keySet())if(key.startsWith(prefix))count++;}
        return count;
    }
    static JSONArray query(CloudHttp http,JSONArray keys)throws Exception {
        return http.post("v1/c2s/switch/queryUserMultipleSettings",new JSONObject().put("settingKeyList",keys)).getJSONArray("body");
    }
    static String canonicalValue(String value)throws Exception {
        String trimmed=value.trim();if(trimmed.startsWith("{")||trimmed.startsWith("["))return CloudStore.canonical(new JSONTokener(trimmed).nextValue());return value;
    }
    static String apply(String previous,JSONObject edit)throws Exception {
        JSONObject patch=edit.optJSONObject("patch");if(patch==null)return edit.getString("value");
        if(previous==null||previous.isEmpty())throw new IOException("CLOUD_PREFERENCE_BASELINE_REQUIRED");
        JSONObject next=new JSONObject(previous);Iterator<String> names=patch.keys();while(names.hasNext()){String name=names.next();next.put(name,patch.get(name));}
        return next.toString();
    }
    static JSONArray synchronize(Context c,String account,CloudHttp http,JSONArray keys,BooleanSupplier allowed)throws Exception {
        SharedPreferences prefs=c.getSharedPreferences("sleep_habits_v1",0);
        JSONArray initial=query(http,keys);Map<String,JSONObject> byKey=new HashMap<>();
        for(int i=0;i<initial.length();i++){JSONObject row=initial.getJSONObject(i);String key=row.getString("settingKey");if(byKey.put(key,row)!=null)throw new IOException("CLOUD_PREFERENCE_DUPLICATE");}
        for(int i=0;i<keys.length();i++){
            http.check();String key=keys.getString(i),local=prefix(account)+key,saved;
            synchronized(LOCK){saved=prefs.getString(local,null);}
            if(saved==null)continue;JSONObject edit=new JSONObject(saved),old=byKey.get(key);
            String next=apply(old==null?null:old.optString("settingValue"),edit);
            JSONObject request=new JSONObject().put("settingKey",key).put("settingValue",next);
            if(old!=null&&!old.isNull("module"))request.put("module",old.get("module"));
            http.post("v1/c2s/switch/syncUserSetting",request);
            JSONArray check=query(http,new JSONArray().put(key));JSONObject confirmed=null;
            for(int j=0;j<check.length();j++){JSONObject row=check.getJSONObject(j);if(key.equals(row.getString("settingKey")))confirmed=row;}
            if(confirmed==null||!canonicalValue(next).equals(canonicalValue(confirmed.getString("settingValue"))))throw new IOException("CLOUD_PREFERENCE_NOT_CONFIRMED");
            http.check();synchronized(LOCK){
                if(!allowed.getAsBoolean())throw new IOException("CLOUD_CANCELLED");
                if(saved.equals(prefs.getString(local,null))&&!prefs.edit().remove(local).commit())throw new IOException("CLOUD_STORAGE");
            }
            byKey.put(key,confirmed);
        }
        JSONArray result=new JSONArray();for(int i=0;i<keys.length();i++){JSONObject row=byKey.get(keys.getString(i));if(row!=null)result.put(row);}
        return result;
    }
}
