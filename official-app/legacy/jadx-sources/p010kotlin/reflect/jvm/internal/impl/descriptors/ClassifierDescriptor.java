package p010kotlin.reflect.jvm.internal.impl.descriptors;

import org.jetbrains.annotations.NotNull;
import p010kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p010kotlin.reflect.jvm.internal.impl.types.TypeConstructor;

/* JADX INFO: loaded from: classes11.dex */
public interface ClassifierDescriptor extends DeclarationDescriptorNonRoot {
    @NotNull
    SimpleType getDefaultType();

    @Override // p010kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    ClassifierDescriptor getOriginal();

    @NotNull
    TypeConstructor getTypeConstructor();
}
