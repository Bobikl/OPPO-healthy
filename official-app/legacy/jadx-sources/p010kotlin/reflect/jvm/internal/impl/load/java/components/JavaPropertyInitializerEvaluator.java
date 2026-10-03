package p010kotlin.reflect.jvm.internal.impl.load.java.components;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import p010kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import p010kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;

/* JADX INFO: loaded from: classes11.dex */
public interface JavaPropertyInitializerEvaluator {

    public static final class DoNothing implements JavaPropertyInitializerEvaluator {

        @NotNull
        public static final DoNothing INSTANCE = new DoNothing();

        private DoNothing() {
        }

        @Override // p010kotlin.reflect.jvm.internal.impl.load.java.components.JavaPropertyInitializerEvaluator
        @Nullable
        public ConstantValue<?> getInitializerConstant(@NotNull JavaField field, @NotNull PropertyDescriptor descriptor) {
            Intrinsics.checkNotNullParameter(field, "field");
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            return null;
        }
    }

    @Nullable
    ConstantValue<?> getInitializerConstant(@NotNull JavaField javaField, @NotNull PropertyDescriptor propertyDescriptor);
}
