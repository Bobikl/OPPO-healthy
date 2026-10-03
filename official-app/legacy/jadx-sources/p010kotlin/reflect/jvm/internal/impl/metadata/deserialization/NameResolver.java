package p010kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public interface NameResolver {
    @NotNull
    String getQualifiedClassName(int i);

    @NotNull
    String getString(int i);

    boolean isLocalClassName(int i);
}
