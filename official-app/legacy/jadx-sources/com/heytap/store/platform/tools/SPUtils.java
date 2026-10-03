package com.heytap.store.platform.tools;

import android.content.SharedPreferences;
import androidx.exifinterface.media.ExifInterface;
import com.oplus.deepthinker.sdk.app.aidl.eventfountain.EventType;
import java.lang.reflect.Type;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0011\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004H\u0086\u0002J\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004J\u0016\u0010\r\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u0004J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u0004J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0012J$\u0010\u0013\u001a\n\u0012\u0004\u0012\u0002H\u0015\u0018\u00010\u0014\"\u0004\b\u0000\u0010\u00152\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\u0004J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0019J+\u0010\u001a\u001a\u0004\u0018\u0001H\u0015\"\u0004\b\u0000\u0010\u00152\u0006\u0010\f\u001a\u00020\u00042\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u00150\u001cH\u0007¢\u0006\u0002\u0010\u001dJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u0004J\u001a\u0010\u001e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004J\u0016\u0010\u001f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\nJ\u001e\u0010\u001f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u001f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0010J\u001e\u0010\u001f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u001f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0012J\u001e\u0010\u001f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u001f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0019J\u001e\u0010\u001f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\nJ\u0018\u0010\u001f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u0004J \u0010\u001f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010!\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u0001J\u001e\u0010!\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010#\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0004J\u0016\u0010#\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/heytap/store/platform/tools/SPUtils;", "", "()V", "SP_NAME", "", "sp", "Landroid/content/SharedPreferences;", "clear", "", "isCommit", "", "contains", "key", "getBoolean", "defaultValue", "getFloat", "", "getInt", "", "getListObject", "", ExifInterface.GPS_DIRECTION_TRUE, "listType", "Ljava/lang/reflect/Type;", "getLong", "", "getObject", "clazz", "Ljava/lang/Class;", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "getString", "put", "value", "putObject", "obj", EventType.STATE_PACKAGE_CHANGED_REMOVE, "utils_release"}, k = 1, mv = {1, 4, 0})
public final class SPUtils {
    public static final SPUtils INSTANCE = new SPUtils();
    private static final String SP_NAME = "heytap_store_sp";
    private static SharedPreferences sp;

    static {
        SharedPreferences sharedPreferences = ContextGetterUtils.INSTANCE.getApp().getSharedPreferences(SP_NAME, 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "ContextGetterUtils.getAp…ME, Context.MODE_PRIVATE)");
        sp = sharedPreferences;
    }

    private SPUtils() {
    }

    @JvmStatic
    @Nullable
    public static final <T> T getObject(@NotNull String key, @NotNull Class<T> clazz) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        String string = INSTANCE.getString(key, null);
        if (string != null) {
            return (T) GsonUtils.INSTANCE.fromJson(string, (Class) clazz);
        }
        return null;
    }

    public final void clear() {
        clear(false);
    }

    public final boolean contains(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return sp.contains(key);
    }

    public final boolean getBoolean(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return getBoolean(key, false);
    }

    public final float getFloat(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return getFloat(key, -1.0f);
    }

    public final int getInt(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return getInt(key, -1);
    }

    @Nullable
    public final <T> List<T> getListObject(@NotNull String key, @NotNull Type listType) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(listType, "listType");
        String string = getString(key, null);
        if (string != null) {
            return (List) GsonUtils.INSTANCE.fromJson(string, listType);
        }
        return null;
    }

    public final long getLong(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return getLong(key, -1L);
    }

    @Nullable
    public final String getString(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return getString(key, "");
    }

    public final void put(@NotNull String key, @Nullable String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        put(key, value, false);
    }

    public final void putObject(@NotNull String key, @NotNull Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(obj, "obj");
        put(key, GsonUtils.INSTANCE.toJson(obj), false);
    }

    public final void remove(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        remove(key, false);
    }

    public final void clear(boolean isCommit) {
        if (isCommit) {
            sp.edit().clear().commit();
        } else {
            sp.edit().clear().apply();
        }
    }

    public final boolean getBoolean(@NotNull String key, boolean defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        return sp.getBoolean(key, defaultValue);
    }

    public final float getFloat(@NotNull String key, float defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        return sp.getFloat(key, defaultValue);
    }

    public final int getInt(@NotNull String key, int defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        return sp.getInt(key, defaultValue);
    }

    public final long getLong(@NotNull String key, long defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        return sp.getLong(key, defaultValue);
    }

    @Nullable
    public final String getString(@NotNull String key, @Nullable String defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        return sp.getString(key, defaultValue);
    }

    public final void put(@NotNull String key, @Nullable String value, boolean isCommit) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (isCommit) {
            sp.edit().putString(key, value).commit();
        } else {
            sp.edit().putString(key, value).apply();
        }
    }

    public final void remove(@NotNull String key, boolean isCommit) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (isCommit) {
            sp.edit().remove(key).commit();
        } else {
            sp.edit().remove(key).apply();
        }
    }

    public final void putObject(@NotNull String key, @NotNull Object obj, boolean isCommit) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(obj, "obj");
        put(key, GsonUtils.INSTANCE.toJson(obj), isCommit);
    }

    public final void put(@NotNull String key, int value) {
        Intrinsics.checkNotNullParameter(key, "key");
        put(key, value, false);
    }

    public final void put(@NotNull String key, int value, boolean isCommit) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (isCommit) {
            sp.edit().putInt(key, value).commit();
        } else {
            sp.edit().putInt(key, value).apply();
        }
    }

    public final void put(@NotNull String key, long value) {
        Intrinsics.checkNotNullParameter(key, "key");
        put(key, value, false);
    }

    public final void put(@NotNull String key, long value, boolean isCommit) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (isCommit) {
            sp.edit().putLong(key, value).commit();
        } else {
            sp.edit().putLong(key, value).apply();
        }
    }

    public final void put(@NotNull String key, float value) {
        Intrinsics.checkNotNullParameter(key, "key");
        put(key, value, false);
    }

    public final void put(@NotNull String key, float value, boolean isCommit) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (isCommit) {
            sp.edit().putFloat(key, value).commit();
        } else {
            sp.edit().putFloat(key, value).apply();
        }
    }

    public final void put(@NotNull String key, boolean value) {
        Intrinsics.checkNotNullParameter(key, "key");
        put(key, value, false);
    }

    public final void put(@NotNull String key, boolean value, boolean isCommit) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (isCommit) {
            sp.edit().putBoolean(key, value).commit();
        } else {
            sp.edit().putBoolean(key, value).apply();
        }
    }
}
