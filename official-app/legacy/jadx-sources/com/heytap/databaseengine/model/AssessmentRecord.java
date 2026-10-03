package com.heytap.databaseengine.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class AssessmentRecord extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<AssessmentRecord> CREATOR = new a();
    private String bloodPressureInfo;
    private String bodyRecoveryInfo;
    private String cardioHistoryInfo;
    private Integer degreeVascularElasticity;
    private Integer del;
    private String deviceUniqueId;
    private Integer ecgDiagnosisResults;
    private String ecgId;
    private long endTimestamp;
    private String extra;
    private String focusMeasurementItems;
    private Integer heartRate;
    private String hrvInfo;
    private Float pwv;
    private String pwvId;
    private String scoreAnalysis;
    private String singleOsaInfo;
    private String singleSleepInfo;
    private String sleepCrossAnalysis;
    private String snoreAnalysis;
    private Integer spo2;
    private String ssoid;
    private long startTimestamp;
    private Integer stress;
    private String tempCrossAnalysis;
    private Integer totalMeasurementItems;
    private String userBodyInfo;
    private String validMeasurementItems;
    private String vascularAgeInfo;
    private Integer version;
    private String wristTemperatureInfo;

    public class a implements Parcelable.Creator<AssessmentRecord> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AssessmentRecord createFromParcel(Parcel parcel) {
            return new AssessmentRecord(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AssessmentRecord[] newArray(int i) {
            return new AssessmentRecord[i];
        }
    }

    public AssessmentRecord() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getBloodPressureInfo() {
        return this.bloodPressureInfo;
    }

    public String getBodyRecoveryInfo() {
        return this.bodyRecoveryInfo;
    }

    public String getCardioHistoryInfo() {
        return this.cardioHistoryInfo;
    }

    public Integer getDegreeVascularElasticity() {
        return this.degreeVascularElasticity;
    }

    public Integer getDel() {
        return this.del;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    public Integer getEcgDiagnosisResults() {
        return this.ecgDiagnosisResults;
    }

    public String getEcgId() {
        return this.ecgId;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public long getEndTimestamp() {
        return this.endTimestamp;
    }

    public String getExtra() {
        return this.extra;
    }

    public String getFocusMeasurementItems() {
        return this.focusMeasurementItems;
    }

    public Integer getHeartRate() {
        return this.heartRate;
    }

    public String getHrvInfo() {
        return this.hrvInfo;
    }

    public Float getPwv() {
        return this.pwv;
    }

    public String getPwvId() {
        return this.pwvId;
    }

    public String getScoreAnalysis() {
        return this.scoreAnalysis;
    }

    public String getSingleOsaInfo() {
        return this.singleOsaInfo;
    }

    public String getSingleSleepInfo() {
        return this.singleSleepInfo;
    }

    public String getSleepCrossAnalysis() {
        return this.sleepCrossAnalysis;
    }

    public String getSnoreAnalysis() {
        return this.snoreAnalysis;
    }

    public Integer getSpo2() {
        return this.spo2;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String getSsoid() {
        return this.ssoid;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public long getStartTimestamp() {
        return this.startTimestamp;
    }

    public Integer getStress() {
        return this.stress;
    }

    public String getTempCrossAnalysis() {
        return this.tempCrossAnalysis;
    }

    public Integer getTotalMeasurementItems() {
        return this.totalMeasurementItems;
    }

    public String getUserBodyInfo() {
        return this.userBodyInfo;
    }

    public String getValidMeasurementItems() {
        return this.validMeasurementItems;
    }

    public String getVascularAgeInfo() {
        return this.vascularAgeInfo;
    }

    public Integer getVersion() {
        return this.version;
    }

    public String getWristTemperatureInfo() {
        return this.wristTemperatureInfo;
    }

    public void setBloodPressureInfo(String str) {
        this.bloodPressureInfo = str;
    }

    public void setBodyRecoveryInfo(String str) {
        this.bodyRecoveryInfo = str;
    }

    public void setCardioHistoryInfo(String str) {
        this.cardioHistoryInfo = str;
    }

    public void setDegreeVascularElasticity(Integer num) {
        this.degreeVascularElasticity = num;
    }

    public void setDel(Integer num) {
        this.del = num;
    }

    public void setDeviceUniqueId(String str) {
        this.deviceUniqueId = str;
    }

    public void setEcgDiagnosisResults(Integer num) {
        this.ecgDiagnosisResults = num;
    }

    public void setEcgId(String str) {
        this.ecgId = str;
    }

    public void setEndTimestamp(long j2) {
        this.endTimestamp = j2;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setFocusMeasurementItems(String str) {
        this.focusMeasurementItems = str;
    }

    public void setHeartRate(Integer num) {
        this.heartRate = num;
    }

    public void setHrvInfo(String str) {
        this.hrvInfo = str;
    }

    public void setPwv(Float f) {
        this.pwv = f;
    }

    public void setPwvId(String str) {
        this.pwvId = str;
    }

    public void setScoreAnalysis(String str) {
        this.scoreAnalysis = str;
    }

    public void setSingleOsaInfo(String str) {
        this.singleOsaInfo = str;
    }

    public void setSingleSleepInfo(String str) {
        this.singleSleepInfo = str;
    }

    public void setSleepCrossAnalysis(String str) {
        this.sleepCrossAnalysis = str;
    }

    public void setSnoreAnalysis(String str) {
        this.snoreAnalysis = str;
    }

    public void setSpo2(Integer num) {
        this.spo2 = num;
    }

    public void setSsoid(String str) {
        this.ssoid = str;
    }

    public void setStartTimestamp(long j2) {
        this.startTimestamp = j2;
    }

    public void setStress(Integer num) {
        this.stress = num;
    }

    public void setTempCrossAnalysis(String str) {
        this.tempCrossAnalysis = str;
    }

    public void setTotalMeasurementItems(Integer num) {
        this.totalMeasurementItems = num;
    }

    public void setUserBodyInfo(String str) {
        this.userBodyInfo = str;
    }

    public void setValidMeasurementItems(String str) {
        this.validMeasurementItems = str;
    }

    public void setVascularAgeInfo(String str) {
        this.vascularAgeInfo = str;
    }

    public void setVersion(Integer num) {
        this.version = num;
    }

    public void setWristTemperatureInfo(String str) {
        this.wristTemperatureInfo = str;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "AssessmentRecord{ssoid='" + this.ssoid + "', deviceUniqueId='" + this.deviceUniqueId + "', startTimestamp=" + this.startTimestamp + ", endTimestamp=" + this.endTimestamp + ", heartRate=" + this.heartRate + ", stress=" + this.stress + ", spo2=" + this.spo2 + ", ecgId='" + this.ecgId + "', ecgDiagnosisResults=" + this.ecgDiagnosisResults + ", degreeVascularElasticity=" + this.degreeVascularElasticity + ", pwv=" + this.pwv + ", pwvId='" + this.pwvId + "', validMeasurementItems='" + this.validMeasurementItems + "', totalMeasurementItems=" + this.totalMeasurementItems + ", focusMeasurementItems='" + this.focusMeasurementItems + "', version=" + this.version + ", extra='" + this.extra + "', del=" + this.del + ", userBodyInfo='" + this.userBodyInfo + "', wristTemperatureInfo='" + this.wristTemperatureInfo + "', singleSleepInfo='" + this.singleSleepInfo + "', singleOsaInfo='" + this.singleOsaInfo + "', sleepCrossAnalysis='" + this.sleepCrossAnalysis + "', tempCrossAnalysis='" + this.tempCrossAnalysis + "', snoreAnalysis='" + this.snoreAnalysis + "', scoreAnalysis='" + this.scoreAnalysis + "', cardioHistoryInfo='" + this.cardioHistoryInfo + "', vascularAgeInfo='" + this.vascularAgeInfo + "', bloodPressureInfo='" + this.bloodPressureInfo + "', bodyRecoveryInfo='" + this.bodyRecoveryInfo + "', hrvInfo='" + this.hrvInfo + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ssoid);
        parcel.writeString(this.deviceUniqueId);
        parcel.writeLong(this.startTimestamp);
        parcel.writeLong(this.endTimestamp);
        parcel.writeValue(this.heartRate);
        parcel.writeValue(this.stress);
        parcel.writeValue(this.spo2);
        parcel.writeString(this.ecgId);
        parcel.writeValue(this.ecgDiagnosisResults);
        parcel.writeValue(this.degreeVascularElasticity);
        parcel.writeValue(this.pwv);
        parcel.writeString(this.pwvId);
        parcel.writeString(this.validMeasurementItems);
        parcel.writeValue(this.totalMeasurementItems);
        parcel.writeString(this.focusMeasurementItems);
        parcel.writeValue(this.version);
        parcel.writeString(this.extra);
        parcel.writeValue(this.del);
        parcel.writeString(this.userBodyInfo);
        parcel.writeString(this.wristTemperatureInfo);
        parcel.writeString(this.singleSleepInfo);
        parcel.writeString(this.singleOsaInfo);
        parcel.writeString(this.sleepCrossAnalysis);
        parcel.writeString(this.tempCrossAnalysis);
        parcel.writeString(this.snoreAnalysis);
        parcel.writeString(this.scoreAnalysis);
        parcel.writeString(this.cardioHistoryInfo);
        parcel.writeString(this.vascularAgeInfo);
        parcel.writeString(this.bloodPressureInfo);
        parcel.writeString(this.bodyRecoveryInfo);
        parcel.writeString(this.hrvInfo);
    }

    public AssessmentRecord(Parcel parcel) {
        this.ssoid = parcel.readString();
        this.deviceUniqueId = parcel.readString();
        this.startTimestamp = parcel.readLong();
        this.endTimestamp = parcel.readLong();
        this.heartRate = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.stress = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.spo2 = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.ecgId = parcel.readString();
        this.ecgDiagnosisResults = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.degreeVascularElasticity = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.pwv = (Float) parcel.readValue(Float.class.getClassLoader());
        this.pwvId = parcel.readString();
        this.validMeasurementItems = parcel.readString();
        this.totalMeasurementItems = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.focusMeasurementItems = parcel.readString();
        this.version = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.extra = parcel.readString();
        this.del = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.userBodyInfo = parcel.readString();
        this.wristTemperatureInfo = parcel.readString();
        this.singleSleepInfo = parcel.readString();
        this.singleOsaInfo = parcel.readString();
        this.sleepCrossAnalysis = parcel.readString();
        this.tempCrossAnalysis = parcel.readString();
        this.snoreAnalysis = parcel.readString();
        this.scoreAnalysis = parcel.readString();
        this.cardioHistoryInfo = parcel.readString();
        this.vascularAgeInfo = parcel.readString();
        this.bloodPressureInfo = parcel.readString();
        this.bodyRecoveryInfo = parcel.readString();
        this.hrvInfo = parcel.readString();
    }
}
