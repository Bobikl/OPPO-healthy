package com.heytap.databaseengineservice.db.table;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.databaseengineservice.db.table.sportrecord.DBSportMetadata;
import com.heytap.databaseengineservice.db.table.sunshine.DBSunshineStat;
import java.util.Objects;

/* JADX INFO: loaded from: classes15.dex */
@Entity(primaryKeys = {"ssoid", "date"}, tableName = "DBHearingHealthStatTable")
@Keep
public class DBHearingHealthStat extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<DBHearingHealthStat> CREATOR = new a();

    @ColumnInfo(name = "average_value")
    private double averageValue;

    @ColumnInfo(name = "date")
    private int date;

    @ColumnInfo(name = DBAssessmentRecord.DEVICE_UNIQUE_ID)
    private String deviceUniqueId;

    @ColumnInfo(name = "exposure")
    private double exposure;

    @ColumnInfo(name = DBSportMetadata.EXTENSION)
    private String extension;

    @ColumnInfo(name = "max_value")
    private double maxValue;

    @ColumnInfo(name = "min_value")
    private double minValue;

    @ColumnInfo(name = "modified_timestamp")
    private long modifiedTimestamp;

    @NonNull
    @ColumnInfo(name = "ssoid")
    private String ssoid;

    @ColumnInfo(name = "sync_status")
    private int syncStatus;

    @ColumnInfo(name = "timezone")
    private String timezone;

    @ColumnInfo(name = DBSunshineStat.TOTAL_DURATION)
    private long totalDuration;

    @ColumnInfo(name = "updated")
    private int updated;

    public class a implements Parcelable.Creator<DBHearingHealthStat> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DBHearingHealthStat createFromParcel(Parcel parcel) {
            return new DBHearingHealthStat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DBHearingHealthStat[] newArray(int i) {
            return new DBHearingHealthStat[i];
        }
    }

    public DBHearingHealthStat() {
        this.ssoid = "";
    }

    public static String createTableSQL() {
        return "create table if not exists DBHearingHealthStatTable(ssoid TEXT not null,device_unique_id TEXT,date INTEGER not null,timezone TEXT,max_value REAL not null,min_value REAL not null,average_value REAL not null,exposure REAL not null,total_duration INTEGER not null,extension TEXT,sync_status INTEGER not null,modified_timestamp INTEGER not null,updated INTEGER not null,primary key(ssoid,date))";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public double getAverageValue() {
        return this.averageValue;
    }

    public int getDate() {
        return this.date;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    public double getExposure() {
        return this.exposure;
    }

    public String getExtension() {
        return this.extension;
    }

    public double getMaxValue() {
        return this.maxValue;
    }

    public double getMinValue() {
        return this.minValue;
    }

    public long getModifiedTimestamp() {
        return this.modifiedTimestamp;
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

    public int getUpdated() {
        return this.updated;
    }

    public void setAverageValue(double d) {
        this.averageValue = d;
    }

    public void setDate(int i) {
        this.date = i;
    }

    public void setDeviceUniqueId(String str) {
        this.deviceUniqueId = str;
    }

    public void setExposure(double d) {
        this.exposure = d;
    }

    public void setExtension(String str) {
        this.extension = str;
    }

    public void setMaxValue(double d) {
        this.maxValue = d;
    }

    public void setMinValue(double d) {
        this.minValue = d;
    }

    public void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
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

    public void setUpdated(int i) {
        this.updated = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "DBHearingHealthStat{ssoid='" + this.ssoid + "', deviceUniqueId='" + this.deviceUniqueId + "', date=" + this.date + ", timezone='" + this.timezone + "', maxValue=" + this.maxValue + ", minValue=" + this.minValue + ", averageValue=" + this.averageValue + ", exposure=" + this.exposure + ", totalDuration=" + this.totalDuration + ", extension='" + this.extension + "', syncStatus=" + this.syncStatus + ", modifiedTimestamp=" + this.modifiedTimestamp + ", updated=" + this.updated + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ssoid);
        parcel.writeString(this.deviceUniqueId);
        parcel.writeInt(this.date);
        parcel.writeString(this.timezone);
        parcel.writeDouble(this.maxValue);
        parcel.writeDouble(this.minValue);
        parcel.writeDouble(this.averageValue);
        parcel.writeDouble(this.exposure);
        parcel.writeLong(this.totalDuration);
        parcel.writeString(this.extension);
        parcel.writeInt(this.syncStatus);
        parcel.writeLong(this.modifiedTimestamp);
        parcel.writeInt(this.updated);
    }

    public DBHearingHealthStat(Parcel parcel) {
        this.ssoid = "";
        String string = parcel.readString();
        Objects.requireNonNull(string);
        this.ssoid = string;
        this.deviceUniqueId = parcel.readString();
        this.date = parcel.readInt();
        this.timezone = parcel.readString();
        this.maxValue = parcel.readDouble();
        this.minValue = parcel.readDouble();
        this.averageValue = parcel.readDouble();
        this.exposure = parcel.readDouble();
        this.totalDuration = parcel.readLong();
        this.extension = parcel.readString();
        this.syncStatus = parcel.readInt();
        this.modifiedTimestamp = parcel.readLong();
        this.updated = parcel.readInt();
    }
}
