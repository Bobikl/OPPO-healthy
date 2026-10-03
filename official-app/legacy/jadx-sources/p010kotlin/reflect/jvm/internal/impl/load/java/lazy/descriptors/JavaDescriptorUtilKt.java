package p010kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import org.jetbrains.annotations.NotNull;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;

/* JADX INFO: loaded from: classes11.dex */
public final class JavaDescriptorUtilKt {
    public static final boolean isJavaField(@NotNull PropertyDescriptor propertyDescriptor) {
        Intrinsics.checkNotNullParameter(propertyDescriptor, "<this>");
        return propertyDescriptor.getGetter() == null;
    }
}
