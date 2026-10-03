package com.cloud.sdk.cloudstorage.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.net.URLEncoder;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/cloud/sdk/cloudstorage/utils/ApkInfo;", "", "()V", "encodePkgName", "", "getEncodePkgName", "()Ljava/lang/String;", "setEncodePkgName", "(Ljava/lang/String;)V", "packageName", "getPackageName", "setPackageName", "versionCode", "", "getVersionCode", "()J", "setVersionCode", "(J)V", "init", "", "context", "Landroid/content/Context;", "cloud_storage_sdk_release"}, k = 1, mv = {1, 4, 2})
public final class ApkInfo {
    private static long versionCode;

    @NotNull
    public static final ApkInfo INSTANCE = new ApkInfo();

    @NotNull
    private static String packageName = "";

    @NotNull
    private static String encodePkgName = "";

    private ApkInfo() {
    }

    @NotNull
    public final String getEncodePkgName() {
        return encodePkgName;
    }

    @NotNull
    public final String getPackageName() {
        return packageName;
    }

    public final long getVersionCode() {
        return versionCode;
    }

    public final void init(@NotNull Context context) throws PackageManager.NameNotFoundException {
        Intrinsics.checkNotNullParameter(context, "context");
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        String str = packageInfo.packageName;
        Intrinsics.checkNotNullExpressionValue(str, "packageInfo.packageName");
        packageName = str;
        String strEncode = URLEncoder.encode(str);
        Intrinsics.checkNotNullExpressionValue(strEncode, "URLEncoder.encode(packageName)");
        encodePkgName = strEncode;
        Intrinsics.checkNotNullExpressionValue(packageInfo, "packageInfo");
        versionCode = packageInfo.getLongVersionCode();
    }

    public final void setEncodePkgName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        encodePkgName = str;
    }

    public final void setPackageName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        packageName = str;
    }

    public final void setVersionCode(long j2) {
        versionCode = j2;
    }
}
