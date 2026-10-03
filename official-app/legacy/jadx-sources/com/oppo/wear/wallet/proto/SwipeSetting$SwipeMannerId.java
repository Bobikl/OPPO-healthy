package com.oppo.wear.wallet.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes9.dex */
public enum SwipeSetting$SwipeMannerId implements Internal.EnumLite {
    SWIPEMANNERID_NONE(0),
    DEFAULT_CARD(1),
    TIME_CARD(2),
    ASSIST_SWITCH(4),
    COMBINATION_CARD(8),
    FENCE_AUTO_CARD(16),
    SMART_CARD(24),
    UNRECOGNIZED(-1);

    public static final int ASSIST_SWITCH_VALUE = 4;
    public static final int COMBINATION_CARD_VALUE = 8;
    public static final int DEFAULT_CARD_VALUE = 1;
    public static final int FENCE_AUTO_CARD_VALUE = 16;
    public static final int SMART_CARD_VALUE = 24;
    public static final int SWIPEMANNERID_NONE_VALUE = 0;
    public static final int TIME_CARD_VALUE = 2;
    private static final Internal.EnumLiteMap<SwipeSetting$SwipeMannerId> internalValueMap = new Internal.EnumLiteMap<SwipeSetting$SwipeMannerId>() { // from class: com.oppo.wear.wallet.proto.SwipeSetting$SwipeMannerId.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SwipeSetting$SwipeMannerId findValueByNumber(int i) {
            return SwipeSetting$SwipeMannerId.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return SwipeSetting$SwipeMannerId.forNumber(i) != null;
        }
    }

    SwipeSetting$SwipeMannerId(int i) {
        this.value = i;
    }

    public static SwipeSetting$SwipeMannerId forNumber(int i) {
        if (i == 0) {
            return SWIPEMANNERID_NONE;
        }
        if (i == 1) {
            return DEFAULT_CARD;
        }
        if (i == 2) {
            return TIME_CARD;
        }
        if (i == 4) {
            return ASSIST_SWITCH;
        }
        if (i == 8) {
            return COMBINATION_CARD;
        }
        if (i == 16) {
            return FENCE_AUTO_CARD;
        }
        if (i != 24) {
            return null;
        }
        return SMART_CARD;
    }

    public static Internal.EnumLiteMap<SwipeSetting$SwipeMannerId> internalGetValueMap() {
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
    public static SwipeSetting$SwipeMannerId valueOf(int i) {
        return forNumber(i);
    }
}
