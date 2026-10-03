package com.heytap.health.protocol.fitness;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes17.dex */
public enum GameAssistantProto$StatusResultCode implements Internal.EnumLite {
    RESULTCODE_SUCCESS(0),
    RESULTCODE_FAILE(1),
    UNRECOGNIZED(-1);

    public static final int RESULTCODE_FAILE_VALUE = 1;
    public static final int RESULTCODE_SUCCESS_VALUE = 0;
    private static final Internal.EnumLiteMap<GameAssistantProto$StatusResultCode> internalValueMap = new Internal.EnumLiteMap<GameAssistantProto$StatusResultCode>() { // from class: com.heytap.health.protocol.fitness.GameAssistantProto$StatusResultCode.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public GameAssistantProto$StatusResultCode findValueByNumber(int i) {
            return GameAssistantProto$StatusResultCode.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return GameAssistantProto$StatusResultCode.forNumber(i) != null;
        }
    }

    GameAssistantProto$StatusResultCode(int i) {
        this.value = i;
    }

    public static GameAssistantProto$StatusResultCode forNumber(int i) {
        if (i == 0) {
            return RESULTCODE_SUCCESS;
        }
        if (i != 1) {
            return null;
        }
        return RESULTCODE_FAILE;
    }

    public static Internal.EnumLiteMap<GameAssistantProto$StatusResultCode> internalGetValueMap() {
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
    public static GameAssistantProto$StatusResultCode valueOf(int i) {
        return forNumber(i);
    }
}
