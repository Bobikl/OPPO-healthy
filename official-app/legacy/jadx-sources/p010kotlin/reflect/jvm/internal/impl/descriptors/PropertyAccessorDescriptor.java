package p010kotlin.reflect.jvm.internal.impl.descriptors;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public interface PropertyAccessorDescriptor extends VariableAccessorDescriptor {
    @NotNull
    PropertyDescriptor getCorrespondingProperty();

    boolean isDefault();
}
