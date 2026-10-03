package com.heytap.databaseengine.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class ECGRecord extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<ECGRecord> CREATOR = new a();
    private String aacData;
    private long aacStartTimestamp;
    private String algorithmsAnalyzeResult;
    private String appVersion;
    private int avgHeartRate;
    private String clientDataId;
    private String data;
    private String deviceUniqueId;
    private int deviceVersion;
    private String ecgAppVersion;
    private String ecgId;
    private String ecgResultId;
    private String ecgResultName;
    private long ecgStartTimestamp;
    private long endTimestamp;
    private String expertInterpretation;
    private int expertState;
    private int hand;
    private int maxHeartRate;
    private String personState;
    private String ppgData;
    private String reportId;
    private String serviceApplyId;
    private Integer source;
    private String ssoid;
    private long startTimestamp;
    private String symptoms;
    private int syncStatus;
    private String userInfo;
    private int version;

    public class a implements Parcelable.Creator<ECGRecord> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ECGRecord createFromParcel(Parcel parcel) {
            return new ECGRecord(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ECGRecord[] newArray(int i) {
            return new ECGRecord[i];
        }
    }

    public ECGRecord() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAacData() {
        return this.aacData;
    }

    public long getAacStartTimestamp() {
        return this.aacStartTimestamp;
    }

    public String getAlgorithmsAnalyzeResult() {
        return this.algorithmsAnalyzeResult;
    }

    public String getAppVersion() {
        return this.appVersion;
    }

    public int getAvgHeartRate() {
        return this.avgHeartRate;
    }

    public String getClientDataId() {
        return this.clientDataId;
    }

    public String getData() {
        return this.data;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    public int getDeviceVersion() {
        return this.deviceVersion;
    }

    public String getEcgAppVersion() {
        return this.ecgAppVersion;
    }

    public String getEcgId() {
        return this.ecgId;
    }

    public String getEcgResultId() {
        return this.ecgResultId;
    }

    public String getEcgResultName() {
        return this.ecgResultName;
    }

    public long getEcgStartTimestamp() {
        return this.ecgStartTimestamp;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public long getEndTimestamp() {
        return this.endTimestamp;
    }

    public String getExpertInterpretation() {
        return this.expertInterpretation;
    }

    public int getExpertState() {
        return this.expertState;
    }

    public int getHand() {
        return this.hand;
    }

    public int getMaxHeartRate() {
        return this.maxHeartRate;
    }

    public String getPersonState() {
        return this.personState;
    }

    public String getPpgData() {
        return this.ppgData;
    }

    public String getReportId() {
        return this.reportId;
    }

    public String getServiceApplyId() {
        return this.serviceApplyId;
    }

    public Integer getSource() {
        return this.source;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String getSsoid() {
        return this.ssoid;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public long getStartTimestamp() {
        return this.startTimestamp;
    }

    public String getSymptoms() {
        return this.symptoms;
    }

    public int getSyncStatus() {
        return this.syncStatus;
    }

    public String getUserInfo() {
        return this.userInfo;
    }

    public int getVersion() {
        return this.version;
    }

    public void setAacData(String str) {
        this.aacData = str;
    }

    public void setAacStartTimestamp(long j2) {
        this.aacStartTimestamp = j2;
    }

    public void setAlgorithmsAnalyzeResult(String str) {
        this.algorithmsAnalyzeResult = str;
    }

    public void setAppVersion(String str) {
        this.appVersion = str;
    }

    public void setAvgHeartRate(int i) {
        this.avgHeartRate = i;
    }

    public void setClientDataId(String str) {
        this.clientDataId = str;
    }

    public void setData(String str) {
        this.data = str;
    }

    public void setDeviceUniqueId(String str) {
        this.deviceUniqueId = str;
    }

    public void setDeviceVersion(int i) {
        this.deviceVersion = i;
    }

    public void setEcgAppVersion(String str) {
        this.ecgAppVersion = str;
    }

    public void setEcgId(String str) {
        this.ecgId = str;
    }

    public void setEcgResultId(String str) {
        this.ecgResultId = str;
    }

    public void setEcgResultName(String str) {
        this.ecgResultName = str;
    }

    public void setEcgStartTimestamp(long j2) {
        this.ecgStartTimestamp = j2;
    }

    public void setEndTimestamp(long j2) {
        this.endTimestamp = j2;
    }

    public void setExpertInterpretation(String str) {
        this.expertInterpretation = str;
    }

    public void setExpertState(int i) {
        this.expertState = i;
    }

    public void setHand(int i) {
        this.hand = i;
    }

    public void setMaxHeartRate(int i) {
        this.maxHeartRate = i;
    }

    public void setPersonState(String str) {
        this.personState = str;
    }

    public void setPpgData(String str) {
        this.ppgData = str;
    }

    public void setReportId(String str) {
        this.reportId = str;
    }

    public void setServiceApplyId(String str) {
        this.serviceApplyId = str;
    }

    public void setSource(Integer num) {
        this.source = num;
    }

    public void setSsoid(String str) {
        this.ssoid = str;
    }

    public void setStartTimestamp(long j2) {
        this.startTimestamp = j2;
    }

    public void setSymptoms(String str) {
        this.symptoms = str;
    }

    public void setSyncStatus(int i) {
        this.syncStatus = i;
    }

    public void setUserInfo(String str) {
        this.userInfo = str;
    }

    public void setVersion(int i) {
        this.version = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "ECGRecord{clientDataId='" + this.clientDataId + "', ssoid='" + this.ssoid + "', deviceUniqueId='" + this.deviceUniqueId + "', startTimestamp=" + this.startTimestamp + ", endTimestamp=" + this.endTimestamp + ", ecgId=" + this.ecgId + ", hand=" + this.hand + ", ecgStartTimestamp=" + this.ecgStartTimestamp + ", aacStartTimestamp=" + this.aacStartTimestamp + ", version=" + this.version + ", avgHeartRate=" + this.avgHeartRate + ", maxHeartRate=" + this.maxHeartRate + ", expertInterpretation='" + this.expertInterpretation + "', algorithmsAnalyzeResult='" + this.algorithmsAnalyzeResult + "', expertState=" + this.expertState + ", reportId='" + this.reportId + "', serviceApplyId='" + this.serviceApplyId + "', personState='" + this.personState + "', deviceVersion=" + this.deviceVersion + ", syncStatus=" + this.syncStatus + ", ecgAppVersion='" + this.ecgAppVersion + "', appVersion='" + this.appVersion + "', userInfo='" + this.userInfo + "', ecgResultId='" + this.ecgResultId + "', ecgResultName='" + this.ecgResultName + "', symptoms='" + this.symptoms + "', source='" + this.source + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.clientDataId);
        parcel.writeString(this.ssoid);
        parcel.writeString(this.deviceUniqueId);
        parcel.writeLong(this.startTimestamp);
        parcel.writeLong(this.endTimestamp);
        parcel.writeString(this.ecgId);
        parcel.writeInt(this.hand);
        parcel.writeString(this.data);
        parcel.writeString(this.ppgData);
        parcel.writeString(this.aacData);
        parcel.writeLong(this.ecgStartTimestamp);
        parcel.writeLong(this.aacStartTimestamp);
        parcel.writeInt(this.version);
        parcel.writeInt(this.avgHeartRate);
        parcel.writeInt(this.maxHeartRate);
        parcel.writeString(this.expertInterpretation);
        parcel.writeString(this.algorithmsAnalyzeResult);
        parcel.writeInt(this.expertState);
        parcel.writeString(this.reportId);
        parcel.writeString(this.serviceApplyId);
        parcel.writeString(this.personState);
        parcel.writeInt(this.syncStatus);
        parcel.writeInt(this.deviceVersion);
        parcel.writeString(this.appVersion);
        parcel.writeString(this.ecgAppVersion);
        parcel.writeString(this.symptoms);
        parcel.writeString(this.ecgResultId);
        parcel.writeString(this.ecgResultName);
        parcel.writeString(this.userInfo);
        parcel.writeValue(this.source);
    }

    public ECGRecord(Parcel parcel) {
        this.clientDataId = parcel.readString();
        this.ssoid = parcel.readString();
        this.deviceUniqueId = parcel.readString();
        this.startTimestamp = parcel.readLong();
        this.endTimestamp = parcel.readLong();
        this.ecgId = parcel.readString();
        this.hand = parcel.readInt();
        this.data = parcel.readString();
        this.ppgData = parcel.readString();
        this.aacData = parcel.readString();
        this.ecgStartTimestamp = parcel.readLong();
        this.aacStartTimestamp = parcel.readLong();
        this.version = parcel.readInt();
        this.avgHeartRate = parcel.readInt();
        this.maxHeartRate = parcel.readInt();
        this.expertInterpretation = parcel.readString();
        this.algorithmsAnalyzeResult = parcel.readString();
        this.expertState = parcel.readInt();
        this.reportId = parcel.readString();
        this.serviceApplyId = parcel.readString();
        this.personState = parcel.readString();
        this.syncStatus = parcel.readInt();
        this.deviceVersion = parcel.readInt();
        this.appVersion = parcel.readString();
        this.ecgAppVersion = parcel.readString();
        this.symptoms = parcel.readString();
        this.ecgResultId = parcel.readString();
        this.ecgResultName = parcel.readString();
        this.userInfo = parcel.readString();
        this.source = (Integer) parcel.readValue(Integer.class.getClassLoader());
    }
}
