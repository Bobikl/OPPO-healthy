package com.heytap.health.settings;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes17.dex */
public enum DeviceSettings$SnoringRiskAssessmentCapability implements Internal.EnumLite {
    SNORING_RISK_ASSESSMENT_NONE(0),
    SNORING_RISK_ASSESSMENT_BASIC(1),
    SNORING_RISK_ASSESSMENT_SLEEP_APNEA(2),
    SNORING_RISK_ASSESSMENT_AUTO_STOP(4),
    UNRECOGNIZED(-1);

    public static final int SNORING_RISK_ASSESSMENT_AUTO_STOP_VALUE = 4;
    public static final int SNORING_RISK_ASSESSMENT_BASIC_VALUE = 1;
    public static final int SNORING_RISK_ASSESSMENT_NONE_VALUE = 0;
    public static final int SNORING_RISK_ASSESSMENT_SLEEP_APNEA_VALUE = 2;
    private static final Internal.EnumLiteMap<DeviceSettings$SnoringRiskAssessmentCapability> internalValueMap = new Internal.EnumLiteMap<DeviceSettings$SnoringRiskAssessmentCapability>() { // from class: com.heytap.health.settings.DeviceSettings$SnoringRiskAssessmentCapability.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DeviceSettings$SnoringRiskAssessmentCapability findValueByNumber(int i) {
            return DeviceSettings$SnoringRiskAssessmentCapability.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return DeviceSettings$SnoringRiskAssessmentCapability.forNumber(i) != null;
        }
    }

    DeviceSettings$SnoringRiskAssessmentCapability(int i) {
        this.value = i;
    }

    public static DeviceSettings$SnoringRiskAssessmentCapability forNumber(int i) {
        if (i == 0) {
            return SNORING_RISK_ASSESSMENT_NONE;
        }
        if (i == 1) {
            return SNORING_RISK_ASSESSMENT_BASIC;
        }
        if (i == 2) {
            return SNORING_RISK_ASSESSMENT_SLEEP_APNEA;
        }
        if (i != 4) {
            return null;
        }
        return SNORING_RISK_ASSESSMENT_AUTO_STOP;
    }

    public static Internal.EnumLiteMap<DeviceSettings$SnoringRiskAssessmentCapability> internalGetValueMap() {
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
    public static DeviceSettings$SnoringRiskAssessmentCapability valueOf(int i) {
        return forNumber(i);
    }
}
