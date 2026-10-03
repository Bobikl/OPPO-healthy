package p010kotlin.reflect.jvm.internal.impl.descriptors;

import org.jetbrains.annotations.NotNull;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public abstract class DelegatedDescriptorVisibility extends DescriptorVisibility {

    @NotNull
    private final Visibility delegate;

    public DelegatedDescriptorVisibility(@NotNull Visibility delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
    @NotNull
    public Visibility getDelegate() {
        return this.delegate;
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
    @NotNull
    public String getInternalDisplayName() {
        return getDelegate().getInternalDisplayName();
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
    @NotNull
    public DescriptorVisibility normalize() {
        DescriptorVisibility descriptorVisibility = DescriptorVisibilities.toDescriptorVisibility(getDelegate().normalize());
        Intrinsics.checkNotNullExpressionValue(descriptorVisibility, "toDescriptorVisibility(delegate.normalize())");
        return descriptorVisibility;
    }
}
