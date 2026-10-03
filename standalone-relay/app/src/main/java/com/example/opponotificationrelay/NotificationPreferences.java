package com.example.opponotificationrelay;
import android.content.Context;
import java.util.concurrent.atomic.AtomicLong;

/** Local notification choices. Wrist preference is scoped to the selected watch. */
public final class NotificationPreferences {
    private static final AtomicLong revision=new AtomicLong();
    private NotificationPreferences() { }
    public static long revision(){return revision.get();}
    public static boolean enabled(Context c){return RelayConfig.getPrefs(c).getBoolean("notification_master",true);}
    public static void setEnabled(Context c,boolean enabled){
        if(enabled==enabled(c))return;
        revision.incrementAndGet();RelayConfig.getPrefs(c).edit().putBoolean("notification_master",enabled).apply();
        RfcommWearTransport.getInstance(c).syncNotificationSettings();
    }
    public static boolean screenPush(Context c){return !RelayConfig.suppressWhileScreenOn(c);}
    public static void setScreenPush(Context c,boolean enabled){
        RelayConfig.setSuppressWhileScreenOn(c,!enabled);
        RfcommWearTransport.getInstance(c).syncNotificationSettings();
    }
    private static String wristKey(Context c){return "notification_wrist_"+RelayConfig.getTargetMac(c).toUpperCase(java.util.Locale.ROOT);}
    public static boolean configured(Context c){return android.bluetooth.BluetoothAdapter.checkBluetoothAddress(RelayConfig.getTargetMac(c));}
    public static Boolean wristOverride(Context c){
        return configured(c) && RelayConfig.getPrefs(c).contains(wristKey(c))?RelayConfig.getPrefs(c).getBoolean(wristKey(c),false):null;
    }
    public static Boolean wristPush(Context c){
        Boolean value=wristOverride(c);return value!=null?value:NotificationSettings.baselineFlag(c,NotificationSwitchPolicy.WRIST_OFF);
    }
    public static void setWristPush(Context c,boolean enabled){
        if(!configured(c))return;
        RelayConfig.getPrefs(c).edit().putBoolean(wristKey(c),enabled).apply();
        RfcommWearTransport.getInstance(c).syncNotificationSettings();
    }
}
