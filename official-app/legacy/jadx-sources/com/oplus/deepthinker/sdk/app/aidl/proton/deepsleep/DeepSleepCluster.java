package com.oplus.deepthinker.sdk.app.aidl.proton.deepsleep;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public class DeepSleepCluster implements Parcelable {
    public static final int ANOMALY_TYPE = -1;
    public static final Parcelable.Creator<DeepSleepCluster> CREATOR = new Parcelable.Creator<DeepSleepCluster>() { // from class: com.oplus.deepthinker.sdk.app.aidl.proton.deepsleep.DeepSleepCluster.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DeepSleepCluster createFromParcel(Parcel parcel) {
            DeepSleepCluster deepSleepCluster = new DeepSleepCluster(0.0d, 0.0d);
            deepSleepCluster.mSleepTimePeriod = parcel.readDouble();
            deepSleepCluster.mWakeTimePeriod = parcel.readDouble();
            deepSleepCluster.mMaxDistance = parcel.readDouble();
            deepSleepCluster.mClusterId = parcel.readInt();
            deepSleepCluster.mClusterNum = parcel.readInt();
            deepSleepCluster.mSleepMinValue = parcel.readDouble();
            deepSleepCluster.mSleepMaxValue = parcel.readDouble();
            deepSleepCluster.mWakeMinValue = parcel.readDouble();
            deepSleepCluster.mWakeMaxValue = parcel.readDouble();
            return deepSleepCluster;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DeepSleepCluster[] newArray(int i) {
            return new DeepSleepCluster[i];
        }
    };
    private static final double DEFAULT_MAX_DISTANCE = 0.0d;
    private int mClusterId;
    private int mClusterNum;
    private double mMaxDistance;
    private double mSleepMaxValue;
    private double mSleepMinValue;
    private double mSleepTimePeriod;
    private double mWakeMaxValue;
    private double mWakeMinValue;
    private double mWakeTimePeriod;

    public DeepSleepCluster(double d, double d2) {
        this.mSleepMinValue = 0.0d;
        this.mSleepMaxValue = 0.0d;
        this.mWakeMinValue = 0.0d;
        this.mWakeMaxValue = 0.0d;
        this.mClusterId = -1;
        this.mClusterNum = 0;
        this.mSleepTimePeriod = d;
        this.mWakeTimePeriod = d2;
        this.mMaxDistance = 0.0d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
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

    public double getSleepMaxValue() {
        return this.mSleepMaxValue;
    }

    public double getSleepMinValue() {
        return this.mSleepMinValue;
    }

    public double getSleepTimePeriod() {
        return this.mSleepTimePeriod;
    }

    public double getWakeMaxValue() {
        return this.mWakeMaxValue;
    }

    public double getWakeMinValue() {
        return this.mWakeMinValue;
    }

    public double getWakeTimePeriod() {
        return this.mWakeTimePeriod;
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

    public void setSleepTimePeriod(double d) {
        this.mSleepTimePeriod = d;
    }

    public void setWakeTimePeriod(double d) {
        this.mWakeTimePeriod = d;
    }

    public String toString() {
        return String.format("DeepSleepCluster:clusterId=%d sleep=%.2f wake=%.2f clusterNum=%d maxDistance=%.2f", Integer.valueOf(this.mClusterId), Double.valueOf(this.mSleepTimePeriod), Double.valueOf(this.mWakeTimePeriod), Integer.valueOf(this.mClusterNum), Double.valueOf(this.mMaxDistance));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.mSleepTimePeriod);
        parcel.writeDouble(this.mWakeTimePeriod);
        parcel.writeDouble(this.mMaxDistance);
        parcel.writeInt(this.mClusterId);
        parcel.writeInt(this.mClusterNum);
        parcel.writeDouble(this.mSleepMinValue);
        parcel.writeDouble(this.mSleepMaxValue);
        parcel.writeDouble(this.mWakeMinValue);
        parcel.writeDouble(this.mWakeMaxValue);
    }

    public DeepSleepCluster(double d, double d2, double d3, double d4, double d5, double d6) {
        this.mClusterId = -1;
        this.mClusterNum = 0;
        this.mSleepTimePeriod = d;
        this.mWakeTimePeriod = d2;
        this.mMaxDistance = 0.0d;
        this.mSleepMinValue = d3;
        this.mSleepMaxValue = d4;
        this.mWakeMinValue = d5;
        this.mWakeMaxValue = d6;
    }

    public DeepSleepCluster(double d, double d2, double d3) {
        this.mSleepMinValue = 0.0d;
        this.mSleepMaxValue = 0.0d;
        this.mWakeMinValue = 0.0d;
        this.mWakeMaxValue = 0.0d;
        this.mClusterId = -1;
        this.mClusterNum = 0;
        this.mSleepTimePeriod = d;
        this.mWakeTimePeriod = d2;
        this.mMaxDistance = d3;
    }

    public DeepSleepCluster(int i, double d, double d2, double d3) {
        this.mSleepMinValue = 0.0d;
        this.mSleepMaxValue = 0.0d;
        this.mWakeMinValue = 0.0d;
        this.mWakeMaxValue = 0.0d;
        this.mClusterNum = 0;
        this.mSleepTimePeriod = d;
        this.mWakeTimePeriod = d2;
        this.mMaxDistance = d3;
        this.mClusterId = i;
    }
}
