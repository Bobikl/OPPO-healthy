package com.heytap.databaseengine.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class TumbleRecord extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<TumbleRecord> CREATOR = new a();
    private long dataCreatedTimestamp;
    private String deviceUniqueId;
    private int display;
    private String ssoid;
    private int state;
    private int syncStatus;

    public class a implements Parcelable.Creator<TumbleRecord> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TumbleRecord createFromParcel(Parcel parcel) {
            return new TumbleRecord(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public TumbleRecord[] newArray(int i) {
            return new TumbleRecord[i];
        }
    }

    public TumbleRecord() {
        this.ssoid = "";
        this.deviceUniqueId = "";
        this.display = 1;
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

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String getSsoid() {
        return this.ssoid;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public long getStartTimestamp() {
        return getDataCreatedTimestamp();
    }

    public int getState() {
        return this.state;
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

    public void setSsoid(String str) {
        this.ssoid = str;
    }

    public void setState(int i) {
        this.state = i;
    }

    public void setSyncStatus(int i) {
        this.syncStatus = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "TumbleRecord{ssoid='" + this.ssoid + "', deviceUniqueId='" + this.deviceUniqueId + "', dataCreatedTimestamp=" + this.dataCreatedTimestamp + ", state=" + this.state + ", display=" + this.display + ", syncStatus=" + this.syncStatus + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ssoid);
        parcel.writeString(this.deviceUniqueId);
        parcel.writeLong(this.dataCreatedTimestamp);
        parcel.writeInt(this.state);
        parcel.writeInt(this.display);
        parcel.writeInt(this.syncStatus);
    }

    public TumbleRecord(Parcel parcel) {
        this.ssoid = "";
        this.deviceUniqueId = "";
        this.display = 1;
        this.ssoid = parcel.readString();
        this.deviceUniqueId = parcel.readString();
        this.dataCreatedTimestamp = parcel.readLong();
        this.state = parcel.readInt();
        this.display = parcel.readInt();
        this.syncStatus = parcel.readInt();
    }
}
