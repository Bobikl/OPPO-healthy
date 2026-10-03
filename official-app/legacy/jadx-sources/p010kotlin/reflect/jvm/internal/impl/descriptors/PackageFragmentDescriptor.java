package p010kotlin.reflect.jvm.internal.impl.descriptors;

import org.jetbrains.annotations.NotNull;
import p010kotlin.reflect.jvm.internal.impl.name.FqName;
import p010kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* JADX INFO: loaded from: classes11.dex */
public interface PackageFragmentDescriptor extends ClassOrPackageFragmentDescriptor {
    @Override // p010kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, p010kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    ModuleDescriptor getContainingDeclaration();

    @NotNull
    FqName getFqName();

    @NotNull
    MemberScope getMemberScope();
}
