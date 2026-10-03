package com.example.opponotificationrelay;

/** Launches a one-shot reader under the official identity, before ART/Keystore initialization. */
final class PairingImportLaunch {
    private PairingImportLaunch() { }
    static String[] command(String apk,String pkg,int uid,String mac) {
        if(apk==null || !apk.startsWith("/") || apk.indexOf('\n')>=0 || apk.indexOf('\r')>=0 || apk.indexOf('\0')>=0 || uid<10000 ||
           !("com.heytap.health".equals(pkg)||"com.coloros.health".equals(pkg)) || mac==null || !mac.matches("(?i)([0-9a-f]{2}:){5}[0-9a-f]{2}"))
            throw new IllegalArgumentException("IMPORT_ARGUMENT");
        String command="exec env CLASSPATH='"+apk.replace("'","'\\''")+"' /system/bin/app_process /system/bin com.example.opponotificationrelay.RootPairingImporter "+pkg+" "+uid+" "+mac;
        return new String[]{"su",Integer.toString(uid),"-c",command};
    }
}
