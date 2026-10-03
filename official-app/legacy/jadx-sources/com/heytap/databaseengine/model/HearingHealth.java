package com.heytap.databaseengine.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class HearingHealth extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<HearingHealth> CREATOR = new a();
    private long dataCreatedTimestamp;
    private double dbValue;
    private String deviceName;
    private String deviceUniqueId;
    private int display;
    private long duration;
    private String extension;
    private String ssoid;
    private int syncStatus;

    public class a implements Parcelable.Creator<HearingHealth> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public HearingHealth createFromParcel(Parcel parcel) {
            return new HearingHealth(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public HearingHealth[] newArray(int i) {
            return new HearingHealth[i];
        }
    }

    public HearingHealth() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getDataCreatedTimestamp() {
        return this.dataCreatedTimestamp;
    }

    public double getDbValue() {
        return this.dbValue;
    }

    public String getDeviceName() {
        return this.deviceName;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    public int getDisplay() {
        return this.display;
    }

    public long getDuration() {
        return this.duration;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public long getEndTimestamp() {
        return getDataCreatedTimestamp();
    }

    public String getExtension() {
        return this.extension;
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

    public void setDbValue(double d) {
        this.dbValue = d;
    }

    public void setDeviceName(String str) {
        this.deviceName = str;
    }

    public void setDeviceUniqueId(String str) {
        this.deviceUniqueId = str;
    }

    public void setDisplay(int i) {
        this.display = i;
    }

    public void setDuration(long j2) {
        this.duration = j2;
    }

    public void setExtension(String str) {
        this.extension = str;
    }

    public void setSsoid(String str) {
        this.ssoid = str;
    }

    public void setSyncStatus(int i) {
        this.syncStatus = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "HearingHealth{ssoid='" + this.ssoid + "', deviceUniqueId='" + this.deviceUniqueId + "', deviceName='" + this.deviceName + "', dataCreatedTimestamp=" + this.dataCreatedTimestamp + ", dbValue=" + this.dbValue + ", duration=" + this.duration + ", display=" + this.display + ", syncStatus=" + this.syncStatus + ", extension='" + this.extension + "'} ";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ssoid);
        parcel.writeString(this.deviceUniqueId);
        parcel.writeString(this.deviceName);
        parcel.writeLong(this.dataCreatedTimestamp);
        parcel.writeDouble(this.dbValue);
        parcel.writeLong(this.duration);
        parcel.writeInt(this.display);
        parcel.writeInt(this.syncStatus);
        parcel.writeString(this.extension);
    }

    public HearingHealth(Parcel parcel) {
        this.ssoid = parcel.readString();
        this.deviceUniqueId = parcel.readString();
        this.deviceName = parcel.readString();
        this.dataCreatedTimestamp = parcel.readLong();
        this.dbValue = parcel.readDouble();
        this.duration = parcel.readLong();
        this.display = parcel.readInt();
        this.syncStatus = parcel.readInt();
        this.extension = parcel.readString();
    }
}
