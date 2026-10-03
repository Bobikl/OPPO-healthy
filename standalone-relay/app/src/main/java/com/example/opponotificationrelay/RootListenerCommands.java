package com.example.opponotificationrelay;

/** Fixed target, numeric Android user: no caller-supplied shell fragments. */
public final class RootListenerCommands {
    private RootListenerCommands() { }
    public static String script(int user) {
        if(user<0 || user>21474) throw new IllegalArgumentException("Invalid Android user");
        String target="com.example.opponotificationrelay/com.example.opponotificationrelay.RelayNotificationListenerService "+user;
        String command="/system/bin/timeout -s KILL 5 /system/bin/cmd notification ";
        return "[ \"$(id -u)\" = 0 ] || exit 10\n"
            +"restore() { "+command+"allow_listener "+target+"; }\n"
            +"trap 'restore' EXIT\ntrap 'exit 12' HUP INT TERM\n"
            +command+"disallow_listener "+target+" || exit 11\n"
            +"sleep 1\n"
            +"restore || exit 13\n"
            +"trap - EXIT HUP INT TERM\nexit 0\n";
    }
}
