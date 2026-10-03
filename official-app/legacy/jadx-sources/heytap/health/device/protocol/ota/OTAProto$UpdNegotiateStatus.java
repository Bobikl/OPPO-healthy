package heytap.health.device.protocol.ota;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes10.dex */
public enum OTAProto$UpdNegotiateStatus implements Internal.EnumLite {
    UPD_NEGOTIATE_STATUS_ALLOW(0),
    UPD_NEGOTIATE_STATUS_PARAM_ERROR(1),
    UNRECOGNIZED(-1);

    public static final int UPD_NEGOTIATE_STATUS_ALLOW_VALUE = 0;
    public static final int UPD_NEGOTIATE_STATUS_PARAM_ERROR_VALUE = 1;
    private static final Internal.EnumLiteMap<OTAProto$UpdNegotiateStatus> internalValueMap = new Internal.EnumLiteMap<OTAProto$UpdNegotiateStatus>() { // from class: heytap.health.device.protocol.ota.OTAProto$UpdNegotiateStatus.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public OTAProto$UpdNegotiateStatus findValueByNumber(int i) {
            return OTAProto$UpdNegotiateStatus.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return OTAProto$UpdNegotiateStatus.forNumber(i) != null;
        }
    }

    OTAProto$UpdNegotiateStatus(int i) {
        this.value = i;
    }

    public static OTAProto$UpdNegotiateStatus forNumber(int i) {
        if (i == 0) {
            return UPD_NEGOTIATE_STATUS_ALLOW;
        }
        if (i != 1) {
            return null;
        }
        return UPD_NEGOTIATE_STATUS_PARAM_ERROR;
    }

    public static Internal.EnumLiteMap<OTAProto$UpdNegotiateStatus> internalGetValueMap() {
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
    public static OTAProto$UpdNegotiateStatus valueOf(int i) {
        return forNumber(i);
    }
}
