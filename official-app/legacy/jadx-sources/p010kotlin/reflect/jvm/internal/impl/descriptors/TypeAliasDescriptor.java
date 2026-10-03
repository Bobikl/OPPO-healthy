package p010kotlin.reflect.jvm.internal.impl.descriptors;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* JADX INFO: loaded from: classes11.dex */
public interface TypeAliasDescriptor extends ClassifierDescriptorWithTypeParameters {
    @Nullable
    ClassDescriptor getClassDescriptor();

    @NotNull
    SimpleType getExpandedType();

    @NotNull
    SimpleType getUnderlyingType();
}
