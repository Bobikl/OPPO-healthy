package com.heytap.databaseengine.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class RecoveryHeartRate extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<RecoveryHeartRate> CREATOR = new a();
    private String deviceCategory;
    private String deviceUniqueId;
    private long endTimestamp;
    private String recoveryHeartRate;
    private int sportMode;
    private String ssoid;
    private long startTimestamp;
    private int version;

    public class a implements Parcelable.Creator<RecoveryHeartRate> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public RecoveryHeartRate createFromParcel(Parcel parcel) {
            return new RecoveryHeartRate(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public RecoveryHeartRate[] newArray(int i) {
            return new RecoveryHeartRate[i];
        }
    }

    public RecoveryHeartRate() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getDeviceCategory() {
        return this.deviceCategory;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public long getEndTimestamp() {
        return this.endTimestamp;
    }

    public String getRecoveryHeartRate() {
        return this.recoveryHeartRate;
    }

    public int getSportMode() {
        return this.sportMode;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String getSsoid() {
        return this.ssoid;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public long getStartTimestamp() {
        return this.startTimestamp;
    }

    public int getVersion() {
        return this.version;
    }

    public void setDeviceCategory(String str) {
        this.deviceCategory = str;
    }

    public void setDeviceUniqueId(String str) {
        this.deviceUniqueId = str;
    }

    public void setEndTimestamp(long j2) {
        this.endTimestamp = j2;
    }

    public void setRecoveryHeartRate(String str) {
        this.recoveryHeartRate = str;
    }

    public void setSportMode(int i) {
        this.sportMode = i;
    }

    public void setSsoid(String str) {
        this.ssoid = str;
    }

    public void setStartTimestamp(long j2) {
        this.startTimestamp = j2;
    }

    public void setVersion(int i) {
        this.version = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "DBRecoveryHeartRate{, deviceCategory='" + this.deviceCategory + "', sportMode=" + this.sportMode + ", startTimestamp=" + this.startTimestamp + ", endTimestamp=" + this.endTimestamp + ", recoveryHeartRate='" + this.recoveryHeartRate + "', version=" + this.version + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ssoid);
        parcel.writeString(this.deviceUniqueId);
        parcel.writeString(this.deviceCategory);
        parcel.writeInt(this.sportMode);
        parcel.writeLong(this.startTimestamp);
        parcel.writeLong(this.endTimestamp);
        parcel.writeString(this.recoveryHeartRate);
        parcel.writeInt(this.version);
    }

    public RecoveryHeartRate(Parcel parcel) {
        this.ssoid = parcel.readString();
        this.deviceUniqueId = parcel.readString();
        this.deviceCategory = parcel.readString();
        this.sportMode = parcel.readInt();
        this.startTimestamp = parcel.readLong();
        this.endTimestamp = parcel.readLong();
        this.recoveryHeartRate = parcel.readString();
        this.version = parcel.readInt();
    }
}
