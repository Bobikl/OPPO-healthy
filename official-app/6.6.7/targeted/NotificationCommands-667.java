package com.heytap.health.watch.notification;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes19.dex */
public enum NTFCmdId2 implements Internal.EnumLite {
    CID_UNDEFINE_2(0),
    CID_POST(200),
    CID_DISMISS(CID_DISMISS_VALUE),
    CID_MSG_PICTURE(CID_MSG_PICTURE_VALUE),
    CID_MSG_ACTION_REPLY(CID_MSG_ACTION_REPLY_VALUE),
    CID_MSG_CLEAR_ALL_PICTURE(CID_MSG_CLEAR_ALL_PICTURE_VALUE),
    CID_MSG_CLEAR_PICTURE_KEY(CID_MSG_CLEAR_PICTURE_KEY_VALUE),
    CID_MSG_SYNC_AFTER_DEVICE_RESTART(CID_MSG_SYNC_AFTER_DEVICE_RESTART_VALUE),
    CID_MSG_OPEN_PHONE(CID_MSG_OPEN_PHONE_VALUE),
    CID_MSG_CLOUD_STATUS(208),
    CID_MSG_NEGOTIATE(CID_MSG_NEGOTIATE_VALUE),
    CID_MSG_NEGOTIATE_VERIFY_CODE(CID_MSG_NEGOTIATE_VERIFY_CODE_VALUE),
    CID_MSG_DEVICE_LOCK_ENABLE(CID_MSG_DEVICE_LOCK_ENABLE_VALUE),
    CID_MSG_CLOUD_SYNC(CID_MSG_CLOUD_SYNC_VALUE),
    CID_WECHAT_VOICE_MSG(CID_WECHAT_VOICE_MSG_VALUE),
    CID_SEEDING_CARD_POST(CID_SEEDING_CARD_POST_VALUE),
    CID_SEEDING_CARD_DISMISS(CID_SEEDING_CARD_DISMISS_VALUE),
    CID_SEEDING_CARD_PICTURE(CID_SEEDING_CARD_PICTURE_VALUE),
    CID_MSG_QUICK_REPLY_SYNC(CID_MSG_QUICK_REPLY_SYNC_VALUE),
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
    public static final int CID_MSG_QUICK_REPLY_SYNC_VALUE = 218;
    public static final int CID_MSG_SYNC_AFTER_DEVICE_RESTART_VALUE = 206;
    public static final int CID_POST_VALUE = 200;
    public static final int CID_SEEDING_CARD_DISMISS_VALUE = 215;
    public static final int CID_SEEDING_CARD_PICTURE_VALUE = 216;
    public static final int CID_SEEDING_CARD_POST_VALUE = 214;
    public static final int CID_UNDEFINE_2_VALUE = 0;
    public static final int CID_WECHAT_VOICE_MSG_VALUE = 213;
    private static final Internal.EnumLiteMap<NTFCmdId2> internalValueMap = new Internal.EnumLiteMap<NTFCmdId2>() { // from class: com.heytap.health.watch.notification.NTFCmdId2.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NTFCmdId2 findValueByNumber(int i) {
            return NTFCmdId2.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

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
        if (i == 218) {
            return CID_MSG_QUICK_REPLY_SYNC;
        }
        switch (i) {
            case 200:
                return CID_POST;
            case CID_DISMISS_VALUE:
                return CID_DISMISS;
            case CID_MSG_PICTURE_VALUE:
                return CID_MSG_PICTURE;
            case CID_MSG_ACTION_REPLY_VALUE:
                return CID_MSG_ACTION_REPLY;
            case CID_MSG_CLEAR_ALL_PICTURE_VALUE:
                return CID_MSG_CLEAR_ALL_PICTURE;
            case CID_MSG_CLEAR_PICTURE_KEY_VALUE:
                return CID_MSG_CLEAR_PICTURE_KEY;
            case CID_MSG_SYNC_AFTER_DEVICE_RESTART_VALUE:
                return CID_MSG_SYNC_AFTER_DEVICE_RESTART;
            case CID_MSG_OPEN_PHONE_VALUE:
                return CID_MSG_OPEN_PHONE;
            case 208:
                return CID_MSG_CLOUD_STATUS;
            case CID_MSG_NEGOTIATE_VALUE:
                return CID_MSG_NEGOTIATE;
            case CID_MSG_NEGOTIATE_VERIFY_CODE_VALUE:
                return CID_MSG_NEGOTIATE_VERIFY_CODE;
            case CID_MSG_DEVICE_LOCK_ENABLE_VALUE:
                return CID_MSG_DEVICE_LOCK_ENABLE;
            case CID_MSG_CLOUD_SYNC_VALUE:
                return CID_MSG_CLOUD_SYNC;
            case CID_WECHAT_VOICE_MSG_VALUE:
                return CID_WECHAT_VOICE_MSG;
            case CID_SEEDING_CARD_POST_VALUE:
                return CID_SEEDING_CARD_POST;
            case CID_SEEDING_CARD_DISMISS_VALUE:
                return CID_SEEDING_CARD_DISMISS;
            case CID_SEEDING_CARD_PICTURE_VALUE:
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
