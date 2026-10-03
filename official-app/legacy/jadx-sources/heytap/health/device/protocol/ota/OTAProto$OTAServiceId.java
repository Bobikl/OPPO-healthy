package heytap.health.device.protocol.ota;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes10.dex */
public enum OTAProto$OTAServiceId implements Internal.EnumLite {
    SID_OTA_UNDEFINE(0),
    SID_OTA(27),
    UNRECOGNIZED(-1);

    public static final int SID_OTA_UNDEFINE_VALUE = 0;
    public static final int SID_OTA_VALUE = 27;
    private static final Internal.EnumLiteMap<OTAProto$OTAServiceId> internalValueMap = new Internal.EnumLiteMap<OTAProto$OTAServiceId>() { // from class: heytap.health.device.protocol.ota.OTAProto$OTAServiceId.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public OTAProto$OTAServiceId findValueByNumber(int i) {
            return OTAProto$OTAServiceId.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return OTAProto$OTAServiceId.forNumber(i) != null;
        }
    }

    OTAProto$OTAServiceId(int i) {
        this.value = i;
    }

    public static OTAProto$OTAServiceId forNumber(int i) {
        if (i == 0) {
            return SID_OTA_UNDEFINE;
        }
        if (i != 27) {
            return null;
        }
        return SID_OTA;
    }

    public static Internal.EnumLiteMap<OTAProto$OTAServiceId> internalGetValueMap() {
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
    public static OTAProto$OTAServiceId valueOf(int i) {
        return forNumber(i);
    }
}
