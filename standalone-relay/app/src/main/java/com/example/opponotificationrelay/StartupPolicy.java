package com.example.opponotificationrelay;

/** A saved explicit Stop always wins over automatic recovery. */
public final class StartupPolicy {
    private StartupPolicy() { }
    public static boolean restore(boolean automatic,boolean lastEnabled) {return automatic && lastEnabled;}
}
