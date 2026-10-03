package com.heytap.health.protocol.spirit;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes17.dex */
public enum HealthSpiritProto$SpiritServiceId implements Internal.EnumLite {
    HEALTH_SPIRIT_SERVICE_PLACE_HOLDER(0),
    SID_HEALTH_SPIRIT(35),
    UNRECOGNIZED(-1);

    public static final int HEALTH_SPIRIT_SERVICE_PLACE_HOLDER_VALUE = 0;
    public static final int SID_HEALTH_SPIRIT_VALUE = 35;
    private static final Internal.EnumLiteMap<HealthSpiritProto$SpiritServiceId> internalValueMap = new Internal.EnumLiteMap<HealthSpiritProto$SpiritServiceId>() { // from class: com.heytap.health.protocol.spirit.HealthSpiritProto$SpiritServiceId.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public HealthSpiritProto$SpiritServiceId findValueByNumber(int i) {
            return HealthSpiritProto$SpiritServiceId.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return HealthSpiritProto$SpiritServiceId.forNumber(i) != null;
        }
    }

    HealthSpiritProto$SpiritServiceId(int i) {
        this.value = i;
    }

    public static HealthSpiritProto$SpiritServiceId forNumber(int i) {
        if (i == 0) {
            return HEALTH_SPIRIT_SERVICE_PLACE_HOLDER;
        }
        if (i != 35) {
            return null;
        }
        return SID_HEALTH_SPIRIT;
    }

    public static Internal.EnumLiteMap<HealthSpiritProto$SpiritServiceId> internalGetValueMap() {
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
    public static HealthSpiritProto$SpiritServiceId valueOf(int i) {
        return forNumber(i);
    }
}
