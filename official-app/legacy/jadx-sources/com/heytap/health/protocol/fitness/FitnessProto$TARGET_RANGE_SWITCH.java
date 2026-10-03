package com.heytap.health.protocol.fitness;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes17.dex */
public enum FitnessProto$TARGET_RANGE_SWITCH implements Internal.EnumLite {
    TYPE_OFF(0),
    TYPE_ON(1),
    UNRECOGNIZED(-1);

    public static final int TYPE_OFF_VALUE = 0;
    public static final int TYPE_ON_VALUE = 1;
    private static final Internal.EnumLiteMap<FitnessProto$TARGET_RANGE_SWITCH> internalValueMap = new Internal.EnumLiteMap<FitnessProto$TARGET_RANGE_SWITCH>() { // from class: com.heytap.health.protocol.fitness.FitnessProto$TARGET_RANGE_SWITCH.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FitnessProto$TARGET_RANGE_SWITCH findValueByNumber(int i) {
            return FitnessProto$TARGET_RANGE_SWITCH.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return FitnessProto$TARGET_RANGE_SWITCH.forNumber(i) != null;
        }
    }

    FitnessProto$TARGET_RANGE_SWITCH(int i) {
        this.value = i;
    }

    public static FitnessProto$TARGET_RANGE_SWITCH forNumber(int i) {
        if (i == 0) {
            return TYPE_OFF;
        }
        if (i != 1) {
            return null;
        }
        return TYPE_ON;
    }

    public static Internal.EnumLiteMap<FitnessProto$TARGET_RANGE_SWITCH> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static FitnessProto$TARGET_RANGE_SWITCH valueOf(int i) {
        return forNumber(i);
    }
}
