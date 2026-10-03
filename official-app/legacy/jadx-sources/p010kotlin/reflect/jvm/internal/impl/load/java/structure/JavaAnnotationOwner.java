package p010kotlin.reflect.jvm.internal.impl.load.java.structure;

import java.util.Collection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes11.dex */
public interface JavaAnnotationOwner extends JavaElement {
    @Nullable
    JavaAnnotation findAnnotation(@NotNull FqName fqName);

    @NotNull
    Collection<JavaAnnotation> getAnnotations();

    boolean isDeprecatedInJavaDoc();
}
