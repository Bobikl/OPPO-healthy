package com.heytap.databaseengine.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class SleepIndex extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<SleepIndex> CREATOR = new a();
    public static final int supportSleepRecoveryRate = 101;
    private Integer avgSleepBreathRangeHigh;
    private Integer avgSleepBreathRangeLow;
    private Integer avgSleepHeartRate;
    private Integer avgSleepSpo2;
    private Integer basalBreathe;
    private Integer basalHrv;
    private Integer breatheReasonableRangeHigh;
    private Integer breatheReasonableRangeLow;
    private long dataTimestamp;
    private String deviceName;
    private String deviceUniqueId;
    private int hasHeartRateWarning;
    private Integer heartRateReasonableRangeHigh;
    private Integer heartRateReasonableRangeLow;
    private String heartRateWarningLabel;
    private Integer hrvReasonableRangeHigh;
    private Integer hrvReasonableRangeLow;
    private Integer maxHrv;
    private Integer minHrv;
    private List<SleepBedTimeData> sleepBedTimeDataList;
    private Integer sleepHeartRateRangeHigh;
    private Integer sleepHeartRateRangeLow;
    private Integer sleepRecoveryDiffValue;
    private Integer sleepRecoveryRate;
    private String ssoid;

    public class a implements Parcelable.Creator<SleepIndex> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SleepIndex createFromParcel(Parcel parcel) {
            return new SleepIndex(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SleepIndex[] newArray(int i) {
            return new SleepIndex[i];
        }
    }

    public SleepIndex() {
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

    public List<SleepBedTimeData> getSleepBedTimeDataList() {
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

    public void setSleepBedTimeDataList(List<SleepBedTimeData> list) {
        this.sleepBedTimeDataList = list;
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

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "SleepIndex{ssoid='" + this.ssoid + "', deviceUniqueId='" + this.deviceUniqueId + "', deviceName='" + this.deviceName + "', dataTimestamp=" + this.dataTimestamp + ", avgSleepSpo2=" + this.avgSleepSpo2 + ", avgSleepHeartRate=" + this.avgSleepHeartRate + ", sleepHeartRateRangeLow=" + this.sleepHeartRateRangeLow + ", sleepHeartRateRangeHigh=" + this.sleepHeartRateRangeHigh + ", avgSleepBreathRangeLow=" + this.avgSleepBreathRangeLow + ", avgSleepBreathRangeHigh=" + this.avgSleepBreathRangeHigh + ", hasHeartRateWarning=" + this.hasHeartRateWarning + ", heartRateWarningLabel='" + this.heartRateWarningLabel + "', sleepBedTimeDataList=" + this.sleepBedTimeDataList + ", basalHrv=" + this.basalHrv + ", hrvReasonableRangeLow=" + this.hrvReasonableRangeLow + ", hrvReasonableRangeHigh=" + this.hrvReasonableRangeHigh + ", minHrv=" + this.minHrv + ", maxHrv=" + this.maxHrv + ", basalBreathe=" + this.basalBreathe + ", breatheReasonableRangeLow=" + this.breatheReasonableRangeLow + ", breatheReasonableRangeHigh=" + this.breatheReasonableRangeHigh + ", heartRateReasonableRangeLow=" + this.heartRateReasonableRangeLow + ", heartRateReasonableRangeHigh=" + this.heartRateReasonableRangeHigh + ", sleepRecoveryRate=" + this.sleepRecoveryRate + ", sleepRecoveryDiffValue=" + this.sleepRecoveryDiffValue + '}';
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
        parcel.writeTypedList(this.sleepBedTimeDataList);
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
    }

    public SleepIndex(Parcel parcel) {
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
        this.sleepBedTimeDataList = parcel.createTypedArrayList(SleepBedTimeData.CREATOR);
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
    }
}
