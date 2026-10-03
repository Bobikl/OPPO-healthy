package com.heytap.health.health.familymode.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes16.dex */
@Keep
public class DailyBaseData implements Parcelable {
    public static final Parcelable.Creator<DailyBaseData> CREATOR = new a();
    private int activitiesGoal;
    private int calorieGoal;
    private int exerciseGoal;
    private int stepsGoal;
    private int totalCalories;
    private int totalDistance;
    private int totalSteps;
    private int totalWorkoutMinutes;
    private int totalWorkoutTimes;

    public class a implements Parcelable.Creator<DailyBaseData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DailyBaseData createFromParcel(Parcel parcel) {
            return new DailyBaseData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DailyBaseData[] newArray(int i) {
            return new DailyBaseData[i];
        }
    }

    public DailyBaseData(Parcel parcel) {
        this.totalSteps = parcel.readInt();
        this.totalDistance = parcel.readInt();
        this.totalCalories = parcel.readInt();
        this.totalWorkoutMinutes = parcel.readInt();
        this.totalWorkoutTimes = parcel.readInt();
        this.stepsGoal = parcel.readInt();
        this.calorieGoal = parcel.readInt();
        this.activitiesGoal = parcel.readInt();
        this.exerciseGoal = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getActivitiesGoal() {
        return this.activitiesGoal;
    }

    public int getCalorieGoal() {
        return this.calorieGoal;
    }

    public int getExerciseGoal() {
        return this.exerciseGoal;
    }

    public int getStepsGoal() {
        return this.stepsGoal;
    }

    public int getTotalCalories() {
        return this.totalCalories;
    }

    public int getTotalDistance() {
        return this.totalDistance;
    }

    public int getTotalSteps() {
        return this.totalSteps;
    }

    public int getTotalWorkoutMinutes() {
        return this.totalWorkoutMinutes;
    }

    public int getTotalWorkoutTimes() {
        return this.totalWorkoutTimes;
    }

    public void setActivitiesGoal(int i) {
        this.activitiesGoal = i;
    }

    public void setCalorieGoal(int i) {
        this.calorieGoal = i;
    }

    public void setExerciseGoal(int i) {
        this.exerciseGoal = i;
    }

    public void setStepsGoal(int i) {
        this.stepsGoal = i;
    }

    public void setTotalCalories(int i) {
        this.totalCalories = i;
    }

    public void setTotalDistance(int i) {
        this.totalDistance = i;
    }

    public void setTotalSteps(int i) {
        this.totalSteps = i;
    }

    public void setTotalWorkoutMinutes(int i) {
        this.totalWorkoutMinutes = i;
    }

    public void setTotalWorkoutTimes(int i) {
        this.totalWorkoutTimes = i;
    }

    public String toString() {
        return "DailyBaseData{totalSteps=" + this.totalSteps + ", totalDistance=" + this.totalDistance + ", totalCalories=" + this.totalCalories + ", totalWorkoutMinutes=" + this.totalWorkoutMinutes + ", totalWorkoutTimes=" + this.totalWorkoutTimes + ", stepsGoal=" + this.stepsGoal + ", calorieGoal=" + this.calorieGoal + ", activeGoal=" + this.activitiesGoal + ", timeGoal=" + this.exerciseGoal + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.totalSteps);
        parcel.writeInt(this.totalDistance);
        parcel.writeInt(this.totalCalories);
        parcel.writeInt(this.totalWorkoutMinutes);
        parcel.writeInt(this.totalWorkoutTimes);
        parcel.writeInt(this.stepsGoal);
        parcel.writeInt(this.calorieGoal);
        parcel.writeInt(this.activitiesGoal);
        parcel.writeInt(this.exerciseGoal);
    }
}
