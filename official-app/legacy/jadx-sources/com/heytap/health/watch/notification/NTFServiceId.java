package com.heytap.health.watch.notification;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes19.dex */
public enum NTFServiceId implements Internal.EnumLite {
    SID_NTF_UNDEFINE(0),
    SID_NTF(2),
    UNRECOGNIZED(-1);

    public static final int SID_NTF_UNDEFINE_VALUE = 0;
    public static final int SID_NTF_VALUE = 2;
    private static final Internal.EnumLiteMap<NTFServiceId> internalValueMap = new Internal.EnumLiteMap<NTFServiceId>() { // from class: com.heytap.health.watch.notification.NTFServiceId.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NTFServiceId findValueByNumber(int i) {
            return NTFServiceId.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return NTFServiceId.forNumber(i) != null;
        }
    }

    NTFServiceId(int i) {
        this.value = i;
    }

    public static NTFServiceId forNumber(int i) {
        if (i == 0) {
            return SID_NTF_UNDEFINE;
        }
        if (i != 2) {
            return null;
        }
        return SID_NTF;
    }

    public static Internal.EnumLiteMap<NTFServiceId> internalGetValueMap() {
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
    public static NTFServiceId valueOf(int i) {
        return forNumber(i);
    }
}
