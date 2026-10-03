package p010kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import p010kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import p010kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import p010kotlin.reflect.jvm.internal.impl.name.FqName;
import p010kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes11.dex */
public final class ReflectJavaPackage extends ReflectJavaElement implements JavaPackage {

    @NotNull
    private final FqName fqName;

    public ReflectJavaPackage(@NotNull FqName fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        this.fqName = fqName;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof ReflectJavaPackage) && Intrinsics.areEqual(getFqName(), ((ReflectJavaPackage) obj).getFqName());
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    @Nullable
    public JavaAnnotation findAnnotation(@NotNull FqName fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return null;
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage
    @NotNull
    public Collection<JavaClass> getClasses(@NotNull Function1<? super Name, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage
    @NotNull
    public FqName getFqName() {
        return this.fqName;
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage
    @NotNull
    public Collection<JavaPackage> getSubPackages() {
        return CollectionsKt__CollectionsKt.emptyList();
    }

    public int hashCode() {
        return getFqName().hashCode();
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public boolean isDeprecatedInJavaDoc() {
        return false;
    }

    @NotNull
    public String toString() {
        return ReflectJavaPackage.class.getName() + ": " + getFqName();
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    @NotNull
    public List<JavaAnnotation> getAnnotations() {
        return CollectionsKt__CollectionsKt.emptyList();
    }
}
