package com.heytap.health.cardiovascular.bean;

import com.heytap.databaseengine.apiv2.health.HeytapHealthParams;
import com.oplus.aiunit.vision.p9j;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Lcom/heytap/health/cardiovascular/bean/QuicklyCheckupV2CardType;", "", "aiAnalysisType", "", "(Ljava/lang/String;II)V", "getAiAnalysisType", "()I", "ECG", HeytapHealthParams.HEART_RATE, "REST_HEART_RATE", "BLOOD_OXYGEN", "VASCULAR", "VASCULAR_AGE", "BLOOD_PRESSURE", "SLEEP_SCORE", "SLEEP_RECOVERY", "SLEEP_SNORE", "SLEEP_SNORE_V2", "SLEEP_BASE_HEART_RATE", p9j.WRIST_TEMPERATURE, "HRV", "WEEK_HRV", "HRV_FOCUS_ACTION", "cardiovascular_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum QuicklyCheckupV2CardType {
    ECG(7),
    HEART_RATE(15),
    REST_HEART_RATE(8),
    BLOOD_OXYGEN(2),
    VASCULAR(1),
    VASCULAR_AGE(14),
    BLOOD_PRESSURE(3),
    SLEEP_SCORE(4),
    SLEEP_RECOVERY(-1),
    SLEEP_SNORE(5),
    SLEEP_SNORE_V2(16),
    SLEEP_BASE_HEART_RATE(6),
    WRIST_TEMPERATURE(10),
    HRV(11),
    WEEK_HRV(-1),
    HRV_FOCUS_ACTION(12);

    private final int aiAnalysisType;

    QuicklyCheckupV2CardType(int i) {
        this.aiAnalysisType = i;
    }

    public final int getAiAnalysisType() {
        return this.aiAnalysisType;
    }
}
