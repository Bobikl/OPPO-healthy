package heytap.health.device.protocol.ota;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes10.dex */
public enum OTAProto$OTAStage implements Internal.EnumLite {
    OTA_STAGE_DEFAULT(0),
    OTA_STAGE_NORMAL(256),
    OTA_STAGE_TRANSFERRING(512),
    OTA_STAGE_UNZIPPING(768),
    OTA_STAGE_INSTALLING(1024),
    UNRECOGNIZED(-1);

    public static final int OTA_STAGE_DEFAULT_VALUE = 0;
    public static final int OTA_STAGE_INSTALLING_VALUE = 1024;
    public static final int OTA_STAGE_NORMAL_VALUE = 256;
    public static final int OTA_STAGE_TRANSFERRING_VALUE = 512;
    public static final int OTA_STAGE_UNZIPPING_VALUE = 768;
    private static final Internal.EnumLiteMap<OTAProto$OTAStage> internalValueMap = new Internal.EnumLiteMap<OTAProto$OTAStage>() { // from class: heytap.health.device.protocol.ota.OTAProto$OTAStage.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public OTAProto$OTAStage findValueByNumber(int i) {
            return OTAProto$OTAStage.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return OTAProto$OTAStage.forNumber(i) != null;
        }
    }

    OTAProto$OTAStage(int i) {
        this.value = i;
    }

    public static OTAProto$OTAStage forNumber(int i) {
        if (i == 0) {
            return OTA_STAGE_DEFAULT;
        }
        if (i == 256) {
            return OTA_STAGE_NORMAL;
        }
        if (i == 512) {
            return OTA_STAGE_TRANSFERRING;
        }
        if (i == 768) {
            return OTA_STAGE_UNZIPPING;
        }
        if (i != 1024) {
            return null;
        }
        return OTA_STAGE_INSTALLING;
    }

    public static Internal.EnumLiteMap<OTAProto$OTAStage> internalGetValueMap() {
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
    public static OTAProto$OTAStage valueOf(int i) {
        return forNumber(i);
    }
}
