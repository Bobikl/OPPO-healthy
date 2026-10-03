package p010kotlin.reflect.jvm.internal.impl.load.java.structure;

import java.util.Collection;
import org.jetbrains.annotations.NotNull;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.reflect.jvm.internal.impl.name.FqName;
import p010kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes11.dex */
public interface JavaPackage extends JavaAnnotationOwner, JavaElement {
    @NotNull
    Collection<JavaClass> getClasses(@NotNull Function1<? super Name, Boolean> function1);

    @NotNull
    FqName getFqName();

    @NotNull
    Collection<JavaPackage> getSubPackages();
}
