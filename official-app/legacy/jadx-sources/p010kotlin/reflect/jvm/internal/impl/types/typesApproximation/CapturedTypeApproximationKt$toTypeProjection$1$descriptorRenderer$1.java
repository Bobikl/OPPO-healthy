package p010kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Lambda;
import p010kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy;
import p010kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions;

/* JADX INFO: loaded from: classes11.dex */
public final class CapturedTypeApproximationKt$toTypeProjection$1$descriptorRenderer$1 extends Lambda implements Function1<DescriptorRendererOptions, Unit> {
    public static final CapturedTypeApproximationKt$toTypeProjection$1$descriptorRenderer$1 INSTANCE = new CapturedTypeApproximationKt$toTypeProjection$1$descriptorRenderer$1();

    public CapturedTypeApproximationKt$toTypeProjection$1$descriptorRenderer$1() {
        super(1);
    }

    @Override // p010kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(DescriptorRendererOptions descriptorRendererOptions) {
        invoke2(descriptorRendererOptions);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull DescriptorRendererOptions withOptions) {
        Intrinsics.checkNotNullParameter(withOptions, "$this$withOptions");
        withOptions.setClassifierNamePolicy(ClassifierNamePolicy.FULLY_QUALIFIED.INSTANCE);
    }
}
