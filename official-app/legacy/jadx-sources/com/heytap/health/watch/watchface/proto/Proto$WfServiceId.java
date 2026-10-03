package com.heytap.health.watch.watchface.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes19.dex */
public enum Proto$WfServiceId implements Internal.EnumLite {
    S_DEFAULT(0),
    S_ID(13),
    UNRECOGNIZED(-1);

    public static final int S_DEFAULT_VALUE = 0;
    public static final int S_ID_VALUE = 13;
    private static final Internal.EnumLiteMap<Proto$WfServiceId> internalValueMap = new Internal.EnumLiteMap<Proto$WfServiceId>() { // from class: com.heytap.health.watch.watchface.proto.Proto$WfServiceId.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Proto$WfServiceId findValueByNumber(int i) {
            return Proto$WfServiceId.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return Proto$WfServiceId.forNumber(i) != null;
        }
    }

    Proto$WfServiceId(int i) {
        this.value = i;
    }

    public static Proto$WfServiceId forNumber(int i) {
        if (i == 0) {
            return S_DEFAULT;
        }
        if (i != 13) {
            return null;
        }
        return S_ID;
    }

    public static Internal.EnumLiteMap<Proto$WfServiceId> internalGetValueMap() {
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
    public static Proto$WfServiceId valueOf(int i) {
        return forNumber(i);
    }
}
