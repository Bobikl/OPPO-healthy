package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0018\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¨\u0006\u0005"}, d2 = {"Ljava/lang/ClassLoader;", "mHostClassLoader", "", "deltaOfLCAParentClassLoader", "a", "base-plugin-manage_release"}, k = 2, mv = {1, 8, 0})
public final class p6e {
    @NotNull
    public static final ClassLoader a(@NotNull ClassLoader mHostClassLoader, int i) {
        Intrinsics.checkNotNullParameter(mHostClassLoader, "mHostClassLoader");
        bs9.a.c(t6e.INSTANCE, o6e.TAG, "calLCAParentClassLoader,mHostClassLoader = " + mHostClassLoader + ",deltaOfLCAParentClassLoader = " + i, false, null, false, 0, false, null, 252, null);
        ClassLoader parent = mHostClassLoader;
        while (parent != null && i > 0) {
            bs9.a.c(t6e.INSTANCE, o6e.TAG, "calLCAParentClassLoader,curStep = curStep = " + i + ",lcaClassLoader = " + parent, false, null, false, 0, false, null, 252, null);
            parent = parent.getParent();
            i += -1;
        }
        t6e t6eVar = t6e.INSTANCE;
        bs9.a.c(t6eVar, o6e.TAG, "calLCAParentClassLoader,lcaClassLoader = " + parent + ",remainStep = " + i, false, null, false, 0, false, null, 252, null);
        if (parent == null) {
            parent = mHostClassLoader.getParent();
            bs9.a.c(t6eVar, o6e.TAG, "calLCAParentClassLoader,lcaClassLoader is null,wrong step value,use default,lcaClassLoader = " + parent, false, null, false, 0, false, null, 252, null);
        }
        Intrinsics.checkNotNull(parent);
        return parent;
    }
}
