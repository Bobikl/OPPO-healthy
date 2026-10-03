package com.heytap.store.apm.Net.utils;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Point;
import android.net.ConnectivityManager;
import android.net.DhcpInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.provider.Settings;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.heytap.health.safety.safetycheck.a;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.InetAddress;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes19.dex */
public final class NetDeviceUtils {
    private static final String LINE_SEP = System.getProperty("line.separator");

    public static class CommandResult {
        public String errorMsg;
        public int result;
        public String successMsg;

        public CommandResult(int i, String str, String str2) {
            this.result = i;
            this.successMsg = str;
            this.errorMsg = str2;
        }
    }

    private NetDeviceUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    private static void closeIO(Closeable... closeableArr) {
        if (closeableArr == null) {
            return;
        }
        for (Closeable closeable : closeableArr) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    private static double formatDouble(double d, int i) {
        return new BigDecimal(d).setScale(i, 4).doubleValue();
    }

    @SuppressLint({"HardwareIds"})
    public static String getAndroidID(Context context) {
        return Settings.Secure.getString(context.getApplicationContext().getContentResolver(), "android_id");
    }

    public static long getAvailMemory(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        if (activityManager != null) {
            activityManager.getMemoryInfo(memoryInfo);
        }
        return (memoryInfo.availMem / 1024) / 1024;
    }

    public static String getBrand() {
        return Build.BRAND;
    }

    public static String getCpuType() {
        return Build.CPU_ABI;
    }

    public static DhcpInfo getDhcpInfo(Context context) {
        WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
        if (wifiManager != null) {
            return wifiManager.getDhcpInfo();
        }
        return null;
    }

    public static String getHostIP(String str) throws Throwable {
        InetAddress byName;
        try {
            byName = InetAddress.getByName(str);
        } catch (UnknownHostException e2) {
            e2.printStackTrace();
            byName = null;
        }
        if (byName != null) {
            return byName.getHostAddress();
        }
        NetLogUtils.i("xxx", "iAddress ==null");
        return "";
    }

    public static String getHostName(String str) throws Throwable {
        InetAddress byName;
        try {
            byName = InetAddress.getByName(str);
        } catch (UnknownHostException e2) {
            e2.printStackTrace();
            byName = null;
        }
        if (byName != null) {
            return byName.getHostName();
        }
        NetLogUtils.i("xxx", "iAddress ==null");
        return "";
    }

    public static String getId() {
        return Build.ID;
    }

    public static String getManufacturer() {
        return Build.MANUFACTURER;
    }

    public static String getModel() {
        String str = Build.MODEL;
        return str != null ? str.trim().replaceAll("\\s*", "") : "";
    }

    public static int getRealHeightPixels(Context context) throws Throwable {
        WindowManager windowManager = (WindowManager) context.getApplicationContext().getSystemService("window");
        Display defaultDisplay = windowManager != null ? windowManager.getDefaultDisplay() : null;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            Class.forName("android.view.Display").getMethod("getRealMetrics", DisplayMetrics.class).invoke(defaultDisplay, displayMetrics);
            return displayMetrics.heightPixels;
        } catch (Exception e2) {
            NetLogUtils.d(e2.toString());
            return 0;
        }
    }

