package com.heytap.databaseengineservice.db.table;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.heytap.databaseengine.apiv3.data.Element;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.databaseengineservice.db.table.sportrecord.DBSportMetadata;

/* JADX INFO: loaded from: classes15.dex */
@Entity(tableName = "DBHeartRateWarning")
@Keep
public class DBHeartRateWarning extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<DBHeartRateWarning> CREATOR = new a();

    @ColumnInfo(name = DBSportMetadata.CLIENT_DATA_ID)
    private String clientDataId;

    @ColumnInfo(name = DBAssessmentRecord.DEVICE_UNIQUE_ID)
    private String deviceUniqueId;

    @ColumnInfo(name = "end_timestamp")
    private long endTimestamp;

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "_id")
    private long heartRateWarningId;

    @ColumnInfo(name = Element.ELEMENT_NAME_MAX_HEART_RATE)
    private int maxHeartRate;

    @ColumnInfo(name = "max_heart_rate_threshold")
    private int maxHeartRateThreshold;

    @ColumnInfo(name = "min_heart_rate")
    private int minHeartRate;

    @ColumnInfo(name = "min_heart_rate_threshold")
    private int minHeartRateThreshold;

    @ColumnInfo(name = "modified_timestamp")
    private long modifiedTimestamp;

    @ColumnInfo(name = "ssoid")
    private String ssoid;

    @ColumnInfo(name = "start_timestamp")
    private long startTimestamp;

    @ColumnInfo(name = "sync_status")
    private int syncStatus;

    @ColumnInfo(name = "updated")
    private int updated;

    @ColumnInfo(name = "warning_heart_rate_type")
    private int warningHeartRateType;

    @ColumnInfo(name = "warning_type")
    private int warningType;

    public class a implements Parcelable.Creator<DBHeartRateWarning> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DBHeartRateWarning createFromParcel(Parcel parcel) {
            return new DBHeartRateWarning(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DBHeartRateWarning[] newArray(int i) {
            return new DBHeartRateWarning[i];
        }
    }

    public DBHeartRateWarning() {
    }

    public static String createHeartRateWarningTableSQL() {
        return "create table if not exists DBHeartRateWarning(_id INTEGER primary key autoincrement not null,client_data_id TEXT,ssoid TEXT,device_unique_id TEXT,warning_type INTEGER not null,warning_heart_rate_type INTEGER not null,min_heart_rate INTEGER not null,max_heart_rate INTEGER not null,start_timestamp INTEGER not null,end_timestamp INTEGER not null,min_heart_rate_threshold INTEGER not null,max_heart_rate_threshold INTEGER not null,sync_status INTEGER not null,modified_timestamp INTEGER not null,updated INTEGER not null)";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getClientDataId() {
        return this.clientDataId;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public long getEndTimestamp() {
        return this.endTimestamp;
    }

    public long getHeartRateWarningId() {
        return this.heartRateWarningId;
    }

    public int getMaxHeartRate() {
        return this.maxHeartRate;
    }

    public int getMaxHeartRateThreshold() {
        return this.maxHeartRateThreshold;
    }

    public int getMinHeartRate() {
        return this.minHeartRate;
    }

    public int getMinHeartRateThreshold() {
        return this.minHeartRateThreshold;
    }

    public long getModifiedTimestamp() {
        return this.modifiedTimestamp;
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

    public int getUpdated() {
        return this.updated;
    }

    public int getWarningHeartRateType() {
        return this.warningHeartRateType;
    }

    public int getWarningType() {
        return this.warningType;
    }

    public void setClientDataId(String str) {
        this.clientDataId = str;
    }

    public void setDeviceUniqueId(String str) {
        this.deviceUniqueId = str;
    }

    public void setEndTimestamp(long j2) {
        this.endTimestamp = j2;
    }

    public void setHeartRateWarningId(long j2) {
        this.heartRateWarningId = j2;
    }

    public void setMaxHeartRate(int i) {
        this.maxHeartRate = i;
    }

    public void setMaxHeartRateThreshold(int i) {
        this.maxHeartRateThreshold = i;
    }

    public void setMinHeartRate(int i) {
        this.minHeartRate = i;
    }

    public void setMinHeartRateThreshold(int i) {
        this.minHeartRateThreshold = i;
    }

    public void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
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

    public void setUpdated(int i) {
        this.updated = i;
    }

    public void setWarningHeartRateType(int i) {
        this.warningHeartRateType = i;
    }

    public void setWarningType(int i) {
        this.warningType = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "DBHeartRateWarning{heartRateWarningId=" + this.heartRateWarningId + ", clientDataId='" + this.clientDataId + "', ssoid='" + this.ssoid + "', deviceUniqueId='" + this.deviceUniqueId + "', warningType=" + this.warningType + ", warningHeartRateType=" + this.warningHeartRateType + ", minHeartRate=" + this.minHeartRate + ", maxHeartRate=" + this.maxHeartRate + ", startTimestamp=" + this.startTimestamp + ", endTimestamp=" + this.endTimestamp + ", minHeartRateThreshold=" + this.minHeartRateThreshold + ", maxHeartRateThreshold=" + this.maxHeartRateThreshold + ", syncStatus=" + this.syncStatus + ", modifiedTimestamp=" + this.modifiedTimestamp + ", updated=" + this.updated + "} ";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.heartRateWarningId);
        parcel.writeString(this.clientDataId);
        parcel.writeString(this.ssoid);
        parcel.writeString(this.deviceUniqueId);
        parcel.writeInt(this.warningType);
        parcel.writeInt(this.warningHeartRateType);
        parcel.writeInt(this.minHeartRate);
        parcel.writeInt(this.maxHeartRate);
        parcel.writeLong(this.startTimestamp);
        parcel.writeLong(this.endTimestamp);
        parcel.writeInt(this.minHeartRateThreshold);
        parcel.writeInt(this.maxHeartRateThreshold);
        parcel.writeInt(this.syncStatus);
        parcel.writeLong(this.modifiedTimestamp);
        parcel.writeInt(this.updated);
    }

    public DBHeartRateWarning(Parcel parcel) {
        this.heartRateWarningId = parcel.readLong();
        this.clientDataId = parcel.readString();
        this.ssoid = parcel.readString();
        this.deviceUniqueId = parcel.readString();
        this.warningType = parcel.readInt();
        this.warningHeartRateType = parcel.readInt();
        this.minHeartRate = parcel.readInt();
        this.maxHeartRate = parcel.readInt();
        this.startTimestamp = parcel.readLong();
        this.endTimestamp = parcel.readLong();
        this.minHeartRateThreshold = parcel.readInt();
        this.maxHeartRateThreshold = parcel.readInt();
        this.syncStatus = parcel.readInt();
        this.modifiedTimestamp = parcel.readLong();
        this.updated = parcel.readInt();
    }
}
