package p010kotlin.reflect.jvm.internal.impl.descriptors.impl;

import org.jetbrains.annotations.NotNull;
import p010kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import p010kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;

/* JADX INFO: loaded from: classes11.dex */
public interface TypeAliasConstructorDescriptor extends ConstructorDescriptor {
    @NotNull
    ClassConstructorDescriptor getUnderlyingConstructorDescriptor();
}
