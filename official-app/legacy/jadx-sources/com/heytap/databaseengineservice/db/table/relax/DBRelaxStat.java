package com.heytap.databaseengineservice.db.table.relax;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.databaseengineservice.db.table.sportrecord.DBSportMetadata;
import com.heytap.databaseengineservice.db.table.sunshine.DBSunshineStat;

/* JADX INFO: loaded from: classes15.dex */
@Entity(tableName = "DBRelaxStat")
@Keep
public class DBRelaxStat extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<DBRelaxStat> CREATOR = new a();

    @ColumnInfo(name = "date")
    private int date;

    @ColumnInfo(name = "display")
    private int display;

    @ColumnInfo(name = DBSportMetadata.EXTENSION)
    private String extension;

    @ColumnInfo(name = "modified_timestamp")
    private long modifiedTimestamp;

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "_id")
    private long relaxStatDataId;

    @NonNull
    @ColumnInfo(name = "ssoid")
    private String ssoid;

    @ColumnInfo(name = "sync_status")
    private int syncStatus;

    @ColumnInfo(name = "timezone")
    private String timezone;

    @ColumnInfo(name = "total_counts")
    private int totalCounts;

    @ColumnInfo(name = DBSunshineStat.TOTAL_DURATION)
    private long totalDuration;

    @ColumnInfo(name = "type")
    private int type;

    @ColumnInfo(name = "updated")
    private int updated;

    public class a implements Parcelable.Creator<DBRelaxStat> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DBRelaxStat createFromParcel(Parcel parcel) {
            return new DBRelaxStat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DBRelaxStat[] newArray(int i) {
            return new DBRelaxStat[i];
        }
    }

    public DBRelaxStat() {
        this.ssoid = "";
    }

    public static String createRelaxStatTableSQL() {
        return "create table if not exists DBRelaxStat(_id INTEGER primary key autoincrement not null,ssoid TEXT not null,date INTEGER not null,timezone TEXT,type INTEGER not null,total_duration INTEGER not null,total_counts INTEGER not null,extension TEXT,display INTEGER not null,sync_status INTEGER not null,modified_timestamp INTEGER not null,updated INTEGER not null)";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getDate() {
        return this.date;
    }

    public int getDisplay() {
        return this.display;
    }

    public String getExtension() {
        return this.extension;
    }

    public long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    public long getRelaxStatDataId() {
        return this.relaxStatDataId;
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

    public int getTotalCounts() {
        return this.totalCounts;
    }

    public long getTotalDuration() {
        return this.totalDuration;
    }

    public int getType() {
        return this.type;
    }

    public int getUpdated() {
        return this.updated;
    }

    public void setDate(int i) {
        this.date = i;
    }

    public void setDisplay(int i) {
        this.display = i;
    }

    public void setExtension(String str) {
        this.extension = str;
    }

    public void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
    }

    public void setRelaxStatDataId(long j2) {
        this.relaxStatDataId = j2;
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

    public void setTotalCounts(int i) {
        this.totalCounts = i;
    }

    public void setTotalDuration(long j2) {
        this.totalDuration = j2;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setUpdated(int i) {
        this.updated = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "DBRelaxStat{relaxStatDataId=" + this.relaxStatDataId + ", ssoid='" + this.ssoid + "', date=" + this.date + ", timezone='" + this.timezone + "', type=" + this.type + ", totalDuration=" + this.totalDuration + ", totalCounts=" + this.totalCounts + ", extension='" + this.extension + "', display=" + this.display + ", syncStatus=" + this.syncStatus + ", modifiedTimestamp=" + this.modifiedTimestamp + ", updated=" + this.updated + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ssoid);
        parcel.writeInt(this.date);
        parcel.writeString(this.timezone);
        parcel.writeInt(this.type);
        parcel.writeLong(this.totalDuration);
        parcel.writeInt(this.totalCounts);
        parcel.writeString(this.extension);
        parcel.writeInt(this.display);
        parcel.writeInt(this.syncStatus);
        parcel.writeLong(this.modifiedTimestamp);
        parcel.writeInt(this.updated);
    }

    public DBRelaxStat(Parcel parcel) {
        this.ssoid = "";
        this.ssoid = parcel.readString();
        this.date = parcel.readInt();
        this.timezone = parcel.readString();
        this.type = parcel.readInt();
        this.totalDuration = parcel.readLong();
        this.totalCounts = parcel.readInt();
        this.extension = parcel.readString();
        this.display = parcel.readInt();
        this.syncStatus = parcel.readInt();
        this.modifiedTimestamp = parcel.readLong();
        this.updated = parcel.readInt();
    }
}
