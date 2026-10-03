package com.lifesense.plugin.ble.data.tracker;

/* JADX INFO: loaded from: classes5.dex */
public class ATStepItem {
    private float batteryVoltage;
    private float calories;
    private int cmd;
    private int distance;
    private float exerciseAmount;
    private int exerciseTime;
    private int intensityLevel;
    private String measureTime;
    private int sleepStatus;
    private int status;
    private int step;
    private long utc;

    public float getBatteryVoltage() {
        return this.batteryVoltage;
    }

    public float getCalories() {
        return this.calories;
    }

    public int getCmd() {
        return this.cmd;
    }

    public int getDistance() {
        return this.distance;
    }

    public float getExerciseAmount() {
        return this.exerciseAmount;
    }

    public int getExerciseTime() {
        return this.exerciseTime;
    }

    public int getIntensityLevel() {
        return this.intensityLevel;
    }

    public String getMeasureTime() {
        return this.measureTime;
    }

    public int getSleepStatus() {
        return this.sleepStatus;
    }

    public int getStatus() {
        return this.status;
    }

    public int getStep() {
        return this.step;
    }

    public long getUtc() {
        return this.utc;
    }

    public void setBatteryVoltage(float f) {
        this.batteryVoltage = f;
    }

    public void setCalories(float f) {
        this.calories = f;
    }

    public void setCmd(int i) {
        this.cmd = i;
    }

    public void setDistance(int i) {
        this.distance = i;
    }

    public void setExerciseAmount(float f) {
        this.exerciseAmount = f;
    }

    public void setExerciseTime(int i) {
        this.exerciseTime = i;
    }

    public void setIntensityLevel(int i) {
        this.intensityLevel = i;
    }

    public void setMeasureTime(String str) {
        this.measureTime = str;
    }

    public void setSleepStatus(int i) {
        this.sleepStatus = i;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setStep(int i) {
        this.step = i;
    }

    public void setUtc(long j2) {
        this.utc = j2;
    }

    public String toString() {
        return "ATStepItem{, step=" + this.step + ", utc=" + this.utc + ", exerciseAmount=" + this.exerciseAmount + ", calories=" + this.calories + ", exerciseTime=" + this.exerciseTime + ", distance=" + this.distance + ", status=" + this.status + ", batteryVoltage=" + this.batteryVoltage + ", cmd=" + this.cmd + ", measureTime=" + this.measureTime + "},";
    }
}
