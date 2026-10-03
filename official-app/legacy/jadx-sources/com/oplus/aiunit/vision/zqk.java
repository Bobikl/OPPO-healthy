package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.text.TextUtils;
import androidx.core.content.FileProvider;
import java.io.File;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public class zqk {
    public static int a(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionCode;
        } catch (Exception unused) {
            qae.b("Not Installed : " + str);
            return 1;
        }
    }

    public static void b(@NotNull Context context, @NotNull File file) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setFlags(268435456);
        Uri uriForFile = FileProvider.getUriForFile(context, context.getPackageName() + ".fileProvider", file);
        intent.addFlags(1);
        intent.addFlags(2);
        intent.setDataAndType(uriForFile, "application/vnd.android.package-archive");
        context.startActivity(intent);
    }

    public static boolean c(Context context, String str) {
        PackageInfo packageInfo;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            qae.b("Not Installed : " + str);
            packageInfo = null;
        }
        return packageInfo != null;
    }

    public static boolean d(@NotNull Context context) {
        Object systemService = context.getSystemService("connectivity");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected() && activeNetworkInfo.getState() == NetworkInfo.State.CONNECTED;
    }

    public static boolean e(@NotNull Context context) {
        Object systemService = context.getSystemService("connectivity");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.getType() == 1;
    }
}
