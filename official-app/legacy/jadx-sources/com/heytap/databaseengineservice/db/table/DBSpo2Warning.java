package com.heytap.databaseengineservice.db.table;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import com.heytap.databaseengine.model.SportHealthData;

/* JADX INFO: loaded from: classes15.dex */
@Entity(primaryKeys = {"ssoid", DBAssessmentRecord.DEVICE_UNIQUE_ID, "start_timestamp"}, tableName = "DBSpo2Warning")
@Keep
public class DBSpo2Warning extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<DBSpo2Warning> CREATOR = new a();

    @NonNull
    @ColumnInfo(name = DBAssessmentRecord.DEVICE_UNIQUE_ID)
    private String deviceUniqueId;

    @ColumnInfo(name = "end_timestamp")
    private long endTimestamp;

    @ColumnInfo(name = "highest_value")
    private Integer highestValue;

    @ColumnInfo(name = "lowest_value")
    private Integer lowestValue;

    @ColumnInfo(name = "modified_timestamp")
    private long modifiedTimestamp;

    @NonNull
    @ColumnInfo(name = "ssoid")
    private String ssoid;

    @ColumnInfo(name = "start_timestamp")
    private long startTimestamp;

    @ColumnInfo(name = "sync_status")
    private int syncStatus;

    @ColumnInfo(name = "updated")
    private int updated;

    public class a implements Parcelable.Creator<DBSpo2Warning> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DBSpo2Warning createFromParcel(Parcel parcel) {
            return new DBSpo2Warning(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DBSpo2Warning[] newArray(int i) {
            return new DBSpo2Warning[i];
        }
    }

    public DBSpo2Warning() {
        this.ssoid = "";
        this.deviceUniqueId = "";
    }

    public static String createSpo2WarningTable() {
        return "create table if not exists DBSpo2Warning(ssoid TEXT not null,device_unique_id TEXT not null,lowest_value INTEGER,highest_value INTEGER,start_timestamp INTEGER not null,end_timestamp INTEGER not null,sync_status INTEGER not null,modified_timestamp INTEGER not null,updated INTEGER not null,primary key(ssoid," + DBAssessmentRecord.DEVICE_UNIQUE_ID + ",start_timestamp))";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public long getEndTimestamp() {
        return this.endTimestamp;
    }

    public Integer getHighestValue() {
        return this.highestValue;
    }

    public Integer getLowestValue() {
        return this.lowestValue;
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

    public void setDeviceUniqueId(String str) {
        this.deviceUniqueId = str;
    }

    public void setEndTimestamp(long j2) {
        this.endTimestamp = j2;
    }

    public void setHighestValue(Integer num) {
        this.highestValue = num;
    }

    public void setLowestValue(Integer num) {
        this.lowestValue = num;
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

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "DBSpo2Warning{ssoid='" + this.ssoid + "', deviceUniqueId='" + this.deviceUniqueId + "', lowestValue=" + this.lowestValue + ", highestValue=" + this.highestValue + ", startTimestamp=" + this.startTimestamp + ", endTimestamp=" + this.endTimestamp + ", syncStatus=" + this.syncStatus + ", modifiedTimestamp=" + this.modifiedTimestamp + ", updated=" + this.updated + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ssoid);
        parcel.writeString(this.deviceUniqueId);
        parcel.writeValue(this.lowestValue);
        parcel.writeValue(this.highestValue);
        parcel.writeLong(this.startTimestamp);
        parcel.writeLong(this.endTimestamp);
        parcel.writeInt(this.syncStatus);
        parcel.writeLong(this.modifiedTimestamp);
        parcel.writeInt(this.updated);
    }

    public DBSpo2Warning(Parcel parcel) {
        this.ssoid = "";
        this.deviceUniqueId = "";
        this.ssoid = parcel.readString();
        this.deviceUniqueId = parcel.readString();
        this.lowestValue = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.highestValue = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.startTimestamp = parcel.readLong();
        this.endTimestamp = parcel.readLong();
        this.syncStatus = parcel.readInt();
        this.modifiedTimestamp = parcel.readLong();
        this.updated = parcel.readInt();
    }
}
