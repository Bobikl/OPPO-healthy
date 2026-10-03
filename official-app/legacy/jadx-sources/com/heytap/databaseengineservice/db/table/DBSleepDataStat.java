package com.heytap.databaseengineservice.db.table;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.heytap.databaseengine.apiv3.data.Element;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.databaseengineservice.db.table.sportrecord.DBSportMetadata;

/* JADX INFO: loaded from: classes15.dex */
@Entity(primaryKeys = {"ssoid", "date"}, tableName = "DBSleepDataStatTable")
@Keep
public class DBSleepDataStat extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<DBSleepDataStat> CREATOR = new a();

    @ColumnInfo(name = "checked_sleep_score")
    private Integer checkedSleepScore;

    @ColumnInfo(name = DBSportMetadata.CLIENT_DATA_ID)
    private String clientDataId;

    @ColumnInfo(name = "date")
    private int date;

    @NonNull
    @ColumnInfo(name = DBAssessmentRecord.DEVICE_UNIQUE_ID)
    private String deviceUniqueId;

    @Ignore
    private int display;

    @ColumnInfo(name = Element.ELEMENT_NAME_FALL_ASLEEP)
    private long fallAsleep;

    @ColumnInfo(name = "metadata")
    private String metadata;

    @ColumnInfo(name = "modified_timestamp")
    private long modifiedTimestamp;

    @ColumnInfo(name = "_id")
    private long sleepDataStatId;

    @ColumnInfo(name = Element.ELEMENT_NAME_SLEEP_OUT)
    private long sleepOut;

    @ColumnInfo(name = Element.ELEMENT_NAME_SLEEP_SCORE)
    private Integer sleepScore;

    @NonNull
    @ColumnInfo(name = "ssoid")
    private String ssoid;

    @ColumnInfo(name = "sync_status")
    private int syncStatus;

    @ColumnInfo(name = "timezone")
    private String timezone;

    @ColumnInfo(name = Element.ELEMENT_NAME_TOTAL_DEEP_SLEEP_TIME)
    private long totalDeepSleepTime;

    @ColumnInfo(name = Element.ELEMENT_NAME_TOTAL_LIGHTLY_SLEEP_TIME)
    private long totalLightlySleepTime;

    @ColumnInfo(name = Element.ELEMENT_NAME_TOTAL_REM_TIME)
    private long totalRemTime;

    @ColumnInfo(name = "total_sleep_time")
    private long totalSleepTime;

    @ColumnInfo(name = Element.ELEMENT_NAME_TOTAL_WAKE_UP_TIME)
    private long totalWakeUpTime;

    @ColumnInfo(name = "updated")
    private int updated;

    public class a implements Parcelable.Creator<DBSleepDataStat> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DBSleepDataStat createFromParcel(Parcel parcel) {
            return new DBSleepDataStat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DBSleepDataStat[] newArray(int i) {
            return new DBSleepDataStat[i];
        }
    }

    public DBSleepDataStat() {
        this.ssoid = "";
        this.deviceUniqueId = "";
    }

    public static void changePrimaryKey(SupportSQLiteDatabase supportSQLiteDatabase) {
        StringBuilder sb = new StringBuilder();
        sb.append("create table if not exists DBSleepDataStatTable_copy(");
        sb.append("_id INTEGER not null,");
        sb.append("client_data_id TEXT,");
        sb.append("ssoid TEXT not null,");
        sb.append("device_unique_id TEXT not null,");
        sb.append("date INTEGER not null,");
        sb.append("timezone TEXT,");
        sb.append("fall_asleep INTEGER not null,");
        sb.append("sleep_out INTEGER not null,");
        sb.append("total_sleep_time INTEGER not null,");
        sb.append("total_deep_sleep_time INTEGER not null,");
        sb.append("total_lightly_sleep_time INTEGER not null,");
        sb.append("total_rem_time INTEGER not null,");
        sb.append("total_wake_up_time INTEGER not null,");
        sb.append("sleep_score INTEGER,");
        sb.append("checked_sleep_score INTEGER,");
        sb.append("metadata TEXT,");
        sb.append("sync_status INTEGER not null,");
        sb.append("modified_timestamp INTEGER not null,");
        sb.append("updated INTEGER not null,");
        sb.append("PRIMARY KEY (ssoid, date)");
        sb.append(");");
        supportSQLiteDatabase.execSQL(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("INSERT INTO DBSleepDataStatTable_copy (");
        sb2.append("device_unique_id, ");
        sb2.append(params());
        sb2.append(") SELECT ");
        sb2.append("'' as device_unique_id, ");
        sb2.append(params());
        sb2.append(" FROM ");
        sb2.append("DBSleepDataStatTable");
        sb2.append(" where ssoid is not null and ssoid != ''");
        sb2.append(" GROUP BY ");
        sb2.append("ssoid, date;");
        supportSQLiteDatabase.execSQL(sb2.toString());
        supportSQLiteDatabase.execSQL("DROP TABLE DBSleepDataStatTable;");
        supportSQLiteDatabase.execSQL("ALTER TABLE DBSleepDataStatTable_copy RENAME TO DBSleepDataStatTable;");
    }

    public static String createSleepDataStatTableSQL() {
        return "create table if not exists DBSleepDataStatTable(_id INTEGER primary key autoincrement not null,client_data_id TEXT,ssoid TEXT,device_unique_id TEXT,date INTEGER not null,timezone TEXT,fall_asleep INTEGER not null,sleep_out INTEGER not null,total_sleep_time INTEGER not null,total_deep_sleep_time INTEGER not null,total_lightly_sleep_time INTEGER not null,total_rem_time INTEGER not null,total_wake_up_time INTEGER not null,metadata TEXT,sync_status INTEGER not null,modified_timestamp INTEGER not null,updated INTEGER not null)";
    }

    private static String params() {
        return "_id, " + DBSportMetadata.CLIENT_DATA_ID + ", ssoid, date, timezone, " + Element.ELEMENT_NAME_FALL_ASLEEP + ", " + Element.ELEMENT_NAME_SLEEP_OUT + ", total_sleep_time, " + Element.ELEMENT_NAME_TOTAL_DEEP_SLEEP_TIME + ", " + Element.ELEMENT_NAME_TOTAL_LIGHTLY_SLEEP_TIME + ", " + Element.ELEMENT_NAME_TOTAL_REM_TIME + ", " + Element.ELEMENT_NAME_TOTAL_WAKE_UP_TIME + ", " + Element.ELEMENT_NAME_SLEEP_SCORE + ", checked_sleep_score, metadata, sync_status, modified_timestamp, updated";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Integer getCheckedSleepScore() {
        return this.checkedSleepScore;
    }

    public String getClientDataId() {
        return this.clientDataId;
    }

    public int getDate() {
        return this.date;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NonNull
    public String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    public int getDisplay() {
        return this.display;
    }

    public long getFallAsleep() {
        return this.fallAsleep;
    }

    public String getMetadata() {
        return this.metadata;
    }

    public long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    public long getSleepDataStatId() {
        return this.sleepDataStatId;
    }

    public long getSleepOut() {
        return this.sleepOut;
    }

    public Integer getSleepScore() {
        return this.sleepScore;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NonNull
    public String getSsoid() {
        return this.ssoid;
    }

    public int getSyncStatus() {
        return this.syncStatus;
    }

    public String getTimezone() {
        return this.timezone;
    }

    public long getTotalDeepSleepTime() {
        return this.totalDeepSleepTime;
    }

    public long getTotalLightlySleepTime() {
        return this.totalLightlySleepTime;
    }

    public long getTotalRemTime() {
        return this.totalRemTime;
    }

    public long getTotalSleepTime() {
        return this.totalSleepTime;
    }

    public long getTotalWakeUpTime() {
        return this.totalWakeUpTime;
    }

    public int getUpdated() {
        return this.updated;
    }

    public void setCheckedSleepScore(Integer num) {
        this.checkedSleepScore = num;
    }

    public void setClientDataId(String str) {
        this.clientDataId = str;
    }

    public void setDate(int i) {
        this.date = i;
    }

    public void setDeviceUniqueId(@NonNull String str) {
        this.deviceUniqueId = str;
    }

    public void setDisplay(int i) {
        this.display = i;
    }

    public void setFallAsleep(long j2) {
        this.fallAsleep = j2;
    }

    public void setMetadata(String str) {
        this.metadata = str;
    }

    public void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
    }

    public void setSleepDataStatId(long j2) {
        this.sleepDataStatId = j2;
    }

    public void setSleepOut(long j2) {
        this.sleepOut = j2;
    }

    public void setSleepScore(Integer num) {
        this.sleepScore = num;
    }

    public void setSsoid(@NonNull String str) {
        this.ssoid = str;
    }

    public void setSyncStatus(int i) {
        this.syncStatus = i;
    }

    public void setTimezone(String str) {
        this.timezone = str;
    }

    public void setTotalDeepSleepTime(long j2) {
        this.totalDeepSleepTime = j2;
    }

    public void setTotalLightlySleepTime(long j2) {
        this.totalLightlySleepTime = j2;
    }

    public void setTotalRemTime(long j2) {
        this.totalRemTime = j2;
    }

    public void setTotalSleepTime(long j2) {
        this.totalSleepTime = j2;
    }

    public void setTotalWakeUpTime(long j2) {
        this.totalWakeUpTime = j2;
    }

    public void setUpdated(int i) {
        this.updated = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "DBSleepDataStat{sleepDataStatId=" + this.sleepDataStatId + ", clientDataId='" + this.clientDataId + "', ssoid='" + this.ssoid + "', deviceUniqueId='" + this.deviceUniqueId + "', date=" + this.date + ", timezone='" + this.timezone + "', fallAsleep=" + this.fallAsleep + ", sleepOut=" + this.sleepOut + ", totalSleepTime=" + this.totalSleepTime + ", totalDeepSleepTime=" + this.totalDeepSleepTime + ", totalLightlySleepTime=" + this.totalLightlySleepTime + ", totalRemTime=" + this.totalRemTime + ", totalWakeUpTime=" + this.totalWakeUpTime + ", sleepScore=" + this.sleepScore + ", checkedSleepScore=" + this.checkedSleepScore + ", metadata='" + this.metadata + "', syncStatus=" + this.syncStatus + ", modifiedTimestamp=" + this.modifiedTimestamp + ", updated=" + this.updated + ", display=" + this.display + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.sleepDataStatId);
        parcel.writeString(this.clientDataId);
        parcel.writeString(this.ssoid);
        parcel.writeString(this.deviceUniqueId);
        parcel.writeInt(this.date);
        parcel.writeString(this.timezone);
        parcel.writeLong(this.fallAsleep);
        parcel.writeLong(this.sleepOut);
        parcel.writeLong(this.totalSleepTime);
        parcel.writeLong(this.totalDeepSleepTime);
        parcel.writeLong(this.totalLightlySleepTime);
        parcel.writeLong(this.totalRemTime);
        parcel.writeLong(this.totalWakeUpTime);
        parcel.writeValue(this.sleepScore);
        parcel.writeValue(this.checkedSleepScore);
        parcel.writeString(this.metadata);
        parcel.writeInt(this.syncStatus);
        parcel.writeLong(this.modifiedTimestamp);
        parcel.writeInt(this.updated);
        parcel.writeInt(this.display);
    }

    public DBSleepDataStat(Parcel parcel) {
        this.ssoid = "";
        this.deviceUniqueId = "";
        this.sleepDataStatId = parcel.readLong();
        this.clientDataId = parcel.readString();
        this.ssoid = parcel.readString();
        this.deviceUniqueId = parcel.readString();
        this.date = parcel.readInt();
        this.timezone = parcel.readString();
        this.fallAsleep = parcel.readLong();
        this.sleepOut = parcel.readLong();
        this.totalSleepTime = parcel.readLong();
        this.totalDeepSleepTime = parcel.readLong();
        this.totalLightlySleepTime = parcel.readLong();
        this.totalRemTime = parcel.readLong();
        this.totalWakeUpTime = parcel.readLong();
        this.sleepScore = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.checkedSleepScore = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.metadata = parcel.readString();
        this.syncStatus = parcel.readInt();
        this.modifiedTimestamp = parcel.readLong();
        this.updated = parcel.readInt();
        this.display = parcel.readInt();
    }
}
