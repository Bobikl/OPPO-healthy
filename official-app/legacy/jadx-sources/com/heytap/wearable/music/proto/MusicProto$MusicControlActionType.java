package com.heytap.wearable.music.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes2.dex */
public enum MusicProto$MusicControlActionType implements Internal.EnumLite {
    MUSIC_ACTION_TYPE_STOP(0),
    MUSIC_ACTION_TYPE_PRE(1),
    MUSIC_ACTION_TYPE_NEXT(2),
    UNRECOGNIZED(-1);

    public static final int MUSIC_ACTION_TYPE_NEXT_VALUE = 2;
    public static final int MUSIC_ACTION_TYPE_PRE_VALUE = 1;
    public static final int MUSIC_ACTION_TYPE_STOP_VALUE = 0;
    private static final Internal.EnumLiteMap<MusicProto$MusicControlActionType> internalValueMap = new Internal.EnumLiteMap<MusicProto$MusicControlActionType>() { // from class: com.heytap.wearable.music.proto.MusicProto$MusicControlActionType.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MusicProto$MusicControlActionType findValueByNumber(int i) {
            return MusicProto$MusicControlActionType.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return MusicProto$MusicControlActionType.forNumber(i) != null;
        }
    }

    MusicProto$MusicControlActionType(int i) {
        this.value = i;
    }

    public static MusicProto$MusicControlActionType forNumber(int i) {
        if (i == 0) {
            return MUSIC_ACTION_TYPE_STOP;
        }
        if (i == 1) {
            return MUSIC_ACTION_TYPE_PRE;
        }
        if (i != 2) {
            return null;
        }
        return MUSIC_ACTION_TYPE_NEXT;
    }

    public static Internal.EnumLiteMap<MusicProto$MusicControlActionType> internalGetValueMap() {
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
    public static MusicProto$MusicControlActionType valueOf(int i) {
        return forNumber(i);
    }
}
