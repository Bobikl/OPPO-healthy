package com.heytap.databaseengine.model.physicalMental;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.databaseengineservice.db.table.phycialmental.DBPhysicalMentalAchievement;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Parcelize
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\bh\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0016¢\u0006\u0002\u0010\u0003BÑ\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0007\u0012\b\b\u0002\u0010 \u001a\u00020\u0007\u0012\b\b\u0002\u0010!\u001a\u00020\u0007\u0012\b\b\u0002\u0010\"\u001a\u00020\u0007\u0012\b\b\u0002\u0010#\u001a\u00020\u0007\u0012\b\b\u0002\u0010$\u001a\u00020\u0007\u0012\b\b\u0002\u0010%\u001a\u00020\u0007\u0012\b\b\u0002\u0010&\u001a\u00020\u0005¢\u0006\u0002\u0010'J\t\u0010l\u001a\u00020\u0007HÖ\u0001J\b\u0010m\u001a\u00020\u0005H\u0016J\b\u0010n\u001a\u00020\u0005H\u0016J\u000e\u0010o\u001a\u00020p2\u0006\u0010q\u001a\u00020\u0005J\b\u0010r\u001a\u00020\u0005H\u0016J\u0019\u0010s\u001a\u00020p2\u0006\u0010t\u001a\u00020u2\u0006\u0010v\u001a\u00020\u0007HÖ\u0001R\u001a\u0010\u0012\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u0010\u0013\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010)\"\u0004\b-\u0010+R\u001a\u0010$\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010)\"\u0004\b/\u0010+R\u001a\u0010%\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010)\"\u0004\b1\u0010+R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00103\"\u0004\b7\u00105R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010)\"\u0004\b9\u0010+R\u001a\u0010\u0019\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010)\"\u0004\b;\u0010+R\u001a\u0010\"\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010)\"\u0004\b=\u0010+R\u001a\u0010#\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010)\"\u0004\b?\u0010+R\u001a\u0010\n\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010)\"\u0004\bA\u0010+R\u001a\u0010\f\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010)\"\u0004\bC\u0010+R\u001a\u0010\u000b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010)\"\u0004\bE\u0010+R\u001a\u0010 \u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010)\"\u0004\bG\u0010+R\u001a\u0010!\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010)\"\u0004\bI\u0010+R\u001a\u0010\u0017\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010)\"\u0004\bK\u0010+R\u001a\u0010\u0018\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010)\"\u0004\bM\u0010+R\u001a\u0010\u001c\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010)\"\u0004\bO\u0010+R\u001a\u0010\u0014\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010)\"\u0004\bQ\u0010+R\u001a\u0010\u0016\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010)\"\u0004\bS\u0010+R\u001a\u0010\u0015\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010)\"\u0004\bU\u0010+R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010)\"\u0004\bW\u0010+R\u001a\u0010\r\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010)\"\u0004\bY\u0010+R\u001a\u0010\u0010\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010)\"\u0004\b[\u0010+R\u001a\u0010\u0011\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010)\"\u0004\b]\u0010+R\u001a\u0010\u001e\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010)\"\u0004\b_\u0010+R\u001a\u0010\u001f\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010)\"\u0004\ba\u0010+R\u001a\u0010\u001a\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u0010)\"\u0004\bc\u0010+R\u001a\u0010&\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bd\u00103\"\u0004\be\u00105R\u001a\u0010\u001d\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bf\u0010)\"\u0004\bg\u0010+R\u001a\u0010\u000e\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bh\u0010)\"\u0004\bi\u0010+R\u001a\u0010\u000f\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bj\u0010)\"\u0004\bk\u0010+¨\u0006w"}, d2 = {"Lcom/heytap/databaseengine/model/physicalMental/PhysicalMentalAchievement;", "Lcom/heytap/databaseengine/model/SportHealthData;", "Landroid/os/Parcelable;", "()V", "ssoid", "", "date", "", "dataClient", "clientModel", "level", "progress", "physicalMentalAvg", "statusLevel", "vitalityAvg", "vitalityGoal", "step", "stepGoal", "activityCount", "activityCountGoal", "sleepDuration", "sleepDurationGoalMin", "sleepDurationGoalMax", "relaxDuration", "relaxDurationGoal", "display", "syncStatus", "statsVersion", "shouldSkipToday", "todaySkipReason", DBPhysicalMentalAchievement.SUNSHINE, "sunshineGoal", "regularBedTime", "regularBedTimeGoal", DBPhysicalMentalAchievement.EXERCISE, "exerciseGoal", "calorie", "calorieGoal", "targetItemDisplay", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IIIIIIIIIIIIIIIIIIIIIIIIIIIILjava/lang/String;)V", "getActivityCount", "()I", "setActivityCount", "(I)V", "getActivityCountGoal", "setActivityCountGoal", "getCalorie", "setCalorie", "getCalorieGoal", "setCalorieGoal", "getClientModel", "()Ljava/lang/String;", "setClientModel", "(Ljava/lang/String;)V", "getDataClient", "setDataClient", "getDate", "setDate", "getDisplay", "setDisplay", "getExercise", "setExercise", "getExerciseGoal", "setExerciseGoal", "getLevel", "setLevel", "getPhysicalMentalAvg", "setPhysicalMentalAvg", "getProgress", ClickApiEntity.SET_PROGRESS, "getRegularBedTime", "setRegularBedTime", "getRegularBedTimeGoal", "setRegularBedTimeGoal", "getRelaxDuration", "setRelaxDuration", "getRelaxDurationGoal", "setRelaxDurationGoal", "getShouldSkipToday", "setShouldSkipToday", "getSleepDuration", "setSleepDuration", "getSleepDurationGoalMax", "setSleepDurationGoalMax", "getSleepDurationGoalMin", "setSleepDurationGoalMin", "getStatsVersion", "setStatsVersion", "getStatusLevel", "setStatusLevel", "getStep", "setStep", "getStepGoal", "setStepGoal", "getSunshine", "setSunshine", "getSunshineGoal", "setSunshineGoal", "getSyncStatus", "setSyncStatus", "getTargetItemDisplay", "setTargetItemDisplay", "getTodaySkipReason", "setTodaySkipReason", "getVitalityAvg", "setVitalityAvg", "getVitalityGoal", "setVitalityGoal", "describeContents", "getDeviceUniqueId", "getSsoid", "setSsoid", "", "mSsoid", "toString", "writeToParcel", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "databaseengine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PhysicalMentalAchievement extends SportHealthData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PhysicalMentalAchievement> CREATOR = new a();
    private int activityCount;
    private int activityCountGoal;
    private int calorie;
    private int calorieGoal;

    @Nullable
    private String clientModel;

    @NotNull
    private String dataClient;
    private int date;
    private int display;
    private int exercise;
    private int exerciseGoal;
    private int level;
    private int physicalMentalAvg;
    private int progress;
    private int regularBedTime;
    private int regularBedTimeGoal;
    private int relaxDuration;
    private int relaxDurationGoal;
    private int shouldSkipToday;
    private int sleepDuration;
    private int sleepDurationGoalMax;
    private int sleepDurationGoalMin;

    @NotNull
    private String ssoid;
    private int statsVersion;
    private int statusLevel;
    private int step;
    private int stepGoal;
    private int sunshine;
    private int sunshineGoal;
    private int syncStatus;

    @NotNull
    private String targetItemDisplay;
    private int todaySkipReason;
    private int vitalityAvg;
    private int vitalityGoal;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PhysicalMentalAchievement> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PhysicalMentalAchievement createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PhysicalMentalAchievement(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PhysicalMentalAchievement[] newArray(int i) {
            return new PhysicalMentalAchievement[i];
        }
    }

    public /* synthetic */ PhysicalMentalAchievement(String str, int i, String str2, String str3, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, String str4, int i30, int i31, DefaultConstructorMarker defaultConstructorMarker) {
        this((i30 & 1) != 0 ? "" : str, (i30 & 2) != 0 ? 0 : i, (i30 & 4) != 0 ? "" : str2, (i30 & 8) != 0 ? null : str3, (i30 & 16) != 0 ? 0 : i2, (i30 & 32) != 0 ? 0 : i3, (i30 & 64) != 0 ? 0 : i4, (i30 & 128) != 0 ? 0 : i5, (i30 & 256) != 0 ? 0 : i6, (i30 & 512) != 0 ? 0 : i7, (i30 & 1024) != 0 ? 0 : i8, (i30 & 2048) != 0 ? 0 : i9, (i30 & 4096) != 0 ? 0 : i10, (i30 & 8192) != 0 ? 0 : i11, (i30 & 16384) != 0 ? 0 : i12, (i30 & 32768) != 0 ? 0 : i13, (i30 & 65536) != 0 ? 0 : i14, (i30 & 131072) != 0 ? 0 : i15, (i30 & 262144) != 0 ? 0 : i16, (i30 & 524288) != 0 ? 1 : i17, (i30 & 1048576) != 0 ? 0 : i18, (i30 & 2097152) != 0 ? 0 : i19, (i30 & 4194304) != 0 ? 0 : i20, (i30 & 8388608) != 0 ? 0 : i21, (i30 & 16777216) != 0 ? 0 : i22, (i30 & 33554432) != 0 ? 0 : i23, (i30 & 67108864) != 0 ? 0 : i24, (i30 & 134217728) != 0 ? 0 : i25, (i30 & 268435456) != 0 ? 0 : i26, (i30 & 536870912) != 0 ? 0 : i27, (i30 & 1073741824) != 0 ? 0 : i28, (i30 & Integer.MIN_VALUE) != 0 ? 0 : i29, (i31 & 1) != 0 ? "" : str4);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int getActivityCount() {
        return this.activityCount;
    }

    public final int getActivityCountGoal() {
        return this.activityCountGoal;
    }

    public final int getCalorie() {
        return this.calorie;
    }

    public final int getCalorieGoal() {
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

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String getDeviceUniqueId() {
        return this.dataClient;
    }

    public final int getDisplay() {
        return this.display;
    }

    public final int getExercise() {
        return this.exercise;
    }

    public final int getExerciseGoal() {
        return this.exerciseGoal;
    }

    public final int getLevel() {
        return this.level;
    }

    public final int getPhysicalMentalAvg() {
        return this.physicalMentalAvg;
    }

    public final int getProgress() {
        return this.progress;
    }

    public final int getRegularBedTime() {
        return this.regularBedTime;
    }

    public final int getRegularBedTimeGoal() {
        return this.regularBedTimeGoal;
    }

    public final int getRelaxDuration() {
        return this.relaxDuration;
    }

    public final int getRelaxDurationGoal() {
        return this.relaxDurationGoal;
    }

    public final int getShouldSkipToday() {
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

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String getSsoid() {
        return this.ssoid;
    }

    public final int getStatsVersion() {
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

    public final int getSunshine() {
        return this.sunshine;
    }

    public final int getSunshineGoal() {
        return this.sunshineGoal;
    }

    public final int getSyncStatus() {
        return this.syncStatus;
    }

    @NotNull
    public final String getTargetItemDisplay() {
        return this.targetItemDisplay;
    }

    public final int getTodaySkipReason() {
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

    public final void setCalorie(int i) {
        this.calorie = i;
    }

    public final void setCalorieGoal(int i) {
        this.calorieGoal = i;
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

    public final void setExercise(int i) {
        this.exercise = i;
    }

    public final void setExerciseGoal(int i) {
        this.exerciseGoal = i;
    }

    public final void setLevel(int i) {
        this.level = i;
    }

    public final void setPhysicalMentalAvg(int i) {
        this.physicalMentalAvg = i;
    }

    public final void setProgress(int i) {
        this.progress = i;
    }

    public final void setRegularBedTime(int i) {
        this.regularBedTime = i;
    }

    public final void setRegularBedTimeGoal(int i) {
        this.regularBedTimeGoal = i;
    }

    public final void setRelaxDuration(int i) {
        this.relaxDuration = i;
    }

    public final void setRelaxDurationGoal(int i) {
        this.relaxDurationGoal = i;
    }

    public final void setShouldSkipToday(int i) {
        this.shouldSkipToday = i;
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

    public final void setSsoid(@NotNull String mSsoid) {
        Intrinsics.checkNotNullParameter(mSsoid, "mSsoid");
        this.ssoid = mSsoid;
    }

    public final void setStatsVersion(int i) {
        this.statsVersion = i;
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

    public final void setSunshine(int i) {
        this.sunshine = i;
    }

    public final void setSunshineGoal(int i) {
        this.sunshineGoal = i;
    }

    public final void setSyncStatus(int i) {
        this.syncStatus = i;
    }

    public final void setTargetItemDisplay(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.targetItemDisplay = str;
    }

    public final void setTodaySkipReason(int i) {
        this.todaySkipReason = i;
    }

    public final void setVitalityAvg(int i) {
        this.vitalityAvg = i;
    }

    public final void setVitalityGoal(int i) {
        this.vitalityGoal = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String toString() {
        return "PhysicalMentalAchievement(ssoid='" + this.ssoid + "', date=" + this.date + ", dataClient='" + this.dataClient + "', clientModel=" + this.clientModel + ", level=" + this.level + ", progress=" + this.progress + ", physicalMentalAvg=" + this.physicalMentalAvg + ", statusLevel=" + this.statusLevel + ", vitalityAvg=" + this.vitalityAvg + ", vitalityGoal=" + this.vitalityGoal + ", step=" + this.step + ", stepGoal=" + this.stepGoal + ", activityCount=" + this.activityCount + ", activityCountGoal=" + this.activityCountGoal + ", sleepDuration=" + this.sleepDuration + ", sleepDurationGoalMin=" + this.sleepDurationGoalMin + ", sleepDurationGoalMax=" + this.sleepDurationGoalMax + ", relaxDuration=" + this.relaxDuration + ", relaxDurationGoal=" + this.relaxDurationGoal + ", display=" + this.display + ", syncStatus=" + this.syncStatus + ", statsVersion=" + this.statsVersion + ", shouldSkipToday=" + this.shouldSkipToday + ", todaySkipReason=" + this.todaySkipReason + ", sunshine=" + this.sunshine + ", sunshineGoal=" + this.sunshineGoal + ", regularBedTime=" + this.regularBedTime + ", regularBedTimeGoal=" + this.regularBedTimeGoal + ", exercise=" + this.exercise + ", exerciseGoal=" + this.exerciseGoal + ", calorie=" + this.calorie + ", calorieGoal=" + this.calorieGoal + ", targetItemDisplay=" + this.targetItemDisplay + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.ssoid);
        parcel.writeInt(this.date);
        parcel.writeString(this.dataClient);
        parcel.writeString(this.clientModel);
        parcel.writeInt(this.level);
        parcel.writeInt(this.progress);
        parcel.writeInt(this.physicalMentalAvg);
        parcel.writeInt(this.statusLevel);
        parcel.writeInt(this.vitalityAvg);
        parcel.writeInt(this.vitalityGoal);
        parcel.writeInt(this.step);
        parcel.writeInt(this.stepGoal);
        parcel.writeInt(this.activityCount);
        parcel.writeInt(this.activityCountGoal);
        parcel.writeInt(this.sleepDuration);
        parcel.writeInt(this.sleepDurationGoalMin);
        parcel.writeInt(this.sleepDurationGoalMax);
        parcel.writeInt(this.relaxDuration);
        parcel.writeInt(this.relaxDurationGoal);
        parcel.writeInt(this.display);
        parcel.writeInt(this.syncStatus);
        parcel.writeInt(this.statsVersion);
        parcel.writeInt(this.shouldSkipToday);
        parcel.writeInt(this.todaySkipReason);
        parcel.writeInt(this.sunshine);
        parcel.writeInt(this.sunshineGoal);
        parcel.writeInt(this.regularBedTime);
        parcel.writeInt(this.regularBedTimeGoal);
        parcel.writeInt(this.exercise);
        parcel.writeInt(this.exerciseGoal);
        parcel.writeInt(this.calorie);
        parcel.writeInt(this.calorieGoal);
        parcel.writeString(this.targetItemDisplay);
    }

    public PhysicalMentalAchievement(@NotNull String ssoid, int i, @NotNull String dataClient, @Nullable String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, @NotNull String targetItemDisplay) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(dataClient, "dataClient");
        Intrinsics.checkNotNullParameter(targetItemDisplay, "targetItemDisplay");
        this.ssoid = ssoid;
        this.date = i;
        this.dataClient = dataClient;
        this.clientModel = str;
        this.level = i2;
        this.progress = i3;
        this.physicalMentalAvg = i4;
        this.statusLevel = i5;
        this.vitalityAvg = i6;
        this.vitalityGoal = i7;
        this.step = i8;
        this.stepGoal = i9;
        this.activityCount = i10;
        this.activityCountGoal = i11;
        this.sleepDuration = i12;
        this.sleepDurationGoalMin = i13;
        this.sleepDurationGoalMax = i14;
        this.relaxDuration = i15;
        this.relaxDurationGoal = i16;
        this.display = i17;
        this.syncStatus = i18;
        this.statsVersion = i19;
        this.shouldSkipToday = i20;
        this.todaySkipReason = i21;
        this.sunshine = i22;
        this.sunshineGoal = i23;
        this.regularBedTime = i24;
        this.regularBedTimeGoal = i25;
        this.exercise = i26;
        this.exerciseGoal = i27;
        this.calorie = i28;
        this.calorieGoal = i29;
        this.targetItemDisplay = targetItemDisplay;
    }

    public PhysicalMentalAchievement() {
        this("", 0, "", null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    }
}
