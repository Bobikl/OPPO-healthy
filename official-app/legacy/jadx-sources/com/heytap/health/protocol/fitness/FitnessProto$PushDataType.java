package com.heytap.health.protocol.fitness;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes17.dex */
public enum FitnessProto$PushDataType implements Internal.EnumLite {
    PUSH_DATA_TYPE_UNDEFINE(0),
    PUSH_DATA_DAILY_GOAL(1),
    PUSH_DATA_HEART_RATE(2),
    PUSH_DATA_SPO2(3),
    PUSH_DATA_PRAISE(4),
    PUSH_DATA_ECG(5),
    PUSH_DATA_AFIB(6),
    PUSH_DATA_FALL_DOWN(7),
    PUSH_DATA_BLOOD_GLUCOSE(8),
    PUSH_DATA_BLOOD_GLUCOSE_DEVICE(9),
    UNRECOGNIZED(-1);

    public static final int PUSH_DATA_AFIB_VALUE = 6;
    public static final int PUSH_DATA_BLOOD_GLUCOSE_DEVICE_VALUE = 9;
    public static final int PUSH_DATA_BLOOD_GLUCOSE_VALUE = 8;
    public static final int PUSH_DATA_DAILY_GOAL_VALUE = 1;
    public static final int PUSH_DATA_ECG_VALUE = 5;
    public static final int PUSH_DATA_FALL_DOWN_VALUE = 7;
    public static final int PUSH_DATA_HEART_RATE_VALUE = 2;
    public static final int PUSH_DATA_PRAISE_VALUE = 4;
    public static final int PUSH_DATA_SPO2_VALUE = 3;
    public static final int PUSH_DATA_TYPE_UNDEFINE_VALUE = 0;
    private static final Internal.EnumLiteMap<FitnessProto$PushDataType> internalValueMap = new Internal.EnumLiteMap<FitnessProto$PushDataType>() { // from class: com.heytap.health.protocol.fitness.FitnessProto$PushDataType.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FitnessProto$PushDataType findValueByNumber(int i) {
            return FitnessProto$PushDataType.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return FitnessProto$PushDataType.forNumber(i) != null;
        }
    }

    FitnessProto$PushDataType(int i) {
        this.value = i;
    }

    public static FitnessProto$PushDataType forNumber(int i) {
        switch (i) {
            case 0:
                return PUSH_DATA_TYPE_UNDEFINE;
            case 1:
                return PUSH_DATA_DAILY_GOAL;
            case 2:
                return PUSH_DATA_HEART_RATE;
            case 3:
                return PUSH_DATA_SPO2;
            case 4:
                return PUSH_DATA_PRAISE;
            case 5:
                return PUSH_DATA_ECG;
            case 6:
                return PUSH_DATA_AFIB;
            case 7:
                return PUSH_DATA_FALL_DOWN;
            case 8:
                return PUSH_DATA_BLOOD_GLUCOSE;
            case 9:
                return PUSH_DATA_BLOOD_GLUCOSE_DEVICE;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<FitnessProto$PushDataType> internalGetValueMap() {
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
    public static FitnessProto$PushDataType valueOf(int i) {
        return forNumber(i);
    }
}
