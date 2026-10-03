package com.oplus.ocs.wearengine.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes8.dex */
public enum WearEngineProto$WEServiceId implements Internal.EnumLite {
    SERVICE_ID_WEARABLE_UNDEFINE(0),
    SERVICE_ID_WEARABLE(17),
    SERVICE_ID_WEARABLE_MCU(104),
    UNRECOGNIZED(-1);

    public static final int SERVICE_ID_WEARABLE_MCU_VALUE = 104;
    public static final int SERVICE_ID_WEARABLE_UNDEFINE_VALUE = 0;
    public static final int SERVICE_ID_WEARABLE_VALUE = 17;
    private static final Internal.EnumLiteMap<WearEngineProto$WEServiceId> internalValueMap = new Internal.EnumLiteMap<WearEngineProto$WEServiceId>() { // from class: com.oplus.ocs.wearengine.proto.WearEngineProto$WEServiceId.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public WearEngineProto$WEServiceId findValueByNumber(int i) {
            return WearEngineProto$WEServiceId.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return WearEngineProto$WEServiceId.forNumber(i) != null;
        }
    }

    WearEngineProto$WEServiceId(int i) {
        this.value = i;
    }

    public static WearEngineProto$WEServiceId forNumber(int i) {
        if (i == 0) {
            return SERVICE_ID_WEARABLE_UNDEFINE;
        }
        if (i == 17) {
            return SERVICE_ID_WEARABLE;
        }
        if (i != 104) {
            return null;
        }
        return SERVICE_ID_WEARABLE_MCU;
    }

    public static Internal.EnumLiteMap<WearEngineProto$WEServiceId> internalGetValueMap() {
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
    public static WearEngineProto$WEServiceId valueOf(int i) {
        return forNumber(i);
    }
}
