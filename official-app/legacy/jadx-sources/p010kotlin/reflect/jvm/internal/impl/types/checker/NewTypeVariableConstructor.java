package p010kotlin.reflect.jvm.internal.impl.types.checker;

import org.jetbrains.annotations.Nullable;
import p010kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p010kotlin.reflect.jvm.internal.impl.types.TypeConstructor;

/* JADX INFO: loaded from: classes11.dex */
public interface NewTypeVariableConstructor extends TypeConstructor {
    @Nullable
    TypeParameterDescriptor getOriginalTypeParameter();
}
