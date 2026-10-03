package com.heytap.store.platform.jsclasslike.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0010H\u0002J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u0012R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/heytap/store/platform/jsclasslike/utils/PackageUtils;", "", "()V", "NEW_VERSION_CODE", "", "getNEW_VERSION_CODE", "()J", "setNEW_VERSION_CODE", "(J)V", "NEW_VERSION_NAME", "", "getNEW_VERSION_NAME", "()Ljava/lang/String;", "setNEW_VERSION_NAME", "(Ljava/lang/String;)V", "getPackageInfo", "Landroid/content/pm/PackageInfo;", "context", "Landroid/content/Context;", "getVersionCode", "packageInfo", "isNewVersion", "", "updateVersion", "", "jsclasslike-api_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class PackageUtils {

    @NotNull
    public static final PackageUtils INSTANCE = new PackageUtils();
    private static long NEW_VERSION_CODE;

    @Nullable
    private static String NEW_VERSION_NAME;

    private PackageUtils() {
    }

    private final PackageInfo getPackageInfo(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 16384);
        } catch (Exception unused) {
            return null;
        }
    }

    private final long getVersionCode(PackageInfo packageInfo) {
        return packageInfo.getLongVersionCode();
    }

    public final long getNEW_VERSION_CODE() {
        return NEW_VERSION_CODE;
    }

    @Nullable
    public final String getNEW_VERSION_NAME() {
        return NEW_VERSION_NAME;
    }

    public final boolean isNewVersion(@NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        PackageInfo packageInfo = getPackageInfo(context);
        if (packageInfo == null) {
            return true;
        }
        String str = packageInfo.versionName;
        long versionCode = getVersionCode(packageInfo);
        SharedPreferences sharedPreferences = context.getSharedPreferences("SP_APP_LIKE_CACHE", 0);
        if (Intrinsics.areEqual(str, sharedPreferences.getString("LAST_VERSION_NAME", null)) && versionCode == sharedPreferences.getLong("LAST_VERSION_CODE", -1L)) {
            return false;
        }
        NEW_VERSION_CODE = versionCode;
        NEW_VERSION_NAME = str;
        return true;
    }

    public final void setNEW_VERSION_CODE(long j2) {
        NEW_VERSION_CODE = j2;
    }

    public final void setNEW_VERSION_NAME(@Nullable String str) {
        NEW_VERSION_NAME = str;
    }

    public final void updateVersion(@NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        String str = NEW_VERSION_NAME;
        if ((str == null || str.length() == 0) || NEW_VERSION_CODE == 0) {
            return;
        }
        context.getSharedPreferences("SP_APP_LIKE_CACHE", 0).edit().putString("LAST_VERSION_NAME", NEW_VERSION_NAME).putLong("LAST_VERSION_CODE", NEW_VERSION_CODE).apply();
    }
}
