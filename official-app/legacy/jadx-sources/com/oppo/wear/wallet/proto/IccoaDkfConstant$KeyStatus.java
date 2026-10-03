package com.oppo.wear.wallet.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes9.dex */
public enum IccoaDkfConstant$KeyStatus implements Internal.EnumLite {
    STATUS_UNDEFINE(0),
    STATUS_INACTIVE(2),
    STATUS_ACTIVATED(3),
    STATUS_SUSPENDED(4),
    STATUS_TERMINATED(5),
    UNRECOGNIZED(-1);

    public static final int STATUS_ACTIVATED_VALUE = 3;
    public static final int STATUS_INACTIVE_VALUE = 2;
    public static final int STATUS_SUSPENDED_VALUE = 4;
    public static final int STATUS_TERMINATED_VALUE = 5;
    public static final int STATUS_UNDEFINE_VALUE = 0;
    private static final Internal.EnumLiteMap<IccoaDkfConstant$KeyStatus> internalValueMap = new Internal.EnumLiteMap<IccoaDkfConstant$KeyStatus>() { // from class: com.oppo.wear.wallet.proto.IccoaDkfConstant$KeyStatus.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public IccoaDkfConstant$KeyStatus findValueByNumber(int i) {
            return IccoaDkfConstant$KeyStatus.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return IccoaDkfConstant$KeyStatus.forNumber(i) != null;
        }
    }

    IccoaDkfConstant$KeyStatus(int i) {
        this.value = i;
    }

    public static IccoaDkfConstant$KeyStatus forNumber(int i) {
        if (i == 0) {
            return STATUS_UNDEFINE;
        }
        if (i == 2) {
            return STATUS_INACTIVE;
        }
        if (i == 3) {
            return STATUS_ACTIVATED;
        }
        if (i == 4) {
            return STATUS_SUSPENDED;
        }
        if (i != 5) {
            return null;
        }
        return STATUS_TERMINATED;
    }

    public static Internal.EnumLiteMap<IccoaDkfConstant$KeyStatus> internalGetValueMap() {
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
    public static IccoaDkfConstant$KeyStatus valueOf(int i) {
        return forNumber(i);
    }
}
