package com.heytap.databaseengine.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class SportDataStat extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<SportDataStat> CREATOR = new a();
    private int caloriesGoalComplete;
    private int currentDayCaloriesGoal;
    private int currentDayMoveAboutTimesGoal;
    private int currentDayStepsGoal;
    private int currentDayWorkoutGoal;
    private int date;
    private int dayGoalComplete;
    private String deviceUniqueId;
    private String extension;
    private int mjkIntakeCaloriesGoal;
    private int mjkTotalCaloriesGoal;
    private int moveAboutTimesGoalComplete;
    private long sedentaryCounts;
    private long sedentaryTotalDuration;
    private int sportMode;
    private String ssoid;
    private int staticCalSource;
    private int stepsGoalComplete;
    private int syncStatus;
    private String timezone;
    private int totalAltitudeOffset;
    private long totalAmountOfExercise;
    private long totalCalories;
    private int totalDistance;
    private long totalDuration;
    private int totalMoveAboutTimes;
    private long totalStaticCal;
    private int totalSteps;
    private int totalWorkoutMinutes;
    private long updateTimestamp;
    private int workoutGoalComplete;

    public class a implements Parcelable.Creator<SportDataStat> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SportDataStat createFromParcel(Parcel parcel) {
            return new SportDataStat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SportDataStat[] newArray(int i) {
            return new SportDataStat[i];
        }
    }

    public SportDataStat() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getCaloriesGoalComplete() {
        return this.caloriesGoalComplete;
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

    public String getExtension() {
        return this.extension;
    }

    public int getMjkIntakeCaloriesGoal() {
        return this.mjkIntakeCaloriesGoal;
    }

    public int getMjkTotalCaloriesGoal() {
        return this.mjkTotalCaloriesGoal;
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

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String getSsoid() {
        return this.ssoid;
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

    public int getWorkoutGoalComplete() {
        return this.workoutGoalComplete;
    }

    public void setCaloriesGoalComplete(int i) {
        this.caloriesGoalComplete = i;
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

    public void setExtension(String str) {
        this.extension = str;
    }

    public void setMjkIntakeCaloriesGoal(int i) {
        this.mjkIntakeCaloriesGoal = i;
    }

    public void setMjkTotalCaloriesGoal(int i) {
        this.mjkTotalCaloriesGoal = i;
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

    public void setSsoid(String str) {
        this.ssoid = str;
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

    public void setWorkoutGoalComplete(int i) {
        this.workoutGoalComplete = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "SportDataStat{ssoid='" + this.ssoid + "', deviceUniqueId='" + this.deviceUniqueId + "', date=" + this.date + ", sportMode=" + this.sportMode + ", totalSteps=" + this.totalSteps + ", totalDistance=" + this.totalDistance + ", totalCalories=" + this.totalCalories + ", totalAltitudeOffset=" + this.totalAltitudeOffset + ", totalDuration=" + this.totalDuration + ", totalWorkoutMinutes=" + this.totalWorkoutMinutes + ", totalMoveAboutTimes=" + this.totalMoveAboutTimes + ", syncStatus=" + this.syncStatus + ", timezone='" + this.timezone + "', currentDayStepsGoal=" + this.currentDayStepsGoal + ", stepsGoalComplete=" + this.stepsGoalComplete + ", currentDayCaloriesGoal=" + this.currentDayCaloriesGoal + ", caloriesGoalComplete=" + this.caloriesGoalComplete + ", currentDayWorkoutGoal=" + this.currentDayWorkoutGoal + ", workoutGoalComplete=" + this.workoutGoalComplete + ", currentDayMoveAboutTimesGoal=" + this.currentDayMoveAboutTimesGoal + ", moveAboutTimesGoalComplete=" + this.moveAboutTimesGoalComplete + ", totalAmountOfExercise=" + this.totalAmountOfExercise + ", dayGoalComplete=" + this.dayGoalComplete + ", sedentaryTotalDuration=" + this.sedentaryTotalDuration + ", sedentaryTime=" + this.sedentaryCounts + ", staticCalorie=" + this.totalStaticCal + ", updateTimestamp=" + this.updateTimestamp + ", mjkTotalCaloriesGoal=" + this.mjkTotalCaloriesGoal + ", mjkIntakeCaloriesGoal=" + this.mjkIntakeCaloriesGoal + ", staticCalSource=" + this.staticCalSource + ", extension='" + this.extension + "'} ";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ssoid);
        parcel.writeString(this.deviceUniqueId);
        parcel.writeInt(this.date);
        parcel.writeInt(this.sportMode);
        parcel.writeInt(this.totalSteps);
        parcel.writeInt(this.totalDistance);
        parcel.writeLong(this.totalCalories);
        parcel.writeInt(this.totalAltitudeOffset);
        parcel.writeLong(this.totalDuration);
        parcel.writeInt(this.totalWorkoutMinutes);
        parcel.writeInt(this.totalMoveAboutTimes);
        parcel.writeInt(this.syncStatus);
        parcel.writeString(this.timezone);
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
        parcel.writeLong(this.updateTimestamp);
        parcel.writeInt(this.mjkTotalCaloriesGoal);
        parcel.writeInt(this.mjkIntakeCaloriesGoal);
        parcel.writeInt(this.staticCalSource);
        parcel.writeString(this.extension);
    }

    public SportDataStat(Parcel parcel) {
        this.ssoid = parcel.readString();
        this.deviceUniqueId = parcel.readString();
        this.date = parcel.readInt();
        this.sportMode = parcel.readInt();
        this.totalSteps = parcel.readInt();
        this.totalDistance = parcel.readInt();
        this.totalCalories = parcel.readLong();
        this.totalAltitudeOffset = parcel.readInt();
        this.totalDuration = parcel.readLong();
        this.totalWorkoutMinutes = parcel.readInt();
        this.totalMoveAboutTimes = parcel.readInt();
        this.syncStatus = parcel.readInt();
        this.timezone = parcel.readString();
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
        this.updateTimestamp = parcel.readLong();
        this.mjkTotalCaloriesGoal = parcel.readInt();
        this.mjkIntakeCaloriesGoal = parcel.readInt();
        this.staticCalSource = parcel.readInt();
        this.extension = parcel.readString();
    }
}
