package p010kotlin.reflect.jvm.internal.impl.descriptors;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Unit;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class InvalidModuleExceptionKt {

    @NotNull
    private static final ModuleCapability<InvalidModuleNotifier> INVALID_MODULE_NOTIFIER_CAPABILITY = new ModuleCapability<>("InvalidModuleNotifier");

    public static final void moduleInvalidated(@NotNull ModuleDescriptor moduleDescriptor) {
        Unit unit;
        Intrinsics.checkNotNullParameter(moduleDescriptor, "<this>");
        InvalidModuleNotifier invalidModuleNotifier = (InvalidModuleNotifier) moduleDescriptor.getCapability(INVALID_MODULE_NOTIFIER_CAPABILITY);
        if (invalidModuleNotifier != null) {
            invalidModuleNotifier.notifyModuleInvalidated(moduleDescriptor);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit != null) {
            return;
        }
        throw new InvalidModuleException("Accessing invalid module descriptor " + moduleDescriptor);
    }
}
