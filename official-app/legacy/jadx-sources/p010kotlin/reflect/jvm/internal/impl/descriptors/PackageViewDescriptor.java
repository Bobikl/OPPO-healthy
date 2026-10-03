package p010kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.reflect.jvm.internal.impl.name.FqName;
import p010kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* JADX INFO: loaded from: classes11.dex */
public interface PackageViewDescriptor extends DeclarationDescriptor {
    @NotNull
    FqName getFqName();

    @NotNull
    List<PackageFragmentDescriptor> getFragments();

    @NotNull
    MemberScope getMemberScope();

    @NotNull
    ModuleDescriptor getModule();

    boolean isEmpty();
}
