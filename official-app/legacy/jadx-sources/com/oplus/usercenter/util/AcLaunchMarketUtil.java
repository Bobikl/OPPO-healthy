package com.oplus.usercenter.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes8.dex */
@Keep
public class AcLaunchMarketUtil {
    private static final String PKG_GOOGLE_PLAY = "com.android.vending";
    private static final String PKG_MK_HEYTAP = "com.heytap.market";
    private static final String PKG_MK_OPPO = "com.oppo.market";
    private static final String TAG = "LaunchMarketUtil";

    private static long getVersionCode(Context context, String str) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 128);
            if (packageInfo != null) {
                return packageInfo.getLongVersionCode();
            }
            return -1L;
        } catch (PackageManager.NameNotFoundException e2) {
            Log.d(TAG, "getVersionCode error e = " + e2);
            return -1L;
        }
    }

    private static boolean intentToGooglePlay(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            intent.setPackage("com.android.vending");
            context.startActivity(intent);
            return true;
        } catch (Exception e2) {
            Log.d(TAG, "launch Google play error e = " + e2);
            return false;
        }
    }

    public static boolean intentToMarketApp(Context context, String str, String str2, long j2) {
        if (getVersionCode(context, PKG_MK_HEYTAP) >= j2) {
            return intentToSelfMarket(context, Uri.parse(str), Uri.parse(str2), PKG_MK_HEYTAP);
        }
        return getVersionCode(context, PKG_MK_OPPO) >= j2 ? intentToSelfMarket(context, Uri.parse(str), Uri.parse(str2), PKG_MK_OPPO) : intentToGooglePlay(context, Uri.parse(str2));
    }

    private static boolean intentToSelfMarket(Context context, Uri uri, Uri uri2, String str) {
        try {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.DEFAULT");
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            intent.setPackage(str);
            intent.setData(uri);
            context.startActivity(intent);
            return true;
        } catch (Exception e2) {
            intentToGooglePlay(context, uri2);
            Log.d(TAG, "intentToSelfMarket error e = " + e2 + ", try to intentToGooglePlay");
            return false;
        }
    }
}
