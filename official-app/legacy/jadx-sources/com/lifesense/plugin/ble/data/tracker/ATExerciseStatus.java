package com.lifesense.plugin.ble.data.tracker;

/* JADX INFO: loaded from: classes5.dex */
public class ATExerciseStatus {
    private int type;
    private long utc;

    public ATExerciseStatus(int i, long j2) {
        this.type = i;
        this.utc = j2;
    }

    public int getType() {
        return this.type;
    }

    public long getUtc() {
        return this.utc;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setUtc(long j2) {
        this.utc = j2;
    }

    public String toString() {
        return "ATExerciseStatus{type=" + this.type + ", utc=" + this.utc + '}';
    }
}
