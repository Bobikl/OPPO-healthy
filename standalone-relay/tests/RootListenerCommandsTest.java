package com.example.opponotificationrelay;

public final class RootListenerCommandsTest {
    private static int checks;
    private static void check(boolean value) {checks++;if(!value) throw new AssertionError("check "+checks);}
    public static void main(String[] args) {
        String s=RootListenerCommands.script(10);
        String target="com.example.opponotificationrelay/com.example.opponotificationrelay.RelayNotificationListenerService 10";
        check(s.contains("disallow_listener "+target));
        check(s.contains("allow_listener "+target));
        check(s.indexOf("trap 'restore' EXIT")<s.indexOf("disallow_listener"));
        check(s.contains("trap 'exit 12' HUP INT TERM"));
        check(s.contains("restore || exit 13"));
        check(s.indexOf("trap - EXIT")>s.indexOf("restore || exit 13"));
        check(s.contains("timeout -s KILL 5"));
        check(s.startsWith("[ \"$(id -u)\" = 0 ] || exit 10"));
        check(!s.contains("settings put") && !s.contains("system_server") && !s.contains("force-stop"));
        check(RootListenerCommands.script(0).contains("ListenerService 0"));
        for(int user:new int[]{-1,21475,Integer.MAX_VALUE}) {
            boolean rejected=false;try {RootListenerCommands.script(user);} catch(IllegalArgumentException e) {rejected=true;}
            check(rejected);
        }
        System.out.println("Root command checks passed: "+checks);
    }
}
