package com.heytap.health.band.data;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes15.dex */
public enum PressCmd$CMD_Tpye implements Internal.EnumLite {
    CMD_UNDEFINE(0),
    CMD_DEVICE_STATE(1),
    CMD_FREE_SPACE_NOT_ENOUGH(2),
    UNRECOGNIZED(-1);

    public static final int CMD_DEVICE_STATE_VALUE = 1;
    public static final int CMD_FREE_SPACE_NOT_ENOUGH_VALUE = 2;
    public static final int CMD_UNDEFINE_VALUE = 0;
    private static final Internal.EnumLiteMap<PressCmd$CMD_Tpye> internalValueMap = new Internal.EnumLiteMap<PressCmd$CMD_Tpye>() { // from class: com.heytap.health.band.data.PressCmd$CMD_Tpye.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PressCmd$CMD_Tpye findValueByNumber(int i) {
            return PressCmd$CMD_Tpye.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return PressCmd$CMD_Tpye.forNumber(i) != null;
        }
    }

    PressCmd$CMD_Tpye(int i) {
        this.value = i;
    }

    public static PressCmd$CMD_Tpye forNumber(int i) {
        if (i == 0) {
            return CMD_UNDEFINE;
        }
        if (i == 1) {
            return CMD_DEVICE_STATE;
        }
        if (i != 2) {
            return null;
        }
        return CMD_FREE_SPACE_NOT_ENOUGH;
    }

    public static Internal.EnumLiteMap<PressCmd$CMD_Tpye> internalGetValueMap() {
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
    public static PressCmd$CMD_Tpye valueOf(int i) {
        return forNumber(i);
    }
}
