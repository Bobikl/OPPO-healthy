package p010kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collection;
import org.jetbrains.annotations.NotNull;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p010kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;

/* JADX INFO: loaded from: classes11.dex */
public final class VisibilityUtilKt {
    @NotNull
    public static final CallableMemberDescriptor findMemberWithMaxVisibility(@NotNull Collection<? extends CallableMemberDescriptor> descriptors) {
        Integer numCompare;
        Intrinsics.checkNotNullParameter(descriptors, "descriptors");
        descriptors.isEmpty();
        CallableMemberDescriptor callableMemberDescriptor = null;
        for (CallableMemberDescriptor callableMemberDescriptor2 : descriptors) {
            if (callableMemberDescriptor == null || ((numCompare = DescriptorVisibilities.compare(callableMemberDescriptor.getVisibility(), callableMemberDescriptor2.getVisibility())) != null && numCompare.intValue() < 0)) {
                callableMemberDescriptor = callableMemberDescriptor2;
            }
        }
        Intrinsics.checkNotNull(callableMemberDescriptor);
        return callableMemberDescriptor;
    }
}
