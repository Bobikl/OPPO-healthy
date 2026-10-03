package com.heytap.voiceassistant.sdk.tts;

import android.content.Context;
import android.text.TextUtils;
import com.heytap.voiceassistant.sdk.tts.closure.a.a;
import com.heytap.voiceassistant.sdk.tts.closure.c.d;
import com.heytap.voiceassistant.sdk.tts.closure.d.b;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.heytap.voiceassistant.sdk.tts.internal.CallerInfo;
import com.heytap.voiceassistant.sdk.tts.monitor.Logger;
import java.io.File;

/* JADX INFO: loaded from: classes19.dex */
public class Config {
    private static final int IMEI_IMSI_MIN_LENGTH = 14;
    private static final int MAC_ADDRESS_MIN_LENGTH = 17;
    public static final int SDK_VERSION = 1112;
    private static final String TAG = "Config";
    private static String sWorkDirPath;
    private static final d sSdkParams = new d();
    private static final CallerInfo sCallerInfo = new CallerInfo();
    private static volatile boolean sHasInit = false;
    private static String sGenDirPath = null;
    private static volatile String sAppId = "appid2020033001";
    private static volatile String sAppKey = "deac96a0a61a43778e7c63899e941af9";
    private static String sAuthId = null;
    private static String sImei = null;
    private static String sImsi = null;
    private static String sDuid = null;
    private static String sMac = null;

    private Config() {
    }

    public static void dumpToSdkParams(d dVar) {
        if (dVar != null) {
            dVar.a("appid", sAppId, true);
            dVar.a("key", sAppKey, true);
            CallerInfo callerInfo = sCallerInfo;
            dVar.a("userId", callerInfo.mUserId, false);
            dVar.a(SpeechConstant.CALLER_NAME, callerInfo.mName, false);
            dVar.a(SpeechConstant.CALLER_PACKAGE_NAME, callerInfo.mPackageName, false);
            dVar.a(SpeechConstant.CALLER_VER_CODE, callerInfo.mVersion, false);
            dVar.a(SpeechConstant.CALLER_VER_NAME, callerInfo.mVersionName, false);
        }
    }

    public static String getAppKey() {
        return sAppKey;
    }

    public static CallerInfo getCallerInfo() {
        return sCallerInfo;
    }

    public static String getGenSubDirPath(String str) {
        if (TextUtils.isEmpty(sGenDirPath)) {
            sGenDirPath = sWorkDirPath + File.separator + "gen";
        }
        return sGenDirPath + File.separator + str;
    }

