package com.heytap.databaseengine.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class Sleep extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<Sleep> CREATOR = new a();
    private int algOriginState;
    private int dataVersion;
    private Integer deviceType;
    private String deviceUniqueId;
    private int display;
    private long endTimestamp;
    private String metadata;
    private int sleepState;
    private int sleepType;
    private String ssoid;
    private long startTimestamp;
    private int syncStatus;

    public class a implements Parcelable.Creator<Sleep> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Sleep createFromParcel(Parcel parcel) {
            return new Sleep(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Sleep[] newArray(int i) {
            return new Sleep[i];
        }
    }

    public Sleep() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getAlgOriginState() {
        return this.algOriginState;
    }

    public int getDataVersion() {
        return this.dataVersion;
    }

    public Integer getDeviceType() {
        return this.deviceType;
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
        return this.endTimestamp;
    }

    public String getMetadata() {
        return this.metadata;
    }

    public int getSleepState() {
        return this.sleepState;
    }

    public int getSleepType() {
        return this.sleepType;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String getSsoid() {
        return this.ssoid;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public long getStartTimestamp() {
        return this.startTimestamp;
    }

    public int getSyncStatus() {
        return this.syncStatus;
    }

    public void setAlgOriginState(int i) {
        this.algOriginState = i;
    }

    public void setDataVersion(int i) {
        this.dataVersion = i;
    }

    public void setDeviceType(Integer num) {
        this.deviceType = num;
    }

    public void setDeviceUniqueId(String str) {
        this.deviceUniqueId = str;
    }

    public void setDisplay(int i) {
        this.display = i;
    }

    public void setEndTimestamp(long j2) {
        this.endTimestamp = j2;
    }

    public void setMetadata(String str) {
        this.metadata = str;
    }

    public void setSleepState(int i) {
        this.sleepState = i;
    }

    public void setSleepType(int i) {
        this.sleepType = i;
    }

    public void setSsoid(String str) {
        this.ssoid = str;
    }

    public void setStartTimestamp(long j2) {
        this.startTimestamp = j2;
    }

    public void setSyncStatus(int i) {
        this.syncStatus = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "Sleep{ssoid='" + this.ssoid + "', deviceUniqueId='" + this.deviceUniqueId + "', startTimestamp=" + this.startTimestamp + ", endTimestamp=" + this.endTimestamp + ", sleepType=" + this.sleepType + ", sleepState=" + this.sleepState + ", algOriginState=" + this.algOriginState + ", metadata='" + this.metadata + "', dataVersion=" + this.dataVersion + ", display=" + this.display + ", syncStatus=" + this.syncStatus + ", deviceType=" + this.deviceType + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ssoid);
        parcel.writeString(this.deviceUniqueId);
        parcel.writeLong(this.startTimestamp);
        parcel.writeLong(this.endTimestamp);
        parcel.writeInt(this.sleepType);
        parcel.writeInt(this.sleepState);
        parcel.writeInt(this.algOriginState);
        parcel.writeString(this.metadata);
        parcel.writeInt(this.dataVersion);
        parcel.writeInt(this.display);
        parcel.writeInt(this.syncStatus);
        parcel.writeValue(this.deviceType);
    }

    public Sleep(Parcel parcel) {
        this.ssoid = parcel.readString();
        this.deviceUniqueId = parcel.readString();
        this.startTimestamp = parcel.readLong();
        this.endTimestamp = parcel.readLong();
        this.sleepType = parcel.readInt();
        this.sleepState = parcel.readInt();
        this.algOriginState = parcel.readInt();
        this.metadata = parcel.readString();
        this.dataVersion = parcel.readInt();
        this.display = parcel.readInt();
        this.syncStatus = parcel.readInt();
        this.deviceType = (Integer) parcel.readValue(Integer.class.getClassLoader());
    }
}
