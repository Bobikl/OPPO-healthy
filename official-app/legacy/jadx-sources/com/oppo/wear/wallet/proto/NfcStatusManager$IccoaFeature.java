package com.oppo.wear.wallet.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes9.dex */
public enum NfcStatusManager$IccoaFeature implements Internal.EnumLite {
    SUPPORT_ICCOA(0),
    SUPPORT_ICCOA_BLE(1),
    SUPPORT_ICCOA_NFC(2),
    NEED_ICCOA_USER_STATEMENT(3),
    UNRECOGNIZED(-1);

    public static final int NEED_ICCOA_USER_STATEMENT_VALUE = 3;
    public static final int SUPPORT_ICCOA_BLE_VALUE = 1;
    public static final int SUPPORT_ICCOA_NFC_VALUE = 2;
    public static final int SUPPORT_ICCOA_VALUE = 0;
    private static final Internal.EnumLiteMap<NfcStatusManager$IccoaFeature> internalValueMap = new Internal.EnumLiteMap<NfcStatusManager$IccoaFeature>() { // from class: com.oppo.wear.wallet.proto.NfcStatusManager$IccoaFeature.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NfcStatusManager$IccoaFeature findValueByNumber(int i) {
            return NfcStatusManager$IccoaFeature.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return NfcStatusManager$IccoaFeature.forNumber(i) != null;
        }
    }

    NfcStatusManager$IccoaFeature(int i) {
        this.value = i;
    }

    public static NfcStatusManager$IccoaFeature forNumber(int i) {
        if (i == 0) {
            return SUPPORT_ICCOA;
        }
        if (i == 1) {
            return SUPPORT_ICCOA_BLE;
        }
        if (i == 2) {
            return SUPPORT_ICCOA_NFC;
        }
        if (i != 3) {
            return null;
        }
        return NEED_ICCOA_USER_STATEMENT;
    }

    public static Internal.EnumLiteMap<NfcStatusManager$IccoaFeature> internalGetValueMap() {
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
    public static NfcStatusManager$IccoaFeature valueOf(int i) {
        return forNumber(i);
    }
}
