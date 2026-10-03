package com.heytap.log.util;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.aiunit.vision.alf;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.utrace.utils.SystemSettingsUtilsKt;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes19.dex */
public final class AppUtil {
    public static final String[] AREA_SG_ARR;
    public static final Set<String> AREA_SG_SET;
    private static int[] DEFAULT_COUNTRY = null;
    private static int[] DEFAULT_IN_COUNTRY = null;
    private static int SYSTEM_UID_RANGE = 0;
    private static int sAppVersionCode = 0;
    private static boolean sIsOpenSysLog = false;
    public static String sProcessName = "";
    private static final Object sNameLock = new Object();
    private static Long sSdkVersionCode = 0L;
    private static String sAppVersionName = "";
    private static Context mAppContext = null;
    private static Context mAppSPContext = null;
    private static String mRegion = null;
    private static String TAG = "HLog_AppUtil";

    static {
        String[] strArr = {alf.DZ, alf.EG, alf.AE, alf.BH, alf.OM, alf.QA, "KE", "MA", "TN", alf.SA, "NG", "UA", "AU", "NZ", "JP", alf.TW, alf.SG, alf.TH, alf.MY, "KH", alf.PH, "PK", "LK", "BD", "NP", "MM", "HK", "LK", "ZA", "NP", alf.KZ, alf.MX, "PE", "CL", alf.VN, alf.ID};
        AREA_SG_ARR = strArr;
        AREA_SG_SET = new HashSet(Arrays.asList(strArr));
        DEFAULT_COUNTRY = new int[]{82, 95};
        DEFAULT_IN_COUNTRY = new int[]{88, 95};
        SYSTEM_UID_RANGE = 1001;
        sIsOpenSysLog = false;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00b1  */
    public static String autoRegionValue() {
        String defaultCountry;
        String country;
        String phoneBrand = DeviceUtil.getPhoneBrand();
        if (TextUtils.isEmpty(phoneBrand) || !phoneBrand.trim().equalsIgnoreCase(EraseBrandUtil.BRAND_P2)) {
            String systemProperties = getSystemProperties("persist.sys.oplus.region", "");
            if (TextUtils.isEmpty(systemProperties)) {
                systemProperties = getSystemProperties("persist.sys." + EraseBrandUtil.BRAND_O2 + ".region", "");
            }
            String str = TextUtils.isEmpty(systemProperties) ? "" : systemProperties;
            if ("oc".equalsIgnoreCase(str)) {
                if (getAppContext().getPackageManager().hasSystemFeature(EraseBrandUtil.BRAND_O2 + ".version.exp")) {
                    defaultCountry = str;
                } else {
                    defaultCountry = getDefaultCountry();
                }
            } else {
                defaultCountry = str;
            }
            Log.d(TAG, "reloadRegionValue mRegion = " + defaultCountry + " tempRegion = " + systemProperties);
            country = defaultCountry;
        } else {
            country = getSystemProperties("persist.sys.oplus.region", "");
            if (country.isEmpty()) {
                country = getSystemProperties("persist.sys.oem.region", getDefaultCountry());
                if ("OverSeas".equalsIgnoreCase(country)) {
                    country = getAppContext().getResources().getConfiguration().locale.getCountry();
                    if (getDefaultCountry().equalsIgnoreCase(country)) {
                        country = "OC";
                    }
                }
            }
        }
        if (TextUtils.isEmpty(country)) {
            country = getAppContext().getResources().getConfiguration().locale.getCountry();
            if (getDefaultCountry().equalsIgnoreCase(country)) {
                country = getDefaultCountry();
            }
            if (TextUtils.isEmpty(country)) {
                country = getDefaultCountry();
            }
            Log.d(TAG, "autoRegionValue = " + country);
        }
        return country;
    }

    public static String createPathWithProcessName(Context context, String str) {
        String processName = TextUtils.isEmpty(sProcessName) ? ProcessUtil.getProcessName(context) : sProcessName;
        if (TextUtils.isEmpty(processName)) {
            return str;
        }
        return str + "/" + processName + "/";
    }

    public static void exit() {
        Process.killProcess(Process.myPid());
        System.exit(0);
    }

    public static Context getAppContext() {
        return mAppContext;
    }

    public static Context getAppSpContext() {
        return mAppSPContext;
    }

    public static int getAppUid() {
        try {
            Context context = mAppContext;
            if (context != null) {
                return context.getApplicationInfo().uid;
            }
            return 0;
        } catch (Throwable th) {
            Log.e(TAG, "getAppUid : " + th.toString());
            return 0;
        }
    }

    public static int getAppVersionCode(Context context) {
        if (-1 == sAppVersionCode && context != null) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    sAppVersionCode = packageManager.getPackageInfo(context.getPackageName(), 0).versionCode;
                }
            } catch (Throwable th) {
                Log.e(TAG, "getAppVersionCode : " + th.toString());
            }
        }
        return sAppVersionCode;
    }

    public static String getAppVersionName(Context context) {
        if (TextUtils.isEmpty(sAppVersionName) && context != null) {
            try {
                sAppVersionName = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            } catch (Exception e2) {
                Log.e(TAG, "getAppVersionName : " + e2.toString());
            }
        }
        return sAppVersionName;
    }

    public static String getDefaultCountry() {
        return String2IntUtil.tostring(DEFAULT_COUNTRY);
    }

    private static double getDoubleOsVersion(String str) {
        if (str.isEmpty()) {
            Log.e(TAG, "getDeviceOsVersion error.");
            return 0.0d;
        }
        String strReplace = str.replace(ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "");
        int iIndexOf = strReplace.indexOf(".");
        double d = iIndexOf == -1 ? Double.parseDouble(strReplace) : Double.parseDouble(strReplace.substring(0, iIndexOf + 2));
        Log.d(TAG, "deviceVersion为：" + d);
        return d;
    }

    public static String getInCountry() {
        return String2IntUtil.tostring(DEFAULT_IN_COUNTRY);
    }

    public static boolean getLogEnable() {
        boolean z = Boolean.parseBoolean(getSystemProperties("persist.sys.assert.panic", SpeechConstant.FALSE_STR));
        boolean z2 = Boolean.parseBoolean(getSystemProperties(SystemSettingsUtilsKt.LOG_ON_MKT, SpeechConstant.FALSE_STR));
        if (z || z2) {
            sIsOpenSysLog = true;
            return true;
        }
        sIsOpenSysLog = false;
        return false;
    }

    public static String getOptimizedProcessName(Context context) {
        try {
            String strObtainProcessName = obtainProcessName(getAppContext());
            String packageName = context.getPackageName();
            if (TextUtils.isEmpty(strObtainProcessName) || strObtainProcessName.equals(packageName)) {
                return "main";
            }
            int iIndexOf = strObtainProcessName.indexOf(":");
            if (iIndexOf <= 0 || iIndexOf >= strObtainProcessName.length() - 1) {
                return strObtainProcessName.replace('.', '_');
            }
            String strSubstring = strObtainProcessName.substring(iIndexOf + 1);
            int iLastIndexOf = strSubstring.lastIndexOf(":");
            if (iLastIndexOf > 0) {
                strSubstring = strSubstring.substring(iLastIndexOf + 1);
            }
            int iIndexOf2 = strSubstring.indexOf(".");
            if (iIndexOf2 > 0) {
                strSubstring = strSubstring.substring(0, iIndexOf2);
            }
            if (!strSubstring.isEmpty()) {
                strObtainProcessName = strSubstring;
            }
            return strObtainProcessName.replace('.', '_');
        } catch (Exception unused) {
            return "main";
        }
    }

    public static String getPackageName(Context context) {
        return context != null ? context.getPackageName() : "";
    }

    public static String getRegion() {
        if (TextUtils.isEmpty(mRegion)) {
            reloadRegionValue();
        }
        if (getLogEnable()) {
            Log.d("HLog", String2IntUtil.toEncrypted("getRegion = " + mRegion));
        }
        return mRegion;
    }

    public static long getSDKVersionCode() {
        return sSdkVersionCode.longValue();
    }

    public static String getSystemProperties(String str, String str2) {
        return (String) ReflectHelp.invokeStatic(ReflectHelp.getClassFromName("android.os.SystemProperties"), ParserTag.TAG_GET, new Class[]{String.class, String.class}, new Object[]{str, str2});
    }

    public static boolean isApkInDebug(Context context) {
        try {
            return (context.getApplicationInfo().flags & 2) != 0;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isIndia() {
        return getInCountry().equalsIgnoreCase(getRegion());
    }

    public static boolean isOpenSysLog() {
        return sIsOpenSysLog;
    }

    public static boolean isOversea() {
        return !getDefaultCountry().equalsIgnoreCase(getRegion());
    }

    public static boolean isSingapore() {
        return AREA_SG_SET.contains(getRegion().toUpperCase());
    }

    public static boolean isSystemApp() {
        return getAppUid() < SYSTEM_UID_RANGE;
    }

    public static String myProcessName(Context context) {
        String str = sProcessName;
        if (str != null) {
            return str;
        }
        synchronized (sNameLock) {
            String str2 = sProcessName;
            if (str2 != null) {
                return str2;
            }
            if (context == null) {
                return str2;
            }
            String strObtainProcessName = obtainProcessName(context);
            sProcessName = strObtainProcessName;
            return strObtainProcessName;
        }
    }

    public static String obtainProcessName(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        Iterator<ActivityManager.RunningAppProcessInfo> it = (runningAppProcesses == null || runningAppProcesses.isEmpty()) ? null : runningAppProcesses.iterator();
        if (it == null) {
            return null;
        }
        while (it.hasNext()) {
            ActivityManager.RunningAppProcessInfo next = it.next();
            if (next != null && next.pid == Process.myPid()) {
                return next.processName;
            }
        }
        return null;
    }

    private static void reloadRegionValue() {
        String phoneBrand = DeviceUtil.getPhoneBrand();
        if (TextUtils.isEmpty(phoneBrand) || !phoneBrand.trim().equalsIgnoreCase(EraseBrandUtil.BRAND_P2)) {
            String systemProperties = getSystemProperties("persist.sys.oplus.region", "");
            if (TextUtils.isEmpty(systemProperties)) {
                systemProperties = getSystemProperties("persist.sys." + EraseBrandUtil.BRAND_O2 + ".region", "");
            }
            if (!TextUtils.isEmpty(systemProperties)) {
                mRegion = systemProperties;
            }
            if ("oc".equalsIgnoreCase(mRegion)) {
                if (!getAppContext().getPackageManager().hasSystemFeature(EraseBrandUtil.BRAND_O2 + ".version.exp")) {
                    mRegion = getDefaultCountry();
                }
            }
            Log.d(TAG, "reloadRegionValue mRegion = " + mRegion + " tempRegion = " + systemProperties);
        } else {
            String systemProperties2 = getSystemProperties("persist.sys.oplus.region", "");
            mRegion = systemProperties2;
            if (systemProperties2.isEmpty()) {
                String systemProperties3 = getSystemProperties("persist.sys.oem.region", getDefaultCountry());
                mRegion = systemProperties3;
                if ("OverSeas".equalsIgnoreCase(systemProperties3)) {
                    String country = getAppContext().getResources().getConfiguration().locale.getCountry();
                    if (getDefaultCountry().equalsIgnoreCase(country)) {
                        mRegion = "OC";
                    } else {
                        mRegion = country;
                    }
                }
            }
        }
        if (TextUtils.isEmpty(mRegion)) {
            String country2 = getAppContext().getResources().getConfiguration().locale.getCountry();
            if (getDefaultCountry().equalsIgnoreCase(country2)) {
                mRegion = getDefaultCountry();
            } else {
                mRegion = country2;
            }
            if (TextUtils.isEmpty(mRegion)) {
                mRegion = getDefaultCountry();
            }
            Log.d(TAG, "reloadRegionValue 兜底mRegion = " + mRegion);
        }
    }

    public static void setAppContext(Context context) {
        if (context != null) {
            if (context.getApplicationContext() != null) {
                mAppContext = context.getApplicationContext();
            } else if (context instanceof Application) {
                mAppContext = context;
            }
        }
    }

    public static void setAppSpContext(Context context) {
        mAppSPContext = context;
    }

    public static void setRegion(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Log.d("HLog", String2IntUtil.toEncrypted("set getRegion = " + str));
        mRegion = str;
    }

    public static void setSDKVersionCode(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            if (!str.contains("-")) {
                if (str.contains(".")) {
                    String strReplace = str.replace(".", "");
                    if (TextUtils.isEmpty(strReplace) || strReplace.length() <= 0) {
                        return;
                    }
                    sSdkVersionCode = Long.valueOf(Long.parseLong(strReplace));
                    return;
                }
                return;
            }
            String[] strArrSplit = str.split("-");
            if (strArrSplit.length <= 0 || (str2 = strArrSplit[0]) == null || str2.length() <= 0 || !strArrSplit[0].contains(".")) {
                return;
            }
            String strReplace2 = strArrSplit[0].replace(".", "");
            if (TextUtils.isEmpty(strReplace2) || strReplace2.length() <= 0) {
                return;
            }
            sSdkVersionCode = Long.valueOf(Long.parseLong(strReplace2));
        } catch (Throwable unused) {
        }
    }

    public static boolean verifyPackageName(Context context, String str) {
        if (context == null) {
            Log.e(TAG, "verifyPackageName: context is null");
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            Log.e(TAG, "verifyPackageName: packageName is empty");
            return false;
        }
        try {
            int callingUid = Binder.getCallingUid();
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.e(TAG, "verifyPackageName: PackageManager is null");
                return false;
            }
            String[] packagesForUid = packageManager.getPackagesForUid(callingUid);
            if (packagesForUid != null && packagesForUid.length != 0) {
                for (String str2 : packagesForUid) {
                    if (str.equals(str2)) {
                        Log.d(TAG, "verifyPackageName: package name matched: " + str);
                        return true;
                    }
                }
                Log.e(TAG, "verifyPackageName: package name mismatch. expected: " + str + ", calling packages: " + Arrays.toString(packagesForUid));
                return false;
            }
            Log.e(TAG, "verifyPackageName: no packages found for uid: " + callingUid);
            return false;
        } catch (Throwable th) {
            Log.e(TAG, "verifyPackageName: exception occurred", th);
            return false;
        }
    }

    public static boolean verifyPermission(Context context, String str) {
        if (context == null) {
            Log.e(TAG, "verifyPermission: context is null");
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            Log.e(TAG, "verifyPermission: permission is empty");
            return false;
        }
        try {
            if (context.checkCallingPermission(str) == 0) {
                Log.d(TAG, "verifyPermission: caller has permission: " + str);
                return true;
            }
            Log.e(TAG, "verifyPermission: caller does not have permission: " + str);
            return false;
        } catch (SecurityException e2) {
            Log.e(TAG, "verifyPermission: SecurityException when checking permission: " + str, e2);
            return false;
        } catch (Throwable th) {
            Log.e(TAG, "verifyPermission: exception occurred", th);
            return false;
        }
    }

    public static boolean verifySystemApp(Context context) {
        if (context == null) {
            Log.e(TAG, "verifySystemApp: context is null");
            return false;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.e(TAG, "verifySystemApp: PackageManager is null");
                return false;
            }
            int callingUid = Binder.getCallingUid();
            String[] packagesForUid = packageManager.getPackagesForUid(callingUid);
            if (packagesForUid != null && packagesForUid.length != 0) {
                int length = packagesForUid.length;
                int i = 0;
                while (true) {
                    boolean z = true;
                    if (i >= length) {
                        Log.d(TAG, "verifySystemApp: caller is system app. packages: " + Arrays.toString(packagesForUid));
                        return true;
                    }
                    String str = packagesForUid[i];
                    try {
                        ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 0);
                        if (applicationInfo == null) {
                            return false;
                        }
                        int i2 = applicationInfo.flags;
                        if ((i2 & 1) == 0 && (i2 & 128) == 0) {
                            z = false;
                        }
                        if (!z) {
                            Log.e(TAG, "verifySystemApp: caller is not a system app: " + str);
                            return false;
                        }
                        i++;
                    } catch (PackageManager.NameNotFoundException unused) {
                        Log.w(TAG, "verifySystemApp: package not found: " + str);
                        return false;
                    }
                }
            }
            Log.e(TAG, "verifySystemApp: no packages found for uid: " + callingUid);
            return false;
        } catch (Throwable th) {
            Log.e(TAG, "verifySystemApp: exception occurred", th);
            return false;
        }
    }

    public static boolean isIndia(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return getInCountry().equalsIgnoreCase(str);
    }

    public static boolean isOversea(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return !getDefaultCountry().equalsIgnoreCase(str);
    }

    public static boolean isSingapore(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return AREA_SG_SET.contains(str.toUpperCase());
    }

    public static String getAppVersionName(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (Exception e2) {
            Log.e(TAG, "getAppVersionName : " + e2.toString());
            return "";
        }
    }
}
