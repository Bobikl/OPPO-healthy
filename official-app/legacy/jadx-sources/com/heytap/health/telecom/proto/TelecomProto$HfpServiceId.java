package com.heytap.health.telecom.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes18.dex */
public enum TelecomProto$HfpServiceId implements Internal.EnumLite {
    SERVICE_ID_HFP_UNDEFINE(0),
    SERVICE_ID_HFP_EXTEND(6),
    UNRECOGNIZED(-1);

    public static final int SERVICE_ID_HFP_EXTEND_VALUE = 6;
    public static final int SERVICE_ID_HFP_UNDEFINE_VALUE = 0;
    private static final Internal.EnumLiteMap<TelecomProto$HfpServiceId> internalValueMap = new Internal.EnumLiteMap<TelecomProto$HfpServiceId>() { // from class: com.heytap.health.telecom.proto.TelecomProto$HfpServiceId.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TelecomProto$HfpServiceId findValueByNumber(int i) {
            return TelecomProto$HfpServiceId.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return TelecomProto$HfpServiceId.forNumber(i) != null;
        }
    }

    TelecomProto$HfpServiceId(int i) {
        this.value = i;
    }

    public static TelecomProto$HfpServiceId forNumber(int i) {
        if (i == 0) {
            return SERVICE_ID_HFP_UNDEFINE;
        }
        if (i != 6) {
            return null;
        }
        return SERVICE_ID_HFP_EXTEND;
    }

    public static Internal.EnumLiteMap<TelecomProto$HfpServiceId> internalGetValueMap() {
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
    public static TelecomProto$HfpServiceId valueOf(int i) {
        return forNumber(i);
    }
}
