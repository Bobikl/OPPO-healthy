package p010kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collection;
import org.jetbrains.annotations.NotNull;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* JADX INFO: loaded from: classes11.dex */
public abstract class OverridingStrategy {
    public abstract void addFakeOverride(@NotNull CallableMemberDescriptor callableMemberDescriptor);

    public abstract void inheritanceConflict(@NotNull CallableMemberDescriptor callableMemberDescriptor, @NotNull CallableMemberDescriptor callableMemberDescriptor2);

    public abstract void overrideConflict(@NotNull CallableMemberDescriptor callableMemberDescriptor, @NotNull CallableMemberDescriptor callableMemberDescriptor2);

    public void setOverriddenDescriptors(@NotNull CallableMemberDescriptor member, @NotNull Collection<? extends CallableMemberDescriptor> overridden) {
        Intrinsics.checkNotNullParameter(member, "member");
        Intrinsics.checkNotNullParameter(overridden, "overridden");
        member.setOverriddenDescriptors(overridden);
    }
}
