package com.oplus.deepthinker.sdk.app.aidl.proton.deepsleep;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public class TotalPredictResult implements Parcelable {
    public static final Parcelable.Creator<TotalPredictResult> CREATOR = new Parcelable.Creator<TotalPredictResult>() { // from class: com.oplus.deepthinker.sdk.app.aidl.proton.deepsleep.TotalPredictResult.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TotalPredictResult createFromParcel(Parcel parcel) {
            TotalPredictResult totalPredictResult = new TotalPredictResult(null, null, null, null);
            totalPredictResult.setSleepCluster((DeepSleepCluster) parcel.readParcelable(AnonymousClass1.class.getClassLoader()));
            totalPredictResult.setWakeCluster((DeepSleepCluster) parcel.readParcelable(AnonymousClass1.class.getClassLoader()));
            totalPredictResult.setOptimalSleepConfig((TrainConfig) parcel.readParcelable(AnonymousClass1.class.getClassLoader()));
            totalPredictResult.setOptimalWakeConfig((TrainConfig) parcel.readParcelable(AnonymousClass1.class.getClassLoader()));
            return totalPredictResult;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TotalPredictResult[] newArray(int i) {
            return new TotalPredictResult[i];
        }
    };
    private static final String NULL = "null";
    private static final String TAG = "TotalPredictResult";
    private TrainConfig mOptimalSleepConfig;
    private TrainConfig mOptimalWakeConfig;
    private DeepSleepCluster mSleepCluster;
    private DeepSleepCluster mWakeCluster;

    public TotalPredictResult(DeepSleepCluster deepSleepCluster, DeepSleepCluster deepSleepCluster2) {
        this.mOptimalSleepConfig = null;
        this.mOptimalWakeConfig = null;
        this.mSleepCluster = deepSleepCluster;
        this.mWakeCluster = deepSleepCluster2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public TrainConfig getOptimalSleepConfig() {
        return this.mOptimalSleepConfig;
    }

    public TrainConfig getOptimalWakeConfig() {
        return this.mOptimalWakeConfig;
    }

    public DeepSleepCluster getSleepCluster() {
        return this.mSleepCluster;
    }

    public DeepSleepCluster getWakeCluster() {
        return this.mWakeCluster;
    }

    public void setOptimalSleepConfig(TrainConfig trainConfig) {
        this.mOptimalSleepConfig = trainConfig;
    }

    public void setOptimalWakeConfig(TrainConfig trainConfig) {
        this.mOptimalWakeConfig = trainConfig;
    }

    public void setSleepCluster(DeepSleepCluster deepSleepCluster) {
        this.mSleepCluster = deepSleepCluster;
    }

    public void setWakeCluster(DeepSleepCluster deepSleepCluster) {
        this.mWakeCluster = deepSleepCluster;
    }

    public String toString() {
        DeepSleepCluster deepSleepCluster = this.mSleepCluster;
        String string = NULL;
        String string2 = deepSleepCluster != null ? deepSleepCluster.toString() : NULL;
        DeepSleepCluster deepSleepCluster2 = this.mWakeCluster;
        String string3 = deepSleepCluster2 != null ? deepSleepCluster2.toString() : NULL;
        TrainConfig trainConfig = this.mOptimalSleepConfig;
        String string4 = trainConfig != null ? trainConfig.toString() : NULL;
        TrainConfig trainConfig2 = this.mOptimalWakeConfig;
        if (trainConfig2 != null) {
            string = trainConfig2.toString();
        }
        return String.format("mSleepCluster=%s,mSleepConfig=%s,mWakeCluster=%s,mWakeConfig=%s", string2, string4, string3, string);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mSleepCluster, i);
        parcel.writeParcelable(this.mWakeCluster, i);
        parcel.writeParcelable(this.mOptimalSleepConfig, i);
        parcel.writeParcelable(this.mOptimalWakeConfig, i);
    }

    public TotalPredictResult(DeepSleepCluster deepSleepCluster, DeepSleepCluster deepSleepCluster2, TrainConfig trainConfig, TrainConfig trainConfig2) {
        this.mSleepCluster = deepSleepCluster;
        this.mWakeCluster = deepSleepCluster2;
        this.mOptimalSleepConfig = trainConfig;
        this.mOptimalWakeConfig = trainConfig2;
    }
}
