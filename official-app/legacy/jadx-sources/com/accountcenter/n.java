package com.accountcenter;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.os.Build;
import com.platform.usercenter.tools.log.UCLogUtil;

/* JADX INFO: loaded from: classes12.dex */
public final class n {
    public static boolean a(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        ProviderInfo providerInfoResolveContentProvider = Build.VERSION.SDK_INT >= 33 ? packageManager.resolveContentProvider(str, PackageManager.ComponentInfoFlags.of(0L)) : packageManager.resolveContentProvider(str, 0);
        StringBuilder sb = new StringBuilder("providerInfo is exist:");
        sb.append(providerInfoResolveContentProvider != null);
        UCLogUtil.i("AcUtils", sb.toString());
        return providerInfoResolveContentProvider != null;
    }
}
