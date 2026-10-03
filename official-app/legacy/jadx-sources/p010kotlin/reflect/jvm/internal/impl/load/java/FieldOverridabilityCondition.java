package p010kotlin.reflect.jvm.internal.impl.load.java;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import p010kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p010kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import p010kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.JavaDescriptorUtilKt;
import p010kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;

/* JADX INFO: loaded from: classes11.dex */
public final class FieldOverridabilityCondition implements ExternalOverridabilityCondition {
    @Override // p010kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    @NotNull
    public ExternalOverridabilityCondition.Contract getContract() {
        return ExternalOverridabilityCondition.Contract.BOTH;
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    @NotNull
    public ExternalOverridabilityCondition.Result isOverridable(@NotNull CallableDescriptor superDescriptor, @NotNull CallableDescriptor subDescriptor, @Nullable ClassDescriptor classDescriptor) {
        Intrinsics.checkNotNullParameter(superDescriptor, "superDescriptor");
        Intrinsics.checkNotNullParameter(subDescriptor, "subDescriptor");
        if (!(subDescriptor instanceof PropertyDescriptor) || !(superDescriptor instanceof PropertyDescriptor)) {
            return ExternalOverridabilityCondition.Result.UNKNOWN;
        }
        PropertyDescriptor propertyDescriptor = (PropertyDescriptor) subDescriptor;
        PropertyDescriptor propertyDescriptor2 = (PropertyDescriptor) superDescriptor;
        if (!Intrinsics.areEqual(propertyDescriptor.getName(), propertyDescriptor2.getName())) {
            return ExternalOverridabilityCondition.Result.UNKNOWN;
        }
        if (JavaDescriptorUtilKt.isJavaField(propertyDescriptor) && JavaDescriptorUtilKt.isJavaField(propertyDescriptor2)) {
            return ExternalOverridabilityCondition.Result.OVERRIDABLE;
        }
        return (JavaDescriptorUtilKt.isJavaField(propertyDescriptor) || JavaDescriptorUtilKt.isJavaField(propertyDescriptor2)) ? ExternalOverridabilityCondition.Result.INCOMPATIBLE : ExternalOverridabilityCondition.Result.UNKNOWN;
    }
}