    private static String getRomAvailableSize(Context context) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return Formatter.formatFileSize(context, ((long) statFs.getBlockSize()) * ((long) statFs.getAvailableBlocks()));
    }

    public static String getRomSpace(Context context) {
        try {
            return getRomAvailableSize(context) + "/" + getRomTotalSize(context);
        } catch (Exception unused) {
            return "-/-";
        }
    }

    private static String getRomTotalSize(Context context) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return Formatter.formatFileSize(context, ((long) statFs.getBlockSize()) * ((long) statFs.getBlockCount()));
    }

    private static String getSDAvailableSize(Context context) {
        StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
        return Formatter.formatFileSize(context, ((long) statFs.getBlockSize()) * ((long) statFs.getAvailableBlocks()));
    }

    public static String getSDCardSpace(Context context) {
        try {
            return getSDAvailableSize(context) + "/" + getSDTotalSize(context);
        } catch (Exception unused) {
            return "-/-";
        }
    }

    public static int getSDKVersionCode() {
        return Build.VERSION.SDK_INT;
    }

    public static String getSDKVersionName() {
        return Build.VERSION.RELEASE;
    }

    private static String getSDTotalSize(Context context) {
        StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
        return Formatter.formatFileSize(context, ((long) statFs.getBlockSize()) * ((long) statFs.getBlockCount()));
    }

    public static double getScreenInch(Activity activity) {
        try {
            Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            int i = point.x;
            int i2 = point.y;
            float f = i;
            float f2 = displayMetrics.xdpi;
            float f3 = (f / f2) * (f / f2);
            float f4 = i2;
            float f5 = displayMetrics.ydpi;
            return formatDouble(Math.sqrt(f3 + ((f4 / f5) * (f4 / f5))), 1);
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0.0d;
        }
    }

    public static long getTotalMemory(Context context) {
        long jIntValue = 0;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/meminfo"), 8192);
            String line = bufferedReader.readLine();
            jIntValue = TextUtils.isEmpty(line) ? 0L : Integer.valueOf(line.split("\\s+")[1]).intValue() / 1024;
            bufferedReader.close();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        return jIntValue;
    }

    public static int getWidthPixels(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) context.getApplicationContext().getSystemService("window");
        if (windowManager == null) {
            return 0;
        }
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    public static WifiInfo getWifiInfo(Context context) {
        WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
        if (wifiManager != null) {
            return wifiManager.getConnectionInfo();
        }
        return null;
    }

    public static int getWifiIp(Context context) throws Throwable {
        WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
        if (wifiManager == null) {
            return -1;
        }
        WifiInfo connectionInfo = wifiManager.getConnectionInfo();
        NetLogUtils.i("getWifiIp--------", connectionInfo.toString());
        NetLogUtils.i("getWifiIp--------", connectionInfo.getBSSID());
        return connectionInfo.getIpAddress();
    }

    public static String getWifiName(Context context) throws Throwable {
        WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
        if (wifiManager == null) {
            return "无网络";
        }
        WifiInfo connectionInfo = wifiManager.getConnectionInfo();
        NetLogUtils.i("getWifiName--------", connectionInfo.toString());
        NetLogUtils.i("getWifiName--------", connectionInfo.getBSSID());
        return connectionInfo.getSSID();
    }

    public static String getWifiState(Context context) {
        WifiManager wifiManager;
        if (!isWifiConnect(context) || (wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi")) == null) {
            return "无wifi连接";
        }
        WifiInfo connectionInfo = wifiManager.getConnectionInfo();
        if (connectionInfo == null) {
            return "";
        }
        int rssi = connectionInfo.getRssi();
        if (rssi > -50 && rssi < 0) {
            return "最强";
        }
        if (rssi <= -70 || rssi >= -50) {
            return (rssi <= -80 || rssi >= -70) ? "微弱" : "较弱";
        }
        return "较强";
    }

    public static String intToIp(int i) {
        return (i & 255) + "." + ((i >> 8) & 255) + "." + ((i >> 16) & 255) + "." + ((i >> 24) & 255);
    }

    public static boolean isDeviceRooted() {
        try {
            String[] strArr = {"/system/bin/", "/system/xbin/", "/sbin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/xbin/", "/data/local/bin/", "/data/local/"};
            for (int i = 0; i < 8; i++) {
                if (new File(strArr[i] + a.BINARY_SU).exists()) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static boolean isWifiConnect(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
        if (connectivityManager != null) {
            return connectivityManager.getNetworkInfo(1).isConnected();
        }
        return false;
    }
}
