package com.heytap.databaseengineservice.db.table;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.databaseengineservice.db.table.sportrecord.DBSportMetadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Entity(primaryKeys = {"ssoid", DBAssessmentRecord.DEVICE_UNIQUE_ID, "start_time", "sleep_type"}, tableName = "DBSleepTable")
@Keep
public class DBSleep extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<DBSleep> CREATOR = new a();

    @ColumnInfo(name = "alg_origin_state")
    private int algOriginData;

    @ColumnInfo(name = DBSportMetadata.CLIENT_DATA_ID)
    private String clientDataId;

    @ColumnInfo(name = "data_version")
    private int dataVersion;

    @ColumnInfo(name = "device_type")
    private Integer deviceType;

    @NonNull
    @ColumnInfo(name = DBAssessmentRecord.DEVICE_UNIQUE_ID)
    private String deviceUniqueId;

    @ColumnInfo(name = "display")
    private int display;

    @ColumnInfo(name = "end_time")
    private long endTimestamp;

    @ColumnInfo(name = "metadata")
    private String metadata;

    @ColumnInfo(name = "modified_timestamp")
    private long modifiedTimestamp;

    @ColumnInfo(name = "_id")
    private long sleepDataId;

    @ColumnInfo(name = "sleep_state")
    private int sleepState;

    @ColumnInfo(name = "sleep_type")
    private int sleepType;

    @NonNull
    @ColumnInfo(name = "ssoid")
    private String ssoid;

    @ColumnInfo(name = "start_time")
    private long startTimestamp;

    @ColumnInfo(name = "sync_status")
    private int syncStatus;

    @ColumnInfo(name = "updated")
    private int updated;

    public class a implements Parcelable.Creator<DBSleep> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DBSleep createFromParcel(Parcel parcel) {
            return new DBSleep(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DBSleep[] newArray(int i) {
            return new DBSleep[i];
        }
    }

    public DBSleep() {
        this.ssoid = "";
        this.deviceUniqueId = "";
    }

    public static void changePrimaryKey(SupportSQLiteDatabase supportSQLiteDatabase) {
        StringBuilder sb = new StringBuilder();
        sb.append("create table if not exists DBSleepTable_copy(");
        sb.append("_id INTEGER not null,");
        sb.append("client_data_id TEXT,");
        sb.append("ssoid TEXT not null,");
        sb.append("device_unique_id TEXT not null,");
        sb.append("start_time INTEGER not null,");
        sb.append("end_time INTEGER not null,");
        sb.append("sleep_type INTEGER not null,");
        sb.append("sleep_state INTEGER not null,");
        sb.append("metadata TEXT,");
        sb.append("display INTEGER not null,");
        sb.append("sync_status INTEGER not null,");
        sb.append("modified_timestamp INTEGER not null,");
        sb.append("updated INTEGER not null,");
        sb.append("PRIMARY KEY (ssoid, device_unique_id, start_time, sleep_type)");
        sb.append(");");
        supportSQLiteDatabase.execSQL(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("INSERT INTO DBSleepTable_copy (");
        sb2.append(params());
        sb2.append(") SELECT ");
        sb2.append(params());
        sb2.append(" FROM ");
        sb2.append("DBSleepTable");
        sb2.append(" where display = 1");
        sb2.append(" GROUP BY ");
        sb2.append("ssoid, device_unique_id, start_time, sleep_type, display;");
        supportSQLiteDatabase.execSQL(sb2.toString());
        supportSQLiteDatabase.execSQL("DROP TABLE DBSleepTable;");
        supportSQLiteDatabase.execSQL("ALTER TABLE DBSleepTable_copy RENAME TO DBSleepTable;");
    }

    public static String createSleepTableSQL() {
        return "create table if not exists DBSleepTable(_id INTEGER primary key autoincrement not null,client_data_id TEXT,ssoid TEXT not null,device_unique_id TEXT not null,start_time INTEGER not null,end_time INTEGER not null,sleep_type INTEGER not null,sleep_state INTEGER not null,metadata TEXT,display INTEGER not null,sync_status INTEGER not null,modified_timestamp INTEGER not null,updated INTEGER not null)";
    }

    private static String params() {
        return "_id, " + DBSportMetadata.CLIENT_DATA_ID + ", ssoid, " + DBAssessmentRecord.DEVICE_UNIQUE_ID + ", start_time, end_time, sleep_type, sleep_state, metadata, display, sync_status, modified_timestamp, updated";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getAlgOriginData() {
        return this.algOriginData;
    }

    public String getClientDataId() {
        return this.clientDataId;
    }

    public int getDataVersion() {
        return this.dataVersion;
    }

    public Integer getDeviceType() {
        return this.deviceType;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    public int getDisplay() {
        return this.display;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public long getEndTimestamp() {
        return this.endTimestamp;
    }

    public String getMetadata() {
        return this.metadata;
    }

    public long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    public long getSleepDataId() {
        return this.sleepDataId;
    }

    public int getSleepState() {
        return this.sleepState;
    }

    public int getSleepType() {
        return this.sleepType;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
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

    public void setAlgOriginData(int i) {
        this.algOriginData = i;
    }

    public void setClientDataId(String str) {
        this.clientDataId = str;
    }

    public void setDataVersion(int i) {
        this.dataVersion = i;
    }

    public void setDeviceType(Integer num) {
        this.deviceType = num;
    }

    public void setDeviceUniqueId(@NotNull String str) {
        this.deviceUniqueId = str;
    }

    public void setDisplay(int i) {
        this.display = i;
    }

    public void setEndTimestamp(long j2) {
        this.endTimestamp = j2;
    }

    public void setMetadata(String str) {
        this.metadata = str;
    }

    public void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
    }

    public void setSleepDataId(long j2) {
        this.sleepDataId = j2;
    }

    public void setSleepState(int i) {
        this.sleepState = i;
    }

    public void setSleepType(int i) {
        this.sleepType = i;
    }

    public void setSsoid(@NotNull String str) {
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

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "DBSleep{sleepDataId=" + this.sleepDataId + ", clientDataId='" + this.clientDataId + "', ssoid='" + this.ssoid + "', deviceUniqueId='" + this.deviceUniqueId + "', startTimestamp=" + this.startTimestamp + ", endTimestamp=" + this.endTimestamp + ", sleepType=" + this.sleepType + ", sleepState=" + this.sleepState + ", algOriginData=" + this.algOriginData + ", metadata='" + this.metadata + "', dataVersion=" + this.dataVersion + ", display=" + this.display + ", syncStatus=" + this.syncStatus + ", modifiedTimestamp=" + this.modifiedTimestamp + ", updated=" + this.updated + ", deviceType=" + this.deviceType + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.clientDataId);
        parcel.writeString(this.ssoid);
        parcel.writeString(this.deviceUniqueId);
        parcel.writeLong(this.startTimestamp);
        parcel.writeLong(this.endTimestamp);
        parcel.writeInt(this.sleepType);
        parcel.writeInt(this.sleepState);
        parcel.writeInt(this.algOriginData);
        parcel.writeString(this.metadata);
        parcel.writeInt(this.dataVersion);
        parcel.writeInt(this.display);
        parcel.writeInt(this.syncStatus);
        parcel.writeLong(this.modifiedTimestamp);
        parcel.writeInt(this.updated);
        parcel.writeValue(this.deviceType);
    }

    public DBSleep(Parcel parcel) {
        this.ssoid = "";
        this.deviceUniqueId = "";
        this.clientDataId = parcel.readString();
        this.ssoid = parcel.readString();
        this.deviceUniqueId = parcel.readString();
        this.startTimestamp = parcel.readLong();
        this.endTimestamp = parcel.readLong();
        this.sleepType = parcel.readInt();
        this.sleepState = parcel.readInt();
        this.algOriginData = parcel.readInt();
        this.metadata = parcel.readString();
        this.dataVersion = parcel.readInt();
        this.display = parcel.readInt();
        this.syncStatus = parcel.readInt();
        this.modifiedTimestamp = parcel.readLong();
        this.updated = parcel.readInt();
        this.deviceType = (Integer) parcel.readValue(Integer.class.getClassLoader());
    }
}
