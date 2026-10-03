package p010kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p010kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import p010kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;

/* JADX INFO: loaded from: classes11.dex */
public abstract class DelegatingSimpleType extends SimpleType {
    @Override // p010kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public List<TypeProjection> getArguments() {
        return getDelegate().getArguments();
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public TypeAttributes getAttributes() {
        return getDelegate().getAttributes();
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public TypeConstructor getConstructor() {
        return getDelegate().getConstructor();
    }

    @NotNull
    public abstract SimpleType getDelegate();

    @Override // p010kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public MemberScope getMemberScope() {
        return getDelegate().getMemberScope();
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean isMarkedNullable() {
        return getDelegate().isMarkedNullable();
    }

    @NotNull
    public abstract DelegatingSimpleType replaceDelegate(@NotNull SimpleType simpleType);

    @Override // p010kotlin.reflect.jvm.internal.impl.types.UnwrappedType, p010kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public SimpleType refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        KotlinType kotlinTypeRefineType = kotlinTypeRefiner.refineType((KotlinTypeMarker) getDelegate());
        Intrinsics.checkNotNull(kotlinTypeRefineType, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return replaceDelegate((SimpleType) kotlinTypeRefineType);
    }
}
