package com.heytap.databaseengine.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class HeartRate extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<HeartRate> CREATOR = new a();
    private long dataCreatedTimestamp;
    private String deviceUniqueId;
    private int display;
    private int heartRateType;
    private int heartRateValue;
    private Integer reliability;
    private String ssoid;
    private int syncStatus;

    public class a implements Parcelable.Creator<HeartRate> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public HeartRate createFromParcel(Parcel parcel) {
            return new HeartRate(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public HeartRate[] newArray(int i) {
            return new HeartRate[i];
        }
    }

    public HeartRate() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getDataCreatedTimestamp() {
        return this.dataCreatedTimestamp;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    public int getDisplay() {
        return this.display;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public long getEndTimestamp() {
        return getDataCreatedTimestamp();
    }

    public int getHeartRateType() {
        return this.heartRateType;
    }

    public int getHeartRateValue() {
        return this.heartRateValue;
    }

    public Integer getReliability() {
        return this.reliability;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String getSsoid() {
        return this.ssoid;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public long getStartTimestamp() {
        return getDataCreatedTimestamp();
    }

    public int getSyncStatus() {
        return this.syncStatus;
    }

    public void setDataCreatedTimestamp(long j2) {
        this.dataCreatedTimestamp = j2;
    }

    public void setDeviceUniqueId(String str) {
        this.deviceUniqueId = str;
    }

    public void setDisplay(int i) {
        this.display = i;
    }

    public void setHeartRateType(int i) {
        this.heartRateType = i;
    }

    public void setHeartRateValue(int i) {
        this.heartRateValue = i;
    }

    public void setReliability(Integer num) {
        this.reliability = num;
    }

    public void setSsoid(String str) {
        this.ssoid = str;
    }

    public void setSyncStatus(int i) {
        this.syncStatus = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "HeartRate{ssoid='" + this.ssoid + "', deviceUniqueId='" + this.deviceUniqueId + "', dataCreatedTimestamp=" + this.dataCreatedTimestamp + ", heartRateType=" + this.heartRateType + ", heartRateValue=" + this.heartRateValue + ", reliability=" + this.reliability + ", display=" + this.display + ", syncStatus=" + this.syncStatus + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ssoid);
        parcel.writeString(this.deviceUniqueId);
        parcel.writeLong(this.dataCreatedTimestamp);
        parcel.writeInt(this.heartRateType);
        parcel.writeInt(this.heartRateValue);
        parcel.writeValue(this.reliability);
        parcel.writeInt(this.display);
        parcel.writeInt(this.syncStatus);
    }

    public HeartRate(long j2, int i) {
        this.dataCreatedTimestamp = j2;
        this.heartRateValue = i;
    }

    public HeartRate(Parcel parcel) {
        this.ssoid = parcel.readString();
        this.deviceUniqueId = parcel.readString();
        this.dataCreatedTimestamp = parcel.readLong();
        this.heartRateType = parcel.readInt();
        this.heartRateValue = parcel.readInt();
        this.reliability = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.display = parcel.readInt();
        this.syncStatus = parcel.readInt();
    }
}
