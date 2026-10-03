package com.heytap.health.device.protocol.emergency;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes16.dex */
public enum SGP$Sid implements Internal.EnumLite {
    SID_SGP_UNDEFINE(0),
    SID_SGP(46),
    SID_SGP_FT(47),
    UNRECOGNIZED(-1);

    public static final int SID_SGP_FT_VALUE = 47;
    public static final int SID_SGP_UNDEFINE_VALUE = 0;
    public static final int SID_SGP_VALUE = 46;
    private static final Internal.EnumLiteMap<SGP$Sid> internalValueMap = new Internal.EnumLiteMap<SGP$Sid>() { // from class: com.heytap.health.device.protocol.emergency.SGP$Sid.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SGP$Sid findValueByNumber(int i) {
            return SGP$Sid.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return SGP$Sid.forNumber(i) != null;
        }
    }

    SGP$Sid(int i) {
        this.value = i;
    }

    public static SGP$Sid forNumber(int i) {
        if (i == 0) {
            return SID_SGP_UNDEFINE;
        }
        if (i == 46) {
            return SID_SGP;
        }
        if (i != 47) {
            return null;
        }
        return SID_SGP_FT;
    }

    public static Internal.EnumLiteMap<SGP$Sid> internalGetValueMap() {
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
    public static SGP$Sid valueOf(int i) {
        return forNumber(i);
    }
}
