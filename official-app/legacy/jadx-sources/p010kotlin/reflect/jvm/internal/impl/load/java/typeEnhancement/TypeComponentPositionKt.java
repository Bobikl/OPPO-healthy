package p010kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import org.jetbrains.annotations.NotNull;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class TypeComponentPositionKt {
    public static final boolean shouldEnhance(@NotNull TypeComponentPosition typeComponentPosition) {
        Intrinsics.checkNotNullParameter(typeComponentPosition, "<this>");
        return typeComponentPosition != TypeComponentPosition.INFLEXIBLE;
    }
}
