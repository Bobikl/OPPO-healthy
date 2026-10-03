package p010kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.jvm.JvmClassMappingKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import p010kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import p010kotlin.reflect.jvm.internal.impl.name.ClassId;
import p010kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nReflectJavaAnnotation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectJavaAnnotation.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaAnnotation\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,43:1\n11335#2:44\n11670#2,3:45\n*S KotlinDebug\n*F\n+ 1 ReflectJavaAnnotation.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaAnnotation\n*L\n26#1:44\n26#1:45,3\n*E\n"})
public final class ReflectJavaAnnotation extends ReflectJavaElement implements JavaAnnotation {

    @NotNull
    private final Annotation annotation;

    public ReflectJavaAnnotation(@NotNull Annotation annotation) {
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        this.annotation = annotation;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof ReflectJavaAnnotation) && this.annotation == ((ReflectJavaAnnotation) obj).annotation;
    }

    @NotNull
    public final Annotation getAnnotation() {
        return this.annotation;
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation
    @NotNull
    public Collection<JavaAnnotationArgument> getArguments() throws IllegalAccessException, InvocationTargetException {
        Method[] declaredMethods = JvmClassMappingKt.getJavaClass(JvmClassMappingKt.getAnnotationClass(this.annotation)).getDeclaredMethods();
        Intrinsics.checkNotNullExpressionValue(declaredMethods, "annotation.annotationClass.java.declaredMethods");
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            ReflectJavaAnnotationArgument.Factory factory = ReflectJavaAnnotationArgument.Factory;
            Object objInvoke = method.invoke(this.annotation, new Object[0]);
            Intrinsics.checkNotNullExpressionValue(objInvoke, "method.invoke(annotation)");
            arrayList.add(factory.create(objInvoke, Name.identifier(method.getName())));
        }
        return arrayList;
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation
    @NotNull
    public ClassId getClassId() {
        return ReflectClassUtilKt.getClassId(JvmClassMappingKt.getJavaClass(JvmClassMappingKt.getAnnotationClass(this.annotation)));
    }

    public int hashCode() {
        return System.identityHashCode(this.annotation);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation
    public boolean isFreshlySupportedTypeUseAnnotation() {
        return false;
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation
    public boolean isIdeExternalAnnotation() {
        return false;
    }

    @NotNull
    public String toString() {
        return ReflectJavaAnnotation.class.getName() + ": " + this.annotation;
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation
    @NotNull
    public ReflectJavaClass resolve() {
        return new ReflectJavaClass(JvmClassMappingKt.getJavaClass(JvmClassMappingKt.getAnnotationClass(this.annotation)));
    }
}
