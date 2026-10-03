package com.heytap.health.linkage.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes16.dex */
public enum LinkageDeviceProto$BondStatus implements Internal.EnumLite {
    Linkage_NONE(0),
    Linkage_BONDED(1),
    Linkage_INVALID(2),
    Linkage_UNBOND(3),
    UNRECOGNIZED(-1);

    public static final int Linkage_BONDED_VALUE = 1;
    public static final int Linkage_INVALID_VALUE = 2;
    public static final int Linkage_NONE_VALUE = 0;
    public static final int Linkage_UNBOND_VALUE = 3;
    private static final Internal.EnumLiteMap<LinkageDeviceProto$BondStatus> internalValueMap = new Internal.EnumLiteMap<LinkageDeviceProto$BondStatus>() { // from class: com.heytap.health.linkage.proto.LinkageDeviceProto$BondStatus.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LinkageDeviceProto$BondStatus findValueByNumber(int i) {
            return LinkageDeviceProto$BondStatus.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return LinkageDeviceProto$BondStatus.forNumber(i) != null;
        }
    }

    LinkageDeviceProto$BondStatus(int i) {
        this.value = i;
    }

    public static LinkageDeviceProto$BondStatus forNumber(int i) {
        if (i == 0) {
            return Linkage_NONE;
        }
        if (i == 1) {
            return Linkage_BONDED;
        }
        if (i == 2) {
            return Linkage_INVALID;
        }
        if (i != 3) {
            return null;
        }
        return Linkage_UNBOND;
    }

    public static Internal.EnumLiteMap<LinkageDeviceProto$BondStatus> internalGetValueMap() {
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
    public static LinkageDeviceProto$BondStatus valueOf(int i) {
        return forNumber(i);
    }
}
