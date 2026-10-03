package com.heytap.health.protocol.userinfo;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes17.dex */
public enum UserInfoProto$UserInfoServiceId implements Internal.EnumLite {
    USER_INFO_SERVICE_PLACE_HOLDER(0),
    SID_WATCH_TO_APP(4),
    SID_APP_TO_WATCH(5),
    UNRECOGNIZED(-1);

    public static final int SID_APP_TO_WATCH_VALUE = 5;
    public static final int SID_WATCH_TO_APP_VALUE = 4;
    public static final int USER_INFO_SERVICE_PLACE_HOLDER_VALUE = 0;
    private static final Internal.EnumLiteMap<UserInfoProto$UserInfoServiceId> internalValueMap = new Internal.EnumLiteMap<UserInfoProto$UserInfoServiceId>() { // from class: com.heytap.health.protocol.userinfo.UserInfoProto$UserInfoServiceId.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public UserInfoProto$UserInfoServiceId findValueByNumber(int i) {
            return UserInfoProto$UserInfoServiceId.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return UserInfoProto$UserInfoServiceId.forNumber(i) != null;
        }
    }

    UserInfoProto$UserInfoServiceId(int i) {
        this.value = i;
    }

    public static UserInfoProto$UserInfoServiceId forNumber(int i) {
        if (i == 0) {
            return USER_INFO_SERVICE_PLACE_HOLDER;
        }
        if (i == 4) {
            return SID_WATCH_TO_APP;
        }
        if (i != 5) {
            return null;
        }
        return SID_APP_TO_WATCH;
    }

    public static Internal.EnumLiteMap<UserInfoProto$UserInfoServiceId> internalGetValueMap() {
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
    public static UserInfoProto$UserInfoServiceId valueOf(int i) {
        return forNumber(i);
    }
}
