package com.heytap.nearx.tangramconfig.util;

import android.content.Context;
import android.content.SharedPreferences;
import com.heytap.nearx.tangramconfig.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\rJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000e\u001a\u00020\tJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0015\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\tH\u0000¢\u0006\u0002\b\u0017J\u0016\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\rJ\u0016\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\tR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/heytap/nearx/tangramconfig/util/KitSPUtils;", "", "()V", "isKv", "", "()Z", "setKv", "(Z)V", "sharePreferenceKey", "", "spConfig", "Landroid/content/SharedPreferences;", "getSpLong", "", "key", "defaultValue", "getSpString", "init", "", "context", "Landroid/content/Context;", "isSupportMMKV", "spkey", "isSupportMMKV$com_heytap_nearx_tangramconfig", "updateSpLong", "value", "updateSpString", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class KitSPUtils {
    private static boolean isKv;
    private static SharedPreferences spConfig;

    @NotNull
    public static final KitSPUtils INSTANCE = new KitSPUtils();

    @NotNull
    private static final String sharePreferenceKey = "kitcommon";

    private KitSPUtils() {
    }

    public static /* synthetic */ long getSpLong$default(KitSPUtils kitSPUtils, String str, long j2, int i, Object obj) {
        if ((i & 2) != 0) {
            j2 = 0;
        }
        return kitSPUtils.getSpLong(str, j2);
    }

    public final long getSpLong(@NotNull String key, long defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (isKv) {
            return 0L;
        }
        SharedPreferences sharedPreferences = spConfig;
        if (sharedPreferences == null) {
            return defaultValue;
        }
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("spConfig");
        }
        SharedPreferences sharedPreferences2 = spConfig;
        if (sharedPreferences2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("spConfig");
            sharedPreferences2 = null;
        }
        return sharedPreferences2.getLong(key, defaultValue);
    }

    @Nullable
    public final String getSpString(@NotNull String key) {
        SharedPreferences sharedPreferences;
        Intrinsics.checkNotNullParameter(key, "key");
        if (isKv || (sharedPreferences = spConfig) == null) {
            return "";
        }
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("spConfig");
        }
        SharedPreferences sharedPreferences2 = spConfig;
        if (sharedPreferences2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("spConfig");
            sharedPreferences2 = null;
        }
        return sharedPreferences2.getString(key, "");
    }

    public final void init(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences(String.valueOf(sharePreferenceKey), 4);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…ntext.MODE_MULTI_PROCESS)");
        spConfig = sharedPreferences;
        isKv = false;
    }

    public final boolean isKv() {
        return isKv;
    }

    public final boolean isSupportMMKV$com_heytap_nearx_tangramconfig(@NotNull String spkey) {
        Intrinsics.checkNotNullParameter(spkey, "spkey");
        return true;
    }

    public final void setKv(boolean z) {
        isKv = z;
    }

    public final void updateSpLong(@NotNull String key, long value) {
        SharedPreferences sharedPreferences;
        Intrinsics.checkNotNullParameter(key, "key");
        if (!isKv && (sharedPreferences = spConfig) != null) {
            if (sharedPreferences == null) {
                Intrinsics.throwUninitializedPropertyAccessException("spConfig");
            }
            SharedPreferences sharedPreferences2 = spConfig;
            if (sharedPreferences2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("spConfig");
                sharedPreferences2 = null;
            }
            sharedPreferences2.edit().putLong(key, value).apply();
        }
        LogUtils.d$default(LogUtils.INSTANCE, "updateSpLong", "update sp data. {" + key + " -> " + value + "} ", null, new Object[0], 4, null);
    }

    public final void updateSpString(@NotNull String key, @NotNull String value) {
        SharedPreferences sharedPreferences;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!isKv && (sharedPreferences = spConfig) != null) {
            if (sharedPreferences == null) {
                Intrinsics.throwUninitializedPropertyAccessException("spConfig");
            }
            SharedPreferences sharedPreferences2 = spConfig;
            if (sharedPreferences2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("spConfig");
                sharedPreferences2 = null;
            }
            sharedPreferences2.edit().putString(key, value).apply();
        }
        LogUtils.d$default(LogUtils.INSTANCE, "updateSpStr", "update sp data. {" + key + " -> " + value + "} ", null, new Object[0], 4, null);
    }
}
