package p010kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import org.jetbrains.annotations.NotNull;
import p010kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes11.dex */
public interface PackageFragmentProviderOptimized extends PackageFragmentProvider {
    void collectPackageFragments(@NotNull FqName fqName, @NotNull Collection<PackageFragmentDescriptor> collection);

    boolean isEmpty(@NotNull FqName fqName);
}
