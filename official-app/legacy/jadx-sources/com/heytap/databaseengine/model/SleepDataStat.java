package com.heytap.databaseengine.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class SleepDataStat extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<SleepDataStat> CREATOR = new a();
    public static final String RESULT_NEED_SEND_TO_DEVICE = "result_need_send_to_device";
    public static final String SLEEP_CALIBRATION_RESULT_SENT = "sleep_calibration_result_sent";
    public static final String SLEEP_CHECK_RESULT = "sleep_check_result_";
    public static final String SLEEP_CHECK_RESULT_DEVICE_USED = "sleep_check_result_device_used_";
    public static final String SLEEP_CHECK_RESULT_SENT = "sleep_check_result_sent_";
    private Integer checkedSleepScore;
    private int date;
    private String deviceUniqueId;
    private long fallAsleep;
    private String metadata;
    private long sleepOut;
    private Integer sleepScore;
    private String ssoid;
    private int syncStatus;
    private String timezone;
    private long totalDeepSleepTime;
    private long totalLightlySleepTime;
    private long totalRemTime;
    private long totalSleepTime;
    private long totalWakeUpTime;

    public class a implements Parcelable.Creator<SleepDataStat> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SleepDataStat createFromParcel(Parcel parcel) {
            return new SleepDataStat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SleepDataStat[] newArray(int i) {
            return new SleepDataStat[i];
        }
    }

    public SleepDataStat() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Integer getCheckedSleepScore() {
        return this.checkedSleepScore;
    }

    public int getDate() {
        return this.date;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    public long getFallAsleep() {
        return this.fallAsleep;
    }

    public String getMetadata() {
        return this.metadata;
    }

    public long getSleepOut() {
        return this.sleepOut;
    }

    public Integer getSleepScore() {
        return this.sleepScore;
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

    public long getTotalDeepSleepTime() {
        return this.totalDeepSleepTime;
    }

    public long getTotalLightlySleepTime() {
        return this.totalLightlySleepTime;
    }

    public long getTotalRemTime() {
        return this.totalRemTime;
    }

    public long getTotalSleepTime() {
        return this.totalSleepTime;
    }

    public long getTotalWakeUpTime() {
        return this.totalWakeUpTime;
    }

    public void setCheckedSleepScore(Integer num) {
        this.checkedSleepScore = num;
    }

    public void setDate(int i) {
        this.date = i;
    }

    public void setDeviceUniqueId(String str) {
        this.deviceUniqueId = str;
    }

    public void setFallAsleep(long j2) {
        this.fallAsleep = j2;
    }

    public void setMetadata(String str) {
        this.metadata = str;
    }

    public void setSleepOut(long j2) {
        this.sleepOut = j2;
    }

    public void setSleepScore(Integer num) {
        this.sleepScore = num;
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

    public void setTotalDeepSleepTime(long j2) {
        this.totalDeepSleepTime = j2;
    }

    public void setTotalLightlySleepTime(long j2) {
        this.totalLightlySleepTime = j2;
    }

    public void setTotalRemTime(long j2) {
        this.totalRemTime = j2;
    }

    public void setTotalSleepTime(long j2) {
        this.totalSleepTime = j2;
    }

    public void setTotalWakeUpTime(long j2) {
        this.totalWakeUpTime = j2;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "SleepDataStat{ssoid='" + this.ssoid + "', deviceUniqueId='" + this.deviceUniqueId + "', date=" + this.date + ", timezone='" + this.timezone + "', fallAsleep=" + this.fallAsleep + ", sleepOut=" + this.sleepOut + ", totalSleepTime=" + this.totalSleepTime + ", totalDeepSleepTime=" + this.totalDeepSleepTime + ", totalLightlySleepTime=" + this.totalLightlySleepTime + ", totalRemTime=" + this.totalRemTime + ", totalWakeUpTime=" + this.totalWakeUpTime + ", sleepScore=" + this.sleepScore + ", checkedSleepScore=" + this.checkedSleepScore + ", metadata='" + this.metadata + "', syncStatus=" + this.syncStatus + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ssoid);
        parcel.writeString(this.deviceUniqueId);
        parcel.writeInt(this.date);
        parcel.writeString(this.timezone);
        parcel.writeLong(this.fallAsleep);
        parcel.writeLong(this.sleepOut);
        parcel.writeLong(this.totalSleepTime);
        parcel.writeLong(this.totalDeepSleepTime);
        parcel.writeLong(this.totalLightlySleepTime);
        parcel.writeLong(this.totalRemTime);
        parcel.writeLong(this.totalWakeUpTime);
        parcel.writeValue(this.sleepScore);
        parcel.writeValue(this.checkedSleepScore);
        parcel.writeString(this.metadata);
        parcel.writeInt(this.syncStatus);
    }

    public SleepDataStat(Parcel parcel) {
        this.ssoid = parcel.readString();
        this.deviceUniqueId = parcel.readString();
        this.date = parcel.readInt();
        this.timezone = parcel.readString();
        this.fallAsleep = parcel.readLong();
        this.sleepOut = parcel.readLong();
        this.totalSleepTime = parcel.readLong();
        this.totalDeepSleepTime = parcel.readLong();
        this.totalLightlySleepTime = parcel.readLong();
        this.totalRemTime = parcel.readLong();
        this.totalWakeUpTime = parcel.readLong();
        this.sleepScore = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.checkedSleepScore = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.metadata = parcel.readString();
        this.syncStatus = parcel.readInt();
    }
}
