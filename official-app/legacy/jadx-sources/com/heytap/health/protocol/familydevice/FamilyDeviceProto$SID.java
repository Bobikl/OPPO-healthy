package com.heytap.health.protocol.familydevice;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes17.dex */
public enum FamilyDeviceProto$SID implements Internal.EnumLite {
    SID_UNDEFINE(0),
    SID_FAMILY_DEVICE(266),
    UNRECOGNIZED(-1);

    public static final int SID_FAMILY_DEVICE_VALUE = 266;
    public static final int SID_UNDEFINE_VALUE = 0;
    private static final Internal.EnumLiteMap<FamilyDeviceProto$SID> internalValueMap = new Internal.EnumLiteMap<FamilyDeviceProto$SID>() { // from class: com.heytap.health.protocol.familydevice.FamilyDeviceProto$SID.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FamilyDeviceProto$SID findValueByNumber(int i) {
            return FamilyDeviceProto$SID.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return FamilyDeviceProto$SID.forNumber(i) != null;
        }
    }

    FamilyDeviceProto$SID(int i) {
        this.value = i;
    }

    public static FamilyDeviceProto$SID forNumber(int i) {
        if (i == 0) {
            return SID_UNDEFINE;
        }
        if (i != 266) {
            return null;
        }
        return SID_FAMILY_DEVICE;
    }

    public static Internal.EnumLiteMap<FamilyDeviceProto$SID> internalGetValueMap() {
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
    public static FamilyDeviceProto$SID valueOf(int i) {
        return forNumber(i);
    }
}
