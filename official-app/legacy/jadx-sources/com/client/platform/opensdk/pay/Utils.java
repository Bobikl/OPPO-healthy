package com.client.platform.opensdk.pay;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.widget.Toast;
import com.oplus.aiunit.vision.alf;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* JADX INFO: loaded from: classes13.dex */
public class Utils {
    public static boolean existPackageName(Context context, String str) {
        try {
            context.getPackageManager().getPackageInfo(str, 0);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static int getApkVersionCode(Context context, String str) {
        try {
            return context.getPackageManager().getPackageArchiveInfo(str, 1).versionCode;
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    public static String getDecodeString(String str) {
        return new String(Base64.decode(str, 0));
    }

    public static int getMMApiLevel(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo("com.tencent.mm", 128);
            int i = applicationInfo.metaData.getInt("wechat_ext_api_level", 0);
            if (i > 0) {
                return i;
            }
            String string = applicationInfo.metaData.getString("wechat_fun_support");
            return (string == null || string.length() <= 0) ? 0 : 1;
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    private static String getMetaData(Context context, String str) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.get(str).toString();
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static int getPayApkVersionCode(Context context) {
        if (hasInstalledNPayApk(context)) {
            return getVersionCode(context, Constants.N_PAY_PKG_NAME);
        }
        if (hasInstalledFPayApk(context)) {
            return getVersionCode(context, Constants.F_PAY_PKG_NAME);
        }
        if (hasInstalledOPayApk(context)) {
            return getVersionCode(context, Constants.O_PAY_PKG_NAME);
        }
        return 0;
    }

    public static int getVersionCode(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionCode;
        } catch (Exception e2) {
            e2.printStackTrace();
            return 1;
        }
    }

    public static boolean hasInstalledFPayApk(Context context) {
        return isAppInstalled(context, Constants.F_PAY_PKG_NAME);
    }

    public static boolean hasInstalledNPayApk(Context context) {
        return isAppInstalled(context, Constants.N_PAY_PKG_NAME);
    }

    public static boolean hasInstalledOPayApk(Context context) {
        return isAppInstalled(context, Constants.O_PAY_PKG_NAME);
    }

    public static boolean hasInstalledPayApk(Context context) {
        return hasInstalledFPayApk(context) || hasInstalledNPayApk(context) || hasInstalledOPayApk(context);
    }

    public static boolean isAppInstalled(Context context, String str) {
        PackageInfo packageInfo;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            packageInfo = null;
        }
        return packageInfo != null;
    }

    public static boolean isMatchArea(Context context, String str) {
        return getMetaData(context, Constants.META_DATA_PAY_SDK_FLAVOR_REGION).equalsIgnoreCase("CN") ? str.equalsIgnoreCase("CN") : !str.equalsIgnoreCase("CN");
    }

    public static boolean isNetworkAvailable(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        return (((ConnectivityManager) context.getSystemService("connectivity")) == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected() || activeNetworkInfo.getState() != NetworkInfo.State.CONNECTED) ? false : true;
    }

    public static boolean isNotSupportDownload(Context context, String str) {
        if (!(alf.IN.equalsIgnoreCase(str) && existPackageName(context, Constants.F_PAY_PKG_NAME)) && Build.VERSION.SDK_INT < 31) {
            return false;
        }
        Toast.makeText(context.getApplicationContext(), R.string.not_support_download, 0).show();
        return true;
    }

    public static boolean isWifi(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.getType() == 1;
    }

    public static int yuanToFen(double d) {
        double dDoubleValue = d * 100.0d;
        try {
            dDoubleValue = Double.valueOf(new DecimalFormat("#0.00", new DecimalFormatSymbols(Locale.CHINA)).format(dDoubleValue).toString()).doubleValue();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return (int) dDoubleValue;
    }
}
