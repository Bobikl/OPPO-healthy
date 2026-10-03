package p010kotlin.reflect.jvm.internal.impl.types;

import org.jetbrains.annotations.NotNull;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
final class SimpleTypeWithAttributes extends DelegatingSimpleTypeImpl {

    @NotNull
    private final TypeAttributes attributes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleTypeWithAttributes(@NotNull SimpleType delegate, @NotNull TypeAttributes attributes) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.attributes = attributes;
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType, p010kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public TypeAttributes getAttributes() {
        return this.attributes;
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    @NotNull
    public SimpleTypeWithAttributes replaceDelegate(@NotNull SimpleType delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        return new SimpleTypeWithAttributes(delegate, getAttributes());
    }
}
