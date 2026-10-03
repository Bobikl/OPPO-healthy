package com.platform.usercenter.tools.device;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.customer.feedback.sdk.util.HeaderInfoHelper;
import com.oplus.nearx.track.internal.remoteconfig.cloudconfig.entity.EventRuleEntity;
import com.oplus.weatherservicesdk.data.Weather;
import com.oplusos.vfxmodelviewer.view.Hardware;
import com.platform.usercenter.BaseApp;
import com.platform.usercenter.basic.provider.UCCommonXor8Provider;
import com.platform.usercenter.basic.provider.UCSystemInfoXor8Provider;
import com.platform.usercenter.tools.ApkInfoHelper;
import com.platform.usercenter.tools.algorithm.XORUtils;
import com.platform.usercenter.tools.datastructure.StringUtil;
import com.platform.usercenter.tools.log.UCLogUtil;
import com.platform.usercenter.tools.os.SystemPropertyUtils;
import com.platform.usercenter.tools.os.UCOSVersionUtil;
import com.platform.usercenter.tools.os.UCRuntimeEnvironment;
import com.platform.usercenter.tools.os.Version;
import com.platform.usercenter.tools.reflect.Reflect;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.URLEncoder;
import java.util.Enumeration;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes9.dex */
public class UCDeviceInfoUtil {
    public static final String CONTEXT_IS_NULL = "context is null.";
    public static final String DEFAULT_MAC = "0";
    public static final String DEFAULT_NULL = "";
    public static final String DEFAULT_REGION = "CN";
    private static final String IDENTIFIER_NAME = "language_values_exam";
    private static final String IDENTIFIER_PACKAGE = "oplus";
    private static final String IDENTIFIER_TYPE = "string";
    public static final String PROC_CPU_INFO = "/proc/cpuinfo";
    private static final String SYSTEM_PROPERTY = "gxxg&kgeegfWkmf|mz&ei{|mz";
    public static final String TAG = "UCDeviceInfoUtil";
    private static String ipadSerialNo;
    private static String mCacheDeviceId;
    private static String mCacheDeviceName;
    private static String mCacheSerialNum;
    private static String sResolution;

    public static boolean checkBetaEnv(Context context) {
        if (context == null) {
            return false;
        }
        return context.getPackageManager().hasSystemFeature(XORUtils.encrypt(SYSTEM_PROPERTY, 8));
    }

    private static String getAfterSaleRegion() {
        String str = SystemPropertyUtils.get(UCSystemInfoXor8Provider.regionMarkGreenOldSystemName(), "CN");
        return "OC".equalsIgnoreCase(str) ? "CN" : str;
    }

    @Deprecated
    public static String getAndroidId(Context context) {
        return "";
    }

    public static String getAndroidVersion() {
        try {
            return getFormatString(Build.VERSION.RELEASE);
        } catch (Exception e2) {
            UCLogUtil.e("UCDeviceInfoUtil", e2);
            return "";
        }
    }

    public static String getBrand() {
        return Build.BRAND;
    }

    public static long getBuildTime() {
        return Build.TIME;
    }

