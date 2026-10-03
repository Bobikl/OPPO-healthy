package com.heytap.databaseengineservice.db.table.snore;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.databaseengineservice.db.table.DBAssessmentRecord;

/* JADX INFO: loaded from: classes15.dex */
@Entity(primaryKeys = {"ssoid", DBAssessmentRecord.DEVICE_UNIQUE_ID, "data_created_timestamp"}, tableName = "DBSnoreEnvNoise")
@Keep
public class DBSnoreEnvNoise extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<DBSnoreEnvNoise> CREATOR = new a();

    @ColumnInfo(name = "data_created_timestamp")
    private long dataTimestamp;

    @ColumnInfo(name = "device_id")
    private String deviceId;

    @NonNull
    @ColumnInfo(name = DBAssessmentRecord.DEVICE_UNIQUE_ID)
    private String deviceUniqueId;

    @ColumnInfo(name = "display")
    private int display;

    @ColumnInfo(name = "modified_timestamp")
    private long modifiedTimestamp;

    @ColumnInfo(name = "record_end_timestamp")
    private Long recordEndTimestamp;

    @ColumnInfo(name = "record_start_timestamp")
    private Long recordStartTimestamp;

    @NonNull
    @ColumnInfo(name = "ssoid")
    private String ssoid;

    @ColumnInfo(name = "sync_status")
    private int syncStatus;

    @ColumnInfo(name = "updated")
    private int updated;

    @ColumnInfo(name = "value")
    private Integer value;

    public class a implements Parcelable.Creator<DBSnoreEnvNoise> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DBSnoreEnvNoise createFromParcel(Parcel parcel) {
            return new DBSnoreEnvNoise(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DBSnoreEnvNoise[] newArray(int i) {
            return new DBSnoreEnvNoise[i];
        }
    }

    public DBSnoreEnvNoise() {
        this.ssoid = "";
        this.deviceUniqueId = "";
        this.display = 1;
    }

    public static String createSnoreEnvNoiseTable() {
        return "create table if not exists DBSnoreEnvNoise(ssoid TEXT not null,device_unique_id TEXT not null,device_id TEXT,record_start_timestamp INTEGER,record_end_timestamp INTEGER,data_created_timestamp INTEGER not null,value INTEGER,display INTEGER not null,sync_status INTEGER not null,modified_timestamp INTEGER not null,updated INTEGER not null,primary key(ssoid," + DBAssessmentRecord.DEVICE_UNIQUE_ID + ",data_created_timestamp))";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getDataTimestamp() {
        return this.dataTimestamp;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    public int getDisplay() {
        return this.display;
    }

    public long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    public Long getRecordEndTimestamp() {
        return this.recordEndTimestamp;
    }

    public Long getRecordStartTimestamp() {
        return this.recordStartTimestamp;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String getSsoid() {
        return this.ssoid;
    }

    public int getSyncStatus() {
        return this.syncStatus;
    }

    public int getUpdated() {
        return this.updated;
    }

    public Integer getValue() {
        return this.value;
    }

    public void setDataTimestamp(long j2) {
        this.dataTimestamp = j2;
    }

    public void setDeviceId(String str) {
        this.deviceId = str;
    }

    public void setDeviceUniqueId(String str) {
        this.deviceUniqueId = str;
    }

    public void setDisplay(int i) {
        this.display = i;
    }

    public void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
    }

    public void setRecordEndTimestamp(Long l2) {
        this.recordEndTimestamp = l2;
    }

    public void setRecordStartTimestamp(Long l2) {
        this.recordStartTimestamp = l2;
    }

    public void setSsoid(String str) {
        this.ssoid = str;
    }

    public void setSyncStatus(int i) {
        this.syncStatus = i;
    }

    public void setUpdated(int i) {
        this.updated = i;
    }

    public void setValue(Integer num) {
        this.value = num;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "DBSnoreEnvNoise{ssoid='" + this.ssoid + "', deviceUniqueId='" + this.deviceUniqueId + "', deviceId='" + this.deviceId + "', recordStartTimestamp=" + this.recordStartTimestamp + ", recordEndTimestamp=" + this.recordEndTimestamp + ", dataTimestamp=" + this.dataTimestamp + ", value=" + this.value + ", display=" + this.display + ", syncStatus=" + this.syncStatus + ", modifiedTimestamp=" + this.modifiedTimestamp + ", updated=" + this.updated + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ssoid);
        parcel.writeString(this.deviceUniqueId);
        parcel.writeString(this.deviceId);
        parcel.writeValue(this.recordStartTimestamp);
        parcel.writeValue(this.recordEndTimestamp);
        parcel.writeLong(this.dataTimestamp);
        parcel.writeValue(this.value);
        parcel.writeInt(this.display);
        parcel.writeInt(this.syncStatus);
        parcel.writeLong(this.modifiedTimestamp);
        parcel.writeInt(this.updated);
    }

    public DBSnoreEnvNoise(Parcel parcel) {
        this.ssoid = "";
        this.deviceUniqueId = "";
        this.display = 1;
        this.ssoid = parcel.readString();
        this.deviceUniqueId = parcel.readString();
        this.deviceId = parcel.readString();
        this.recordStartTimestamp = (Long) parcel.readValue(Long.class.getClassLoader());
        this.recordEndTimestamp = (Long) parcel.readValue(Long.class.getClassLoader());
        this.dataTimestamp = parcel.readLong();
        this.value = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.display = parcel.readInt();
        this.syncStatus = parcel.readInt();
        this.modifiedTimestamp = parcel.readLong();
        this.updated = parcel.readInt();
    }
}
