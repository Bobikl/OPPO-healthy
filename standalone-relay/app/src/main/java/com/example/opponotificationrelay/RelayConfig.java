package com.example.opponotificationrelay;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import org.json.JSONObject;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.FutureTask;

public final class RelayConfig {
    private RelayConfig() {}
    public static SharedPreferences getPrefs(Context c) { return c.getSharedPreferences("oppo_relay_config", Context.MODE_PRIVATE); }
    public static String getTargetMac(Context c) { return getPrefs(c).getString("target_mac", ""); }
    public static void setTargetMac(Context c, String mac) { getPrefs(c).edit().putString("target_mac", mac.toUpperCase(java.util.Locale.ROOT)).apply(); }
    public static int getProtocolCid(Context c) { return getPrefs(c).getInt("protocol_cid", 200); }
    public static void setProtocolCid(Context c, int cid) { synchronized(RelayConfig.class) { getPrefs(c).edit().putInt("protocol_cid", cid).apply(); } }
    public static java.util.Set<String> selectedApps(Context c) {
        return new java.util.HashSet<>(getPrefs(c).getStringSet("selected_apps",java.util.Collections.emptySet()));
    }
    public static void selectApps(Context c, java.util.Set<String> packages) {
        synchronized(RelayConfig.class) { getPrefs(c).edit().putStringSet("selected_apps",new java.util.HashSet<>(packages)).apply(); }
        RfcommWearTransport.getInstance(c).syncNotificationSettings();
    }
    public static boolean shouldForward(Context c, String pkg) {
        return getPrefs(c).getStringSet("selected_apps",java.util.Collections.emptySet()).contains(pkg);
    }
    public static boolean sourceInTitle(Context c) {return getPrefs(c).getBoolean("source_in_title",true);}
    public static boolean handoverNotices(Context c) {return getPrefs(c).getBoolean("handover_notices",true);}
    public static void setHandoverNotices(Context c,boolean enabled) {
        getPrefs(c).edit().putBoolean("handover_notices",enabled).apply();
        RelayAlerts.onNoticePreferenceChanged(c,enabled);
    }
    public static boolean autoRestore(Context c) {return getPrefs(c).getBoolean("auto_restore",true);}
    public static void setAutoRestore(Context c,boolean enabled) {getPrefs(c).edit().putBoolean("auto_restore",enabled).apply();}
    public static boolean suppressWhileScreenOn(Context c) {return getPrefs(c).getBoolean("suppress_screen_on",false);}
    public static void setSuppressWhileScreenOn(Context c,boolean value) {getPrefs(c).edit().putBoolean("suppress_screen_on",value).apply();}
    public static void setSourceInTitle(Context c,boolean value) {getPrefs(c).edit().putBoolean("source_in_title",value).apply();}
    // 兼容旧 UI 调用；不再展示或使用猜测的 LinkService AES key。
    public static String getAesKey(Context c) { return ""; }
    public static void setAesKey(Context c, String ignored) { }
    public static String peerId(Context c) {
        String value = getPrefs(c).getString("oaf_peer_id", "");
        if (value.isEmpty()) {
            value = "OAFP" + UUID.randomUUID().toString().replace("-", "").toUpperCase(java.util.Locale.ROOT);
            getPrefs(c).edit().putString("oaf_peer_id", value).commit();
        }
        return value;
    }
    public static JSONObject credentials(Context c) throws Exception {
        JSONObject j = new JSONObject(getPrefs(c).getString("oaf_credentials", "{}"));
        validate(j);
        if (!j.getString("mac").equalsIgnoreCase(getTargetMac(c))) throw new Exception("配对凭据与目标 MAC 不匹配");
        return j;
    }
    public static byte[] field(JSONObject j, String name) throws Exception { return Base64.decode(j.getString(name), Base64.NO_WRAP); }
    private static void validate(JSONObject j) throws Exception {
        if (j.optInt("schema") != 2 || j.optInt("uuidType", -1) != 1 || j.optInt("transport") != 2
                || !j.optString("mac").matches("(?i)([0-9a-f]{2}:){5}[0-9a-f]{2}")
                || field(j,"ksc").length != 16 || field(j,"localDeviceId").length != 6 || field(j,"kscAlias").length != 6)
            throw new Exception("尚未导入有效 OAF MCU 配对凭据");
    }
    public static String credentialStatus(Context c) {
        try {
            credentials(c);
            return getPrefs(c).getLong("credentials_verified_at",0)>0
                ? "本地配对凭据已保存，并曾通过独立通道鉴权；未重新配对时无需再次读取。"
                : "本地已有配对凭据（格式有效），是否可用以独立通道鉴权结果为准；无需寻找旧模块导出文件。";
        } catch(Exception e) {return "本地没有与当前 MAC 匹配的配对凭据，请先由官方完成配对并连接，再点击读取。";}
    }
    public static synchronized void markCredentialsVerified(Context c,JSONObject used) {
        if(used.toString().equals(getPrefs(c).getString("oaf_credentials","")))
            getPrefs(c).edit().putLong("credentials_verified_at",System.currentTimeMillis()).apply();
    }
    public static final class ImportResult {
        public final boolean updated;
        public final String message;
        ImportResult(boolean updated,String message) {this.updated=updated;this.message=message;}
    }
    /** 只读导入现有官方配对，失败不删除、不覆盖原凭据；不等于实现全新配对。 */
    public static ImportResult importOfficialPairing(Context c) {
        if(!OfficialHistoryStore.allowed(c))return new ImportResult(false,"已关闭官方数据访问，保留独立版配对信息");
        String mac=getTargetMac(c),failure="未找到已安装的官方健康应用";
        if(!mac.matches("(?i)([0-9a-f]{2}:){5}[0-9a-f]{2}")) return new ImportResult(false,"请先保存有效手表 MAC 地址");
        for(String pkg:new String[]{"com.heytap.health","com.coloros.health"}) {
            int uid;
            try {uid=c.getPackageManager().getApplicationInfo(pkg,android.content.pm.PackageManager.MATCH_DISABLED_COMPONENTS).uid;}
            catch(android.content.pm.PackageManager.NameNotFoundException ignored) {continue;}
            Process child=null;
            try {
                child=OfficialHistoryStore.launch(c,new ProcessBuilder(PairingImportLaunch.command(c.getApplicationInfo().sourceDir,pkg,uid,mac)).redirectErrorStream(true));
                final Process running=child;
                FutureTask<String> read=new FutureTask<>(() -> {
                    try(InputStream in=running.getInputStream();ByteArrayOutputStream bytes=new ByteArrayOutputStream()) {
                        byte[] buffer=new byte[1024];int n;
                        while((n=in.read(buffer))!=-1) {
                            if(bytes.size()+n>32768) throw new Exception("IMPORT_OUTPUT_LIMIT");
                            bytes.write(buffer,0,n);
                        }
                        return new String(bytes.toByteArray(),StandardCharsets.UTF_8);
                    }
                });
                Thread reader=new Thread(read,"OAF-import-result");reader.setDaemon(true);reader.start();
                String output=read.get(30,TimeUnit.SECONDS);
                String encoded=null,error="ROOT_REQUIRED";
                for(String line:output.split("\\r?\\n")) {
                    if(line.startsWith("OAFIMPORT1 OK ")) encoded=line.substring(14);
                    else if(line.startsWith("OAFIMPORT1 ERROR ")) error=line.substring(17);
                }
                if(encoded==null) {failure=importError(error);continue;}
                JSONObject j=new JSONObject(new String(Base64.decode(encoded,Base64.NO_WRAP),StandardCharsets.UTF_8));
                validate(j);
                if(!j.getString("mac").equalsIgnoreCase(mac) || !mac.equalsIgnoreCase(getTargetMac(c)))
                    throw new Exception("TARGET_CHANGED");
                OfficialHistoryStore.requireAllowed(c);
                synchronized(RelayConfig.class) {
                    if(!getPrefs(c).edit().putString("oaf_credentials",j.toString()).remove("credentials_verified_at")
                        .remove("aes_key").remove("node_id").commit()) throw new Exception("SAVE_FAILED");
                }
                return new ImportResult(true,"已直接读取官方现有配对，无需迁移模块。等待官方退出后，由独立通道鉴权确认是否可用。");
            } catch(java.util.concurrent.TimeoutException e) {failure="读取超时，请确认已向本应用授予 Root 权限";}
            catch(Exception e) {failure="读取或校验失败，请检查 Root 权限、手表 MAC 与官方配对状态";}
            finally {if(child!=null) {OfficialHistoryStore.release(child);try {child.getOutputStream().close();} catch(Exception ignored) { } child.destroy();}}
        }
        return new ImportResult(false,failure+"。原有本地凭据未改动。重新配对仍需先由官方完成；本应用暂不支持从零配对。");
    }
    private static String importError(String code) {
        if("OFFICIAL_UID_REQUIRED".equals(code)) return "配对读取进程未取得官方应用身份，请检查 Root 工具是否支持指定 UID";
        if("KEYSTORE_PROVIDER_FAILED".equals(code)) return "系统密钥服务初始化失败，此系统的配对读取方式需要适配";
        if("KEYSTORE_LOAD_FAILED".equals(code)) return "无法打开系统密钥服务，请解锁手机后重试";
        if("KEYSTORE_ACCESS_FAILED".equals(code)) return "系统未允许解密官方配对记录，此设备的无模块读取路径尚不可用";
        if("IMPORT_TIMEOUT".equals(code)) return "读取超时，请确认 Root 授权后重试";
        if("PAIRING_NOT_FOUND".equals(code)) return "官方没有当前 MAC 的 MCU 配对记录，请先用官方连接该手表";
        if("DATABASE_READ_FAILED".equals(code)) return "官方配对数据库不可读或记录格式不兼容";
        if("LOCAL_ID_NOT_FOUND".equals(code)) return "官方本机标识尚未生成，请先完成官方连接";
        if("OFFICIAL_RECORD_UNAVAILABLE".equals(code)) return "官方配对记录不可读，请检查 Root 权限及官方是否完成连接";
        return "无法读取官方配对，请确认本应用获得 Root 权限";
    }
}
