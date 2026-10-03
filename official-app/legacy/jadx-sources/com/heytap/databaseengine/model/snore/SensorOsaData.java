package com.heytap.databaseengine.model.snore;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.heytap.databaseengine.model.SportHealthData;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class SensorOsaData extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<SensorOsaData> CREATOR = new a();
    private long dataTimestamp;
    private String deviceUniqueId;
    private String ssoid;
    private int type;
    private int value;

    public class a implements Parcelable.Creator<SensorOsaData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SensorOsaData createFromParcel(Parcel parcel) {
            return new SensorOsaData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SensorOsaData[] newArray(int i) {
            return new SensorOsaData[i];
        }
    }

    public SensorOsaData() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getDataTimestamp() {
        return this.dataTimestamp;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String getSsoid() {
        return this.ssoid;
    }

    public int getType() {
        return this.type;
    }

    public int getValue() {
        return this.value;
    }

    public void setDataTimestamp(long j2) {
        this.dataTimestamp = j2;
    }

    public void setDeviceUniqueId(String str) {
        this.deviceUniqueId = str;
    }

    public void setSsoid(String str) {
        this.ssoid = str;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setValue(int i) {
        this.value = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "SensorOsaData{ssoid='" + this.ssoid + "', deviceUniqueId='" + this.deviceUniqueId + "', dataTimestamp=" + this.dataTimestamp + ", type=" + this.type + ", value=" + this.value + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ssoid);
        parcel.writeString(this.deviceUniqueId);
        parcel.writeLong(this.dataTimestamp);
        parcel.writeInt(this.type);
        parcel.writeInt(this.value);
    }

    public SensorOsaData(Parcel parcel) {
        this.ssoid = parcel.readString();
        this.deviceUniqueId = parcel.readString();
        this.dataTimestamp = parcel.readLong();
        this.type = parcel.readInt();
        this.value = parcel.readInt();
    }
}
