package p010kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import p010kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* JADX INFO: loaded from: classes11.dex */
public final class NonEmptyDeserializedAnnotations extends DeserializedAnnotations {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NonEmptyDeserializedAnnotations(@NotNull StorageManager storageManager, @NotNull Function0<? extends List<? extends AnnotationDescriptor>> compute) {
        super(storageManager, compute);
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(compute, "compute");
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedAnnotations, p010kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean isEmpty() {
        return false;
    }
}
