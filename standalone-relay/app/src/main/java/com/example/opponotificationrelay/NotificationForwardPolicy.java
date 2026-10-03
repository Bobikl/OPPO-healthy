package com.example.opponotificationrelay;
/** Control/test frames remain available; ordinary notifications follow the master and selection. */
public final class NotificationForwardPolicy {
    private NotificationForwardPolicy() { }
    public static boolean allows(boolean enabled,boolean selected,boolean own,long captured,long current) {
        return own || (enabled && selected && captured==current);
    }
}
