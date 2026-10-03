package com.heytap.log;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.heytap.log.env.cn.cn.AreaEnv;
import com.heytap.log.env.test.test.TestAreaEnv;
import com.heytap.log.util.AESUtils;
import com.heytap.log.util.AppUtil;
import com.heytap.log.util.DeviceUtil;
import com.heytap.log.util.SecurityUtils;
import java.net.URLEncoder;

/* JADX INFO: loaded from: classes19.dex */
public class UrlProvider {
    private static final String BUSINESS = "business";
    private static final String SPACE = " ";
    private static final String TAG = "com.heytap.log.UrlProvider";
    private static final String URL_STATUS_REPORT = "/usertrace/log/business/levelConfigStatusReport";
    private static final String URL_UPLOAD_CONFIG = "/usertrace/log/business/config";
    private static final String URL_UPLOAD_FILE = "/usertrace/log/business/upload";
    private static final String URL_UPLOAD_REPORT = "/usertrace/log/business/report";
    private static String mEncryptedOpenId;
    public static int[] AES_KEY_ARRAYS = {97, 100, 102, 64, 115, 102, 83, 115, 40, 82, 92, 116, 127, 40, 32, 83, 92, 93, 85, 58, 68, 80, 44, 44};
    private static String mEncryptedImei = "";
    public static String ID_PREFIX = "222%23";

    private static String getEncryptedImei(String str) {
        try {
            if (TextUtils.isEmpty(mEncryptedImei)) {
                mEncryptedImei = ID_PREFIX + AESUtils.encryptByKey(AES_KEY_ARRAYS, str);
            }
            return (TextUtils.isEmpty(mEncryptedImei) || ID_PREFIX.equals(mEncryptedImei)) ? str : mEncryptedImei;
        } catch (Exception unused) {
            return str;
        }
    }

    private static String getEncryptedOpenId(String str) {
        try {
            if (TextUtils.isEmpty(mEncryptedOpenId)) {
                mEncryptedOpenId = ID_PREFIX + AESUtils.encryptByKey(AES_KEY_ARRAYS, str);
            }
            return (TextUtils.isEmpty(mEncryptedOpenId) || ID_PREFIX.equals(mEncryptedOpenId)) ? str : mEncryptedOpenId;
        } catch (Exception unused) {
            Log.e(TAG, "encry information error !");
            return str;
        }
    }

    public static String getHost(int i) {
        try {
            if (i != 0) {
                if (i == 1) {
                    return TestAreaEnv.getHostTest();
                }
                if (i != 2) {
                    return i != 3 ? "" : TestAreaEnv.getHostInternal();
                }
                return TestAreaEnv.getHostDev();
            }
            if (!AppUtil.isOversea()) {
                return AreaEnv.getHost();
            }
            if (AppUtil.isIndia()) {
                return com.heytap.log.env.oversea.oversea.AreaEnv.getIndiaHost();
            }
            return AppUtil.isSingapore() ? com.heytap.log.env.oversea.oversea.AreaEnv.getSingaporeHost() : "";
        } catch (Throwable th) {
            Log.e("NearX-HLog", "makeUploadUrl-->" + th);
            return "";
        }
    }

    public static String makeCheckUploadUrl(String str, String str2, Settings.ICustomIDProvider iCustomIDProvider, Settings.IOpenIdProvider iOpenIdProvider, String str3, int i) {
        return ((getHost(i) + URL_UPLOAD_CONFIG).replace("business", str) + "?subType=" + str2 + "&imei=" + getEncryptedImei(makeImei(iCustomIDProvider)) + "&openId=" + getEncryptedOpenId(makeOpenId(iOpenIdProvider)) + "&tracePkg=" + str3).replaceAll(SPACE, "_");
    }

    private static String makeImei(Settings.ICustomIDProvider iCustomIDProvider) {
        return iCustomIDProvider == null ? "" : iCustomIDProvider.getCustomID();
    }

    private static String makeImeiFromSettings(Settings settings) {
        if (settings == null) {
            return "";
        }
        if (settings.getCustomIdProvider() != null) {
            String customID = settings.getCustomIdProvider().getCustomID();
            if (!TextUtils.isEmpty(customID)) {
                return customID;
            }
        }
        if (settings.getImeiProvider() != null) {
            String imei = settings.getImeiProvider().getImei();
            if (!TextUtils.isEmpty(imei)) {
                return imei;
            }
        }
        return "";
    }

    private static String makeOpenId(Settings.IOpenIdProvider iOpenIdProvider) {
        if (iOpenIdProvider == null) {
            return "";
        }
        String guid = iOpenIdProvider.getGuid() == null ? "" : iOpenIdProvider.getGuid();
        String ouid = iOpenIdProvider.getOuid() == null ? "" : iOpenIdProvider.getOuid();
        String duid = iOpenIdProvider.getDuid() != null ? iOpenIdProvider.getDuid() : "";
        Log.e("HLog", guid + "/" + ouid + "/" + duid);
        return guid + "/" + ouid + "/" + duid;
    }

