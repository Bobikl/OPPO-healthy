package p010kotlin.reflect.jvm.internal.impl.load.java;

import p010kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import p010kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes11.dex */
public /* synthetic */ class JavaClassFinder$$Util {
    public static /* synthetic */ JavaPackage findPackage$default(JavaClassFinder javaClassFinder, FqName fqName, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findPackage");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return javaClassFinder.findPackage(fqName, z);
    }
}
