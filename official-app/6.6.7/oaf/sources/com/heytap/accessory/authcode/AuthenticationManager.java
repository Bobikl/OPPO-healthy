package com.heytap.accessory.authcode;

import android.content.Context;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class AuthenticationManager {
    private static IAuthentication mAuthentication;

    public static int check(Context context, int i, int i2, boolean z) {
        if (mAuthentication == null) {
            mAuthentication = new b();
        }
        return mAuthentication.check(context, i, i2, z);
    }

    public static boolean checkPermission(Context context, int i, int i2, String str, boolean z) {
        if (mAuthentication == null) {
            mAuthentication = new b();
        }
        return mAuthentication.checkPermission(context, i, i2, str, z);
    }

    public static void setAuthentication(IAuthentication iAuthentication) {
        mAuthentication = iAuthentication;
    }

    public static boolean checkPermission(Context context, String str, String str2, boolean z) throws AuthFailureException {
        if (mAuthentication == null) {
            mAuthentication = new b();
        }
        return mAuthentication.checkPermission(context, str, str2, z);
    }
}
