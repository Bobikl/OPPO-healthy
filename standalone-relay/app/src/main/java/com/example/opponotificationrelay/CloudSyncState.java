package com.example.opponotificationrelay;
import android.content.*;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;
final class CloudSyncState {
    static final String FILE="cloud_sync_v1";
    static SharedPreferences prefs(Context c){return c.getSharedPreferences(FILE,0);}
    static boolean enabled(Context c){return prefs(c).getBoolean("enabled",false);}
    static boolean selected(Context c,CloudCategory category){return prefs(c).getBoolean("category."+category.key,false);}
    static long revision(Context c){return prefs(c).getLong("revision",0);}
    static String mode(Context c){return prefs(c).getString("mode","daily");}
    static int hour(Context c){return prefs(c).getInt("hour",22);}
    static int minute(Context c){return prefs(c).getInt("minute",0);}
    static boolean any(Context c){for(CloudCategory category:CloudCategory.values())if(selected(c,category))return true;return false;}
    static synchronized void change(Context c,String key,boolean value){save(c,prefs(c).edit().putBoolean(key,value));}
    static synchronized void mode(Context c,String value){if(!Arrays.asList("daily","charging","wifi").contains(value))throw new IllegalArgumentException();save(c,prefs(c).edit().putString("mode",value));}
    static synchronized void time(Context c,int hour,int minute){if(hour<0||hour>23||minute<0||minute>59)throw new IllegalArgumentException();save(c,prefs(c).edit().putInt("hour",hour).putInt("minute",minute));}
    private static void save(Context c,SharedPreferences.Editor edit){if(!edit.putLong("revision",revision(c)+1).commit())throw new IllegalStateException("CLOUD_SETTINGS_SAVE");CloudSyncEngine.cancel();CloudSyncScheduler.cancelManual(c);CloudSyncScheduler.schedule(c,true);}
    static String date(long time){return time<=0?"从未同步":new SimpleDateFormat("yyyy-MM-dd HH:mm",Locale.CHINA).format(new Date(time));}
    static String result(Context c,String account,CloudCategory category){
        String key=account+"."+category.key;SharedPreferences p=prefs(c);
        long attempt=p.getLong(key+".attempt",0),success=p.getLong(key+".success",0);
        String result=p.getString(key+".result","尚未同步");
        return (attempt==0?"尚未同步":date(attempt)+" · "+result)+(success>0&&success!=attempt?"\n最近成功："+date(success):"");
    }
    static synchronized void result(Context c,String account,CloudCategory category,String result,long attempt,boolean success){
        String key=account+"."+category.key;SharedPreferences.Editor edit=prefs(c).edit().putLong(key+".attempt",attempt).putString(key+".result",result);
        if(success)edit.putLong(key+".success",attempt);
        if(!edit.commit())throw new IllegalStateException("CLOUD_STATUS_SAVE");
    }
}
