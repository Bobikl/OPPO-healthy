package com.heytap.wearable.music.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes2.dex */
public enum MusicProto$PlayStateType implements Internal.EnumLite {
    PLAY_STATE_PLAYING(0),
    PLAY_STATE_STOP(1),
    PLAY_STATE_CACHE_ING(2),
    UNRECOGNIZED(-1);

    public static final int PLAY_STATE_CACHE_ING_VALUE = 2;
    public static final int PLAY_STATE_PLAYING_VALUE = 0;
    public static final int PLAY_STATE_STOP_VALUE = 1;
    private static final Internal.EnumLiteMap<MusicProto$PlayStateType> internalValueMap = new Internal.EnumLiteMap<MusicProto$PlayStateType>() { // from class: com.heytap.wearable.music.proto.MusicProto$PlayStateType.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MusicProto$PlayStateType findValueByNumber(int i) {
            return MusicProto$PlayStateType.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return MusicProto$PlayStateType.forNumber(i) != null;
        }
    }

    MusicProto$PlayStateType(int i) {
        this.value = i;
    }

    public static MusicProto$PlayStateType forNumber(int i) {
        if (i == 0) {
            return PLAY_STATE_PLAYING;
        }
        if (i == 1) {
            return PLAY_STATE_STOP;
        }
        if (i != 2) {
            return null;
        }
        return PLAY_STATE_CACHE_ING;
    }

    public static Internal.EnumLiteMap<MusicProto$PlayStateType> internalGetValueMap() {
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
    public static MusicProto$PlayStateType valueOf(int i) {
        return forNumber(i);
    }
}
