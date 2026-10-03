package com.heytap.databaseengineservice.db.table;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;
import com.heytap.databaseengine.apiv3.data.Element;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.databaseengineservice.db.table.sportrecord.DBSportMetadata;
import com.heytap.databaseengineservice.db.table.wristtemperature.DBWristTemperatureStat;
import com.oplus.aiunit.vision.va5;
import com.oplus.aiunit.vision.y04;

/* JADX INFO: loaded from: classes15.dex */
@Entity(tableName = "DBECGRecord")
@Keep
public class DBECGRecord extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<DBECGRecord> CREATOR = new a();

    @ColumnInfo(name = "aac_data")
    private String aacData;

    @ColumnInfo(name = "aac_start_timestamp")
    private long aacStartTimestamp;

    @ColumnInfo
    private String algorithmsAnalyzeResult;

    @ColumnInfo(name = "app_version")
    private String appVersion;

    @ColumnInfo(name = Element.ELEMENT_NAME_AVG_HEART_RATE)
    private int avgHeartRate;

    @ColumnInfo(name = DBSportMetadata.CLIENT_DATA_ID)
    private String clientDataId;

    @ColumnInfo(name = "data")
    private String data;

    @Ignore
    private int del;

    @ColumnInfo(name = DBAssessmentRecord.DEVICE_UNIQUE_ID)
    private String deviceUniqueId;

    @ColumnInfo(name = va5.TAG_DEVICE_VERSION)
    private int deviceVersion;

    @ColumnInfo(name = "display")
    private int display;

    @ColumnInfo(name = "ecg_app_version")
    private String ecgAppVersion;

    @ColumnInfo(name = DBAssessmentRecord.ECG_ID)
    private String ecgId;

    @ColumnInfo(name = "ecg_result_id")
    private String ecgResultId;

    @ColumnInfo(name = "ecg_result_name")
    private String ecgResultName;

    @ColumnInfo(name = "ecg_start_timestamp")
    private long ecgStartTimestamp;

    @ColumnInfo(name = "end_time_stamp")
    private long endTimestamp;

    @ColumnInfo(name = "expert_interpretation")
    private String expertInterpretation;

    @ColumnInfo
    private int expertState;

    @ColumnInfo(name = y04.TIME_STYLE_POINT_DIR_NAME)
    private int hand;

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "_id")
    private long id;

    @ColumnInfo(name = Element.ELEMENT_NAME_MAX_HEART_RATE)
    private int maxHeartRate;

    @ColumnInfo(name = "modified_time_stamp")
    private long modifiedTimestamp;

    @ColumnInfo
    private String personState;

    @ColumnInfo(name = "ppg_data")
    private String ppgData;

    @ColumnInfo
    private String reportId;

    @ColumnInfo
    private String serviceApplyId;

    @ColumnInfo
    private Integer source;

    @ColumnInfo(name = "ssoid")
    private String ssoid;

    @ColumnInfo(name = "start_time_stamp")
    private long startTimestamp;

    @ColumnInfo(name = DBWristTemperatureStat.SYMPTOMS)
    private String symptoms;

    @ColumnInfo(name = "sync_status")
    private int syncStatus;

    @ColumnInfo(name = "user_info")
    private String userInfo;

    @ColumnInfo(name = "version")
    private int version;

    public class a implements Parcelable.Creator<DBECGRecord> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DBECGRecord createFromParcel(Parcel parcel) {
            return new DBECGRecord(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DBECGRecord[] newArray(int i) {
            return new DBECGRecord[i];
        }
    }

    public DBECGRecord() {
    }

    public static String createECGRecordTableSQL() {
        return "create table if not exists DBECGRecord(_id INTEGER primary key autoincrement not null,client_data_id TEXT,ssoid TEXT,device_unique_id TEXT,start_time_stamp INTEGER not null,end_time_stamp INTEGER not null,hand INTEGER not null,data TEXT,version INTEGER not null,avg_heart_rate INTEGER not null,expert_interpretation TEXT,display INTEGER not null,sync_status INTEGER not null,modified_time_stamp INTEGER not null)";
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

    public int getDel() {
        return this.del;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    public int getDeviceVersion() {
        return this.deviceVersion;
    }

    public int getDisplay() {
        return this.display;
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

    public long getId() {
        return this.id;
    }

    public int getMaxHeartRate() {
        return this.maxHeartRate;
    }

    public long getModifiedTimestamp() {
        return this.modifiedTimestamp;
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

    public void setDel(int i) {
        this.del = i;
    }

    public void setDeviceUniqueId(String str) {
        this.deviceUniqueId = str;
    }

    public void setDeviceVersion(int i) {
        this.deviceVersion = i;
    }

    public void setDisplay(int i) {
        this.display = i;
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

    public void setId(long j2) {
        this.id = j2;
    }

    public void setMaxHeartRate(int i) {
        this.maxHeartRate = i;
    }

    public void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
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
        return "DBECGRecord{id=" + this.id + ", clientDataId='" + this.clientDataId + "', ssoid='" + this.ssoid + "', deviceUniqueId='" + this.deviceUniqueId + "', startTimestamp=" + this.startTimestamp + ", endTimestamp=" + this.endTimestamp + ", ecgId='" + this.ecgId + "', hand=" + this.hand + ", source=" + this.source + ", ppgData='" + this.ppgData + "', aacData='" + this.aacData + "', ecgStartTimestamp=" + this.ecgStartTimestamp + ", aacStartTimestamp=" + this.aacStartTimestamp + ", version=" + this.version + ", avgHeartRate=" + this.avgHeartRate + ", maxHeartRate=" + this.maxHeartRate + ", deviceVersion=" + this.deviceVersion + ", expertInterpretation='" + this.expertInterpretation + "', algorithmsAnalyzeResult='" + this.algorithmsAnalyzeResult + "', expertState=" + this.expertState + ", reportId='" + this.reportId + "', serviceApplyId='" + this.serviceApplyId + "', personState='" + this.personState + "', display=" + this.display + ", syncStatus=" + this.syncStatus + ", modifiedTimestamp=" + this.modifiedTimestamp + ", del=" + this.del + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.id);
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
        parcel.writeInt(this.deviceVersion);
        parcel.writeString(this.expertInterpretation);
        parcel.writeString(this.algorithmsAnalyzeResult);
        parcel.writeInt(this.expertState);
        parcel.writeString(this.reportId);
        parcel.writeString(this.serviceApplyId);
        parcel.writeString(this.personState);
        parcel.writeInt(this.display);
        parcel.writeInt(this.syncStatus);
        parcel.writeLong(this.modifiedTimestamp);
        parcel.writeInt(this.del);
        parcel.writeString(this.appVersion);
        parcel.writeString(this.ecgAppVersion);
        parcel.writeString(this.symptoms);
        parcel.writeString(this.ecgResultId);
        parcel.writeString(this.ecgResultName);
        parcel.writeString(this.userInfo);
        parcel.writeValue(this.source);
    }

    public DBECGRecord(Parcel parcel) {
        this.id = parcel.readLong();
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
        this.deviceVersion = parcel.readInt();
        this.expertInterpretation = parcel.readString();
        this.algorithmsAnalyzeResult = parcel.readString();
        this.expertState = parcel.readInt();
        this.reportId = parcel.readString();
        this.serviceApplyId = parcel.readString();
        this.personState = parcel.readString();
        this.display = parcel.readInt();
        this.syncStatus = parcel.readInt();
        this.modifiedTimestamp = parcel.readLong();
        this.del = parcel.readInt();
        this.appVersion = parcel.readString();
        this.ecgAppVersion = parcel.readString();
        this.symptoms = parcel.readString();
        this.ecgResultId = parcel.readString();
        this.ecgResultName = parcel.readString();
        this.userInfo = parcel.readString();
        this.source = (Integer) parcel.readValue(Integer.class.getClassLoader());
    }
}
