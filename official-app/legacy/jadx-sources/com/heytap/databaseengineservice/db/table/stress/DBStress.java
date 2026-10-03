package com.heytap.databaseengineservice.db.table.stress;

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
import com.oplus.mydevices.sdk.compat.DeviceInfoCompat;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Entity(primaryKeys = {"ssoid", DBAssessmentRecord.DEVICE_UNIQUE_ID, "data_created_timestamp", "stress_type"}, tableName = "DBStressTable")
@Keep
public class DBStress extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<DBStress> CREATOR = new a();

    @ColumnInfo(name = DBSportMetadata.CLIENT_DATA_ID)
    private String clientDataId;

    @ColumnInfo(name = "data_created_timestamp")
    private long dataCreatedTimestamp;

    @ColumnInfo(name = DeviceInfoCompat.DB_KEY_DEVICE_NAME)
    private String deviceName;

    @NonNull
    @ColumnInfo(name = DBAssessmentRecord.DEVICE_UNIQUE_ID)
    private String deviceUniqueId;

    @ColumnInfo(name = "display")
    private int display;

    @ColumnInfo(name = "modified_timestamp")
    private long modifiedTimestamp;

    @ColumnInfo(name = "rmssd")
    private Integer rmssd;

    @ColumnInfo(name = "sdnn")
    private Integer sdnn;

    @NonNull
    @ColumnInfo(name = "ssoid")
    private String ssoid;

    @ColumnInfo(name = "_id")
    private long stressDataId;

    @ColumnInfo(name = "stress_type")
    private int stressType;

    @ColumnInfo(name = "stress_value")
    private int stressValue;

    @ColumnInfo(name = "sync_status")
    private int syncStatus;

    @ColumnInfo(name = "updated")
    private int updated;

    public class a implements Parcelable.Creator<DBStress> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DBStress createFromParcel(Parcel parcel) {
            return new DBStress(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DBStress[] newArray(int i) {
            return new DBStress[i];
        }
    }

    public DBStress() {
        this.ssoid = "";
        this.deviceUniqueId = "";
    }

    public static void changePrimaryKey(SupportSQLiteDatabase supportSQLiteDatabase) {
        StringBuilder sb = new StringBuilder();
        sb.append("create table if not exists DBStressTable_copy(");
        sb.append("_id INTEGER not null,");
        sb.append("client_data_id TEXT,");
        sb.append("ssoid TEXT not null,");
        sb.append("device_unique_id TEXT not null,");
        sb.append("device_name TEXT,");
        sb.append("data_created_timestamp INTEGER not null,");
        sb.append("stress_type INTEGER not null,");
        sb.append("stress_value INTEGER not null,");
        sb.append("display INTEGER not null,");
        sb.append("sync_status INTEGER not null,");
        sb.append("modified_timestamp INTEGER not null,");
        sb.append("updated INTEGER not null,");
        sb.append("PRIMARY KEY (ssoid, device_unique_id, data_created_timestamp, stress_type)");
        sb.append(");");
        supportSQLiteDatabase.execSQL(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("INSERT INTO DBStressTable_copy (");
        sb2.append(params());
        sb2.append(") SELECT ");
        sb2.append(params());
        sb2.append(" FROM ");
        sb2.append("DBStressTable");
        sb2.append(" where display = 1");
        sb2.append(" GROUP BY ");
        sb2.append("ssoid, device_unique_id, data_created_timestamp, stress_type, display;");
        supportSQLiteDatabase.execSQL(sb2.toString());
        supportSQLiteDatabase.execSQL("DROP TABLE DBStressTable;");
        supportSQLiteDatabase.execSQL("ALTER TABLE DBStressTable_copy RENAME TO DBStressTable;");
    }

    public static String createStressTableSQL() {
        return "create table if not exists DBStressTable(_id INTEGER primary key autoincrement not null,client_data_id TEXT,ssoid TEXT not null,device_unique_id TEXT not null,device_name TEXT,data_created_timestamp INTEGER not null,stress_type INTEGER not null,stress_value INTEGER not null,display INTEGER not null,sync_status INTEGER not null,modified_timestamp INTEGER not null,updated INTEGER not null)";
    }

    private static String params() {
        return "_id, " + DBSportMetadata.CLIENT_DATA_ID + ", ssoid, " + DBAssessmentRecord.DEVICE_UNIQUE_ID + ", " + DeviceInfoCompat.DB_KEY_DEVICE_NAME + ", data_created_timestamp, stress_type, stress_value, display, sync_status, modified_timestamp, updated";
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

    public String getDeviceName() {
        return this.deviceName;
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
        return getDataCreatedTimestamp();
    }

    public long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    public Integer getRmssd() {
        return this.rmssd;
    }

    public Integer getSdnn() {
        return this.sdnn;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String getSsoid() {
        return this.ssoid;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public long getStartTimestamp() {
        return getDataCreatedTimestamp();
    }

    public long getStressDataId() {
        return this.stressDataId;
    }

    public int getStressType() {
        return this.stressType;
    }

    public int getStressValue() {
        return this.stressValue;
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

    public void setDeviceName(String str) {
        this.deviceName = str;
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

    public void setRmssd(Integer num) {
        this.rmssd = num;
    }

    public void setSdnn(Integer num) {
        this.sdnn = num;
    }

    public void setSsoid(@NotNull String str) {
        this.ssoid = str;
    }

    public void setStressDataId(long j2) {
        this.stressDataId = j2;
    }

    public void setStressType(int i) {
        this.stressType = i;
    }

    public void setStressValue(int i) {
        this.stressValue = i;
    }

    public void setSyncStatus(int i) {
        this.syncStatus = i;
    }

    public void setUpdated(int i) {
        this.updated = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "DBStress{stressDataId=" + this.stressDataId + ", clientDataId='" + this.clientDataId + "', ssoid='" + this.ssoid + "', deviceUniqueId='" + this.deviceUniqueId + "', deviceName='" + this.deviceName + "', dataCreatedTimestamp=" + this.dataCreatedTimestamp + ", stressType=" + this.stressType + ", stressValue=" + this.stressValue + ", display=" + this.display + ", syncStatus=" + this.syncStatus + ", modifiedTimestamp=" + this.modifiedTimestamp + ", updated=" + this.updated + ", sdnn=" + this.sdnn + ", rmssd=" + this.rmssd + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.stressDataId);
        parcel.writeString(this.clientDataId);
        parcel.writeString(this.ssoid);
        parcel.writeString(this.deviceUniqueId);
        parcel.writeString(this.deviceName);
        parcel.writeLong(this.dataCreatedTimestamp);
        parcel.writeInt(this.stressType);
        parcel.writeInt(this.stressValue);
        parcel.writeInt(this.display);
        parcel.writeInt(this.syncStatus);
        parcel.writeLong(this.modifiedTimestamp);
        parcel.writeInt(this.updated);
        parcel.writeValue(this.sdnn);
        parcel.writeValue(this.rmssd);
    }

    public DBStress(Parcel parcel) {
        this.ssoid = "";
        this.deviceUniqueId = "";
        this.stressDataId = parcel.readLong();
        this.clientDataId = parcel.readString();
        this.ssoid = parcel.readString();
        this.deviceUniqueId = parcel.readString();
        this.deviceName = parcel.readString();
        this.dataCreatedTimestamp = parcel.readLong();
        this.stressType = parcel.readInt();
        this.stressValue = parcel.readInt();
        this.display = parcel.readInt();
        this.syncStatus = parcel.readInt();
        this.modifiedTimestamp = parcel.readLong();
        this.updated = parcel.readInt();
        this.sdnn = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.rmssd = (Integer) parcel.readValue(Integer.class.getClassLoader());
    }
}
