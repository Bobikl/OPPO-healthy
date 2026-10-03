package com.heytap.wearable.music.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes2.dex */
public enum MusicProto$ControlVolumeActionType implements Internal.EnumLite {
    ACTION_TYPE_VOLUME_DOWN(0),
    ACTION_TYPE_VOLUME_UP(1),
    UNRECOGNIZED(-1);

    public static final int ACTION_TYPE_VOLUME_DOWN_VALUE = 0;
    public static final int ACTION_TYPE_VOLUME_UP_VALUE = 1;
    private static final Internal.EnumLiteMap<MusicProto$ControlVolumeActionType> internalValueMap = new Internal.EnumLiteMap<MusicProto$ControlVolumeActionType>() { // from class: com.heytap.wearable.music.proto.MusicProto$ControlVolumeActionType.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MusicProto$ControlVolumeActionType findValueByNumber(int i) {
            return MusicProto$ControlVolumeActionType.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return MusicProto$ControlVolumeActionType.forNumber(i) != null;
        }
    }

    MusicProto$ControlVolumeActionType(int i) {
        this.value = i;
    }

    public static MusicProto$ControlVolumeActionType forNumber(int i) {
        if (i == 0) {
            return ACTION_TYPE_VOLUME_DOWN;
        }
        if (i != 1) {
            return null;
        }
        return ACTION_TYPE_VOLUME_UP;
    }

    public static Internal.EnumLiteMap<MusicProto$ControlVolumeActionType> internalGetValueMap() {
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
    public static MusicProto$ControlVolumeActionType valueOf(int i) {
        return forNumber(i);
    }
}
