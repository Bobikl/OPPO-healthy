package com.heytap.databaseengine.model.snore;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.heytap.databaseengine.model.SportHealthData;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class SnoreEnvNoise extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<SnoreEnvNoise> CREATOR = new a();
    private long dataTimestamp;
    private String deviceId;
    private String deviceUniqueId;
    private Long recordEndTimestamp;
    private Long recordStartTimestamp;
    private String ssoid;
    private Integer value;

    public class a implements Parcelable.Creator<SnoreEnvNoise> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SnoreEnvNoise createFromParcel(Parcel parcel) {
            return new SnoreEnvNoise(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SnoreEnvNoise[] newArray(int i) {
            return new SnoreEnvNoise[i];
        }
    }

    public SnoreEnvNoise() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getDataTimestamp() {
        return this.dataTimestamp;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    public Long getRecordEndTimestamp() {
        return this.recordEndTimestamp;
    }

    public Long getRecordStartTimestamp() {
        return this.recordStartTimestamp;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String getSsoid() {
        return this.ssoid;
    }

    public Integer getValue() {
        return this.value;
    }

    public void setDataTimestamp(long j2) {
        this.dataTimestamp = j2;
    }

    public void setDeviceId(String str) {
        this.deviceId = str;
    }

    public void setDeviceUniqueId(String str) {
        this.deviceUniqueId = str;
    }

    public void setRecordEndTimestamp(Long l2) {
        this.recordEndTimestamp = l2;
    }

    public void setRecordStartTimestamp(Long l2) {
        this.recordStartTimestamp = l2;
    }

    public void setSsoid(String str) {
        this.ssoid = str;
    }

    public void setValue(Integer num) {
        this.value = num;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "SnoreEnvNoise{ssoid='" + this.ssoid + "', deviceUniqueId='" + this.deviceUniqueId + "', deviceId='" + this.deviceId + "', recordStartTimestamp=" + this.recordStartTimestamp + ", recordEndTimestamp=" + this.recordEndTimestamp + ", dataTimestamp=" + this.dataTimestamp + ", value=" + this.value + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ssoid);
        parcel.writeString(this.deviceUniqueId);
        parcel.writeString(this.deviceId);
        parcel.writeValue(this.recordStartTimestamp);
        parcel.writeValue(this.recordEndTimestamp);
        parcel.writeLong(this.dataTimestamp);
        parcel.writeValue(this.value);
    }

    public SnoreEnvNoise(Parcel parcel) {
        this.ssoid = parcel.readString();
        this.deviceUniqueId = parcel.readString();
        this.deviceId = parcel.readString();
        this.recordStartTimestamp = (Long) parcel.readValue(Long.class.getClassLoader());
        this.recordEndTimestamp = (Long) parcel.readValue(Long.class.getClassLoader());
        this.dataTimestamp = parcel.readLong();
        this.value = (Integer) parcel.readValue(Integer.class.getClassLoader());
    }
}
