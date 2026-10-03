package com.heytap.databaseengineservice.db.table;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.databaseengineservice.db.table.sportrecord.DBSportMetadata;
import com.heytap.databaseengineservice.db.table.sunshine.DBSunshineStat;

/* JADX INFO: loaded from: classes15.dex */
@Entity(tableName = DBOneTimeSportStat.TABLE_NAME)
@Keep
public class DBOneTimeSportStat extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<DBOneTimeSportStat> CREATOR = new a();
    public static final String TABLE_NAME = "DBOneTimeSportStat";

    @ColumnInfo(name = "british_fastest_pace")
    private short britishFastestPace;

    @ColumnInfo(name = DBSportMetadata.CLIENT_DATA_ID)
    private String clientDataId;

    @ColumnInfo(name = "date")
    private int date;

    @ColumnInfo(name = DBAssessmentRecord.DEVICE_UNIQUE_ID)
    private String deviceUniqueId;

    @ColumnInfo(name = "display")
    private int display;

    @ColumnInfo(name = "end_time")
    private long endTimestamp;

    @ColumnInfo(name = "fastest_pace")
    private short fastestPace;

    @ColumnInfo(name = "longest_distance")
    private int longestDistance;

    @ColumnInfo(name = "max_duration")
    private long maxDuration;

    @ColumnInfo(name = "modified_time")
    private long modifiedTime;

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "_id")
    private long oneTimeSportStatId;

    @ColumnInfo(name = "ox_max")
    private int oxMax;

    @ColumnInfo(name = "sport_mode")
    private int sportMode;

    @ColumnInfo(name = "ssoid")
    private String ssoid;

    @ColumnInfo(name = "start_time")
    private long startTimestamp;

    @ColumnInfo(name = "sync_status")
    private int syncStatus;

    @ColumnInfo(name = "timezone")
    private String timezone;

    @ColumnInfo(name = "total_abnormal_counts")
    private int totalAbnormalCounts;

    @ColumnInfo(name = "total_altitude_offset")
    private long totalAltitudeOffset;

    @ColumnInfo(name = "total_calories")
    private long totalCalories;

    @ColumnInfo(name = "total_counts")
    private int totalCounts;

    @ColumnInfo(name = "total_distance")
    private long totalDistance;

    @ColumnInfo(name = DBSunshineStat.TOTAL_DURATION)
    private long totalDuration;

    @ColumnInfo(name = "total_steps")
    private long totalSteps;

    @ColumnInfo(name = "updated")
    private int updated;

    public class a implements Parcelable.Creator<DBOneTimeSportStat> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DBOneTimeSportStat createFromParcel(Parcel parcel) {
            return new DBOneTimeSportStat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DBOneTimeSportStat[] newArray(int i) {
            return new DBOneTimeSportStat[i];
        }
    }

    public DBOneTimeSportStat() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public short getBritishFastestPace() {
        return this.britishFastestPace;
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

    public int getDisplay() {
        return this.display;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public long getEndTimestamp() {
        return this.endTimestamp;
    }

    public short getFastestPace() {
        return this.fastestPace;
    }

    public int getLongestDistance() {
        return this.longestDistance;
    }

    public long getMaxDuration() {
        return this.maxDuration;
    }

    public long getModifiedTime() {
        return this.modifiedTime;
    }

    public long getOneTimeSportStatId() {
        return this.oneTimeSportStatId;
    }

    public int getOxMax() {
        return this.oxMax;
    }

    public int getSportMode() {
        return this.sportMode;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
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

    public String getTimezone() {
        return this.timezone;
    }

    public int getTotalAbnormalCounts() {
        return this.totalAbnormalCounts;
    }

    public long getTotalAltitudeOffset() {
        return this.totalAltitudeOffset;
    }

    public long getTotalCalories() {
        return this.totalCalories;
    }

    public int getTotalCounts() {
        return this.totalCounts;
    }

    public long getTotalDistance() {
        return this.totalDistance;
    }

    public long getTotalDuration() {
        return this.totalDuration;
    }

    public long getTotalSteps() {
        return this.totalSteps;
    }

    public int getUpdated() {
        return this.updated;
    }

    public void setBritishFastestPace(short s) {
        this.britishFastestPace = s;
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

    public void setDisplay(int i) {
        this.display = i;
    }

    public void setEndTimestamp(long j2) {
        this.endTimestamp = j2;
    }

    public void setFastestPace(short s) {
        this.fastestPace = s;
    }

    public void setLongestDistance(int i) {
        this.longestDistance = i;
    }

    public void setMaxDuration(long j2) {
        this.maxDuration = j2;
    }

    public void setModifiedTime(long j2) {
        this.modifiedTime = j2;
    }

    public void setOneTimeSportStatId(long j2) {
        this.oneTimeSportStatId = j2;
    }

    public void setOxMax(int i) {
        this.oxMax = i;
    }

    public void setSportMode(int i) {
        this.sportMode = i;
    }

    public void setSsoid(String str) {
        this.ssoid = str;
    }

    public void setStartTimestamp(long j2) {
        this.startTimestamp = j2;
    }

    public void setSyncStatus(int i) {
        this.syncStatus = i;
    }

    public void setTimezone(String str) {
        this.timezone = str;
    }

    public void setTotalAbnormalCounts(int i) {
        this.totalAbnormalCounts = i;
    }

    public void setTotalAltitudeOffset(long j2) {
        this.totalAltitudeOffset = j2;
    }

    public void setTotalCalories(long j2) {
        this.totalCalories = j2;
    }

    public void setTotalCounts(int i) {
        this.totalCounts = i;
    }

    public void setTotalDistance(long j2) {
        this.totalDistance = j2;
    }

    public void setTotalDuration(long j2) {
        this.totalDuration = j2;
    }

    public void setTotalSteps(long j2) {
        this.totalSteps = j2;
    }

    public void setUpdated(int i) {
        this.updated = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "DBOneTimeSportStat{oneTimeSportStatId=" + this.oneTimeSportStatId + ", clientDataId='" + this.clientDataId + "', ssoid='" + this.ssoid + "', deviceUniqueId='" + this.deviceUniqueId + "', startTimestamp=" + this.startTimestamp + ", endTimestamp=" + this.endTimestamp + ", date=" + this.date + ", sportMode=" + this.sportMode + ", totalSteps=" + this.totalSteps + ", totalDistance=" + this.totalDistance + ", totalCalories=" + this.totalCalories + ", totalDuration=" + this.totalDuration + ", maxDuration=" + this.maxDuration + ", totalAltitudeOffset=" + this.totalAltitudeOffset + ", totalCounts=" + this.totalCounts + ", totalAbnormalCounts=" + this.totalAbnormalCounts + ", fastestPace=" + ((int) this.fastestPace) + ", longestDistance=" + this.longestDistance + ", oxMax=" + this.oxMax + ", britishFastestPace=" + ((int) this.britishFastestPace) + ", display=" + this.display + ", syncStatus=" + this.syncStatus + ", timezone='" + this.timezone + "', modifiedTime=" + this.modifiedTime + ", updated=" + this.updated + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.clientDataId);
        parcel.writeString(this.ssoid);
        parcel.writeString(this.deviceUniqueId);
        parcel.writeLong(this.startTimestamp);
        parcel.writeLong(this.endTimestamp);
        parcel.writeInt(this.date);
        parcel.writeInt(this.sportMode);
        parcel.writeLong(this.totalSteps);
        parcel.writeLong(this.totalDistance);
        parcel.writeLong(this.totalCalories);
        parcel.writeLong(this.totalDuration);
        parcel.writeLong(this.maxDuration);
        parcel.writeLong(this.totalAltitudeOffset);
        parcel.writeInt(this.totalCounts);
        parcel.writeInt(this.totalAbnormalCounts);
        parcel.writeInt(this.fastestPace);
        parcel.writeInt(this.longestDistance);
        parcel.writeInt(this.oxMax);
        parcel.writeInt(this.britishFastestPace);
        parcel.writeInt(this.display);
        parcel.writeInt(this.syncStatus);
        parcel.writeString(this.timezone);
        parcel.writeLong(this.modifiedTime);
        parcel.writeInt(this.updated);
    }

    public DBOneTimeSportStat(Parcel parcel) {
        this.clientDataId = parcel.readString();
        this.ssoid = parcel.readString();
        this.deviceUniqueId = parcel.readString();
        this.startTimestamp = parcel.readLong();
        this.endTimestamp = parcel.readLong();
        this.date = parcel.readInt();
        this.sportMode = parcel.readInt();
        this.totalSteps = parcel.readLong();
        this.totalDistance = parcel.readLong();
        this.totalCalories = parcel.readLong();
        this.totalDuration = parcel.readLong();
        this.maxDuration = parcel.readLong();
        this.totalAltitudeOffset = parcel.readLong();
        this.totalCounts = parcel.readInt();
        this.totalAbnormalCounts = parcel.readInt();
        this.fastestPace = (short) parcel.readInt();
        this.longestDistance = parcel.readInt();
        this.oxMax = parcel.readInt();
        this.britishFastestPace = (short) parcel.readInt();
        this.display = parcel.readInt();
        this.syncStatus = parcel.readInt();
        this.timezone = parcel.readString();
        this.modifiedTime = parcel.readLong();
        this.updated = parcel.readInt();
    }
}
