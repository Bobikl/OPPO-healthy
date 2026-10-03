package com.oplus.deepthinker.sdk.app.aidl.proton.deepsleep;

import android.util.ArrayMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class DeepSleepClusterWithPercentile {
    public static final int ANOMALY_TYPE = -1;
    private static final double DEFAULT_MAX_DISTANCE = 0.0d;
    private int mClusterId;
    private int mClusterNum;
    private double mMaxDistance;
    private Map<Integer, Double> mSleepTimePercentiles;
    private Map<Integer, Double> mWakeTimePercentiles;

    public DeepSleepClusterWithPercentile(Map<Integer, Double> map, Map<Integer, Double> map2, double d, int i, int i2) {
        this.mSleepTimePercentiles = map;
        this.mWakeTimePercentiles = map2;
        this.mMaxDistance = d;
        this.mClusterId = i;
        this.mClusterNum = i2;
    }

    public int getClusterId() {
        return this.mClusterId;
    }

    public int getClusterNum() {
        return this.mClusterNum;
    }

    public double getMaxDistance() {
        return this.mMaxDistance;
    }

    public Map<Integer, Double> getSleepTimePercentiles() {
        return this.mSleepTimePercentiles;
    }

    public Map<Integer, Double> getWakeTimePercentiles() {
        return this.mWakeTimePercentiles;
    }

    public void setClusterId(int i) {
        this.mClusterId = i;
    }

    public void setClusterNum(int i) {
        this.mClusterNum = i;
    }

    public void setMaxDistance(double d) {
        this.mMaxDistance = d;
    }

    public void setSleepTimePercentiles(Map<Integer, Double> map) {
        this.mSleepTimePercentiles = map;
    }

    public void setWakeTimePercentiles(Map<Integer, Double> map) {
        this.mWakeTimePercentiles = map;
    }

    public String toString() {
        return "DeepSleepClusterWithPercentile{mSleepTimePercentiles=" + this.mSleepTimePercentiles + ", mWakeTimePercentiles=" + this.mWakeTimePercentiles + ", mMaxDistance=" + this.mMaxDistance + ", mClusterId=" + this.mClusterId + ", mClusterNum=" + this.mClusterNum + '}';
    }

    public DeepSleepClusterWithPercentile() {
        this(new ArrayMap(), new ArrayMap(), 0.0d, -1, 0);
    }
}
