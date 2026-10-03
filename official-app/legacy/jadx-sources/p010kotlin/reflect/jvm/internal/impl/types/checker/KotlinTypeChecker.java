package p010kotlin.reflect.jvm.internal.impl.types.checker;

import org.jetbrains.annotations.NotNull;
import p010kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p010kotlin.reflect.jvm.internal.impl.types.TypeConstructor;

/* JADX INFO: loaded from: classes11.dex */
public interface KotlinTypeChecker {
    public static final KotlinTypeChecker DEFAULT = NewKotlinTypeChecker.Companion.getDefault();

    public interface TypeConstructorEquality {
        boolean equals(@NotNull TypeConstructor typeConstructor, @NotNull TypeConstructor typeConstructor2);
    }

    boolean equalTypes(@NotNull KotlinType kotlinType, @NotNull KotlinType kotlinType2);

    boolean isSubtypeOf(@NotNull KotlinType kotlinType, @NotNull KotlinType kotlinType2);
}
