package com.example.opponotificationrelay;

import java.util.Map;

/** Fixed helper class and validated UID arguments; never changes global ART properties. */
public final class ObserverLaunch {
    private ObserverLaunch() { }
    public static String nativeCommand(String executable,String classpath,Map<String,Integer> packages) {
        if(executable==null || !executable.startsWith("/") || executable.indexOf('\n')>=0)
            throw new IllegalArgumentException("native path");
        // Reuse package/UID validation and quoting from the Java launch path.
        String bootstrap=command(classpath,packages,true)
            .replace("com.example.opponotificationrelay.RootHealthObserver --compact",
                     "com.example.opponotificationrelay.RootObserverBootstrap");
        return "set -f; abi=$("+bootstrap+"); result=$?; if [ "+'"'+ "$result" +'"'+
            " -ne 0 ]; then exit 2; fi; exec '"+executable.replace("'","'\\''")+"' $abi";
    }
    public static String command(String classpath,Map<String,Integer> packages,boolean compact) {
        if(classpath==null || !classpath.startsWith("/") || classpath.indexOf('\n')>=0 || packages.isEmpty() || packages.size()>2)
            throw new IllegalArgumentException("observer arguments");
        StringBuilder command=new StringBuilder("exec env CLASSPATH='")
            .append(classpath.replace("'","'\\''")).append("' /system/bin/app_process");
        // app_process appends device heap/JIT properties after CLI options; do not pretend
        // -Xmx/-Xusejit override those. LowMemoryMode has no automatic false override.
        if(compact) command.append(" -XX:LowMemoryMode");
        command.append(" /system/bin com.example.opponotificationrelay.RootHealthObserver");
        if(compact) command.append(" --compact");
        for(Map.Entry<String,Integer> entry:packages.entrySet()) {
            if(!("com.heytap.health".equals(entry.getKey()) || "com.coloros.health".equals(entry.getKey()))
                    || entry.getValue()==null || entry.getValue()<10000) throw new IllegalArgumentException("observer target");
            command.append(' ').append(entry.getKey()).append(':').append(entry.getValue());
        }
        return command.toString();
    }
}
