package com.heytap.databaseengineservice.sync.responsebean.physicalmental;

import androidx.annotation.Keep;
import com.heytap.databaseengineservice.db.table.phycialmental.DBPhysicalMentalAchievement;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\t\n\u0002\bB\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010o\u001a\u00020\u0016H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\u001a\u0010\u001e\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001a\u0010!\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001e\u0010$\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b%\u0010\u000e\"\u0004\b&\u0010\u0010R\u001e\u0010'\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b(\u0010\u000e\"\u0004\b)\u0010\u0010R\u001a\u0010*\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0006\"\u0004\b,\u0010\bR\u001a\u0010-\u001a\u00020.X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u00103\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0006\"\u0004\b5\u0010\bR\u001a\u00106\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0006\"\u0004\b8\u0010\bR\u001e\u00109\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b:\u0010\u000e\"\u0004\b;\u0010\u0010R\u001e\u0010<\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b=\u0010\u000e\"\u0004\b>\u0010\u0010R\u001a\u0010?\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0006\"\u0004\bA\u0010\bR\u001a\u0010B\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u0006\"\u0004\bD\u0010\bR\u001e\u0010E\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\bF\u0010\u000e\"\u0004\bG\u0010\u0010R\u001a\u0010H\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u0006\"\u0004\bJ\u0010\bR\u001a\u0010K\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\u0006\"\u0004\bM\u0010\bR\u001a\u0010N\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\u0006\"\u0004\bP\u0010\bR\u001e\u0010Q\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\bR\u0010\u000e\"\u0004\bS\u0010\u0010R\u001a\u0010T\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010\u0006\"\u0004\bV\u0010\bR\u001a\u0010W\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010\u0006\"\u0004\bY\u0010\bR\u001a\u0010Z\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\u0006\"\u0004\b\\\u0010\bR\u001e\u0010]\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b^\u0010\u000e\"\u0004\b_\u0010\u0010R\u001e\u0010`\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\ba\u0010\u000e\"\u0004\bb\u0010\u0010R\u001c\u0010c\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bd\u0010\u0018\"\u0004\be\u0010\u001aR\u001e\u0010f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\bg\u0010\u000e\"\u0004\bh\u0010\u0010R\u001a\u0010i\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bj\u0010\u0006\"\u0004\bk\u0010\bR\u001a\u0010l\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bm\u0010\u0006\"\u0004\bn\u0010\b¨\u0006p"}, d2 = {"Lcom/heytap/databaseengineservice/sync/responsebean/physicalmental/PhysicalMentalAchievementPOJO;", "", "()V", "activityCount", "", "getActivityCount", "()I", "setActivityCount", "(I)V", "activityCountGoal", "getActivityCountGoal", "setActivityCountGoal", "calorie", "getCalorie", "()Ljava/lang/Integer;", "setCalorie", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "calorieGoal", "getCalorieGoal", "setCalorieGoal", "clientModel", "", "getClientModel", "()Ljava/lang/String;", "setClientModel", "(Ljava/lang/String;)V", "dataClient", "getDataClient", "setDataClient", "date", "getDate", "setDate", "display", "getDisplay", "setDisplay", DBPhysicalMentalAchievement.EXERCISE, "getExercise", "setExercise", "exerciseGoal", "getExerciseGoal", "setExerciseGoal", "level", "getLevel", "setLevel", "modifiedTimestamp", "", "getModifiedTimestamp", "()J", "setModifiedTimestamp", "(J)V", "physicalMentalAvg", "getPhysicalMentalAvg", "setPhysicalMentalAvg", "progress", "getProgress", ClickApiEntity.SET_PROGRESS, "regularBedtime", "getRegularBedtime", "setRegularBedtime", "regularBedtimeGoal", "getRegularBedtimeGoal", "setRegularBedtimeGoal", "relaxDuration", "getRelaxDuration", "setRelaxDuration", "relaxDurationGoal", "getRelaxDurationGoal", "setRelaxDurationGoal", "shouldSkipToday", "getShouldSkipToday", "setShouldSkipToday", "sleepDuration", "getSleepDuration", "setSleepDuration", "sleepDurationGoalMax", "getSleepDurationGoalMax", "setSleepDurationGoalMax", "sleepDurationGoalMin", "getSleepDurationGoalMin", "setSleepDurationGoalMin", "statsVersion", "getStatsVersion", "setStatsVersion", "statusLevel", "getStatusLevel", "setStatusLevel", "step", "getStep", "setStep", "stepGoal", "getStepGoal", "setStepGoal", DBPhysicalMentalAchievement.SUNSHINE, "getSunshine", "setSunshine", "sunshineGoal", "getSunshineGoal", "setSunshineGoal", "targetItemDisplayConfig", "getTargetItemDisplayConfig", "setTargetItemDisplayConfig", "todaySkipReason", "getTodaySkipReason", "setTodaySkipReason", "vitalityAvg", "getVitalityAvg", "setVitalityAvg", "vitalityGoal", "getVitalityGoal", "setVitalityGoal", "toString", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PhysicalMentalAchievementPOJO {
    private int activityCount;
    private int activityCountGoal;

    @Nullable
    private Integer calorie;

    @Nullable
    private Integer calorieGoal;

    @Nullable
    private String clientModel;

    @NotNull
    private String dataClient = "";
    private int date;
    private int display;

    @Nullable
    private Integer exercise;

    @Nullable
    private Integer exerciseGoal;
    private int level;
    private long modifiedTimestamp;
    private int physicalMentalAvg;
    private int progress;

    @Nullable
    private Integer regularBedtime;

    @Nullable
    private Integer regularBedtimeGoal;
    private int relaxDuration;
    private int relaxDurationGoal;

    @Nullable
    private Integer shouldSkipToday;
    private int sleepDuration;
    private int sleepDurationGoalMax;
    private int sleepDurationGoalMin;

    @Nullable
    private Integer statsVersion;
    private int statusLevel;
    private int step;
    private int stepGoal;

    @Nullable
    private Integer sunshine;

    @Nullable
    private Integer sunshineGoal;

    @Nullable
    private String targetItemDisplayConfig;

    @Nullable
    private Integer todaySkipReason;
    private int vitalityAvg;
    private int vitalityGoal;

    public final int getActivityCount() {
        return this.activityCount;
    }

    public final int getActivityCountGoal() {
        return this.activityCountGoal;
    }

    @Nullable
    public final Integer getCalorie() {
        return this.calorie;
    }

    @Nullable
    public final Integer getCalorieGoal() {
        return this.calorieGoal;
    }

    @Nullable
    public final String getClientModel() {
        return this.clientModel;
    }

    @NotNull
    public final String getDataClient() {
        return this.dataClient;
    }

    public final int getDate() {
        return this.date;
    }

    public final int getDisplay() {
        return this.display;
    }

    @Nullable
    public final Integer getExercise() {
        return this.exercise;
    }

    @Nullable
    public final Integer getExerciseGoal() {
        return this.exerciseGoal;
    }

    public final int getLevel() {
        return this.level;
    }

    public final long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    public final int getPhysicalMentalAvg() {
        return this.physicalMentalAvg;
    }

    public final int getProgress() {
        return this.progress;
    }

    @Nullable
    public final Integer getRegularBedtime() {
        return this.regularBedtime;
    }

    @Nullable
    public final Integer getRegularBedtimeGoal() {
        return this.regularBedtimeGoal;
    }

    public final int getRelaxDuration() {
        return this.relaxDuration;
    }

    public final int getRelaxDurationGoal() {
        return this.relaxDurationGoal;
    }

    @Nullable
    public final Integer getShouldSkipToday() {
        return this.shouldSkipToday;
    }

    public final int getSleepDuration() {
        return this.sleepDuration;
    }

    public final int getSleepDurationGoalMax() {
        return this.sleepDurationGoalMax;
    }

    public final int getSleepDurationGoalMin() {
        return this.sleepDurationGoalMin;
    }

    @Nullable
    public final Integer getStatsVersion() {
        return this.statsVersion;
    }

    public final int getStatusLevel() {
        return this.statusLevel;
    }

    public final int getStep() {
        return this.step;
    }

    public final int getStepGoal() {
        return this.stepGoal;
    }

    @Nullable
    public final Integer getSunshine() {
        return this.sunshine;
    }

    @Nullable
    public final Integer getSunshineGoal() {
        return this.sunshineGoal;
    }

    @Nullable
    public final String getTargetItemDisplayConfig() {
        return this.targetItemDisplayConfig;
    }

    @Nullable
    public final Integer getTodaySkipReason() {
        return this.todaySkipReason;
    }

    public final int getVitalityAvg() {
        return this.vitalityAvg;
    }

    public final int getVitalityGoal() {
        return this.vitalityGoal;
    }

    public final void setActivityCount(int i) {
        this.activityCount = i;
    }

    public final void setActivityCountGoal(int i) {
        this.activityCountGoal = i;
    }

    public final void setCalorie(@Nullable Integer num) {
        this.calorie = num;
    }

    public final void setCalorieGoal(@Nullable Integer num) {
        this.calorieGoal = num;
    }

    public final void setClientModel(@Nullable String str) {
        this.clientModel = str;
    }

    public final void setDataClient(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dataClient = str;
    }

    public final void setDate(int i) {
        this.date = i;
    }

    public final void setDisplay(int i) {
        this.display = i;
    }

    public final void setExercise(@Nullable Integer num) {
        this.exercise = num;
    }

    public final void setExerciseGoal(@Nullable Integer num) {
        this.exerciseGoal = num;
    }

    public final void setLevel(int i) {
        this.level = i;
    }

    public final void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
    }

    public final void setPhysicalMentalAvg(int i) {
        this.physicalMentalAvg = i;
    }

    public final void setProgress(int i) {
        this.progress = i;
    }

    public final void setRegularBedtime(@Nullable Integer num) {
        this.regularBedtime = num;
    }

    public final void setRegularBedtimeGoal(@Nullable Integer num) {
        this.regularBedtimeGoal = num;
    }

    public final void setRelaxDuration(int i) {
        this.relaxDuration = i;
    }

    public final void setRelaxDurationGoal(int i) {
        this.relaxDurationGoal = i;
    }

    public final void setShouldSkipToday(@Nullable Integer num) {
        this.shouldSkipToday = num;
    }

    public final void setSleepDuration(int i) {
        this.sleepDuration = i;
    }

    public final void setSleepDurationGoalMax(int i) {
        this.sleepDurationGoalMax = i;
    }

    public final void setSleepDurationGoalMin(int i) {
        this.sleepDurationGoalMin = i;
    }

    public final void setStatsVersion(@Nullable Integer num) {
        this.statsVersion = num;
    }

    public final void setStatusLevel(int i) {
        this.statusLevel = i;
    }

    public final void setStep(int i) {
        this.step = i;
    }

    public final void setStepGoal(int i) {
        this.stepGoal = i;
    }

    public final void setSunshine(@Nullable Integer num) {
        this.sunshine = num;
    }

    public final void setSunshineGoal(@Nullable Integer num) {
        this.sunshineGoal = num;
    }

    public final void setTargetItemDisplayConfig(@Nullable String str) {
        this.targetItemDisplayConfig = str;
    }

    public final void setTodaySkipReason(@Nullable Integer num) {
        this.todaySkipReason = num;
    }

    public final void setVitalityAvg(int i) {
        this.vitalityAvg = i;
    }

    public final void setVitalityGoal(int i) {
        this.vitalityGoal = i;
    }

    @NotNull
    public String toString() {
        return "PhysicalMentalAchievementPOJO(activityCount=" + this.activityCount + ", dataClient='" + this.dataClient + "', clientModel=" + this.clientModel + ", date=" + this.date + ", level=" + this.level + ", progress=" + this.progress + ", physicalMentalAvg=" + this.physicalMentalAvg + ", statusLevel=" + this.statusLevel + ", vitalityAvg=" + this.vitalityAvg + ", vitalityGoal=" + this.vitalityGoal + ", step=" + this.step + ", stepGoal=" + this.stepGoal + ", activityCountGoal=" + this.activityCountGoal + ", sleepDuration=" + this.sleepDuration + ", sleepDurationGoalMin=" + this.sleepDurationGoalMin + ", sleepDurationGoalMax=" + this.sleepDurationGoalMax + ", relaxDuration=" + this.relaxDuration + ", relaxDurationGoal=" + this.relaxDurationGoal + ", display=" + this.display + ", modifiedTimestamp=" + this.modifiedTimestamp + ", statsVersion=" + this.statsVersion + ", shouldSkipToday=" + this.shouldSkipToday + ", todaySkipReason=" + this.todaySkipReason + ", sunshine=" + this.sunshine + ", sunshineGoal=" + this.sunshineGoal + ", regularBedtime=" + this.regularBedtime + ", regularBedtimeGoal=" + this.regularBedtimeGoal + ", exercise=" + this.exercise + ", exerciseGoal=" + this.exerciseGoal + ", calorie=" + this.calorie + ", calorieGoal=" + this.calorieGoal + ", targetItemDisplayConfig=" + this.targetItemDisplayConfig + ")";
    }
}
