package p010kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.reflect.jvm.internal.impl.name.ClassId;
import p010kotlin.text.StringsKt__StringsJVMKt;
import p010kotlin.text.Typography;

/* JADX INFO: loaded from: classes11.dex */
public final class ReflectKotlinClassFinderKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String toRuntimeFqName(ClassId classId) {
        String strAsString = classId.getRelativeClassName().asString();
        Intrinsics.checkNotNullExpressionValue(strAsString, "relativeClassName.asString()");
        String strReplace$default = StringsKt__StringsJVMKt.replace$default(strAsString, '.', Typography.dollar, false, 4, (Object) null);
        if (classId.getPackageFqName().isRoot()) {
            return strReplace$default;
        }
        return classId.getPackageFqName() + '.' + strReplace$default;
    }
}
