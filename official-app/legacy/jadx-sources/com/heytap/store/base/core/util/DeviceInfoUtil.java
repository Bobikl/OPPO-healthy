package com.heytap.store.base.core.util;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Process;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.heytap.store.base.core.connectivity.ConnectivityManagerProxy;
import com.heytap.store.base.core.connectivity.NetworkMonitor;
import com.heytap.store.base.core.http.GlobalParams;
import com.heytap.store.base.core.state.Constants;
import com.heytap.store.base.core.util.app.AppConfig;
import com.heytap.store.base.core.util.encryption.AESHelper;
import com.heytap.store.base.core.util.encryption.RSAHelper;
import com.heytap.store.base.core.util.statistics.StatisticsUtil;
import com.heytap.store.base.core.util.thread.AppThreadExecutor;
import com.heytap.store.platform.tools.ContextGetterUtils;
import com.heytap.store.platform.tools.LogUtils;
import com.heytap.weather.service.WeatherCloud;
import com.oplus.aiunit.vision.alf;
import com.oplus.aiunit.vision.f04;
import com.oplus.aiunit.vision.poi;
import com.oplus.aiunit.vision.qbm;
import com.oplus.smartenginehelper.ParserTag;
import java.io.File;
import java.io.FileFilter;
import java.io.Reader;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public class DeviceInfoUtil {
    public static final String BRAND_ONEPLUES = "OnePlus";
    public static final String BRAND_OPPO = "OPPO";
    public static final String BRAND_REAL_ME = "realme";
    public static final String COMMUNITY_USER_AGENT = "oppocommunity";
    public static final String DEFAULT_LANGUAGE_ZH_CH = "zh_CN";
    public static final String DEFAULT_MAC = "0";
    public static final String DEFAULT_VALUE = "0";
    private static final String MIX_CODE = "ke89*j3+@z";
    public static final String OTA_VERSION_KEY = "ro.build.version.ota";
    public static int OVER_VIEW_LEVEL = 0;
    public static final int STATISTICS_PLATFORM_MTK = 1;
    public static final int STATISTICS_PLATFORM_QUALCOMM = 2;
    public static final String SYSTEM_NAME = "Android";
    private static final String TAG = "DeviceInfoUtil";
    public static final String USER_AGENT = "oppostore";
    public static final int VERSION_COLOROS_3_0 = 6;
    public static String apid;
    public static String auid;
    public static String city;
    public static float density;
    public static String duid;
    public static String guid;
    public static boolean hasNavBar;
    private static int keybordHeight;
    public static double latitude;
    public static double longtitude;
    public static String ouid;
    public static int screenHeight;
    public static float screenRation;
    public static int screenWidth;
    public static String udid;
    private static final Pattern MTK_PATTERN = Pattern.compile("^[MT]{2}[a-zA-Z0-9]{0,10}$");
    private static int numberOfCpuCores = 0;
    private static boolean sHasCtaPermission = false;
    private static int sApkVersion = -1;
    private static String sApkVersionName = "";
    private static String COLOR_OS_VERSION = "";

    public static boolean activityIsExist(Context context, Class<?> cls) {
        ActivityManager activityManager;
        ComponentName componentNameResolveActivity = new Intent(context, cls).resolveActivity(context.getPackageManager());
        if (componentNameResolveActivity != null && (activityManager = (ActivityManager) context.getSystemService("activity")) != null) {
            Iterator<ActivityManager.RunningTaskInfo> it = activityManager.getRunningTasks(10).iterator();
            while (it.hasNext()) {
                if (it.next().baseActivity.equals(componentNameResolveActivity)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean checkApkExist(Context context, String str) {
        if (str != null && !"".equals(str)) {
            try {
                context.getPackageManager().getApplicationInfo(str, 8192);
                return true;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return false;
    }

    @SuppressLint({"WrongConstant"})
    public static boolean checkPackage(Context context, String str) {
        if (!TextUtils.isEmpty(str) && context != null) {
            try {
                context.getPackageManager().getApplicationInfo(str, 1);
                return true;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return false;
    }

    public static void copyText(Context context, String str) {
        try {
            ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
            if (clipboardManager != null) {
                clipboardManager.setPrimaryClip(ClipData.newPlainText("", str));
            }
        } catch (Exception e2) {
            LogUtils.INSTANCE.e(TAG, "copyText error: e = " + e2);
        }
    }

    private static String formatTail(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return Pattern.compile("\\s*OPPO\\s*", 4).matcher(str).replaceAll("");
    }

    public static String getAesImei(Activity activity) {
        getImei(activity);
        return !"0".equals(getImei(activity)) ? AESHelper.encrypt("866190039949153", com.heytap.store.base.core.util.encryption.GetKeyUtil.key) : "";
    }

    public static String getAndroidVersion() {
        try {
            String str = Build.VERSION.RELEASE;
            return !isEmpty(str) ? str : "0";
        } catch (Exception e2) {
            e2.printStackTrace();
            return "0";
        }
    }

    public static String getApkUUID(Context context) {
        return UUIDHelper.readUUID(context);
    }

    public static String getApkVersion(Context context) {
        PackageInfo packageInfo;
        if (context == null) {
            return "";
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || (packageInfo = packageManager.getPackageInfo(context.getPackageName(), 64)) == null) ? "" : packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e(context.getPackageName(), "can't get the versionCode and versionName.");
            return "";
        }
    }

    public static int getApkVersionCode(Context context) {
        PackageInfo packageInfo;
        if (context == null) {
            return 0;
        }
        try {
            if (context.getPackageManager() == null || (packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 64)) == null) {
                return -1;
            }
            return packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e(context.getPackageName(), "can't get the versionCode.");
            return -1;
        }
    }

    public static String getApkVersionName() {
        return getApkVersion(ContextGetterUtils.INSTANCE.getApp());
    }

    public static String getAppCode(Context context) {
        int i;
        try {
            i = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getInt("OPPO_APPCODE");
        } catch (Exception e2) {
            LogUtils.INSTANCE.e(NotificationCompat.CATEGORY_ERROR, "catch exception = " + e2.getMessage());
            i = 0;
        }
        return i + "";
    }

    public static String getAppFormatVersion(Context context) {
        StringBuilder sb = new StringBuilder();
        try {
            if (AppConfig.getInstance().getSdkEnv().booleanValue()) {
                sb.append(" ");
                sb.append("oppostore");
                sb.append("/");
                sb.append(GlobalParams.APK_VERSION);
                sb.append(" ");
                sb.append(OSUtils.getRomType());
                sb.append("/");
                sb.append(OSUtils.getRomVersion());
                sb.append(" ");
                sb.append("brand");
                sb.append("/");
                sb.append(getBrand());
                sb.append(" ");
                sb.append("model");
                sb.append("/");
                sb.append(getModel());
            } else {
                sb.append(" ");
                sb.append("oppostore");
                sb.append("/");
                sb.append(getVersionCode(context));
                sb.append(" ");
                sb.append(OSUtils.getRomType());
                sb.append("/");
                sb.append(OSUtils.getRomVersion());
                sb.append(" ");
                sb.append("brand");
                sb.append("/");
                sb.append(getBrand());
                sb.append(" ");
                sb.append("model");
                sb.append("/");
                sb.append(getModel());
            }
        } catch (Exception unused) {
        }
        return sb.toString();
    }

    public static String getAppKey(Context context) {
        return "usercenter";
    }

    public static String getAppMetaData(Context context, String str) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        if (context == null || TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null) ? "0" : bundle.getString(str);
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            return "0";
        }
    }

    public static String getAppName(Context context) {
        try {
            return context.getResources().getString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.labelRes);
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static String getAppSecret(Context context) {
        return "9effeac61b7ad92a9bef3da596f2158b";
    }

    public static String getBrand() {
        return Build.BRAND;
    }

    public static String getBrandAndPhoneModel() {
        return getBrand() + " " + getPhoneModel();
    }

    public static String getCachedAPID() {
        return !NullObjectUtil.isNull(apid) ? apid : "";
    }

    public static String getCachedAUID() {
        return !NullObjectUtil.isNull(auid) ? auid : "";
    }

    public static String getCachedDUID() {
        return !NullObjectUtil.isNull(duid) ? duid : "";
    }

    public static String getCachedGUID() {
        return !NullObjectUtil.isNull(guid) ? guid : "";
    }

    public static String getCachedOUID() {
        return !NullObjectUtil.isNull(ouid) ? ouid : "";
    }

    public static String getCachedUDID() {
        return !NullObjectUtil.isNull(udid) ? udid : "";
    }

    public static String getClipboardContent(Context context) {
        return "";
    }

    public static int getColorOSVersion() {
        try {
            Class<?> cls = Class.forName("com.color.os.ColorBuild");
            return ((Integer) cls.getDeclaredMethod("getColorOSVERSION", new Class[0]).invoke(cls, new Object[0])).intValue();
        } catch (Exception e2) {
            LogUtils.INSTANCE.e("RomVersionUtil", "getRomVersionCode failed. error = " + e2.getMessage());
            return 0;
        }
    }

    public static String getColorOsVersion() {
        if (TextUtils.isEmpty(COLOR_OS_VERSION)) {
            try {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                Method method = cls.getMethod(ParserTag.TAG_GET, String.class, String.class);
                String str = (String) method.invoke(cls, "ro.build.version.oplusrom", "");
                COLOR_OS_VERSION = str;
                if (TextUtils.isEmpty(str)) {
                    COLOR_OS_VERSION = (String) method.invoke(cls, "ro.build.version.opporom", "");
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return COLOR_OS_VERSION;
    }

    public static String getCountry(Context context) {
        try {
            return Locale.getDefault().getCountry();
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static String getCurrentProcessName(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        String str;
        if (context == null) {
            return "";
        }
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            return null;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == Process.myPid() && (str = runningAppProcessInfo.processName) != null) {
                return str;
            }
        }
        return null;
    }

    public static void getDeviceIDAsync(final Context context) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            AppThreadExecutor.getInstance().executeNormalTask(new Runnable() { // from class: com.heytap.store.base.core.util.DeviceInfoUtil.1
                @Override // java.lang.Runnable
                public void run() {
                    if (DeviceInfoUtil.isThreeBrand()) {
                        poi.j(context);
                        if (poi.k()) {
                            String strF = poi.f(context);
                            DeviceInfoUtil.guid = strF;
                            DeviceInfoUtil.udid = strF;
                            DeviceInfoUtil.ouid = poi.g(context);
                            DeviceInfoUtil.duid = poi.e(context);
                            DeviceInfoUtil.auid = poi.c(context);
                            DeviceInfoUtil.apid = "";
                            StatisticsUtil.registerSuperProperties("duid", DeviceInfoUtil.duid);
                            SpUtil.putStringOnBackground("guid", DeviceInfoUtil.guid);
                        }
                        poi.a(context);
                    }
                }
            });
            return;
        }
        if (isThreeBrand()) {
            poi.j(context);
            if (poi.k()) {
                String strF = poi.f(context);
                guid = strF;
                udid = strF;
                ouid = poi.g(context);
                duid = poi.e(context);
                auid = poi.c(context);
                apid = poi.b(context);
                StatisticsUtil.registerSuperProperties("duid", duid);
                SpUtil.putStringOnBackground("guid", guid);
            }
            poi.a(context);
        }
    }

    public static String getDisplay() {
        return Build.DISPLAY;
    }

    public static void getGUIDAsync() {
        AppThreadExecutor.getInstance().executeNormalTask(new Runnable() { // from class: com.heytap.store.base.core.util.DeviceInfoUtil.2
            @Override // java.lang.Runnable
            public void run() {
                ContextGetterUtils contextGetterUtils = ContextGetterUtils.INSTANCE;
                DeviceInfoUtil.guid = poi.f(contextGetterUtils.getApp());
                DeviceInfoUtil.ouid = poi.g(contextGetterUtils.getApp());
                DeviceInfoUtil.duid = poi.e(contextGetterUtils.getApp());
                DeviceInfoUtil.auid = poi.c(contextGetterUtils.getApp());
                DeviceInfoUtil.apid = "";
                StatisticsUtil.registerSuperProperties("duid", DeviceInfoUtil.duid);
                SpUtil.putStringOnBackground("guid", DeviceInfoUtil.guid);
            }
        });
    }

    public static String getHardware() {
        try {
            String str = Build.HARDWARE;
            return !isEmpty(str) ? str.toUpperCase() : "0";
        } catch (Exception e2) {
            e2.printStackTrace();
            return "0";
        }
    }

    @SuppressLint({"NewApi", "MissingPermission"})
    public static String getImei(Context context) {
        return "";
    }

    public static String getLanguage() {
        Locale locale = Locale.getDefault();
        return locale != null ? locale.toString() : "zh_CN";
    }

    public static String getManufacture() {
        try {
            String str = Build.MANUFACTURER;
            if (!isEmpty(str)) {
                String str2 = Build.BRAND;
                if (str2.toLowerCase().equals(qbm.b)) {
                    return str2;
                }
                if (!str.toLowerCase().equals("unknown")) {
                    return str;
                }
            }
            return "0";
        } catch (Exception e2) {
            e2.printStackTrace();
            return "0";
        }
    }

    public static String getMetaData(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return String.valueOf(context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.get(str));
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static String getModel() {
        try {
            String str = Build.MODEL;
            return !isEmpty(str) ? str : "0";
        } catch (Exception e2) {
            e2.printStackTrace();
            return "0";
        }
    }

    public static String getNetworkType(NetworkInfo networkInfo) {
        if (networkInfo == null || !networkInfo.isConnected()) {
            return "unknown_network";
        }
        if (networkInfo.getType() == 1) {
            return "wifi";
        }
        if (networkInfo.getType() != 0) {
            return "networkType" + networkInfo.getType();
        }
        String subtypeName = networkInfo.getSubtypeName();
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return "2g";
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return "3g";
            case 13:
                return "4g";
            default:
                return (subtypeName.equalsIgnoreCase("TD-SCDMA") || subtypeName.equalsIgnoreCase("WCDMA") || subtypeName.equalsIgnoreCase("CDMA2000")) ? "3g" : subtypeName;
        }
    }

    public static int getNumberOfCpuCores() {
        if (numberOfCpuCores == 0) {
            try {
                numberOfCpuCores = new File("/sys/devices/system/cpu/").listFiles(new FileFilter() { // from class: com.heytap.store.base.core.util.DeviceInfoUtil.3
                    @Override // java.io.FileFilter
                    public boolean accept(File file) {
                        String name = file.getName();
                        if (!name.startsWith("cpu")) {
                            return false;
                        }
                        for (int i = 3; i < name.length(); i++) {
                            if (name.charAt(i) < '0' || name.charAt(i) > '9') {
                                return false;
                            }
                        }
                        return true;
                    }
                }).length;
            } catch (NullPointerException unused) {
                numberOfCpuCores = 1;
            } catch (SecurityException unused2) {
                numberOfCpuCores = 1;
            }
        }
        return numberOfCpuCores;
    }

    @SuppressLint({"MissingPermission"})
    public static String getOperators(Context context) {
        return "0";
    }

    public static String getPackageName(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
        } catch (Exception e2) {
            LogUtils.INSTANCE.e(NotificationCompat.CATEGORY_ERROR, "catch exception = " + e2.getMessage());
            return "0";
        }
    }

    public static long getPhoneAndroidSDK() {
        return Long.parseLong(Build.VERSION.SDK);
    }

    public static String getPhoneModel() {
        return formatTail(Build.MODEL).replace(" ", "_");
    }

    public static int getPlatForm() {
        try {
            if (getHardware().equals("QCOM")) {
                return 2;
            }
            return MTK_PATTERN.matcher(getHardware()).find() ? 1 : 0;
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    public static String getProperty(String str, String str2) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod(ParserTag.TAG_GET, String.class, String.class).invoke(cls, str, str2);
        } catch (Exception unused) {
            return str2;
        }
    }

    public static List<String> getRsaKeyAndAesImei(Context context, String str) {
        ArrayList arrayList = new ArrayList();
        if (!RSAHelper.SENSORS_ON.equals(str) && !RSAHelper.SENSORS_OFF.equals(str)) {
            try {
                String imei = getImei(context);
                String str2 = com.heytap.store.base.core.util.encryption.GetKeyUtil.key;
                arrayList.add(AESHelper.encrypt(imei, str2));
                arrayList.add(RSAHelper.encryptByPublicKey(str2, str));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return arrayList;
    }

    public static int getSDKVersion() {
        try {
            return Build.VERSION.SDK_INT;
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    private static void getScreenInfo(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        int i3 = i < i2 ? i : i2;
        screenWidth = i3;
        if (i2 > i) {
            i = i2;
        }
        screenHeight = i;
        screenRation = i / i3;
        density = displayMetrics.density;
    }

    public static String getSerialNumber() {
        return Build.SERIAL;
    }

    public static String getSimMCC(Context context) {
        if (context == null) {
            throw new NullPointerException("context is null.");
        }
        try {
            String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
            return (TextUtils.isEmpty(simOperator) || simOperator.length() < 5) ? "" : simOperator.substring(0, 3);
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static String getSimMNC(Context context) {
        if (context == null) {
            throw new NullPointerException("context is null.");
        }
        try {
            String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
            return (TextUtils.isEmpty(simOperator) || simOperator.length() < 5) ? "" : simOperator.substring(3);
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static String getStoreBrand() {
        String str = Build.BRAND;
        if ("oneplus".equalsIgnoreCase(str)) {
            String property = getProperty(OSUtils.KEY_ONEPLUS_OS_VERSION, "");
            return (TextUtils.isEmpty(property) || !property.contains("Hydrogen")) ? "OnePlus_ColorOS" : "OnePlus_HydrogenOS";
        }
        if (!qbm.b.equalsIgnoreCase(str)) {
            return getBrand();
        }
        String str2 = Build.DEVICE;
        return (TextUtils.isEmpty(str2) || !str2.toLowerCase().contains("oneplus")) ? getBrand() : "OnePlus_ColorOS";
    }

    public static String getSysDisplay() {
        return Build.DISPLAY;
    }

    public static String getSysVersion() {
        return Build.VERSION.RELEASE;
    }

    public static String getUA(Context context) {
        return Constants.COMMUNITY_APP_PACKAGE_NAME.equals(ContextGetterUtils.INSTANCE.getApp().getPackageName()) ? "oppocommunity" : "oppostore";
    }

    public static int getUsercenterApkVersion(Context context) {
        if (context == null) {
            return 0;
        }
        int apkVersion = getApkVersion(context, "com.oppo.usercenter");
        int apkVersion2 = getApkVersion(context, "com.heytap.usercenter");
        int apkVersion3 = getApkVersion(context, "com.heytap.vip");
        if (apkVersion3 > 0) {
            return apkVersion3;
        }
        return apkVersion > apkVersion2 ? apkVersion : apkVersion2;
    }

    public static int getVersionCode(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (Exception e2) {
            LogUtils.INSTANCE.e(NotificationCompat.CATEGORY_ERROR, "catch exception = " + e2.getMessage());
            return 0;
        }
    }

    public static String getVersionName(Context context) {
        return getVersionName(context, Constants.STORE_APP_PACKAGE_NAME);
    }

    public static int getWalletApkVersion(Context context) {
        if (context == null) {
            return 0;
        }
        int apkVersion = getApkVersion(context, f04.WALLET_PACKAGE_NAME);
        int apkVersion2 = getApkVersion(context, "com.coloros.wallet");
        int apkVersion3 = getApkVersion(context, "com.heytap.wallet");
        if (apkVersion2 > apkVersion) {
            apkVersion = apkVersion2;
        }
        return apkVersion3 > apkVersion ? apkVersion3 : apkVersion;
    }

    public static boolean hasInstalledApk(Context context, String str) {
        if (TextUtils.isEmpty(str) || context == null) {
            return false;
        }
        try {
            return context.getPackageManager().getApplicationInfo(str, 0) != null;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static boolean hasQ() {
        return true;
    }

    public static boolean hasR() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static boolean hasSilentInstallPermission(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            if (packageInfo != null) {
                return "oppo.uid.nearme".equalsIgnoreCase(packageInfo.sharedUserId);
            }
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
        }
        return false;
    }

    public static void initDeviceInfo(Context context, boolean z) {
        sHasCtaPermission = z;
        if (z) {
            getScreenInfo(context);
            com.heytap.store.base.core.util.encryption.GetKeyUtil.getRsaAndAesImei();
            getDeviceIDAsync(context);
        }
    }

    private static boolean isEmpty(String str) {
        return str == null || "null".equals(str) || "".equals(str);
    }

    public static boolean isHarmonyOSa() {
        try {
            Class<?> cls = Class.forName("com.huawei.system.BuildEx");
            Method method = cls.getMethod("getOsBrand", new Class[0]);
            ClassLoader classLoader = cls.getClassLoader();
            if (classLoader != null && classLoader.getParent() == null) {
                return "harmony".equals(method.invoke(cls, new Object[0]));
            }
        } catch (Exception e2) {
            Log.e(TAG, "isHarmonyOSa failed: ", e2);
        }
        return false;
    }

    public static boolean isNetworkConnected(Context context) {
        NetworkInfo activeNetworkInfo;
        if (context == null || (activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo()) == null) {
            return false;
        }
        return activeNetworkInfo.isAvailable();
    }

    public static boolean isOPPOBrand() {
        return "OPPO".equalsIgnoreCase(getBrand());
    }

    public static boolean isOnePlusBrand() {
        return BRAND_ONEPLUES.equalsIgnoreCase(getBrand());
    }

    public static boolean isRealMeBrand() {
        return "realme".equalsIgnoreCase(getBrand());
    }

    public static boolean isThreeBrand() {
        return isOPPOBrand() || isRealMeBrand() || isOnePlusBrand();
    }

    public static boolean isUgLanguage() {
        try {
            if (ContextGetterUtils.INSTANCE.getApp().getResources().getConfiguration().locale == null || Locale.getDefault() == null) {
                return false;
            }
            String language = Locale.getDefault().getLanguage();
            return !TextUtils.isEmpty(language) && language.equals("ug");
        } catch (Exception unused) {
            return false;
        }
    }

    private static String loadReaderAsString(Reader reader) throws Exception {
        StringBuilder sb = new StringBuilder();
        char[] cArr = new char[4096];
        int i = reader.read(cArr);
        while (i >= 0) {
            sb.append(cArr, 0, i);
            i = reader.read(cArr);
        }
        return sb.toString();
    }

    public static void setApkVersion(int i, String str) {
        sApkVersion = i;
        sApkVersionName = str;
    }

    public static String getVersionName(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (Exception e2) {
            LogUtils.INSTANCE.e(NotificationCompat.CATEGORY_ERROR, "catch exception = " + e2.getMessage());
            return "0";
        }
    }

    public static String getLanguage(Context context) {
        try {
            if (Locale.getDefault().getCountry().equals("CN")) {
                return WeatherCloud.LANGUAGE;
            }
            if (Locale.getDefault().getCountry().equals(alf.TW)) {
                return "zh-tw";
            }
            return Locale.getDefault().getCountry().equals(alf.US) ? "en-us" : WeatherCloud.LANGUAGE;
        } catch (Exception e2) {
            e2.printStackTrace();
            return WeatherCloud.LANGUAGE;
        }
    }

    public static int getApkVersion(Context context, String str) {
        PackageInfo packageInfo;
        if (context == null || TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (packageInfo = packageManager.getPackageInfo(str, 64)) == null) {
                return -1;
            }
            return packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e(str, "can't get the versionCode.");
            return -1;
        }
    }

    public static int getVersionCode(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionCode;
        } catch (Exception e2) {
            LogUtils.INSTANCE.e(NotificationCompat.CATEGORY_ERROR, "catch exception = " + e2.getMessage());
            return 0;
        }
    }

    public static boolean activityIsExist(Context context, String str) {
        ActivityManager activityManager;
        Intent intent = new Intent();
        intent.setClassName(context, str);
        ComponentName componentNameResolveActivity = intent.resolveActivity(context.getPackageManager());
        if (componentNameResolveActivity != null && (activityManager = (ActivityManager) context.getSystemService("activity")) != null) {
            Iterator<ActivityManager.RunningTaskInfo> it = activityManager.getRunningTasks(10).iterator();
            while (it.hasNext()) {
                if (it.next().baseActivity.equals(componentNameResolveActivity)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String getNetworkType(Context context) {
        if (context == null) {
            return "";
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        return connectivityManager == null ? "unknown_network" : getNetworkType(connectivityManager.getActiveNetworkInfo());
    }

    public static int getApkVersion() {
        return getApkVersionCode(ContextGetterUtils.INSTANCE.getApp());
    }

    public static String getNetworkType() {
        ConnectivityManagerProxy.SimpleNetworkInfo networkInfo = NetworkMonitor.getInstance().getNetworkInfo();
        if (networkInfo != null) {
            return networkInfo.getNetWorkTypeName();
        }
        return getNetworkType(ContextGetterUtils.INSTANCE.getApp());
    }
}
