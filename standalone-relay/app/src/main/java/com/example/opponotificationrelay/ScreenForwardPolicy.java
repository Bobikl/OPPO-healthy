package com.example.opponotificationrelay;

/** Test/status events and removal sync do not follow the ordinary post screen filter. */
public final class ScreenForwardPolicy {
    private ScreenForwardPolicy() { }
    public static boolean usingPhone(boolean interactive,boolean locked){return interactive && !locked;}
    public static boolean block(boolean enabled,boolean interactive,boolean locked,boolean removed,boolean ownStatus) {
        return block(enabled,usingPhone(interactive,locked),removed,ownStatus);
    }
    public static boolean block(boolean enabled,boolean interactive,boolean removed,boolean ownStatus) {
        return enabled && interactive && !removed && !ownStatus;
    }
}
