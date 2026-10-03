package com.customer.feedback.sdk.util;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import com.customer.feedback.sdk.feedbacka;
import com.oplus.aiunit.vision.alf;
import com.oplus.aiunit.vision.bwm;
import com.oplus.aiunit.vision.fwm;
import com.oplus.aiunit.vision.gwm;
import com.oplus.aiunit.vision.kwm;
import com.oplus.aiunit.vision.twm;
import com.oplus.aiunit.vision.yvm;
import com.oplus.aiunit.vision.zwm;
import com.oplus.weatherservicesdk.data.Weather;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes13.dex */
public class HeaderInfoHelper {
    private static String APP_CODE = null;
    private static final int BUILD_DISPLAY_SPLIT_SIZE = 3;
    public static final boolean IS_BASE64 = false;
    private static final String PRODUCT_EXP_VERSION = "ro.vendor.oplus.exp.version";
    public static final String RO_BUILD_ID = "ro.build.display.id";
    private static final String SDK_VERSION = "16.1.8";
    public static final String SYS_BUILD_ID = "sys.build.display.id";
    private static final String TAG = "HeaderInfoHelper";

    public static String getAppCode(Context context) {
        String str = APP_CODE;
        if (str != null && !TextUtils.isEmpty(str) && !APP_CODE.equals("0") && !APP_CODE.equals("")) {
            return specCode(APP_CODE);
        }
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle != null) {
                int i = bundle.getInt("feedback_product_code");
                if (i == 0) {
                    i = bundle.getInt("upgrade_product_code");
                }
                return specCode(i);
            }
            try {
                throw new Exception("You should set meta-data with upgrade_product_code first ");
            } catch (Exception e2) {
                LogUtil.e(TAG, "exceptionInfo：" + e2);
                return "0";
            }
        } catch (PackageManager.NameNotFoundException e3) {
            LogUtil.e(TAG, "exceptionInfo：" + e3);
            return "0";
        }
    }

    public static String getAppVersion(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    public static String getBrand() {
        return Build.BRAND;
    }

    private static String getBuildNumber(String str) {
        String str2 = Build.DISPLAY;
        boolean zEquals = TextUtils.equals(str, "CN");
        if (zEquals) {
            String strF = kwm.f(PRODUCT_EXP_VERSION, "");
            if (!TextUtils.isEmpty(strF)) {
                return strF;
            }
        }
        String strF2 = kwm.f("ro.build.time.fix", "");
        if (!TextUtils.isEmpty(strF2)) {
            return strF2;
        }
        String strF3 = kwm.f(SYS_BUILD_ID, null);
        if (!TextUtils.isEmpty(strF3)) {
            return strF3;
        }
        if (zEquals) {
            String[] strArrSplit = str2.split("_");
            if (strArrSplit.length >= 3) {
                if (TextUtils.equals(str, alf.MX)) {
                    return strArrSplit[0] + "_" + strArrSplit[1];
                }
                String str3 = String.format("%s_%s_%s", strArrSplit[0], strArrSplit[1], strArrSplit[2]);
                if (strArrSplit.length <= 3) {
                    return str3;
                }
                return str3 + "_" + strArrSplit[3];
            }
        }
        return str2;
    }

    public static String getCommonLanguage(String str) {
        String str2;
        if (str == null) {
            return "";
        }
        if (str.startsWith("ar")) {
            return "ar_EG";
        }
        if (TextUtils.isEmpty(str) || !str.contains("#")) {
            return str;
        }
        if (str.startsWith("zh") || str.startsWith("yue")) {
            str2 = "zh_CN";
            if (!str.contains("Hans") && str.contains("Hant")) {
                str2 = str.contains(alf.TW) ? "zh_TW" : "zh_HK";
            }
        } else {
            str2 = str;
        }
        LogUtil.d(TAG, "getCommonLanguage -> " + str + " | " + str2);
        return str2;
    }

    public static String getCountry(Context context) {
        return Locale.getDefault().getCountry();
    }

    private static String getEncryptString(String str) {
        return TextUtils.isEmpty(str) ? str : " not empty";
    }

    public static String getFirmwareVersion(Context context) {
        return Build.DISPLAY;
    }

    public static Map<String, String> getHeader(Context context, boolean z) {
        return getHeader(context);
    }

    public static String getIAdd() {
        return "empty";
    }

    public static String getLanguage(Context context) {
        return kwm.g() == null ? "" : kwm.g().toString();
    }

    public static String getModel() {
        String str = Build.MODEL;
        return !TextUtils.isEmpty(str) ? str : "";
    }

    public static String getNetType(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager == null ? null : connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                String strTrim = activeNetworkInfo.getTypeName().toLowerCase().trim();
                if (strTrim != null && strTrim.equals("mobile")) {
                    strTrim = activeNetworkInfo.getExtraInfo().toLowerCase();
                }
                if (strTrim != null) {
                    strTrim = sanitizeHeaderValue(strTrim);
                }
                return strTrim == null ? "null" : strTrim;
            }
        } catch (Exception e2) {
            LogUtil.e(TAG, "exceptionInfo：" + e2);
        }
        return "null";
    }

    public static String getRegion(Context context) {
        try {
            String strF = kwm.f("persist.sys.oem.region", "NOTHING");
            String strF2 = kwm.f(fwm.THEME_IS_EXP, "NOTHING");
            if (strF2.equals("NOTHING")) {
                strF2 = kwm.f("persist.sys.oplus.region", "NOTHING");
            }
            boolean zEquals = "NOTHING".equals(strF2);
            boolean zEquals2 = "NOTHING".equals(strF);
            if (zEquals ^ zEquals2) {
                return zEquals2 ? strF2 : strF;
            }
            return "CN";
        } catch (Exception e2) {
            LogUtil.e(TAG, "exceptionInfo：" + e2);
            return "CN";
        }
    }

    public static String getRomVersion() {
        String str = Build.VERSION.RELEASE;
        return !TextUtils.isEmpty(str) ? str : "";
    }

    public static String getSdkVersion(Context context) {
        return SDK_VERSION;
    }

    public static String getStandardLanguage(Context context, String str) {
        if ("bo_CN".equalsIgnoreCase(str)) {
            return str;
        }
        try {
            int identifier = context.getResources().getIdentifier("language_values_exam", TypedValues.Custom.S_STRING, "oplus");
            if (identifier <= 0) {
                return "";
            }
            String string = context.getResources().getString(identifier);
            return !TextUtils.isEmpty(string) ? string.replace("-", "_") : string;
        } catch (Exception e2) {
            LogUtil.w(TAG, "get standard language mark failed: " + e2.getMessage());
            return "";
        }
    }

    public static String getSysBuildID() {
        String strF = kwm.f(SYS_BUILD_ID, "");
        if (TextUtils.isEmpty(strF)) {
            strF = kwm.f(RO_BUILD_ID, "");
        }
        try {
            return strF.length() > 31 ? strF.substring(0, 31) : strF;
        } catch (Exception e2) {
            LogUtil.e(TAG, "catch exception when split string:" + e2.getMessage());
            return strF;
        }
    }

    public static String getTimezone() {
        TimeZone timeZone = Calendar.getInstance().getTimeZone();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("ZZZZ");
        simpleDateFormat.setTimeZone(timeZone);
        return simpleDateFormat.format(Calendar.getInstance().getTime());
    }

    public static String getVersion() {
        if (TextUtils.isEmpty(gwm.feedbacka)) {
            return bwm.b();
        }
        return ExifInterface.GPS_MEASUREMENT_INTERRUPTED + gwm.feedbacka;
    }

    public static int getVersionCode(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    private static String intIP2StringIP(int i) {
        return (i & 255) + "." + ((i >> 8) & 255) + "." + ((i >> 16) & 255) + "." + ((i >> 24) & 255);
    }

    private static String sanitizeHeaderValue(String str) {
        return str == null ? "" : str.replace("\r", "").replace(Weather.SEPARATOR, "");
    }

    public static void setAppCode(String str) {
        APP_CODE = str;
    }

    private static String specCode(int i) {
        return specCode(String.valueOf(i));
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static Map<String, String> getHeader(Context context) {
        HashMap map = new HashMap();
        String str = feedbacka.feedbacks;
        String appCode = getAppCode(context);
        String appVersion = TextUtils.isEmpty(feedbacka.feedbackm) ? getAppVersion(context) : feedbacka.feedbackm;
        String model = getModel();
        String romVersion = getRomVersion();
        String version = getVersion();
        String region = getRegion(context);
        String language = getLanguage(context);
        String standardLanguage = getStandardLanguage(context, language);
        String country = getCountry(context);
        String sdkVersion = getSdkVersion(context);
        String firmwareVersion = getFirmwareVersion(context);
        String netType = getNetType(context);
        String iAdd = getIAdd();
        String str2 = feedbacka.feedbackj;
        String str3 = feedbacka.feedbacki;
        String str4 = yvm.feedbackb;
        String str5 = feedbacka.feedbackr;
        String sysBuildID = getSysBuildID();
        String buildNumber = getBuildNumber(region);
        String str6 = feedbacka.d;
        String strValueOf = String.valueOf(twm.a() ? 1 : 0);
        map.put("FB-PC", sanitizeHeaderValue(kwm.e(appCode)));
        map.put("FB-PV", sanitizeHeaderValue(kwm.e(appVersion)));
        map.put("FB-PVC", sanitizeHeaderValue(String.valueOf(getVersionCode(context))));
        map.put("FB-SVC", sanitizeHeaderValue(String.valueOf(16010080)));
        try {
            map.put("FB-IMEI", sanitizeHeaderValue(URLEncoder.encode(zwm.a(context, str), "UTF-8")));
        } catch (UnsupportedEncodingException e2) {
            LogUtil.e(TAG, "IMEI  encode error-> " + e2.getMessage());
        }
        if (!TextUtils.isEmpty(str)) {
            map.put("FB-VAID", sanitizeHeaderValue(kwm.e(str)));
        }
        map.put("FB-MODEL", sanitizeHeaderValue(kwm.e(model)));
        map.put("FB-VERSION", sanitizeHeaderValue(kwm.e(romVersion)));
        map.put("FB-".concat(kwm.q()), sanitizeHeaderValue(kwm.e(version)));
        map.put("FB-WIDTH", sanitizeHeaderValue(kwm.e("320")));
        map.put("FB-OPERATOR", sanitizeHeaderValue(kwm.e("")));
        map.put("FB-IP", sanitizeHeaderValue(kwm.e(iAdd)));
        map.put("FB-APPNAME", sanitizeHeaderValue(kwm.e(str6)));
        map.put("FB-REGION", sanitizeHeaderValue(kwm.e(region)));
        map.put("FB-LANGUAGE", sanitizeHeaderValue(getCommonLanguage(language)));
        map.put("FB-SLANGUAGE", sanitizeHeaderValue(getCommonLanguage(standardLanguage)));
        map.put("FB-COUNTRY", sanitizeHeaderValue(kwm.e(country)));
        map.put("FB-TIMEZONE", sanitizeHeaderValue(kwm.e(getTimezone())));
        map.put("FB-BRAND", sanitizeHeaderValue(kwm.e(getBrand())));
        map.put("FB-FIRMWARE", sanitizeHeaderValue(kwm.e(firmwareVersion)));
        map.put("FB-NETTYPE", sanitizeHeaderValue(kwm.e(netType)));
        map.put("FB-UID", sanitizeHeaderValue(kwm.e(str2)));
        map.put("FB-UNAME", sanitizeHeaderValue(kwm.e(str3)));
        map.put("FB-ENCODE", sanitizeHeaderValue("0"));
        map.put("FB-SDKVER", sanitizeHeaderValue(sdkVersion));
        map.put("FB-RESTURL", sanitizeHeaderValue(str4));
        map.put("FB-MULTIAPPFLAG", sanitizeHeaderValue(str5));
        try {
            map.put("FB-SYSBUILDID", sanitizeHeaderValue(URLEncoder.encode(zwm.a(context, sysBuildID), "UTF-8")));
        } catch (UnsupportedEncodingException e3) {
            LogUtil.e(TAG, "SYSBUILDID  encode error-> " + e3.getMessage());
        }
        map.put("FB-PRODUCTVER", sanitizeHeaderValue(buildNumber));
        map.put("FB-SUPPORT_LOGKIT", sanitizeHeaderValue(strValueOf));
        HashMap map2 = feedbacka.f;
        if (!map2.isEmpty()) {
            for (Map.Entry entry : map2.entrySet()) {
                LogUtil.v(TAG, "extra data key is:" + ((String) entry.getKey()));
                map.put((String) entry.getKey(), sanitizeHeaderValue((String) entry.getValue()));
            }
        }
        LogUtil.v(TAG, "\nFB-PC=" + appCode + "\nFB-PV=" + appVersion + "\nFB-SVC=16010080\nFB-DEVICE=" + getEncryptString(str) + "\nFB-VID=" + getEncryptString(str) + "\nFB-MODEL=" + model + "\nFB-VERSION=" + romVersion + "\nFB-OsVERSION=" + version + "\nFB-WIDTH=320\nFB-OPERATOR=\nFB-IADD=" + getEncryptString(iAdd) + "\nFB-Region=" + region + "\nFB-Language=" + language + "\nFB-SLanguage=" + standardLanguage + "\nFB-CT=" + country + "\nFB-TIMEZONE=" + getTimezone() + "\nFB-BRAND=" + getBrand() + "\nFB-FIRMWARE=" + getEncryptString(firmwareVersion) + "\nFB-NETTYPE=" + netType + "\nFB-UID=" + getEncryptString(str2) + "\nFB-UNAME=" + str3 + "\nFB-SDKVER=" + sdkVersion + "\nFB-SYSBUILDID=" + sysBuildID + "\nFB-MULTIAPPFLAG=" + str5 + "\nFB-RESTURL=" + str4 + "\nFB-PRODUCTVER" + buildNumber + "\nFB-SUPPORT_LOGKIT" + strValueOf);
        return map;
    }

    private static String specCode(String str) {
        str.getClass();
        switch (str) {
            case "1":
                return "001";
            case "2":
                return "002";
            case "3":
                return "003";
            case "4":
                return "004";
            default:
                return str.concat("");
        }
    }
}
