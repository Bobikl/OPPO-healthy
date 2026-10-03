package com.heytap.databaseengine.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class SportRecord extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<SportRecord> CREATOR = new a();
    private int abnormalTrack;
    private String clientDataId;
    private String deviceType;
    private String deviceUniqueId;
    private int display;
    private int distance;
    private long duration;
    private long endTime;
    private String metaData;
    private String ssoid;
    private long startTime;
    private int syncStatus;
    private String timezone;
    private int trackType;

    public class a implements Parcelable.Creator<SportRecord> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SportRecord createFromParcel(Parcel parcel) {
            return new SportRecord(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SportRecord[] newArray(int i) {
            return new SportRecord[i];
        }
    }

    public SportRecord() {
        this.abnormalTrack = 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getAbnormalTrack() {
        return this.abnormalTrack;
    }

    public String getClientDataId() {
        return this.clientDataId;
    }

    public String getDeviceType() {
        return this.deviceType;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    public int getDisplay() {
        return this.display;
    }

    public int getDistance() {
        return this.distance;
    }

    public long getDuration() {
        return this.duration;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public String getMetaData() {
        return this.metaData;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String getSsoid() {
        return this.ssoid;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public int getSyncStatus() {
        return this.syncStatus;
    }

    public String getTimezone() {
        return this.timezone;
    }

    public int getTrackType() {
        return this.trackType;
    }

    public void setAbnormalTrack(int i) {
        this.abnormalTrack = i;
    }

    public void setClientDataId(String str) {
        this.clientDataId = str;
    }

    public void setDeviceType(String str) {
        this.deviceType = str;
    }

    public void setDeviceUniqueId(String str) {
        this.deviceUniqueId = str;
    }

    public void setDisplay(int i) {
        this.display = i;
    }

    public void setDistance(int i) {
        this.distance = i;
    }

    public void setDuration(long j2) {
        this.duration = j2;
    }

    public void setEndTime(long j2) {
        this.endTime = j2;
    }

    public void setMetaData(String str) {
        this.metaData = str;
    }

    public void setSsoid(String str) {
        this.ssoid = str;
    }

    public void setStartTime(long j2) {
        this.startTime = j2;
    }

    public void setSyncStatus(int i) {
        this.syncStatus = i;
    }

    public void setTimezone(String str) {
        this.timezone = str;
    }

    public void setTrackType(int i) {
        this.trackType = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "SportRecord{clientDataId='" + this.clientDataId + "'ssoid='" + this.ssoid + "', trackType=" + this.trackType + ", deviceUniqueId='" + this.deviceUniqueId + "', startTime=" + this.startTime + ", endTime=" + this.endTime + ", duration=" + this.duration + ", distance=" + this.distance + ", metaData=" + this.metaData + ", syncStatus=" + this.syncStatus + ", timezone=" + this.timezone + ", abnormalTrack=" + this.abnormalTrack + ", display=" + this.display + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.clientDataId);
        parcel.writeString(this.ssoid);
        parcel.writeInt(this.trackType);
        parcel.writeString(this.deviceUniqueId);
        parcel.writeLong(this.startTime);
        parcel.writeLong(this.endTime);
        parcel.writeLong(this.duration);
        parcel.writeInt(this.distance);
        parcel.writeString(this.metaData);
        parcel.writeInt(this.syncStatus);
        parcel.writeString(this.timezone);
        parcel.writeString(this.deviceType);
        parcel.writeInt(this.abnormalTrack);
        parcel.writeInt(this.display);
    }

    public SportRecord(Parcel parcel) {
        this.abnormalTrack = 0;
        this.clientDataId = parcel.readString();
        this.ssoid = parcel.readString();
        this.trackType = parcel.readInt();
        this.deviceUniqueId = parcel.readString();
        this.startTime = parcel.readLong();
        this.endTime = parcel.readLong();
        this.duration = parcel.readLong();
        this.distance = parcel.readInt();
        this.metaData = parcel.readString();
        this.syncStatus = parcel.readInt();
        this.timezone = parcel.readString();
        this.deviceType = parcel.readString();
        this.abnormalTrack = parcel.readInt();
        this.display = parcel.readInt();
    }
}
