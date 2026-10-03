package com.heytap.health.band.data;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes15.dex */
public enum PressTestProto$DIRECTION implements Internal.EnumLite {
    REQUEST(0),
    RESPONSE(1),
    UNRECOGNIZED(-1);

    public static final int REQUEST_VALUE = 0;
    public static final int RESPONSE_VALUE = 1;
    private static final Internal.EnumLiteMap<PressTestProto$DIRECTION> internalValueMap = new Internal.EnumLiteMap<PressTestProto$DIRECTION>() { // from class: com.heytap.health.band.data.PressTestProto$DIRECTION.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PressTestProto$DIRECTION findValueByNumber(int i) {
            return PressTestProto$DIRECTION.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return PressTestProto$DIRECTION.forNumber(i) != null;
        }
    }

    PressTestProto$DIRECTION(int i) {
        this.value = i;
    }

    public static PressTestProto$DIRECTION forNumber(int i) {
        if (i == 0) {
            return REQUEST;
        }
        if (i != 1) {
            return null;
        }
        return RESPONSE;
    }

    public static Internal.EnumLiteMap<PressTestProto$DIRECTION> internalGetValueMap() {
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
    public static PressTestProto$DIRECTION valueOf(int i) {
        return forNumber(i);
    }
}
