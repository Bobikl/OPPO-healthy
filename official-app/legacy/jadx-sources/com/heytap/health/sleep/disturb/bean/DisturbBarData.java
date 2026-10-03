package com.heytap.health.sleep.disturb.bean;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class DisturbBarData {
    private List<Integer> durations;
    private long timestamp;

    public DisturbBarData() {
    }

    public List<Integer> getDurations() {
        return this.durations;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public void setDurations(List<Integer> list) {
        this.durations = list;
    }

    public void setTimestamp(long j2) {
        this.timestamp = j2;
    }

    @NonNull
    public String toString() {
        return "DisturbBarData{timestamp=" + this.timestamp + ", durations=" + this.durations + '}';
    }

    public DisturbBarData(long j2, List<Integer> list) {
        this.timestamp = j2;
        this.durations = list;
    }
}
