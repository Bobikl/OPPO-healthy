package heytap.health.device.protocol.ota;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes10.dex */
public enum OTAProto$StatusType implements Internal.EnumLite {
    STATUS_OK(0),
    STATUS_INTERRUPT(1),
    STATUS_ERROR_RETRY(2),
    STATUS_LOW_BATTERY(3),
    STATUS_MISMATCH(4),
    STATUS_LOW_STORAGE(5),
    STATUS_WEARING(6),
    STATUS_NO_CHARGING(7),
    UNRECOGNIZED(-1);

    public static final int STATUS_ERROR_RETRY_VALUE = 2;
    public static final int STATUS_INTERRUPT_VALUE = 1;
    public static final int STATUS_LOW_BATTERY_VALUE = 3;
    public static final int STATUS_LOW_STORAGE_VALUE = 5;
    public static final int STATUS_MISMATCH_VALUE = 4;
    public static final int STATUS_NO_CHARGING_VALUE = 7;
    public static final int STATUS_OK_VALUE = 0;
    public static final int STATUS_WEARING_VALUE = 6;
    private static final Internal.EnumLiteMap<OTAProto$StatusType> internalValueMap = new Internal.EnumLiteMap<OTAProto$StatusType>() { // from class: heytap.health.device.protocol.ota.OTAProto$StatusType.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public OTAProto$StatusType findValueByNumber(int i) {
            return OTAProto$StatusType.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return OTAProto$StatusType.forNumber(i) != null;
        }
    }

    OTAProto$StatusType(int i) {
        this.value = i;
    }

    public static OTAProto$StatusType forNumber(int i) {
        switch (i) {
            case 0:
                return STATUS_OK;
            case 1:
                return STATUS_INTERRUPT;
            case 2:
                return STATUS_ERROR_RETRY;
            case 3:
                return STATUS_LOW_BATTERY;
            case 4:
                return STATUS_MISMATCH;
            case 5:
                return STATUS_LOW_STORAGE;
            case 6:
                return STATUS_WEARING;
            case 7:
                return STATUS_NO_CHARGING;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<OTAProto$StatusType> internalGetValueMap() {
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
    public static OTAProto$StatusType valueOf(int i) {
        return forNumber(i);
    }
}
