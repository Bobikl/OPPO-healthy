package p010kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;
import p010kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p010kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p010kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import p010kotlin.reflect.jvm.internal.impl.types.checker.StrictEqualityTypeChecker;
import p010kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;

/* JADX INFO: loaded from: classes11.dex */
public abstract class KotlinType implements Annotated, KotlinTypeMarker {
    private int cachedHashCode;

    private KotlinType() {
    }

    public /* synthetic */ KotlinType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final int computeHashCode() {
        return KotlinTypeKt.isError(this) ? super.hashCode() : (((getConstructor().hashCode() * 31) + getArguments().hashCode()) * 31) + (isMarkedNullable() ? 1 : 0);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KotlinType)) {
            return false;
        }
        KotlinType kotlinType = (KotlinType) obj;
        return isMarkedNullable() == kotlinType.isMarkedNullable() && StrictEqualityTypeChecker.INSTANCE.strictEqualTypes(unwrap(), kotlinType.unwrap());
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    @NotNull
    public Annotations getAnnotations() {
        return AnnotationsTypeAttributeKt.getAnnotations(getAttributes());
    }

    @NotNull
    public abstract List<TypeProjection> getArguments();

    @NotNull
    public abstract TypeAttributes getAttributes();

    @NotNull
    public abstract TypeConstructor getConstructor();

    @NotNull
    public abstract MemberScope getMemberScope();

    public final int hashCode() {
        int i = this.cachedHashCode;
        if (i != 0) {
            return i;
        }
        int iComputeHashCode = computeHashCode();
        this.cachedHashCode = iComputeHashCode;
        return iComputeHashCode;
    }

    public abstract boolean isMarkedNullable();

    @NotNull
    public abstract KotlinType refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner);

    @NotNull
    public abstract UnwrappedType unwrap();
}
