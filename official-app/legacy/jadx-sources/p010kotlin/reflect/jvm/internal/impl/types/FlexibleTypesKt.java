package p010kotlin.reflect.jvm.internal.impl.types;

import org.jetbrains.annotations.NotNull;
import p010kotlin.NoWhenBranchMatchedException;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nflexibleTypes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 flexibleTypes.kt\norg/jetbrains/kotlin/types/FlexibleTypesKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,185:1\n288#2:186\n1726#2,3:187\n289#2:190\n1549#2:191\n1620#2,3:192\n1549#2:195\n1620#2,3:196\n*S KotlinDebug\n*F\n+ 1 flexibleTypes.kt\norg/jetbrains/kotlin/types/FlexibleTypesKt\n*L\n50#1:186\n51#1:187,3\n50#1:190\n62#1:191\n62#1:192,3\n65#1:195\n65#1:196,3\n*E\n"})
public final class FlexibleTypesKt {
    @NotNull
    public static final FlexibleType asFlexibleType(@NotNull KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        UnwrappedType unwrappedTypeUnwrap = kotlinType.unwrap();
        Intrinsics.checkNotNull(unwrappedTypeUnwrap, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
        return (FlexibleType) unwrappedTypeUnwrap;
    }

    public static final boolean isFlexible(@NotNull KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        return kotlinType.unwrap() instanceof FlexibleType;
    }

    @NotNull
    public static final SimpleType lowerIfFlexible(@NotNull KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        UnwrappedType unwrappedTypeUnwrap = kotlinType.unwrap();
        if (unwrappedTypeUnwrap instanceof FlexibleType) {
            return ((FlexibleType) unwrappedTypeUnwrap).getLowerBound();
        }
        if (unwrappedTypeUnwrap instanceof SimpleType) {
            return (SimpleType) unwrappedTypeUnwrap;
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public static final SimpleType upperIfFlexible(@NotNull KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        UnwrappedType unwrappedTypeUnwrap = kotlinType.unwrap();
        if (unwrappedTypeUnwrap instanceof FlexibleType) {
            return ((FlexibleType) unwrappedTypeUnwrap).getUpperBound();
        }
        if (unwrappedTypeUnwrap instanceof SimpleType) {
            return (SimpleType) unwrappedTypeUnwrap;
        }
        throw new NoWhenBranchMatchedException();
    }
}
