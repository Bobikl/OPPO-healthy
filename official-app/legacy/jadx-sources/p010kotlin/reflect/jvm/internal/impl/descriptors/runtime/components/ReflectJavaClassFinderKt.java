package p010kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class ReflectJavaClassFinderKt {
    @Nullable
    public static final Class<?> tryLoadClass(@NotNull ClassLoader classLoader, @NotNull String fqName) {
        Intrinsics.checkNotNullParameter(classLoader, "<this>");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        try {
            return Class.forName(fqName, false, classLoader);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
