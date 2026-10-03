package p010kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import java.lang.annotation.Annotation;
import org.jetbrains.annotations.NotNull;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import p010kotlin.reflect.jvm.internal.impl.descriptors.SourceFile;

/* JADX INFO: loaded from: classes11.dex */
public final class ReflectAnnotationSource implements SourceElement {

    @NotNull
    private final Annotation annotation;

    public ReflectAnnotationSource(@NotNull Annotation annotation) {
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        this.annotation = annotation;
    }

    @NotNull
    public final Annotation getAnnotation() {
        return this.annotation;
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.descriptors.SourceElement
    @NotNull
    public SourceFile getContainingFile() {
        SourceFile NO_SOURCE_FILE = SourceFile.NO_SOURCE_FILE;
        Intrinsics.checkNotNullExpressionValue(NO_SOURCE_FILE, "NO_SOURCE_FILE");
        return NO_SOURCE_FILE;
    }
}
