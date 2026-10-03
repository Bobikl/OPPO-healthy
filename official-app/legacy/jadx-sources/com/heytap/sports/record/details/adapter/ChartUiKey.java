package com.heytap.sports.record.details.adapter;

import com.heytap.databaseengine.apiv2.health.HeytapHealthParams;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lcom/heytap/sports/record/details/adapter/ChartUiKey;", "", "key", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "DILUTION_HEART_RATE", "DILUTION_FREQUENCY", "DILUTION_PACE", "DILUTION_ELEVATION", "DILUTION_STAMINA", "DILUTION_STRIDE", "DILUTION_RUNNINGPOWER", "DILUTION_ROWINGFREQ", "DILUTION_ELLIPTICALFREQ", "DILUTION_KM_SPEED", "DILUTION_COUNT_SPEED", "DILUTION_CLIMB_SPEED", "DILUTION_STROKE_SPEED", "DILUTION_SWIM_PACE", "sport_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum ChartUiKey {
    DILUTION_HEART_RATE(HeytapHealthParams.HEART_RATE),
    DILUTION_FREQUENCY("FREQUENCY"),
    DILUTION_PACE("PACE"),
    DILUTION_ELEVATION("ELEVATION"),
    DILUTION_STAMINA("STAMINA"),
    DILUTION_STRIDE("STRIDE"),
    DILUTION_RUNNINGPOWER("RUNNINGPOWER"),
    DILUTION_ROWINGFREQ("ROWINGFREQ"),
    DILUTION_ELLIPTICALFREQ("ELLIPTICALFREQ"),
    DILUTION_KM_SPEED("KM_SPEED"),
    DILUTION_COUNT_SPEED("COUNT_SPEED"),
    DILUTION_CLIMB_SPEED("DILUTION_CLIMB_SPEED"),
    DILUTION_STROKE_SPEED("STROKE_SPEED"),
    DILUTION_SWIM_PACE("SWIM_PACE");


    @NotNull
    private final String key;

    ChartUiKey(String str) {
        this.key = str;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }
}
