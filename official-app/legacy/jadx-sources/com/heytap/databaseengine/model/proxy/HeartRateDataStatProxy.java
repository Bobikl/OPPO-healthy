package com.heytap.databaseengine.model.proxy;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.heytap.databaseengine.model.HeartRateDataStat;
import com.heytap.databaseengine.model.SportHealthData;
import com.oplus.weatherservicesdk.data.Weather;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class HeartRateDataStatProxy extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<HeartRateDataStatProxy> CREATOR = new a();
    private int averageHeartRate;
    private int date;
    private int maxHeartRate;
    private int minHeartRate;
    private String timezone;

    public class a implements Parcelable.Creator<HeartRateDataStatProxy> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public HeartRateDataStatProxy createFromParcel(Parcel parcel) {
            return new HeartRateDataStatProxy(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public HeartRateDataStatProxy[] newArray(int i) {
            return new HeartRateDataStatProxy[i];
        }
    }

    public HeartRateDataStatProxy(@NonNull HeartRateDataStat heartRateDataStat) {
        this.date = heartRateDataStat.getDate();
        this.maxHeartRate = heartRateDataStat.getMaxHeartRate();
        this.minHeartRate = heartRateDataStat.getMinHeartRate();
        this.averageHeartRate = heartRateDataStat.getAverageHeartRate();
        this.timezone = heartRateDataStat.getTimezone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getAverageHeartRate() {
        return this.averageHeartRate;
    }

    public int getDate() {
        return this.date;
    }

    public int getMaxHeartRate() {
        return this.maxHeartRate;
    }

    public int getMinHeartRate() {
        return this.minHeartRate;
    }

    public String getTimezone() {
        return this.timezone;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "HeartRateDataStatProxy:\nDate=" + getDate() + "\ntimeZone=" + getTimezone() + "\nmaxHeartRate=" + getMaxHeartRate() + "\nminHeartRate=" + getMinHeartRate() + "\navgHeartRate=" + getAverageHeartRate() + Weather.SEPARATOR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.date);
        parcel.writeInt(this.maxHeartRate);
        parcel.writeInt(this.minHeartRate);
        parcel.writeInt(this.averageHeartRate);
        parcel.writeString(this.timezone);
    }

    public HeartRateDataStatProxy(Parcel parcel) {
        this.date = parcel.readInt();
        this.maxHeartRate = parcel.readInt();
        this.minHeartRate = parcel.readInt();
        this.averageHeartRate = parcel.readInt();
        this.timezone = parcel.readString();
    }
}
