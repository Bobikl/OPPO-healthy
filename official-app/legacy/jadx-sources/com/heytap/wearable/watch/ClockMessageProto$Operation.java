package com.heytap.wearable.watch;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes3.dex */
public enum ClockMessageProto$Operation implements Internal.EnumLite {
    DEFAULT(0),
    DELAY_ALARM(1),
    STOP_ALARM(2),
    UNRECOGNIZED(-1);

    public static final int DEFAULT_VALUE = 0;
    public static final int DELAY_ALARM_VALUE = 1;
    public static final int STOP_ALARM_VALUE = 2;
    private static final Internal.EnumLiteMap<ClockMessageProto$Operation> internalValueMap = new Internal.EnumLiteMap<ClockMessageProto$Operation>() { // from class: com.heytap.wearable.watch.ClockMessageProto$Operation.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ClockMessageProto$Operation findValueByNumber(int i) {
            return ClockMessageProto$Operation.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return ClockMessageProto$Operation.forNumber(i) != null;
        }
    }

    ClockMessageProto$Operation(int i) {
        this.value = i;
    }

    public static ClockMessageProto$Operation forNumber(int i) {
        if (i == 0) {
            return DEFAULT;
        }
        if (i == 1) {
            return DELAY_ALARM;
        }
        if (i != 2) {
            return null;
        }
        return STOP_ALARM;
    }

    public static Internal.EnumLiteMap<ClockMessageProto$Operation> internalGetValueMap() {
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
    public static ClockMessageProto$Operation valueOf(int i) {
        return forNumber(i);
    }
}
