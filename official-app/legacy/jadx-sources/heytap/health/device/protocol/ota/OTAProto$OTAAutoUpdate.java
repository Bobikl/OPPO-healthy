package heytap.health.device.protocol.ota;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes10.dex */
public enum OTAProto$OTAAutoUpdate implements Internal.EnumLite {
    OTA_AUTO_UPDATE_NON(0),
    OTA_AUTO_UPDATE_CLOSE(1),
    OTA_AUTO_UPDATE_OPEN(2),
    UNRECOGNIZED(-1);

    public static final int OTA_AUTO_UPDATE_CLOSE_VALUE = 1;
    public static final int OTA_AUTO_UPDATE_NON_VALUE = 0;
    public static final int OTA_AUTO_UPDATE_OPEN_VALUE = 2;
    private static final Internal.EnumLiteMap<OTAProto$OTAAutoUpdate> internalValueMap = new Internal.EnumLiteMap<OTAProto$OTAAutoUpdate>() { // from class: heytap.health.device.protocol.ota.OTAProto$OTAAutoUpdate.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public OTAProto$OTAAutoUpdate findValueByNumber(int i) {
            return OTAProto$OTAAutoUpdate.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return OTAProto$OTAAutoUpdate.forNumber(i) != null;
        }
    }

    OTAProto$OTAAutoUpdate(int i) {
        this.value = i;
    }

    public static OTAProto$OTAAutoUpdate forNumber(int i) {
        if (i == 0) {
            return OTA_AUTO_UPDATE_NON;
        }
        if (i == 1) {
            return OTA_AUTO_UPDATE_CLOSE;
        }
        if (i != 2) {
            return null;
        }
        return OTA_AUTO_UPDATE_OPEN;
    }

    public static Internal.EnumLiteMap<OTAProto$OTAAutoUpdate> internalGetValueMap() {
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
    public static OTAProto$OTAAutoUpdate valueOf(int i) {
        return forNumber(i);
    }
}
