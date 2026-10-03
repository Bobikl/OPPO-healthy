package com.heytap.databaseengine.model;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class FiveKmPlan {
    private int avgPace;
    private int distance;
    private int maxPace;
    private int minPace;
    private int pace;
    private int type;

    public int getAvgPace() {
        return this.avgPace;
    }

    public int getDistance() {
        return this.distance;
    }

    public int getMaxPace() {
        return this.maxPace;
    }

    public int getMinPace() {
        return this.minPace;
    }

    public int getPace() {
        return this.pace;
    }

    public int getType() {
        return this.type;
    }

    public void setAvgPace(int i) {
        this.avgPace = i;
    }

    public void setDistance(int i) {
        this.distance = i;
    }

    public void setMaxPace(int i) {
        this.maxPace = i;
    }

    public void setMinPace(int i) {
        this.minPace = i;
    }

    public void setPace(int i) {
        this.pace = i;
    }

    public void setType(int i) {
        this.type = i;
    }
}
