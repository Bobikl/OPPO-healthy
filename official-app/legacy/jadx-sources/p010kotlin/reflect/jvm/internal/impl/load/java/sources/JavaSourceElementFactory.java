package p010kotlin.reflect.jvm.internal.impl.load.java.sources;

import org.jetbrains.annotations.NotNull;
import p010kotlin.reflect.jvm.internal.impl.load.java.structure.JavaElement;

/* JADX INFO: loaded from: classes11.dex */
public interface JavaSourceElementFactory {
    @NotNull
    JavaSourceElement source(@NotNull JavaElement javaElement);
}
