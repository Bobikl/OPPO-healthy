package com.heytap.databaseengine.model;

import androidx.annotation.Keep;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class SleepCheckResult implements Serializable {
    public static final int MAX_SLEEP_SEGMENT = 20;
    private int segment;
    private int[][] segmentInfo = {new int[]{0}};
    private SegmentSleepPara[] segmentSleepParas = {new SegmentSleepPara()};
    private int sleepScore;
    private int sleepScoreCheck;
    private int totalSleepMinutes;

    public int getSegment() {
        return this.segment;
    }

    public int[][] getSegmentInfo() {
        return this.segmentInfo;
    }

    public SegmentSleepPara[] getSegmentSleepParas() {
        return this.segmentSleepParas;
    }

    public int getSleepScore() {
        return this.sleepScore;
    }

    public int getSleepScoreCheck() {
        return this.sleepScoreCheck;
    }

    public int getTotalSleepMinutes() {
        return this.totalSleepMinutes;
    }

    public void setSegment(int i) {
        this.segment = i;
    }

    public void setSegmentInfo(int[][] iArr) {
        this.segmentInfo = iArr;
    }

    public void setSegmentSleepParas(SegmentSleepPara[] segmentSleepParaArr) {
        this.segmentSleepParas = segmentSleepParaArr;
    }

    public void setSleepScore(int i) {
        this.sleepScore = i;
    }

    public void setSleepScoreCheck(int i) {
        this.sleepScoreCheck = i;
    }

    public void setTotalSleepMinutes(int i) {
        this.totalSleepMinutes = i;
    }

    public String toString() {
        return "SleepCheckAndSleepScoreResult{sleepScore=" + this.sleepScore + "sleepScoreCheck=" + this.sleepScoreCheck + ", totalSleepMinutes=" + this.totalSleepMinutes + ", segment=" + this.segment + ", segmentInfo=" + Arrays.toString(this.segmentInfo) + ", segmentSleepParas=" + Arrays.toString(this.segmentSleepParas) + '}';
    }
}
