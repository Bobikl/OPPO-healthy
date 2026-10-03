package com.oppo.wear.wallet.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes9.dex */
public enum IccoaDkfConstant$CloudConstants_Capability implements Internal.EnumLite {
    TYPE_UNDEFINE(0),
    TYPE_BLUETOOTH_ONLY(1),
    TYPE_NFC_ONLY(2),
    TYPE_BLUETOOTH_AND_NFC(3),
    UNRECOGNIZED(-1);

    public static final int TYPE_BLUETOOTH_AND_NFC_VALUE = 3;
    public static final int TYPE_BLUETOOTH_ONLY_VALUE = 1;
    public static final int TYPE_NFC_ONLY_VALUE = 2;
    public static final int TYPE_UNDEFINE_VALUE = 0;
    private static final Internal.EnumLiteMap<IccoaDkfConstant$CloudConstants_Capability> internalValueMap = new Internal.EnumLiteMap<IccoaDkfConstant$CloudConstants_Capability>() { // from class: com.oppo.wear.wallet.proto.IccoaDkfConstant$CloudConstants_Capability.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public IccoaDkfConstant$CloudConstants_Capability findValueByNumber(int i) {
            return IccoaDkfConstant$CloudConstants_Capability.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return IccoaDkfConstant$CloudConstants_Capability.forNumber(i) != null;
        }
    }

    IccoaDkfConstant$CloudConstants_Capability(int i) {
        this.value = i;
    }

    public static IccoaDkfConstant$CloudConstants_Capability forNumber(int i) {
        if (i == 0) {
            return TYPE_UNDEFINE;
        }
        if (i == 1) {
            return TYPE_BLUETOOTH_ONLY;
        }
        if (i == 2) {
            return TYPE_NFC_ONLY;
        }
        if (i != 3) {
            return null;
        }
        return TYPE_BLUETOOTH_AND_NFC;
    }

    public static Internal.EnumLiteMap<IccoaDkfConstant$CloudConstants_Capability> internalGetValueMap() {
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
    public static IccoaDkfConstant$CloudConstants_Capability valueOf(int i) {
        return forNumber(i);
    }
}
