package p010kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.reflect.jvm.internal.impl.name.Name;
import p010kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes11.dex */
public interface ValueParameterDescriptor extends ParameterDescriptor, VariableDescriptor {

    public static final class DefaultImpls {
        public static boolean isLateInit(@NotNull ValueParameterDescriptor valueParameterDescriptor) {
            return false;
        }
    }

    @NotNull
    ValueParameterDescriptor copy(@NotNull CallableDescriptor callableDescriptor, @NotNull Name name, int i);

    boolean declaresDefaultValue();

    @Override // p010kotlin.reflect.jvm.internal.impl.descriptors.ValueDescriptor, p010kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, p010kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    CallableDescriptor getContainingDeclaration();

    int getIndex();

    @Override // p010kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor, p010kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    ValueParameterDescriptor getOriginal();

    @Override // p010kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    Collection<ValueParameterDescriptor> getOverriddenDescriptors();

    @Nullable
    KotlinType getVarargElementType();

    boolean isCrossinline();

    boolean isNoinline();
}
