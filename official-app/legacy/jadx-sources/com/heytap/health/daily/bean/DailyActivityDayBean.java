package com.heytap.health.daily.bean;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes16.dex */
@Keep
public class DailyActivityDayBean {
    private int currentActive;
    private int currentCalorie;
    private int currentStep;
    private int currentTime;
    private float distance;
    private int floor;
    private int targetActive;
    private int targetCalorie;
    private int targetStep;
    private int targetTime;

    public int getCurrentActive() {
        return this.currentActive;
    }

    public int getCurrentCalorie() {
        return this.currentCalorie;
    }

    public int getCurrentStep() {
        return this.currentStep;
    }

    public int getCurrentTime() {
        return this.currentTime;
    }

    public float getDistance() {
        return this.distance;
    }

    public int getFloor() {
        return this.floor;
    }

    public int getTargetActive() {
        return this.targetActive;
    }

    public int getTargetCalorie() {
        return this.targetCalorie;
    }

    public int getTargetStep() {
        return this.targetStep;
    }

    public int getTargetTime() {
        return this.targetTime;
    }

    public void setCurrentActive(int i) {
        if (i > 24) {
            i = 24;
        }
        this.currentActive = i;
    }

    public void setCurrentCalorie(int i) {
        if (i > 9999) {
            i = 9999;
        }
        this.currentCalorie = i;
    }

    public void setCurrentStep(int i) {
        if (i > 99999) {
            i = 99999;
        }
        this.currentStep = i;
    }

    public void setCurrentTime(int i) {
        if (i > 1440) {
            i = 1440;
        }
        this.currentTime = i;
    }

    public void setDistance(float f) {
        if (f > 999.9f) {
            f = 999.9f;
        }
        this.distance = f;
    }

    public void setFloor(int i) {
        this.floor = i;
    }

    public void setTargetActive(int i) {
        this.targetActive = i;
    }

    public void setTargetCalorie(int i) {
        this.targetCalorie = i;
    }

    public void setTargetStep(int i) {
        this.targetStep = i;
    }

    public void setTargetTime(int i) {
        this.targetTime = i;
    }

    @NonNull
    public String toString() {
        return "DailyActivityDayBean{currentCalorie=" + this.currentCalorie + ", currentStep=" + this.currentStep + ", currentActive=" + this.currentActive + ", currentTime=" + this.currentTime + ", targetCalorie=" + this.targetCalorie + ", targetStep=" + this.targetStep + ", targetActive=" + this.targetActive + ", targetTime=" + this.targetTime + ", distance=" + this.distance + ", floor=" + this.floor + '}';
    }
}
