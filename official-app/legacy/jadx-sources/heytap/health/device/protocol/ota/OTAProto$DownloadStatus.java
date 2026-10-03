package heytap.health.device.protocol.ota;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes10.dex */
public enum OTAProto$DownloadStatus implements Internal.EnumLite {
    STATUS_DEFAULT(0),
    STATUS_SUCCESS(1),
    STATUS_DOWNLOADING(2),
    STATUS_ERROR(3),
    UNRECOGNIZED(-1);

    public static final int STATUS_DEFAULT_VALUE = 0;
    public static final int STATUS_DOWNLOADING_VALUE = 2;
    public static final int STATUS_ERROR_VALUE = 3;
    public static final int STATUS_SUCCESS_VALUE = 1;
    private static final Internal.EnumLiteMap<OTAProto$DownloadStatus> internalValueMap = new Internal.EnumLiteMap<OTAProto$DownloadStatus>() { // from class: heytap.health.device.protocol.ota.OTAProto$DownloadStatus.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public OTAProto$DownloadStatus findValueByNumber(int i) {
            return OTAProto$DownloadStatus.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return OTAProto$DownloadStatus.forNumber(i) != null;
        }
    }

    OTAProto$DownloadStatus(int i) {
        this.value = i;
    }

    public static OTAProto$DownloadStatus forNumber(int i) {
        if (i == 0) {
            return STATUS_DEFAULT;
        }
        if (i == 1) {
            return STATUS_SUCCESS;
        }
        if (i == 2) {
            return STATUS_DOWNLOADING;
        }
        if (i != 3) {
            return null;
        }
        return STATUS_ERROR;
    }

    public static Internal.EnumLiteMap<OTAProto$DownloadStatus> internalGetValueMap() {
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
    public static OTAProto$DownloadStatus valueOf(int i) {
        return forNumber(i);
    }
}
