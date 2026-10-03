package com.oplus.aiunit.vision;

import android.content.Context;
import com.oplus.accountsdk.base.common.util.AcLogUtil;

/* JADX INFO: loaded from: classes6.dex */
public class k7 {
    public static String a(Context context) {
        return context.getPackageName();
    }

    public static int b(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionCode;
        } catch (Exception e2) {
            AcLogUtil.e("AcApkInfoHelper", "getVersionCode " + e2.getMessage());
            return 0;
        }
    }

    public static String c(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (Exception e2) {
            AcLogUtil.e("AcApkInfoHelper", "getVersionName " + e2.getMessage());
            return "0";
        }
    }
}
