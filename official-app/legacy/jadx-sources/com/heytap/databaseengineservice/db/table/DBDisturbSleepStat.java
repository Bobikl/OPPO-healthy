package com.heytap.databaseengineservice.db.table;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import com.heytap.databaseengine.model.SportHealthData;

/* JADX INFO: loaded from: classes15.dex */
@Entity(primaryKeys = {"ssoid", "package_name", "date"}, tableName = "DBDisturbSleepStat")
@Keep
public class DBDisturbSleepStat extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<DBDisturbSleepStat> CREATOR = new a();

    @ColumnInfo(name = "app_name")
    private String appName;

    @ColumnInfo(name = "date")
    private int date;

    @ColumnInfo(name = "lunch_count")
    private int lunchCount;

    @ColumnInfo(name = "modified_timestamp")
    private long modifiedTimestamp;

    @NonNull
    @ColumnInfo(name = "package_name")
    private String packageName;

    @NonNull
    @ColumnInfo(name = "ssoid")
    private String ssoid;

    @ColumnInfo(name = "sync_status")
    private int syncStatus;

    @ColumnInfo(name = "timezone")
    private String timezone;

    @ColumnInfo(name = "use_time")
    private long totalDuration;

    public class a implements Parcelable.Creator<DBDisturbSleepStat> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DBDisturbSleepStat createFromParcel(Parcel parcel) {
            return new DBDisturbSleepStat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DBDisturbSleepStat[] newArray(int i) {
            return new DBDisturbSleepStat[i];
        }
    }

    public DBDisturbSleepStat() {
    }

    public static String createDisturbSleepStatTable() {
        return "create table if not exists DBDisturbSleepStat(ssoid TEXT not null,package_name TEXT not null,app_name TEXT,date INTEGER not null,timezone TEXT,use_time INTEGER not null,lunch_count INTEGER not null,sync_status INTEGER not null,modified_timestamp INTEGER not null,primary key(ssoid,package_name,date))";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAppName() {
        return this.appName;
    }

    public int getDate() {
        return this.date;
    }

    public int getLunchCount() {
        return this.lunchCount;
    }

    public long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    @NonNull
    public String getPackageName() {
        return this.packageName;
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

    public long getTotalDuration() {
        return this.totalDuration;
    }

    public void setAppName(String str) {
        this.appName = str;
    }

    public void setDate(int i) {
        this.date = i;
    }

    public void setLunchCount(int i) {
        this.lunchCount = i;
    }

    public void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
    }

    public void setPackageName(@NonNull String str) {
        this.packageName = str;
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

    public void setTotalDuration(long j2) {
        this.totalDuration = j2;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "DBDisturbSleepStat{ssoid='" + this.ssoid + "', packageName='" + this.packageName + "', appName='" + this.appName + "', totalDuration=" + this.totalDuration + ", lunchCount=" + this.lunchCount + ", date=" + this.date + ", timezone='" + this.timezone + "', syncStatus=" + this.syncStatus + ", modifiedTimestamp=" + this.modifiedTimestamp + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ssoid);
        parcel.writeString(this.packageName);
        parcel.writeString(this.appName);
        parcel.writeLong(this.totalDuration);
        parcel.writeInt(this.lunchCount);
        parcel.writeInt(this.date);
        parcel.writeString(this.timezone);
        parcel.writeInt(this.syncStatus);
        parcel.writeLong(this.modifiedTimestamp);
    }

    public DBDisturbSleepStat(Parcel parcel) {
        this.ssoid = parcel.readString();
        this.packageName = parcel.readString();
        this.appName = parcel.readString();
        this.totalDuration = parcel.readLong();
        this.lunchCount = parcel.readInt();
        this.date = parcel.readInt();
        this.timezone = parcel.readString();
        this.syncStatus = parcel.readInt();
        this.modifiedTimestamp = parcel.readLong();
    }
}
