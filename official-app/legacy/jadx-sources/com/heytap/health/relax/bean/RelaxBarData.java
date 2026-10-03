package com.heytap.health.relax.bean;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes17.dex */
@Keep
public class RelaxBarData {
    private long breath;
    private long meditation;
    private long timestamp;

    public RelaxBarData(long j2, long j3, long j4) {
        this.timestamp = j2;
        this.meditation = j3;
        this.breath = j4;
    }

    public long getBreath() {
        return this.breath;
    }

    public long getMeditation() {
        return this.meditation;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public long getTotalDuration() {
        return this.meditation + this.breath;
    }

    public boolean isEmptyData() {
        return this.meditation == 0 && this.breath == 0;
    }

    public void setBreath(long j2) {
        this.breath = j2;
    }

    public void setMeditation(long j2) {
        this.meditation = j2;
    }

    public void setTimestamp(long j2) {
        this.timestamp = j2;
    }

    @NonNull
    public String toString() {
        return "RelaxBarData{timestamp=" + this.timestamp + ", meditation=" + this.meditation + ", breath=" + this.breath + '}';
    }
}
