package p010kotlin.reflect.jvm.internal.impl.types;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Reflection;
import p010kotlin.reflect.KClass;
import p010kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p010kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationsKt;

/* JADX INFO: loaded from: classes11.dex */
public final class AnnotationsTypeAttribute extends TypeAttribute<AnnotationsTypeAttribute> {

    @NotNull
    private final Annotations annotations;

    public AnnotationsTypeAttribute(@NotNull Annotations annotations) {
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        this.annotations = annotations;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof AnnotationsTypeAttribute) {
            return Intrinsics.areEqual(((AnnotationsTypeAttribute) obj).annotations, this.annotations);
        }
        return false;
    }

    @NotNull
    public final Annotations getAnnotations() {
        return this.annotations;
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.TypeAttribute
    @NotNull
    public KClass<? extends AnnotationsTypeAttribute> getKey() {
        return Reflection.getOrCreateKotlinClass(AnnotationsTypeAttribute.class);
    }

    public int hashCode() {
        return this.annotations.hashCode();
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.TypeAttribute
    @NotNull
    public AnnotationsTypeAttribute add(@Nullable AnnotationsTypeAttribute annotationsTypeAttribute) {
        return annotationsTypeAttribute == null ? this : new AnnotationsTypeAttribute(AnnotationsKt.composeAnnotations(this.annotations, annotationsTypeAttribute.annotations));
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.TypeAttribute
    @Nullable
    public AnnotationsTypeAttribute intersect(@Nullable AnnotationsTypeAttribute annotationsTypeAttribute) {
        if (Intrinsics.areEqual(annotationsTypeAttribute, this)) {
            return this;
        }
        return null;
    }
}
