package p010kotlin.reflect.jvm.internal.impl.load.java.lazy;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p010kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;

/* JADX INFO: loaded from: classes11.dex */
public interface TypeParameterResolver {

    public static final class EMPTY implements TypeParameterResolver {

        @NotNull
        public static final EMPTY INSTANCE = new EMPTY();

        private EMPTY() {
        }

        @Override // p010kotlin.reflect.jvm.internal.impl.load.java.lazy.TypeParameterResolver
        @Nullable
        public TypeParameterDescriptor resolveTypeParameter(@NotNull JavaTypeParameter javaTypeParameter) {
            Intrinsics.checkNotNullParameter(javaTypeParameter, "javaTypeParameter");
            return null;
        }
    }

    @Nullable
    TypeParameterDescriptor resolveTypeParameter(@NotNull JavaTypeParameter javaTypeParameter);
}
