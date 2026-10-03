package p010kotlin.reflect.jvm.internal.impl.types;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class TypeCapabilitiesKt {
    @Nullable
    public static final CustomTypeParameter getCustomTypeParameter(@NotNull KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        Object objUnwrap = kotlinType.unwrap();
        CustomTypeParameter customTypeParameter = objUnwrap instanceof CustomTypeParameter ? (CustomTypeParameter) objUnwrap : null;
        if (customTypeParameter == null || !customTypeParameter.isTypeParameter()) {
            return null;
        }
        return customTypeParameter;
    }

    public static final boolean isCustomTypeParameter(@NotNull KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        Object objUnwrap = kotlinType.unwrap();
        CustomTypeParameter customTypeParameter = objUnwrap instanceof CustomTypeParameter ? (CustomTypeParameter) objUnwrap : null;
        if (customTypeParameter != null) {
            return customTypeParameter.isTypeParameter();
        }
        return false;
    }
}
