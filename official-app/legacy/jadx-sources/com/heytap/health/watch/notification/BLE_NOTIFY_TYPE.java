package com.heytap.health.watch.notification;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes19.dex */
public enum BLE_NOTIFY_TYPE implements Internal.EnumLite {
    MSG_OTHERS_NOTIFICATION(0),
    MSG_WECHAT_NOTIFICATION(1),
    MSG_QQ_NOTIFICATION(2),
    MSG_PHONE_NOTIFICATION(3),
    MSG_SMS_NOTIFICATION(4),
    MSG_RED_PACKET_NOTIFICATION(5),
    UNRECOGNIZED(-1);

    public static final int MSG_OTHERS_NOTIFICATION_VALUE = 0;
    public static final int MSG_PHONE_NOTIFICATION_VALUE = 3;
    public static final int MSG_QQ_NOTIFICATION_VALUE = 2;
    public static final int MSG_RED_PACKET_NOTIFICATION_VALUE = 5;
    public static final int MSG_SMS_NOTIFICATION_VALUE = 4;
    public static final int MSG_WECHAT_NOTIFICATION_VALUE = 1;
    private static final Internal.EnumLiteMap<BLE_NOTIFY_TYPE> internalValueMap = new Internal.EnumLiteMap<BLE_NOTIFY_TYPE>() { // from class: com.heytap.health.watch.notification.BLE_NOTIFY_TYPE.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLE_NOTIFY_TYPE findValueByNumber(int i) {
            return BLE_NOTIFY_TYPE.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return BLE_NOTIFY_TYPE.forNumber(i) != null;
        }
    }

    BLE_NOTIFY_TYPE(int i) {
        this.value = i;
    }

    public static BLE_NOTIFY_TYPE forNumber(int i) {
        if (i == 0) {
            return MSG_OTHERS_NOTIFICATION;
        }
        if (i == 1) {
            return MSG_WECHAT_NOTIFICATION;
        }
        if (i == 2) {
            return MSG_QQ_NOTIFICATION;
        }
        if (i == 3) {
            return MSG_PHONE_NOTIFICATION;
        }
        if (i == 4) {
            return MSG_SMS_NOTIFICATION;
        }
        if (i != 5) {
            return null;
        }
        return MSG_RED_PACKET_NOTIFICATION;
    }

    public static Internal.EnumLiteMap<BLE_NOTIFY_TYPE> internalGetValueMap() {
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
    public static BLE_NOTIFY_TYPE valueOf(int i) {
        return forNumber(i);
    }
}
