package com.heytap.health.linkage.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes16.dex */
public enum LinkageDeviceProto$Scenes implements Internal.EnumLite {
    CALL(0),
    MUSIC(1),
    UNRECOGNIZED(-1);

    public static final int CALL_VALUE = 0;
    public static final int MUSIC_VALUE = 1;
    private static final Internal.EnumLiteMap<LinkageDeviceProto$Scenes> internalValueMap = new Internal.EnumLiteMap<LinkageDeviceProto$Scenes>() { // from class: com.heytap.health.linkage.proto.LinkageDeviceProto$Scenes.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LinkageDeviceProto$Scenes findValueByNumber(int i) {
            return LinkageDeviceProto$Scenes.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return LinkageDeviceProto$Scenes.forNumber(i) != null;
        }
    }

    LinkageDeviceProto$Scenes(int i) {
        this.value = i;
    }

    public static LinkageDeviceProto$Scenes forNumber(int i) {
        if (i == 0) {
            return CALL;
        }
        if (i != 1) {
            return null;
        }
        return MUSIC;
    }

    public static Internal.EnumLiteMap<LinkageDeviceProto$Scenes> internalGetValueMap() {
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
    public static LinkageDeviceProto$Scenes valueOf(int i) {
        return forNumber(i);
    }
}
