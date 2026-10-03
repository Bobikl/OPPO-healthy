package p010kotlin.reflect.jvm.internal.impl.descriptors.impl;

import org.jetbrains.annotations.NotNull;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.reflect.jvm.internal.impl.descriptors.FieldDescriptor;
import p010kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import p010kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotatedImpl;
import p010kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;

/* JADX INFO: loaded from: classes11.dex */
public final class FieldDescriptorImpl extends AnnotatedImpl implements FieldDescriptor {

    @NotNull
    private final PropertyDescriptor correspondingProperty;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FieldDescriptorImpl(@NotNull Annotations annotations, @NotNull PropertyDescriptor correspondingProperty) {
        super(annotations);
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(correspondingProperty, "correspondingProperty");
        this.correspondingProperty = correspondingProperty;
    }
}
