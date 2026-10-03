package com.heytap.nearx.cloudconfig.device;

import com.heytap.nearx.cloudconfig.util.LogUtils;
import com.oplus.smartenginehelper.ParserTag;
import java.lang.reflect.Method;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.TypeCastException;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0086\u0002J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0086\u0002J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0011J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0007H\u0086\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/heytap/nearx/cloudconfig/device/SystemPropertyReflect;", "", "()V", "sClassSystemProperties", "Ljava/lang/Class;", "findClass", "clazz", "", ParserTag.TAG_GET, "key", "def", "getBoolean", "", "defValue", "getInt", "", "getLong", "", "set", "", "value", "com.heytap.nearx.cloudconfig"}, k = 1, mv = {1, 1, 16})
public final class SystemPropertyReflect {
    public static final SystemPropertyReflect INSTANCE;
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
        Intrinsics.checkParameterIsNotNull(key, "key");
        Class<?> cls = sClassSystemProperties;
        if (cls == null) {
            return null;
        }
        if (cls == null) {
            try {
                Intrinsics.throwNpe();
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
        Method method = cls.getMethod(ParserTag.TAG_GET, String.class);
        Intrinsics.checkExpressionValueIsNotNull(method, "sClassSystemProperties!!…get\", String::class.java)");
        Object objInvoke = method.invoke(null, key);
        if (objInvoke != null) {
            return (String) objInvoke;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
    }

    public final boolean getBoolean(@NotNull String key, boolean defValue) {
        Intrinsics.checkParameterIsNotNull(key, "key");
        Class<?> cls = sClassSystemProperties;
        if (cls == null) {
            return false;
        }
        if (cls == null) {
            try {
                Intrinsics.throwNpe();
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
        Method method = cls.getMethod("getBoolean", String.class, Boolean.TYPE);
        Intrinsics.checkExpressionValueIsNotNull(method, "sClassSystemProperties!!…:class.javaPrimitiveType)");
        Object objInvoke = method.invoke(null, key, Boolean.valueOf(defValue));
        if (objInvoke != null) {
            return ((Boolean) objInvoke).booleanValue();
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Boolean");
    }

    public final int getInt(@NotNull String key, int def) {
        Intrinsics.checkParameterIsNotNull(key, "key");
        Class<?> cls = sClassSystemProperties;
        if (cls == null) {
            return def;
        }
        if (cls == null) {
            try {
                Intrinsics.throwNpe();
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
        Method method = cls.getMethod("getInt", String.class, Integer.TYPE);
        Intrinsics.checkExpressionValueIsNotNull(method, "sClassSystemProperties!!…:class.javaPrimitiveType)");
        Object objInvoke = method.invoke(null, key, Integer.valueOf(def));
        if (objInvoke != null) {
            return ((Integer) objInvoke).intValue();
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
    }

    public final long getLong(@NotNull String key, long def) {
        Intrinsics.checkParameterIsNotNull(key, "key");
        Class<?> cls = sClassSystemProperties;
        if (cls == null) {
            return def;
        }
        if (cls == null) {
            try {
                Intrinsics.throwNpe();
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
        Method method = cls.getMethod("getLong", String.class, Long.TYPE);
        Intrinsics.checkExpressionValueIsNotNull(method, "sClassSystemProperties!!…:class.javaPrimitiveType)");
        Object objInvoke = method.invoke(null, key, Long.valueOf(def));
        if (objInvoke != null) {
            return ((Long) objInvoke).longValue();
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Long");
    }

    public final void set(@NotNull String key, @NotNull String value) {
        Intrinsics.checkParameterIsNotNull(key, "key");
        Intrinsics.checkParameterIsNotNull(value, "value");
        Class<?> cls = sClassSystemProperties;
        if (cls == null) {
            return;
        }
        if (cls == null) {
            try {
                Intrinsics.throwNpe();
            } catch (Throwable th) {
                LogUtils logUtils = LogUtils.INSTANCE;
                String message = th.getMessage();
                if (message == null) {
                    message = "setError";
                }
                logUtils.w("SystemPropertyReflect", message, th, new Object[0]);
                return;
            }
        }
        Method method = cls.getMethod("set", String.class, String.class);
        Intrinsics.checkExpressionValueIsNotNull(method, "sClassSystemProperties!!…java, String::class.java)");
        method.invoke(null, key, value);
    }

    @NotNull
    public final String get(@NotNull String key, @NotNull String def) {
        Intrinsics.checkParameterIsNotNull(key, "key");
        Intrinsics.checkParameterIsNotNull(def, "def");
        Class<?> cls = sClassSystemProperties;
        if (cls == null) {
            return def;
        }
        if (cls == null) {
            try {
                Intrinsics.throwNpe();
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
        Method method = cls.getMethod(ParserTag.TAG_GET, String.class, String.class);
        Intrinsics.checkExpressionValueIsNotNull(method, "sClassSystemProperties!!…java, String::class.java)");
        Object objInvoke = method.invoke(null, key, def);
        if (objInvoke != null) {
            return (String) objInvoke;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
    }
}
