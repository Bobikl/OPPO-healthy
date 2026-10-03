package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.exifinterface.media.ExifInterface;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017JC\u0010\f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00018\u00002\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJE\u0010\u0010\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00018\u00002\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0015\u001a\n \u0014*\u0004\u0018\u00010\u00130\u00132\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0005H\u0003¨\u0006\u0018"}, d2 = {"Lcom/oplus/aiunit/vision/x9g;", "", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/content/Context;", "context", "", "key", "value", "preferencesName", "", "sync", "", "d", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Z)V", "default", "isSet", "a", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Z)Ljava/lang/Object;", "name", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "c", "<init>", "()V", "staticmanagersdk_release"}, k = 1, mv = {1, 5, 1})
public final class x9g {

    @NotNull
    public static final x9g INSTANCE = new x9g();

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    @Nullable
    public static final <T> T a(@NotNull Context context, @NotNull String key, @Nullable T t, @NotNull String preferencesName, boolean isSet) {
        T t2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(preferencesName, "preferencesName");
        try {
            SharedPreferences sharedPreferencesC = c(context, preferencesName);
            if (sharedPreferencesC == null) {
                t2 = t;
            } else if (t instanceof Integer) {
                if (t == 0) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                }
                t2 = (T) Integer.valueOf(sharedPreferencesC.getInt(key, ((Integer) t).intValue()));
            } else if (t instanceof Float) {
                if (t == 0) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
                }
                t2 = (T) Float.valueOf(sharedPreferencesC.getFloat(key, ((Float) t).floatValue()));
            } else if (t instanceof Boolean) {
                if (t == 0) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                }
                t2 = (T) Boolean.valueOf(sharedPreferencesC.getBoolean(key, ((Boolean) t).booleanValue()));
            } else if (!(t instanceof Long)) {
                String string = null;
                if (Intrinsics.areEqual(t, Boolean.valueOf(isSet && (t == 0 || (t instanceof Set))))) {
                    t2 = (T) sharedPreferencesC.getStringSet(key, t instanceof Set ? (Set) t : null);
                } else {
                    if (t != 0) {
                        string = t.toString();
                    }
                    t2 = (T) sharedPreferencesC.getString(key, string);
                }
            } else {
                if (t == 0) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
                }
                t2 = (T) Long.valueOf(sharedPreferencesC.getLong(key, ((Long) t).longValue()));
            }
        } catch (Exception e2) {
            f7b.f("SPUtils", "get failed: " + preferencesName + ": [" + key + ", " + t + "], " + ((Object) e2.getMessage()));
        }
        f7b.d("SPUtils", "get: " + preferencesName + ": [" + key + ", " + t2 + ", " + t + ']');
        return t2;
    }

    public static /* synthetic */ Object b(Context context, String str, Object obj, String str2, boolean z, int i, Object obj2) {
        if ((i & 8) != 0) {
            str2 = "SeedlingSdk";
        }
        if ((i & 16) != 0) {
            z = false;
        }
        return a(context, str, obj, str2, z);
    }

    @JvmStatic
    public static final SharedPreferences c(Context context, String name) {
        return context.getSharedPreferences(name, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    public static final <T> void d(@NotNull Context context, @NotNull String key, @Nullable T value, @NotNull String preferencesName, boolean sync) {
        SharedPreferences.Editor editorEdit;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(preferencesName, "preferencesName");
        f7b.d("PreferencesUtils", "put: " + preferencesName + ": [" + key + ", " + value + ']');
        try {
            SharedPreferences sharedPreferencesC = c(context, preferencesName);
            if (sharedPreferencesC != null && (editorEdit = sharedPreferencesC.edit()) != null) {
                if (value instanceof Integer) {
                    editorEdit.putInt(key, ((Number) value).intValue());
                } else if (value instanceof Float) {
                    editorEdit.putFloat(key, ((Number) value).floatValue());
                } else if (value instanceof Boolean) {
                    editorEdit.putBoolean(key, ((Boolean) value).booleanValue());
                } else if (value instanceof Long) {
                    editorEdit.putLong(key, ((Number) value).longValue());
                } else if (!(value instanceof Set)) {
                    editorEdit.putString(key, value == 0 ? null : value.toString());
                } else {
                    if (value == 0) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                    }
                    editorEdit.putStringSet(key, (Set) value);
                }
                if (sync) {
                    editorEdit.commit();
                } else {
                    editorEdit.apply();
                }
            }
        } catch (Exception e2) {
            f7b.f("SPUtils", "put failed: " + preferencesName + ": [" + key + ", " + value + "], " + ((Object) e2.getMessage()));
        }
    }

    public static /* synthetic */ void e(Context context, String str, Object obj, String str2, boolean z, int i, Object obj2) {
        if ((i & 8) != 0) {
            str2 = "SeedlingSdk";
        }
        if ((i & 16) != 0) {
            z = false;
        }
        d(context, str, obj, str2, z);
    }
}
