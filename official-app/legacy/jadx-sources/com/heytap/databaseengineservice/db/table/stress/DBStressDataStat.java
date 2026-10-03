package com.heytap.databaseengineservice.db.table.stress;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.databaseengineservice.db.table.DBAssessmentRecord;
import com.heytap.databaseengineservice.db.table.newsleep.DBSleepHeartRateStat;
import com.heytap.databaseengineservice.db.table.phycialmental.DBPhysicalMentalStat;
import com.heytap.databaseengineservice.db.table.sportrecord.DBSportMetadata;

/* JADX INFO: loaded from: classes15.dex */
@Entity(tableName = "DBStressDataStatTable")
@Keep
public class DBStressDataStat extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<DBStressDataStat> CREATOR = new a();

    @ColumnInfo(name = "average_hr")
    private int averageStress;

    @ColumnInfo(name = DBSportMetadata.CLIENT_DATA_ID)
    private String clientDataId;

    @ColumnInfo(name = "date")
    private int date;

    @ColumnInfo(name = DBAssessmentRecord.DEVICE_UNIQUE_ID)
    private String deviceUniqueId;

    @ColumnInfo(name = "high_stress_total_time")
    private int highStressTotalTime;

    @ColumnInfo(name = DBSleepHeartRateStat.MAX_HEART_RATE)
    private int maxStress;

    @ColumnInfo(name = DBPhysicalMentalStat.MAX_STRESS_TIMESTAMP)
    private long maxStressTimestamp;

    @ColumnInfo(name = "metadata")
    private String metadata;

    @ColumnInfo(name = "middle_stress_total_time")
    private int middleStressTotalTime;

    @ColumnInfo(name = DBSleepHeartRateStat.MIN_HEART_RATE)
    private int minStress;

    @ColumnInfo(name = "modified_timestamp")
    private long modifiedTimestamp;

    @ColumnInfo(name = "normal_stress_total_time")
    private int normalStressTotalTime;

    @ColumnInfo(name = "relax_stress_total_time")
    private int relaxStressTotalTime;

    @ColumnInfo(name = "ssoid")
    private String ssoid;

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "_id")
    private long stressDataStatId;

    @ColumnInfo(name = "sync_status")
    private int syncStatus;

    @ColumnInfo(name = "timezone")
    private String timezone;

    @ColumnInfo(name = "updated")
    private int updated;

    public class a implements Parcelable.Creator<DBStressDataStat> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DBStressDataStat createFromParcel(Parcel parcel) {
            return new DBStressDataStat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DBStressDataStat[] newArray(int i) {
            return new DBStressDataStat[i];
        }
    }

    public DBStressDataStat() {
    }

    public static String createStressDataStatTableSQL() {
        return "create table if not exists DBStressDataStatTable(_id INTEGER primary key autoincrement not null,client_data_id TEXT,ssoid TEXT,device_unique_id TEXT,date INTEGER not null,timezone TEXT,max_hr INTEGER not null,min_hr INTEGER not null,average_hr INTEGER not null,max_stress_timestamp INTEGER not null,relax_stress_total_time INTEGER not null,normal_stress_total_time INTEGER not null,middle_stress_total_time INTEGER not null,high_stress_total_time INTEGER not null,metadata TEXT,sync_status INTEGER not null,modified_timestamp INTEGER not null,updated INTEGER not null)";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getAverageStress() {
        return this.averageStress;
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

    public int getHighStressTotalTime() {
        return this.highStressTotalTime;
    }

    public int getMaxStress() {
        return this.maxStress;
    }

    public long getMaxStressTimestamp() {
        return this.maxStressTimestamp;
    }

    public String getMetadata() {
        return this.metadata;
    }

    public int getMiddleStressTotalTime() {
        return this.middleStressTotalTime;
    }

    public int getMinStress() {
        return this.minStress;
    }

    public long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    public int getNormalStressTotalTime() {
        return this.normalStressTotalTime;
    }

    public int getRelaxStressTotalTime() {
        return this.relaxStressTotalTime;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String getSsoid() {
        return this.ssoid;
    }

    public long getStressDataStatId() {
        return this.stressDataStatId;
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

    public void setAverageStress(int i) {
        this.averageStress = i;
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

    public void setHighStressTotalTime(int i) {
        this.highStressTotalTime = i;
    }

    public void setMaxStress(int i) {
        this.maxStress = i;
    }

    public void setMaxStressTimestamp(long j2) {
        this.maxStressTimestamp = j2;
    }

    public void setMetadata(String str) {
        this.metadata = str;
    }

    public void setMiddleStressTotalTime(int i) {
        this.middleStressTotalTime = i;
    }

    public void setMinStress(int i) {
        this.minStress = i;
    }

    public void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
    }

    public void setNormalStressTotalTime(int i) {
        this.normalStressTotalTime = i;
    }

    public void setRelaxStressTotalTime(int i) {
        this.relaxStressTotalTime = i;
    }

    public void setSsoid(String str) {
        this.ssoid = str;
    }

    public void setStressDataStatId(long j2) {
        this.stressDataStatId = j2;
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
        return "DBStressDataStat{stressDataStatId=" + this.stressDataStatId + ", clientDataId='" + this.clientDataId + "', ssoid='" + this.ssoid + "', deviceUniqueId='" + this.deviceUniqueId + "', date=" + this.date + ", timezone='" + this.timezone + "', maxStress=" + this.maxStress + ", minStress=" + this.minStress + ", averageStress=" + this.averageStress + ", maxStressTimestamp=" + this.maxStressTimestamp + ", relaxStressTotalTime=" + this.relaxStressTotalTime + ", normalStressTotalTime=" + this.normalStressTotalTime + ", middleStressTotalTime=" + this.middleStressTotalTime + ", highStressTotalTime=" + this.highStressTotalTime + ", metadata='" + this.metadata + "', syncStatus=" + this.syncStatus + ", modifiedTimestamp=" + this.modifiedTimestamp + ", updated=" + this.updated + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.stressDataStatId);
        parcel.writeString(this.clientDataId);
        parcel.writeString(this.ssoid);
        parcel.writeString(this.deviceUniqueId);
        parcel.writeInt(this.date);
        parcel.writeString(this.timezone);
        parcel.writeInt(this.maxStress);
        parcel.writeInt(this.minStress);
        parcel.writeInt(this.averageStress);
        parcel.writeLong(this.maxStressTimestamp);
        parcel.writeInt(this.relaxStressTotalTime);
        parcel.writeInt(this.normalStressTotalTime);
        parcel.writeInt(this.middleStressTotalTime);
        parcel.writeInt(this.highStressTotalTime);
        parcel.writeString(this.metadata);
        parcel.writeInt(this.syncStatus);
        parcel.writeLong(this.modifiedTimestamp);
        parcel.writeInt(this.updated);
    }

    public DBStressDataStat(Parcel parcel) {
        this.stressDataStatId = parcel.readLong();
        this.clientDataId = parcel.readString();
        this.ssoid = parcel.readString();
        this.deviceUniqueId = parcel.readString();
        this.date = parcel.readInt();
        this.timezone = parcel.readString();
        this.maxStress = parcel.readInt();
        this.minStress = parcel.readInt();
        this.averageStress = parcel.readInt();
        this.maxStressTimestamp = parcel.readLong();
        this.relaxStressTotalTime = parcel.readInt();
        this.normalStressTotalTime = parcel.readInt();
        this.middleStressTotalTime = parcel.readInt();
        this.highStressTotalTime = parcel.readInt();
        this.metadata = parcel.readString();
        this.syncStatus = parcel.readInt();
        this.modifiedTimestamp = parcel.readLong();
        this.updated = parcel.readInt();
    }
}
