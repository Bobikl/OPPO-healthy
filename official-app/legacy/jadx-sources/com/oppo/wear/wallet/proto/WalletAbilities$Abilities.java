package com.oppo.wear.wallet.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes9.dex */
public enum WalletAbilities$Abilities implements Internal.EnumLite {
    AUTO_SWIPE(0),
    UNRECOGNIZED(-1);

    public static final int AUTO_SWIPE_VALUE = 0;
    private static final Internal.EnumLiteMap<WalletAbilities$Abilities> internalValueMap = new Internal.EnumLiteMap<WalletAbilities$Abilities>() { // from class: com.oppo.wear.wallet.proto.WalletAbilities$Abilities.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public WalletAbilities$Abilities findValueByNumber(int i) {
            return WalletAbilities$Abilities.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return WalletAbilities$Abilities.forNumber(i) != null;
        }
    }

    WalletAbilities$Abilities(int i) {
        this.value = i;
    }

    public static WalletAbilities$Abilities forNumber(int i) {
        if (i != 0) {
            return null;
        }
        return AUTO_SWIPE;
    }

    public static Internal.EnumLiteMap<WalletAbilities$Abilities> internalGetValueMap() {
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
    public static WalletAbilities$Abilities valueOf(int i) {
        return forNumber(i);
    }
}
