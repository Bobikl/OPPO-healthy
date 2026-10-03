package com.heytap.databaseengine.model;

import androidx.annotation.Keep;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class SegmentSleepPara implements Serializable {
    private int checkInSleepPoint;
    private int checkNum;
    private int checkOutSleepPoint;
    private int checkSleepLatency;
    private long[][] checkStartFinishTs = {new long[]{0}};
    private int deepMinutes;
    private int lowMinutes;
    private int remMinutes;
    private int sleepInPoint;
    private int sleepMinutes;
    private int sleepOutPoint;
    private int wakeCount;
    private int wakeMinutes;

    public int getCheckInSleepPoint() {
        return this.checkInSleepPoint;
    }

    public int getCheckNum() {
        return this.checkNum;
    }

    public int getCheckOutSleepPoint() {
        return this.checkOutSleepPoint;
    }

    public int getCheckSleepLatency() {
        return this.checkSleepLatency;
    }

    public long[][] getCheckStartFinishTs() {
        return this.checkStartFinishTs;
    }

    public int getDeepMinutes() {
        return this.deepMinutes;
    }

    public int getLowMinutes() {
        return this.lowMinutes;
    }

    public int getRemMinutes() {
        return this.remMinutes;
    }

    public int getSleepInPoint() {
        return this.sleepInPoint;
    }

    public int getSleepMinutes() {
        return this.sleepMinutes;
    }

    public int getSleepOutPoint() {
        return this.sleepOutPoint;
    }

    public int getWakeCount() {
        return this.wakeCount;
    }

    public int getWakeMinutes() {
        return this.wakeMinutes;
    }

    public void setCheckInSleepPoint(int i) {
        this.checkInSleepPoint = i;
    }

    public void setCheckNum(int i) {
        this.checkNum = i;
    }

    public void setCheckOutSleepPoint(int i) {
        this.checkOutSleepPoint = i;
    }

    public void setCheckSleepLatency(int i) {
        this.checkSleepLatency = i;
    }

    public void setCheckStartFinishTs(long[][] jArr) {
        this.checkStartFinishTs = jArr;
    }

    public void setDeepMinutes(int i) {
        this.deepMinutes = i;
    }

    public void setLowMinutes(int i) {
        this.lowMinutes = i;
    }

    public void setRemMinutes(int i) {
        this.remMinutes = i;
    }

    public void setSleepInPoint(int i) {
        this.sleepInPoint = i;
    }

    public void setSleepMinutes(int i) {
        this.sleepMinutes = i;
    }

    public void setSleepOutPoint(int i) {
        this.sleepOutPoint = i;
    }

    public void setWakeCount(int i) {
        this.wakeCount = i;
    }

    public void setWakeMinutes(int i) {
        this.wakeMinutes = i;
    }

    public String toString() {
        return "SegmentSleepPara{sleepInPoint=" + this.sleepInPoint + ", sleepOutPoint=" + this.sleepOutPoint + ", sleepMinutes=" + this.sleepMinutes + ", deepMinutes=" + this.deepMinutes + ", lowMinutes=" + this.lowMinutes + ", remMinutes=" + this.remMinutes + ", checkSleepLatency=" + this.checkSleepLatency + ", wakeMinutes=" + this.wakeMinutes + ", wakeCount=" + this.wakeCount + ", checkInSleepPoint=" + this.checkInSleepPoint + ", checkOutSleepPoint=" + this.checkOutSleepPoint + ", checkNum=" + this.checkNum + ", checkStartFinishTs=" + Arrays.toString(this.checkStartFinishTs) + '}';
    }
}
