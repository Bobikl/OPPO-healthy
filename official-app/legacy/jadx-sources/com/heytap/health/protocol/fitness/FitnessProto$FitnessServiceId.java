package com.heytap.health.protocol.fitness;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes17.dex */
public enum FitnessProto$FitnessServiceId implements Internal.EnumLite {
    FITNESS_SERVICE_PLACE_HOLDER(0),
    SID_FITNESS(5),
    UNRECOGNIZED(-1);

    public static final int FITNESS_SERVICE_PLACE_HOLDER_VALUE = 0;
    public static final int SID_FITNESS_VALUE = 5;
    private static final Internal.EnumLiteMap<FitnessProto$FitnessServiceId> internalValueMap = new Internal.EnumLiteMap<FitnessProto$FitnessServiceId>() { // from class: com.heytap.health.protocol.fitness.FitnessProto$FitnessServiceId.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FitnessProto$FitnessServiceId findValueByNumber(int i) {
            return FitnessProto$FitnessServiceId.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return FitnessProto$FitnessServiceId.forNumber(i) != null;
        }
    }

    FitnessProto$FitnessServiceId(int i) {
        this.value = i;
    }

    public static FitnessProto$FitnessServiceId forNumber(int i) {
        if (i == 0) {
            return FITNESS_SERVICE_PLACE_HOLDER;
        }
        if (i != 5) {
            return null;
        }
        return SID_FITNESS;
    }

    public static Internal.EnumLiteMap<FitnessProto$FitnessServiceId> internalGetValueMap() {
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
    public static FitnessProto$FitnessServiceId valueOf(int i) {
        return forNumber(i);
    }
}
