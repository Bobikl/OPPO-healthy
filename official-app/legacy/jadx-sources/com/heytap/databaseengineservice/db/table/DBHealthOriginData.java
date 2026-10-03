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
@Entity(tableName = "DBHealthOriginData")
@Keep
public class DBHealthOriginData extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<DBHealthOriginData> CREATOR = new a();

    @ColumnInfo(name = DBSportMetadata.CLIENT_DATA_ID)
    private String clientDataId;

    @ColumnInfo(name = "data")
    private String data;

    @ColumnInfo(name = "data_type")
    private int dataType;

    @ColumnInfo(name = "del")
    private int del;

    @ColumnInfo(name = Element.ELEMENT_NAME_DEVICE_CATEGORY)
    private String deviceType;

    @ColumnInfo(name = DBAssessmentRecord.DEVICE_UNIQUE_ID)
    private String deviceUniqueId;

    @ColumnInfo(name = "end_time")
    private long endTimestamp;

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "_id")
    private long healthOriginDataId;

    @ColumnInfo(name = "metadata")
    private String metadata;

    @ColumnInfo(name = "modified_timestamp")
    private long modifiedTimestamp;

    @ColumnInfo(name = "ssoid")
    private String ssoid;

    @ColumnInfo(name = "start_time")
    private long startTimestamp;

    @ColumnInfo(name = "sync_status")
    private int syncStatus;

    @ColumnInfo(name = "version")
    private int version;

    public class a implements Parcelable.Creator<DBHealthOriginData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DBHealthOriginData createFromParcel(Parcel parcel) {
            return new DBHealthOriginData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DBHealthOriginData[] newArray(int i) {
            return new DBHealthOriginData[i];
        }
    }

    public DBHealthOriginData() {
    }

    public static String createHealthOriginDataTableSQL() {
        return "create table if not exists DBHealthOriginData(_id INTEGER primary key autoincrement not null,client_data_id TEXT,ssoid TEXT,device_unique_id TEXT,device_category TEXT,start_time INTEGER not null,end_time INTEGER not null,data_type INTEGER not null,data TEXT,metadata TEXT,version INTEGER not null,sync_status INTEGER not null,modified_timestamp INTEGER not null,del INTEGER not null)";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getClientDataId() {
        return this.clientDataId;
    }

    public String getData() {
        return this.data;
    }

    public int getDataType() {
        return this.dataType;
    }

    public int getDel() {
        return this.del;
    }

    public String getDeviceType() {
        return this.deviceType;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public long getEndTimestamp() {
        return this.endTimestamp;
    }

    public long getHealthOriginDataId() {
        return this.healthOriginDataId;
    }

    public String getMetadata() {
        return this.metadata;
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

    public int getVersion() {
        return this.version;
    }

    public void setClientDataId(String str) {
        this.clientDataId = str;
    }

    public void setData(String str) {
        this.data = str;
    }

    public void setDataType(int i) {
        this.dataType = i;
    }

    public void setDel(int i) {
        this.del = i;
    }

    public void setDeviceType(String str) {
        this.deviceType = str;
    }

    public void setDeviceUniqueId(String str) {
        this.deviceUniqueId = str;
    }

    public void setEndTimestamp(long j2) {
        this.endTimestamp = j2;
    }

    public void setHealthOriginDataId(long j2) {
        this.healthOriginDataId = j2;
    }

    public void setMetadata(String str) {
        this.metadata = str;
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

    public void setVersion(int i) {
        this.version = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "DBHealthOriginData{healthOriginDataId=" + this.healthOriginDataId + ", clientDataId='" + this.clientDataId + "', ssoid='" + this.ssoid + "', deviceUniqueId='" + this.deviceUniqueId + "', deviceCategory='" + this.deviceType + "', startTimestamp=" + this.startTimestamp + ", endTimestamp=" + this.endTimestamp + ", dataCategory=" + this.dataType + ", data='" + this.data + "', metadata='" + this.metadata + "', version=" + this.version + ", syncStatus=" + this.syncStatus + ", modifiedTimestamp=" + this.modifiedTimestamp + ", del='" + this.del + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.clientDataId);
        parcel.writeString(this.ssoid);
        parcel.writeString(this.deviceUniqueId);
        parcel.writeString(this.deviceType);
        parcel.writeLong(this.startTimestamp);
        parcel.writeLong(this.endTimestamp);
        parcel.writeInt(this.dataType);
        parcel.writeString(this.data);
        parcel.writeString(this.metadata);
        parcel.writeInt(this.version);
        parcel.writeInt(this.syncStatus);
        parcel.writeLong(this.modifiedTimestamp);
        parcel.writeInt(this.del);
    }

    public DBHealthOriginData(Parcel parcel) {
        this.clientDataId = parcel.readString();
        this.ssoid = parcel.readString();
        this.deviceUniqueId = parcel.readString();
        this.deviceType = parcel.readString();
        this.startTimestamp = parcel.readLong();
        this.endTimestamp = parcel.readLong();
        this.dataType = parcel.readInt();
        this.data = parcel.readString();
        this.metadata = parcel.readString();
        this.version = parcel.readInt();
        this.syncStatus = parcel.readInt();
        this.modifiedTimestamp = parcel.readLong();
        this.del = parcel.readInt();
    }
}
