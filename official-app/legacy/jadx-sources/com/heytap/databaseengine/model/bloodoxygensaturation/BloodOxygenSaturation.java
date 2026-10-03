package com.heytap.databaseengine.model.bloodoxygensaturation;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.heytap.databaseengine.model.SportHealthData;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class BloodOxygenSaturation extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<BloodOxygenSaturation> CREATOR = new a();
    private int bloodOxygenSaturationType;
    private int bloodOxygenSaturationValue;
    private long dataCreatedTimestamp;
    private String deviceUniqueId;
    private int display;
    private String ssoid;
    private int syncStatus;

    public class a implements Parcelable.Creator<BloodOxygenSaturation> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BloodOxygenSaturation createFromParcel(Parcel parcel) {
            return new BloodOxygenSaturation(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BloodOxygenSaturation[] newArray(int i) {
            return new BloodOxygenSaturation[i];
        }
    }

    public BloodOxygenSaturation() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getBloodOxygenSaturationType() {
        return this.bloodOxygenSaturationType;
    }

    public int getBloodOxygenSaturationValue() {
        return this.bloodOxygenSaturationValue;
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

    public int getSyncStatus() {
        return this.syncStatus;
    }

    public void setBloodOxygenSaturationType(int i) {
        this.bloodOxygenSaturationType = i;
    }

    public void setBloodOxygenSaturationValue(int i) {
        this.bloodOxygenSaturationValue = i;
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

    public void setSyncStatus(int i) {
        this.syncStatus = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "BloodOxygenSaturation{ssoid='" + this.ssoid + "', deviceUniqueId='" + this.deviceUniqueId + "', dataCreatedTimestamp=" + this.dataCreatedTimestamp + ", bloodOxygenSaturationType=" + this.bloodOxygenSaturationType + ", bloodOxygenSaturationValue=" + this.bloodOxygenSaturationValue + ", display=" + this.display + ", syncStatus=" + this.syncStatus + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ssoid);
        parcel.writeString(this.deviceUniqueId);
        parcel.writeLong(this.dataCreatedTimestamp);
        parcel.writeInt(this.bloodOxygenSaturationType);
        parcel.writeInt(this.bloodOxygenSaturationValue);
        parcel.writeInt(this.display);
        parcel.writeInt(this.syncStatus);
    }

    public BloodOxygenSaturation(Parcel parcel) {
        this.ssoid = parcel.readString();
        this.deviceUniqueId = parcel.readString();
        this.dataCreatedTimestamp = parcel.readLong();
        this.bloodOxygenSaturationType = parcel.readInt();
        this.bloodOxygenSaturationValue = parcel.readInt();
        this.display = parcel.readInt();
        this.syncStatus = parcel.readInt();
    }
}
