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
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Entity(primaryKeys = {"ssoid", DBAssessmentRecord.DEVICE_UNIQUE_ID, "data_created_timestamp", "heart_rate_type"}, tableName = "DBHeartRate")
@Keep
public class DBHeartRate extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<DBHeartRate> CREATOR = new a();

    @ColumnInfo(name = DBSportMetadata.CLIENT_DATA_ID)
    private String clientDataId;

    @ColumnInfo(name = "data_created_timestamp")
    private long dataCreatedTimestamp;

    @ColumnInfo(name = "device_type")
    private Integer deviceType;

    @NonNull
    @ColumnInfo(name = DBAssessmentRecord.DEVICE_UNIQUE_ID)
    private String deviceUniqueId;

    @ColumnInfo(name = "display")
    private int display;

    @ColumnInfo(name = "_id")
    private long heartRateDataId;

    @ColumnInfo(name = "heart_rate_type")
    private int heartRateType;

    @ColumnInfo(name = "heart_rate_value")
    private int heartRateValue;

    @ColumnInfo(name = "modified_timestamp")
    private long modifiedTimestamp;

    @ColumnInfo(name = "reliability")
    private Integer reliability;

    @NonNull
    @ColumnInfo(name = "ssoid")
    private String ssoid;

    @ColumnInfo(name = "sync_status")
    private int syncStatus;

    @ColumnInfo(name = "updated")
    private int updated;

    public class a implements Parcelable.Creator<DBHeartRate> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DBHeartRate createFromParcel(Parcel parcel) {
            return new DBHeartRate(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DBHeartRate[] newArray(int i) {
            return new DBHeartRate[i];
        }
    }

    public DBHeartRate() {
        this.ssoid = "";
        this.deviceUniqueId = "";
    }

    public static void changePrimaryKey(SupportSQLiteDatabase supportSQLiteDatabase) {
        StringBuilder sb = new StringBuilder();
        sb.append("create table if not exists DBHeartRate_copy(");
        sb.append("_id INTEGER not null,");
        sb.append("client_data_id TEXT,");
        sb.append("ssoid TEXT not null,");
        sb.append("device_unique_id TEXT not null,");
        sb.append("data_created_timestamp INTEGER not null,");
        sb.append("heart_rate_type INTEGER not null,");
        sb.append("heart_rate_value INTEGER not null,");
        sb.append("display INTEGER not null,");
        sb.append("sync_status INTEGER not null,");
        sb.append("modified_timestamp INTEGER not null,");
        sb.append("updated INTEGER not null,");
        sb.append("PRIMARY KEY (ssoid, device_unique_id, data_created_timestamp, heart_rate_type)");
        sb.append(");");
        supportSQLiteDatabase.execSQL(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("INSERT INTO DBHeartRate_copy (");
        sb2.append(params());
        sb2.append(") SELECT ");
        sb2.append(params());
        sb2.append(" FROM ");
        sb2.append("DBHeartRate");
        sb2.append(" where display = 1");
        sb2.append(" GROUP BY ");
        sb2.append("ssoid, device_unique_id, data_created_timestamp, heart_rate_type, display;");
        supportSQLiteDatabase.execSQL(sb2.toString());
        supportSQLiteDatabase.execSQL("DROP TABLE DBHeartRate;");
        supportSQLiteDatabase.execSQL("ALTER TABLE DBHeartRate_copy RENAME TO DBHeartRate;");
    }

    public static String createHeartRateTableSQL() {
        return "create table if not exists DBHeartRate(_id INTEGER primary key autoincrement not null,client_data_id TEXT,ssoid TEXT not null,device_unique_id TEXT not null,data_created_timestamp INTEGER not null,heart_rate_type INTEGER not null,heart_rate_value INTEGER not null,display INTEGER not null,sync_status INTEGER not null,modified_timestamp INTEGER not null,updated INTEGER not null)";
    }

    private static String params() {
        return "_id, " + DBSportMetadata.CLIENT_DATA_ID + ", ssoid, " + DBAssessmentRecord.DEVICE_UNIQUE_ID + ", data_created_timestamp, heart_rate_type, heart_rate_value, display, sync_status, modified_timestamp, updated";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getClientDataId() {
        return this.clientDataId;
    }

    public long getDataCreatedTimestamp() {
        return this.dataCreatedTimestamp;
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

    public long getHeartRateDataId() {
        return this.heartRateDataId;
    }

    public int getHeartRateType() {
        return this.heartRateType;
    }

    public int getHeartRateValue() {
        return this.heartRateValue;
    }

    public long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    public Integer getReliability() {
        return this.reliability;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String getSsoid() {
        return this.ssoid;
    }

    public int getSyncStatus() {
        return this.syncStatus;
    }

    public int getUpdated() {
        return this.updated;
    }

    public void setClientDataId(String str) {
        this.clientDataId = str;
    }

    public void setDataCreatedTimestamp(long j2) {
        this.dataCreatedTimestamp = j2;
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

    public void setHeartRateDataId(long j2) {
        this.heartRateDataId = j2;
    }

    public void setHeartRateType(int i) {
        this.heartRateType = i;
    }

    public void setHeartRateValue(int i) {
        this.heartRateValue = i;
    }

    public void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
    }

    public void setReliability(Integer num) {
        this.reliability = num;
    }

    public void setSsoid(@NotNull String str) {
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
        return "DBHeartRate{heartRateDataId=" + this.heartRateDataId + ", clientDataId='" + this.clientDataId + "', ssoid='" + this.ssoid + "', deviceType=" + this.deviceType + ", deviceUniqueId='" + this.deviceUniqueId + "', dataCreatedTimestamp=" + this.dataCreatedTimestamp + ", heartRateType=" + this.heartRateType + ", heartRateValue=" + this.heartRateValue + ", reliability=" + this.reliability + ", display=" + this.display + ", syncStatus=" + this.syncStatus + ", modifiedTimestamp=" + this.modifiedTimestamp + ", updated=" + this.updated + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.clientDataId);
        parcel.writeString(this.ssoid);
        parcel.writeValue(this.deviceType);
        parcel.writeString(this.deviceUniqueId);
        parcel.writeLong(this.dataCreatedTimestamp);
        parcel.writeInt(this.heartRateType);
        parcel.writeInt(this.heartRateValue);
        parcel.writeValue(this.reliability);
        parcel.writeInt(this.display);
        parcel.writeInt(this.syncStatus);
        parcel.writeLong(this.modifiedTimestamp);
        parcel.writeInt(this.updated);
    }

    public DBHeartRate(Parcel parcel) {
        this.ssoid = "";
        this.deviceUniqueId = "";
        this.clientDataId = parcel.readString();
        String string = parcel.readString();
        Objects.requireNonNull(string);
        this.ssoid = string;
        this.deviceType = (Integer) parcel.readValue(Integer.class.getClassLoader());
        String string2 = parcel.readString();
        Objects.requireNonNull(string2);
        this.deviceUniqueId = string2;
        this.dataCreatedTimestamp = parcel.readLong();
        this.heartRateType = parcel.readInt();
        this.heartRateValue = parcel.readInt();
        this.reliability = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.display = parcel.readInt();
        this.syncStatus = parcel.readInt();
        this.modifiedTimestamp = parcel.readLong();
        this.updated = parcel.readInt();
    }
}
