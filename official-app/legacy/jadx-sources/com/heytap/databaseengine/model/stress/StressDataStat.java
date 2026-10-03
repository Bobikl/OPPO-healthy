package com.heytap.databaseengine.model.stress;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.heytap.databaseengine.model.SportHealthData;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class StressDataStat extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<StressDataStat> CREATOR = new a();
    public static final String STRESS_BALANCE_INDEX = "balance_index";
    public static final String STRESS_CONTINUOUS_HIGH_DURATION = "continuous_high_duration";
    private int averageStress;
    private int date;
    private String deviceUniqueId;
    private int highStressTotalTime;
    private int maxStress;
    private long maxStressTimeStamp;
    private String metadata;
    private int middleStressTotalTime;
    private int minStress;
    private int normalStressTotalTime;
    private int relaxStressTotalTime;
    private String ssoid;
    private int syncStatus;
    private String timezone;

    public class a implements Parcelable.Creator<StressDataStat> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public StressDataStat createFromParcel(Parcel parcel) {
            return new StressDataStat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public StressDataStat[] newArray(int i) {
            return new StressDataStat[i];
        }
    }

    public StressDataStat() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getAverageStress() {
        return this.averageStress;
    }

    public int getDate() {
        return this.date;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    public int getHighStressTotalTime() {
        return this.highStressTotalTime;
    }

    public int getMaxStress() {
        return this.maxStress;
    }

    public long getMaxStressTimeStamp() {
        return this.maxStressTimeStamp;
    }

    public String getMetadata() {
        return this.metadata;
    }

    public int getMiddleStressTotalTime() {
        return this.middleStressTotalTime;
    }

    public int getMinStress() {
        return this.minStress;
    }

    public int getNormalStressTotalTime() {
        return this.normalStressTotalTime;
    }

    public int getRelaxStressTotalTime() {
        return this.relaxStressTotalTime;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String getSsoid() {
        return this.ssoid;
    }

    public int getSyncStatus() {
        return this.syncStatus;
    }

    public String getTimezone() {
        return this.timezone;
    }

    public void setAverageStress(int i) {
        this.averageStress = i;
    }

    public void setDate(int i) {
        this.date = i;
    }

    public void setDeviceUniqueId(String str) {
        this.deviceUniqueId = str;
    }

    public void setHighStressTotalTime(int i) {
        this.highStressTotalTime = i;
    }

    public void setMaxStress(int i) {
        this.maxStress = i;
    }

    public void setMaxStressTimeStamp(long j2) {
        this.maxStressTimeStamp = j2;
    }

    public void setMetadata(String str) {
        this.metadata = str;
    }

    public void setMiddleStressTotalTime(int i) {
        this.middleStressTotalTime = i;
    }

    public void setMinStress(int i) {
        this.minStress = i;
    }

    public void setNormalStressTotalTime(int i) {
        this.normalStressTotalTime = i;
    }

    public void setRelaxStressTotalTime(int i) {
        this.relaxStressTotalTime = i;
    }

    public void setSsoid(String str) {
        this.ssoid = str;
    }

    public void setSyncStatus(int i) {
        this.syncStatus = i;
    }

    public void setTimezone(String str) {
        this.timezone = str;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "StressDataStat{, date=" + this.date + ", timezone='" + this.timezone + "', maxStress=" + this.maxStress + ", minStress=" + this.minStress + ", averageStress=" + this.averageStress + ", maxStressTimeStamp=" + this.maxStressTimeStamp + ", relaxStressTotalTime=" + this.relaxStressTotalTime + ", normalStressTotalTime=" + this.normalStressTotalTime + ", middleStressTotalTime=" + this.middleStressTotalTime + ", highStressTotalTime=" + this.highStressTotalTime + ", metadata='" + this.metadata + "', syncStatus=" + this.syncStatus + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ssoid);
        parcel.writeString(this.deviceUniqueId);
        parcel.writeInt(this.date);
        parcel.writeString(this.timezone);
        parcel.writeInt(this.maxStress);
        parcel.writeInt(this.minStress);
        parcel.writeInt(this.averageStress);
        parcel.writeLong(this.maxStressTimeStamp);
        parcel.writeInt(this.relaxStressTotalTime);
        parcel.writeInt(this.normalStressTotalTime);
        parcel.writeInt(this.middleStressTotalTime);
        parcel.writeInt(this.highStressTotalTime);
        parcel.writeString(this.metadata);
        parcel.writeInt(this.syncStatus);
    }

    public StressDataStat(Parcel parcel) {
        this.ssoid = parcel.readString();
        this.deviceUniqueId = parcel.readString();
        this.date = parcel.readInt();
        this.timezone = parcel.readString();
        this.maxStress = parcel.readInt();
        this.minStress = parcel.readInt();
        this.averageStress = parcel.readInt();
        this.maxStressTimeStamp = parcel.readLong();
        this.relaxStressTotalTime = parcel.readInt();
        this.normalStressTotalTime = parcel.readInt();
        this.middleStressTotalTime = parcel.readInt();
        this.highStressTotalTime = parcel.readInt();
        this.metadata = parcel.readString();
        this.syncStatus = parcel.readInt();
    }
}
