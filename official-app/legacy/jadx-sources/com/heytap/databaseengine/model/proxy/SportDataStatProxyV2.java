package com.heytap.databaseengine.model.proxy;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.heytap.databaseengine.model.SportDataStat;
import com.oplus.weatherservicesdk.data.Weather;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class SportDataStatProxyV2 extends SportDataStatProxy {
    public static final Parcelable.Creator<SportDataStatProxyV2> CREATOR = new a();
    private int caloriesGoalComplete;
    private int currentDayCaloriesGoal;
    private int currentDayStepsGoal;
    private int dayGoalComplete;
    private int stepsGoalComplete;
    private int totalMoveAboutTimes;
    private int totalWorkoutMinutes;

    public class a implements Parcelable.Creator<SportDataStatProxyV2> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SportDataStatProxyV2 createFromParcel(Parcel parcel) {
            return new SportDataStatProxyV2(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SportDataStatProxyV2[] newArray(int i) {
            return new SportDataStatProxyV2[i];
        }
    }

    public SportDataStatProxyV2(@NonNull SportDataStat sportDataStat) {
        super(sportDataStat);
        this.totalWorkoutMinutes = sportDataStat.getTotalWorkoutMinutes();
        this.totalMoveAboutTimes = sportDataStat.getTotalMoveAboutTimes();
        this.currentDayStepsGoal = sportDataStat.getCurrentDayStepsGoal();
        this.stepsGoalComplete = sportDataStat.getStepsGoalComplete();
        this.currentDayCaloriesGoal = sportDataStat.getCurrentDayCaloriesGoal();
        this.caloriesGoalComplete = sportDataStat.getCaloriesGoalComplete();
        this.dayGoalComplete = sportDataStat.getDayGoalComplete();
    }

    @Override // com.heytap.databaseengine.model.proxy.SportDataStatProxy, android.os.Parcelable
    public int describeContents() {
        return super.describeContents();
    }

    public int getCaloriesGoalComplete() {
        return this.caloriesGoalComplete;
    }

    public int getCurrentDayCaloriesGoal() {
        return this.currentDayCaloriesGoal;
    }

    public int getCurrentDayStepsGoal() {
        return this.currentDayStepsGoal;
    }

    public int getDayGoalComplete() {
        return this.dayGoalComplete;
    }

    public int getStepsGoalComplete() {
        return this.stepsGoalComplete;
    }

    public int getTotalMoveAboutTimes() {
        return this.totalMoveAboutTimes;
    }

    public int getTotalWorkoutMinutes() {
        return this.totalWorkoutMinutes;
    }

    @Override // com.heytap.databaseengine.model.proxy.SportDataStatProxy, com.heytap.databaseengine.model.SportHealthData
    @NonNull
    public String toString() {
        return super.toString() + "totalWorkoutMinutes=" + getTotalWorkoutMinutes() + "\ntotalMoveAboutTimes=" + getTotalMoveAboutTimes() + "\ncurrentDayStepsGoal=" + getCurrentDayStepsGoal() + "\nstepsGoalComplete=" + getStepsGoalComplete() + "\ncurrentDayCaloriesGoal=" + getCurrentDayCaloriesGoal() + "\ncaloriesGoalComplete=" + getCaloriesGoalComplete() + "\ndayGoalComplete=" + getDayGoalComplete() + Weather.SEPARATOR;
    }

    @Override // com.heytap.databaseengine.model.proxy.SportDataStatProxy, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.totalWorkoutMinutes);
        parcel.writeInt(this.totalMoveAboutTimes);
        parcel.writeInt(this.currentDayStepsGoal);
        parcel.writeInt(this.stepsGoalComplete);
        parcel.writeInt(this.currentDayCaloriesGoal);
        parcel.writeInt(this.caloriesGoalComplete);
        parcel.writeInt(this.dayGoalComplete);
    }

    public SportDataStatProxyV2(Parcel parcel) {
        super(parcel);
        this.totalWorkoutMinutes = parcel.readInt();
        this.totalMoveAboutTimes = parcel.readInt();
        this.currentDayStepsGoal = parcel.readInt();
        this.stepsGoalComplete = parcel.readInt();
        this.currentDayCaloriesGoal = parcel.readInt();
        this.caloriesGoalComplete = parcel.readInt();
        this.dayGoalComplete = parcel.readInt();
    }
}
