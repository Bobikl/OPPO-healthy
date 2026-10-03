package p010kotlin.reflect.jvm.internal.impl.descriptors.deserialization;

import org.jetbrains.annotations.NotNull;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.reflect.jvm.internal.impl.name.ClassId;
import p010kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* JADX INFO: loaded from: classes11.dex */
public interface PlatformDependentTypeTransformer {

    public static final class None implements PlatformDependentTypeTransformer {

        @NotNull
        public static final None INSTANCE = new None();

        private None() {
        }

        @Override // p010kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentTypeTransformer
        @NotNull
        public SimpleType transformPlatformType(@NotNull ClassId classId, @NotNull SimpleType computedType) {
            Intrinsics.checkNotNullParameter(classId, "classId");
            Intrinsics.checkNotNullParameter(computedType, "computedType");
            return computedType;
        }
    }

    @NotNull
    SimpleType transformPlatformType(@NotNull ClassId classId, @NotNull SimpleType simpleType);
}
