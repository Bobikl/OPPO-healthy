package p010kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import p010kotlin.reflect.jvm.internal.impl.name.Name;
import p010kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes11.dex */
public final class ContextReceiver extends AbstractReceiverValue implements ImplicitContextReceiver {

    @Nullable
    private final Name customLabelName;

    @NotNull
    private final CallableDescriptor declarationDescriptor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContextReceiver(@NotNull CallableDescriptor declarationDescriptor, @NotNull KotlinType receiverType, @Nullable Name name, @Nullable ReceiverValue receiverValue) {
        super(receiverType, receiverValue);
        Intrinsics.checkNotNullParameter(declarationDescriptor, "declarationDescriptor");
        Intrinsics.checkNotNullParameter(receiverType, "receiverType");
        this.declarationDescriptor = declarationDescriptor;
        this.customLabelName = name;
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitContextReceiver
    @Nullable
    public Name getCustomLabelName() {
        return this.customLabelName;
    }

    @NotNull
    public CallableDescriptor getDeclarationDescriptor() {
        return this.declarationDescriptor;
    }

    @NotNull
    public String toString() {
        return "Cxt { " + getDeclarationDescriptor() + " }";
    }
}
