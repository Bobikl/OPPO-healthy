package com.heytap.health.watch.watchface.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes19.dex */
public enum Proto$WfAlbumEventType implements Internal.EnumLite {
    UNDEFINED(0),
    DELETE_PIC(1),
    SYNC_IMAGES(2),
    REPLACE_DIR(3),
    AUTO_PLAY(4),
    TEXT_COLOR(5),
    UNRECOGNIZED(-1);

    public static final int AUTO_PLAY_VALUE = 4;
    public static final int DELETE_PIC_VALUE = 1;
    public static final int REPLACE_DIR_VALUE = 3;
    public static final int SYNC_IMAGES_VALUE = 2;
    public static final int TEXT_COLOR_VALUE = 5;
    public static final int UNDEFINED_VALUE = 0;
    private static final Internal.EnumLiteMap<Proto$WfAlbumEventType> internalValueMap = new Internal.EnumLiteMap<Proto$WfAlbumEventType>() { // from class: com.heytap.health.watch.watchface.proto.Proto$WfAlbumEventType.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Proto$WfAlbumEventType findValueByNumber(int i) {
            return Proto$WfAlbumEventType.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return Proto$WfAlbumEventType.forNumber(i) != null;
        }
    }

    Proto$WfAlbumEventType(int i) {
        this.value = i;
    }

    public static Proto$WfAlbumEventType forNumber(int i) {
        if (i == 0) {
            return UNDEFINED;
        }
        if (i == 1) {
            return DELETE_PIC;
        }
        if (i == 2) {
            return SYNC_IMAGES;
        }
        if (i == 3) {
            return REPLACE_DIR;
        }
        if (i == 4) {
            return AUTO_PLAY;
        }
        if (i != 5) {
            return null;
        }
        return TEXT_COLOR;
    }

    public static Internal.EnumLiteMap<Proto$WfAlbumEventType> internalGetValueMap() {
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
    public static Proto$WfAlbumEventType valueOf(int i) {
        return forNumber(i);
    }
}
