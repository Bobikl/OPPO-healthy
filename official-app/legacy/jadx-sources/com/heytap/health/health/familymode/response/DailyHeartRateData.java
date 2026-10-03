package com.heytap.health.health.familymode.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes16.dex */
@Keep
public class DailyHeartRateData implements Parcelable {
    public static final Parcelable.Creator<DailyHeartRateData> CREATOR = new a();
    private String heartRateWarning;
    private int maxHeartRate;
    private int minHeartRate;
    private int restHeartRate;

    public class a implements Parcelable.Creator<DailyHeartRateData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DailyHeartRateData createFromParcel(Parcel parcel) {
            return new DailyHeartRateData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DailyHeartRateData[] newArray(int i) {
            return new DailyHeartRateData[i];
        }
    }

    public DailyHeartRateData(Parcel parcel) {
        this.minHeartRate = parcel.readInt();
        this.maxHeartRate = parcel.readInt();
        this.heartRateWarning = parcel.readString();
        this.restHeartRate = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getHeartRateWarning() {
        return this.heartRateWarning;
    }

    public int getMaxHeartRate() {
        return this.maxHeartRate;
    }

    public int getMinHeartRate() {
        return this.minHeartRate;
    }

    public int getRestHeartRate() {
        return this.restHeartRate;
    }

    public void setHeartRateWarning(String str) {
        this.heartRateWarning = str;
    }

    public void setMaxHeartRate(int i) {
        this.maxHeartRate = i;
    }

    public void setMinHeartRate(int i) {
        this.minHeartRate = i;
    }

    public void setRestHeartRate(int i) {
        this.restHeartRate = i;
    }

    public String toString() {
        return "DailyHeartRateData{minHeartRate=" + this.minHeartRate + ", maxHeartRate=" + this.maxHeartRate + ", restHeartRate=" + this.restHeartRate + ", heartRateWarning='" + this.heartRateWarning + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.minHeartRate);
        parcel.writeInt(this.maxHeartRate);
        parcel.writeString(this.heartRateWarning);
        parcel.writeInt(this.restHeartRate);
    }
}
