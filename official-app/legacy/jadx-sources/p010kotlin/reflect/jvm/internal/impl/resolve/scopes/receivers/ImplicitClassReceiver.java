package p010kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p010kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* JADX INFO: loaded from: classes11.dex */
public class ImplicitClassReceiver implements ImplicitReceiver, ThisClassReceiver {

    @NotNull
    private final ClassDescriptor classDescriptor;

    @NotNull
    private final ClassDescriptor declarationDescriptor;

    @NotNull
    private final ImplicitClassReceiver original;

    public ImplicitClassReceiver(@NotNull ClassDescriptor classDescriptor, @Nullable ImplicitClassReceiver implicitClassReceiver) {
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        this.classDescriptor = classDescriptor;
        this.original = implicitClassReceiver == null ? this : implicitClassReceiver;
        this.declarationDescriptor = classDescriptor;
    }

    public boolean equals(@Nullable Object obj) {
        ClassDescriptor classDescriptor = this.classDescriptor;
        ImplicitClassReceiver implicitClassReceiver = obj instanceof ImplicitClassReceiver ? (ImplicitClassReceiver) obj : null;
        return Intrinsics.areEqual(classDescriptor, implicitClassReceiver != null ? implicitClassReceiver.classDescriptor : null);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ThisClassReceiver
    @NotNull
    public final ClassDescriptor getClassDescriptor() {
        return this.classDescriptor;
    }

    public int hashCode() {
        return this.classDescriptor.hashCode();
    }

    @NotNull
    public String toString() {
        return "Class{" + getType() + '}';
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue
    @NotNull
    public SimpleType getType() {
        SimpleType defaultType = this.classDescriptor.getDefaultType();
        Intrinsics.checkNotNullExpressionValue(defaultType, "classDescriptor.defaultType");
        return defaultType;
    }
}
