package p010kotlin.reflect.jvm.internal.impl.load.java.lazy;

import org.jetbrains.annotations.NotNull;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p010kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner;

/* JADX INFO: loaded from: classes11.dex */
public final class LazyJavaAnnotationsKt {
    @NotNull
    public static final Annotations resolveAnnotations(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull JavaAnnotationOwner annotationsOwner) {
        Intrinsics.checkNotNullParameter(lazyJavaResolverContext, "<this>");
        Intrinsics.checkNotNullParameter(annotationsOwner, "annotationsOwner");
        return new LazyJavaAnnotations(lazyJavaResolverContext, annotationsOwner, false, 4, null);
    }
}
