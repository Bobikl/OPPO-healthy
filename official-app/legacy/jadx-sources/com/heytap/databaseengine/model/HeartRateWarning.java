package com.heytap.databaseengine.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class HeartRateWarning extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<HeartRateWarning> CREATOR = new a();
    private String deviceUniqueId;
    private long endTimestamp;
    private int maxHeartRate;
    private int maxHeartRateThreshold;
    private int minHeartRate;
    private int minHeartRateThreshold;
    private String ssoid;
    private long startTimestamp;
    private int warningHeartRateType;
    private int warningType;

    public class a implements Parcelable.Creator<HeartRateWarning> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public HeartRateWarning createFromParcel(Parcel parcel) {
            return new HeartRateWarning(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public HeartRateWarning[] newArray(int i) {
            return new HeartRateWarning[i];
        }
    }

    public HeartRateWarning() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public long getEndTimestamp() {
        return this.endTimestamp;
    }

    public int getMaxHeartRate() {
        return this.maxHeartRate;
    }

    public int getMaxHeartRateThreshold() {
        return this.maxHeartRateThreshold;
    }

    public int getMinHeartRate() {
        return this.minHeartRate;
    }

    public int getMinHeartRateThreshold() {
        return this.minHeartRateThreshold;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String getSsoid() {
        return this.ssoid;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public long getStartTimestamp() {
        return this.startTimestamp;
    }

    public int getWarningHeartRateType() {
        return this.warningHeartRateType;
    }

    public int getWarningType() {
        return this.warningType;
    }

    public void setDeviceUniqueId(String str) {
        this.deviceUniqueId = str;
    }

    public void setEndTimestamp(long j2) {
        this.endTimestamp = j2;
    }

    public void setMaxHeartRate(int i) {
        this.maxHeartRate = i;
    }

    public void setMaxHeartRateThreshold(int i) {
        this.maxHeartRateThreshold = i;
    }

    public void setMinHeartRate(int i) {
        this.minHeartRate = i;
    }

    public void setMinHeartRateThreshold(int i) {
        this.minHeartRateThreshold = i;
    }

    public void setSsoid(String str) {
        this.ssoid = str;
    }

    public void setStartTimestamp(long j2) {
        this.startTimestamp = j2;
    }

    public void setWarningHeartRateType(int i) {
        this.warningHeartRateType = i;
    }

    public void setWarningType(int i) {
        this.warningType = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "HeartRateWarning{ssoid='" + this.ssoid + "', deviceUniqueId='" + this.deviceUniqueId + "', warningType=" + this.warningType + ", warningHeartRateType=" + this.warningHeartRateType + ", minHeartRate=" + this.minHeartRate + ", maxHeartRate=" + this.maxHeartRate + ", startTimestamp=" + this.startTimestamp + ", endTimestamp=" + this.endTimestamp + ", minHeartRateThreshold=" + this.minHeartRateThreshold + ", maxHeartRateThreshold=" + this.maxHeartRateThreshold + "} ";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ssoid);
        parcel.writeString(this.deviceUniqueId);
        parcel.writeInt(this.warningType);
        parcel.writeInt(this.warningHeartRateType);
        parcel.writeInt(this.minHeartRate);
        parcel.writeInt(this.maxHeartRate);
        parcel.writeLong(this.startTimestamp);
        parcel.writeLong(this.endTimestamp);
        parcel.writeInt(this.minHeartRateThreshold);
        parcel.writeInt(this.maxHeartRateThreshold);
    }

    public HeartRateWarning(Parcel parcel) {
        this.ssoid = parcel.readString();
        this.deviceUniqueId = parcel.readString();
        this.warningType = parcel.readInt();
        this.warningHeartRateType = parcel.readInt();
        this.minHeartRate = parcel.readInt();
        this.maxHeartRate = parcel.readInt();
        this.startTimestamp = parcel.readLong();
        this.endTimestamp = parcel.readLong();
        this.minHeartRateThreshold = parcel.readInt();
        this.maxHeartRateThreshold = parcel.readInt();
    }
}
