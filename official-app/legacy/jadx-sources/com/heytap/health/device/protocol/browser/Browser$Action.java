package com.heytap.health.device.protocol.browser;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes16.dex */
public enum Browser$Action implements Internal.EnumLite {
    LABEL_UNDEFINE(0),
    LABEL_ADD(1),
    LABEL_EDIT(2),
    LABEL_DEL(3),
    UNRECOGNIZED(-1);

    public static final int LABEL_ADD_VALUE = 1;
    public static final int LABEL_DEL_VALUE = 3;
    public static final int LABEL_EDIT_VALUE = 2;
    public static final int LABEL_UNDEFINE_VALUE = 0;
    private static final Internal.EnumLiteMap<Browser$Action> internalValueMap = new Internal.EnumLiteMap<Browser$Action>() { // from class: com.heytap.health.device.protocol.browser.Browser$Action.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Browser$Action findValueByNumber(int i) {
            return Browser$Action.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return Browser$Action.forNumber(i) != null;
        }
    }

    Browser$Action(int i) {
        this.value = i;
    }

    public static Browser$Action forNumber(int i) {
        if (i == 0) {
            return LABEL_UNDEFINE;
        }
        if (i == 1) {
            return LABEL_ADD;
        }
        if (i == 2) {
            return LABEL_EDIT;
        }
        if (i != 3) {
            return null;
        }
        return LABEL_DEL;
    }

    public static Internal.EnumLiteMap<Browser$Action> internalGetValueMap() {
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
    public static Browser$Action valueOf(int i) {
        return forNumber(i);
    }
}
