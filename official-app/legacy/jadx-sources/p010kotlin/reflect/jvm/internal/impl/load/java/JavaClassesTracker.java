package p010kotlin.reflect.jvm.internal.impl.load.java;

import org.jetbrains.annotations.NotNull;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor;

/* JADX INFO: loaded from: classes11.dex */
public interface JavaClassesTracker {

    public static final class Default implements JavaClassesTracker {

        @NotNull
        public static final Default INSTANCE = new Default();

        private Default() {
        }

        @Override // p010kotlin.reflect.jvm.internal.impl.load.java.JavaClassesTracker
        public void reportClass(@NotNull JavaClassDescriptor classDescriptor) {
            Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        }
    }

    void reportClass(@NotNull JavaClassDescriptor javaClassDescriptor);
}
