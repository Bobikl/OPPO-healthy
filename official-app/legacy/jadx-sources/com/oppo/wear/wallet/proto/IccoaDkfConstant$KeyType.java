package com.oppo.wear.wallet.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes9.dex */
public enum IccoaDkfConstant$KeyType implements Internal.EnumLite {
    KEY_TYPE_UNDEFINE(0),
    KEY_TYPE_OWNER(1),
    KEY_TYPE_SHARED(2),
    KEY_TYPE_OTHER(3),
    UNRECOGNIZED(-1);

    public static final int KEY_TYPE_OTHER_VALUE = 3;
    public static final int KEY_TYPE_OWNER_VALUE = 1;
    public static final int KEY_TYPE_SHARED_VALUE = 2;
    public static final int KEY_TYPE_UNDEFINE_VALUE = 0;
    private static final Internal.EnumLiteMap<IccoaDkfConstant$KeyType> internalValueMap = new Internal.EnumLiteMap<IccoaDkfConstant$KeyType>() { // from class: com.oppo.wear.wallet.proto.IccoaDkfConstant$KeyType.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public IccoaDkfConstant$KeyType findValueByNumber(int i) {
            return IccoaDkfConstant$KeyType.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return IccoaDkfConstant$KeyType.forNumber(i) != null;
        }
    }

    IccoaDkfConstant$KeyType(int i) {
        this.value = i;
    }

    public static IccoaDkfConstant$KeyType forNumber(int i) {
        if (i == 0) {
            return KEY_TYPE_UNDEFINE;
        }
        if (i == 1) {
            return KEY_TYPE_OWNER;
        }
        if (i == 2) {
            return KEY_TYPE_SHARED;
        }
        if (i != 3) {
            return null;
        }
        return KEY_TYPE_OTHER;
    }

    public static Internal.EnumLiteMap<IccoaDkfConstant$KeyType> internalGetValueMap() {
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
    public static IccoaDkfConstant$KeyType valueOf(int i) {
        return forNumber(i);
    }
}
