package com.oplus.deepthinker.sdk.app.aidl.proton.deepsleep;

import android.os.Parcel;
import android.os.Parcelable;
import com.oplus.aiunit.vision.g5g;

/* JADX INFO: loaded from: classes5.dex */
public class TrainConfig implements Parcelable {
    private static final int CONFIG_DATA_LENGTH = 4;
    public static final Parcelable.Creator<TrainConfig> CREATOR = new Parcelable.Creator<TrainConfig>() { // from class: com.oplus.deepthinker.sdk.app.aidl.proton.deepsleep.TrainConfig.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TrainConfig createFromParcel(Parcel parcel) {
            TrainConfig trainConfig = new TrainConfig(0, 0.0d, 0);
            trainConfig.mClusterMinPoints = parcel.readInt();
            trainConfig.mClusterEps = parcel.readDouble();
            trainConfig.mDayForPredict = parcel.readInt();
            trainConfig.mType = parcel.readInt();
            return trainConfig;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TrainConfig[] newArray(int i) {
            return new TrainConfig[i];
        }
    };
    private static final int MULTIPLE = 1000;
    private static final int PRIME_NUM = 31;
    private static final double SIGMA = 1.0E-4d;
    private static final String SPLIT = ",";
    private static final String TAG = "TrainConfig";
    private double mClusterEps;
    private int mClusterMinPoints;
    private int mDayForPredict;
    private int mType;

    public TrainConfig(int i, double d, int i2) {
        this.mType = -1;
        this.mClusterMinPoints = i;
        this.mClusterEps = d;
        this.mDayForPredict = i2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrainConfig)) {
            return false;
        }
        TrainConfig trainConfig = (TrainConfig) obj;
        return this.mClusterMinPoints == trainConfig.getClusterMinPoints() && Math.abs(this.mClusterEps - trainConfig.getClusterEps()) >= 1.0E-4d && this.mDayForPredict == trainConfig.getdayForPredict() && this.mType == trainConfig.getType();
    }

    public double getClusterEps() {
        return this.mClusterEps;
    }

    public int getClusterMinPoints() {
        return this.mClusterMinPoints;
    }

    public int getType() {
        return this.mType;
    }

    public int getdayForPredict() {
        return this.mDayForPredict;
    }

    public int hashCode() {
        return (((((this.mClusterMinPoints * 31) + ((int) (this.mClusterEps * 1000.0d))) * 31) + this.mDayForPredict) * 31) + this.mType;
    }

    public void setClusterEps(double d) {
        this.mClusterEps = d;
    }

    public void setClusterMinPoints(int i) {
        this.mClusterMinPoints = i;
    }

    public void setType(int i) {
        this.mType = i;
    }

    public void setdayForPredict(int i) {
        this.mDayForPredict = i;
    }

    public String spliceParameter() {
        return this.mClusterMinPoints + "," + this.mClusterEps + "," + this.mDayForPredict + "," + this.mType;
    }

    public String toString() {
        return "TrainConfig{mClusterMinPoints=" + this.mClusterMinPoints + ", mClusterEps=" + this.mClusterEps + ", mDayForPredict=" + this.mDayForPredict + ", mType=" + this.mType + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mClusterMinPoints);
        parcel.writeDouble(this.mClusterEps);
        parcel.writeInt(this.mDayForPredict);
        parcel.writeInt(this.mType);
    }

    public TrainConfig(String str) {
        this.mType = -1;
        String[] strArrSplit = str.split(",");
        if (strArrSplit.length == 4) {
            try {
                this.mClusterMinPoints = Integer.parseInt(strArrSplit[0]);
                this.mClusterEps = Double.parseDouble(strArrSplit[1]);
                this.mDayForPredict = Integer.parseInt(strArrSplit[2]);
                this.mType = Integer.parseInt(strArrSplit[3]);
            } catch (NumberFormatException e2) {
                g5g.h(TAG, e2.toString());
            }
        }
    }
}
