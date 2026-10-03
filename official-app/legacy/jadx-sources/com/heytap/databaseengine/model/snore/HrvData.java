package com.heytap.databaseengine.model.snore;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.heytap.databaseengine.model.SportHealthData;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class HrvData extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<HrvData> CREATOR = new a();
    private String deviceUniqueId;
    private int display;
    private long endTimestamp;
    private int hrvType;
    private int hrvValue;
    private String metadata;
    private String ssoid;
    private long startTimestamp;
    private int syncStatus;

    public class a implements Parcelable.Creator<HrvData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public HrvData createFromParcel(Parcel parcel) {
            return new HrvData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public HrvData[] newArray(int i) {
            return new HrvData[i];
        }
    }

    public HrvData() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
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

    public int getHrvType() {
        return this.hrvType;
    }

    public int getHrvValue() {
        return this.hrvValue;
    }

    public String getMetadata() {
        return this.metadata;
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

    public void setDeviceUniqueId(String str) {
        this.deviceUniqueId = str;
    }

    public void setDisplay(int i) {
        this.display = i;
    }

    public void setEndTimestamp(long j2) {
        this.endTimestamp = j2;
    }

    public void setHrvType(int i) {
        this.hrvType = i;
    }

    public void setHrvValue(int i) {
        this.hrvValue = i;
    }

    public void setMetadata(String str) {
        this.metadata = str;
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
        return "HrvData{ssoid='" + this.ssoid + "', deviceUniqueId='" + this.deviceUniqueId + "', startTimestamp=" + this.startTimestamp + ", endTimestamp=" + this.endTimestamp + ", hrvType=" + this.hrvType + ", hrvValue=" + this.hrvValue + ", metadata='" + this.metadata + "', display=" + this.display + ", syncStatus=" + this.syncStatus + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ssoid);
        parcel.writeString(this.deviceUniqueId);
        parcel.writeLong(this.startTimestamp);
        parcel.writeLong(this.endTimestamp);
        parcel.writeInt(this.hrvType);
        parcel.writeInt(this.hrvValue);
        parcel.writeString(this.metadata);
        parcel.writeInt(this.display);
        parcel.writeInt(this.syncStatus);
    }

    public HrvData(Parcel parcel) {
        this.ssoid = parcel.readString();
        this.deviceUniqueId = parcel.readString();
        this.startTimestamp = parcel.readLong();
        this.endTimestamp = parcel.readLong();
        this.hrvType = parcel.readInt();
        this.hrvValue = parcel.readInt();
        this.metadata = parcel.readString();
        this.display = parcel.readInt();
        this.syncStatus = parcel.readInt();
    }
}
