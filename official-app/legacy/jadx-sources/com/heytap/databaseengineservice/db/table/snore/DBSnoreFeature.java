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
@Entity(primaryKeys = {"ssoid", DBAssessmentRecord.DEVICE_UNIQUE_ID, "snore_start_timestamp"}, tableName = "DBSnoreFeature")
@Keep
public class DBSnoreFeature extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<DBSnoreFeature> CREATOR = new a();

    @ColumnInfo(name = "device_id")
    private String deviceId;

    @NonNull
    @ColumnInfo(name = DBAssessmentRecord.DEVICE_UNIQUE_ID)
    private String deviceUniqueId;

    @ColumnInfo(name = "display")
    private int display;

    @ColumnInfo(name = "features")
    private String features;

    @ColumnInfo(name = "modified_timestamp")
    private long modifiedTimestamp;

    @ColumnInfo(name = "record_end_timestamp")
    private Long recordEndTimestamp;

    @ColumnInfo(name = "record_start_timestamp")
    private Long recordStartTimestamp;

    @ColumnInfo(name = "snore_end_timestamp")
    private long snoreEndTimestamp;

    @ColumnInfo(name = "snore_start_timestamp")
    private long snoreStartTimestamp;

    @NonNull
    @ColumnInfo(name = "ssoid")
    private String ssoid;

    @ColumnInfo(name = "sync_status")
    private int syncStatus;

    @ColumnInfo(name = "updated")
    private int updated;

    public class a implements Parcelable.Creator<DBSnoreFeature> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DBSnoreFeature createFromParcel(Parcel parcel) {
            return new DBSnoreFeature(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DBSnoreFeature[] newArray(int i) {
            return new DBSnoreFeature[i];
        }
    }

    public DBSnoreFeature() {
        this.ssoid = "";
        this.deviceUniqueId = "";
        this.display = 1;
    }

    public static String createSnoreFeatureTable() {
        return "create table if not exists DBSnoreFeature(ssoid TEXT not null,device_unique_id TEXT not null,device_id TEXT,record_start_timestamp INTEGER,record_end_timestamp INTEGER,snore_start_timestamp INTEGER not null,snore_end_timestamp INTEGER not null,features TEXT,display INTEGER not null,sync_status INTEGER not null,modified_timestamp INTEGER not null,updated INTEGER not null,primary key(ssoid," + DBAssessmentRecord.DEVICE_UNIQUE_ID + ",snore_start_timestamp))";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
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

    public String getFeatures() {
        return this.features;
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

    public long getSnoreEndTimestamp() {
        return this.snoreEndTimestamp;
    }

    public long getSnoreStartTimestamp() {
        return this.snoreStartTimestamp;
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

    public void setDeviceId(String str) {
        this.deviceId = str;
    }

    public void setDeviceUniqueId(String str) {
        this.deviceUniqueId = str;
    }

    public void setDisplay(int i) {
        this.display = i;
    }

    public void setFeatures(String str) {
        this.features = str;
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

    public void setSnoreEndTimestamp(long j2) {
        this.snoreEndTimestamp = j2;
    }

    public void setSnoreStartTimestamp(long j2) {
        this.snoreStartTimestamp = j2;
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

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "DBSnoreFeature{ssoid='" + this.ssoid + "', deviceUniqueId='" + this.deviceUniqueId + "', deviceId='" + this.deviceId + "', recordStartTimestamp=" + this.recordStartTimestamp + ", recordEndTimestamp=" + this.recordEndTimestamp + ", snoreStartTimestamp=" + this.snoreStartTimestamp + ", snoreEndTimestamp=" + this.snoreEndTimestamp + ", features='" + this.features + "', display=" + this.display + ", syncStatus=" + this.syncStatus + ", modifiedTimestamp=" + this.modifiedTimestamp + ", updated=" + this.updated + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ssoid);
        parcel.writeString(this.deviceUniqueId);
        parcel.writeString(this.deviceId);
        parcel.writeValue(this.recordStartTimestamp);
        parcel.writeValue(this.recordEndTimestamp);
        parcel.writeLong(this.snoreStartTimestamp);
        parcel.writeLong(this.snoreEndTimestamp);
        parcel.writeString(this.features);
        parcel.writeInt(this.display);
        parcel.writeInt(this.syncStatus);
        parcel.writeLong(this.modifiedTimestamp);
        parcel.writeInt(this.updated);
    }

    public DBSnoreFeature(Parcel parcel) {
        this.ssoid = "";
        this.deviceUniqueId = "";
        this.display = 1;
        this.ssoid = parcel.readString();
        this.deviceUniqueId = parcel.readString();
        this.deviceId = parcel.readString();
        this.recordStartTimestamp = (Long) parcel.readValue(Long.class.getClassLoader());
        this.recordEndTimestamp = (Long) parcel.readValue(Long.class.getClassLoader());
        this.snoreStartTimestamp = parcel.readLong();
        this.snoreEndTimestamp = parcel.readLong();
        this.features = parcel.readString();
        this.display = parcel.readInt();
        this.syncStatus = parcel.readInt();
        this.modifiedTimestamp = parcel.readLong();
        this.updated = parcel.readInt();
    }
}
