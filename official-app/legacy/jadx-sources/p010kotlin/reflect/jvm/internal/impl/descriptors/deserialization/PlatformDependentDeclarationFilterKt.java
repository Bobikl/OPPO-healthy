package p010kotlin.reflect.jvm.internal.impl.descriptors.deserialization;

import org.jetbrains.annotations.NotNull;
import p010kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes11.dex */
public final class PlatformDependentDeclarationFilterKt {

    @NotNull
    private static final FqName PLATFORM_DEPENDENT_ANNOTATION_FQ_NAME = new FqName("kotlin.internal.PlatformDependent");

    @NotNull
    public static final FqName getPLATFORM_DEPENDENT_ANNOTATION_FQ_NAME() {
        return PLATFORM_DEPENDENT_ANNOTATION_FQ_NAME;
    }
}
