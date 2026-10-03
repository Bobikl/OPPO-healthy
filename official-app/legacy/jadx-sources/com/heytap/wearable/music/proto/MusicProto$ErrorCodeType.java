package com.heytap.wearable.music.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes2.dex */
public enum MusicProto$ErrorCodeType implements Internal.EnumLite {
    ERROR_CODE_DEFAULT(0),
    ERROR_CODE_SUCCESS(100000),
    ERROR_CODE_BUSY(100005),
    UNRECOGNIZED(-1);

    public static final int ERROR_CODE_BUSY_VALUE = 100005;
    public static final int ERROR_CODE_DEFAULT_VALUE = 0;
    public static final int ERROR_CODE_SUCCESS_VALUE = 100000;
    private static final Internal.EnumLiteMap<MusicProto$ErrorCodeType> internalValueMap = new Internal.EnumLiteMap<MusicProto$ErrorCodeType>() { // from class: com.heytap.wearable.music.proto.MusicProto$ErrorCodeType.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MusicProto$ErrorCodeType findValueByNumber(int i) {
            return MusicProto$ErrorCodeType.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return MusicProto$ErrorCodeType.forNumber(i) != null;
        }
    }

    MusicProto$ErrorCodeType(int i) {
        this.value = i;
    }

    public static MusicProto$ErrorCodeType forNumber(int i) {
        if (i == 0) {
            return ERROR_CODE_DEFAULT;
        }
        if (i == 100000) {
            return ERROR_CODE_SUCCESS;
        }
        if (i != 100005) {
            return null;
        }
        return ERROR_CODE_BUSY;
    }

    public static Internal.EnumLiteMap<MusicProto$ErrorCodeType> internalGetValueMap() {
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
    public static MusicProto$ErrorCodeType valueOf(int i) {
        return forNumber(i);
    }
}
