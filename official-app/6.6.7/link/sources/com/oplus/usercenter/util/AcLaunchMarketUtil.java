package com.oplus.usercenter.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.Keep;
import com.oplusos.sau.common.utils.SauAarConstants;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
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
        } catch (PackageManager.NameNotFoundException e) {
            Log.d(TAG, "getVersionCode error e = " + e);
            return -1L;
        }
    }

    private static boolean intentToGooglePlay(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            if (!(context instanceof Activity)) {
                intent.addFlags(SauAarConstants.L);
            }
            intent.setPackage(PKG_GOOGLE_PLAY);
            context.startActivity(intent);
            return true;
        } catch (Exception e) {
            Log.d(TAG, "launch Google play error e = " + e);
            return false;
        }
    }

    public static boolean intentToMarketApp(Context context, String str, String str2, long j) {
        if (getVersionCode(context, PKG_MK_HEYTAP) >= j) {
            return intentToSelfMarket(context, Uri.parse(str), Uri.parse(str2), PKG_MK_HEYTAP);
        }
        return getVersionCode(context, PKG_MK_OPPO) >= j ? intentToSelfMarket(context, Uri.parse(str), Uri.parse(str2), PKG_MK_OPPO) : intentToGooglePlay(context, Uri.parse(str2));
    }

    private static boolean intentToSelfMarket(Context context, Uri uri, Uri uri2, String str) {
        try {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.DEFAULT");
            if (!(context instanceof Activity)) {
                intent.addFlags(SauAarConstants.L);
            }
            intent.setPackage(str);
            intent.setData(uri);
            context.startActivity(intent);
            return true;
        } catch (Exception e) {
            intentToGooglePlay(context, uri2);
            Log.d(TAG, "intentToSelfMarket error e = " + e + ", try to intentToGooglePlay");
            return false;
        }
    }
}
