package com.heytap.health.protocol.dm;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes17.dex */
public enum DMProto$OOBE_SWITCH_TYPE implements Internal.EnumLite {
    SPORT_SERVICE(0),
    UNRECOGNIZED(-1);

    public static final int SPORT_SERVICE_VALUE = 0;
    private static final Internal.EnumLiteMap<DMProto$OOBE_SWITCH_TYPE> internalValueMap = new Internal.EnumLiteMap<DMProto$OOBE_SWITCH_TYPE>() { // from class: com.heytap.health.protocol.dm.DMProto$OOBE_SWITCH_TYPE.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DMProto$OOBE_SWITCH_TYPE findValueByNumber(int i) {
            return DMProto$OOBE_SWITCH_TYPE.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return DMProto$OOBE_SWITCH_TYPE.forNumber(i) != null;
        }
    }

    DMProto$OOBE_SWITCH_TYPE(int i) {
        this.value = i;
    }

    public static DMProto$OOBE_SWITCH_TYPE forNumber(int i) {
        if (i != 0) {
            return null;
        }
        return SPORT_SERVICE;
    }

    public static Internal.EnumLiteMap<DMProto$OOBE_SWITCH_TYPE> internalGetValueMap() {
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
    public static DMProto$OOBE_SWITCH_TYPE valueOf(int i) {
        return forNumber(i);
    }
}
