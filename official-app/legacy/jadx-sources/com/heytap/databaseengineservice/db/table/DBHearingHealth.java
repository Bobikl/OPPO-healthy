package com.heytap.databaseengineservice.db.table;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.databaseengineservice.db.table.sportrecord.DBSportMetadata;
import com.oplus.mydevices.sdk.compat.DeviceInfoCompat;
import java.util.Objects;

/* JADX INFO: loaded from: classes15.dex */
@Entity(primaryKeys = {"ssoid", DBAssessmentRecord.DEVICE_UNIQUE_ID, "data_created_timestamp"}, tableName = "DBHearingHealthTable")
@Keep
public class DBHearingHealth extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<DBHearingHealth> CREATOR = new a();

    @ColumnInfo(name = "data_created_timestamp")
    private long dataCreatedTimestamp;

    @ColumnInfo(name = "db_value")
    private double dbValue;

    @ColumnInfo(name = DeviceInfoCompat.DB_KEY_DEVICE_NAME)
    private String deviceName;

    @NonNull
    @ColumnInfo(name = DBAssessmentRecord.DEVICE_UNIQUE_ID)
    private String deviceUniqueId;

    @ColumnInfo(name = "display")
    private int display;

    @ColumnInfo(name = "duration")
    private long duration;

    @ColumnInfo(name = DBSportMetadata.EXTENSION)
    private String extension;

    @ColumnInfo(name = "modified_timestamp")
    private long modifiedTimestamp;

    @NonNull
    @ColumnInfo(name = "ssoid")
    private String ssoid;

    @ColumnInfo(name = "sync_status")
    private int syncStatus;

    @ColumnInfo(name = "updated")
    private int updated;

    public class a implements Parcelable.Creator<DBHearingHealth> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DBHearingHealth createFromParcel(Parcel parcel) {
            return new DBHearingHealth(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DBHearingHealth[] newArray(int i) {
            return new DBHearingHealth[i];
        }
    }

    public DBHearingHealth() {
        this.ssoid = "";
        this.deviceUniqueId = "";
    }

    public static String createTableSQL() {
        return "create table if not exists DBHearingHealthTable(ssoid TEXT not null,device_unique_id TEXT not null,device_name TEXT,data_created_timestamp INTEGER not null,db_value REAL not null,duration INTEGER not null,display INTEGER not null,sync_status INTEGER not null,extension TEXT,modified_timestamp INTEGER not null,updated INTEGER not null,primary key(ssoid," + DBAssessmentRecord.DEVICE_UNIQUE_ID + ",data_created_timestamp))";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getDataCreatedTimestamp() {
        return this.dataCreatedTimestamp;
    }

    public double getDbValue() {
        return this.dbValue;
    }

    public String getDeviceName() {
        return this.deviceName;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NonNull
    public String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    public int getDisplay() {
        return this.display;
    }

    public long getDuration() {
        return this.duration;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public long getEndTimestamp() {
        return getDataCreatedTimestamp();
    }

    public String getExtension() {
        return this.extension;
    }

    public long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NonNull
    public String getSsoid() {
        return this.ssoid;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public long getStartTimestamp() {
        return getDataCreatedTimestamp();
    }

    public int getSyncStatus() {
        return this.syncStatus;
    }

    public int getUpdated() {
        return this.updated;
    }

    public void setDataCreatedTimestamp(long j2) {
        this.dataCreatedTimestamp = j2;
    }

    public void setDbValue(double d) {
        this.dbValue = d;
    }

    public void setDeviceName(String str) {
        this.deviceName = str;
    }

    public void setDeviceUniqueId(@NonNull String str) {
        this.deviceUniqueId = str;
    }

    public void setDisplay(int i) {
        this.display = i;
    }

    public void setDuration(long j2) {
        this.duration = j2;
    }

    public void setExtension(String str) {
        this.extension = str;
    }

    public void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
    }

    public void setSsoid(@NonNull String str) {
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
        return "DBHearingHealth{ssoid='" + this.ssoid + "', deviceUniqueId='" + this.deviceUniqueId + "', deviceName='" + this.deviceName + "', dataCreatedTimestamp=" + this.dataCreatedTimestamp + ", dbValue=" + this.dbValue + ", duration=" + this.duration + ", display=" + this.display + ", syncStatus=" + this.syncStatus + ", extension='" + this.extension + "', modifiedTimestamp=" + this.modifiedTimestamp + ", updated=" + this.updated + "} ";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ssoid);
        parcel.writeString(this.deviceUniqueId);
        parcel.writeString(this.deviceName);
        parcel.writeLong(this.dataCreatedTimestamp);
        parcel.writeDouble(this.dbValue);
        parcel.writeLong(this.duration);
        parcel.writeInt(this.display);
        parcel.writeInt(this.syncStatus);
        parcel.writeString(this.extension);
        parcel.writeLong(this.modifiedTimestamp);
        parcel.writeInt(this.updated);
    }

    public DBHearingHealth(Parcel parcel) {
        this.ssoid = "";
        this.deviceUniqueId = "";
        String string = parcel.readString();
        Objects.requireNonNull(string);
        this.ssoid = string;
        String string2 = parcel.readString();
        Objects.requireNonNull(string2);
        this.deviceUniqueId = string2;
        this.deviceName = parcel.readString();
        this.dataCreatedTimestamp = parcel.readLong();
        this.dbValue = parcel.readDouble();
        this.duration = parcel.readLong();
        this.display = parcel.readInt();
        this.syncStatus = parcel.readInt();
        this.extension = parcel.readString();
        this.modifiedTimestamp = parcel.readLong();
        this.updated = parcel.readInt();
    }
}