    public static String makeReportUrl(String str, String str2, String str3, int i, String str4, String str5, Settings.ICustomIDProvider iCustomIDProvider, Settings.IOpenIdProvider iOpenIdProvider, String str6, String str7, String str8, long j2, String str9, String str10, ISimpleLog iSimpleLog, int i2) {
        String strReplace = (getHost(i2) + URL_UPLOAD_REPORT).replace("business", str);
        String encryptedImei = getEncryptedImei(makeImei(iCustomIDProvider));
        String encryptedOpenId = getEncryptedOpenId(makeOpenId(iOpenIdProvider));
        String strMakeSignature = SecurityUtils.makeSignature(str2, str8, j2, i, str5, encryptedImei, encryptedOpenId, str6, str7, str3, str4, str9, str10, iSimpleLog);
        StringBuilder sb = new StringBuilder(strReplace);
        sb.append("?specificId=");
        sb.append(str2);
        sb.append("&reportReason=");
        sb.append(URLEncoder.encode(str8));
        sb.append("&program=");
        sb.append(str7);
        sb.append("&ts=");
        sb.append(j2);
        sb.append("&sign=");
        sb.append(strMakeSignature);
        sb.append("&businessVersion=");
        sb.append(AppUtil.getAppVersionName(AppUtil.getAppContext()));
        sb.append("&protocolVersion=");
        sb.append("3");
        sb.append("&errorCode=");
        sb.append(i);
        sb.append("&subType=");
        sb.append(str5);
        sb.append("&brand=");
        sb.append(DeviceUtil.getPhoneBrand());
        sb.append("&model=");
        sb.append(Build.MODEL);
        sb.append("&osVersion=");
        sb.append(DeviceUtil.getOsVersion());
        sb.append("&romVersion=");
        sb.append(DeviceUtil.getMobileRomVersion());
        sb.append("&androidVersion=");
        sb.append(Build.VERSION.RELEASE);
        sb.append("&imei=");
        sb.append(encryptedImei);
        sb.append("&openId=");
        sb.append(encryptedOpenId);
        sb.append("&tracePkg=");
        sb.append(str6);
        if (!TextUtils.isEmpty(str3)) {
            sb.append("&fileName=");
            sb.append(str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            sb.append("&errorMsg=");
            sb.append(str4);
        }
        return sb.toString().replaceAll(SPACE, "_");
    }

    public static String makeStatusReportUrl(String str, String str2, int i, String str3, Settings.ICustomIDProvider iCustomIDProvider, Settings.IOpenIdProvider iOpenIdProvider, int i2) {
        return ((getHost(i2) + URL_STATUS_REPORT).replace("business", str) + "?traceId=" + str2 + "&imei=" + getEncryptedImei(makeImei(iCustomIDProvider)) + "&openId=" + getEncryptedOpenId(makeOpenId(iOpenIdProvider)) + "&levelStatusCode=" + i + "&levelStatusMsg=" + str3 + "&subBusiness=").replaceAll(SPACE, "_");
    }

    public static String makeUploadUrl(String str, String str2, String str3, int i, String str4, String str5, Settings.ICustomIDProvider iCustomIDProvider, Settings.IOpenIdProvider iOpenIdProvider, String str6, int i2) {
        StringBuilder sb = new StringBuilder((getHost(i2) + URL_UPLOAD_FILE).replace("business", str));
        sb.append("?traceId=");
        sb.append(str2);
        sb.append("&businessVersion=");
        sb.append(AppUtil.getAppVersionName(AppUtil.getAppContext()));
        sb.append("&protocolVersion=");
        sb.append("3");
        sb.append("&errorCode=");
        sb.append(i);
        sb.append("&subType=");
        sb.append(str5);
        sb.append("&brand=");
        sb.append(DeviceUtil.getPhoneBrand());
        sb.append("&model=");
        sb.append(Build.MODEL);
        sb.append("&osVersion=");
        sb.append(DeviceUtil.getOsVersion());
        sb.append("&romVersion=");
        sb.append(DeviceUtil.getMobileRomVersion());
        sb.append("&androidVersion=");
        sb.append(Build.VERSION.RELEASE);
        sb.append("&imei=");
        sb.append(getEncryptedImei(makeImei(iCustomIDProvider)));
        sb.append("&openId=");
        sb.append(getEncryptedOpenId(makeOpenId(iOpenIdProvider)));
        sb.append("&tracePkg=");
        sb.append(str6);
        if (!TextUtils.isEmpty(str3)) {
            sb.append("&fileName=");
            sb.append(str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            sb.append("&errorMsg=");
            sb.append(str4);
        }
        return sb.toString().replaceAll(SPACE, "_");
    }

    public static String makeCheckUploadUrl(String str, String str2, int i, Settings settings) {
        if (settings == null) {
            return "";
        }
        return ((getHost(i, settings.getRegion()) + URL_UPLOAD_CONFIG).replace("business", settings.getBusiness()) + "?subType=" + str + "&imei=" + getEncryptedImei(makeImeiFromSettings(settings)) + "&openId=" + getEncryptedOpenId(makeOpenId(settings.getOpenIdProvider())) + "&tracePkg=" + str2).replaceAll(SPACE, "_");
    }

    public static String getHost(int i, String str) {
        try {
            if (i != 0) {
                if (i == 1) {
                    return TestAreaEnv.getHostTest();
                }
                if (i != 2) {
                    return i != 3 ? "" : TestAreaEnv.getHostInternal();
                }
                return TestAreaEnv.getHostDev();
            }
            if (TextUtils.isEmpty(str)) {
                str = AppUtil.autoRegionValue();
            }
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            if (AppUtil.isOversea(str)) {
                if (AppUtil.isIndia(str)) {
                    return com.heytap.log.env.oversea.oversea.AreaEnv.getIndiaHost();
                }
                return AppUtil.isSingapore(str) ? com.heytap.log.env.oversea.oversea.AreaEnv.getSingaporeHost() : "";
            }
            return AreaEnv.getHost();
        } catch (Throwable th) {
            Log.e("NearX-HLog", "makeUploadUrl-->" + th);
            return "";
        }
    }

    public static String makeStatusReportUrl(String str, int i, String str2, Settings settings) {
        if (settings == null) {
            return "";
        }
        return ((getHost(settings.getEnv(), settings.getRegion()) + URL_STATUS_REPORT).replace("business", settings.getBusiness()) + "?traceId=" + str + "&imei=" + getEncryptedImei(makeImeiFromSettings(settings)) + "&openId=" + getEncryptedOpenId(makeOpenId(settings.getOpenIdProvider())) + "&levelStatusCode=" + i + "&levelStatusMsg=" + str2 + "&subBusiness=").replaceAll(SPACE, "_");
    }

    public static String makeUploadUrl(String str, String str2, String str3, int i, String str4, String str5, String str6, Settings settings, String str7, String str8) {
        if (settings == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder((getHost(settings.getEnv(), settings.getRegion()) + URL_UPLOAD_FILE).replace("business", str));
        sb.append("?traceId=");
        sb.append(str2);
        sb.append("&businessVersion=");
        sb.append(AppUtil.getAppVersionName(AppUtil.getAppContext()));
        sb.append("&protocolVersion=");
        sb.append("3");
        sb.append("&errorCode=");
        sb.append(i);
        sb.append("&subType=");
        sb.append(str5);
        sb.append("&brand=");
        sb.append(DeviceUtil.getPhoneBrand());
        sb.append("&model=");
        sb.append(Build.MODEL);
        sb.append("&osVersion=");
        sb.append(DeviceUtil.getOsVersion());
        sb.append("&romVersion=");
        sb.append(DeviceUtil.getMobileRomVersion());
        sb.append("&androidVersion=");
        sb.append(Build.VERSION.RELEASE);
        sb.append("&imei=");
        sb.append(str7);
        sb.append("&openId=");
        sb.append(str8);
        sb.append("&tracePkg=");
        sb.append(str6);
        if (!TextUtils.isEmpty(str3)) {
            sb.append("&fileName=");
            sb.append(str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            sb.append("&errorMsg=");
            sb.append(str4);
        }
        return sb.toString().replaceAll(SPACE, "_");
    }

    public static String makeReportUrl(String str, String str2, String str3, int i, String str4, String str5, String str6, String str7, String str8, long j2, String str9, String str10, ISimpleLog iSimpleLog, Settings settings, String str11, String str12) {
        if (settings == null) {
            return "";
        }
        String strReplace = (getHost(settings.getEnv(), settings.getRegion()) + URL_UPLOAD_REPORT).replace("business", str);
        String strMakeSignature = SecurityUtils.makeSignature(str2, str8, j2, i, str5, str11, str12, str6, str7, str3, str4, str9, str10, iSimpleLog);
        StringBuilder sb = new StringBuilder(strReplace);
        sb.append("?specificId=");
        sb.append(str2);
        sb.append("&reportReason=");
        sb.append(URLEncoder.encode(str8));
        sb.append("&program=");
        sb.append(str7);
        sb.append("&ts=");
        sb.append(j2);
        sb.append("&sign=");
        sb.append(strMakeSignature);
        sb.append("&businessVersion=");
        sb.append(AppUtil.getAppVersionName(AppUtil.getAppContext()));
        sb.append("&protocolVersion=");
        sb.append("3");
        sb.append("&errorCode=");
        sb.append(i);
        sb.append("&subType=");
        sb.append(str5);
        sb.append("&brand=");
        sb.append(DeviceUtil.getPhoneBrand());
        sb.append("&model=");
        sb.append(Build.MODEL);
        sb.append("&osVersion=");
        sb.append(DeviceUtil.getOsVersion());
        sb.append("&romVersion=");
        sb.append(DeviceUtil.getMobileRomVersion());
        sb.append("&androidVersion=");
        sb.append(Build.VERSION.RELEASE);
        sb.append("&imei=");
        sb.append(str11);
        sb.append("&openId=");
        sb.append(str12);
        sb.append("&tracePkg=");
        sb.append(str6);
        if (!TextUtils.isEmpty(str3)) {
            sb.append("&fileName=");
            sb.append(str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            sb.append("&errorMsg=");
            sb.append(str4);
        }
        return sb.toString().replaceAll(SPACE, "_");
    }
}
