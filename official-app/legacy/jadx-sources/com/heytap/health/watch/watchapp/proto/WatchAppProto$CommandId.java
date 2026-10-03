package com.heytap.health.watch.watchapp.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes19.dex */
public enum WatchAppProto$CommandId implements Internal.EnumLite {
    CID_DEFAULT(0),
    CID_WATCH_DEVICE_INFO(1),
    CID_PRIVACY_AGREEMENT(2),
    CID_APP_LIST_INFO(3),
    CID_UPDATE_APP_INFO(4),
    CID_APP_INSTALL_STATUS_INFO(5),
    CID_APP_CHANGE_EVENT(6),
    CID_DOWNLOAD_NEW_APP(7),
    CID_ACTIVE_APP_LIST_INFO(8),
    CID_DOWNLOAD_SPECIAL_APP(9),
    CID_INSTALL_CHECK(10),
    CID_INSTALL_RESULT(11),
    UNRECOGNIZED(-1);

    public static final int CID_ACTIVE_APP_LIST_INFO_VALUE = 8;
    public static final int CID_APP_CHANGE_EVENT_VALUE = 6;
    public static final int CID_APP_INSTALL_STATUS_INFO_VALUE = 5;
    public static final int CID_APP_LIST_INFO_VALUE = 3;
    public static final int CID_DEFAULT_VALUE = 0;
    public static final int CID_DOWNLOAD_NEW_APP_VALUE = 7;
    public static final int CID_DOWNLOAD_SPECIAL_APP_VALUE = 9;
    public static final int CID_INSTALL_CHECK_VALUE = 10;
    public static final int CID_INSTALL_RESULT_VALUE = 11;
    public static final int CID_PRIVACY_AGREEMENT_VALUE = 2;
    public static final int CID_UPDATE_APP_INFO_VALUE = 4;
    public static final int CID_WATCH_DEVICE_INFO_VALUE = 1;
    private static final Internal.EnumLiteMap<WatchAppProto$CommandId> internalValueMap = new Internal.EnumLiteMap<WatchAppProto$CommandId>() { // from class: com.heytap.health.watch.watchapp.proto.WatchAppProto$CommandId.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public WatchAppProto$CommandId findValueByNumber(int i) {
            return WatchAppProto$CommandId.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return WatchAppProto$CommandId.forNumber(i) != null;
        }
    }

    WatchAppProto$CommandId(int i) {
        this.value = i;
    }

    public static WatchAppProto$CommandId forNumber(int i) {
        switch (i) {
            case 0:
                return CID_DEFAULT;
            case 1:
                return CID_WATCH_DEVICE_INFO;
            case 2:
                return CID_PRIVACY_AGREEMENT;
            case 3:
                return CID_APP_LIST_INFO;
            case 4:
                return CID_UPDATE_APP_INFO;
            case 5:
                return CID_APP_INSTALL_STATUS_INFO;
            case 6:
                return CID_APP_CHANGE_EVENT;
            case 7:
                return CID_DOWNLOAD_NEW_APP;
            case 8:
                return CID_ACTIVE_APP_LIST_INFO;
            case 9:
                return CID_DOWNLOAD_SPECIAL_APP;
            case 10:
                return CID_INSTALL_CHECK;
            case 11:
                return CID_INSTALL_RESULT;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<WatchAppProto$CommandId> internalGetValueMap() {
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
    public static WatchAppProto$CommandId valueOf(int i) {
        return forNumber(i);
    }
}
