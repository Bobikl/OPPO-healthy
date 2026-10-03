package com.heytap.health.watch.notification;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes19.dex */
public enum NTFCmdId2 implements Internal.EnumLite {
    CID_UNDEFINE_2(0),
    CID_POST(200),
    CID_DISMISS(201),
    CID_MSG_PICTURE(202),
    CID_MSG_ACTION_REPLY(203),
    CID_MSG_CLEAR_ALL_PICTURE(204),
    CID_MSG_CLEAR_PICTURE_KEY(205),
    CID_MSG_SYNC_AFTER_DEVICE_RESTART(206),
    CID_MSG_OPEN_PHONE(207),
    CID_MSG_CLOUD_STATUS(208),
    CID_MSG_NEGOTIATE(209),
    CID_MSG_NEGOTIATE_VERIFY_CODE(210),
    CID_MSG_DEVICE_LOCK_ENABLE(211),
    CID_MSG_CLOUD_SYNC(212),
    CID_WECHAT_VOICE_MSG(213),
    CID_SEEDING_CARD_POST(214),
    CID_SEEDING_CARD_DISMISS(215),
    CID_SEEDING_CARD_PICTURE(216),
    UNRECOGNIZED(-1);

    public static final int CID_DISMISS_VALUE = 201;
    public static final int CID_MSG_ACTION_REPLY_VALUE = 203;
    public static final int CID_MSG_CLEAR_ALL_PICTURE_VALUE = 204;
    public static final int CID_MSG_CLEAR_PICTURE_KEY_VALUE = 205;
    public static final int CID_MSG_CLOUD_STATUS_VALUE = 208;
    public static final int CID_MSG_CLOUD_SYNC_VALUE = 212;
    public static final int CID_MSG_DEVICE_LOCK_ENABLE_VALUE = 211;
    public static final int CID_MSG_NEGOTIATE_VALUE = 209;
    public static final int CID_MSG_NEGOTIATE_VERIFY_CODE_VALUE = 210;
    public static final int CID_MSG_OPEN_PHONE_VALUE = 207;
    public static final int CID_MSG_PICTURE_VALUE = 202;
    public static final int CID_MSG_SYNC_AFTER_DEVICE_RESTART_VALUE = 206;
    public static final int CID_POST_VALUE = 200;
    public static final int CID_SEEDING_CARD_DISMISS_VALUE = 215;
    public static final int CID_SEEDING_CARD_PICTURE_VALUE = 216;
    public static final int CID_SEEDING_CARD_POST_VALUE = 214;
    public static final int CID_UNDEFINE_2_VALUE = 0;
    public static final int CID_WECHAT_VOICE_MSG_VALUE = 213;
    private static final Internal.EnumLiteMap<NTFCmdId2> internalValueMap = new Internal.EnumLiteMap<NTFCmdId2>() { // from class: com.heytap.health.watch.notification.NTFCmdId2.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NTFCmdId2 findValueByNumber(int i) {
            return NTFCmdId2.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return NTFCmdId2.forNumber(i) != null;
        }
    }

    NTFCmdId2(int i) {
        this.value = i;
    }

    public static NTFCmdId2 forNumber(int i) {
        if (i == 0) {
            return CID_UNDEFINE_2;
        }
        switch (i) {
            case 200:
                return CID_POST;
            case 201:
                return CID_DISMISS;
            case 202:
                return CID_MSG_PICTURE;
            case 203:
                return CID_MSG_ACTION_REPLY;
            case 204:
                return CID_MSG_CLEAR_ALL_PICTURE;
            case 205:
                return CID_MSG_CLEAR_PICTURE_KEY;
            case 206:
                return CID_MSG_SYNC_AFTER_DEVICE_RESTART;
            case 207:
                return CID_MSG_OPEN_PHONE;
            case 208:
                return CID_MSG_CLOUD_STATUS;
            case 209:
                return CID_MSG_NEGOTIATE;
            case 210:
                return CID_MSG_NEGOTIATE_VERIFY_CODE;
            case 211:
                return CID_MSG_DEVICE_LOCK_ENABLE;
            case 212:
                return CID_MSG_CLOUD_SYNC;
            case 213:
                return CID_WECHAT_VOICE_MSG;
            case 214:
                return CID_SEEDING_CARD_POST;
            case 215:
                return CID_SEEDING_CARD_DISMISS;
            case 216:
                return CID_SEEDING_CARD_PICTURE;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<NTFCmdId2> internalGetValueMap() {
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
    public static NTFCmdId2 valueOf(int i) {
        return forNumber(i);
    }
}
