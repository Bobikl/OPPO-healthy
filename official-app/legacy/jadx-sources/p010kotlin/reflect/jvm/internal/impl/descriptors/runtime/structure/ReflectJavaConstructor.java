package p010kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.collections.ArraysKt___ArraysJvmKt;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.reflect.jvm.internal.impl.load.java.structure.JavaConstructor;
import p010kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nReflectJavaConstructor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectJavaConstructor.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaConstructor\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,51:1\n11335#2:52\n11670#2,3:53\n*S KotlinDebug\n*F\n+ 1 ReflectJavaConstructor.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaConstructor\n*L\n49#1:52\n49#1:53,3\n*E\n"})
public final class ReflectJavaConstructor extends ReflectJavaMember implements JavaConstructor {

    @NotNull
    private final Constructor<?> member;

    public ReflectJavaConstructor(@NotNull Constructor<?> member) {
        Intrinsics.checkNotNullParameter(member, "member");
        this.member = member;
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaMember
    @NotNull
    public Constructor<?> getMember() {
        return this.member;
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner
    @NotNull
    public List<ReflectJavaTypeParameter> getTypeParameters() {
        TypeVariable<Constructor<?>>[] typeParameters = getMember().getTypeParameters();
        Intrinsics.checkNotNullExpressionValue(typeParameters, "member.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Constructor<?>> typeVariable : typeParameters) {
            arrayList.add(new ReflectJavaTypeParameter(typeVariable));
        }
        return arrayList;
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.load.java.structure.JavaConstructor
    @NotNull
    public List<JavaValueParameter> getValueParameters() {
        Type[] realTypes = getMember().getGenericParameterTypes();
        Intrinsics.checkNotNullExpressionValue(realTypes, "types");
        if (realTypes.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        Class<?> declaringClass = getMember().getDeclaringClass();
        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
            realTypes = (Type[]) ArraysKt___ArraysJvmKt.copyOfRange(realTypes, 1, realTypes.length);
        }
        Annotation[][] realAnnotations = getMember().getParameterAnnotations();
        if (realAnnotations.length < realTypes.length) {
            throw new IllegalStateException("Illegal generic signature: " + getMember());
        }
        if (realAnnotations.length > realTypes.length) {
            Intrinsics.checkNotNullExpressionValue(realAnnotations, "annotations");
            realAnnotations = (Annotation[][]) ArraysKt___ArraysJvmKt.copyOfRange(realAnnotations, realAnnotations.length - realTypes.length, realAnnotations.length);
        }
        Intrinsics.checkNotNullExpressionValue(realTypes, "realTypes");
        Intrinsics.checkNotNullExpressionValue(realAnnotations, "realAnnotations");
        return getValueParameters(realTypes, realAnnotations, getMember().isVarArgs());
    }
}
