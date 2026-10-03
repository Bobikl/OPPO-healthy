package p010kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import org.jetbrains.annotations.NotNull;
import p010kotlin.jvm.JvmField;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import p010kotlin.reflect.jvm.internal.impl.name.CallableId;
import p010kotlin.reflect.jvm.internal.impl.name.FqName;
import p010kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes11.dex */
public final class SuspendFunctionTypeUtilKt {

    @JvmField
    @NotNull
    public static final FqName KOTLIN_SUSPEND_BUILT_IN_FUNCTION_FQ_NAME = new FqName("kotlin.suspend");

    @JvmField
    @NotNull
    public static final CallableId KOTLIN_SUSPEND_BUILT_IN_FUNCTION_FQ_NAME_CALLABLE_ID;

    static {
        FqName fqName = StandardNames.BUILT_INS_PACKAGE_FQ_NAME;
        Name nameIdentifier = Name.identifier("suspend");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(\"suspend\")");
        KOTLIN_SUSPEND_BUILT_IN_FUNCTION_FQ_NAME_CALLABLE_ID = new CallableId(fqName, nameIdentifier);
    }
}
