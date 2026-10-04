package com.example.opponotificationrelay;
import android.content.Context;
import android.content.pm.*;
import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.*;
import org.json.JSONObject;

/** Only an explicit import action invokes this one-shot Root reader. */
final class HealthAccountImporter {
    static JSONObject read(Context context)throws Exception {
        PackageInfo info=context.getPackageManager().getPackageInfo("com.heytap.health",PackageManager.MATCH_DISABLED_COMPONENTS);
        if(info.getLongVersionCode()!=6060700||!"6.6.7_097c6ef_260803".equals(info.versionName))throw new java.io.IOException("OFFICIAL_BUILD_UNSUPPORTED");
        ApplicationInfo app=info.applicationInfo;
        if(app==null||app.uid<10000||app.uid>=100000)throw new java.io.IOException("USER_UNSUPPORTED");
        String own=context.getApplicationInfo().sourceDir;
        String request=Base64.encodeToString(new JSONObject().put("operation","exportAccount").toString().getBytes(StandardCharsets.UTF_8),Base64.NO_WRAP);
        String command="exec env CLASSPATH="+SettingsPreviewProtocol.quote(own)+" /system/bin/app_process /system/bin com.example.opponotificationrelay.RootSettingsBootstrap "+
            SettingsPreviewProtocol.quote(own)+" "+SettingsPreviewProtocol.quote(app.sourceDir)+" "+app.uid+" global "+SettingsPreviewProtocol.quote(request);
        Process child=new ProcessBuilder("su","--mount-master","-c",command).redirectErrorStream(true).start();
        FutureTask<String> result=new FutureTask<>(()->SettingsPreviewProtocol.read(child.getInputStream()));
        Thread reader=new Thread(result,"account-import-result");reader.setDaemon(true);reader.start();
        try {
            JSONObject envelope=new JSONObject(result.get(65,TimeUnit.SECONDS));
            if(!"OK".equals(envelope.optString("status")))throw new java.io.IOException(safe(envelope));
            JSONObject session=envelope.getJSONObject("account");
            if(!"OK".equals(session.optString("status")))throw new java.io.IOException(safe(session));
            return HealthAccountStore.validate(session);
        }finally{result.cancel(true);try{child.getOutputStream().close();}catch(Exception ignored){}child.destroy();}
    }
    private static String safe(JSONObject value){String code=value.optString("code","ACCOUNT_IMPORT");return code.matches("[A-Z_]{1,64}")?code:"ACCOUNT_IMPORT";}
}
