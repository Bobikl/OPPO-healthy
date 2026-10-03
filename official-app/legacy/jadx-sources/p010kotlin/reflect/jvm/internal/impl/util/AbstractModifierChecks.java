package p010kotlin.reflect.jvm.internal.impl.util;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;

/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractModifierChecks {
    @NotNull
    public final CheckResult check(@NotNull FunctionDescriptor functionDescriptor) {
        Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
        for (Checks checks : getChecks$descriptors()) {
            if (checks.isApplicable(functionDescriptor)) {
                return checks.checkAll(functionDescriptor);
            }
        }
        return CheckResult.IllegalFunctionName.INSTANCE;
    }

    @NotNull
    public abstract List<Checks> getChecks$descriptors();
}
