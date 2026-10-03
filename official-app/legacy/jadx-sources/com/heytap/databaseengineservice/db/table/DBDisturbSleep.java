package com.heytap.databaseengineservice.db.table;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import com.heytap.databaseengine.model.SportHealthData;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Entity(primaryKeys = {"ssoid", "package_name", "start_timestamp"}, tableName = "DBDisturbSleep")
@Keep
public class DBDisturbSleep extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<DBDisturbSleep> CREATOR = new a();

    @ColumnInfo(name = "app_name")
    private String appName;

    @ColumnInfo(name = "modified_timestamp")
    private long modifiedTimestamp;

    @NonNull
    @ColumnInfo(name = "package_name")
    private String packageName;

    @NonNull
    @ColumnInfo(name = "ssoid")
    private String ssoid;

    @ColumnInfo(name = "start_timestamp")
    private long startTimestamp;

    @ColumnInfo(name = "sync_status")
    private int syncStatus;

    @ColumnInfo(name = "use_time")
    private int useTime;

    public class a implements Parcelable.Creator<DBDisturbSleep> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DBDisturbSleep createFromParcel(Parcel parcel) {
            return new DBDisturbSleep(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DBDisturbSleep[] newArray(int i) {
            return new DBDisturbSleep[i];
        }
    }

    public DBDisturbSleep() {
        this.ssoid = "";
        this.packageName = "";
    }

    public static String createDisturbSleepTable() {
        return "create table if not exists DBDisturbSleep(ssoid TEXT not null,package_name TEXT not null,start_timestamp INTEGER not null,use_time INTEGER not null,sync_status INTEGER not null,modified_timestamp INTEGER not null,primary key(ssoid,package_name,start_timestamp))";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NonNull
    public String getAppName() {
        return this.appName;
    }

    public long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    @NotNull
    public String getPackageName() {
        return this.packageName;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
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

    public int getUseTime() {
        return this.useTime;
    }

    public void setAppName(@NonNull String str) {
        this.appName = str;
    }

    public void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
    }

    public void setPackageName(@NotNull String str) {
        this.packageName = str;
    }

    public void setSsoid(@NotNull String str) {
        this.ssoid = str;
    }

    public void setStartTimestamp(long j2) {
        this.startTimestamp = j2;
    }

    public void setSyncStatus(int i) {
        this.syncStatus = i;
    }

    public void setUseTime(int i) {
        this.useTime = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "DBDisturbSleep{, packageName='" + this.packageName + "', appName='" + this.appName + "', startTimestamp=" + this.startTimestamp + ", useTime=" + this.useTime + ", syncStatus=" + this.syncStatus + ", modifiedTimestamp=" + this.modifiedTimestamp + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ssoid);
        parcel.writeString(this.packageName);
        parcel.writeString(this.appName);
        parcel.writeLong(this.startTimestamp);
        parcel.writeInt(this.useTime);
        parcel.writeInt(this.syncStatus);
        parcel.writeLong(this.modifiedTimestamp);
    }

    public DBDisturbSleep(Parcel parcel) {
        this.ssoid = "";
        this.packageName = "";
        this.ssoid = parcel.readString();
        this.packageName = parcel.readString();
        this.appName = parcel.readString();
        this.startTimestamp = parcel.readLong();
        this.useTime = parcel.readInt();
        this.syncStatus = parcel.readInt();
        this.modifiedTimestamp = parcel.readLong();
    }
}
