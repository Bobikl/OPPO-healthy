package com.heytap.nearx.tangramconfig.device;

import com.heytap.nearx.tangramconfig.BuildConfig;
import com.heytap.nearx.tangramconfig.util.LogUtils;
import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0086\u0002J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0086\u0002J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0011J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0007H\u0086\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/heytap/nearx/tangramconfig/device/SystemPropertyReflect;", "", "()V", "sClassSystemProperties", "Ljava/lang/Class;", "findClass", "clazz", "", ParserTag.TAG_GET, "key", "def", "getBoolean", "", "defValue", "getInt", "", "getLong", "", "set", "", "value", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class SystemPropertyReflect {

    @NotNull
    public static final SystemPropertyReflect INSTANCE;

    @Nullable
    private static Class<?> sClassSystemProperties;

    static {
        SystemPropertyReflect systemPropertyReflect = new SystemPropertyReflect();
        INSTANCE = systemPropertyReflect;
        sClassSystemProperties = systemPropertyReflect.findClass("android.os.SystemProperties");
    }

    private SystemPropertyReflect() {
    }

    private final Class<?> findClass(String clazz) {
        try {
            return Class.forName(clazz);
        } catch (ClassNotFoundException e2) {
            LogUtils logUtils = LogUtils.INSTANCE;
            String message = e2.getMessage();
            if (message == null) {
                message = "findClassError";
            }
            logUtils.w("SystemPropertyReflect", message, e2, new Object[0]);
            return null;
        }
    }

    @Nullable
    public final String get(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Class<?> cls = sClassSystemProperties;
        if (cls == null) {
            return null;
        }
        try {
            Intrinsics.checkNotNull(cls);
            Object objInvoke = cls.getMethod(ParserTag.TAG_GET, String.class).invoke(null, key);
            Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.String");
            return (String) objInvoke;
        } catch (Throwable th) {
            LogUtils logUtils = LogUtils.INSTANCE;
            String message = th.getMessage();
            if (message == null) {
                message = "getError";
            }
            logUtils.w("SystemPropertyReflect", message, th, new Object[0]);
            return null;
        }
    }

    public final boolean getBoolean(@NotNull String key, boolean defValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Class<?> cls = sClassSystemProperties;
        if (cls == null) {
            return false;
        }
        try {
            Intrinsics.checkNotNull(cls);
            Object objInvoke = cls.getMethod("getBoolean", String.class, Boolean.TYPE).invoke(null, key, Boolean.valueOf(defValue));
            Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
            return ((Boolean) objInvoke).booleanValue();
        } catch (Throwable th) {
            LogUtils logUtils = LogUtils.INSTANCE;
            String message = th.getMessage();
            if (message == null) {
                message = "getBooleanError";
            }
            logUtils.w("SystemPropertyReflect", message, th, new Object[0]);
            return false;
        }
    }

    public final int getInt(@NotNull String key, int def) {
        Intrinsics.checkNotNullParameter(key, "key");
        Class<?> cls = sClassSystemProperties;
        if (cls == null) {
            return def;
        }
        try {
            Intrinsics.checkNotNull(cls);
            Object objInvoke = cls.getMethod("getInt", String.class, Integer.TYPE).invoke(null, key, Integer.valueOf(def));
            Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.Int");
            return ((Integer) objInvoke).intValue();
        } catch (Throwable th) {
            LogUtils logUtils = LogUtils.INSTANCE;
            String message = th.getMessage();
            if (message == null) {
                message = "getIntError";
            }
            logUtils.w("SystemPropertyReflect", message, th, new Object[0]);
            return def;
        }
    }

    public final long getLong(@NotNull String key, long def) {
        Intrinsics.checkNotNullParameter(key, "key");
        Class<?> cls = sClassSystemProperties;
        if (cls == null) {
            return def;
        }
        try {
            Intrinsics.checkNotNull(cls);
            Object objInvoke = cls.getMethod("getLong", String.class, Long.TYPE).invoke(null, key, Long.valueOf(def));
            Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.Long");
            return ((Long) objInvoke).longValue();
        } catch (Throwable th) {
            LogUtils logUtils = LogUtils.INSTANCE;
            String message = th.getMessage();
            if (message == null) {
                message = "getLongError";
            }
            logUtils.w("SystemPropertyReflect", message, th, new Object[0]);
            return def;
        }
    }

    public final void set(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Class<?> cls = sClassSystemProperties;
        if (cls == null) {
            return;
        }
        try {
            Intrinsics.checkNotNull(cls);
            cls.getMethod("set", String.class, String.class).invoke(null, key, value);
        } catch (Throwable th) {
            LogUtils logUtils = LogUtils.INSTANCE;
            String message = th.getMessage();
            if (message == null) {
                message = "setError";
            }
            logUtils.w("SystemPropertyReflect", message, th, new Object[0]);
        }
    }

    @NotNull
    public final String get(@NotNull String key, @NotNull String def) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(def, "def");
        Class<?> cls = sClassSystemProperties;
        if (cls == null) {
            return def;
        }
        try {
            Intrinsics.checkNotNull(cls);
            Object objInvoke = cls.getMethod(ParserTag.TAG_GET, String.class, String.class).invoke(null, key, def);
            Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.String");
            return (String) objInvoke;
        } catch (Throwable th) {
            LogUtils logUtils = LogUtils.INSTANCE;
            String message = th.getMessage();
            if (message == null) {
                message = "getError";
            }
            logUtils.w("SystemPropertyReflect", message, th, new Object[0]);
            return def;
        }
    }
}
