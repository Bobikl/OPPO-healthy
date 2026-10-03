package com.heytap.databaseengine.model;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class DetailBean {
    private int distance;
    private int elevation;
    private int frequency;
    private int heartRate;
    private int pace;
    private int stamina;
    private int state;
    private int timeStamp;

    public int getDistance() {
        return this.distance;
    }

    public int getElevation() {
        return this.elevation;
    }

    public int getFrequency() {
        return this.frequency;
    }

    public int getHeartRate() {
        return this.heartRate;
    }

    public int getPace() {
        return this.pace;
    }

    public int getStamina() {
        return this.stamina;
    }

    public int getState() {
        return this.state;
    }

    public int getTimeStamp() {
        return this.timeStamp;
    }

    public void setDistance(int i) {
        this.distance = i;
    }

    public void setElevation(int i) {
        this.elevation = i;
    }

    public void setFrequency(int i) {
        this.frequency = i;
    }

    public void setHeartRate(int i) {
        this.heartRate = i;
    }

    public void setPace(int i) {
        this.pace = i;
    }

    public void setStamina(int i) {
        this.stamina = i;
    }

    public void setState(int i) {
        this.state = i;
    }

    public void setTimeStamp(int i) {
        this.timeStamp = i;
    }
}
