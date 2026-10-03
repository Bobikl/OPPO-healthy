package com.heytap.databaseengineservice.db.table.bloodoxygensaturation;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.databaseengineservice.db.table.DBAssessmentRecord;
import com.heytap.databaseengineservice.db.table.sportrecord.DBSportMetadata;
import com.oplus.aiunit.vision.v05;

/* JADX INFO: loaded from: classes15.dex */
@Entity(tableName = "DBBloodOxygenSaturationDataStat")
@Keep
public class DBBloodOxygenSaturationDataStat extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<DBBloodOxygenSaturationDataStat> CREATOR = new a();

    @ColumnInfo(name = "average_blood_oxygen_saturation")
    private int averageBloodOxygenSaturation;

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "_id")
    private long bloodOxygenSaturationDataStatId;

    @ColumnInfo(name = "blood_oxygen_saturation_drop")
    private int bloodOxygenSaturationDrop;

    @ColumnInfo(name = DBSportMetadata.CLIENT_DATA_ID)
    private String clientDataId;

    @ColumnInfo(name = "date")
    private int date;

    @ColumnInfo(name = DBAssessmentRecord.DEVICE_UNIQUE_ID)
    private String deviceUniqueId;

    @ColumnInfo(name = "low_blood_oxygen_saturation_day")
    private int lowBloodOxygenSaturationDay;

    @ColumnInfo(name = "low_blood_oxygen_saturation_total_time")
    private long lowBloodOxygenSaturationTotalTime;

    @ColumnInfo(name = "max_blood_oxygen_saturation")
    private int maxBloodOxygenSaturation;

    @ColumnInfo(name = "metadata")
    private String metadata;

    @ColumnInfo(name = "min_blood_oxygen_saturation")
    private int minBloodOxygenSaturation;

    @ColumnInfo(name = "modified_timestamp")
    private long modifiedTimestamp;

    @ColumnInfo(name = "ssoid")
    private String ssoid;

    @ColumnInfo(name = "sync_status")
    private int syncStatus;

    @ColumnInfo(name = "timezone")
    private String timezone;

    @ColumnInfo(name = "updated")
    private int updated;

    public class a implements Parcelable.Creator<DBBloodOxygenSaturationDataStat> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DBBloodOxygenSaturationDataStat createFromParcel(Parcel parcel) {
            return new DBBloodOxygenSaturationDataStat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DBBloodOxygenSaturationDataStat[] newArray(int i) {
            return new DBBloodOxygenSaturationDataStat[i];
        }
    }

    public DBBloodOxygenSaturationDataStat() {
        this.timezone = v05.r(null);
    }

    public static String createBloodOxygenSaturationDataStatTableSQL() {
        return "create table if not exists DBBloodOxygenSaturationDataStat(_id INTEGER primary key autoincrement not null,client_data_id TEXT,ssoid TEXT,device_unique_id TEXT,date INTEGER not null,timezone TEXT,max_blood_oxygen_saturation INTEGER not null,min_blood_oxygen_saturation INTEGER not null,average_blood_oxygen_saturation INTEGER not null,blood_oxygen_saturation_drop INTEGER not null,low_blood_oxygen_saturation_total_time INTEGER not null,low_blood_oxygen_saturation_day INTEGER not null,metadata TEXT,sync_status INTEGER not null,modified_timestamp INTEGER not null,updated INTEGER not null)";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getAverageBloodOxygenSaturation() {
        return this.averageBloodOxygenSaturation;
    }

    public long getBloodOxygenSaturationDataStatId() {
        return this.bloodOxygenSaturationDataStatId;
    }

    public int getBloodOxygenSaturationDrop() {
        return this.bloodOxygenSaturationDrop;
    }

    public String getClientDataId() {
        return this.clientDataId;
    }

    public int getDate() {
        return this.date;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    public int getLowBloodOxygenSaturationDay() {
        return this.lowBloodOxygenSaturationDay;
    }

    public long getLowBloodOxygenSaturationTotalTime() {
        return this.lowBloodOxygenSaturationTotalTime;
    }

    public int getMaxBloodOxygenSaturation() {
        return this.maxBloodOxygenSaturation;
    }

    public String getMetadata() {
        return this.metadata;
    }

    public int getMinBloodOxygenSaturation() {
        return this.minBloodOxygenSaturation;
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

    public String getTimezone() {
        return this.timezone;
    }

    public int getUpdated() {
        return this.updated;
    }

    public void setAverageBloodOxygenSaturation(int i) {
        this.averageBloodOxygenSaturation = i;
    }

    public void setBloodOxygenSaturationDataStatId(long j2) {
        this.bloodOxygenSaturationDataStatId = j2;
    }

    public void setBloodOxygenSaturationDrop(int i) {
        this.bloodOxygenSaturationDrop = i;
    }

    public void setClientDataId(String str) {
        this.clientDataId = str;
    }

    public void setDate(int i) {
        this.date = i;
    }

    public void setDeviceUniqueId(String str) {
        this.deviceUniqueId = str;
    }

    public void setLowBloodOxygenSaturationDay(int i) {
        this.lowBloodOxygenSaturationDay = i;
    }

    public void setLowBloodOxygenSaturationTotalTime(long j2) {
        this.lowBloodOxygenSaturationTotalTime = j2;
    }

    public void setMaxBloodOxygenSaturation(int i) {
        this.maxBloodOxygenSaturation = i;
    }

    public void setMetadata(String str) {
        this.metadata = str;
    }

    public void setMinBloodOxygenSaturation(int i) {
        this.minBloodOxygenSaturation = i;
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

    public void setTimezone(String str) {
        this.timezone = str;
    }

    public void setUpdated(int i) {
        this.updated = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "DBBloodOxygenSaturationDataStat{bloodOxygenSaturationDataStatId=" + this.bloodOxygenSaturationDataStatId + ", clientDataId='" + this.clientDataId + "', ssoid='" + this.ssoid + "', deviceUniqueId='" + this.deviceUniqueId + "', date=" + this.date + ", timezone='" + this.timezone + "', maxBloodOxygenSaturation=" + this.maxBloodOxygenSaturation + ", minBloodOxygenSaturation=" + this.minBloodOxygenSaturation + ", averageBloodOxygenSaturation=" + this.averageBloodOxygenSaturation + ", bloodOxygenSaturationDrop=" + this.bloodOxygenSaturationDrop + ", lowBloodOxygenSaturationTotalTime=" + this.lowBloodOxygenSaturationTotalTime + ", lowBloodOxygenSaturationDay=" + this.lowBloodOxygenSaturationDay + ", metadata='" + this.metadata + "', syncStatus=" + this.syncStatus + ", modifiedTimestamp=" + this.modifiedTimestamp + ", updated=" + this.updated + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.clientDataId);
        parcel.writeString(this.ssoid);
        parcel.writeString(this.deviceUniqueId);
        parcel.writeInt(this.date);
        parcel.writeString(this.timezone);
        parcel.writeInt(this.maxBloodOxygenSaturation);
        parcel.writeInt(this.minBloodOxygenSaturation);
        parcel.writeInt(this.averageBloodOxygenSaturation);
        parcel.writeInt(this.bloodOxygenSaturationDrop);
        parcel.writeLong(this.lowBloodOxygenSaturationTotalTime);
        parcel.writeInt(this.lowBloodOxygenSaturationDay);
        parcel.writeString(this.metadata);
        parcel.writeInt(this.syncStatus);
        parcel.writeLong(this.modifiedTimestamp);
        parcel.writeInt(this.updated);
    }

    public DBBloodOxygenSaturationDataStat(Parcel parcel) {
        this.timezone = v05.r(null);
        this.clientDataId = parcel.readString();
        this.ssoid = parcel.readString();
        this.deviceUniqueId = parcel.readString();
        this.date = parcel.readInt();
        this.timezone = parcel.readString();
        this.maxBloodOxygenSaturation = parcel.readInt();
        this.minBloodOxygenSaturation = parcel.readInt();
        this.averageBloodOxygenSaturation = parcel.readInt();
        this.bloodOxygenSaturationDrop = parcel.readInt();
        this.lowBloodOxygenSaturationTotalTime = parcel.readLong();
        this.lowBloodOxygenSaturationDay = parcel.readInt();
        this.metadata = parcel.readString();
        this.syncStatus = parcel.readInt();
        this.modifiedTimestamp = parcel.readLong();
        this.updated = parcel.readInt();
    }
}
