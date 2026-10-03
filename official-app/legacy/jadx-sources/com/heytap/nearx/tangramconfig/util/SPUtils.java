package com.heytap.nearx.tangramconfig.util;

import android.content.Context;
import android.content.SharedPreferences;
import com.heytap.nearx.tangramconfig.BuildConfig;
import org.apache.commons.codec.language.Soundex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bJ\u0018\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u0006J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u0014J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u0016J\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u000bJ\u0016\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u000bJ\u0015\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\u001cJ\u0016\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u0006J\u0016\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u0014J\u0016\u0010 \u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u0016J\u0016\u0010!\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/heytap/nearx/tangramconfig/util/SPUtils;", "", "()V", "context", "Landroid/content/Context;", "isKv", "", "()Z", "setKv", "(Z)V", "sharePreferenceKey", "", "spConfig", "Landroid/content/SharedPreferences;", "clearSpByKey", "", "key", "getSpBoolean", "defaultValue", "getSpInt", "", "getSpLong", "", "getSpString", "init", "spSuffix", "isSupportMMKV", "spkey", "isSupportMMKV$com_heytap_nearx_tangramconfig", "updateSpBoolean", "value", "updateSpInt", "updateSpLong", "updateSpString", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class SPUtils {
    private static Context context;
    private static boolean isKv;
    private static SharedPreferences spConfig;

    @NotNull
    public static final SPUtils INSTANCE = new SPUtils();

    @NotNull
    private static final String sharePreferenceKey = "common";

    private SPUtils() {
    }

    public static /* synthetic */ boolean getSpBoolean$default(SPUtils sPUtils, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return sPUtils.getSpBoolean(str, z);
    }

    public static /* synthetic */ int getSpInt$default(SPUtils sPUtils, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return sPUtils.getSpInt(str, i);
    }

    public static /* synthetic */ long getSpLong$default(SPUtils sPUtils, String str, long j2, int i, Object obj) {
        if ((i & 2) != 0) {
            j2 = 0;
        }
        return sPUtils.getSpLong(str, j2);
    }

    public static /* synthetic */ String getSpString$default(SPUtils sPUtils, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        return sPUtils.getSpString(str, str2);
    }

    public final void clearSpByKey(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        SharedPreferences sharedPreferences = spConfig;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("spConfig");
            sharedPreferences = null;
        }
        sharedPreferences.edit().remove(key).apply();
        LogUtils.d$default(LogUtils.INSTANCE, "clearSpByKey", "update sp data. {" + key + "} ", null, new Object[0], 4, null);
    }

    public final boolean getSpBoolean(@NotNull String key, boolean defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        SharedPreferences sharedPreferences = spConfig;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("spConfig");
            sharedPreferences = null;
        }
        return sharedPreferences.getBoolean(key, defaultValue);
    }

    public final int getSpInt(@NotNull String key, int defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        SharedPreferences sharedPreferences = spConfig;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("spConfig");
            sharedPreferences = null;
        }
        return sharedPreferences.getInt(key, defaultValue);
    }

    public final long getSpLong(@NotNull String key, long defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (isKv) {
            return 0L;
        }
        SharedPreferences sharedPreferences = spConfig;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("spConfig");
            sharedPreferences = null;
        }
        return sharedPreferences.getLong(key, defaultValue);
    }

    @Nullable
    public final String getSpString(@NotNull String key, @NotNull String defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        if (isKv) {
            return "";
        }
        SharedPreferences sharedPreferences = spConfig;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("spConfig");
            sharedPreferences = null;
        }
        return sharedPreferences.getString(key, defaultValue);
    }

    public final void init(@NotNull Context context2, @NotNull String spSuffix) {
        Intrinsics.checkNotNullParameter(context2, "context");
        Intrinsics.checkNotNullParameter(spSuffix, "spSuffix");
        context = context2;
        KitSPUtils.INSTANCE.init(context2);
        SharedPreferences sharedPreferences = context2.getSharedPreferences(sharePreferenceKey + Soundex.SILENT_MARKER + spSuffix, 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…x\", Context.MODE_PRIVATE)");
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

    public final void updateSpBoolean(@NotNull String key, boolean value) {
        Intrinsics.checkNotNullParameter(key, "key");
        SharedPreferences sharedPreferences = spConfig;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("spConfig");
            sharedPreferences = null;
        }
        sharedPreferences.edit().putBoolean(key, value).apply();
        LogUtils.d$default(LogUtils.INSTANCE, "updateSpBoolean", "update sp data. {" + key + " -> " + value + "} ", null, new Object[0], 4, null);
    }

    public final void updateSpInt(@NotNull String key, int value) {
        Intrinsics.checkNotNullParameter(key, "key");
        SharedPreferences sharedPreferences = spConfig;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("spConfig");
            sharedPreferences = null;
        }
        sharedPreferences.edit().putInt(key, value).apply();
        LogUtils.d$default(LogUtils.INSTANCE, "updateSpInt", "update sp data. {" + key + " -> " + value + "} ", null, new Object[0], 4, null);
    }

    public final void updateSpLong(@NotNull String key, long value) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (!isKv) {
            SharedPreferences sharedPreferences = spConfig;
            if (sharedPreferences == null) {
                Intrinsics.throwUninitializedPropertyAccessException("spConfig");
                sharedPreferences = null;
            }
            sharedPreferences.edit().putLong(key, value).apply();
        }
        LogUtils.d$default(LogUtils.INSTANCE, "updateSpLong", "update sp data. {" + key + " -> " + value + "} ", null, new Object[0], 4, null);
    }

    public final void updateSpString(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!isKv) {
            SharedPreferences sharedPreferences = spConfig;
            if (sharedPreferences == null) {
                Intrinsics.throwUninitializedPropertyAccessException("spConfig");
                sharedPreferences = null;
            }
            sharedPreferences.edit().putString(key, value).apply();
        }
        LogUtils.d$default(LogUtils.INSTANCE, "updateSpStr", "update sp data. {" + key + " -> " + value + "} ", null, new Object[0], 4, null);
    }
}
