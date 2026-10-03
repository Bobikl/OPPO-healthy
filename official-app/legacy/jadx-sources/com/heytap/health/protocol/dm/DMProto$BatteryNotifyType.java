package com.heytap.health.protocol.dm;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes17.dex */
public enum DMProto$BatteryNotifyType implements Internal.EnumLite {
    UNDEF_TYPE(0),
    DM_LOW_BATTERY(1),
    CHARGE_FINISH(2),
    UNRECOGNIZED(-1);

    public static final int CHARGE_FINISH_VALUE = 2;
    public static final int DM_LOW_BATTERY_VALUE = 1;
    public static final int UNDEF_TYPE_VALUE = 0;
    private static final Internal.EnumLiteMap<DMProto$BatteryNotifyType> internalValueMap = new Internal.EnumLiteMap<DMProto$BatteryNotifyType>() { // from class: com.heytap.health.protocol.dm.DMProto$BatteryNotifyType.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DMProto$BatteryNotifyType findValueByNumber(int i) {
            return DMProto$BatteryNotifyType.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return DMProto$BatteryNotifyType.forNumber(i) != null;
        }
    }

    DMProto$BatteryNotifyType(int i) {
        this.value = i;
    }

    public static DMProto$BatteryNotifyType forNumber(int i) {
        if (i == 0) {
            return UNDEF_TYPE;
        }
        if (i == 1) {
            return DM_LOW_BATTERY;
        }
        if (i != 2) {
            return null;
        }
        return CHARGE_FINISH;
    }

    public static Internal.EnumLiteMap<DMProto$BatteryNotifyType> internalGetValueMap() {
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
    public static DMProto$BatteryNotifyType valueOf(int i) {
        return forNumber(i);
    }
}
