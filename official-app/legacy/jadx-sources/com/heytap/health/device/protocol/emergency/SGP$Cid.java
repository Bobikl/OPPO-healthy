package com.heytap.health.device.protocol.emergency;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes16.dex */
public enum SGP$Cid implements Internal.EnumLite {
    CID_SGP_UNDEFINE(0),
    CID_SGP_ASK_SWITCH(7),
    CID_SGP_OPEN_PAGE(8),
    CID_SGP_SWITCH(9),
    CID_SGP_START_END(10),
    CID_SGP_RELATION(11),
    CID_SGP_SYNC_DATA(13),
    CID_SGP_ASK_AUTO(14),
    CID_SGP_SYNC_AUTO(15),
    UNRECOGNIZED(-1);

    public static final int CID_SGP_ASK_AUTO_VALUE = 14;
    public static final int CID_SGP_ASK_SWITCH_VALUE = 7;
    public static final int CID_SGP_OPEN_PAGE_VALUE = 8;
    public static final int CID_SGP_RELATION_VALUE = 11;
    public static final int CID_SGP_START_END_VALUE = 10;
    public static final int CID_SGP_SWITCH_VALUE = 9;
    public static final int CID_SGP_SYNC_AUTO_VALUE = 15;
    public static final int CID_SGP_SYNC_DATA_VALUE = 13;
    public static final int CID_SGP_UNDEFINE_VALUE = 0;
    private static final Internal.EnumLiteMap<SGP$Cid> internalValueMap = new Internal.EnumLiteMap<SGP$Cid>() { // from class: com.heytap.health.device.protocol.emergency.SGP$Cid.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SGP$Cid findValueByNumber(int i) {
            return SGP$Cid.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return SGP$Cid.forNumber(i) != null;
        }
    }

    SGP$Cid(int i) {
        this.value = i;
    }

    public static SGP$Cid forNumber(int i) {
        if (i == 0) {
            return CID_SGP_UNDEFINE;
        }
        switch (i) {
            case 7:
                return CID_SGP_ASK_SWITCH;
            case 8:
                return CID_SGP_OPEN_PAGE;
            case 9:
                return CID_SGP_SWITCH;
            case 10:
                return CID_SGP_START_END;
            case 11:
                return CID_SGP_RELATION;
            default:
                switch (i) {
                    case 13:
                        return CID_SGP_SYNC_DATA;
                    case 14:
                        return CID_SGP_ASK_AUTO;
                    case 15:
                        return CID_SGP_SYNC_AUTO;
                    default:
                        return null;
                }
        }
    }

    public static Internal.EnumLiteMap<SGP$Cid> internalGetValueMap() {
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
    public static SGP$Cid valueOf(int i) {
        return forNumber(i);
    }
}
