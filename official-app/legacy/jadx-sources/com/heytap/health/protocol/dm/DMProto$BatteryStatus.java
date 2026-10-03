package com.heytap.health.protocol.dm;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes17.dex */
public enum DMProto$BatteryStatus implements Internal.EnumLite {
    NORMAL_USE(0),
    IS_CHARGING(1),
    UNRECOGNIZED(-1);

    public static final int IS_CHARGING_VALUE = 1;
    public static final int NORMAL_USE_VALUE = 0;
    private static final Internal.EnumLiteMap<DMProto$BatteryStatus> internalValueMap = new Internal.EnumLiteMap<DMProto$BatteryStatus>() { // from class: com.heytap.health.protocol.dm.DMProto$BatteryStatus.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DMProto$BatteryStatus findValueByNumber(int i) {
            return DMProto$BatteryStatus.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return DMProto$BatteryStatus.forNumber(i) != null;
        }
    }

    DMProto$BatteryStatus(int i) {
        this.value = i;
    }

    public static DMProto$BatteryStatus forNumber(int i) {
        if (i == 0) {
            return NORMAL_USE;
        }
        if (i != 1) {
            return null;
        }
        return IS_CHARGING;
    }

    public static Internal.EnumLiteMap<DMProto$BatteryStatus> internalGetValueMap() {
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
    public static DMProto$BatteryStatus valueOf(int i) {
        return forNumber(i);
    }
}
