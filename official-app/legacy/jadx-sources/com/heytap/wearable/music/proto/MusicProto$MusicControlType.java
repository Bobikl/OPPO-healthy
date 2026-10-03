package com.heytap.wearable.music.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes2.dex */
public enum MusicProto$MusicControlType implements Internal.EnumLite {
    TYPE_REQUEST(0),
    TYPE_SET(1),
    TYPE_RESPONSE(2),
    UNRECOGNIZED(-1);

    public static final int TYPE_REQUEST_VALUE = 0;
    public static final int TYPE_RESPONSE_VALUE = 2;
    public static final int TYPE_SET_VALUE = 1;
    private static final Internal.EnumLiteMap<MusicProto$MusicControlType> internalValueMap = new Internal.EnumLiteMap<MusicProto$MusicControlType>() { // from class: com.heytap.wearable.music.proto.MusicProto$MusicControlType.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MusicProto$MusicControlType findValueByNumber(int i) {
            return MusicProto$MusicControlType.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return MusicProto$MusicControlType.forNumber(i) != null;
        }
    }

    MusicProto$MusicControlType(int i) {
        this.value = i;
    }

    public static MusicProto$MusicControlType forNumber(int i) {
        if (i == 0) {
            return TYPE_REQUEST;
        }
        if (i == 1) {
            return TYPE_SET;
        }
        if (i != 2) {
            return null;
        }
        return TYPE_RESPONSE;
    }

    public static Internal.EnumLiteMap<MusicProto$MusicControlType> internalGetValueMap() {
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
    public static MusicProto$MusicControlType valueOf(int i) {
        return forNumber(i);
    }
}
