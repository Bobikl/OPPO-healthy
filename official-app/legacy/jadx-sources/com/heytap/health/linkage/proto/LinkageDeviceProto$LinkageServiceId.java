package com.heytap.health.linkage.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes16.dex */
public enum LinkageDeviceProto$LinkageServiceId implements Internal.EnumLite {
    SERVICE_ID_LINKAGE_UNDEFINE(0),
    SERVICE_ID_LINKAGE(34),
    UNRECOGNIZED(-1);

    public static final int SERVICE_ID_LINKAGE_UNDEFINE_VALUE = 0;
    public static final int SERVICE_ID_LINKAGE_VALUE = 34;
    private static final Internal.EnumLiteMap<LinkageDeviceProto$LinkageServiceId> internalValueMap = new Internal.EnumLiteMap<LinkageDeviceProto$LinkageServiceId>() { // from class: com.heytap.health.linkage.proto.LinkageDeviceProto$LinkageServiceId.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LinkageDeviceProto$LinkageServiceId findValueByNumber(int i) {
            return LinkageDeviceProto$LinkageServiceId.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return LinkageDeviceProto$LinkageServiceId.forNumber(i) != null;
        }
    }

    LinkageDeviceProto$LinkageServiceId(int i) {
        this.value = i;
    }

    public static LinkageDeviceProto$LinkageServiceId forNumber(int i) {
        if (i == 0) {
            return SERVICE_ID_LINKAGE_UNDEFINE;
        }
        if (i != 34) {
            return null;
        }
        return SERVICE_ID_LINKAGE;
    }

    public static Internal.EnumLiteMap<LinkageDeviceProto$LinkageServiceId> internalGetValueMap() {
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
    public static LinkageDeviceProto$LinkageServiceId valueOf(int i) {
        return forNumber(i);
    }
}
