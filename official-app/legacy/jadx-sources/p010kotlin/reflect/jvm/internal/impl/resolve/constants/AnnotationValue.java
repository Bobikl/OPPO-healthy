package p010kotlin.reflect.jvm.internal.impl.resolve.constants;

import org.jetbrains.annotations.NotNull;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p010kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import p010kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes11.dex */
public final class AnnotationValue extends ConstantValue<AnnotationDescriptor> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnnotationValue(@NotNull AnnotationDescriptor value) {
        super(value);
        Intrinsics.checkNotNullParameter(value, "value");
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    @NotNull
    public KotlinType getType(@NotNull ModuleDescriptor module) {
        Intrinsics.checkNotNullParameter(module, "module");
        return getValue().getType();
    }
}
