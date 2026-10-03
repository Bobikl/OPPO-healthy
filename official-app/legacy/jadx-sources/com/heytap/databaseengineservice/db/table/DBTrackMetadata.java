package com.heytap.databaseengineservice.db.table;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import com.heytap.databaseengine.apiv3.data.Element;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.databaseengineservice.db.table.newsleep.DBSleepHeartRateStat;
import com.heytap.databaseengineservice.db.table.sportrecord.DBSportMetadata;

/* JADX INFO: loaded from: classes15.dex */
@Entity(primaryKeys = {DBSportMetadata.CLIENT_DATA_ID, "ssoid", "start_timestamp", "end_timestamp", DBAssessmentRecord.DEVICE_UNIQUE_ID, "sport_mode"}, tableName = "DBTrackMetadata")
@Keep
public class DBTrackMetadata extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<DBTrackMetadata> CREATOR = new a();

    @ColumnInfo(name = DBSportMetadata.ABNORMAL_TRACK)
    private int abnormalTrack;

    @ColumnInfo(name = "avg_hr")
    private int avgHR;

    @ColumnInfo(name = "avg_pace")
    private int avgPace;

    @ColumnInfo(name = "avg_step_rate")
    private int avgStepRate;

    @ColumnInfo(name = Element.ELEMENT_NAME_BEST_PACE)
    private int bestPace;

    @ColumnInfo(name = "best_step_rate")
    private int bestStepRate;

    @NonNull
    @ColumnInfo(name = DBSportMetadata.CLIENT_DATA_ID)
    private String clientDataId;

    @ColumnInfo(name = "date")
    private int date;

    @NonNull
    @ColumnInfo(name = Element.ELEMENT_NAME_DEVICE_CATEGORY)
    private String deviceCategory;

    @NonNull
    @ColumnInfo(name = DBAssessmentRecord.DEVICE_UNIQUE_ID)
    private String deviceUniqueId;

    @ColumnInfo(name = "end_timestamp")
    private long endTimestamp;

    @ColumnInfo(name = DBSportMetadata.EXTENSION)
    private String extension;

    @ColumnInfo(name = DBSleepHeartRateStat.MAX_HEART_RATE)
    private int maxHR;

    @ColumnInfo(name = "max_vo2")
    private float maxVo2;

    @ColumnInfo(name = DBSleepHeartRateStat.MIN_HEART_RATE)
    private int minHR;

    @ColumnInfo(name = "run_extra")
    private String runExtra;

    @ColumnInfo(name = "sport_mode")
    private int sportMode;

    @ColumnInfo(name = DBSportMetadata.SPORT_NAME)
    private String sportName;

    @NonNull
    @ColumnInfo(name = "ssoid")
    private String ssoid;

    @ColumnInfo(name = "start_timestamp")
    private long startTimestamp;

    @ColumnInfo(name = "timezone")
    private String timezone;

    @ColumnInfo(name = "total_calories")
    private long totalCalories;

    @ColumnInfo(name = "total_climb")
    private long totalClimb;

    @ColumnInfo(name = "total_distance")
    private long totalDistance;

    @ColumnInfo(name = "total_steps")
    private long totalSteps;

    @ColumnInfo(name = "total_time")
    private long totalTime;

    public class a implements Parcelable.Creator<DBTrackMetadata> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DBTrackMetadata createFromParcel(Parcel parcel) {
            return new DBTrackMetadata(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DBTrackMetadata[] newArray(int i) {
            return new DBTrackMetadata[i];
        }
    }

    public DBTrackMetadata() {
        this.ssoid = "";
        this.deviceUniqueId = "";
        this.deviceCategory = "";
        this.clientDataId = "";
    }

    public static String createTable() {
        return "create table if not exists DBTrackMetadata(avg_pace INTEGER not null,best_pace INTEGER not null,avg_hr INTEGER not null,max_hr INTEGER not null,min_hr INTEGER not null,avg_step_rate INTEGER not null,best_step_rate INTEGER not null,total_distance INTEGER not null,total_calories INTEGER not null,total_steps INTEGER not null,total_time INTEGER not null,total_climb INTEGER not null,sport_name TEXT,max_vo2 REAL not null,abnormal_track INTEGER not null,ssoid TEXT not null,sport_mode INTEGER not null,device_unique_id TEXT not null,device_category TEXT not null,start_timestamp INTEGER not null,end_timestamp INTEGER not null,client_data_id TEXT not null,date INTEGER not null,timezone TEXT,primary key(client_data_id, ssoid, start_timestamp, end_timestamp, device_unique_id, sport_mode))";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getAbnormalTrack() {
        return this.abnormalTrack;
    }

    public int getAvgHR() {
        return this.avgHR;
    }

    public int getAvgPace() {
        return this.avgPace;
    }

    public int getAvgStepRate() {
        return this.avgStepRate;
    }

    public int getBestPace() {
        return this.bestPace;
    }

    public int getBestStepRate() {
        return this.bestStepRate;
    }

    public String getClientDataId() {
        return this.clientDataId;
    }

    public int getDate() {
        return this.date;
    }

    public String getDeviceCategory() {
        return this.deviceCategory;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public long getEndTimestamp() {
        return this.endTimestamp;
    }

    public String getExtension() {
        return this.extension;
    }

    public int getMaxHR() {
        return this.maxHR;
    }

    public float getMaxVo2() {
        return this.maxVo2;
    }

    public int getMinHR() {
        return this.minHR;
    }

    public String getRunExtra() {
        return this.runExtra;
    }

    public int getSportMode() {
        return this.sportMode;
    }

    public String getSportName() {
        return this.sportName;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String getSsoid() {
        return this.ssoid;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public long getStartTimestamp() {
        return this.startTimestamp;
    }

    public String getTimezone() {
        return this.timezone;
    }

    public long getTotalCalories() {
        return this.totalCalories;
    }

    public long getTotalClimb() {
        return this.totalClimb;
    }

    public long getTotalDistance() {
        return this.totalDistance;
    }

    public long getTotalSteps() {
        return this.totalSteps;
    }

    public long getTotalTime() {
        return this.totalTime;
    }

    public void setAbnormalTrack(int i) {
        this.abnormalTrack = i;
    }

    public void setAvgHR(int i) {
        this.avgHR = i;
    }

    public void setAvgPace(int i) {
        this.avgPace = i;
    }

    public void setAvgStepRate(int i) {
        this.avgStepRate = i;
    }

    public void setBestPace(int i) {
        this.bestPace = i;
    }

    public void setBestStepRate(int i) {
        this.bestStepRate = i;
    }

    public void setClientDataId(String str) {
        this.clientDataId = str;
    }

    public void setDate(int i) {
        this.date = i;
    }

    public void setDeviceCategory(String str) {
        this.deviceCategory = str;
    }

    public void setDeviceUniqueId(String str) {
        this.deviceUniqueId = str;
    }

    public void setEndTimestamp(long j2) {
        this.endTimestamp = j2;
    }

    public void setExtension(String str) {
        this.extension = str;
    }

    public void setMaxHR(int i) {
        this.maxHR = i;
    }

    public void setMaxVo2(float f) {
        this.maxVo2 = f;
    }

    public void setMinHR(int i) {
        this.minHR = i;
    }

    public void setRunExtra(String str) {
        this.runExtra = str;
    }

    public void setSportMode(int i) {
        this.sportMode = i;
    }

    public void setSportName(String str) {
        this.sportName = str;
    }

    public void setSsoid(String str) {
        this.ssoid = str;
    }

    public void setStartTimestamp(long j2) {
        this.startTimestamp = j2;
    }

    public void setTimezone(String str) {
        this.timezone = str;
    }

    public void setTotalCalories(long j2) {
        this.totalCalories = j2;
    }

    public void setTotalClimb(long j2) {
        this.totalClimb = j2;
    }

    public void setTotalDistance(long j2) {
        this.totalDistance = j2;
    }

    public void setTotalSteps(long j2) {
        this.totalSteps = j2;
    }

    public void setTotalTime(long j2) {
        this.totalTime = j2;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "DBTrackMetadata{avgPace=" + this.avgPace + ", bestPace=" + this.bestPace + ", avgHR=" + this.avgHR + ", maxHR=" + this.maxHR + ", minHR=" + this.minHR + ", avgStepRate=" + this.avgStepRate + ", bestStepRate=" + this.bestStepRate + ", totalDistance=" + this.totalDistance + ", totalCalories=" + this.totalCalories + ", totalSteps=" + this.totalSteps + ", totalTime=" + this.totalTime + ", totalClimb=" + this.totalClimb + ", sportName='" + this.sportName + "', abnormalTrack=" + this.abnormalTrack + ", maxVo2=" + this.maxVo2 + ", ssoid='" + this.ssoid + "', sportMode=" + this.sportMode + ", deviceUniqueId='" + this.deviceUniqueId + "', deviceCategory='" + this.deviceCategory + "', startTimestamp=" + this.startTimestamp + ", endTimestamp=" + this.endTimestamp + ", clientDataId='" + this.clientDataId + "', date=" + this.date + ", timezone='" + this.timezone + "', runExtra='" + this.runExtra + "', extension='" + this.extension + "'} ";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.avgPace);
        parcel.writeInt(this.bestPace);
        parcel.writeInt(this.avgHR);
        parcel.writeInt(this.maxHR);
        parcel.writeInt(this.minHR);
        parcel.writeInt(this.avgStepRate);
        parcel.writeInt(this.bestStepRate);
        parcel.writeLong(this.totalDistance);
        parcel.writeLong(this.totalCalories);
        parcel.writeLong(this.totalSteps);
        parcel.writeLong(this.totalTime);
        parcel.writeLong(this.totalClimb);
        parcel.writeString(this.sportName);
        parcel.writeInt(this.abnormalTrack);
        parcel.writeFloat(this.maxVo2);
        parcel.writeString(this.ssoid);
        parcel.writeInt(this.sportMode);
        parcel.writeString(this.deviceUniqueId);
        parcel.writeString(this.deviceCategory);
        parcel.writeLong(this.startTimestamp);
        parcel.writeLong(this.endTimestamp);
        parcel.writeString(this.clientDataId);
        parcel.writeInt(this.date);
        parcel.writeString(this.timezone);
        parcel.writeString(this.runExtra);
        parcel.writeString(this.extension);
    }

    public DBTrackMetadata(Parcel parcel) {
        this.ssoid = "";
        this.deviceUniqueId = "";
        this.deviceCategory = "";
        this.clientDataId = "";
        this.avgPace = parcel.readInt();
        this.bestPace = parcel.readInt();
        this.avgHR = parcel.readInt();
        this.maxHR = parcel.readInt();
        this.minHR = parcel.readInt();
        this.avgStepRate = parcel.readInt();
        this.bestStepRate = parcel.readInt();
        this.totalDistance = parcel.readLong();
        this.totalCalories = parcel.readLong();
        this.totalSteps = parcel.readLong();
        this.totalTime = parcel.readLong();
        this.totalClimb = parcel.readLong();
        this.sportName = parcel.readString();
        this.abnormalTrack = parcel.readInt();
        this.maxVo2 = parcel.readFloat();
        this.ssoid = parcel.readString();
        this.sportMode = parcel.readInt();
        this.deviceUniqueId = parcel.readString();
        this.deviceCategory = parcel.readString();
        this.startTimestamp = parcel.readLong();
        this.endTimestamp = parcel.readLong();
        this.clientDataId = parcel.readString();
        this.date = parcel.readInt();
        this.timezone = parcel.readString();
        this.runExtra = parcel.readString();
        this.extension = parcel.readString();
    }
}
