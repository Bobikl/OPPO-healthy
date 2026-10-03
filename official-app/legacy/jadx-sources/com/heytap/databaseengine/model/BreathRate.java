package com.heytap.databaseengine.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class BreathRate extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<BreathRate> CREATOR = new a();
    private Integer config;
    private long dataCreatedTimestamp;
    private String deviceType;
    private String deviceUniqueId;
    private String ssoid;
    private Integer value;

    public class a implements Parcelable.Creator<BreathRate> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BreathRate createFromParcel(Parcel parcel) {
            return new BreathRate(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BreathRate[] newArray(int i) {
            return new BreathRate[i];
        }
    }

    public BreathRate() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Integer getConfig() {
        return this.config;
    }

    public long getDataCreatedTimestamp() {
        return this.dataCreatedTimestamp;
    }

    public String getDeviceType() {
        return this.deviceType;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String getSsoid() {
        return this.ssoid;
    }

    public Integer getValue() {
        return this.value;
    }

    public void setConfig(Integer num) {
        this.config = num;
    }

    public void setDataCreatedTimestamp(long j2) {
        this.dataCreatedTimestamp = j2;
    }

    public void setDeviceType(String str) {
        this.deviceType = str;
    }

    public void setDeviceUniqueId(String str) {
        this.deviceUniqueId = str;
    }

    public void setSsoid(String str) {
        this.ssoid = str;
    }

    public void setValue(Integer num) {
        this.value = num;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "BreathRate{ssoid='" + this.ssoid + "', deviceType=" + this.deviceType + ", deviceUniqueId='" + this.deviceUniqueId + "', dataCreatedTimestamp=" + this.dataCreatedTimestamp + ", value=" + this.value + ", config=" + this.config + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ssoid);
        parcel.writeString(this.deviceType);
        parcel.writeString(this.deviceUniqueId);
        parcel.writeLong(this.dataCreatedTimestamp);
        parcel.writeValue(this.value);
        parcel.writeValue(this.config);
    }

    public BreathRate(Parcel parcel) {
        this.ssoid = parcel.readString();
        this.deviceType = parcel.readString();
        this.deviceUniqueId = parcel.readString();
        this.dataCreatedTimestamp = parcel.readLong();
        this.value = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.config = (Integer) parcel.readValue(Integer.class.getClassLoader());
    }
}
