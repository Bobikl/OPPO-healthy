package com.health.heartrate.nativelibrary.paras;

import androidx.annotation.Keep;
import com.heytap.health.core.widget.charts.RecordCombinedLineChart;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes14.dex */
@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/health/heartrate/nativelibrary/paras/AlgoOutputData;", "", "()V", RecordCombinedLineChart.KEY_HEART_RATE, "", "getHeartRate", "()I", "setHeartRate", "(I)V", "hrConfidence", "getHrConfidence", "setHrConfidence", "motionStatus", "getMotionStatus", "setMotionStatus", "warnStatus", "getWarnStatus", "setWarnStatus", "MeasureLibrary_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AlgoOutputData {
    private int heartRate;
    private int hrConfidence;
    private int motionStatus;
    private int warnStatus;

    public final int getHeartRate() {
        return this.heartRate;
    }

    public final int getHrConfidence() {
        return this.hrConfidence;
    }

    public final int getMotionStatus() {
        return this.motionStatus;
    }

    public final int getWarnStatus() {
        return this.warnStatus;
    }

    public final void setHeartRate(int i) {
        this.heartRate = i;
    }

    public final void setHrConfidence(int i) {
        this.hrConfidence = i;
    }

    public final void setMotionStatus(int i) {
        this.motionStatus = i;
    }

    public final void setWarnStatus(int i) {
        this.warnStatus = i;
    }
}
