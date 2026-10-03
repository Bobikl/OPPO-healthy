package com.platform.usercenter.tools;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.platform.usercenter.basic.provider.UCCommonXor8Provider;
import com.platform.usercenter.tools.log.UCLogUtil;
import com.platform.usercenter.tools.time.TimeInfoHelper;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class ApkInfoHelper {
    private static final String META_DATA_EMPTY = "is_empty";
    private static final String SUBSCRIPT = "_";
    private static final String TAG = "ApkInfoHelper";
    private static final String VERSION_COMMIT = "versionCommit";
    private static final String VERSION_DATE = "versionDate";
    private static long mCurrentStamp;
    private static String mProcessName;
    private static final String[] PKG_ARRAY = {UCCommonXor8Provider.getUCPackageName(), UCCommonXor8Provider.getPkOpMember(), UCCommonXor8Provider.getPkHtMember(), UCCommonXor8Provider.getPkOneMember(), UCCommonXor8Provider.getPkgnameOPlusXor8(), UCCommonXor8Provider.getPkgnameUcHtXor8(), UCCommonXor8Provider.getPkgnameUcPlusXor8()};
    private static final String[] PKG_AC_ARRAY = {UCCommonXor8Provider.getUCPackageName(), UCCommonXor8Provider.getPkgnameOPlusXor8(), UCCommonXor8Provider.getAcPkgName(), UCCommonXor8Provider.getPkgnameOpHtXor8(), UCCommonXor8Provider.getPkgnameUcHtXor8(), UCCommonXor8Provider.getPkgnameUcPlusXor8()};

    public static boolean appExistByPkgName(Context context, String str) {
        ApplicationInfo applicationInfo;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 8192);
            return (packageInfo == null || (applicationInfo = packageInfo.applicationInfo) == null || !applicationInfo.enabled) ? false : true;
        } catch (Exception e2) {
            UCLogUtil.e(TAG, "appExistByPkgName = " + e2.getMessage());
            return false;
        }
    }

    @NonNull
    public static String getAcPackage(Context context) {
        String acPkgName = UCCommonXor8Provider.getAcPkgName();
        return isExistPackage(context, acPkgName) ? acPkgName : "";
    }

    public static int getAcVersion(Context context) {
        String acPackage = getAcPackage(context);
        if ("".equals(acPackage)) {
            return 0;
        }
        return getVersionCode(context, acPackage);
    }

    public static String getAppCode(Context context) {
        int i;
        try {
            i = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getInt(UCCommonXor8Provider.getProviderAppCodeXor8());
        } catch (Exception e2) {
            UCLogUtil.e(TAG, e2);
            i = 0;
        }
        return i + "";
    }

    public static String getAppFormatVersion(Context context) {
        PackageManager packageManager = context.getPackageManager();
        StringBuilder sb = new StringBuilder();
        try {
            Bundle bundle = packageManager.getApplicationInfo(context.getPackageName(), 128).metaData;
            sb.append(getVersionName(context));
            sb.append("_");
            sb.append(bundle.get(VERSION_COMMIT).toString());
            sb.append("_");
            sb.append(bundle.get(VERSION_DATE).toString());
            if (TextUtils.isEmpty(sb.toString())) {
                sb.append(getVersionName(context));
                sb.append("_");
                sb.append(TimeInfoHelper.getFormatDate());
            }
        } catch (Exception e2) {
            UCLogUtil.e(TAG, e2);
        }
        return sb.toString();
    }

    public static String getAppName(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        try {
            return packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, 0)).toString();
        } catch (Exception e2) {
            UCLogUtil.e(TAG, e2);
            return "";
        }
    }

    public static String getCommitHash(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.get(VERSION_COMMIT).toString();
        } catch (Exception e2) {
            UCLogUtil.e(TAG, e2);
            return "";
        }
    }

    private static String getHashString(MessageDigest messageDigest) {
        StringBuilder sb = new StringBuilder();
        for (byte b : messageDigest.digest()) {
            sb.append(Integer.toHexString((b >> 4) & 15));
            sb.append(Integer.toHexString(b & 15));
        }
        return sb.toString();
    }

    public static String getMD5(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            return getHashString(messageDigest);
        } catch (NoSuchAlgorithmException e2) {
            UCLogUtil.e(TAG, e2);
            return null;
        }
    }

    public static Bundle getMetaData(Context context, String str) {
        try {
            return context.getPackageManager().getApplicationInfo(str, 128).metaData;
        } catch (PackageManager.NameNotFoundException e2) {
            UCLogUtil.e(TAG, "getMetaData = " + e2);
            return null;
        }
    }

    public static Drawable getPackageIcon(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return packageManager.getPackageInfo(str, 0).applicationInfo.loadIcon(packageManager);
        } catch (PackageManager.NameNotFoundException e2) {
            UCLogUtil.e(TAG, e2);
            return null;
        }
    }

    @Nullable
    private static PackageManager getPackageManager(Context context) {
        return context.getPackageManager();
    }

    public static String getPackageName(Context context) {
        return context.getPackageName();
    }

    public static int getPackageNumber(Context context, List<String> list) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (isExistPackage(context, list.get(i2))) {
                i++;
            }
        }
        return i;
    }

    public static int getPayApkVersionCode(Context context) {
        if (hasInstalledOPlusPayApk(context)) {
            return getVersionCode(context, UCCommonXor8Provider.getNormalStrByDecryptXOR8("kge&gxd}{&xiq"));
        }
        if (hasInstalledNMPayApk(context)) {
            return getVersionCode(context, UCCommonXor8Provider.getNormalStrByDecryptXOR8("kge&fmizem&i|di{"));
        }
        if (hasInstalledFinShellPayApk(context)) {
            return getVersionCode(context, UCCommonXor8Provider.getNormalStrByDecryptXOR8("kge&naf{`mdd&i|di{"));
        }
        return 0;
    }

    public static String getProcessName(Context context, int i) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - mCurrentStamp < 1000 && !TextUtils.isEmpty(mProcessName)) {
            return mProcessName;
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return null;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == i) {
                String str = runningAppProcessInfo.processName;
                mProcessName = str;
                mCurrentStamp = jCurrentTimeMillis;
                return str;
            }
        }
        return null;
    }

    public static String getSignatureDigest(String str, Context context) {
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(str, 64).signatures;
            if (signatureArr.length <= 0) {
                return "";
            }
            for (Signature signature : signatureArr) {
                if (signature != null) {
                    return getMD5(signature.toByteArray());
                }
            }
        } catch (Exception e2) {
            UCLogUtil.e(TAG, e2);
        }
        return "";
    }

    public static String getUcAcPackage(Context context) {
        Bundle metaData;
        PackageManager packageManager = getPackageManager(context);
        if (packageManager == null) {
            UCLogUtil.w(TAG, "ac packageManager is ge null");
            return "";
        }
        String pkgnameOPlusXor8 = UCCommonXor8Provider.getPkgnameOPlusXor8();
        String pkgnameUcHtXor8 = UCCommonXor8Provider.getPkgnameUcHtXor8();
        String pkgnameUcPlusXor8 = UCCommonXor8Provider.getPkgnameUcPlusXor8();
        for (String str : PKG_AC_ARRAY) {
            if (isExistPackage(packageManager, str)) {
                if (!(((str.equals(pkgnameOPlusXor8) || str.equals(pkgnameUcHtXor8) || str.equals(pkgnameUcPlusXor8)) && (metaData = getMetaData(context, str)) != null) ? metaData.getBoolean(META_DATA_EMPTY, false) : false)) {
                    return str;
                }
            }
        }
        return "";
    }

    public static String getUcPackage(Context context) {
        Bundle metaData;
        PackageManager packageManager = getPackageManager(context);
        if (packageManager == null) {
            UCLogUtil.w(TAG, "packageManager is ge null");
            return "";
        }
        String pkgnameOPlusXor8 = UCCommonXor8Provider.getPkgnameOPlusXor8();
        String pkgnameUcHtXor8 = UCCommonXor8Provider.getPkgnameUcHtXor8();
        String pkgnameUcPlusXor8 = UCCommonXor8Provider.getPkgnameUcPlusXor8();
        for (String str : PKG_ARRAY) {
            if (isExistPackage(packageManager, str)) {
                if (!(((str.equals(pkgnameOPlusXor8) || str.equals(pkgnameUcHtXor8) || str.equals(pkgnameUcPlusXor8)) && (metaData = getMetaData(context, str)) != null) ? metaData.getBoolean(META_DATA_EMPTY, false) : false)) {
                    return str;
                }
            }
        }
        return "";
    }

    public static int getUcVersion(Context context) {
        String ucPackage = getUcPackage(context);
        if ("".equals(ucPackage)) {
            return 0;
        }
        return getVersionCode(context, ucPackage);
    }

    public static int getUid(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(getPackageName(context), 128).uid;
        } catch (PackageManager.NameNotFoundException e2) {
            UCLogUtil.e(TAG, e2);
            return 0;
        }
    }

    @Deprecated
    public static int getVersionCode(Context context) {
        return getVersionCode(context, context.getPackageName());
    }

    @Deprecated
    public static String getVersionName(Context context) {
        return getVersionName(context, getPackageName(context));
    }

    @Deprecated
    public static boolean hasAPK(Context context, String str) {
        return hasActivityLabel(context, str);
    }

    public static boolean hasAccountOrOwn(@NonNull Context context) {
        String packageName = context.getPackageName();
        return packageName.equals(getUcPackage(context)) || packageName.equals(getAcPackage(context));
    }

    public static boolean hasActivityLabel(Context context, String str) {
        try {
            context.getPackageManager().getPackageInfo(str, 1);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean hasInstalledFinShellPayApk(Context context) {
        return isAppInstalled(context, UCCommonXor8Provider.getNormalStrByDecryptXOR8("kge&naf{`mdd&i|di{"));
    }

    private static boolean hasInstalledNMPayApk(Context context) {
        return isAppInstalled(context, UCCommonXor8Provider.getNormalStrByDecryptXOR8("kge&fmizem&i|di{"));
    }

    private static boolean hasInstalledOPlusPayApk(Context context) {
        return isAppInstalled(context, UCCommonXor8Provider.getNormalStrByDecryptXOR8("kge&gxd}{&xiq"));
    }

    private static boolean isAppInstalled(Context context, String str) {
        return isExistPackage(context, str);
    }

    public static boolean isExistPackage(Context context, String str) {
        try {
            context.getPackageManager().getPackageInfo(str, 0);
            return true;
        } catch (Exception e2) {
            UCLogUtil.e(TAG, e2);
            return false;
        }
    }

    public static boolean isSystemApp(Context context, String str) {
        PackageInfo packageInfo;
        boolean z = false;
        try {
            packageInfo = context.getApplicationContext().getPackageManager().getPackageInfo(str, 0);
        } catch (Exception e2) {
            UCLogUtil.e(TAG, e2);
            packageInfo = null;
        }
        if (packageInfo != null) {
            int i = packageInfo.applicationInfo.flags;
            boolean z2 = (i & 1) == 1;
            boolean z3 = (i & 128) == 1;
            if (z2 || z3) {
                z = true;
            }
        }
        UCLogUtil.i(TAG, str + " isSystemApp " + z);
        return z;
    }

    public static int getVersionCode(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionCode;
        } catch (Exception e2) {
            UCLogUtil.e(TAG, e2);
            return 0;
        }
    }

    public static String getVersionName(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (Exception e2) {
            UCLogUtil.e(TAG, e2);
            return "0";
        }
    }

    private static boolean isExistPackage(@NonNull PackageManager packageManager, String str) {
        try {
            packageManager.getPackageInfo(str, 0);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
