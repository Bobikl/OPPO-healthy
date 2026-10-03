package p010kotlin.reflect.jvm.internal.impl.load.java;

import org.jetbrains.annotations.NotNull;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p010kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationLevelValue;
import p010kotlin.reflect.jvm.internal.impl.resolve.deprecation.DescriptorBasedDeprecationInfo;

/* JADX INFO: loaded from: classes11.dex */
public final class DeprecationCausedByFunctionNInfo extends DescriptorBasedDeprecationInfo {

    @NotNull
    private final DeclarationDescriptor target;

    public DeprecationCausedByFunctionNInfo(@NotNull DeclarationDescriptor target) {
        Intrinsics.checkNotNullParameter(target, "target");
        this.target = target;
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationInfo
    @NotNull
    public DeprecationLevelValue getDeprecationLevel() {
        return DeprecationLevelValue.ERROR;
    }
}
