package com.heytap.wearable.health;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes2.dex */
public enum Exercise$RemindActionType implements Internal.EnumLite {
    REMIND_ACTION_UNKNOWN(0),
    REMIND_ACTION_PAUSE(1),
    REMIND_ACTION_RESUME(2),
    REMIND_ACTION_STOP(3),
    UNRECOGNIZED(-1);

    public static final int REMIND_ACTION_PAUSE_VALUE = 1;
    public static final int REMIND_ACTION_RESUME_VALUE = 2;
    public static final int REMIND_ACTION_STOP_VALUE = 3;
    public static final int REMIND_ACTION_UNKNOWN_VALUE = 0;
    private static final Internal.EnumLiteMap<Exercise$RemindActionType> internalValueMap = new Internal.EnumLiteMap<Exercise$RemindActionType>() { // from class: com.heytap.wearable.health.Exercise$RemindActionType.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Exercise$RemindActionType findValueByNumber(int i) {
            return Exercise$RemindActionType.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return Exercise$RemindActionType.forNumber(i) != null;
        }
    }

    Exercise$RemindActionType(int i) {
        this.value = i;
    }

    public static Exercise$RemindActionType forNumber(int i) {
        if (i == 0) {
            return REMIND_ACTION_UNKNOWN;
        }
        if (i == 1) {
            return REMIND_ACTION_PAUSE;
        }
        if (i == 2) {
            return REMIND_ACTION_RESUME;
        }
        if (i != 3) {
            return null;
        }
        return REMIND_ACTION_STOP;
    }

    public static Internal.EnumLiteMap<Exercise$RemindActionType> internalGetValueMap() {
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
    public static Exercise$RemindActionType valueOf(int i) {
        return forNumber(i);
    }
}
