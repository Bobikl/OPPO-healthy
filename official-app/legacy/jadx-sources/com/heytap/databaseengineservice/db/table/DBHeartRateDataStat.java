package com.heytap.databaseengineservice.db.table;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.heytap.databaseengine.apiv3.data.Element;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.databaseengineservice.db.table.newsleep.DBSleepHeartRateStat;
import com.heytap.databaseengineservice.db.table.sportrecord.DBSportMetadata;

/* JADX INFO: loaded from: classes15.dex */
@Entity(tableName = "DBHeartRateDataStatTable")
@Keep
public class DBHeartRateDataStat extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<DBHeartRateDataStat> CREATOR = new a();

    @ColumnInfo(name = "average_hr")
    private int averageHeartRate;

    @ColumnInfo(name = DBSportMetadata.CLIENT_DATA_ID)
    private String clientDataId;

    @ColumnInfo(name = "date")
    private int date;

    @ColumnInfo(name = DBAssessmentRecord.DEVICE_UNIQUE_ID)
    private String deviceUniqueId;

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "_id")
    private long heartRateDataStatId;

    @ColumnInfo(name = DBSleepHeartRateStat.MAX_HEART_RATE)
    private int maxHeartRate;

    @ColumnInfo(name = "metadata")
    private String metadata;

    @ColumnInfo(name = DBSleepHeartRateStat.MIN_HEART_RATE)
    private int minHeartRate;

    @ColumnInfo(name = "modified_timestamp")
    private long modifiedTimestamp;

    @ColumnInfo(name = Element.ELEMENT_NAME_REST_HR)
    private int restHeartRate;

    @ColumnInfo(name = Element.ELEMENT_NAME_SLEEP_BASE_HR)
    private int sleepBaseHeartRate;

    @ColumnInfo(name = "ssoid")
    private String ssoid;

    @ColumnInfo(name = "sync_status")
    private int syncStatus;

    @ColumnInfo(name = "timezone")
    private String timezone;

    @ColumnInfo(name = "updated")
    private int updated;

    @ColumnInfo(name = Element.ELEMENT_NAME_WALK_AVG_HR)
    private int walkAvgHeartRate;

    public class a implements Parcelable.Creator<DBHeartRateDataStat> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DBHeartRateDataStat createFromParcel(Parcel parcel) {
            return new DBHeartRateDataStat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DBHeartRateDataStat[] newArray(int i) {
            return new DBHeartRateDataStat[i];
        }
    }

    public DBHeartRateDataStat() {
    }

    public static String createHeartRateDataStatTableSQL() {
        return "create table if not exists DBHeartRateDataStatTable(_id INTEGER primary key autoincrement not null,client_data_id TEXT,ssoid TEXT,device_unique_id TEXT,date INTEGER not null,timezone TEXT,max_hr INTEGER not null,min_hr INTEGER not null,average_hr INTEGER not null,rest_hr INTEGER not null,metadata TEXT,sync_status INTEGER not null,modified_timestamp INTEGER not null,updated INTEGER not null)";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getAverageHeartRate() {
        return this.averageHeartRate;
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

    public long getHeartRateDataStatId() {
        return this.heartRateDataStatId;
    }

    public int getMaxHeartRate() {
        return this.maxHeartRate;
    }

    public String getMetadata() {
        return this.metadata;
    }

    public int getMinHeartRate() {
        return this.minHeartRate;
    }

    public long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    public int getRestHeartRate() {
        return this.restHeartRate;
    }

    public int getSleepBaseHeartRate() {
        return this.sleepBaseHeartRate;
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

    public int getWalkAvgHeartRate() {
        return this.walkAvgHeartRate;
    }

    public void setAverageHeartRate(int i) {
        this.averageHeartRate = i;
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

    public void setHeartRateDataStatId(long j2) {
        this.heartRateDataStatId = j2;
    }

    public void setMaxHeartRate(int i) {
        this.maxHeartRate = i;
    }

    public void setMetadata(String str) {
        this.metadata = str;
    }

    public void setMinHeartRate(int i) {
        this.minHeartRate = i;
    }

    public void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
    }

    public void setRestHeartRate(int i) {
        this.restHeartRate = i;
    }

    public void setSleepBaseHeartRate(int i) {
        this.sleepBaseHeartRate = i;
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

    public void setWalkAvgHeartRate(int i) {
        this.walkAvgHeartRate = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "DBHeartRateDataStat{heartRateDataStatId=" + this.heartRateDataStatId + ", clientDataId='" + this.clientDataId + "', ssoid='" + this.ssoid + "', deviceUniqueId='" + this.deviceUniqueId + "', date=" + this.date + ", timezone='" + this.timezone + "', maxHR=" + this.maxHeartRate + ", minHR=" + this.minHeartRate + ", averageHR=" + this.averageHeartRate + ", restHR=" + this.restHeartRate + ", walkAvgHR=" + this.walkAvgHeartRate + ", sleepBaseHR=" + this.sleepBaseHeartRate + ", metadata='" + this.metadata + "', syncStatus=" + this.syncStatus + ", modifiedTimestamp=" + this.modifiedTimestamp + ", updated=" + this.updated + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.clientDataId);
        parcel.writeString(this.ssoid);
        parcel.writeString(this.deviceUniqueId);
        parcel.writeInt(this.date);
        parcel.writeString(this.timezone);
        parcel.writeInt(this.maxHeartRate);
        parcel.writeInt(this.minHeartRate);
        parcel.writeInt(this.averageHeartRate);
        parcel.writeInt(this.restHeartRate);
        parcel.writeInt(this.walkAvgHeartRate);
        parcel.writeInt(this.sleepBaseHeartRate);
        parcel.writeString(this.metadata);
        parcel.writeInt(this.syncStatus);
        parcel.writeLong(this.modifiedTimestamp);
        parcel.writeInt(this.updated);
    }

    public DBHeartRateDataStat(Parcel parcel) {
        this.clientDataId = parcel.readString();
        this.ssoid = parcel.readString();
        this.deviceUniqueId = parcel.readString();
        this.date = parcel.readInt();
        this.timezone = parcel.readString();
        this.maxHeartRate = parcel.readInt();
        this.minHeartRate = parcel.readInt();
        this.averageHeartRate = parcel.readInt();
        this.restHeartRate = parcel.readInt();
        this.walkAvgHeartRate = parcel.readInt();
        this.sleepBaseHeartRate = parcel.readInt();
        this.metadata = parcel.readString();
        this.syncStatus = parcel.readInt();
        this.modifiedTimestamp = parcel.readLong();
        this.updated = parcel.readInt();
    }
}
