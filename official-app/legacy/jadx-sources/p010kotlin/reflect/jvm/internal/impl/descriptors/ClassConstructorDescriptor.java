package p010kotlin.reflect.jvm.internal.impl.descriptors;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* JADX INFO: loaded from: classes11.dex */
public interface ClassConstructorDescriptor extends ConstructorDescriptor {
    @Override // p010kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, p010kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, p010kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor, p010kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    ClassConstructorDescriptor getOriginal();

    @Override // p010kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor, p010kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, p010kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    @Nullable
    ClassConstructorDescriptor substitute(@NotNull TypeSubstitutor typeSubstitutor);
}
