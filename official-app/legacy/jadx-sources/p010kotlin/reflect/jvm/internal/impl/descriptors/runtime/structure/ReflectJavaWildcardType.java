package p010kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.collections.ArraysKt___ArraysKt;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import p010kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nReflectJavaWildcardType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectJavaWildcardType.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaWildcardType\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n1#2:46\n*E\n"})
public final class ReflectJavaWildcardType extends ReflectJavaType implements JavaWildcardType {

    @NotNull
    private final Collection<JavaAnnotation> annotations;
    private final boolean isDeprecatedInJavaDoc;

    @NotNull
    private final WildcardType reflectType;

    public ReflectJavaWildcardType(@NotNull WildcardType reflectType) {
        Intrinsics.checkNotNullParameter(reflectType, "reflectType");
        this.reflectType = reflectType;
        this.annotations = CollectionsKt__CollectionsKt.emptyList();
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    @NotNull
    public Collection<JavaAnnotation> getAnnotations() {
        return this.annotations;
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public boolean isDeprecatedInJavaDoc() {
        return this.isDeprecatedInJavaDoc;
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType
    public boolean isExtends() {
        Type[] upperBounds = getReflectType().getUpperBounds();
        Intrinsics.checkNotNullExpressionValue(upperBounds, "reflectType.upperBounds");
        return !Intrinsics.areEqual(ArraysKt___ArraysKt.firstOrNull(upperBounds), Object.class);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType
    @Nullable
    public ReflectJavaType getBound() {
        Type[] upperBounds = getReflectType().getUpperBounds();
        Type[] lowerBounds = getReflectType().getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            throw new UnsupportedOperationException("Wildcard types with many bounds are not yet supported: " + getReflectType());
        }
        if (lowerBounds.length == 1) {
            ReflectJavaType.Factory factory = ReflectJavaType.Factory;
            Intrinsics.checkNotNullExpressionValue(lowerBounds, "lowerBounds");
            Object objSingle = ArraysKt___ArraysKt.single(lowerBounds);
            Intrinsics.checkNotNullExpressionValue(objSingle, "lowerBounds.single()");
            return factory.create((Type) objSingle);
        }
        if (upperBounds.length == 1) {
            Intrinsics.checkNotNullExpressionValue(upperBounds, "upperBounds");
            Type ub = (Type) ArraysKt___ArraysKt.single(upperBounds);
            if (!Intrinsics.areEqual(ub, Object.class)) {
                ReflectJavaType.Factory factory2 = ReflectJavaType.Factory;
                Intrinsics.checkNotNullExpressionValue(ub, "ub");
                return factory2.create(ub);
            }
        }
        return null;
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType
    @NotNull
    public WildcardType getReflectType() {
        return this.reflectType;
    }
}
