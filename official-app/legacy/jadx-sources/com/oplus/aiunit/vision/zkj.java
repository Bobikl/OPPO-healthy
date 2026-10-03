package com.oplus.aiunit.vision;

import com.oplus.smartenginehelper.ParserTag;
import java.lang.reflect.Method;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.TypeCastException;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0086\u0002J\u0016\u0010\b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0002R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/oplus/aiunit/vision/zkj;", "", "", "key", "def", "b", "clazz", "Ljava/lang/Class;", "a", "Ljava/lang/String;", "TAG", "Ljava/lang/Class;", "sClassSystemProperties", "<init>", "()V", "com.oplus.nearx.cloudconfig"}, k = 1, mv = {1, 4, 0})
public final class zkj {
    public static final zkj INSTANCE;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final String TAG;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static Class<?> sClassSystemProperties;

    static {
        zkj zkjVar = new zkj();
        INSTANCE = zkjVar;
        TAG = "SystemPropertyReflect";
        sClassSystemProperties = zkjVar.a("android.os.SystemProperties");
    }

    public final Class<?> a(String clazz) {
        try {
            return Class.forName(clazz);
        } catch (ClassNotFoundException e2) {
            d7b d7bVar = d7b.INSTANCE;
            String str = TAG;
            String message = e2.getMessage();
            if (message == null) {
                message = "findClassError";
            }
            d7bVar.d(str, message, e2, new Object[0]);
            return null;
        }
    }

    @NotNull
    public final String b(@NotNull String key, @NotNull String def) {
        Method method;
        Intrinsics.checkParameterIsNotNull(key, "key");
        Intrinsics.checkParameterIsNotNull(def, "def");
        Class<?> cls = sClassSystemProperties;
        if (cls == null) {
            return def;
        }
        if (cls != null) {
            try {
                method = cls.getMethod(ParserTag.TAG_GET, String.class, String.class);
            } catch (Throwable th) {
                d7b d7bVar = d7b.INSTANCE;
                String str = TAG;
                String message = th.getMessage();
                if (message == null) {
                    message = "SystemProperties_getError";
                }
                d7bVar.d(str, message, th, new Object[0]);
                return def;
            }
        } else {
            method = null;
        }
        Object objInvoke = method != null ? method.invoke(null, key, def) : null;
        if (objInvoke != null) {
            return (String) objInvoke;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
    }
}
