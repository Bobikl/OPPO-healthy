package p010kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* JADX INFO: loaded from: classes11.dex */
public interface PropertyDescriptor extends CallableMemberDescriptor, VariableDescriptorWithAccessors {
    @NotNull
    List<PropertyAccessorDescriptor> getAccessors();

    @Nullable
    FieldDescriptor getBackingField();

    @Nullable
    FieldDescriptor getDelegateField();

    @Nullable
    PropertyGetterDescriptor getGetter();

    @Override // p010kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, p010kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor, p010kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    PropertyDescriptor getOriginal();

    @Override // p010kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, p010kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    Collection<? extends PropertyDescriptor> getOverriddenDescriptors();

    @Nullable
    PropertySetterDescriptor getSetter();

    @Override // p010kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    PropertyDescriptor substitute(@NotNull TypeSubstitutor typeSubstitutor);
}
