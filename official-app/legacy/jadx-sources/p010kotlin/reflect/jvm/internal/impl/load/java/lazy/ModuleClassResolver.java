package p010kotlin.reflect.jvm.internal.impl.load.java.lazy;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p010kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;

/* JADX INFO: loaded from: classes11.dex */
public interface ModuleClassResolver {
    @Nullable
    ClassDescriptor resolveClass(@NotNull JavaClass javaClass);
}
