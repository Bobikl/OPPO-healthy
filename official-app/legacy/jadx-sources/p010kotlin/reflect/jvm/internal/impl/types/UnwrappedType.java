package p010kotlin.reflect.jvm.internal.impl.types;

import org.jetbrains.annotations.NotNull;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* JADX INFO: loaded from: classes11.dex */
public abstract class UnwrappedType extends KotlinType {
    public /* synthetic */ UnwrappedType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public abstract UnwrappedType makeNullableAsSpecified(boolean z);

    @Override // p010kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public abstract UnwrappedType refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner);

    @NotNull
    public abstract UnwrappedType replaceAttributes(@NotNull TypeAttributes typeAttributes);

    @Override // p010kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public final UnwrappedType unwrap() {
        return this;
    }

    private UnwrappedType() {
        super(null);
    }
}
