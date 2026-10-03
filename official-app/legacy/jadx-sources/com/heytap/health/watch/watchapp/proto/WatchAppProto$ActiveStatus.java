package com.heytap.health.watch.watchapp.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes19.dex */
public enum WatchAppProto$ActiveStatus implements Internal.EnumLite {
    ACTIVE_DEFAULT_STATUS(0),
    ACTIVE_DOWNLOAD_READY(20),
    ACTIVE_DOWNLOAD_PAUSE(21),
    ACTIVE_DOWNLOAD_PROGRESS(22),
    ACTIVE_DOWNLOAD_COMPLETE(23),
    ACTIVE_INSTALL_PROGRESS(30),
    ACTIVE_INSTALL_FAIL(31),
    ACTIVE_INSTALL_SUCCESS(32),
    UNRECOGNIZED(-1);

    public static final int ACTIVE_DEFAULT_STATUS_VALUE = 0;
    public static final int ACTIVE_DOWNLOAD_COMPLETE_VALUE = 23;
    public static final int ACTIVE_DOWNLOAD_PAUSE_VALUE = 21;
    public static final int ACTIVE_DOWNLOAD_PROGRESS_VALUE = 22;
    public static final int ACTIVE_DOWNLOAD_READY_VALUE = 20;
    public static final int ACTIVE_INSTALL_FAIL_VALUE = 31;
    public static final int ACTIVE_INSTALL_PROGRESS_VALUE = 30;
    public static final int ACTIVE_INSTALL_SUCCESS_VALUE = 32;
    private static final Internal.EnumLiteMap<WatchAppProto$ActiveStatus> internalValueMap = new Internal.EnumLiteMap<WatchAppProto$ActiveStatus>() { // from class: com.heytap.health.watch.watchapp.proto.WatchAppProto$ActiveStatus.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public WatchAppProto$ActiveStatus findValueByNumber(int i) {
            return WatchAppProto$ActiveStatus.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return WatchAppProto$ActiveStatus.forNumber(i) != null;
        }
    }

    WatchAppProto$ActiveStatus(int i) {
        this.value = i;
    }

    public static WatchAppProto$ActiveStatus forNumber(int i) {
        if (i == 0) {
            return ACTIVE_DEFAULT_STATUS;
        }
        switch (i) {
            case 20:
                return ACTIVE_DOWNLOAD_READY;
            case 21:
                return ACTIVE_DOWNLOAD_PAUSE;
            case 22:
                return ACTIVE_DOWNLOAD_PROGRESS;
            case 23:
                return ACTIVE_DOWNLOAD_COMPLETE;
            default:
                switch (i) {
                    case 30:
                        return ACTIVE_INSTALL_PROGRESS;
                    case 31:
                        return ACTIVE_INSTALL_FAIL;
                    case 32:
                        return ACTIVE_INSTALL_SUCCESS;
                    default:
                        return null;
                }
        }
    }

    public static Internal.EnumLiteMap<WatchAppProto$ActiveStatus> internalGetValueMap() {
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
    public static WatchAppProto$ActiveStatus valueOf(int i) {
        return forNumber(i);
    }
}
