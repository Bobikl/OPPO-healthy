package com.heytap.databaseengine.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class HearingHealthStat extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<HearingHealthStat> CREATOR = new a();
    private double averageValue;
    private int date;
    private String deviceUniqueId;
    private double exposure;
    private String extension;
    private double maxValue;
    private double minValue;
    private String ssoid;
    private int syncStatus;
    private String timezone;
    private long totalDuration;

    public class a implements Parcelable.Creator<HearingHealthStat> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public HearingHealthStat createFromParcel(Parcel parcel) {
            return new HearingHealthStat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public HearingHealthStat[] newArray(int i) {
            return new HearingHealthStat[i];
        }
    }

    public HearingHealthStat() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public double getAverageValue() {
        return this.averageValue;
    }

    public int getDate() {
        return this.date;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    public double getExposure() {
        return this.exposure;
    }

    public String getExtension() {
        return this.extension;
    }

    public double getMaxValue() {
        return this.maxValue;
    }

    public double getMinValue() {
        return this.minValue;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String getSsoid() {
        return this.ssoid;
    }

    public int getSyncStatus() {
        return this.syncStatus;
    }

    public String getTimezone() {
        return this.timezone;
    }

    public long getTotalDuration() {
        return this.totalDuration;
    }

    public void setAverageValue(double d) {
        this.averageValue = d;
    }

    public void setDate(int i) {
        this.date = i;
    }

    public void setDeviceUniqueId(String str) {
        this.deviceUniqueId = str;
    }

    public void setExposure(double d) {
        this.exposure = d;
    }

    public void setExtension(String str) {
        this.extension = str;
    }

    public void setMaxValue(double d) {
        this.maxValue = d;
    }

    public void setMinValue(double d) {
        this.minValue = d;
    }

    public void setSsoid(String str) {
        this.ssoid = str;
    }

    public void setSyncStatus(int i) {
        this.syncStatus = i;
    }

    public void setTimezone(String str) {
        this.timezone = str;
    }

    public void setTotalDuration(long j2) {
        this.totalDuration = j2;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "HearingHealthStat{ssoid='" + this.ssoid + "', deviceUniqueId='" + this.deviceUniqueId + "', date=" + this.date + ", timezone='" + this.timezone + "', maxValue=" + this.maxValue + ", minValue=" + this.minValue + ", averageValue=" + this.averageValue + ", exposure=" + this.exposure + ", totalDuration=" + this.totalDuration + ", extension='" + this.extension + "', syncStatus=" + this.syncStatus + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ssoid);
        parcel.writeString(this.deviceUniqueId);
        parcel.writeInt(this.date);
        parcel.writeString(this.timezone);
        parcel.writeDouble(this.maxValue);
        parcel.writeDouble(this.minValue);
        parcel.writeDouble(this.averageValue);
        parcel.writeDouble(this.exposure);
        parcel.writeLong(this.totalDuration);
        parcel.writeString(this.extension);
        parcel.writeInt(this.syncStatus);
    }

    public HearingHealthStat(Parcel parcel) {
        this.ssoid = parcel.readString();
        this.deviceUniqueId = parcel.readString();
        this.date = parcel.readInt();
        this.timezone = parcel.readString();
        this.maxValue = parcel.readDouble();
        this.minValue = parcel.readDouble();
        this.averageValue = parcel.readDouble();
        this.exposure = parcel.readDouble();
        this.totalDuration = parcel.readLong();
        this.extension = parcel.readString();
        this.syncStatus = parcel.readInt();
    }
}