    public static String getCPUInfo() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(SystemPropertyUtils.get("ro.product.cpuinfo", ""));
        if (TextUtils.isEmpty(stringBuffer)) {
            try {
                FileReader fileReader = new FileReader(PROC_CPU_INFO);
                try {
                    BufferedReader bufferedReader = new BufferedReader(fileReader);
                    while (true) {
                        try {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            if (!TextUtils.isEmpty(line) && line.toLowerCase().contains("hardware")) {
                                stringBuffer.append(line.substring(line.indexOf(":") + 1, line.length()).trim());
                            }
                        } catch (Throwable th) {
                            try {
                                bufferedReader.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                        try {
                            fileReader.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                        throw th;
                    }
                    bufferedReader.close();
                    fileReader.close();
                } catch (Throwable th4) {
                    fileReader.close();
                    throw th4;
                }
            } catch (IOException e2) {
                UCLogUtil.e("UCDeviceInfoUtil", e2);
            }
        }
        return stringBuffer.toString();
    }

    public static String getCPU_ABI() {
        String str = "";
        if (!Version.hasL()) {
            try {
                return Build.CPU_ABI + Build.CPU_ABI2;
            } catch (Exception e2) {
                UCLogUtil.e("UCDeviceInfoUtil", e2);
                return "";
            }
        }
        for (String str2 : Build.SUPPORTED_ABIS) {
            str = str + str2;
        }
        return str;
    }

    public static String getCpuName2() {
        String strReplaceAll = SystemPropertyUtils.get("ro.product.cpuinfo", "");
        if (!TextUtils.isEmpty(strReplaceAll)) {
            return strReplaceAll;
        }
        try {
            FileReader fileReader = new FileReader(PROC_CPU_INFO);
            try {
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        if (line.contains(Hardware.TAG) && (line.contains("MSM") || line.contains("SDM"))) {
                            Matcher matcher = Pattern.compile("MSM\\s*\\w+").matcher(line);
                            if (matcher.find()) {
                                strReplaceAll = matcher.group(0).replaceAll("\\s*", "");
                            } else {
                                Matcher matcher2 = Pattern.compile("SDM\\s*\\w+").matcher(line);
                                if (matcher2.find()) {
                                    strReplaceAll = matcher2.group(0).replaceAll("\\s*", "");
                                }
                            }
                        }
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                bufferedReader.close();
                fileReader.close();
            } catch (Throwable th3) {
                try {
                    fileReader.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (IOException e2) {
            UCLogUtil.e("UCDeviceInfoUtil", e2);
        }
        return strReplaceAll;
    }

    public static String getCurRegion() {
        String str = UCOSVersionUtil.getOSVersionCode() >= 22 ? SystemPropertyUtils.get(UCSystemInfoXor8Provider.regionOPlusPropertySystemName(), "") : SystemPropertyUtils.get(UCSystemInfoXor8Provider.regionPropertySystemName(), "CN");
        return "OC".equalsIgnoreCase(str) ? "CN" : str;
    }

    public static int getDPI(Context context) {
        if (context == null) {
            throw new NullPointerException("context is null.");
        }
        try {
            return context.getResources().getDisplayMetrics().densityDpi;
        } catch (Exception e2) {
            UCLogUtil.e("UCDeviceInfoUtil", e2);
            return 0;
        }
    }

    @TargetApi(23)
    @Deprecated
    public static String getDeviceId(Context context) {
        return null;
    }

    public static String getDeviceIdCompat(Context context) {
        if (StringUtil.isEmpty(OpenIDHelper.getGUID())) {
            OpenIDHelper.getOpenIdHeader(context);
        }
        if (!StringUtil.isEmpty(OpenIDHelper.getGUID())) {
            return OpenIDHelper.getGUID();
        }
        if (!StringUtil.isEmpty(OpenIDHelper.getAPID())) {
            return OpenIDHelper.getAPID();
        }
        if (!StringUtil.isEmpty(OpenIDHelper.getAUID())) {
            return OpenIDHelper.getAUID();
        }
        if (StringUtil.isEmpty(OpenIDHelper.getOUID())) {
            return null;
        }
        return OpenIDHelper.getOUID();
    }

    public static String getDeviceName(Context context) {
        if (!TextUtils.isEmpty(mCacheDeviceName)) {
            return mCacheDeviceName;
        }
        try {
            String strSubString = StringUtil.subString((String) Reflect.on(UCSystemInfoXor8Provider.clazzColorSysBuild()).call("getDeviceName", context).get(), 100);
            mCacheDeviceName = strSubString;
            return strSubString;
        } catch (Exception e2) {
            UCLogUtil.e("UCDeviceInfoUtil", e2);
            return "";
        }
    }

    public static String getDisplay() {
        return Build.DISPLAY;
    }

    public static String getFingerPrint() {
        return Build.FINGERPRINT;
    }

    public static String getFoldMode(Context context) {
        String string;
        try {
            string = Settings.Global.getString(context.getContentResolver(), "oplus_system_folding_mode");
        } catch (Exception e2) {
            UCLogUtil.e("UCDeviceInfoUtil", e2);
            string = null;
        }
        return string == null ? "" : string;
    }

    public static String getFormatString(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.length() > 15) {
            str = str.substring(0, 15);
        }
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (Exception e2) {
            UCLogUtil.e("UCDeviceInfoUtil", e2);
            return "";
        }
    }

    @Deprecated
    public static String getInternalMacAddress(Context context) {
        return "";
    }

    public static String getIpAddress(Context context) {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress inetAddressNextElement = inetAddresses.nextElement();
                    if ((inetAddressNextElement instanceof Inet4Address) && !inetAddressNextElement.isLoopbackAddress()) {
                        return inetAddressNextElement.getHostAddress();
                    }
                }
            }
            return "";
        } catch (SocketException e2) {
            UCLogUtil.e("UCDeviceInfoUtil", e2);
            return "";
        }
    }

    public static String getLanguage() {
        return Locale.getDefault().getLanguage();
    }

    public static String getLanguageTag() {
        String string = UCRuntimeEnvironment.sIsExp ? "en-US" : "zh-CN";
        if (Version.hasL()) {
            if (UCOSVersionUtil.getOSVersionCode() >= 24) {
                Context context = BaseApp.mContext;
                if (context == null) {
                    throw new NullPointerException("context is null.");
                }
                try {
                    int identifier = context.getResources().getIdentifier(IDENTIFIER_NAME, "string", IDENTIFIER_PACKAGE);
                    if (identifier != -1) {
                        string = BaseApp.mContext.getResources().getString(identifier);
                    }
                } catch (Exception e2) {
                    UCLogUtil.e("UCDeviceInfoUtil", e2);
                }
            } else {
                String languageTag = Locale.getDefault().toLanguageTag();
                if ("id-ID".equalsIgnoreCase(languageTag)) {
                    string = "in-ID";
                } else {
                    Locale localeForLanguageTag = Locale.forLanguageTag(languageTag);
                    string = localeForLanguageTag.getLanguage() + "-" + localeForLanguageTag.getCountry();
                }
            }
        }
        UCLogUtil.e("UCDeviceInfoUtil", "languageTag:" + string);
        return string;
    }

    public static String getLocale(Context context) {
        if (context == null) {
            throw new NullPointerException("context is null.");
        }
        try {
            return context.getResources().getConfiguration().locale.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    @Deprecated
    public static String getMacAddress(Context context) {
        return "";
    }

    public static String getManufacture() {
        try {
            return getFormatString(Build.MANUFACTURER);
        } catch (Exception e2) {
            UCLogUtil.e("UCDeviceInfoUtil", e2);
            return "";
        }
    }

    public static String getManufactureBySystemInfo() {
        try {
            String str = Build.MANUFACTURER;
            if (!TextUtils.isEmpty(str)) {
                String str2 = Build.BRAND;
                if (str2.toLowerCase().equals(UCCommonXor8Provider.getBrandGreen())) {
                    return str2;
                }
                if (!str.equalsIgnoreCase("unknown")) {
                    return str;
                }
            }
            return "0";
        } catch (Exception e2) {
            UCLogUtil.e("UCDeviceInfoUtil", e2);
            return "0";
        }
    }

    public static String getManufacturer() {
        return Build.MANUFACTURER;
    }

    public static String getMarketName() {
        String str = Version.hasR() ? SystemPropertyUtils.get(UCSystemInfoXor8Provider.marketNameAfterOplusSystemName(), "") : null;
        if (TextUtils.isEmpty(str)) {
            str = SystemPropertyUtils.get(UCSystemInfoXor8Provider.marketNameBeforOplusSystemName(), "");
        }
        return StringUtil.subString(str, 100);
    }

    private static long getMemoryInfo(File file, Context context) {
        if (context == null) {
            throw new NullPointerException("context is null.");
        }
        StatFs statFs = new StatFs(file.getPath());
        long blockSize = statFs.getBlockSize();
        long blockCount = statFs.getBlockCount();
        statFs.getAvailableBlocks();
        return blockCount * blockSize;
    }

    public static String getModel() {
        return Build.MODEL;
    }

    public static String getNetworkName(Context context) {
        if (context == null) {
            throw new NullPointerException("context is null.");
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return "";
        }
        if (activeNetworkInfo.getType() == 1) {
            return "WIFI";
        }
        if (activeNetworkInfo.getType() != 0) {
            return "";
        }
        switch (activeNetworkInfo.getSubtype()) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return "2G";
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                return "3G";
            case 13:
            case 18:
            case 19:
                return EventRuleEntity.ACCEPT_NET_4G;
            case 20:
                return EventRuleEntity.ACCEPT_NET_5G;
            default:
                return "Mobile";
        }
    }

    @Deprecated
    public static String getOSIMEI(Context context) {
        return null;
    }

    @Deprecated
    public static String getOperators(Context context) {
        return "";
    }

    public static String getOsVersion() {
        return UCOSVersionUtil.getOsVersion();
    }

    public static String getOsVersionRelease() {
        return Build.VERSION.RELEASE;
    }

    public static String getOsVersionSDK() {
        return String.valueOf(Build.VERSION.SDK_INT);
    }

    @Deprecated
    private static String getPhoneSerial() {
        return null;
    }

    public static long getRamMemoryTotalSize(Context context) {
        long jLongValue = 0;
        try {
            FileReader fileReader = new FileReader("/proc/meminfo");
            try {
                BufferedReader bufferedReader = new BufferedReader(fileReader, 8192);
                try {
                    String line = bufferedReader.readLine();
                    String[] strArrSplit = line.split("\\s+");
                    for (String str : strArrSplit) {
                        UCLogUtil.i(line, str + "\t");
                    }
                    jLongValue = Long.valueOf(strArrSplit[1]).longValue();
                    jLongValue *= 1024;
                    bufferedReader.close();
                    fileReader.close();
                    return jLongValue;
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    fileReader.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (IOException e2) {
            UCLogUtil.e("UCDeviceInfoUtil", e2);
        }
    }

    public static String getRegionMark() {
        String str = SystemPropertyUtils.get(UCSystemInfoXor8Provider.regionMarkGreenSystemName(), "CN");
        if (TextUtils.isEmpty(str)) {
            return getAfterSaleRegion();
        }
        return "OC".equalsIgnoreCase(str) ? "CN" : str;
    }

    public static String getResolution(Context context) {
        if (context == null) {
            throw new NullPointerException("context is null.");
        }
        if (sResolution == null) {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            sResolution = displayMetrics.widthPixels + "*" + displayMetrics.heightPixels;
        }
        return sResolution;
    }

    public static String getRomBuildDisplay() {
        String str = SystemPropertyUtils.get("ro.build.time.fix", "");
        if (TextUtils.isEmpty(str)) {
            str = SystemPropertyUtils.get("sys.build.display.full_id", "");
        }
        if (TextUtils.isEmpty(str)) {
            str = SystemPropertyUtils.get(HeaderInfoHelper.RO_BUILD_ID, "");
        }
        if (TextUtils.isEmpty(str)) {
            str = SystemPropertyUtils.get(HeaderInfoHelper.RO_BUILD_ID, "");
        }
        return TextUtils.isEmpty(str) ? Build.DISPLAY : str;
    }

    public static String getRomBuildOtaVersion() {
        return SystemPropertyUtils.get(UCSystemInfoXor8Provider.buildOtaVersionSystemName(), "");
    }

    public static long getRomMemoryTotalSize(Context context) {
        if (context == null) {
            throw new NullPointerException("context is null.");
        }
        try {
            return getMemoryInfo(Environment.getDataDirectory(), context);
        } catch (Exception e2) {
            UCLogUtil.e("UCDeviceInfoUtil", e2);
            return 0L;
        }
    }

    public static String getRomProductName() {
        return SystemPropertyUtils.get(UCSystemInfoXor8Provider.productNameSystemName(), "");
    }

    @Deprecated
    public static String getSerialNum() {
        return "";
    }

    @Deprecated
    public static String getSerialNumber() {
        return "";
    }

    @Deprecated
    public static String getSimMCC(Context context) {
        return "";
    }

    @Deprecated
    public static String getSimMNC(Context context) {
        return "";
    }

    public static String getValueEncoded(String str) {
        if (str == null) {
            return "0";
        }
        String strReplace = str.replace(Weather.SEPARATOR, "");
        int length = strReplace.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = strReplace.charAt(i);
            if (cCharAt <= 31 || cCharAt >= 127) {
                try {
                    return URLEncoder.encode(strReplace, "UTF-8");
                } catch (UnsupportedEncodingException e2) {
                    UCLogUtil.e("UCDeviceInfoUtil", e2);
                }
            }
        }
        return strReplace;
    }

    @Deprecated
    public static String getWifiSSID(Context context) {
        return "";
    }

    public static boolean hasNfcFeature(Context context) {
        return Version.hasO() && context.getPackageManager().hasSystemFeature("android.hardware.nfc");
    }

    public static boolean isGrantTelephone(Context context) {
        return (!Version.hasM() || context.checkSelfPermission("android.permission.READ_PHONE_STATE") == 0) && ApkInfoHelper.hasAccountOrOwn(context);
    }

    public static boolean isLargeScreenDevice(Context context) {
        if (Version.hasR()) {
            return context.getPackageManager().hasSystemFeature("oplus.feature.largescreen") || oplusHasFeature("oplus.hardware.type.tablet") || oplusHasFeature("oplus.hardware.type.fold");
        }
        return false;
    }

    public static boolean isOrange() {
        String brandOrange = UCCommonXor8Provider.getBrandOrange();
        return brandOrange.equalsIgnoreCase(Build.BRAND) || brandOrange.equalsIgnoreCase(SystemPropertyUtils.get("ro.product.brand.sub", UCCommonXor8Provider.getBrandGreen()));
    }

    public static boolean isRed(Context context) {
        String brandRed = UCCommonXor8Provider.getBrandRed();
        if (!context.getPackageManager().hasSystemFeature(UCSystemInfoXor8Provider.getPropertyFeatureRedXor8())) {
            String str = Build.BRAND;
            if (!brandRed.equalsIgnoreCase(str) && !"Kepler".equalsIgnoreCase(str)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isRoot() {
        try {
            return new File("/system/bin/su").exists() || new File("/system/xbin/su").exists();
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isSellmode(Context context) {
        if (context == null) {
            return false;
        }
        return context.getApplicationContext().getPackageManager().hasSystemFeature(UCSystemInfoXor8Provider.getPropertySpecialversionSellmodeXor8());
    }

    public static boolean oplusHasFeature(String str) {
        try {
            Class<?> cls = Class.forName("com.oplus.content.OplusFeatureConfigManager");
            Method method = cls.getMethod("getInstance", new Class[0]);
            method.setAccessible(true);
            Object objInvoke = method.invoke(cls, new Object[0]);
            Method method2 = cls.getMethod("hasFeature", String.class);
            method2.setAccessible(true);
            return ((Boolean) method2.invoke(cls.cast(objInvoke), str)).booleanValue();
        } catch (Exception e2) {
            UCLogUtil.e("UCDeviceInfoUtil", e2);
            return false;
        }
    }
}
