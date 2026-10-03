package com.oppo.wear.wallet.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes9.dex */
public enum IccoaDkfConstant$BLUETOOTH_KEY_STATUS implements Internal.EnumLite {
    BLUETOOTH_KEY_STATUS_ACTIVE(0),
    BLUETOOTH_KEY_STATUS_INACTIVE(1),
    UNRECOGNIZED(-1);

    public static final int BLUETOOTH_KEY_STATUS_ACTIVE_VALUE = 0;
    public static final int BLUETOOTH_KEY_STATUS_INACTIVE_VALUE = 1;
    private static final Internal.EnumLiteMap<IccoaDkfConstant$BLUETOOTH_KEY_STATUS> internalValueMap = new Internal.EnumLiteMap<IccoaDkfConstant$BLUETOOTH_KEY_STATUS>() { // from class: com.oppo.wear.wallet.proto.IccoaDkfConstant$BLUETOOTH_KEY_STATUS.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public IccoaDkfConstant$BLUETOOTH_KEY_STATUS findValueByNumber(int i) {
            return IccoaDkfConstant$BLUETOOTH_KEY_STATUS.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return IccoaDkfConstant$BLUETOOTH_KEY_STATUS.forNumber(i) != null;
        }
    }

    IccoaDkfConstant$BLUETOOTH_KEY_STATUS(int i) {
        this.value = i;
    }

    public static IccoaDkfConstant$BLUETOOTH_KEY_STATUS forNumber(int i) {
        if (i == 0) {
            return BLUETOOTH_KEY_STATUS_ACTIVE;
        }
        if (i != 1) {
            return null;
        }
        return BLUETOOTH_KEY_STATUS_INACTIVE;
    }

    public static Internal.EnumLiteMap<IccoaDkfConstant$BLUETOOTH_KEY_STATUS> internalGetValueMap() {
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
    public static IccoaDkfConstant$BLUETOOTH_KEY_STATUS valueOf(int i) {
        return forNumber(i);
    }
}
