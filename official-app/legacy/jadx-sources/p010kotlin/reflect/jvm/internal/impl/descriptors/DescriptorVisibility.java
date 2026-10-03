package p010kotlin.reflect.jvm.internal.impl.descriptors;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;

/* JADX INFO: loaded from: classes11.dex */
public abstract class DescriptorVisibility {
    @Nullable
    public final Integer compareTo(@NotNull DescriptorVisibility visibility) {
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        return getDelegate().compareTo(visibility.getDelegate());
    }

    @NotNull
    public abstract Visibility getDelegate();

    @NotNull
    public abstract String getInternalDisplayName();

    public final boolean isPublicAPI() {
        return getDelegate().isPublicAPI();
    }

    public abstract boolean isVisible(@Nullable ReceiverValue receiverValue, @NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, @NotNull DeclarationDescriptor declarationDescriptor, boolean z);

    @NotNull
    public abstract DescriptorVisibility normalize();

    @NotNull
    public final String toString() {
        return getDelegate().toString();
    }
}
