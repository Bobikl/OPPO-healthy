package p010kotlin.reflect.jvm.internal.impl.util;

import org.jetbrains.annotations.NotNull;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;

/* JADX INFO: loaded from: classes11.dex */
public interface ModuleVisibilityHelper {

    public static final class EMPTY implements ModuleVisibilityHelper {

        @NotNull
        public static final EMPTY INSTANCE = new EMPTY();

        private EMPTY() {
        }

        @Override // p010kotlin.reflect.jvm.internal.impl.util.ModuleVisibilityHelper
        public boolean isInFriendModule(@NotNull DeclarationDescriptor what, @NotNull DeclarationDescriptor from) {
            Intrinsics.checkNotNullParameter(what, "what");
            Intrinsics.checkNotNullParameter(from, "from");
            return true;
        }
    }

    boolean isInFriendModule(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull DeclarationDescriptor declarationDescriptor2);
}
