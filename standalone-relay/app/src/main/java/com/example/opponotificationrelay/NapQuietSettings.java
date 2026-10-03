package com.example.opponotificationrelay;

import android.content.Context;
import java.time.LocalTime;

/** 本地午休配置；按真正写入通知时的手机时间应用官方静默标志。 */
public final class NapQuietSettings {
    private NapQuietSettings() { }
    public static boolean enabled(Context c) {synchronized(RelayConfig.class) {return RelayConfig.getPrefs(c).getBoolean("nap_quiet_enabled",false);}}
    public static int start(Context c) {synchronized(RelayConfig.class) {return RelayConfig.getPrefs(c).getInt("nap_quiet_start",13*60);}}
    public static int end(Context c) {synchronized(RelayConfig.class) {return RelayConfig.getPrefs(c).getInt("nap_quiet_end",13*60+30);}}
    public static void setEnabled(Context c,boolean value) { synchronized(RelayConfig.class) {
        RelayConfig.getPrefs(c).edit().putBoolean("nap_quiet_enabled",value).apply();
    }}
    public static void setRange(Context c,int start,int end) { synchronized(RelayConfig.class) {
        if(!NapQuietPolicy.valid(start,end)) throw new IllegalArgumentException("invalid nap range");
        RelayConfig.getPrefs(c).edit().putInt("nap_quiet_start",start).putInt("nap_quiet_end",end).apply();
    }}
    public static boolean active(Context c) { synchronized(RelayConfig.class) {
        return enabled(c) && NapQuietPolicy.active(true,start(c),end(c),LocalTime.now());
    }}
    public static RelayPayloadEncoder.EventEnvelope apply(Context c,RelayPayloadEncoder.EventEnvelope event) {
        return active(c) ? RelayPayloadEncoder.withSilentFlag(event) : event;
    }
}
