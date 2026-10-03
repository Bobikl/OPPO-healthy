package p010kotlin.reflect.jvm.internal.impl.load.kotlin;

import org.jetbrains.annotations.NotNull;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import p010kotlin.reflect.jvm.internal.impl.descriptors.SourceFile;
import p010kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;

/* JADX INFO: loaded from: classes11.dex */
public final class KotlinJvmBinaryPackageSourceElement implements SourceElement {

    @NotNull
    private final LazyJavaPackageFragment packageFragment;

    public KotlinJvmBinaryPackageSourceElement(@NotNull LazyJavaPackageFragment packageFragment) {
        Intrinsics.checkNotNullParameter(packageFragment, "packageFragment");
        this.packageFragment = packageFragment;
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.descriptors.SourceElement
    @NotNull
    public SourceFile getContainingFile() {
        SourceFile NO_SOURCE_FILE = SourceFile.NO_SOURCE_FILE;
        Intrinsics.checkNotNullExpressionValue(NO_SOURCE_FILE, "NO_SOURCE_FILE");
        return NO_SOURCE_FILE;
    }

    @NotNull
    public String toString() {
        return this.packageFragment + ": " + this.packageFragment.getBinaryClasses$descriptors_jvm().keySet();
    }
}
