package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import com.oplus.accountsdk.service.common.constants.AcConstants;

/* JADX INFO: loaded from: classes19.dex */
public class l7 {
    public static String a;

    public static String a(Context context) {
        String str = a;
        if (str != null) {
            return str;
        }
        Context applicationContext = context.getApplicationContext();
        String str2 = AcConstants.b.PACKAGE_NAME_OS17_ACCOUNT;
        if (!c(applicationContext, str2)) {
            str2 = AcConstants.b.PACKAGE_NAME_OS17_OP_ACCOUNT;
            if (!c(applicationContext, str2)) {
                str2 = AcConstants.b.PACKAGE_NAME_NEW_ACCOUNT;
                if (!c(applicationContext, str2)) {
                    str2 = AcConstants.b.PACKAGE_NAME_NEW_USERCENTER;
                    if (!c(applicationContext, str2)) {
                        str2 = AcConstants.b.PACKAGE_NAME_OLD_ACCOUNT;
                        if (!c(applicationContext, str2)) {
                            if (c(applicationContext, AcConstants.b.PACKAGE_NAME_HT_ACCOUNT)) {
                                str2 = AcConstants.b.PACKAGE_NAME_HT_ACCOUNT;
                            } else {
                                str2 = AcConstants.b.PACKAGE_NAME_OPUSERCENTER;
                                if (!c(applicationContext, str2)) {
                                    str2 = AcConstants.b.PACKAGE_NAME_OPS_ACCOUNT;
                                    if (!c(applicationContext, str2)) {
                                        str2 = "";
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        a = str2;
        return str2;
    }

    public static int b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(a(context), 0).versionCode;
        } catch (Exception e2) {
            AcLogUtil.e("AcApkUtils", "getAccountPkgVersion failed! exception: " + e2);
            return 0;
        }
    }

    @Deprecated
    public static boolean c(Context context, String str) {
        return d(context, str);
    }

    public static boolean d(Context context, String str) {
        try {
            context.getPackageManager().getPackageInfo(str, 1);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean e(Context context) {
        String strC = b8.b().c(context);
        if (TextUtils.isEmpty(strC)) {
            AcLogUtil.e("AcApkUtils", "isNormandyVersion ac pkg is old version, not support");
            return false;
        }
        Bundle bundleA = m7.a(context, strC);
        if (bundleA == null) {
            AcLogUtil.e("AcApkUtils", "isNormandyVersion ac metadata is null");
            return false;
        }
        if (!TextUtils.isEmpty(bundleA.getString(AcConstants.c.METADATA_LOGIN_REGISTER_SCENEID))) {
            return true;
        }
        AcLogUtil.e("AcApkUtils", "isNormandyVersion uc version not support");
        return false;
    }
}
