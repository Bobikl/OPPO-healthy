package com.heytap.health.protocol.userevent;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes17.dex */
public enum UserEventProto$UEServiceId implements Internal.EnumLite {
    SID_UE_UNDEFINE(0),
    SID_UE(30),
    UNRECOGNIZED(-1);

    public static final int SID_UE_UNDEFINE_VALUE = 0;
    public static final int SID_UE_VALUE = 30;
    private static final Internal.EnumLiteMap<UserEventProto$UEServiceId> internalValueMap = new Internal.EnumLiteMap<UserEventProto$UEServiceId>() { // from class: com.heytap.health.protocol.userevent.UserEventProto$UEServiceId.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public UserEventProto$UEServiceId findValueByNumber(int i) {
            return UserEventProto$UEServiceId.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return UserEventProto$UEServiceId.forNumber(i) != null;
        }
    }

    UserEventProto$UEServiceId(int i) {
        this.value = i;
    }

    public static UserEventProto$UEServiceId forNumber(int i) {
        if (i == 0) {
            return SID_UE_UNDEFINE;
        }
        if (i != 30) {
            return null;
        }
        return SID_UE;
    }

    public static Internal.EnumLiteMap<UserEventProto$UEServiceId> internalGetValueMap() {
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
    public static UserEventProto$UEServiceId valueOf(int i) {
        return forNumber(i);
    }
}
