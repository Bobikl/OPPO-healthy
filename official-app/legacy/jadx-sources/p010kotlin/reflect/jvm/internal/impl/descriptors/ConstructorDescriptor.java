package p010kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p010kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* JADX INFO: loaded from: classes11.dex */
public interface ConstructorDescriptor extends FunctionDescriptor {
    @NotNull
    ClassDescriptor getConstructedClass();

    @Override // p010kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, p010kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, p010kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    ClassifierDescriptorWithTypeParameters getContainingDeclaration();

    @Override // p010kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    KotlinType getReturnType();

    @Override // p010kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    List<TypeParameterDescriptor> getTypeParameters();

    boolean isPrimary();

    @Override // p010kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, p010kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    @Nullable
    ConstructorDescriptor substitute(@NotNull TypeSubstitutor typeSubstitutor);
}
