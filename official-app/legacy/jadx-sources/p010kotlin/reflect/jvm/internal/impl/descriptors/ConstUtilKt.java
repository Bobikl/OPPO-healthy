package p010kotlin.reflect.jvm.internal.impl.descriptors;

import org.jetbrains.annotations.NotNull;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p010kotlin.reflect.jvm.internal.impl.builtins.UnsignedTypes;
import p010kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p010kotlin.reflect.jvm.internal.impl.types.TypeUtils;

/* JADX INFO: loaded from: classes11.dex */
public final class ConstUtilKt {
    public static final boolean canBeUsedForConstVal(@NotNull KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        return ((KotlinBuiltIns.isPrimitiveType(kotlinType) || UnsignedTypes.isUnsignedType(kotlinType)) && !TypeUtils.isNullableType(kotlinType)) || KotlinBuiltIns.isString(kotlinType);
    }
}
