package com.oplus.aiunit.vision;

import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0086\u0002J\u0016\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002R\u001a\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/oplus/aiunit/vision/vkj;", "", "", "key", "b", "clazz", "Ljava/lang/Class;", "a", "Ljava/lang/Class;", "CLASS_SYSTEM_PROPERTIES", "<init>", "()V", "speechEngine_release"}, k = 1, mv = {1, 5, 1})
public final class vkj {

    @NotNull
    public static final vkj INSTANCE;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public static final Class<?> CLASS_SYSTEM_PROPERTIES;

    static {
        vkj vkjVar = new vkj();
        INSTANCE = vkjVar;
        CLASS_SYSTEM_PROPERTIES = vkjVar.a("android.os.SystemProperties");
    }

    public final Class<?> a(String clazz) {
        try {
            return Class.forName(clazz);
        } catch (ClassNotFoundException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Nullable
    public final String b(@Nullable String key) {
        Class<?> cls = CLASS_SYSTEM_PROPERTIES;
        if (cls == null) {
            return null;
        }
        try {
            Object objInvoke = cls.getMethod(ParserTag.TAG_GET, String.class).invoke(null, key);
            if (objInvoke != null) {
                return (String) objInvoke;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (Throwable unused) {
            return null;
        }
    }
}
