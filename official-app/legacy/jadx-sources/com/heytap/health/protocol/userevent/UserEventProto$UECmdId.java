package com.heytap.health.protocol.userevent;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes17.dex */
public enum UserEventProto$UECmdId implements Internal.EnumLite {
    CID_UE_UNDEFINE(0),
    CID_UE_UPLOAD(1),
    CID_OUT_SALE_MODE(2),
    UNRECOGNIZED(-1);

    public static final int CID_OUT_SALE_MODE_VALUE = 2;
    public static final int CID_UE_UNDEFINE_VALUE = 0;
    public static final int CID_UE_UPLOAD_VALUE = 1;
    private static final Internal.EnumLiteMap<UserEventProto$UECmdId> internalValueMap = new Internal.EnumLiteMap<UserEventProto$UECmdId>() { // from class: com.heytap.health.protocol.userevent.UserEventProto$UECmdId.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public UserEventProto$UECmdId findValueByNumber(int i) {
            return UserEventProto$UECmdId.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return UserEventProto$UECmdId.forNumber(i) != null;
        }
    }

    UserEventProto$UECmdId(int i) {
        this.value = i;
    }

    public static UserEventProto$UECmdId forNumber(int i) {
        if (i == 0) {
            return CID_UE_UNDEFINE;
        }
        if (i == 1) {
            return CID_UE_UPLOAD;
        }
        if (i != 2) {
            return null;
        }
        return CID_OUT_SALE_MODE;
    }

    public static Internal.EnumLiteMap<UserEventProto$UECmdId> internalGetValueMap() {
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
    public static UserEventProto$UECmdId valueOf(int i) {
        return forNumber(i);
    }
}
