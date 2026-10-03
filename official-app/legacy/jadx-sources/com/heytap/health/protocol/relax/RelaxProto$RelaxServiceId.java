package com.heytap.health.protocol.relax;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes17.dex */
public enum RelaxProto$RelaxServiceId implements Internal.EnumLite {
    RELAX_SERVICE_PLACE_HOLDER(0),
    SID_RELAX(36),
    UNRECOGNIZED(-1);

    public static final int RELAX_SERVICE_PLACE_HOLDER_VALUE = 0;
    public static final int SID_RELAX_VALUE = 36;
    private static final Internal.EnumLiteMap<RelaxProto$RelaxServiceId> internalValueMap = new Internal.EnumLiteMap<RelaxProto$RelaxServiceId>() { // from class: com.heytap.health.protocol.relax.RelaxProto$RelaxServiceId.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public RelaxProto$RelaxServiceId findValueByNumber(int i) {
            return RelaxProto$RelaxServiceId.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return RelaxProto$RelaxServiceId.forNumber(i) != null;
        }
    }

    RelaxProto$RelaxServiceId(int i) {
        this.value = i;
    }

    public static RelaxProto$RelaxServiceId forNumber(int i) {
        if (i == 0) {
            return RELAX_SERVICE_PLACE_HOLDER;
        }
        if (i != 36) {
            return null;
        }
        return SID_RELAX;
    }

    public static Internal.EnumLiteMap<RelaxProto$RelaxServiceId> internalGetValueMap() {
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
    public static RelaxProto$RelaxServiceId valueOf(int i) {
        return forNumber(i);
    }
}
