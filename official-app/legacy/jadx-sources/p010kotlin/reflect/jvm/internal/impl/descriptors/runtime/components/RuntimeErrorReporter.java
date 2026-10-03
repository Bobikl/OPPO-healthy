package p010kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p010kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p010kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;

/* JADX INFO: loaded from: classes11.dex */
public final class RuntimeErrorReporter implements ErrorReporter {

    @NotNull
    public static final RuntimeErrorReporter INSTANCE = new RuntimeErrorReporter();

    private RuntimeErrorReporter() {
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter
    public void reportCannotInferVisibility(@NotNull CallableMemberDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        throw new IllegalStateException("Cannot infer visibility for " + descriptor);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter
    public void reportIncompleteHierarchy(@NotNull ClassDescriptor descriptor, @NotNull List<String> unresolvedSuperClasses) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(unresolvedSuperClasses, "unresolvedSuperClasses");
        throw new IllegalStateException("Incomplete hierarchy for class " + descriptor.getName() + ", unresolved classes " + unresolvedSuperClasses);
    }
}
