package com.platform.usercenter.oauth.util;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class AcOauthAppUtil {
    private static final String TAG = "AcOauthAppUtil";
    private static String acPkg;

    public static String getAccountPkgName(Context context) {
        if (!TextUtils.isEmpty(acPkg)) {
            return acPkg;
        }
        Context applicationContext = context.getApplicationContext();
        String str = AcOauthConstants.AcPackageNameConstants.PACKAGE_NAME_OS17_ACCOUNT;
        if (!hasAPK(applicationContext, str)) {
            str = AcOauthConstants.AcPackageNameConstants.PACKAGE_NAME_OS17_OP_ACCOUNT;
            if (!hasAPK(applicationContext, str)) {
                str = AcOauthConstants.AcPackageNameConstants.PACKAGE_NAME_NEW_ACCOUNT;
                if (!hasAPK(applicationContext, str)) {
                    str = AcOauthConstants.AcPackageNameConstants.PACKAGE_NAME_NEW_USERCENTER;
                    if (!hasAPK(applicationContext, str)) {
                        str = AcOauthConstants.AcPackageNameConstants.PACKAGE_NAME_OLD_ACCOUNT;
                        if (!hasAPK(applicationContext, str)) {
                            if (hasAPK(applicationContext, AcOauthConstants.AcPackageNameConstants.PACKAGE_NAME_HT_ACCOUNT)) {
                                str = AcOauthConstants.AcPackageNameConstants.PACKAGE_NAME_HT_ACCOUNT;
                            } else {
                                str = AcOauthConstants.AcPackageNameConstants.PACKAGE_NAME_OPUSERCENTER;
                                if (!hasAPK(applicationContext, str)) {
                                    str = AcOauthConstants.AcPackageNameConstants.PACKAGE_NAME_OPS_ACCOUNT;
                                    if (!hasAPK(applicationContext, str)) {
                                        str = "";
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        acPkg = str;
        return str;
    }

    public static int getAccountPkgVersion(Context context) {
        String accountPkgName = getAccountPkgName(context);
        if (TextUtils.isEmpty(accountPkgName)) {
            return 0;
        }
        return getVersionCode(context, accountPkgName);
    }

    public static Bundle getMetaInfo(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            AcOauthLogUtil.e(TAG, "getMetaInfo error: pkgName is null");
            return null;
        }
        try {
            return context.getPackageManager().getApplicationInfo(str, 128).metaData;
        } catch (Throwable th) {
            AcOauthLogUtil.e(TAG, "getMetaInfo error: " + th.getMessage());
            return null;
        }
    }

    public static int getPkgVersionCode(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (Exception e2) {
            AcOauthLogUtil.e(TAG, "getPkgVersionCode " + e2.getMessage());
            return 0;
        }
    }

    public static int getVersionCode(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionCode;
        } catch (Exception e2) {
            AcOauthLogUtil.e(TAG, "getVersionCode " + e2.getMessage());
            return 0;
        }
    }

    public static String getVersionName(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (Exception e2) {
            AcOauthLogUtil.e(TAG, "getVersionName " + e2.getMessage());
            return "0";
        }
    }

    public static boolean hasAPK(Context context, String str) {
        try {
            context.getPackageManager().getPackageInfo(str, 1);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
