package p010kotlin.reflect.jvm.internal.impl.types;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import p010kotlin.reflect.jvm.internal.impl.name.FqName;
import p010kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import p010kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import p010kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import p010kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;
import p010kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;

/* JADX INFO: loaded from: classes11.dex */
public interface TypeSystemCommonBackendContext extends TypeSystemContext {
    @Nullable
    FqNameUnsafe getClassFqNameUnsafe(@NotNull TypeConstructorMarker typeConstructorMarker);

    @Nullable
    PrimitiveType getPrimitiveArrayType(@NotNull TypeConstructorMarker typeConstructorMarker);

    @Nullable
    PrimitiveType getPrimitiveType(@NotNull TypeConstructorMarker typeConstructorMarker);

    @NotNull
    KotlinTypeMarker getRepresentativeUpperBound(@NotNull TypeParameterMarker typeParameterMarker);

    @Nullable
    KotlinTypeMarker getUnsubstitutedUnderlyingType(@NotNull KotlinTypeMarker kotlinTypeMarker);

    boolean hasAnnotation(@NotNull KotlinTypeMarker kotlinTypeMarker, @NotNull FqName fqName);

    boolean isInlineClass(@NotNull TypeConstructorMarker typeConstructorMarker);

    boolean isUnderKotlinPackage(@NotNull TypeConstructorMarker typeConstructorMarker);

    @NotNull
    KotlinTypeMarker makeNullable(@NotNull KotlinTypeMarker kotlinTypeMarker);
}
