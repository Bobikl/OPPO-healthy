package com.heytap.databaseengine.model.bloodoxygensaturation;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.heytap.databaseengine.model.SportHealthData;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class BloodOxygenSaturationDataStat extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<BloodOxygenSaturationDataStat> CREATOR = new a();
    public static final int SPO2_INVALID_ODI = 99999;
    public static final String SPO2_INVALID_PERCENT = "spo2InvalidPercent";
    private int averageBloodOxygenSaturation;
    private int bloodOxygenSaturationDrop;
    private int date;
    private String deviceUniqueId;
    private int lowBloodOxygenSaturationDay;
    private long lowBloodOxygenSaturationTotalTime;
    private int maxBloodOxygenSaturation;
    private String metadata;
    private int minBloodOxygenSaturation;
    private String ssoid;
    private int syncStatus;
    private String timezone;

    public class a implements Parcelable.Creator<BloodOxygenSaturationDataStat> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BloodOxygenSaturationDataStat createFromParcel(Parcel parcel) {
            return new BloodOxygenSaturationDataStat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BloodOxygenSaturationDataStat[] newArray(int i) {
            return new BloodOxygenSaturationDataStat[i];
        }
    }

    public BloodOxygenSaturationDataStat() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getAverageBloodOxygenSaturation() {
        return this.averageBloodOxygenSaturation;
    }

    public int getBloodOxygenSaturationDrop() {
        return this.bloodOxygenSaturationDrop;
    }

    public int getDate() {
        return this.date;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    public int getLowBloodOxygenSaturationDay() {
        return this.lowBloodOxygenSaturationDay;
    }

    public long getLowBloodOxygenSaturationTotalTime() {
        return this.lowBloodOxygenSaturationTotalTime;
    }

    public int getMaxBloodOxygenSaturation() {
        return this.maxBloodOxygenSaturation;
    }

    public String getMetadata() {
        return this.metadata;
    }

    public int getMinBloodOxygenSaturation() {
        return this.minBloodOxygenSaturation;
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

    public void setAverageBloodOxygenSaturation(int i) {
        this.averageBloodOxygenSaturation = i;
    }

    public void setBloodOxygenSaturationDrop(int i) {
        this.bloodOxygenSaturationDrop = i;
    }

    public void setDate(int i) {
        this.date = i;
    }

    public void setDeviceUniqueId(String str) {
        this.deviceUniqueId = str;
    }

    public void setLowBloodOxygenSaturationDay(int i) {
        this.lowBloodOxygenSaturationDay = i;
    }

    public void setLowBloodOxygenSaturationTotalTime(long j2) {
        this.lowBloodOxygenSaturationTotalTime = j2;
    }

    public void setMaxBloodOxygenSaturation(int i) {
        this.maxBloodOxygenSaturation = i;
    }

    public void setMetadata(String str) {
        this.metadata = str;
    }

    public void setMinBloodOxygenSaturation(int i) {
        this.minBloodOxygenSaturation = i;
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

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "BloodOxygenSaturationDataStat{ssoid='" + this.ssoid + "', deviceUniqueId='" + this.deviceUniqueId + "', date=" + this.date + ", timezone='" + this.timezone + "', maxBloodOxygenSaturation=" + this.maxBloodOxygenSaturation + ", minBloodOxygenSaturation=" + this.minBloodOxygenSaturation + ", averageBloodOxygenSaturation=" + this.averageBloodOxygenSaturation + ", bloodOxygenSaturationDrop=" + this.bloodOxygenSaturationDrop + ", lowBloodOxygenSaturationTotalTime=" + this.lowBloodOxygenSaturationTotalTime + ", lowBloodOxygenSaturationDay=" + this.lowBloodOxygenSaturationDay + ", metadata='" + this.metadata + "', syncStatus=" + this.syncStatus + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ssoid);
        parcel.writeString(this.deviceUniqueId);
        parcel.writeInt(this.date);
        parcel.writeString(this.timezone);
        parcel.writeInt(this.maxBloodOxygenSaturation);
        parcel.writeInt(this.minBloodOxygenSaturation);
        parcel.writeInt(this.averageBloodOxygenSaturation);
        parcel.writeInt(this.bloodOxygenSaturationDrop);
        parcel.writeLong(this.lowBloodOxygenSaturationTotalTime);
        parcel.writeInt(this.lowBloodOxygenSaturationDay);
        parcel.writeString(this.metadata);
        parcel.writeInt(this.syncStatus);
    }

    public BloodOxygenSaturationDataStat(Parcel parcel) {
        this.ssoid = parcel.readString();
        this.deviceUniqueId = parcel.readString();
        this.date = parcel.readInt();
        this.timezone = parcel.readString();
        this.maxBloodOxygenSaturation = parcel.readInt();
        this.minBloodOxygenSaturation = parcel.readInt();
        this.averageBloodOxygenSaturation = parcel.readInt();
        this.bloodOxygenSaturationDrop = parcel.readInt();
        this.lowBloodOxygenSaturationTotalTime = parcel.readLong();
        this.lowBloodOxygenSaturationDay = parcel.readInt();
        this.metadata = parcel.readString();
        this.syncStatus = parcel.readInt();
    }
}
