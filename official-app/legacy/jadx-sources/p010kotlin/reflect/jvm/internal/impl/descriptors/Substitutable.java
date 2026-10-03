package p010kotlin.reflect.jvm.internal.impl.descriptors;

import org.jetbrains.annotations.NotNull;
import p010kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot;
import p010kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* JADX INFO: loaded from: classes11.dex */
public interface Substitutable<T extends DeclarationDescriptorNonRoot> {
    @NotNull
    T substitute(@NotNull TypeSubstitutor typeSubstitutor);
}
