package com.heytap.wearable.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes2.dex */
public enum AutoLinkCID implements Internal.EnumLite {
    PLACE(0),
    GET_COMPANION_WIFI_STATE(1),
    GET_WATCH_WIFI_STATE(2),
    GET_COMPANION_GO_PARAM(3),
    NOTIFY_COMPANION_GO_PARAM(4),
    NOTIFY_AF_WIFI_TRANSPORT(5),
    REQUEST_CLOSE_GROUP(6),
    WATCH_REQ_REMOVE_GO(7),
    SERVICE_ID(103),
    UNRECOGNIZED(-1);

    public static final int GET_COMPANION_GO_PARAM_VALUE = 3;
    public static final int GET_COMPANION_WIFI_STATE_VALUE = 1;
    public static final int GET_WATCH_WIFI_STATE_VALUE = 2;
    public static final int NOTIFY_AF_WIFI_TRANSPORT_VALUE = 5;
    public static final int NOTIFY_COMPANION_GO_PARAM_VALUE = 4;
    public static final int PLACE_VALUE = 0;
    public static final int REQUEST_CLOSE_GROUP_VALUE = 6;
    public static final int SERVICE_ID_VALUE = 103;
    public static final int WATCH_REQ_REMOVE_GO_VALUE = 7;
    private static final Internal.EnumLiteMap<AutoLinkCID> internalValueMap = new Internal.EnumLiteMap<AutoLinkCID>() { // from class: com.heytap.wearable.proto.AutoLinkCID.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AutoLinkCID findValueByNumber(int i) {
            return AutoLinkCID.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return AutoLinkCID.forNumber(i) != null;
        }
    }

    AutoLinkCID(int i) {
        this.value = i;
    }

    public static AutoLinkCID forNumber(int i) {
        if (i == 103) {
            return SERVICE_ID;
        }
        switch (i) {
            case 0:
                return PLACE;
            case 1:
                return GET_COMPANION_WIFI_STATE;
            case 2:
                return GET_WATCH_WIFI_STATE;
            case 3:
                return GET_COMPANION_GO_PARAM;
            case 4:
                return NOTIFY_COMPANION_GO_PARAM;
            case 5:
                return NOTIFY_AF_WIFI_TRANSPORT;
            case 6:
                return REQUEST_CLOSE_GROUP;
            case 7:
                return WATCH_REQ_REMOVE_GO;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<AutoLinkCID> internalGetValueMap() {
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
    public static AutoLinkCID valueOf(int i) {
        return forNumber(i);
    }
}
