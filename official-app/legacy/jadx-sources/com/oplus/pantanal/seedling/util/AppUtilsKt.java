package com.oplus.pantanal.seedling.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u0003\u001a3\u0010\t\u001a\u0002H\n\"\u0004\b\u0000\u0010\n2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00012\b\u0010\u000b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u0002H\n¢\u0006\u0002\u0010\f\u001a\u0016\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"TAG", "", "getBooleanMetaValue", "", "context", "Landroid/content/Context;", "packageName", "key", "defaultValue", "getMetaValue", ExifInterface.GPS_DIRECTION_TRUE, "metaName", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "isPackageInstalled", "seedling-support_manualRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AppUtilsKt {

    @NotNull
    private static final String TAG = "AppUtils";

    public static final boolean getBooleanMetaValue(@NotNull Context context, @NotNull String packageName, @NotNull String key, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            return context.getPackageManager().getApplicationInfo(packageName, 128).metaData.getBoolean(key);
        } catch (Exception e2) {
            Logger.INSTANCE.e("AppUtils", "getMetaInt NameNotFoundException:" + e2.getMessage());
            return z;
        }
    }

    public static /* synthetic */ boolean getBooleanMetaValue$default(Context context, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        return getBooleanMetaValue(context, str, str2, z);
    }

    public static final <T> T getMetaValue(@NotNull Context context, @NotNull String packageName, @Nullable String str, T t) {
        T t2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(packageName, 128);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "getApplicationInfo(...)");
            Bundle bundle = applicationInfo.metaData;
            return (bundle == null || (t2 = (T) bundle.get(str)) == null) ? t : t2;
        } catch (Exception e2) {
            Logger.INSTANCE.e("AppUtils", "getMetaValue: " + e2.getMessage());
            return t;
        }
    }

    public static final boolean isPackageInstalled(@NotNull Context context, @NotNull String packageName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        if (!TextUtils.isEmpty(packageName)) {
            try {
                context.getPackageManager().getPackageInfo(packageName, 1);
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }
}
