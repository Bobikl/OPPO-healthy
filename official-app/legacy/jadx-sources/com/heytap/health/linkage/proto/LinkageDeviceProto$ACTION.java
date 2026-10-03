package com.heytap.health.linkage.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes16.dex */
public enum LinkageDeviceProto$ACTION implements Internal.EnumLite {
    Linkage_ADD(0),
    Linkage_DELETE(1),
    Linkage_UPDATE(2),
    Linkage_CLEAR(3),
    UNRECOGNIZED(-1);

    public static final int Linkage_ADD_VALUE = 0;
    public static final int Linkage_CLEAR_VALUE = 3;
    public static final int Linkage_DELETE_VALUE = 1;
    public static final int Linkage_UPDATE_VALUE = 2;
    private static final Internal.EnumLiteMap<LinkageDeviceProto$ACTION> internalValueMap = new Internal.EnumLiteMap<LinkageDeviceProto$ACTION>() { // from class: com.heytap.health.linkage.proto.LinkageDeviceProto$ACTION.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LinkageDeviceProto$ACTION findValueByNumber(int i) {
            return LinkageDeviceProto$ACTION.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return LinkageDeviceProto$ACTION.forNumber(i) != null;
        }
    }

    LinkageDeviceProto$ACTION(int i) {
        this.value = i;
    }

    public static LinkageDeviceProto$ACTION forNumber(int i) {
        if (i == 0) {
            return Linkage_ADD;
        }
        if (i == 1) {
            return Linkage_DELETE;
        }
        if (i == 2) {
            return Linkage_UPDATE;
        }
        if (i != 3) {
            return null;
        }
        return Linkage_CLEAR;
    }

    public static Internal.EnumLiteMap<LinkageDeviceProto$ACTION> internalGetValueMap() {
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
    public static LinkageDeviceProto$ACTION valueOf(int i) {
        return forNumber(i);
    }
}
