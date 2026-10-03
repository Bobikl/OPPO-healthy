package p010kotlin.reflect.jvm.internal.impl.load.java;

import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.reflect.jvm.internal.impl.name.FqName;
import p010kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import p010kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes11.dex */
public final class BuiltinSpecialPropertiesKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final FqName child(FqName fqName, String str) {
        FqName fqNameChild = fqName.child(Name.identifier(str));
        Intrinsics.checkNotNullExpressionValue(fqNameChild, "child(Name.identifier(name))");
        return fqNameChild;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FqName childSafe(FqNameUnsafe fqNameUnsafe, String str) {
        FqName safe = fqNameUnsafe.child(Name.identifier(str)).toSafe();
        Intrinsics.checkNotNullExpressionValue(safe, "child(Name.identifier(name)).toSafe()");
        return safe;
    }
}
