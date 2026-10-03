package com.heytap.health.linkage.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes16.dex */
public enum LinkageDeviceProto$LinkageCommandId implements Internal.EnumLite {
    COMMAND_UNDEFINE(0),
    COMMAND_DEVICES_SYNCHRONIZE(1),
    COMMAND_DEVICE_STATE_UPDATE(2),
    COMMAND_DEVICE_ADD(3),
    COMMAND_DEVICE_REMOVE(4),
    COMMAND_REQUEST_AUDIO_FOCUS_FROM_LINKAGE_REQUEST(5),
    COMMAND_REQUEST_AUDIO_FOCUS_FROM_LINKAGE_RESPONSE(6),
    COMMAND_REQUEST_AUDIO_FOCUS_REQUEST(7),
    COMMAND_REQUEST_AUDIO_FOCUS_RESPONSE(8),
    COMMAND_DEVICE_LIST_SYNCHRONIZE_FROM_LOCAL(9),
    COMMAND_DEVICE_STATE_UPDATE_FROM_LOCAL(10),
    COMMAND_SYNC_EARPHONE_BLE_TO_WATCH(11),
    COMMAND_WATCH_SYNC_DEVICE_STATUS(12),
    COMMAND_SYNC_DEVICE_STATUS(13),
    COMMAND_WATCH_REQUEST_BIND_DEVICE(14),
    COMMAND_WATCH_SYNC_DEVICE_STATUS_RESPONSE(15),
    COMMAND_WATCH_SYNC_SUPPORT_SCAN(16),
    UNRECOGNIZED(-1);

    public static final int COMMAND_DEVICES_SYNCHRONIZE_VALUE = 1;
    public static final int COMMAND_DEVICE_ADD_VALUE = 3;
    public static final int COMMAND_DEVICE_LIST_SYNCHRONIZE_FROM_LOCAL_VALUE = 9;
    public static final int COMMAND_DEVICE_REMOVE_VALUE = 4;
    public static final int COMMAND_DEVICE_STATE_UPDATE_FROM_LOCAL_VALUE = 10;
    public static final int COMMAND_DEVICE_STATE_UPDATE_VALUE = 2;
    public static final int COMMAND_REQUEST_AUDIO_FOCUS_FROM_LINKAGE_REQUEST_VALUE = 5;
    public static final int COMMAND_REQUEST_AUDIO_FOCUS_FROM_LINKAGE_RESPONSE_VALUE = 6;
    public static final int COMMAND_REQUEST_AUDIO_FOCUS_REQUEST_VALUE = 7;
    public static final int COMMAND_REQUEST_AUDIO_FOCUS_RESPONSE_VALUE = 8;
    public static final int COMMAND_SYNC_DEVICE_STATUS_VALUE = 13;
    public static final int COMMAND_SYNC_EARPHONE_BLE_TO_WATCH_VALUE = 11;
    public static final int COMMAND_UNDEFINE_VALUE = 0;
    public static final int COMMAND_WATCH_REQUEST_BIND_DEVICE_VALUE = 14;
    public static final int COMMAND_WATCH_SYNC_DEVICE_STATUS_RESPONSE_VALUE = 15;
    public static final int COMMAND_WATCH_SYNC_DEVICE_STATUS_VALUE = 12;
    public static final int COMMAND_WATCH_SYNC_SUPPORT_SCAN_VALUE = 16;
    private static final Internal.EnumLiteMap<LinkageDeviceProto$LinkageCommandId> internalValueMap = new Internal.EnumLiteMap<LinkageDeviceProto$LinkageCommandId>() { // from class: com.heytap.health.linkage.proto.LinkageDeviceProto$LinkageCommandId.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LinkageDeviceProto$LinkageCommandId findValueByNumber(int i) {
            return LinkageDeviceProto$LinkageCommandId.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return LinkageDeviceProto$LinkageCommandId.forNumber(i) != null;
        }
    }

    LinkageDeviceProto$LinkageCommandId(int i) {
        this.value = i;
    }

    public static LinkageDeviceProto$LinkageCommandId forNumber(int i) {
        switch (i) {
            case 0:
                return COMMAND_UNDEFINE;
            case 1:
                return COMMAND_DEVICES_SYNCHRONIZE;
            case 2:
                return COMMAND_DEVICE_STATE_UPDATE;
            case 3:
                return COMMAND_DEVICE_ADD;
            case 4:
                return COMMAND_DEVICE_REMOVE;
            case 5:
                return COMMAND_REQUEST_AUDIO_FOCUS_FROM_LINKAGE_REQUEST;
            case 6:
                return COMMAND_REQUEST_AUDIO_FOCUS_FROM_LINKAGE_RESPONSE;
            case 7:
                return COMMAND_REQUEST_AUDIO_FOCUS_REQUEST;
            case 8:
                return COMMAND_REQUEST_AUDIO_FOCUS_RESPONSE;
            case 9:
                return COMMAND_DEVICE_LIST_SYNCHRONIZE_FROM_LOCAL;
            case 10:
                return COMMAND_DEVICE_STATE_UPDATE_FROM_LOCAL;
            case 11:
                return COMMAND_SYNC_EARPHONE_BLE_TO_WATCH;
            case 12:
                return COMMAND_WATCH_SYNC_DEVICE_STATUS;
            case 13:
                return COMMAND_SYNC_DEVICE_STATUS;
            case 14:
                return COMMAND_WATCH_REQUEST_BIND_DEVICE;
            case 15:
                return COMMAND_WATCH_SYNC_DEVICE_STATUS_RESPONSE;
            case 16:
                return COMMAND_WATCH_SYNC_SUPPORT_SCAN;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<LinkageDeviceProto$LinkageCommandId> internalGetValueMap() {
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
    public static LinkageDeviceProto$LinkageCommandId valueOf(int i) {
        return forNumber(i);
    }
}
