package com.heytap.health.protocol.dnd;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes17.dex */
public enum DNDProto$DNDStatus implements Internal.EnumLite {
    STATUS_DISABLE(0),
    STATUS_ENABLE(1),
    UNRECOGNIZED(-1);

    public static final int STATUS_DISABLE_VALUE = 0;
    public static final int STATUS_ENABLE_VALUE = 1;
    private static final Internal.EnumLiteMap<DNDProto$DNDStatus> internalValueMap = new Internal.EnumLiteMap<DNDProto$DNDStatus>() { // from class: com.heytap.health.protocol.dnd.DNDProto$DNDStatus.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DNDProto$DNDStatus findValueByNumber(int i) {
            return DNDProto$DNDStatus.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return DNDProto$DNDStatus.forNumber(i) != null;
        }
    }

    DNDProto$DNDStatus(int i) {
        this.value = i;
    }

    public static DNDProto$DNDStatus forNumber(int i) {
        if (i == 0) {
            return STATUS_DISABLE;
        }
        if (i != 1) {
            return null;
        }
        return STATUS_ENABLE;
    }

    public static Internal.EnumLiteMap<DNDProto$DNDStatus> internalGetValueMap() {
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
    public static DNDProto$DNDStatus valueOf(int i) {
        return forNumber(i);
    }
}
