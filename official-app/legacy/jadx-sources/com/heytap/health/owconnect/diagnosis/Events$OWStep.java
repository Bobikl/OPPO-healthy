package com.heytap.health.owconnect.diagnosis;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes17.dex */
public enum Events$OWStep implements Internal.EnumLite {
    IDLE(0),
    REQ(1),
    HFP(2),
    KSC(3),
    BB15(4),
    AA15(5),
    OWCONNECTED(6),
    INTERRUPTED(7),
    UNRECOGNIZED(-1);

    public static final int AA15_VALUE = 5;
    public static final int BB15_VALUE = 4;
    public static final int HFP_VALUE = 2;
    public static final int IDLE_VALUE = 0;
    public static final int INTERRUPTED_VALUE = 7;
    public static final int KSC_VALUE = 3;
    public static final int OWCONNECTED_VALUE = 6;
    public static final int REQ_VALUE = 1;
    private static final Internal.EnumLiteMap<Events$OWStep> internalValueMap = new Internal.EnumLiteMap<Events$OWStep>() { // from class: com.heytap.health.owconnect.diagnosis.Events$OWStep.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Events$OWStep findValueByNumber(int i) {
            return Events$OWStep.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return Events$OWStep.forNumber(i) != null;
        }
    }

    Events$OWStep(int i) {
        this.value = i;
    }

    public static Events$OWStep forNumber(int i) {
        switch (i) {
            case 0:
                return IDLE;
            case 1:
                return REQ;
            case 2:
                return HFP;
            case 3:
                return KSC;
            case 4:
                return BB15;
            case 5:
                return AA15;
            case 6:
                return OWCONNECTED;
            case 7:
                return INTERRUPTED;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<Events$OWStep> internalGetValueMap() {
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
    public static Events$OWStep valueOf(int i) {
        return forNumber(i);
    }
}
