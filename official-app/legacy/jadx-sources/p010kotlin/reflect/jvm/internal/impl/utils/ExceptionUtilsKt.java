package p010kotlin.reflect.jvm.internal.impl.utils;

import org.jetbrains.annotations.NotNull;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class ExceptionUtilsKt {
    public static final boolean isProcessCanceledException(@NotNull Throwable th) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        Class<?> superclass = th.getClass();
        while (!Intrinsics.areEqual(superclass.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static final RuntimeException rethrow(@NotNull Throwable e2) throws Throwable {
        Intrinsics.checkNotNullParameter(e2, "e");
        throw e2;
    }
}
