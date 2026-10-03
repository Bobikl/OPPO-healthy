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
@Entity(tableName = DBSportDataStat.TABLE_NAME)
@Keep
public class DBSportDataStat extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<DBSportDataStat> CREATOR = new a();
    public static final String TABLE_NAME = "DBSportDataStat";

    @ColumnInfo(name = "calories_goal_complete")
    private int caloriesGoalComplete;

    @ColumnInfo(name = DBSportMetadata.CLIENT_DATA_ID)
    private String clientDataId;

    @ColumnInfo(name = "current_day_calories_goal")
    private int currentDayCaloriesGoal;

    @ColumnInfo(defaultValue = "0", name = "current_day_move_about_times_goal")
    private int currentDayMoveAboutTimesGoal;

    @ColumnInfo(name = "current_day_steps_goal")
    private int currentDayStepsGoal;

    @ColumnInfo(defaultValue = "0", name = "current_day_workout_goal")
    private int currentDayWorkoutGoal;

    @ColumnInfo(name = "date")
    private int date;

    @ColumnInfo(name = "day_goal_complete")
    private int dayGoalComplete;

    @ColumnInfo(name = DBAssessmentRecord.DEVICE_UNIQUE_ID)
    private String deviceUniqueId;

    @ColumnInfo(name = "display")
    private int display;

    @ColumnInfo(name = "end_time")
    private long endTimestamp;

    @ColumnInfo(name = DBSportMetadata.EXTENSION)
    private String extension;

    @ColumnInfo(name = "mjk_intake_calories_goal")
    private int mjkIntakeCaloriesGoal;

    @ColumnInfo(name = "mjk_total_calories_goal")
    private int mjkTotalCaloriesGoal;

    @ColumnInfo(name = "modified_time")
    private long modifiedTime;

    @ColumnInfo(defaultValue = "0", name = "move_about_times_goal_complete")
    private int moveAboutTimesGoalComplete;

    @ColumnInfo(name = "sedentary_counts")
    private long sedentaryCounts;

    @ColumnInfo(name = "sedentary_total_duration")
    private long sedentaryTotalDuration;

    @ColumnInfo(name = "sport_mode")
    private int sportMode;

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "_id")
    private long sportStatId;

    @ColumnInfo(name = "ssoid")
    private String ssoid;

    @ColumnInfo(name = "start_time")
    private long startTimestamp;

    @ColumnInfo(name = "static_cal_source")
    private int staticCalSource;

    @ColumnInfo(name = "steps_goal_complete")
    private int stepsGoalComplete;

    @ColumnInfo(name = "sync_status")
    private int syncStatus;

    @ColumnInfo(name = "timezone")
    private String timezone;

    @ColumnInfo(name = "total_altitude_offset")
    private int totalAltitudeOffset;

    @ColumnInfo(name = "total_amount_of_exercise")
    private long totalAmountOfExercise;

    @ColumnInfo(name = "total_calories")
    private long totalCalories;

    @ColumnInfo(name = "total_distance")
    private int totalDistance;

    @ColumnInfo(name = DBSunshineStat.TOTAL_DURATION)
    private long totalDuration;

    @ColumnInfo(name = "total_move_about_times")
    private int totalMoveAboutTimes;

    @ColumnInfo(name = "total_static_cal")
    private long totalStaticCal;

    @ColumnInfo(name = "total_steps")
    private int totalSteps;

    @ColumnInfo(name = "total_workout_minutes")
    private int totalWorkoutMinutes;

    @ColumnInfo(name = "update_timestamp")
    private long updateTimestamp;

    @ColumnInfo(name = "updated")
    private int updated;

    @ColumnInfo(defaultValue = "0", name = "workout_goal_complete")
    private int workoutGoalComplete;

    public class a implements Parcelable.Creator<DBSportDataStat> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DBSportDataStat createFromParcel(Parcel parcel) {
            return new DBSportDataStat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DBSportDataStat[] newArray(int i) {
            return new DBSportDataStat[i];
        }
    }

    public DBSportDataStat() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getCaloriesGoalComplete() {
        return this.caloriesGoalComplete;
    }

    public String getClientDataId() {
        return this.clientDataId;
    }

    public int getCurrentDayCaloriesGoal() {
        return this.currentDayCaloriesGoal;
    }

    public int getCurrentDayMoveAboutTimesGoal() {
        return this.currentDayMoveAboutTimesGoal;
    }

    public int getCurrentDayStepsGoal() {
        return this.currentDayStepsGoal;
    }

    public int getCurrentDayWorkoutGoal() {
        return this.currentDayWorkoutGoal;
    }

    public int getDate() {
        return this.date;
    }

    public int getDayGoalComplete() {
        return this.dayGoalComplete;
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

    public String getExtension() {
        return this.extension;
    }

    public int getMjkIntakeCaloriesGoal() {
        return this.mjkIntakeCaloriesGoal;
    }

    public int getMjkTotalCaloriesGoal() {
        return this.mjkTotalCaloriesGoal;
    }

    public long getModifiedTime() {
        return this.modifiedTime;
    }

    public int getMoveAboutTimesGoalComplete() {
        return this.moveAboutTimesGoalComplete;
    }

    public long getSedentaryCounts() {
        return this.sedentaryCounts;
    }

    public long getSedentaryTotalDuration() {
        return this.sedentaryTotalDuration;
    }

    public int getSportMode() {
        return this.sportMode;
    }

    public long getSportStatId() {
        return this.sportStatId;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String getSsoid() {
        return this.ssoid;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public long getStartTimestamp() {
        return this.startTimestamp;
    }

    public int getStaticCalSource() {
        return this.staticCalSource;
    }

    public int getStepsGoalComplete() {
        return this.stepsGoalComplete;
    }

    public int getSyncStatus() {
        return this.syncStatus;
    }

    public String getTimezone() {
        return this.timezone;
    }

    public int getTotalAltitudeOffset() {
        return this.totalAltitudeOffset;
    }

    public long getTotalAmountOfExercise() {
        return this.totalAmountOfExercise;
    }

    public long getTotalCalories() {
        return this.totalCalories;
    }

    public int getTotalDistance() {
        return this.totalDistance;
    }

    public long getTotalDuration() {
        return this.totalDuration;
    }

    public int getTotalMoveAboutTimes() {
        return this.totalMoveAboutTimes;
    }

    public long getTotalStaticCal() {
        return this.totalStaticCal;
    }

    public int getTotalSteps() {
        return this.totalSteps;
    }

    public int getTotalWorkoutMinutes() {
        return this.totalWorkoutMinutes;
    }

    public long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    public int getUpdated() {
        return this.updated;
    }

    public int getWorkoutGoalComplete() {
        return this.workoutGoalComplete;
    }

    public void setCaloriesGoalComplete(int i) {
        this.caloriesGoalComplete = i;
    }

    public void setClientDataId(String str) {
        this.clientDataId = str;
    }

    public void setCurrentDayCaloriesGoal(int i) {
        this.currentDayCaloriesGoal = i;
    }

    public void setCurrentDayMoveAboutTimesGoal(int i) {
        this.currentDayMoveAboutTimesGoal = i;
    }

    public void setCurrentDayStepsGoal(int i) {
        this.currentDayStepsGoal = i;
    }

    public void setCurrentDayWorkoutGoal(int i) {
        this.currentDayWorkoutGoal = i;
    }

    public void setDate(int i) {
        this.date = i;
    }

    public void setDayGoalComplete(int i) {
        this.dayGoalComplete = i;
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

    public void setExtension(String str) {
        this.extension = str;
    }

    public void setMjkIntakeCaloriesGoal(int i) {
        this.mjkIntakeCaloriesGoal = i;
    }

    public void setMjkTotalCaloriesGoal(int i) {
        this.mjkTotalCaloriesGoal = i;
    }

    public void setModifiedTime(long j2) {
        this.modifiedTime = j2;
    }

    public void setMoveAboutTimesGoalComplete(int i) {
        this.moveAboutTimesGoalComplete = i;
    }

    public void setSedentaryCounts(long j2) {
        this.sedentaryCounts = j2;
    }

    public void setSedentaryTotalDuration(long j2) {
        this.sedentaryTotalDuration = j2;
    }

    public void setSportMode(int i) {
        this.sportMode = i;
    }

    public void setSportStatId(long j2) {
        this.sportStatId = j2;
    }

    public void setSsoid(String str) {
        this.ssoid = str;
    }

    public void setStartTimestamp(long j2) {
        this.startTimestamp = j2;
    }

    public void setStaticCalSource(int i) {
        this.staticCalSource = i;
    }

    public void setStepsGoalComplete(int i) {
        this.stepsGoalComplete = i;
    }

    public void setSyncStatus(int i) {
        this.syncStatus = i;
    }

    public void setTimezone(String str) {
        this.timezone = str;
    }

    public void setTotalAltitudeOffset(int i) {
        this.totalAltitudeOffset = i;
    }

    public void setTotalAmountOfExercise(long j2) {
        this.totalAmountOfExercise = j2;
    }

    public void setTotalCalories(long j2) {
        this.totalCalories = j2;
    }

    public void setTotalDistance(int i) {
        this.totalDistance = i;
    }

    public void setTotalDuration(long j2) {
        this.totalDuration = j2;
    }

    public void setTotalMoveAboutTimes(int i) {
        this.totalMoveAboutTimes = i;
    }

    public void setTotalStaticCal(long j2) {
        this.totalStaticCal = j2;
    }

    public void setTotalSteps(int i) {
        this.totalSteps = i;
    }

    public void setTotalWorkoutMinutes(int i) {
        this.totalWorkoutMinutes = i;
    }

    public void setUpdateTimestamp(long j2) {
        this.updateTimestamp = j2;
    }

    public void setUpdated(int i) {
        this.updated = i;
    }

    public void setWorkoutGoalComplete(int i) {
        this.workoutGoalComplete = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "DBSportDataStat{sportStatId=" + this.sportStatId + ", clientDataId='" + this.clientDataId + "', startTimestamp=" + this.startTimestamp + ", endTimestamp=" + this.endTimestamp + ", date=" + this.date + ", sportMode=" + this.sportMode + ", totalSteps=" + this.totalSteps + ", totalDistance=" + this.totalDistance + ", totalCalories=" + this.totalCalories + ", totalAltitudeOffset=" + this.totalAltitudeOffset + ", totalDuration=" + this.totalDuration + ", totalWorkoutMinutes=" + this.totalWorkoutMinutes + ", totalMoveAboutTimes=" + this.totalMoveAboutTimes + ", display=" + this.display + ", syncStatus=" + this.syncStatus + ", timezone='" + this.timezone + "', modifiedTime=" + this.modifiedTime + ", currentDayStepsGoal=" + this.currentDayStepsGoal + ", stepsGoalComplete=" + this.stepsGoalComplete + ", currentDayCaloriesGoal=" + this.currentDayCaloriesGoal + ", caloriesGoalComplete=" + this.caloriesGoalComplete + ", currentDayWorkoutGoal=" + this.currentDayWorkoutGoal + ", workoutGoalComplete=" + this.workoutGoalComplete + ", currentDayMoveAboutTimesGoal=" + this.currentDayMoveAboutTimesGoal + ", moveAboutTimesGoalComplete=" + this.moveAboutTimesGoalComplete + ", totalAmountOfExercise=" + this.totalAmountOfExercise + ", dayGoalComplete=" + this.dayGoalComplete + ", sedentaryTotalDuration=" + this.sedentaryTotalDuration + ", sedentaryCounts=" + this.sedentaryCounts + ", totalStaticCal=" + this.totalStaticCal + ", mjkTotalCaloriesGoal=" + this.mjkTotalCaloriesGoal + ", mjkIntakeCaloriesGoal=" + this.mjkIntakeCaloriesGoal + ", staticCalSource=" + this.staticCalSource + ", extension='" + this.extension + "', updated=" + this.updated + ", updateTimestamp=" + this.updateTimestamp + "} ";
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
        parcel.writeInt(this.totalSteps);
        parcel.writeInt(this.totalDistance);
        parcel.writeLong(this.totalCalories);
        parcel.writeInt(this.totalAltitudeOffset);
        parcel.writeLong(this.totalDuration);
        parcel.writeInt(this.totalWorkoutMinutes);
        parcel.writeInt(this.totalMoveAboutTimes);
        parcel.writeInt(this.display);
        parcel.writeInt(this.syncStatus);
        parcel.writeString(this.timezone);
        parcel.writeLong(this.modifiedTime);
        parcel.writeInt(this.currentDayStepsGoal);
        parcel.writeInt(this.stepsGoalComplete);
        parcel.writeInt(this.currentDayCaloriesGoal);
        parcel.writeInt(this.caloriesGoalComplete);
        parcel.writeInt(this.currentDayWorkoutGoal);
        parcel.writeInt(this.workoutGoalComplete);
        parcel.writeInt(this.currentDayMoveAboutTimesGoal);
        parcel.writeInt(this.moveAboutTimesGoalComplete);
        parcel.writeLong(this.totalAmountOfExercise);
        parcel.writeInt(this.dayGoalComplete);
        parcel.writeLong(this.sedentaryTotalDuration);
        parcel.writeLong(this.sedentaryCounts);
        parcel.writeLong(this.totalStaticCal);
        parcel.writeInt(this.mjkTotalCaloriesGoal);
        parcel.writeInt(this.mjkIntakeCaloriesGoal);
        parcel.writeInt(this.staticCalSource);
        parcel.writeString(this.extension);
        parcel.writeInt(this.updated);
        parcel.writeLong(this.updateTimestamp);
    }

    public DBSportDataStat(Parcel parcel) {
        this.clientDataId = parcel.readString();
        this.ssoid = parcel.readString();
        this.deviceUniqueId = parcel.readString();
        this.startTimestamp = parcel.readLong();
        this.endTimestamp = parcel.readLong();
        this.date = parcel.readInt();
        this.sportMode = parcel.readInt();
        this.totalSteps = parcel.readInt();
        this.totalDistance = parcel.readInt();
        this.totalCalories = parcel.readLong();
        this.totalAltitudeOffset = parcel.readInt();
        this.totalDuration = parcel.readLong();
        this.totalWorkoutMinutes = parcel.readInt();
        this.totalMoveAboutTimes = parcel.readInt();
        this.display = parcel.readInt();
        this.syncStatus = parcel.readInt();
        this.timezone = parcel.readString();
        this.modifiedTime = parcel.readLong();
        this.currentDayStepsGoal = parcel.readInt();
        this.stepsGoalComplete = parcel.readInt();
        this.currentDayCaloriesGoal = parcel.readInt();
        this.caloriesGoalComplete = parcel.readInt();
        this.currentDayWorkoutGoal = parcel.readInt();
        this.workoutGoalComplete = parcel.readInt();
        this.currentDayMoveAboutTimesGoal = parcel.readInt();
        this.moveAboutTimesGoalComplete = parcel.readInt();
        this.totalAmountOfExercise = parcel.readLong();
        this.dayGoalComplete = parcel.readInt();
        this.sedentaryTotalDuration = parcel.readLong();
        this.sedentaryCounts = parcel.readLong();
        this.totalStaticCal = parcel.readLong();
        this.mjkTotalCaloriesGoal = parcel.readInt();
        this.mjkIntakeCaloriesGoal = parcel.readInt();
        this.staticCalSource = parcel.readInt();
        this.extension = parcel.readString();
        this.updated = parcel.readInt();
        this.updateTimestamp = parcel.readLong();
    }
}
