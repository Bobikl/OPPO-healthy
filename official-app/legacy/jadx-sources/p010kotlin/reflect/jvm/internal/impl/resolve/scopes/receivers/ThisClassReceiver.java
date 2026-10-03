package p010kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import org.jetbrains.annotations.NotNull;
import p010kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;

/* JADX INFO: loaded from: classes11.dex */
public interface ThisClassReceiver extends ReceiverValue {
    @NotNull
    ClassDescriptor getClassDescriptor();
}
