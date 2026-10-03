package p010kotlin.reflect.jvm.internal.impl.load.kotlin;

import org.jetbrains.annotations.NotNull;
import p010kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;

/* JADX INFO: loaded from: classes11.dex */
public interface JvmTypeFactory<T> {
    @NotNull
    T boxType(@NotNull T t);

    @NotNull
    T createFromString(@NotNull String str);

    @NotNull
    T createObjectType(@NotNull String str);

    @NotNull
    T createPrimitiveType(@NotNull PrimitiveType primitiveType);

    @NotNull
    T getJavaLangClassType();

    @NotNull
    String toString(@NotNull T t);
}
