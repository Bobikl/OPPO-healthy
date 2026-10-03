package com.oplus.aiunit.vision;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0018\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¨\u0006\u0005"}, d2 = {"Ljava/lang/ClassLoader;", "mHostClassLoader", "", "deltaOfLCAParentClassLoader", "a", "base-plugin-manage_release"}, k = 2, mv = {1, 8, 0})
public final class o8e {
    @NotNull
    public static final ClassLoader a(@NotNull ClassLoader classLoader, int i) {
        Intrinsics.checkNotNullParameter(classLoader, "mHostClassLoader");
        ht9.a.c(s8e.INSTANCE, n8e.TAG, "calLCAParentClassLoader,mHostClassLoader = " + classLoader + ",deltaOfLCAParentClassLoader = " + i, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        ClassLoader parent = classLoader;
        while (parent != null && i > 0) {
            ht9.a.c(s8e.INSTANCE, n8e.TAG, "calLCAParentClassLoader,curStep = curStep = " + i + ",lcaClassLoader = " + parent, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            parent = parent.getParent();
            i += -1;
        }
        s8e s8eVar = s8e.INSTANCE;
        ht9.a.c(s8eVar, n8e.TAG, "calLCAParentClassLoader,lcaClassLoader = " + parent + ",remainStep = " + i, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        if (parent == null) {
            parent = classLoader.getParent();
            ht9.a.c(s8eVar, n8e.TAG, "calLCAParentClassLoader,lcaClassLoader is null,wrong step value,use default,lcaClassLoader = " + parent, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        }
        Intrinsics.checkNotNull(parent);
        return parent;
    }
}
