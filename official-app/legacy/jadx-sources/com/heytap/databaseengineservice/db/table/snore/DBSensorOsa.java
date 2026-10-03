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
@Entity(primaryKeys = {"ssoid", DBAssessmentRecord.DEVICE_UNIQUE_ID, "data_created_timestamp", "type"}, tableName = "DBSensorOsa")
@Keep
public class DBSensorOsa extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<DBSensorOsa> CREATOR = new a();

    @ColumnInfo(name = "data_created_timestamp")
    private long dataTimestamp;

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

    @ColumnInfo(name = "type")
    private int type;

    @ColumnInfo(name = "updated")
    private int updated;

    @ColumnInfo(name = "value")
    private int value;

    public class a implements Parcelable.Creator<DBSensorOsa> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DBSensorOsa createFromParcel(Parcel parcel) {
            return new DBSensorOsa(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DBSensorOsa[] newArray(int i) {
            return new DBSensorOsa[i];
        }
    }

    public DBSensorOsa() {
        this.ssoid = "";
        this.deviceUniqueId = "";
        this.display = 1;
    }

    public static String createSensorOsaTable() {
        return "create table if not exists DBSensorOsa(ssoid TEXT not null,device_unique_id TEXT not null,data_created_timestamp INTEGER not null,type INTEGER not null,value INTEGER not null,display INTEGER not null,sync_status INTEGER not null,modified_timestamp INTEGER not null,updated INTEGER not null,primary key(ssoid," + DBAssessmentRecord.DEVICE_UNIQUE_ID + ",data_created_timestamp,type))";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getDataTimestamp() {
        return this.dataTimestamp;
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

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String getSsoid() {
        return this.ssoid;
    }

    public int getSyncStatus() {
        return this.syncStatus;
    }

    public int getType() {
        return this.type;
    }

    public int getUpdated() {
        return this.updated;
    }

    public int getValue() {
        return this.value;
    }

    public void setDataTimestamp(long j2) {
        this.dataTimestamp = j2;
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

    public void setSsoid(String str) {
        this.ssoid = str;
    }

    public void setSyncStatus(int i) {
        this.syncStatus = i;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setUpdated(int i) {
        this.updated = i;
    }

    public void setValue(int i) {
        this.value = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "DBSensorOsa{ssoid='" + this.ssoid + "', deviceUniqueId='" + this.deviceUniqueId + "', dataTimestamp=" + this.dataTimestamp + ", type=" + this.type + ", value=" + this.value + ", display=" + this.display + ", syncStatus=" + this.syncStatus + ", modifiedTimestamp=" + this.modifiedTimestamp + ", updated=" + this.updated + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ssoid);
        parcel.writeString(this.deviceUniqueId);
        parcel.writeLong(this.dataTimestamp);
        parcel.writeInt(this.type);
        parcel.writeInt(this.value);
        parcel.writeInt(this.display);
        parcel.writeInt(this.syncStatus);
        parcel.writeLong(this.modifiedTimestamp);
        parcel.writeInt(this.updated);
    }

    public DBSensorOsa(Parcel parcel) {
        this.ssoid = "";
        this.deviceUniqueId = "";
        this.display = 1;
        this.ssoid = parcel.readString();
        this.deviceUniqueId = parcel.readString();
        this.dataTimestamp = parcel.readLong();
        this.type = parcel.readInt();
        this.value = parcel.readInt();
        this.display = parcel.readInt();
        this.syncStatus = parcel.readInt();
        this.modifiedTimestamp = parcel.readLong();
        this.updated = parcel.readInt();
    }
}
