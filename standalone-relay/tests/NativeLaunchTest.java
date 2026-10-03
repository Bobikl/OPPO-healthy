package com.example.opponotificationrelay;
import java.util.*;
public final class NativeLaunchTest {
    private static int checks;
    private static void check(boolean value){checks++;if(!value)throw new AssertionError("native launch "+checks);}
    public static void main(String[] args) {
        Map<String,Integer> targets=new LinkedHashMap<>();targets.put("com.heytap.health",10577);
        String command=ObserverLaunch.nativeCommand("/data/user/0/relay/cache/native","/data/user/0/relay/cache/helper.jar",targets);
        check(command.startsWith("set -f; abi=$(exec env CLASSPATH="));
        check(command.contains("RootObserverBootstrap com.heytap.health:10577"));
        check(!command.contains("RootHealthObserver")&&!command.contains("--compact"));
        check(command.contains("result=$?; if [ \"$result\" -ne 0 ]; then exit 2; fi;"));
        check(command.endsWith("exec '/data/user/0/relay/cache/native' $abi"));
        check(command.contains("-XX:LowMemoryMode"));
        check(!command.contains("eval")&&!command.contains("ps "));
        String quoted=ObserverLaunch.nativeCommand("/data/a'b/native","/data/a'b/helper.jar",targets);
        check(quoted.contains("'\\''"));
        targets.put("com.coloros.health",10578);
        check(ObserverLaunch.nativeCommand("/data/native","/data/helper",targets).contains("com.coloros.health:10578"));
        targets.put("invalid",10579);
        boolean rejected=false;
        try{ObserverLaunch.nativeCommand("/data/native","/data/helper",targets);}catch(IllegalArgumentException e){rejected=true;}check(rejected);
        targets.clear();targets.put("com.heytap.health",10577);
        for(String bad:new String[]{null,"relative","/data/bad\npath"}){
            rejected=false;try{ObserverLaunch.nativeCommand(bad,"/data/helper",targets);}catch(IllegalArgumentException e){rejected=true;}check(rejected);
        }
        check(ObserverLaunch.command("/data/helper",targets,true).contains("RootHealthObserver --compact"));
        System.out.println("PASS "+checks+" native launch/fallback contract assertions");
    }
}
