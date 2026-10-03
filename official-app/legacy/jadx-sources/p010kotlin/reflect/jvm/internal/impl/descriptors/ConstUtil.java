package p010kotlin.reflect.jvm.internal.impl.descriptors;

import org.jetbrains.annotations.NotNull;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes11.dex */
public final class ConstUtil {

    @NotNull
    public static final ConstUtil INSTANCE = new ConstUtil();

    private ConstUtil() {
    }

    @JvmStatic
    public static final boolean canBeUsedForConstVal(@NotNull KotlinType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return ConstUtilKt.canBeUsedForConstVal(type);
    }
}
