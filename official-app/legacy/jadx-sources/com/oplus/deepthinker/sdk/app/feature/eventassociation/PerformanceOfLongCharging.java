package com.oplus.deepthinker.sdk.app.feature.eventassociation;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public class PerformanceOfLongCharging implements Serializable {
    private static final long serialVersionUID = 3578136292978560538L;
    private long mDuration;
    private float mProbabilityOfApps;
    private float mProbabilityOfLocation;
    private float mProbabilityOfTime;
    private float mProbabilityOfTotal;

    public long getDuration() {
        return this.mDuration;
    }

    public float getProbabilityOfApps() {
        return this.mProbabilityOfApps;
    }

    public float getProbabilityOfLocation() {
        return this.mProbabilityOfLocation;
    }

    public float getProbabilityOfTime() {
        return this.mProbabilityOfTime;
    }

    public float getProbabilityOfTotal() {
        return this.mProbabilityOfTotal;
    }

    public void setDuration(long j2) {
        this.mDuration = j2;
    }

    public void setProbabilityOfLocation(float f) {
        this.mProbabilityOfLocation = f;
    }

    public void setProbabilityOfTime(float f) {
        this.mProbabilityOfTime = f;
    }

    public void setProbabilityOfTotal(float f) {
        this.mProbabilityOfTotal = f;
    }

    public void setPropOfApps(float f) {
        this.mProbabilityOfApps = f;
    }

    @NotNull
    public String toString() {
        return "PerformanceOfLongCharging{probabilityOfLocation=" + this.mProbabilityOfLocation + ", probabilityOfApps=" + this.mProbabilityOfApps + ", probabilityOfTime=" + this.mProbabilityOfTime + ", probabilityOfTotal=" + this.mProbabilityOfTotal + ", duration=" + this.mDuration + '}';
    }
}
