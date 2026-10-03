package com.oplus.aiunit.vision;

import android.util.Log;
import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0086\u0002J\u0016\u0010\b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0002R\u001c\u0010\n\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/oplus/aiunit/vision/wkj;", "", "", "key", "def", "b", "clazz", "Ljava/lang/Class;", "a", "Ljava/lang/Class;", "sClassSystemProperties", "<init>", "()V", "obus-sdk_release"}, k = 1, mv = {1, 7, 1})
public final class wkj {

    @NotNull
    public static final wkj INSTANCE;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public static Class<?> sClassSystemProperties;

    static {
        wkj wkjVar = new wkj();
        INSTANCE = wkjVar;
        sClassSystemProperties = wkjVar.a("android.os.SystemProperties");
    }

    public final Class<?> a(String clazz) {
        try {
            return Class.forName(clazz);
        } catch (ClassNotFoundException e2) {
            String message = e2.getMessage();
            if (message == null) {
                message = "findClassError";
            }
            Log.e("SystemProperty", message);
            return null;
        }
    }

    @NotNull
    public final String b(@NotNull String key, @NotNull String def) {
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
            String message = th.getMessage();
            if (message == null) {
                message = "getError";
            }
            Log.e("SystemProperty", message);
            return def;
        }
    }
}
