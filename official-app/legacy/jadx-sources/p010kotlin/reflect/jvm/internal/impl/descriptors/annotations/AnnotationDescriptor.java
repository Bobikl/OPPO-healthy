package p010kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p010kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import p010kotlin.reflect.jvm.internal.impl.name.FqName;
import p010kotlin.reflect.jvm.internal.impl.name.Name;
import p010kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import p010kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p010kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p010kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

/* JADX INFO: loaded from: classes11.dex */
public interface AnnotationDescriptor {

    @SourceDebugExtension({"SMAP\nAnnotationDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotationDescriptor.kt\norg/jetbrains/kotlin/descriptors/annotations/AnnotationDescriptor$DefaultImpls\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,44:1\n1#2:45\n*E\n"})
    public static final class DefaultImpls {
        @Nullable
        public static FqName getFqName(@NotNull AnnotationDescriptor annotationDescriptor) {
            ClassDescriptor annotationClass = DescriptorUtilsKt.getAnnotationClass(annotationDescriptor);
            if (annotationClass == null) {
                return null;
            }
            if (ErrorUtils.isError(annotationClass)) {
                annotationClass = null;
            }
            if (annotationClass != null) {
                return DescriptorUtilsKt.fqNameOrNull(annotationClass);
            }
            return null;
        }
    }

    @NotNull
    Map<Name, ConstantValue<?>> getAllValueArguments();

    @Nullable
    FqName getFqName();

    @NotNull
    SourceElement getSource();

    @NotNull
    KotlinType getType();
}
