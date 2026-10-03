package p010kotlin.reflect.jvm.internal.impl.types;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.reflect.KClass;
import p010kotlin.reflect.jvm.internal.impl.types.TypeAttribute;

/* JADX INFO: loaded from: classes11.dex */
public abstract class TypeAttribute<T extends TypeAttribute<T>> {
    @NotNull
    public abstract T add(@Nullable T t);

    @NotNull
    public abstract KClass<? extends T> getKey();

    @Nullable
    public abstract T intersect(@Nullable T t);
}
