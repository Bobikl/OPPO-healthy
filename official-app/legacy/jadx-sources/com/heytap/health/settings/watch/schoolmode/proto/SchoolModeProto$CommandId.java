package com.heytap.health.settings.watch.schoolmode.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes18.dex */
public enum SchoolModeProto$CommandId implements Internal.EnumLite {
    CID_UNDEFINE(0),
    CID_CLASSROOM_MODE(1),
    CID_APP_MANAGER(2),
    CID_FLIGHT_MODE(3),
    CID_BATTERY_PROTECTION(4),
    UNRECOGNIZED(-1);

    public static final int CID_APP_MANAGER_VALUE = 2;
    public static final int CID_BATTERY_PROTECTION_VALUE = 4;
    public static final int CID_CLASSROOM_MODE_VALUE = 1;
    public static final int CID_FLIGHT_MODE_VALUE = 3;
    public static final int CID_UNDEFINE_VALUE = 0;
    private static final Internal.EnumLiteMap<SchoolModeProto$CommandId> internalValueMap = new Internal.EnumLiteMap<SchoolModeProto$CommandId>() { // from class: com.heytap.health.settings.watch.schoolmode.proto.SchoolModeProto$CommandId.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SchoolModeProto$CommandId findValueByNumber(int i) {
            return SchoolModeProto$CommandId.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return SchoolModeProto$CommandId.forNumber(i) != null;
        }
    }

    SchoolModeProto$CommandId(int i) {
        this.value = i;
    }

    public static SchoolModeProto$CommandId forNumber(int i) {
        if (i == 0) {
            return CID_UNDEFINE;
        }
        if (i == 1) {
            return CID_CLASSROOM_MODE;
        }
        if (i == 2) {
            return CID_APP_MANAGER;
        }
        if (i == 3) {
            return CID_FLIGHT_MODE;
        }
        if (i != 4) {
            return null;
        }
        return CID_BATTERY_PROTECTION;
    }

    public static Internal.EnumLiteMap<SchoolModeProto$CommandId> internalGetValueMap() {
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
    public static SchoolModeProto$CommandId valueOf(int i) {
        return forNumber(i);
    }
}
