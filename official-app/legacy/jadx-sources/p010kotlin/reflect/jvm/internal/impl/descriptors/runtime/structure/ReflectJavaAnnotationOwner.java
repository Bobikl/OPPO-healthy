package p010kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.AnnotatedElement;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner;
import p010kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes11.dex */
public interface ReflectJavaAnnotationOwner extends JavaAnnotationOwner {
    @Override // p010kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    @Nullable
    ReflectJavaAnnotation findAnnotation(@NotNull FqName fqName);

    @Override // p010kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    @NotNull
    List<ReflectJavaAnnotation> getAnnotations();

    @Nullable
    AnnotatedElement getElement();
}
