package com.example.opponotificationrelay;

/** A saved explicit Stop always wins over automatic recovery. */
public final class StartupPolicy {
    private StartupPolicy() { }
    public static boolean bluetoothReady(int sdk,boolean connectGranted) {return sdk<31 || connectGranted;}
    public static boolean serviceAllowed(boolean enabled,boolean automatic,boolean nullIntent,boolean stop,boolean bluetooth) {return enabled && !stop && (!nullIntent || automatic) && bluetooth;}
    public static boolean restore(boolean automatic,boolean lastEnabled) {return automatic && lastEnabled;}
}
