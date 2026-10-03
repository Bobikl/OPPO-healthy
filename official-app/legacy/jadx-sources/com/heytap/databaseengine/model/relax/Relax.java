package com.heytap.databaseengine.model.relax;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.heytap.databaseengine.model.SportHealthData;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class Relax extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<Relax> CREATOR = new a();
    private String clientDataId;
    private int del;
    private String deviceUniqueId;
    private int display;
    private String extension;
    private String heartRateDetail;
    private int maxHeartRate;
    private int minHeartRate;
    private Integer physicalMental;
    private Integer physicalMentalState;
    private int relaxDuration;
    private String ssoid;
    private long startTimestamp;
    private int stressValue;
    private int subType;
    private int syncStatus;
    private int type;
    private int version;

    public class a implements Parcelable.Creator<Relax> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Relax createFromParcel(Parcel parcel) {
            return new Relax(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Relax[] newArray(int i) {
            return new Relax[i];
        }
    }

    public Relax() {
        this.display = 1;
        this.syncStatus = 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getClientDataId() {
        return this.clientDataId;
    }

    public int getDel() {
        return this.del;
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
        return getStartTimestamp();
    }

    public String getExtension() {
        return this.extension;
    }

    public String getHeartRateDetail() {
        return this.heartRateDetail;
    }

    public int getMaxHeartRate() {
        return this.maxHeartRate;
    }

    public int getMinHeartRate() {
        return this.minHeartRate;
    }

    public Integer getPhysicalMental() {
        return this.physicalMental;
    }

    public Integer getPhysicalMentalState() {
        return this.physicalMentalState;
    }

    public int getRelaxDuration() {
        return this.relaxDuration;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String getSsoid() {
        return this.ssoid;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public long getStartTimestamp() {
        return this.startTimestamp;
    }

    public int getStressValue() {
        return this.stressValue;
    }

    public int getSubType() {
        return this.subType;
    }

    public int getSyncStatus() {
        return this.syncStatus;
    }

    public int getType() {
        return this.type;
    }

    public int getVersion() {
        return this.version;
    }

    public void setClientDataId(String str) {
        this.clientDataId = str;
    }

    public void setDel(int i) {
        this.del = i;
    }

    public void setDeviceUniqueId(String str) {
        this.deviceUniqueId = str;
    }

    public void setDisplay(int i) {
        this.display = i;
    }

    public void setExtension(String str) {
        this.extension = str;
    }

    public void setHeartRateDetail(String str) {
        this.heartRateDetail = str;
    }

    public void setMaxHeartRate(int i) {
        this.maxHeartRate = i;
    }

    public void setMinHeartRate(int i) {
        this.minHeartRate = i;
    }

    public void setPhysicalMental(Integer num) {
        this.physicalMental = num;
    }

    public void setPhysicalMentalState(Integer num) {
        this.physicalMentalState = num;
    }

    public void setRelaxDuration(int i) {
        this.relaxDuration = i;
    }

    public void setSsoid(String str) {
        this.ssoid = str;
    }

    public void setStartTimestamp(long j2) {
        this.startTimestamp = j2;
    }

    public void setStressValue(int i) {
        this.stressValue = i;
    }

    public void setSubType(int i) {
        this.subType = i;
    }

    public void setSyncStatus(int i) {
        this.syncStatus = i;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setVersion(int i) {
        this.version = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "DBRelax{clientDataId='" + this.clientDataId + "', ssoid='" + this.ssoid + "', deviceUniqueId='" + this.deviceUniqueId + "', startTimestamp=" + this.startTimestamp + ", relaxDuration=" + this.relaxDuration + ", maxHeartRate=" + this.maxHeartRate + ", minHeartRate=" + this.minHeartRate + ", stressValue=" + this.stressValue + ", physicalMental=" + this.physicalMental + ", physicalMentalState=" + this.physicalMentalState + ", type=" + this.type + ", subType=" + this.subType + ", heartRateDetail='" + this.heartRateDetail + "', version=" + this.version + ", extension='" + this.extension + "', display=" + this.display + ", syncStatus=" + this.syncStatus + ", del=" + this.del + "} ";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.clientDataId);
        parcel.writeString(this.ssoid);
        parcel.writeString(this.deviceUniqueId);
        parcel.writeLong(this.startTimestamp);
        parcel.writeInt(this.relaxDuration);
        parcel.writeInt(this.maxHeartRate);
        parcel.writeInt(this.minHeartRate);
        parcel.writeInt(this.stressValue);
        parcel.writeValue(this.physicalMental);
        parcel.writeValue(this.physicalMentalState);
        parcel.writeInt(this.type);
        parcel.writeInt(this.subType);
        parcel.writeString(this.heartRateDetail);
        parcel.writeInt(this.version);
        parcel.writeString(this.extension);
        parcel.writeInt(this.display);
        parcel.writeInt(this.syncStatus);
        parcel.writeInt(this.del);
    }

    public Relax(Parcel parcel) {
        this.display = 1;
        this.syncStatus = 0;
        this.clientDataId = parcel.readString();
        this.ssoid = parcel.readString();
        this.deviceUniqueId = parcel.readString();
        this.startTimestamp = parcel.readLong();
        this.relaxDuration = parcel.readInt();
        this.maxHeartRate = parcel.readInt();
        this.minHeartRate = parcel.readInt();
        this.stressValue = parcel.readInt();
        this.physicalMental = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.physicalMentalState = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.type = parcel.readInt();
        this.subType = parcel.readInt();
        this.heartRateDetail = parcel.readString();
        this.version = parcel.readInt();
        this.extension = parcel.readString();
        this.display = parcel.readInt();
        this.syncStatus = parcel.readInt();
        this.del = parcel.readInt();
    }
}
