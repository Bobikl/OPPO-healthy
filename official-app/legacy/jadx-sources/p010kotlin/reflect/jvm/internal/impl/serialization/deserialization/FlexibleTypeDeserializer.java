package p010kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import org.jetbrains.annotations.NotNull;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import p010kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p010kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* JADX INFO: loaded from: classes11.dex */
public interface FlexibleTypeDeserializer {

    public static final class ThrowException implements FlexibleTypeDeserializer {

        @NotNull
        public static final ThrowException INSTANCE = new ThrowException();

        private ThrowException() {
        }

        @Override // p010kotlin.reflect.jvm.internal.impl.serialization.deserialization.FlexibleTypeDeserializer
        @NotNull
        public KotlinType create(@NotNull ProtoBuf.Type proto, @NotNull String flexibleId, @NotNull SimpleType lowerBound, @NotNull SimpleType upperBound) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            Intrinsics.checkNotNullParameter(flexibleId, "flexibleId");
            Intrinsics.checkNotNullParameter(lowerBound, "lowerBound");
            Intrinsics.checkNotNullParameter(upperBound, "upperBound");
            throw new IllegalArgumentException("This method should not be used.");
        }
    }

    @NotNull
    KotlinType create(@NotNull ProtoBuf.Type type, @NotNull String str, @NotNull SimpleType simpleType, @NotNull SimpleType simpleType2);
}
