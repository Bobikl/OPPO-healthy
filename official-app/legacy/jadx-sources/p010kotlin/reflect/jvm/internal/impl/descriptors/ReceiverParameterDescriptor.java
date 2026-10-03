package p010kotlin.reflect.jvm.internal.impl.descriptors;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;
import p010kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* JADX INFO: loaded from: classes11.dex */
public interface ReceiverParameterDescriptor extends ParameterDescriptor {
    @NotNull
    ReceiverValue getValue();

    @Override // p010kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    @Nullable
    ReceiverParameterDescriptor substitute(@NotNull TypeSubstitutor typeSubstitutor);
}