    public static String getParam(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "getParam | key: empty";
        } else {
            if ("version_code".equals(str)) {
                String strValueOf = String.valueOf(1112);
                Logger.debug(TAG, "getParam | key: " + str + ", value: " + strValueOf);
                return strValueOf;
            }
            str2 = "getParam | unsupported key: " + str;
        }
        Logger.debug(TAG, str2);
        return null;
    }

    public static d getSdkParams() {
        return sSdkParams;
    }

    public static void init(Context context) {
        synchronized (Config.class) {
            if (!sHasInit) {
                Logger.error(TAG, "Heytap TTS Engine SDK VERSION_CODE: 1112");
                if (TextUtils.isEmpty(sWorkDirPath)) {
                    throw new SpeechException(20012, "WorkDirPath is empty");
                }
                CallerInfo callerInfo = sCallerInfo;
                callerInfo.mName = "speech_sdk";
                callerInfo.mAppId = sAppId;
                callerInfo.mUserId = "";
                callerInfo.mPackageName = context.getPackageName();
                try {
                    callerInfo.mVersion = "" + context.getPackageManager().getPackageInfo(context.getPackageName(), 0).getLongVersionCode();
                } catch (Exception e2) {
                    Logger.error(TAG, "", e2);
                }
                try {
                    sCallerInfo.mVersionName = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                } catch (Exception e3) {
                    Logger.error(TAG, "", e3);
                }
                d dVar = sSdkParams;
                dVar.a(SpeechConstant.KEY_WORK_DIR_PATH, sWorkDirPath, true);
                dumpToSdkParams(dVar);
                if (context.getExternalCacheDir() != null) {
                    b.g = context.getExternalCacheDir().getAbsolutePath();
                }
                sHasInit = true;
            }
        }
    }

    public static int setParam(String str, String str2) {
        d dVar;
        StringBuilder sb = new StringBuilder();
        sb.append("setParam | key = ");
        sb.append(str);
        sb.append(", value = ");
        sb.append(!"key".equals(str) ? str2 : "xxx");
        Logger.debug(TAG, sb.toString());
        if (TextUtils.isEmpty(str)) {
            Logger.debug(TAG, "setParam | key is empty");
            return 20012;
        }
        str.getClass();
        String str3 = "duid";
        boolean z = true;
        switch (str) {
            case "work_dir_path":
                if (TextUtils.isEmpty(str2)) {
                    Logger.debug(TAG, "setParam | value is empty");
                    return 20012;
                }
                sWorkDirPath = str2;
                return 0;
            case "auth_id":
                sAuthId = str2;
                return 0;
            case "gen_dir_path":
                if (TextUtils.isEmpty(str2)) {
                    Logger.debug(TAG, "setParam | value is empty");
                    return 20012;
                }
                sGenDirPath = str2;
                return 0;
            case "key":
                sAppKey = str2;
                return 0;
            case "mac":
                if (TextUtils.isEmpty(str2)) {
                    Logger.debug(TAG, "setParam | value is empty");
                    return 20012;
                }
                if (17 == str2.length()) {
                    sMac = str2;
                    return 0;
                }
                StringBuilder sbA = a.a("setParam | 17 != value.length() = ");
                sbA.append(str2.length());
                Logger.debug(TAG, sbA.toString());
                return 20012;
            case "duid":
                sDuid = str2;
                dVar = sSdkParams;
                dVar.a(str3, str2, true);
                return 0;
            case "imei":
                if (TextUtils.isEmpty(str2)) {
                    Logger.debug(TAG, "setParam | value is empty");
                    return 20012;
                }
                if (14 > str2.length()) {
                    StringBuilder sbA2 = a.a("setParam | 14 > value.length() = ");
                    sbA2.append(str2.length());
                    Logger.debug(TAG, sbA2.toString());
                    return 20012;
                }
                sImei = str2;
                dVar = sSdkParams;
                str3 = "imei";
                dVar.a(str3, str2, true);
                return 0;
            case "imsi":
                if (TextUtils.isEmpty(str2)) {
                    Logger.debug(TAG, "setParam | value is empty");
                    return 20012;
                }
                if (14 > str2.length()) {
                    StringBuilder sbA3 = a.a("setParam | 14 > value.length() = ");
                    sbA3.append(str2.length());
                    Logger.debug(TAG, sbA3.toString());
                    return 20012;
                }
                sImsi = str2;
                dVar = sSdkParams;
                str3 = "imei";
                dVar.a(str3, str2, true);
                return 0;
            case "is_sensitive_log_enable":
                if (!SpeechConstant.TRUE_STR.equalsIgnoreCase(str2) && !"1".equalsIgnoreCase(str2)) {
                    if (!SpeechConstant.FALSE_STR.equalsIgnoreCase(str2) && !"0".equalsIgnoreCase(str2)) {
                        Logger.error(TAG, "setParam | unsupported value = " + str2);
                        return 20012;
                    }
                    z = false;
                }
                Logger.error("LogMask", "setIsSensitiveLogEnable | isEnable = " + z);
                com.heytap.voiceassistant.sdk.tts.monitor.a.a = z;
                return 0;
            case "appid":
                sAppId = str2;
                sSdkParams.a("appid", sAppId, true);
                return 0;
            case "log_lvl":
                Logger.getLogLevel();
                try {
                    Logger.setLogLevel(Integer.parseInt(str2));
                    return 0;
                } catch (NumberFormatException e2) {
                    Logger.error(TAG, "", e2);
                    return 20012;
                }
            default:
                sSdkParams.a(str, str2, true);
                return 0;
        }
    }
}
