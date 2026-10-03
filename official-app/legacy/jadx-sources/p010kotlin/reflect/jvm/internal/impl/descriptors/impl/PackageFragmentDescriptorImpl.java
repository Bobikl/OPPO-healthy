package p010kotlin.reflect.jvm.internal.impl.descriptors.impl;

import org.jetbrains.annotations.NotNull;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p010kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import p010kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p010kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import p010kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import p010kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p010kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes11.dex */
public abstract class PackageFragmentDescriptorImpl extends DeclarationDescriptorNonRootImpl implements PackageFragmentDescriptor {

    @NotNull
    private final String debugString;

    @NotNull
    private final FqName fqName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PackageFragmentDescriptorImpl(@NotNull ModuleDescriptor module, @NotNull FqName fqName) {
        super(module, Annotations.Companion.getEMPTY(), fqName.shortNameOrSpecial(), SourceElement.NO_SOURCE);
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        this.fqName = fqName;
        this.debugString = "package " + fqName + " of " + module;
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public <R, D> R accept(@NotNull DeclarationDescriptorVisitor<R, D> visitor, D d) {
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        return visitor.visitPackageFragmentDescriptor(this, d);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor
    @NotNull
    public final FqName getFqName() {
        return this.fqName;
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, p010kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    @NotNull
    public SourceElement getSource() {
        SourceElement NO_SOURCE = SourceElement.NO_SOURCE;
        Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
        return NO_SOURCE;
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl
    @NotNull
    public String toString() {
        return this.debugString;
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, p010kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    public ModuleDescriptor getContainingDeclaration() {
        DeclarationDescriptor containingDeclaration = super.getContainingDeclaration();
        Intrinsics.checkNotNull(containingDeclaration, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ModuleDescriptor");
        return (ModuleDescriptor) containingDeclaration;
    }
}
