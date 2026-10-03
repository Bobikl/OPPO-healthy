package com.heytap.databaseengineservice.sync.responsebean;

import androidx.annotation.Keep;
import com.heytap.databaseengineservice.db.table.sportrecord.DBSportMetadata;
import com.heytap.sports.record.details.RecordDetailsInstructionActivity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\bK\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010u\u001a\u00020+H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR\u001a\u0010'\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\bR\u001c\u0010*\u001a\u0004\u0018\u00010+X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001e\u00100\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u00105\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001e\u00106\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u00105\u001a\u0004\b7\u00102\"\u0004\b8\u00104R\u001a\u00109\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0006\"\u0004\b;\u0010\bR\u001a\u0010<\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0006\"\u0004\b>\u0010\bR\u001a\u0010?\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010!\"\u0004\bA\u0010#R\u001a\u0010B\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010!\"\u0004\bD\u0010#R\u001a\u0010E\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010!\"\u0004\bG\u0010#R\u001a\u0010H\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u0006\"\u0004\bJ\u0010\bR\u001a\u0010K\u001a\u00020+X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010-\"\u0004\bM\u0010/R\u001a\u0010N\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010!\"\u0004\bP\u0010#R\u001a\u0010Q\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010\u0006\"\u0004\bS\u0010\bR\u001a\u0010T\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010\u0006\"\u0004\bV\u0010\bR\u001a\u0010W\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010\u0006\"\u0004\bY\u0010\bR\u001a\u0010Z\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010!\"\u0004\b\\\u0010#R\u001a\u0010]\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010\u0006\"\u0004\b_\u0010\bR\u001a\u0010`\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\ba\u0010!\"\u0004\bb\u0010#R\u001a\u0010c\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bd\u0010\u0006\"\u0004\be\u0010\bR\u001a\u0010f\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bg\u0010!\"\u0004\bh\u0010#R\u001a\u0010i\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bj\u0010\u0006\"\u0004\bk\u0010\bR\u001a\u0010l\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bm\u0010\u0006\"\u0004\bn\u0010\bR\u001a\u0010o\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bp\u0010!\"\u0004\bq\u0010#R\u001a\u0010r\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bs\u0010\u0006\"\u0004\bt\u0010\b¨\u0006v"}, d2 = {"Lcom/heytap/databaseengineservice/sync/responsebean/StepsStatPOJO;", "", "()V", "activitiesGoal", "", "getActivitiesGoal", "()I", "setActivitiesGoal", "(I)V", "activitiesGoalComplete", "getActivitiesGoalComplete", "setActivitiesGoalComplete", "caloriesGoalComplete", "getCaloriesGoalComplete", "setCaloriesGoalComplete", "currentDayCaloriesGoal", "getCurrentDayCaloriesGoal", "setCurrentDayCaloriesGoal", "currentDayStepsGoal", "getCurrentDayStepsGoal", "setCurrentDayStepsGoal", "date", "getDate", "setDate", "dayGoalComplete", "getDayGoalComplete", "setDayGoalComplete", "display", "getDisplay", "setDisplay", "endTimestamp", "", "getEndTimestamp", "()J", "setEndTimestamp", "(J)V", "exerciseGoal", "getExerciseGoal", "setExerciseGoal", "exerciseGoalComplete", "getExerciseGoalComplete", "setExerciseGoalComplete", DBSportMetadata.EXTENSION, "", "getExtension", "()Ljava/lang/String;", "setExtension", "(Ljava/lang/String;)V", "maxStrideFrequency", "getMaxStrideFrequency", "()Ljava/lang/Integer;", "setMaxStrideFrequency", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "minStrideFrequency", "getMinStrideFrequency", "setMinStrideFrequency", "mjkIntakeCaloriesGoal", "getMjkIntakeCaloriesGoal", "setMjkIntakeCaloriesGoal", "mjkTotalCaloriesGoal", "getMjkTotalCaloriesGoal", "setMjkTotalCaloriesGoal", "modifiedTime", "getModifiedTime", "setModifiedTime", "sedentaryCounts", "getSedentaryCounts", "setSedentaryCounts", "sedentaryTime", "getSedentaryTime", "setSedentaryTime", RecordDetailsInstructionActivity.KEY_SPORT_MODE, "getSportMode", "setSportMode", "ssoid", "getSsoid", "setSsoid", "startTimestamp", "getStartTimestamp", "setStartTimestamp", "staticCalSource", "getStaticCalSource", "setStaticCalSource", "stepsGoalComplete", "getStepsGoalComplete", "setStepsGoalComplete", "totalAltitudeOffset", "getTotalAltitudeOffset", "setTotalAltitudeOffset", "totalCalories", "getTotalCalories", "setTotalCalories", "totalDistance", "getTotalDistance", "setTotalDistance", "totalDuration", "getTotalDuration", "setTotalDuration", "totalMoveAboutTimes", "getTotalMoveAboutTimes", "setTotalMoveAboutTimes", "totalStaticCal", "getTotalStaticCal", "setTotalStaticCal", "totalSteps", "getTotalSteps", "setTotalSteps", "totalWorkoutMinutes", "getTotalWorkoutMinutes", "setTotalWorkoutMinutes", "updateTimestamp", "getUpdateTimestamp", "setUpdateTimestamp", "updated", "getUpdated", "setUpdated", "toString", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class StepsStatPOJO {
    private int activitiesGoal;
    private int activitiesGoalComplete;
    private int caloriesGoalComplete;
    private int currentDayCaloriesGoal;
    private int currentDayStepsGoal;
    private int date;
    private int dayGoalComplete;
    private int display;
    private long endTimestamp;
    private int exerciseGoal;
    private int exerciseGoalComplete;

    @Nullable
    private String extension;

    @Nullable
    private Integer maxStrideFrequency;

    @Nullable
    private Integer minStrideFrequency;
    private int mjkIntakeCaloriesGoal;
    private int mjkTotalCaloriesGoal;
    private long modifiedTime;
    private long sedentaryCounts;
    private long sedentaryTime;
    private int sportMode;

    @NotNull
    private String ssoid = "";
    private long startTimestamp;
    private int staticCalSource;
    private int stepsGoalComplete;
    private int totalAltitudeOffset;
    private long totalCalories;
    private int totalDistance;
    private long totalDuration;
    private int totalMoveAboutTimes;
    private long totalStaticCal;
    private int totalSteps;
    private int totalWorkoutMinutes;
    private long updateTimestamp;
    private int updated;

    public final int getActivitiesGoal() {
        return this.activitiesGoal;
    }

    public final int getActivitiesGoalComplete() {
        return this.activitiesGoalComplete;
    }

    public final int getCaloriesGoalComplete() {
        return this.caloriesGoalComplete;
    }

    public final int getCurrentDayCaloriesGoal() {
        return this.currentDayCaloriesGoal;
    }

    public final int getCurrentDayStepsGoal() {
        return this.currentDayStepsGoal;
    }

    public final int getDate() {
        return this.date;
    }

    public final int getDayGoalComplete() {
        return this.dayGoalComplete;
    }

    public final int getDisplay() {
        return this.display;
    }

    public final long getEndTimestamp() {
        return this.endTimestamp;
    }

    public final int getExerciseGoal() {
        return this.exerciseGoal;
    }

    public final int getExerciseGoalComplete() {
        return this.exerciseGoalComplete;
    }

    @Nullable
    public final String getExtension() {
        return this.extension;
    }

    @Nullable
    public final Integer getMaxStrideFrequency() {
        return this.maxStrideFrequency;
    }

    @Nullable
    public final Integer getMinStrideFrequency() {
        return this.minStrideFrequency;
    }

    public final int getMjkIntakeCaloriesGoal() {
        return this.mjkIntakeCaloriesGoal;
    }

    public final int getMjkTotalCaloriesGoal() {
        return this.mjkTotalCaloriesGoal;
    }

    public final long getModifiedTime() {
        return this.modifiedTime;
    }

    public final long getSedentaryCounts() {
        return this.sedentaryCounts;
    }

    public final long getSedentaryTime() {
        return this.sedentaryTime;
    }

    public final int getSportMode() {
        return this.sportMode;
    }

    @NotNull
    public final String getSsoid() {
        return this.ssoid;
    }

    public final long getStartTimestamp() {
        return this.startTimestamp;
    }

    public final int getStaticCalSource() {
        return this.staticCalSource;
    }

    public final int getStepsGoalComplete() {
        return this.stepsGoalComplete;
    }

    public final int getTotalAltitudeOffset() {
        return this.totalAltitudeOffset;
    }

    public final long getTotalCalories() {
        return this.totalCalories;
    }

    public final int getTotalDistance() {
        return this.totalDistance;
    }

    public final long getTotalDuration() {
        return this.totalDuration;
    }

    public final int getTotalMoveAboutTimes() {
        return this.totalMoveAboutTimes;
    }

    public final long getTotalStaticCal() {
        return this.totalStaticCal;
    }

    public final int getTotalSteps() {
        return this.totalSteps;
    }

    public final int getTotalWorkoutMinutes() {
        return this.totalWorkoutMinutes;
    }

    public final long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    public final int getUpdated() {
        return this.updated;
    }

    public final void setActivitiesGoal(int i) {
        this.activitiesGoal = i;
    }

    public final void setActivitiesGoalComplete(int i) {
        this.activitiesGoalComplete = i;
    }

    public final void setCaloriesGoalComplete(int i) {
        this.caloriesGoalComplete = i;
    }

    public final void setCurrentDayCaloriesGoal(int i) {
        this.currentDayCaloriesGoal = i;
    }

    public final void setCurrentDayStepsGoal(int i) {
        this.currentDayStepsGoal = i;
    }

    public final void setDate(int i) {
        this.date = i;
    }

    public final void setDayGoalComplete(int i) {
        this.dayGoalComplete = i;
    }

    public final void setDisplay(int i) {
        this.display = i;
    }

    public final void setEndTimestamp(long j2) {
        this.endTimestamp = j2;
    }

    public final void setExerciseGoal(int i) {
        this.exerciseGoal = i;
    }

    public final void setExerciseGoalComplete(int i) {
        this.exerciseGoalComplete = i;
    }

    public final void setExtension(@Nullable String str) {
        this.extension = str;
    }

    public final void setMaxStrideFrequency(@Nullable Integer num) {
        this.maxStrideFrequency = num;
    }

    public final void setMinStrideFrequency(@Nullable Integer num) {
        this.minStrideFrequency = num;
    }

    public final void setMjkIntakeCaloriesGoal(int i) {
        this.mjkIntakeCaloriesGoal = i;
    }

    public final void setMjkTotalCaloriesGoal(int i) {
        this.mjkTotalCaloriesGoal = i;
    }

    public final void setModifiedTime(long j2) {
        this.modifiedTime = j2;
    }

    public final void setSedentaryCounts(long j2) {
        this.sedentaryCounts = j2;
    }

    public final void setSedentaryTime(long j2) {
        this.sedentaryTime = j2;
    }

    public final void setSportMode(int i) {
        this.sportMode = i;
    }

    public final void setSsoid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.ssoid = str;
    }

    public final void setStartTimestamp(long j2) {
        this.startTimestamp = j2;
    }

    public final void setStaticCalSource(int i) {
        this.staticCalSource = i;
    }

    public final void setStepsGoalComplete(int i) {
        this.stepsGoalComplete = i;
    }

    public final void setTotalAltitudeOffset(int i) {
        this.totalAltitudeOffset = i;
    }

    public final void setTotalCalories(long j2) {
        this.totalCalories = j2;
    }

    public final void setTotalDistance(int i) {
        this.totalDistance = i;
    }

    public final void setTotalDuration(long j2) {
        this.totalDuration = j2;
    }

    public final void setTotalMoveAboutTimes(int i) {
        this.totalMoveAboutTimes = i;
    }

    public final void setTotalStaticCal(long j2) {
        this.totalStaticCal = j2;
    }

    public final void setTotalSteps(int i) {
        this.totalSteps = i;
    }

    public final void setTotalWorkoutMinutes(int i) {
        this.totalWorkoutMinutes = i;
    }

    public final void setUpdateTimestamp(long j2) {
        this.updateTimestamp = j2;
    }

    public final void setUpdated(int i) {
        this.updated = i;
    }

    @NotNull
    public String toString() {
        return "StepsStatPOJO(startTimestamp=" + this.startTimestamp + ", endTimestamp=" + this.endTimestamp + ", date=" + this.date + ", sportMode=" + this.sportMode + ", totalSteps=" + this.totalSteps + ", totalDistance=" + this.totalDistance + ", totalCalories=" + this.totalCalories + ", totalAltitudeOffset=" + this.totalAltitudeOffset + ", totalDuration=" + this.totalDuration + ", totalWorkoutMinutes=" + this.totalWorkoutMinutes + ", totalMoveAboutTimes=" + this.totalMoveAboutTimes + ", display=" + this.display + ", modifiedTime=" + this.modifiedTime + ", currentDayStepsGoal=" + this.currentDayStepsGoal + ", stepsGoalComplete=" + this.stepsGoalComplete + ", currentDayCaloriesGoal=" + this.currentDayCaloriesGoal + ", caloriesGoalComplete=" + this.caloriesGoalComplete + ", exerciseGoal=" + this.exerciseGoal + ", exerciseGoalComplete=" + this.exerciseGoalComplete + ", activitiesGoal=" + this.activitiesGoal + ", activitiesGoalComplete=" + this.activitiesGoalComplete + ", dayGoalComplete=" + this.dayGoalComplete + ", sedentaryTime=" + this.sedentaryTime + ", sedentaryCounts=" + this.sedentaryCounts + ", totalStaticCal=" + this.totalStaticCal + ", mjkTotalCaloriesGoal=" + this.mjkTotalCaloriesGoal + ", mjkIntakeCaloriesGoal=" + this.mjkIntakeCaloriesGoal + ", staticCalSource=" + this.staticCalSource + ", minStrideFrequency=" + this.minStrideFrequency + ", maxStrideFrequency=" + this.maxStrideFrequency + ", extension=" + this.extension + ", updated=" + this.updated + ", updateTimestamp=" + this.updateTimestamp + ")";
    }
}
