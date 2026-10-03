package p010kotlin.reflect.jvm.internal.impl.load.kotlin;

import org.jetbrains.annotations.NotNull;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;

/* JADX INFO: loaded from: classes11.dex */
public final class MethodSignatureBuildingUtilsKt {
    @NotNull
    public static final String signature(@NotNull SignatureBuildingComponents signatureBuildingComponents, @NotNull ClassDescriptor classDescriptor, @NotNull String jvmDescriptor) {
        Intrinsics.checkNotNullParameter(signatureBuildingComponents, "<this>");
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        Intrinsics.checkNotNullParameter(jvmDescriptor, "jvmDescriptor");
        return signatureBuildingComponents.signature(MethodSignatureMappingKt.getInternalName(classDescriptor), jvmDescriptor);
    }
}
