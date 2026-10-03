package com.heytap.health.protocol.fitness;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes17.dex */
public enum GameAssistantProto$GameAssistantServiceId implements Internal.EnumLite {
    GAME_ASSISTANT_SERVICE_PLACE_HOLDER(0),
    SID_GAME_ASSISTANT(32),
    UNRECOGNIZED(-1);

    public static final int GAME_ASSISTANT_SERVICE_PLACE_HOLDER_VALUE = 0;
    public static final int SID_GAME_ASSISTANT_VALUE = 32;
    private static final Internal.EnumLiteMap<GameAssistantProto$GameAssistantServiceId> internalValueMap = new Internal.EnumLiteMap<GameAssistantProto$GameAssistantServiceId>() { // from class: com.heytap.health.protocol.fitness.GameAssistantProto$GameAssistantServiceId.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public GameAssistantProto$GameAssistantServiceId findValueByNumber(int i) {
            return GameAssistantProto$GameAssistantServiceId.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return GameAssistantProto$GameAssistantServiceId.forNumber(i) != null;
        }
    }

    GameAssistantProto$GameAssistantServiceId(int i) {
        this.value = i;
    }

    public static GameAssistantProto$GameAssistantServiceId forNumber(int i) {
        if (i == 0) {
            return GAME_ASSISTANT_SERVICE_PLACE_HOLDER;
        }
        if (i != 32) {
            return null;
        }
        return SID_GAME_ASSISTANT;
    }

    public static Internal.EnumLiteMap<GameAssistantProto$GameAssistantServiceId> internalGetValueMap() {
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
    public static GameAssistantProto$GameAssistantServiceId valueOf(int i) {
        return forNumber(i);
    }
}
