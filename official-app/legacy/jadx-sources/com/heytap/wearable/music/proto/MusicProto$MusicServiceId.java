package com.heytap.wearable.music.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes2.dex */
public enum MusicProto$MusicServiceId implements Internal.EnumLite {
    SERVICE_ID_UNDEFINE(0),
    SERVICE_ID_MUSIC(8),
    UNRECOGNIZED(-1);

    public static final int SERVICE_ID_MUSIC_VALUE = 8;
    public static final int SERVICE_ID_UNDEFINE_VALUE = 0;
    private static final Internal.EnumLiteMap<MusicProto$MusicServiceId> internalValueMap = new Internal.EnumLiteMap<MusicProto$MusicServiceId>() { // from class: com.heytap.wearable.music.proto.MusicProto$MusicServiceId.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MusicProto$MusicServiceId findValueByNumber(int i) {
            return MusicProto$MusicServiceId.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return MusicProto$MusicServiceId.forNumber(i) != null;
        }
    }

    MusicProto$MusicServiceId(int i) {
        this.value = i;
    }

    public static MusicProto$MusicServiceId forNumber(int i) {
        if (i == 0) {
            return SERVICE_ID_UNDEFINE;
        }
        if (i != 8) {
            return null;
        }
        return SERVICE_ID_MUSIC;
    }

    public static Internal.EnumLiteMap<MusicProto$MusicServiceId> internalGetValueMap() {
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
    public static MusicProto$MusicServiceId valueOf(int i) {
        return forNumber(i);
    }
}
