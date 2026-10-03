package com.heytap.health.watch.watchface.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes19.dex */
public enum Proto$WfCommand implements Internal.EnumLite {
    DEFAULT(0),
    SYNC_DEVICE_INFO(1),
    SYNC_REQUEST(2),
    SYNC(3),
    BASE_EVENT(4),
    ALBUM(5),
    LOCATION(6),
    APP_CHANGE(8),
    ASK_STATUS_FOR_SEND_FILE(15),
    ASK_STATUS_RESP(16),
    INSTALL_STATUS_RESP(17),
    CREATION_SYNC_RES(18),
    CREATION_SYNC_STYLE(19),
    CREATION_SYNC_STYLE_BACK(20),
    HISTORY_WATCH_FACES(21),
    APP_CHANGE_V2(22),
    EDIT_SYNC_REQUEST(23),
    EDIT_SYNC_RESPONSE(24),
    DEVICE_NO_STATUS_CHANGE(25),
    PAY_INFO_SYNC(26),
    WIDGET_SUPPORT_LIST_REQUEST(27),
    WIDGET_SUPPORT_LIST_RESPONSE(28),
    UNRECOGNIZED(-1);

    public static final int ALBUM_VALUE = 5;
    public static final int APP_CHANGE_V2_VALUE = 22;
    public static final int APP_CHANGE_VALUE = 8;
    public static final int ASK_STATUS_FOR_SEND_FILE_VALUE = 15;
    public static final int ASK_STATUS_RESP_VALUE = 16;
    public static final int BASE_EVENT_VALUE = 4;
    public static final int CREATION_SYNC_RES_VALUE = 18;
    public static final int CREATION_SYNC_STYLE_BACK_VALUE = 20;
    public static final int CREATION_SYNC_STYLE_VALUE = 19;
    public static final int DEFAULT_VALUE = 0;
    public static final int DEVICE_NO_STATUS_CHANGE_VALUE = 25;
    public static final int EDIT_SYNC_REQUEST_VALUE = 23;
    public static final int EDIT_SYNC_RESPONSE_VALUE = 24;
    public static final int HISTORY_WATCH_FACES_VALUE = 21;
    public static final int INSTALL_STATUS_RESP_VALUE = 17;
    public static final int LOCATION_VALUE = 6;
    public static final int PAY_INFO_SYNC_VALUE = 26;
    public static final int SYNC_DEVICE_INFO_VALUE = 1;
    public static final int SYNC_REQUEST_VALUE = 2;
    public static final int SYNC_VALUE = 3;
    public static final int WIDGET_SUPPORT_LIST_REQUEST_VALUE = 27;
    public static final int WIDGET_SUPPORT_LIST_RESPONSE_VALUE = 28;
    private static final Internal.EnumLiteMap<Proto$WfCommand> internalValueMap = new Internal.EnumLiteMap<Proto$WfCommand>() { // from class: com.heytap.health.watch.watchface.proto.Proto$WfCommand.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Proto$WfCommand findValueByNumber(int i) {
            return Proto$WfCommand.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return Proto$WfCommand.forNumber(i) != null;
        }
    }

    Proto$WfCommand(int i) {
        this.value = i;
    }

    public static Proto$WfCommand forNumber(int i) {
        if (i == 8) {
            return APP_CHANGE;
        }
        switch (i) {
            case 0:
                return DEFAULT;
            case 1:
                return SYNC_DEVICE_INFO;
            case 2:
                return SYNC_REQUEST;
            case 3:
                return SYNC;
            case 4:
                return BASE_EVENT;
            case 5:
                return ALBUM;
            case 6:
                return LOCATION;
            default:
                switch (i) {
                    case 15:
                        return ASK_STATUS_FOR_SEND_FILE;
                    case 16:
                        return ASK_STATUS_RESP;
                    case 17:
                        return INSTALL_STATUS_RESP;
                    case 18:
                        return CREATION_SYNC_RES;
                    case 19:
                        return CREATION_SYNC_STYLE;
                    case 20:
                        return CREATION_SYNC_STYLE_BACK;
                    case 21:
                        return HISTORY_WATCH_FACES;
                    case 22:
                        return APP_CHANGE_V2;
                    case 23:
                        return EDIT_SYNC_REQUEST;
                    case 24:
                        return EDIT_SYNC_RESPONSE;
                    case 25:
                        return DEVICE_NO_STATUS_CHANGE;
                    case 26:
                        return PAY_INFO_SYNC;
                    case 27:
                        return WIDGET_SUPPORT_LIST_REQUEST;
                    case 28:
                        return WIDGET_SUPPORT_LIST_RESPONSE;
                    default:
                        return null;
                }
        }
    }

    public static Internal.EnumLiteMap<Proto$WfCommand> internalGetValueMap() {
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
    public static Proto$WfCommand valueOf(int i) {
        return forNumber(i);
    }
}
