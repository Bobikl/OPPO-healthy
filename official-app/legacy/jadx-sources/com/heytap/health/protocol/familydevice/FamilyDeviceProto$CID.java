package com.heytap.health.protocol.familydevice;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes17.dex */
public enum FamilyDeviceProto$CID implements Internal.EnumLite {
    CID_UNDEFINE(0),
    CID_FAMIlY_DEVICE_PAIR_INFO(1),
    UNRECOGNIZED(-1);

    public static final int CID_FAMIlY_DEVICE_PAIR_INFO_VALUE = 1;
    public static final int CID_UNDEFINE_VALUE = 0;
    private static final Internal.EnumLiteMap<FamilyDeviceProto$CID> internalValueMap = new Internal.EnumLiteMap<FamilyDeviceProto$CID>() { // from class: com.heytap.health.protocol.familydevice.FamilyDeviceProto$CID.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FamilyDeviceProto$CID findValueByNumber(int i) {
            return FamilyDeviceProto$CID.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return FamilyDeviceProto$CID.forNumber(i) != null;
        }
    }

    FamilyDeviceProto$CID(int i) {
        this.value = i;
    }

    public static FamilyDeviceProto$CID forNumber(int i) {
        if (i == 0) {
            return CID_UNDEFINE;
        }
        if (i != 1) {
            return null;
        }
        return CID_FAMIlY_DEVICE_PAIR_INFO;
    }

    public static Internal.EnumLiteMap<FamilyDeviceProto$CID> internalGetValueMap() {
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
    public static FamilyDeviceProto$CID valueOf(int i) {
        return forNumber(i);
    }
}
