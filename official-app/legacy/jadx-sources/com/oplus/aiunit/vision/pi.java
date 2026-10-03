package com.oplus.aiunit.vision;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;
import androidx.annotation.NonNull;
import com.heytap.health.watch.notification.impl.pull.NotificationApiService;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import com.oplus.accountsdk.service.old.heytap.utils.AcOldConstants;
import com.platform.usercenter.account.ams.ipc.RequestConstant;

/* JADX INFO: loaded from: classes19.dex */
public class pi {
    public static ContentProviderClient a(Context context, String str) {
        try {
            return context.getContentResolver().acquireUnstableContentProviderClient(Uri.parse(NotificationApiService.CONTENT + str));
        } catch (SecurityException unused) {
            AcLogUtil.e("AcProviderUtils", "Failed to acquire provider for authority: " + str + " because SecurityException");
            return null;
        } catch (Throwable th) {
            AcLogUtil.e("AcProviderUtils", "Failed to acquire provider for authority: " + str, th);
            return null;
        }
    }

    @NonNull
    public static Uri b(@NonNull String str) {
        return Uri.parse(NotificationApiService.CONTENT + str + "/DBAccountEntity");
    }

    public static String c(Context context) {
        return AcOldConstants.b.b(context);
    }

    public static String d(Context context) {
        return l7.a(context) + RequestConstant.BINDER_ACCOUNT_PROVIDER_OS17_AUTHORITY_SUFFIX;
    }

    @NonNull
    public static gl e(Context context) {
        String strD = d(context);
        Uri uriB = b(strD);
        ContentProviderClient contentProviderClientA = a(context, strD + "/DBAccountEntity");
        if (contentProviderClientA != null) {
            return new gl(contentProviderClientA, uriB, strD);
        }
        String strC = c(context);
        Uri uriB2 = b(strC);
        ContentProviderClient contentProviderClientA2 = a(context, strC + "/DBAccountEntity");
        if (contentProviderClientA2 != null) {
            return new gl(contentProviderClientA2, uriB2, strC);
        }
        String strH = h(context);
        return new gl(null, b(strH), strH);
    }

    public static ContentProviderClient f(Context context) {
        String strD = d(context);
        ContentProviderClient contentProviderClientA = a(context, strD);
        if (contentProviderClientA != null) {
            AcLogUtil.i("AcProviderUtils", "Acquired OS17 provider client: " + strD);
            return contentProviderClientA;
        }
        ContentProviderClient contentProviderClientA2 = a(context, RequestConstant.BINDER_PROVIDER_AUTHORITY);
        if (contentProviderClientA2 != null) {
            AcLogUtil.i("AcProviderUtils", "Acquired legacy provider client: com.platform.usercenter.account.ams.provider");
        } else {
            AcLogUtil.i("AcProviderUtils", "Failed to acquire any provider client");
        }
        return contentProviderClientA2;
    }

    public static ProviderInfo g(Context context) {
        String strD = d(context);
        ProviderInfo providerInfoI = i(context, strD);
        if (providerInfoI != null) {
            AcLogUtil.i("AcProviderUtils", "Found OS17 provider: " + strD);
            return providerInfoI;
        }
        ProviderInfo providerInfoI2 = i(context, RequestConstant.BINDER_PROVIDER_AUTHORITY);
        if (providerInfoI2 != null) {
            AcLogUtil.i("AcProviderUtils", "Found legacy provider: com.platform.usercenter.account.ams.provider");
        } else {
            AcLogUtil.i("AcProviderUtils", "No provider found");
        }
        return providerInfoI2;
    }

    @NonNull
    public static String h(Context context) {
        String strD = d(context);
        return i(context, strD) != null ? strD : c(context);
    }

    public static ProviderInfo i(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            return Build.VERSION.SDK_INT >= 33 ? packageManager.resolveContentProvider(str, PackageManager.ComponentInfoFlags.of(0L)) : packageManager.resolveContentProvider(str, 0);
        } catch (Exception e2) {
            AcLogUtil.e("AcProviderUtils", "Failed to resolve provider for authority: " + str, e2);
            return null;
        }
    }
}
