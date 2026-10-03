package com.heytap.databaseengineservice.db.table;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.databaseengineservice.db.table.newsleep.DBSleepHeartRateStat;
import com.heytap.databaseengineservice.db.table.phycialmental.DBPhysicalMentalStat;
import com.oplus.mydevices.sdk.compat.DeviceInfoCompat;

/* JADX INFO: loaded from: classes15.dex */
@Entity(primaryKeys = {"ssoid", DBAssessmentRecord.DEVICE_UNIQUE_ID, "data_created_timestamp"}, tableName = "DBSleepIndex")
@Keep
public class DBSleepIndex extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<DBSleepIndex> CREATOR = new a();

    @ColumnInfo(name = "avg_sleep_breath_range_high")
    private Integer avgSleepBreathRangeHigh;

    @ColumnInfo(name = "avg_sleep_breath_range_low")
    private Integer avgSleepBreathRangeLow;

    @ColumnInfo(name = DBSleepHeartRateStat.AVG_SLEEP_HEART_RATE)
    private Integer avgSleepHeartRate;

    @ColumnInfo(name = "avg_sleep_spo2")
    private Integer avgSleepSpo2;

    @ColumnInfo(name = "basal_breathe")
    private Integer basalBreathe;

    @ColumnInfo(name = "basal_hrv")
    private Integer basalHrv;

    @ColumnInfo(name = "breathe_reasonable_range_high")
    private Integer breatheReasonableRangeHigh;

    @ColumnInfo(name = "breathe_reasonable_range_low")
    private Integer breatheReasonableRangeLow;

    @ColumnInfo(name = "data_created_timestamp")
    private long dataTimestamp;

    @ColumnInfo(name = DeviceInfoCompat.DB_KEY_DEVICE_NAME)
    private String deviceName;

    @NonNull
    @ColumnInfo(name = DBAssessmentRecord.DEVICE_UNIQUE_ID)
    private String deviceUniqueId;

    @ColumnInfo(name = "has_heart_rate_warning")
    private int hasHeartRateWarning;

    @ColumnInfo(name = "heart_rate_reasonable_range_high")
    private Integer heartRateReasonableRangeHigh;

    @ColumnInfo(name = "heart_rate_reasonable_range_low")
    private Integer heartRateReasonableRangeLow;

    @ColumnInfo(name = "heart_rate_warning_label")
    private String heartRateWarningLabel;

    @ColumnInfo(name = DBPhysicalMentalStat.HRV_REASONABLE_RANGE_HIGH)
    private Integer hrvReasonableRangeHigh;

    @ColumnInfo(name = DBPhysicalMentalStat.HRV_REASONABLE_RANGE_LOW)
    private Integer hrvReasonableRangeLow;

    @ColumnInfo(name = DBPhysicalMentalStat.MAX_HRV)
    private Integer maxHrv;

    @ColumnInfo(name = DBPhysicalMentalStat.MIN_HRV)
    private Integer minHrv;

    @ColumnInfo(name = "modified_timestamp")
    private long modifiedTimestamp;

    @ColumnInfo(name = "sleep_bed_time_data")
    private String sleepBedTimeDataList;

    @ColumnInfo(name = "sleep_heart_rate_range_high")
    private Integer sleepHeartRateRangeHigh;

    @ColumnInfo(name = "sleep_heart_rate_range_low")
    private Integer sleepHeartRateRangeLow;

    @ColumnInfo(name = "sleep_recovery_diff_value")
    private Integer sleepRecoveryDiffValue;

    @ColumnInfo(name = "sleep_recovery_rate")
    private Integer sleepRecoveryRate;

    @NonNull
    @ColumnInfo(name = "ssoid")
    private String ssoid;

    @ColumnInfo(name = "sync_status")
    private int syncStatus;

    @ColumnInfo(name = "updated")
    private int updated;

    public class a implements Parcelable.Creator<DBSleepIndex> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DBSleepIndex createFromParcel(Parcel parcel) {
            return new DBSleepIndex(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DBSleepIndex[] newArray(int i) {
            return new DBSleepIndex[i];
        }
    }

    public DBSleepIndex() {
        this.ssoid = "";
        this.deviceUniqueId = "";
    }

    public static String createSleepIndexTable() {
        return "create table if not exists DBSleepIndex(ssoid TEXT not null,device_unique_id TEXT not null,device_name TEXT,data_created_timestamp INTEGER not null,avg_sleep_spo2 INTEGER,avg_sleep_heart_rate INTEGER,sleep_heart_rate_range_low INTEGER,sleep_heart_rate_range_high INTEGER,avg_sleep_breath_range_low INTEGER,avg_sleep_breath_range_high INTEGER,sync_status INTEGER not null,modified_timestamp INTEGER not null,updated INTEGER not null,primary key(ssoid," + DBAssessmentRecord.DEVICE_UNIQUE_ID + ",data_created_timestamp))";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Integer getAvgSleepBreathRangeHigh() {
        return this.avgSleepBreathRangeHigh;
    }

    public Integer getAvgSleepBreathRangeLow() {
        return this.avgSleepBreathRangeLow;
    }

    public Integer getAvgSleepHeartRate() {
        return this.avgSleepHeartRate;
    }

    public Integer getAvgSleepSpo2() {
        return this.avgSleepSpo2;
    }

    public Integer getBasalBreathe() {
        return this.basalBreathe;
    }

    public Integer getBasalHrv() {
        return this.basalHrv;
    }

    public Integer getBreatheReasonableRangeHigh() {
        return this.breatheReasonableRangeHigh;
    }

    public Integer getBreatheReasonableRangeLow() {
        return this.breatheReasonableRangeLow;
    }

    public long getDataTimestamp() {
        return this.dataTimestamp;
    }

    public String getDeviceName() {
        return this.deviceName;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    public int getHasHeartRateWarning() {
        return this.hasHeartRateWarning;
    }

    public Integer getHeartRateReasonableRangeHigh() {
        return this.heartRateReasonableRangeHigh;
    }

    public Integer getHeartRateReasonableRangeLow() {
        return this.heartRateReasonableRangeLow;
    }

    public String getHeartRateWarningLabel() {
        return this.heartRateWarningLabel;
    }

    public Integer getHrvReasonableRangeHigh() {
        return this.hrvReasonableRangeHigh;
    }

    public Integer getHrvReasonableRangeLow() {
        return this.hrvReasonableRangeLow;
    }

    public Integer getMaxHrv() {
        return this.maxHrv;
    }

    public Integer getMinHrv() {
        return this.minHrv;
    }

    public long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    public String getSleepBedTimeDataList() {
        return this.sleepBedTimeDataList;
    }

    public Integer getSleepHeartRateRangeHigh() {
        return this.sleepHeartRateRangeHigh;
    }

    public Integer getSleepHeartRateRangeLow() {
        return this.sleepHeartRateRangeLow;
    }

    public Integer getSleepRecoveryDiffValue() {
        return this.sleepRecoveryDiffValue;
    }

    public Integer getSleepRecoveryRate() {
        return this.sleepRecoveryRate;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String getSsoid() {
        return this.ssoid;
    }

    public int getSyncStatus() {
        return this.syncStatus;
    }

    public int getUpdated() {
        return this.updated;
    }

    public void setAvgSleepBreathRangeHigh(Integer num) {
        this.avgSleepBreathRangeHigh = num;
    }

    public void setAvgSleepBreathRangeLow(Integer num) {
        this.avgSleepBreathRangeLow = num;
    }

    public void setAvgSleepHeartRate(Integer num) {
        this.avgSleepHeartRate = num;
    }

    public void setAvgSleepSpo2(Integer num) {
        this.avgSleepSpo2 = num;
    }

    public void setBasalBreathe(Integer num) {
        this.basalBreathe = num;
    }

    public void setBasalHrv(Integer num) {
        this.basalHrv = num;
    }

    public void setBreatheReasonableRangeHigh(Integer num) {
        this.breatheReasonableRangeHigh = num;
    }

    public void setBreatheReasonableRangeLow(Integer num) {
        this.breatheReasonableRangeLow = num;
    }

    public void setDataTimestamp(long j2) {
        this.dataTimestamp = j2;
    }

    public void setDeviceName(String str) {
        this.deviceName = str;
    }

    public void setDeviceUniqueId(String str) {
        this.deviceUniqueId = str;
    }

    public void setHasHeartRateWarning(int i) {
        this.hasHeartRateWarning = i;
    }

    public void setHeartRateReasonableRangeHigh(Integer num) {
        this.heartRateReasonableRangeHigh = num;
    }

    public void setHeartRateReasonableRangeLow(Integer num) {
        this.heartRateReasonableRangeLow = num;
    }

    public void setHeartRateWarningLabel(String str) {
        this.heartRateWarningLabel = str;
    }

    public void setHrvReasonableRangeHigh(Integer num) {
        this.hrvReasonableRangeHigh = num;
    }

    public void setHrvReasonableRangeLow(Integer num) {
        this.hrvReasonableRangeLow = num;
    }

    public void setMaxHrv(Integer num) {
        this.maxHrv = num;
    }

    public void setMinHrv(Integer num) {
        this.minHrv = num;
    }

    public void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
    }

    public void setSleepBedTimeDataList(String str) {
        this.sleepBedTimeDataList = str;
    }

    public void setSleepHeartRateRangeHigh(Integer num) {
        this.sleepHeartRateRangeHigh = num;
    }

    public void setSleepHeartRateRangeLow(Integer num) {
        this.sleepHeartRateRangeLow = num;
    }

    public void setSleepRecoveryDiffValue(Integer num) {
        this.sleepRecoveryDiffValue = num;
    }

    public void setSleepRecoveryRate(Integer num) {
        this.sleepRecoveryRate = num;
    }

    public void setSsoid(String str) {
        this.ssoid = str;
    }

    public void setSyncStatus(int i) {
        this.syncStatus = i;
    }

    public void setUpdated(int i) {
        this.updated = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "DBSleepIndex{ssoid='" + this.ssoid + "', deviceUniqueId='" + this.deviceUniqueId + "', deviceName='" + this.deviceName + "', dataTimestamp=" + this.dataTimestamp + ", avgSleepSpo2=" + this.avgSleepSpo2 + ", avgSleepHeartRate=" + this.avgSleepHeartRate + ", sleepHeartRateRangeLow=" + this.sleepHeartRateRangeLow + ", sleepHeartRateRangeHigh=" + this.sleepHeartRateRangeHigh + ", avgSleepBreathRangeLow=" + this.avgSleepBreathRangeLow + ", avgSleepBreathRangeHigh=" + this.avgSleepBreathRangeHigh + ", hasHeartRateWarning=" + this.hasHeartRateWarning + ", heartRateWarningLabel='" + this.heartRateWarningLabel + "', sleepBedTimeDataList='" + this.sleepBedTimeDataList + "', basalHrv=" + this.basalHrv + ", hrvReasonableRangeLow=" + this.hrvReasonableRangeLow + ", hrvReasonableRangeHigh=" + this.hrvReasonableRangeHigh + ", minHrv=" + this.minHrv + ", maxHrv=" + this.maxHrv + ", basalBreathe=" + this.basalBreathe + ", breatheReasonableRangeLow=" + this.breatheReasonableRangeLow + ", breatheReasonableRangeHigh=" + this.breatheReasonableRangeHigh + ", heartRateReasonableRangeLow=" + this.heartRateReasonableRangeLow + ", heartRateReasonableRangeHigh=" + this.heartRateReasonableRangeHigh + ", sleepRecoveryRate=" + this.sleepRecoveryRate + ", sleepRecoveryDiffValue=" + this.sleepRecoveryDiffValue + ", syncStatus=" + this.syncStatus + ", modifiedTimestamp=" + this.modifiedTimestamp + ", updated=" + this.updated + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ssoid);
        parcel.writeString(this.deviceUniqueId);
        parcel.writeString(this.deviceName);
        parcel.writeLong(this.dataTimestamp);
        parcel.writeValue(this.avgSleepSpo2);
        parcel.writeValue(this.avgSleepHeartRate);
        parcel.writeValue(this.sleepHeartRateRangeLow);
        parcel.writeValue(this.sleepHeartRateRangeHigh);
        parcel.writeValue(this.avgSleepBreathRangeLow);
        parcel.writeValue(this.avgSleepBreathRangeHigh);
        parcel.writeInt(this.hasHeartRateWarning);
        parcel.writeString(this.heartRateWarningLabel);
        parcel.writeString(this.sleepBedTimeDataList);
        parcel.writeValue(this.basalHrv);
        parcel.writeValue(this.hrvReasonableRangeLow);
        parcel.writeValue(this.hrvReasonableRangeHigh);
        parcel.writeValue(this.minHrv);
        parcel.writeValue(this.maxHrv);
        parcel.writeValue(this.basalBreathe);
        parcel.writeValue(this.breatheReasonableRangeLow);
        parcel.writeValue(this.breatheReasonableRangeHigh);
        parcel.writeValue(this.heartRateReasonableRangeLow);
        parcel.writeValue(this.heartRateReasonableRangeHigh);
        parcel.writeValue(this.sleepRecoveryRate);
        parcel.writeValue(this.sleepRecoveryDiffValue);
        parcel.writeInt(this.syncStatus);
        parcel.writeLong(this.modifiedTimestamp);
        parcel.writeInt(this.updated);
    }

    public DBSleepIndex(Parcel parcel) {
        this.ssoid = "";
        this.deviceUniqueId = "";
        this.ssoid = parcel.readString();
        this.deviceUniqueId = parcel.readString();
        this.deviceName = parcel.readString();
        this.dataTimestamp = parcel.readLong();
        this.avgSleepSpo2 = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.avgSleepHeartRate = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.sleepHeartRateRangeLow = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.sleepHeartRateRangeHigh = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.avgSleepBreathRangeLow = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.avgSleepBreathRangeHigh = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.hasHeartRateWarning = parcel.readInt();
        this.heartRateWarningLabel = parcel.readString();
        this.sleepBedTimeDataList = parcel.readString();
        this.basalHrv = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.hrvReasonableRangeLow = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.hrvReasonableRangeHigh = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.minHrv = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.maxHrv = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.basalBreathe = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.breatheReasonableRangeLow = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.breatheReasonableRangeHigh = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.heartRateReasonableRangeLow = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.heartRateReasonableRangeHigh = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.sleepRecoveryRate = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.sleepRecoveryDiffValue = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.syncStatus = parcel.readInt();
        this.modifiedTimestamp = parcel.readLong();
        this.updated = parcel.readInt();
    }
}
