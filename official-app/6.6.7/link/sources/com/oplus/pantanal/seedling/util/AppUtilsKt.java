package com.oplus.pantanal.seedling.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.text.TextUtils;
import com.oplus.wearable.linkservice.sdk.Node;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u0003\u001a3\u0010\t\u001a\u0002H\n\"\u0004\b\u0000\u0010\n2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00012\b\u0010\u000b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u0002H\n¢\u0006\u0002\u0010\f\u001a\u0016\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"TAG", "", "getBooleanMetaValue", "", "context", "Landroid/content/Context;", "packageName", Node.I_KEY, "defaultValue", "getMetaValue", "T", "metaName", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "isPackageInstalled", "seedling-support_manualRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AppUtilsKt {

    @NotNull
    private static final String TAG = "AppUtils";

    public static final boolean getBooleanMetaValue(@NotNull Context context, @NotNull String str, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, "packageName");
        Intrinsics.checkNotNullParameter(str2, Node.I_KEY);
        try {
            return context.getPackageManager().getApplicationInfo(str, 128).metaData.getBoolean(str2);
        } catch (Exception e) {
            Logger.INSTANCE.e(TAG, "getMetaInt NameNotFoundException:" + e.getMessage());
            return z;
        }
    }

    public static /* synthetic */ boolean getBooleanMetaValue$default(Context context, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        return getBooleanMetaValue(context, str, str2, z);
    }

    public static final <T> T getMetaValue(@NotNull Context context, @NotNull String str, @Nullable String str2, T t) {
        T t2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, "packageName");
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 128);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "getApplicationInfo(...)");
            Bundle bundle = applicationInfo.metaData;
            return (bundle == null || (t2 = (T) bundle.get(str2)) == null) ? t : t2;
        } catch (Exception e) {
            Logger.INSTANCE.e(TAG, "getMetaValue: " + e.getMessage());
            return t;
        }
    }

    public static final boolean isPackageInstalled(@NotNull Context context, @NotNull String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, "packageName");
        if (!TextUtils.isEmpty(str)) {
            try {
                context.getPackageManager().getPackageInfo(str, 1);
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }
}
