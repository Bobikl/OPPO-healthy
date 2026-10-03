package com.heytap.health.protocol.userinfo;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes17.dex */
public enum UserInfoProto$UserInfoCmdId implements Internal.EnumLite {
    USER_INFO_COMMAND_PLACE_HOLDER(0),
    CID_WATCH_TO_APP(32),
    CID_APP_TO_WATCH(3),
    CID_WEIGHT_GOAL(55),
    CID_SEND_USER_INFO_TO_DEVICE(242),
    CID_RECEIVER_USER_INFO_FROM_DEVICE(CID_RECEIVER_USER_INFO_FROM_DEVICE_VALUE),
    UNRECOGNIZED(-1);

    public static final int CID_APP_TO_WATCH_VALUE = 3;
    public static final int CID_RECEIVER_USER_INFO_FROM_DEVICE_VALUE = 245;
    public static final int CID_SEND_USER_INFO_TO_DEVICE_VALUE = 242;
    public static final int CID_WATCH_TO_APP_VALUE = 32;
    public static final int CID_WEIGHT_GOAL_VALUE = 55;
    public static final int USER_INFO_COMMAND_PLACE_HOLDER_VALUE = 0;
    private static final Internal.EnumLiteMap<UserInfoProto$UserInfoCmdId> internalValueMap = new Internal.EnumLiteMap<UserInfoProto$UserInfoCmdId>() { // from class: com.heytap.health.protocol.userinfo.UserInfoProto$UserInfoCmdId.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public UserInfoProto$UserInfoCmdId findValueByNumber(int i) {
            return UserInfoProto$UserInfoCmdId.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return UserInfoProto$UserInfoCmdId.forNumber(i) != null;
        }
    }

    UserInfoProto$UserInfoCmdId(int i) {
        this.value = i;
    }

    public static UserInfoProto$UserInfoCmdId forNumber(int i) {
        if (i == 0) {
            return USER_INFO_COMMAND_PLACE_HOLDER;
        }
        if (i == 3) {
            return CID_APP_TO_WATCH;
        }
        if (i == 32) {
            return CID_WATCH_TO_APP;
        }
        if (i == 55) {
            return CID_WEIGHT_GOAL;
        }
        if (i == 242) {
            return CID_SEND_USER_INFO_TO_DEVICE;
        }
        if (i != 245) {
            return null;
        }
        return CID_RECEIVER_USER_INFO_FROM_DEVICE;
    }

    public static Internal.EnumLiteMap<UserInfoProto$UserInfoCmdId> internalGetValueMap() {
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
    public static UserInfoProto$UserInfoCmdId valueOf(int i) {
        return forNumber(i);
    }
}
