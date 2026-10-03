package com.heytap.databaseengineservice.db.table.bloodoxygensaturation;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.databaseengineservice.db.table.DBAssessmentRecord;
import com.heytap.databaseengineservice.db.table.sportrecord.DBSportMetadata;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Entity(primaryKeys = {"ssoid", DBAssessmentRecord.DEVICE_UNIQUE_ID, "data_created_timestamp", "blood_oxygen_saturation_type"}, tableName = "DBBloodOxygenSaturation")
@Keep
public class DBBloodOxygenSaturation extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<DBBloodOxygenSaturation> CREATOR = new a();

    @ColumnInfo(name = "_id")
    private long bloodOxygenSaturationId;

    @ColumnInfo(name = "blood_oxygen_saturation_type")
    private int bloodOxygenSaturationType;

    @ColumnInfo(name = "blood_oxygen_saturation_value")
    private int bloodOxygenSaturationValue;

    @ColumnInfo(name = DBSportMetadata.CLIENT_DATA_ID)
    private String clientDataId;

    @ColumnInfo(name = "data_created_timestamp")
    private long dataCreatedTimestamp;

    @NonNull
    @ColumnInfo(name = DBAssessmentRecord.DEVICE_UNIQUE_ID)
    private String deviceUniqueId;

    @ColumnInfo(name = "display")
    private int display;

    @ColumnInfo(name = "modified_timestamp")
    private long modifiedTimestamp;

    @NonNull
    @ColumnInfo(name = "ssoid")
    private String ssoid;

    @ColumnInfo(name = "sync_status")
    private int syncStatus;

    @ColumnInfo(name = "updated")
    private int updated;

    public class a implements Parcelable.Creator<DBBloodOxygenSaturation> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DBBloodOxygenSaturation createFromParcel(Parcel parcel) {
            return new DBBloodOxygenSaturation(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DBBloodOxygenSaturation[] newArray(int i) {
            return new DBBloodOxygenSaturation[i];
        }
    }

    public DBBloodOxygenSaturation() {
        this.ssoid = "";
        this.deviceUniqueId = "";
    }

    public static void changePrimaryKey(SupportSQLiteDatabase supportSQLiteDatabase) {
        StringBuilder sb = new StringBuilder();
        sb.append("create table if not exists DBBloodOxygenSaturation_copy(");
        sb.append("_id INTEGER not null,");
        sb.append("client_data_id TEXT,");
        sb.append("ssoid TEXT not null,");
        sb.append("device_unique_id TEXT not null,");
        sb.append("data_created_timestamp INTEGER not null,");
        sb.append("blood_oxygen_saturation_type INTEGER not null,");
        sb.append("blood_oxygen_saturation_value INTEGER not null,");
        sb.append("display INTEGER not null,");
        sb.append("sync_status INTEGER not null,");
        sb.append("modified_timestamp INTEGER not null,");
        sb.append("updated INTEGER not null,");
        sb.append("PRIMARY KEY (ssoid, device_unique_id, data_created_timestamp, blood_oxygen_saturation_type)");
        sb.append(");");
        supportSQLiteDatabase.execSQL(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("INSERT INTO DBBloodOxygenSaturation_copy (");
        sb2.append(params());
        sb2.append(") SELECT ");
        sb2.append(params());
        sb2.append(" FROM ");
        sb2.append("DBBloodOxygenSaturation");
        sb2.append(" where display = 1");
        sb2.append(" GROUP BY ");
        sb2.append("ssoid, device_unique_id, data_created_timestamp, blood_oxygen_saturation_type, display;");
        supportSQLiteDatabase.execSQL(sb2.toString());
        supportSQLiteDatabase.execSQL("DROP TABLE DBBloodOxygenSaturation;");
        supportSQLiteDatabase.execSQL("ALTER TABLE DBBloodOxygenSaturation_copy RENAME TO DBBloodOxygenSaturation;");
    }

    public static String createBloodOxygenSaturationTableSQL() {
        return "create table if not exists DBBloodOxygenSaturation(_id INTEGER primary key autoincrement not null,client_data_id TEXT,ssoid TEXT not null,device_unique_id TEXT not null,data_created_timestamp INTEGER not null,blood_oxygen_saturation_type INTEGER not null,blood_oxygen_saturation_value INTEGER not null,display INTEGER not null,sync_status INTEGER not null,modified_timestamp INTEGER not null,updated INTEGER not null)";
    }

    private static String params() {
        return "_id, " + DBSportMetadata.CLIENT_DATA_ID + ", ssoid, " + DBAssessmentRecord.DEVICE_UNIQUE_ID + ", data_created_timestamp, blood_oxygen_saturation_type, blood_oxygen_saturation_value, display, sync_status, modified_timestamp, updated";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getBloodOxygenSaturationId() {
        return this.bloodOxygenSaturationId;
    }

    public int getBloodOxygenSaturationType() {
        return this.bloodOxygenSaturationType;
    }

    public int getBloodOxygenSaturationValue() {
        return this.bloodOxygenSaturationValue;
    }

    public String getClientDataId() {
        return this.clientDataId;
    }

    public long getDataCreatedTimestamp() {
        return this.dataCreatedTimestamp;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    public int getDisplay() {
        return this.display;
    }

    public long getModifiedTimestamp() {
        return this.modifiedTimestamp;
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

    public void setBloodOxygenSaturationId(long j2) {
        this.bloodOxygenSaturationId = j2;
    }

    public void setBloodOxygenSaturationType(int i) {
        this.bloodOxygenSaturationType = i;
    }

    public void setBloodOxygenSaturationValue(int i) {
        this.bloodOxygenSaturationValue = i;
    }

    public void setClientDataId(String str) {
        this.clientDataId = str;
    }

    public void setDataCreatedTimestamp(long j2) {
        this.dataCreatedTimestamp = j2;
    }

    public void setDeviceUniqueId(@NotNull String str) {
        this.deviceUniqueId = str;
    }

    public void setDisplay(int i) {
        this.display = i;
    }

    public void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
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
    @NotNull
    public String toString() {
        return "DBBloodOxygenSaturation{bloodOxygenSaturationId=" + this.bloodOxygenSaturationId + ", clientDataId='" + this.clientDataId + "', ssoid='" + this.ssoid + "', deviceUniqueId='" + this.deviceUniqueId + "', dataCreatedTimestamp=" + this.dataCreatedTimestamp + ", bloodOxygenSaturationType=" + this.bloodOxygenSaturationType + ", bloodOxygenSaturationValue=" + this.bloodOxygenSaturationValue + ", display=" + this.display + ", syncStatus=" + this.syncStatus + ", modifiedTimestamp=" + this.modifiedTimestamp + ", updated=" + this.updated + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.clientDataId);
        parcel.writeString(this.ssoid);
        parcel.writeString(this.deviceUniqueId);
        parcel.writeLong(this.dataCreatedTimestamp);
        parcel.writeInt(this.bloodOxygenSaturationType);
        parcel.writeInt(this.bloodOxygenSaturationValue);
        parcel.writeInt(this.display);
        parcel.writeInt(this.syncStatus);
        parcel.writeLong(this.modifiedTimestamp);
        parcel.writeInt(this.updated);
    }

    public DBBloodOxygenSaturation(Parcel parcel) {
        this.ssoid = "";
        this.deviceUniqueId = "";
        this.clientDataId = parcel.readString();
        String string = parcel.readString();
        Objects.requireNonNull(string);
        this.ssoid = string;
        String string2 = parcel.readString();
        Objects.requireNonNull(string2);
        this.deviceUniqueId = string2;
        this.dataCreatedTimestamp = parcel.readLong();
        this.bloodOxygenSaturationType = parcel.readInt();
        this.bloodOxygenSaturationValue = parcel.readInt();
        this.display = parcel.readInt();
        this.syncStatus = parcel.readInt();
        this.modifiedTimestamp = parcel.readLong();
        this.updated = parcel.readInt();
    }
}
