package com.heytap.databaseengineservice.db.table.snore;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.coloros.sceneservice.l.c;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.databaseengineservice.db.table.sportrecord.DBSportMetadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Entity(primaryKeys = {"ssoid", "date", "version"}, tableName = "DBOsaResult")
@Keep
public class DBOsaResult extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<DBOsaResult> CREATOR = new a();

    @ColumnInfo(name = "ahi")
    private Float ahi;

    @ColumnInfo(name = "date")
    private int date;

    @ColumnInfo(name = DBSportMetadata.EXTENSION)
    private String extension;

    @ColumnInfo(name = "first_hrv_time")
    private long firstHrvTime;

    @ColumnInfo(name = "first_sleep_time")
    private long firstSleepTime;

    @ColumnInfo(name = "first_snore_info_time")
    private long firstSnoreInfoTime;

    @ColumnInfo(name = "first_spo2_time")
    private long firstSpo2Time;

    @ColumnInfo(name = c.Mc)
    private int fromType;

    @ColumnInfo(name = "invalid_spo2_ratio")
    private int invalidSpo2Ratio;

    @ColumnInfo(name = "last_hrv_time")
    private long lastHrvTime;

    @ColumnInfo(name = "last_sleep_time")
    private long lastSleepTime;

    @ColumnInfo(name = "last_snore_info_time")
    private long lastSnoreInfoTime;

    @ColumnInfo(name = "last_spo2_time")
    private long lastSpo2Time;

    @ColumnInfo(name = "modified_timestamp")
    private long modifiedTimestamp;

    @ColumnInfo(name = "osa_feature")
    private String osaFeature;

    @ColumnInfo(name = "osa_level")
    private byte osaLevel;

    @ColumnInfo(name = "record_time_interval")
    private String recordTimeInterval;

    @ColumnInfo(name = DBSnoreOsaSummarize.SILENCED_RATIO)
    private int silencedRatio;

    @ColumnInfo(name = DBSnoreOsaSummarize.SILENCED_TIME)
    private int silencedTime;

    @ColumnInfo(name = "sleep_breath_type")
    private int sleepBreathType;

    @ColumnInfo(name = "snore_file_id_list")
    private String snoreFileDataIdList;

    @ColumnInfo(name = "snore_ratio")
    private int snoreRatio;

    @ColumnInfo(name = "snore_result_bean")
    private String snoreResultBean;

    @NonNull
    @ColumnInfo(name = "ssoid")
    private String ssoid;

    @ColumnInfo(name = "sync_status")
    private int syncStatus;

    @ColumnInfo(name = "timezone")
    private String timezone;

    @ColumnInfo(name = "typical_fragment")
    private String typicalFragmentBeanList;

    @ColumnInfo(name = "typical_fragment_num")
    private byte typicalFragmentNum;

    @ColumnInfo(name = "updated")
    private int updated;

    @ColumnInfo(name = "version")
    private int version;

    public class a implements Parcelable.Creator<DBOsaResult> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DBOsaResult createFromParcel(Parcel parcel) {
            return new DBOsaResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DBOsaResult[] newArray(int i) {
            return new DBOsaResult[i];
        }
    }

    public DBOsaResult() {
        this.ssoid = "";
    }

    public static void changePrimaryKey(SupportSQLiteDatabase supportSQLiteDatabase) {
        supportSQLiteDatabase.execSQL("create table if not exists DBOsaResult_copy(ssoid TEXT not null,date INTEGER not null,timezone TEXT,first_sleep_time INTEGER not null,last_sleep_time INTEGER not null,first_spo2_time INTEGER not null,last_spo2_time INTEGER not null,first_hrv_time INTEGER not null,last_hrv_time INTEGER not null,first_snore_info_time INTEGER not null,last_snore_info_time INTEGER not null,osa_level INTEGER not null,snore_result_bean TEXT,typical_fragment TEXT,typical_fragment_num INTEGER not null,sleep_breath_type INTEGER not null,invalid_spo2_ratio INTEGER not null,extension TEXT,sync_status INTEGER not null,modified_timestamp INTEGER not null,updated INTEGER not null,version INTEGER not null,snore_file_id_list TEXT,record_time_interval TEXT,osa_feature TEXT,snore_ratio INTEGER not null,ahi REAL,from_type INTEGER not null,silenced_ratio INTEGER not null,silenced_time INTEGER not null,primary key(ssoid, date, version))");
        StringBuilder sb = new StringBuilder();
        sb.append("INSERT INTO ");
        sb.append("DBOsaResult_copy");
        sb.append(" (");
        sb.append(params());
        sb.append(") SELECT ");
        sb.append(params());
        sb.append(" FROM DBOsaResult");
        sb.append(" ORDER BY ");
        sb.append("date asc;");
        supportSQLiteDatabase.execSQL(sb.toString());
        supportSQLiteDatabase.execSQL("DROP TABLE DBOsaResult;");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ALTER TABLE ");
        sb2.append("DBOsaResult_copy");
        sb2.append(" RENAME TO DBOsaResult;");
        supportSQLiteDatabase.execSQL(sb2.toString());
    }

    public static String createOsaResultTableSQL() {
        return "create table if not exists DBOsaResult (ssoid TEXT not null,date INTEGER not null,timezone TEXT,first_sleep_time INTEGER not null,last_sleep_time INTEGER not null,first_spo2_time INTEGER not null,last_spo2_time INTEGER not null,first_hrv_time INTEGER not null,last_hrv_time INTEGER not null,first_snore_info_time INTEGER not null,last_snore_info_time INTEGER not null,osa_level INTEGER not null,snore_result_bean TEXT,typical_fragment TEXT,typical_fragment_num INTEGER not null,sleep_breath_type INTEGER not null,invalid_spo2_ratio INTEGER not null,extension TEXT,sync_status INTEGER not null,modified_timestamp INTEGER not null,updated INTEGER not null,version INTEGER not null,snore_file_id_list TEXT,primary key(ssoid,date))";
    }

    private static String params() {
        return "ssoid,date,timezone,first_sleep_time,last_sleep_time,first_spo2_time,last_spo2_time,first_hrv_time,last_hrv_time,first_snore_info_time,last_snore_info_time,osa_level,snore_result_bean,typical_fragment,typical_fragment_num,sleep_breath_type,invalid_spo2_ratio,extension,sync_status,modified_timestamp,updated,version,snore_file_id_list,record_time_interval,osa_feature,snore_ratio,ahi,from_type,silenced_ratio," + DBSnoreOsaSummarize.SILENCED_TIME;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Float getAhi() {
        return this.ahi;
    }

    public int getDate() {
        return this.date;
    }

    public String getExtension() {
        return this.extension;
    }

    public long getFirstHrvTime() {
        return this.firstHrvTime;
    }

    public long getFirstSleepTime() {
        return this.firstSleepTime;
    }

    public long getFirstSnoreInfoTime() {
        return this.firstSnoreInfoTime;
    }

    public long getFirstSpo2Time() {
        return this.firstSpo2Time;
    }

    public int getFromType() {
        return this.fromType;
    }

    public int getInvalidSpo2Ratio() {
        return this.invalidSpo2Ratio;
    }

    public long getLastHrvTime() {
        return this.lastHrvTime;
    }

    public long getLastSleepTime() {
        return this.lastSleepTime;
    }

    public long getLastSnoreInfoTime() {
        return this.lastSnoreInfoTime;
    }

    public long getLastSpo2Time() {
        return this.lastSpo2Time;
    }

    public long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    public String getOsaFeature() {
        return this.osaFeature;
    }

    public byte getOsaLevel() {
        return this.osaLevel;
    }

    public String getRecordTimeInterval() {
        return this.recordTimeInterval;
    }

    public int getSilencedRatio() {
        return this.silencedRatio;
    }

    public int getSilencedTime() {
        return this.silencedTime;
    }

    public int getSleepBreathType() {
        return this.sleepBreathType;
    }

    public String getSnoreFileDataIdList() {
        return this.snoreFileDataIdList;
    }

    public int getSnoreRatio() {
        return this.snoreRatio;
    }

    public String getSnoreResultBean() {
        return this.snoreResultBean;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String getSsoid() {
        return this.ssoid;
    }

    public int getSyncStatus() {
        return this.syncStatus;
    }

    public String getTimezone() {
        return this.timezone;
    }

    public String getTypicalFragmentBeanList() {
        return this.typicalFragmentBeanList;
    }

    public byte getTypicalFragmentNum() {
        return this.typicalFragmentNum;
    }

    public int getUpdated() {
        return this.updated;
    }

    public int getVersion() {
        return this.version;
    }

    public void setAhi(Float f) {
        this.ahi = f;
    }

    public void setDate(int i) {
        this.date = i;
    }

    public void setExtension(String str) {
        this.extension = str;
    }

    public void setFirstHrvTime(long j2) {
        this.firstHrvTime = j2;
    }

    public void setFirstSleepTime(long j2) {
        this.firstSleepTime = j2;
    }

    public void setFirstSnoreInfoTime(long j2) {
        this.firstSnoreInfoTime = j2;
    }

    public void setFirstSpo2Time(long j2) {
        this.firstSpo2Time = j2;
    }

    public void setFromType(int i) {
        this.fromType = i;
    }

    public void setInvalidSpo2Ratio(int i) {
        this.invalidSpo2Ratio = i;
    }

    public void setLastHrvTime(long j2) {
        this.lastHrvTime = j2;
    }

    public void setLastSleepTime(long j2) {
        this.lastSleepTime = j2;
    }

    public void setLastSnoreInfoTime(long j2) {
        this.lastSnoreInfoTime = j2;
    }

    public void setLastSpo2Time(long j2) {
        this.lastSpo2Time = j2;
    }

    public void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
    }

    public void setOsaFeature(String str) {
        this.osaFeature = str;
    }

    public void setOsaLevel(byte b) {
        this.osaLevel = b;
    }

    public void setRecordTimeInterval(String str) {
        this.recordTimeInterval = str;
    }

    public void setSilencedRatio(int i) {
        this.silencedRatio = i;
    }

    public void setSilencedTime(int i) {
        this.silencedTime = i;
    }

    public void setSleepBreathType(int i) {
        this.sleepBreathType = i;
    }

    public void setSnoreFileDataIdList(String str) {
        this.snoreFileDataIdList = str;
    }

    public void setSnoreRatio(int i) {
        this.snoreRatio = i;
    }

    public void setSnoreResultBean(String str) {
        this.snoreResultBean = str;
    }

    public void setSsoid(@NotNull String str) {
        this.ssoid = str;
    }

    public void setSyncStatus(int i) {
        this.syncStatus = i;
    }

    public void setTimezone(String str) {
        this.timezone = str;
    }

    public void setTypicalFragmentBeanList(String str) {
        this.typicalFragmentBeanList = str;
    }

    public void setTypicalFragmentNum(byte b) {
        this.typicalFragmentNum = b;
    }

    public void setUpdated(int i) {
        this.updated = i;
    }

    public void setVersion(int i) {
        this.version = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "DBOsaResult{ssoid='" + this.ssoid + "', date=" + this.date + ", timezone='" + this.timezone + "', firstSleepTime=" + this.firstSleepTime + ", lastSleepTime=" + this.lastSleepTime + ", firstSpo2Time=" + this.firstSpo2Time + ", lastSpo2Time=" + this.lastSpo2Time + ", firstHrvTime=" + this.firstHrvTime + ", lastHrvTime=" + this.lastHrvTime + ", firstSnoreInfoTime=" + this.firstSnoreInfoTime + ", lastSnoreInfoTime=" + this.lastSnoreInfoTime + ", recordTimeInterval='" + this.recordTimeInterval + "', osaLevel=" + ((int) this.osaLevel) + ", fromType=" + this.fromType + ", snoreResultBean='" + this.snoreResultBean + "', typicalFragmentBeanList='" + this.typicalFragmentBeanList + "', typicalFragmentNum=" + ((int) this.typicalFragmentNum) + ", osaFeature=" + this.osaFeature + ", sleepBreathType=" + this.sleepBreathType + ", invalidSpo2Ratio=" + this.invalidSpo2Ratio + ", snoreRatio=" + this.snoreRatio + ", extension='" + this.extension + "', syncStatus=" + this.syncStatus + ", modifiedTimestamp=" + this.modifiedTimestamp + ", updated=" + this.updated + ", version=" + this.version + ", snoreFileDataIdList='" + this.snoreFileDataIdList + "', ahi=" + this.ahi + ", silencedRatio=" + this.silencedRatio + ", silencedTime=" + this.silencedTime + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ssoid);
        parcel.writeInt(this.date);
        parcel.writeString(this.timezone);
        parcel.writeLong(this.firstSleepTime);
        parcel.writeLong(this.lastSleepTime);
        parcel.writeLong(this.firstSpo2Time);
        parcel.writeLong(this.lastSpo2Time);
        parcel.writeLong(this.firstHrvTime);
        parcel.writeLong(this.lastHrvTime);
        parcel.writeLong(this.firstSnoreInfoTime);
        parcel.writeLong(this.lastSnoreInfoTime);
        parcel.writeString(this.recordTimeInterval);
        parcel.writeByte(this.osaLevel);
        parcel.writeString(this.snoreResultBean);
        parcel.writeString(this.typicalFragmentBeanList);
        parcel.writeByte(this.typicalFragmentNum);
        parcel.writeString(this.osaFeature);
        parcel.writeInt(this.sleepBreathType);
        parcel.writeInt(this.invalidSpo2Ratio);
        parcel.writeInt(this.snoreRatio);
        parcel.writeString(this.extension);
        parcel.writeInt(this.syncStatus);
        parcel.writeLong(this.modifiedTimestamp);
        parcel.writeInt(this.updated);
        parcel.writeInt(this.version);
        parcel.writeString(this.snoreFileDataIdList);
        parcel.writeValue(this.ahi);
        parcel.writeInt(this.fromType);
        parcel.writeInt(this.silencedRatio);
        parcel.writeInt(this.silencedTime);
    }

    public DBOsaResult(Parcel parcel) {
        this.ssoid = "";
        this.ssoid = parcel.readString();
        this.date = parcel.readInt();
        this.timezone = parcel.readString();
        this.firstSleepTime = parcel.readLong();
        this.lastSleepTime = parcel.readLong();
        this.firstSpo2Time = parcel.readLong();
        this.lastSpo2Time = parcel.readLong();
        this.firstHrvTime = parcel.readLong();
        this.lastHrvTime = parcel.readLong();
        this.firstSnoreInfoTime = parcel.readLong();
        this.lastSnoreInfoTime = parcel.readLong();
        this.recordTimeInterval = parcel.readString();
        this.osaLevel = parcel.readByte();
        this.snoreResultBean = parcel.readString();
        this.typicalFragmentBeanList = parcel.readString();
        this.typicalFragmentNum = parcel.readByte();
        this.osaFeature = parcel.readString();
        this.sleepBreathType = parcel.readInt();
        this.invalidSpo2Ratio = parcel.readInt();
        this.snoreRatio = parcel.readInt();
        this.extension = parcel.readString();
        this.syncStatus = parcel.readInt();
        this.modifiedTimestamp = parcel.readLong();
        this.updated = parcel.readInt();
        this.version = parcel.readInt();
        this.snoreFileDataIdList = parcel.readString();
        this.ahi = (Float) parcel.readValue(Float.class.getClassLoader());
        this.fromType = parcel.readInt();
        this.silencedRatio = parcel.readInt();
        this.silencedTime = parcel.readInt();
    }
}
