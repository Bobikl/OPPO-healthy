package com.heytap.health.protocol.behavior;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes17.dex */
public enum BehaviorProto$BehaviorServiceId implements Internal.EnumLite {
    BEHAVIOR_SERVICE_PLACE_HOLDER(0),
    SID_BEHAVIOR(33),
    UNRECOGNIZED(-1);

    public static final int BEHAVIOR_SERVICE_PLACE_HOLDER_VALUE = 0;
    public static final int SID_BEHAVIOR_VALUE = 33;
    private static final Internal.EnumLiteMap<BehaviorProto$BehaviorServiceId> internalValueMap = new Internal.EnumLiteMap<BehaviorProto$BehaviorServiceId>() { // from class: com.heytap.health.protocol.behavior.BehaviorProto$BehaviorServiceId.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BehaviorProto$BehaviorServiceId findValueByNumber(int i) {
            return BehaviorProto$BehaviorServiceId.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return BehaviorProto$BehaviorServiceId.forNumber(i) != null;
        }
    }

    BehaviorProto$BehaviorServiceId(int i) {
        this.value = i;
    }

    public static BehaviorProto$BehaviorServiceId forNumber(int i) {
        if (i == 0) {
            return BEHAVIOR_SERVICE_PLACE_HOLDER;
        }
        if (i != 33) {
            return null;
        }
        return SID_BEHAVIOR;
    }

    public static Internal.EnumLiteMap<BehaviorProto$BehaviorServiceId> internalGetValueMap() {
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
    public static BehaviorProto$BehaviorServiceId valueOf(int i) {
        return forNumber(i);
    }
}
