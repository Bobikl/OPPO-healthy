package com.heytap.databaseengineservice.db.table.phycialmental;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.health.operation.ecg.business.PdfViewActivity;
import com.oplus.aiunit.vision.tqg;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Parcelize
@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\bF\n\u0002\u0010\t\n\u0002\b0\b\u0007\u0018\u0000 \u0084\u00012\u00020\u00012\u00020\u0002:\u0002\u0085\u0001Bß\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\r\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0003\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010#\u001a\u00020\r\u0012\b\b\u0002\u0010&\u001a\u00020\r\u0012\b\b\u0002\u0010)\u001a\u00020\r\u0012\b\b\u0002\u0010,\u001a\u00020\r\u0012\b\b\u0002\u0010/\u001a\u00020\r\u0012\b\b\u0002\u00102\u001a\u00020\r\u0012\b\b\u0002\u00105\u001a\u00020\r\u0012\b\b\u0002\u00108\u001a\u00020\r\u0012\b\b\u0002\u0010;\u001a\u00020\r\u0012\b\b\u0002\u0010>\u001a\u00020\r\u0012\b\b\u0002\u0010A\u001a\u00020\r\u0012\b\b\u0002\u0010D\u001a\u00020\r\u0012\b\b\u0002\u0010G\u001a\u00020\r\u0012\b\b\u0002\u0010J\u001a\u00020\r\u0012\b\b\u0002\u0010M\u001a\u00020\r\u0012\b\b\u0002\u0010P\u001a\u00020\r\u0012\b\b\u0002\u0010S\u001a\u00020\r\u0012\b\b\u0002\u0010W\u001a\u00020V\u0012\b\b\u0002\u0010]\u001a\u00020\r\u0012\b\b\u0002\u0010`\u001a\u00020\r\u0012\b\b\u0002\u0010c\u001a\u00020\r\u0012\b\b\u0002\u0010f\u001a\u00020\r\u0012\b\b\u0002\u0010i\u001a\u00020\r\u0012\b\b\u0002\u0010l\u001a\u00020\r\u0012\b\b\u0002\u0010o\u001a\u00020\r\u0012\b\b\u0002\u0010r\u001a\u00020\r\u0012\b\b\u0002\u0010u\u001a\u00020\r\u0012\b\b\u0002\u0010x\u001a\u00020\r\u0012\b\b\u0002\u0010{\u001a\u00020\r\u0012\b\b\u0002\u0010~\u001a\u00020\u0003¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001B\u000b\b\u0016¢\u0006\u0006\b\u0081\u0001\u0010\u0083\u0001J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0003J\u0010\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0000J\b\u0010\f\u001a\u00020\u0003H\u0016J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0019\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\rHÖ\u0001R\u0016\u0010\u0013\u001a\u00020\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\"\u0010\u0015\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010 \u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010\u0014\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR\"\u0010#\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0016\u001a\u0004\b$\u0010\u0018\"\u0004\b%\u0010\u001aR\"\u0010&\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b&\u0010\u0016\u001a\u0004\b'\u0010\u0018\"\u0004\b(\u0010\u001aR\"\u0010)\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b)\u0010\u0016\u001a\u0004\b*\u0010\u0018\"\u0004\b+\u0010\u001aR\"\u0010,\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b,\u0010\u0016\u001a\u0004\b-\u0010\u0018\"\u0004\b.\u0010\u001aR\"\u0010/\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b/\u0010\u0016\u001a\u0004\b0\u0010\u0018\"\u0004\b1\u0010\u001aR\"\u00102\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b2\u0010\u0016\u001a\u0004\b3\u0010\u0018\"\u0004\b4\u0010\u001aR\"\u00105\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b5\u0010\u0016\u001a\u0004\b6\u0010\u0018\"\u0004\b7\u0010\u001aR\"\u00108\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b8\u0010\u0016\u001a\u0004\b9\u0010\u0018\"\u0004\b:\u0010\u001aR\"\u0010;\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b;\u0010\u0016\u001a\u0004\b<\u0010\u0018\"\u0004\b=\u0010\u001aR\"\u0010>\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b>\u0010\u0016\u001a\u0004\b?\u0010\u0018\"\u0004\b@\u0010\u001aR\"\u0010A\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bA\u0010\u0016\u001a\u0004\bB\u0010\u0018\"\u0004\bC\u0010\u001aR\"\u0010D\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bD\u0010\u0016\u001a\u0004\bE\u0010\u0018\"\u0004\bF\u0010\u001aR\"\u0010G\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bG\u0010\u0016\u001a\u0004\bH\u0010\u0018\"\u0004\bI\u0010\u001aR\"\u0010J\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bJ\u0010\u0016\u001a\u0004\bK\u0010\u0018\"\u0004\bL\u0010\u001aR\"\u0010M\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bM\u0010\u0016\u001a\u0004\bN\u0010\u0018\"\u0004\bO\u0010\u001aR\"\u0010P\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bP\u0010\u0016\u001a\u0004\bQ\u0010\u0018\"\u0004\bR\u0010\u001aR\"\u0010S\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bS\u0010\u0016\u001a\u0004\bT\u0010\u0018\"\u0004\bU\u0010\u001aR\"\u0010W\u001a\u00020V8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\"\u0010]\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b]\u0010\u0016\u001a\u0004\b^\u0010\u0018\"\u0004\b_\u0010\u001aR\"\u0010`\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b`\u0010\u0016\u001a\u0004\ba\u0010\u0018\"\u0004\bb\u0010\u001aR\"\u0010c\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bc\u0010\u0016\u001a\u0004\bd\u0010\u0018\"\u0004\be\u0010\u001aR\"\u0010f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bf\u0010\u0016\u001a\u0004\bg\u0010\u0018\"\u0004\bh\u0010\u001aR\"\u0010i\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bi\u0010\u0016\u001a\u0004\bj\u0010\u0018\"\u0004\bk\u0010\u001aR\"\u0010l\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bl\u0010\u0016\u001a\u0004\bm\u0010\u0018\"\u0004\bn\u0010\u001aR\"\u0010o\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bo\u0010\u0016\u001a\u0004\bp\u0010\u0018\"\u0004\bq\u0010\u001aR\"\u0010r\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\br\u0010\u0016\u001a\u0004\bs\u0010\u0018\"\u0004\bt\u0010\u001aR\"\u0010u\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bu\u0010\u0016\u001a\u0004\bv\u0010\u0018\"\u0004\bw\u0010\u001aR\"\u0010x\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bx\u0010\u0016\u001a\u0004\by\u0010\u0018\"\u0004\bz\u0010\u001aR\"\u0010{\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b{\u0010\u0016\u001a\u0004\b|\u0010\u0018\"\u0004\b}\u0010\u001aR#\u0010~\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0013\n\u0004\b~\u0010\u0014\u001a\u0004\b\u007f\u0010\u001d\"\u0005\b\u0080\u0001\u0010\u001f¨\u0006\u0086\u0001"}, d2 = {"Lcom/heytap/databaseengineservice/db/table/phycialmental/DBPhysicalMentalAchievement;", "Lcom/heytap/databaseengine/model/SportHealthData;", "Landroid/os/Parcelable;", "", "getSsoid", "getDeviceUniqueId", "mSsoid", "", "setSsoid", "mapValue", "", "sameValue", "toString", "", "describeContents", "Landroid/os/Parcel;", "parcel", UTraceSQLiteHelperKt.COL_FLAGS, "writeToParcel", "ssoid", "Ljava/lang/String;", "date", "I", "getDate", "()I", "setDate", "(I)V", "dataClient", "getDataClient", "()Ljava/lang/String;", "setDataClient", "(Ljava/lang/String;)V", "clientModel", "getClientModel", "setClientModel", "level", "getLevel", "setLevel", "progress", "getProgress", ClickApiEntity.SET_PROGRESS, "physicalMentalAvg", "getPhysicalMentalAvg", "setPhysicalMentalAvg", "statusLevel", "getStatusLevel", "setStatusLevel", "vitalityAvg", "getVitalityAvg", "setVitalityAvg", "vitalityGoal", "getVitalityGoal", "setVitalityGoal", "step", "getStep", "setStep", "stepGoal", "getStepGoal", "setStepGoal", "activityCount", "getActivityCount", "setActivityCount", "activityCountGoal", "getActivityCountGoal", "setActivityCountGoal", "sleepDuration", "getSleepDuration", "setSleepDuration", "sleepDurationGoalMin", "getSleepDurationGoalMin", "setSleepDurationGoalMin", "sleepDurationGoalMax", "getSleepDurationGoalMax", "setSleepDurationGoalMax", "relaxDuration", "getRelaxDuration", "setRelaxDuration", "relaxDurationGoal", "getRelaxDurationGoal", "setRelaxDurationGoal", "display", "getDisplay", "setDisplay", "syncStatus", "getSyncStatus", "setSyncStatus", "", "modifiedTimestamp", "J", "getModifiedTimestamp", "()J", "setModifiedTimestamp", "(J)V", "statsVersion", "getStatsVersion", "setStatsVersion", "shouldSkipToday", "getShouldSkipToday", "setShouldSkipToday", "todaySkipReason", "getTodaySkipReason", "setTodaySkipReason", DBPhysicalMentalAchievement.SUNSHINE, "getSunshine", "setSunshine", "sunshineGoal", "getSunshineGoal", "setSunshineGoal", "regularBedTime", "getRegularBedTime", "setRegularBedTime", "regularBedTimeGoal", "getRegularBedTimeGoal", "setRegularBedTimeGoal", DBPhysicalMentalAchievement.EXERCISE, "getExercise", "setExercise", "exerciseGoal", "getExerciseGoal", "setExerciseGoal", "calorie", "getCalorie", "setCalorie", "calorieGoal", "getCalorieGoal", "setCalorieGoal", "targetItemDisplay", "getTargetItemDisplay", "setTargetItemDisplay", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IIIIIIIIIIIIIIIIIJIIIIIIIIIIILjava/lang/String;)V", "()V", "Companion", "a", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
@Entity(primaryKeys = {"ssoid", "data_client", "date"}, tableName = DBPhysicalMentalAchievement.TABLE_NAME)
public final class DBPhysicalMentalAchievement extends SportHealthData implements Parcelable {

    @NotNull
    public static final String ACTIVITY_COUNT = "activity_count";

    @NotNull
    public static final String ACTIVITY_COUNT_GOAL = "activity_count_goal";

    @NotNull
    public static final String CALORIE = "calorie";

    @NotNull
    public static final String CALORIE_GOAL = "calorie_goal";

    @NotNull
    public static final String CLIENT_MODEL = "client_model";

    @NotNull
    public static final String DATA_CLIENT = "data_client";

    @NotNull
    public static final String DATE = "date";

    @NotNull
    public static final String DISPLAY = "display";

    @NotNull
    public static final String EXERCISE = "exercise";

    @NotNull
    public static final String EXERCISE_GOAL = "exercise_goal";

    @NotNull
    public static final String LEVEL = "level";

    @NotNull
    public static final String MODIFIED_TIMESTAMP = "modified_timestamp";

    @NotNull
    public static final String PHYSICAL_MENTAL_AVG = "physical_mental_avg";

    @NotNull
    public static final String PROGRESS = "progress";

    @NotNull
    public static final String REGULAR_BED_TIME = "regular_bed_time";

    @NotNull
    public static final String REGULAR_BED_TIME_GOAL = "regular_bed_time_goal";

    @NotNull
    public static final String RELAX_DURATION = "relax_duration";

    @NotNull
    public static final String RELAX_DURATION_GOAL = "relax_duration_goal";

    @NotNull
    public static final String SHOULD_SKIP_TODAY = "should_skip_today";

    @NotNull
    public static final String SLEEP_DURATION = "sleep_duration";

    @NotNull
    public static final String SLEEP_DURATION_GOAL_MAX = "sleep_duration_goal_max";

    @NotNull
    public static final String SLEEP_DURATION_GOAL_MIN = "sleep_duration_goal_min";

    @NotNull
    public static final String SSOID = "ssoid";

    @NotNull
    public static final String STATS_VERSION = "stats_version";

    @NotNull
    public static final String STATUS_LEVEL = "status_level";

    @NotNull
    public static final String STEP = "step";

    @NotNull
    public static final String STEP_GOAL = "step_goal";

    @NotNull
    public static final String SUNSHINE = "sunshine";

    @NotNull
    public static final String SUNSHINE_GOAL = "sunshine_goal";

    @NotNull
    public static final String SYNC_STATUS = "sync_status";

    @NotNull
    public static final String TABLE_NAME = "DBPhysicalMentalAchievement";

    @NotNull
    public static final String TARGET_ITEM_DISPLAY = "target_item_display";

    @NotNull
    public static final String TODAY_SKIP_REASON = "today_skip_reason";

    @NotNull
    public static final String VITALITY_AVG = "vitality_avg";

    @NotNull
    public static final String VITALITY_GOAL = "vitality_goal";

    @ColumnInfo(name = ACTIVITY_COUNT)
    private int activityCount;

    @ColumnInfo(name = ACTIVITY_COUNT_GOAL)
    private int activityCountGoal;

    @ColumnInfo(name = "calorie")
    private int calorie;

    @ColumnInfo(name = "calorie_goal")
    private int calorieGoal;

    @ColumnInfo(name = "client_model")
    @Nullable
    private String clientModel;

    @ColumnInfo(name = "data_client")
    @NotNull
    private String dataClient;

    @ColumnInfo(name = "date")
    private int date;

    @ColumnInfo(name = "display")
    private int display;

    @ColumnInfo(name = EXERCISE)
    private int exercise;

    @ColumnInfo(name = EXERCISE_GOAL)
    private int exerciseGoal;

    @ColumnInfo(name = "level")
    private int level;

    @ColumnInfo(name = "modified_timestamp")
    private long modifiedTimestamp;

    @ColumnInfo(name = PHYSICAL_MENTAL_AVG)
    private int physicalMentalAvg;

    @ColumnInfo(name = "progress")
    private int progress;

    @ColumnInfo(name = REGULAR_BED_TIME)
    private int regularBedTime;

    @ColumnInfo(name = REGULAR_BED_TIME_GOAL)
    private int regularBedTimeGoal;

    @ColumnInfo(name = RELAX_DURATION)
    private int relaxDuration;

    @ColumnInfo(name = RELAX_DURATION_GOAL)
    private int relaxDurationGoal;

    @ColumnInfo(name = SHOULD_SKIP_TODAY)
    private int shouldSkipToday;

    @ColumnInfo(name = SLEEP_DURATION)
    private int sleepDuration;

    @ColumnInfo(name = SLEEP_DURATION_GOAL_MAX)
    private int sleepDurationGoalMax;

    @ColumnInfo(name = SLEEP_DURATION_GOAL_MIN)
    private int sleepDurationGoalMin;

    @ColumnInfo(name = "ssoid")
    @NotNull
    private String ssoid;

    @ColumnInfo(name = STATS_VERSION)
    private int statsVersion;

    @ColumnInfo(name = STATUS_LEVEL)
    private int statusLevel;

    @ColumnInfo(name = "step")
    private int step;

    @ColumnInfo(name = "step_goal")
    private int stepGoal;

    @ColumnInfo(name = SUNSHINE)
    private int sunshine;

    @ColumnInfo(name = SUNSHINE_GOAL)
    private int sunshineGoal;

    @ColumnInfo(name = "sync_status")
    private int syncStatus;

    @ColumnInfo(name = TARGET_ITEM_DISPLAY)
    @NotNull
    private String targetItemDisplay;

    @ColumnInfo(name = TODAY_SKIP_REASON)
    private int todaySkipReason;

    @ColumnInfo(name = VITALITY_AVG)
    private int vitalityAvg;

    @ColumnInfo(name = VITALITY_GOAL)
    private int vitalityGoal;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<DBPhysicalMentalAchievement> CREATOR = new b();

    /* JADX INFO: renamed from: com.heytap.databaseengineservice.db.table.phycialmental.DBPhysicalMentalAchievement$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b(\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b(\u0010)J\b\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0005R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0005R\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0005R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0005R\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0005R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0005R\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0005R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0005R\u0014\u0010\u0014\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0005R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0005R\u0014\u0010\u0016\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0005R\u0014\u0010\u0017\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0005R\u0014\u0010\u0018\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0005R\u0014\u0010\u0019\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0005R\u0014\u0010\u001a\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0005R\u0014\u0010\u001b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0005R\u0014\u0010\u001c\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0005R\u0014\u0010\u001d\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0005R\u0014\u0010\u001e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0005R\u0014\u0010\u001f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0005R\u0014\u0010 \u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0005R\u0014\u0010!\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u0005R\u0014\u0010\"\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0005R\u0014\u0010#\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u0005R\u0014\u0010$\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u0005R\u0014\u0010%\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\u0005R\u0014\u0010&\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u0005R\u0014\u0010'\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\u0005¨\u0006*"}, d2 = {"Lcom/heytap/databaseengineservice/db/table/phycialmental/DBPhysicalMentalAchievement$a;", "", "", "a", "ACTIVITY_COUNT", "Ljava/lang/String;", "ACTIVITY_COUNT_GOAL", "CALORIE", "CALORIE_GOAL", "CLIENT_MODEL", "DATA_CLIENT", "DATE", "DISPLAY", "EXERCISE", "EXERCISE_GOAL", "LEVEL", "MODIFIED_TIMESTAMP", "PHYSICAL_MENTAL_AVG", "PROGRESS", "REGULAR_BED_TIME", "REGULAR_BED_TIME_GOAL", "RELAX_DURATION", "RELAX_DURATION_GOAL", "SHOULD_SKIP_TODAY", "SLEEP_DURATION", "SLEEP_DURATION_GOAL_MAX", "SLEEP_DURATION_GOAL_MIN", PdfViewActivity.SSOID, "STATS_VERSION", "STATUS_LEVEL", "STEP", tqg.STEP_GOAL_EVENT, "SUNSHINE", "SUNSHINE_GOAL", "SYNC_STATUS", "TABLE_NAME", "TARGET_ITEM_DISPLAY", "TODAY_SKIP_REASON", "VITALITY_AVG", "VITALITY_GOAL", "<init>", "()V", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final String a() {
            String str = "create table if not exists DBPhysicalMentalAchievement(ssoid TEXT not null,data_client TEXT not null,client_model TEXT,date INTEGER not null,level INTEGER not null,progress INTEGER not null,physical_mental_avg INTEGER not null,status_level INTEGER not null,vitality_avg INTEGER not null,vitality_goal INTEGER not null,step INTEGER not null,step_goal INTEGER not null,activity_count INTEGER not null,activity_count_goal INTEGER not null,sleep_duration INTEGER not null,sleep_duration_goal_min INTEGER not null,sleep_duration_goal_max INTEGER not null,relax_duration INTEGER not null,relax_duration_goal INTEGER not null,display INTEGER not null,sync_status INTEGER not null,modified_timestamp INTEGER not null,primary key(ssoid,data_client,date))";
            Intrinsics.checkNotNullExpressionValue(str, "strSql.toString()");
            return str;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<DBPhysicalMentalAchievement> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DBPhysicalMentalAchievement createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DBPhysicalMentalAchievement(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final DBPhysicalMentalAchievement[] newArray(int i) {
            return new DBPhysicalMentalAchievement[i];
        }
    }

    public /* synthetic */ DBPhysicalMentalAchievement(String str, int i, String str2, String str3, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, long j2, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, String str4, int i30, int i31, DefaultConstructorMarker defaultConstructorMarker) {
        this((i30 & 1) != 0 ? "" : str, (i30 & 2) != 0 ? 0 : i, (i30 & 4) != 0 ? "" : str2, (i30 & 8) != 0 ? null : str3, (i30 & 16) != 0 ? 0 : i2, (i30 & 32) != 0 ? 0 : i3, (i30 & 64) != 0 ? 0 : i4, (i30 & 128) != 0 ? 0 : i5, (i30 & 256) != 0 ? 0 : i6, (i30 & 512) != 0 ? 0 : i7, (i30 & 1024) != 0 ? 0 : i8, (i30 & 2048) != 0 ? 0 : i9, (i30 & 4096) != 0 ? 0 : i10, (i30 & 8192) != 0 ? 0 : i11, (i30 & 16384) != 0 ? 0 : i12, (i30 & 32768) != 0 ? 0 : i13, (i30 & 65536) != 0 ? 0 : i14, (i30 & 131072) != 0 ? 0 : i15, (i30 & 262144) != 0 ? 0 : i16, (i30 & 524288) != 0 ? 1 : i17, (i30 & 1048576) != 0 ? 0 : i18, (i30 & 2097152) != 0 ? 0L : j2, (i30 & 4194304) != 0 ? 0 : i19, (i30 & 8388608) != 0 ? 0 : i20, (i30 & 16777216) != 0 ? 0 : i21, (i30 & 33554432) != 0 ? 0 : i22, (i30 & 67108864) != 0 ? 0 : i23, (i30 & 134217728) != 0 ? 0 : i24, (i30 & 268435456) != 0 ? 0 : i25, (i30 & 536870912) != 0 ? 0 : i26, (i30 & 1073741824) != 0 ? 0 : i27, (i30 & Integer.MIN_VALUE) != 0 ? 0 : i28, (i31 & 1) != 0 ? 0 : i29, (i31 & 2) != 0 ? "" : str4);
    }

    @JvmStatic
    @NotNull
    public static final String createTable() {
        return INSTANCE.a();
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

    public final long getModifiedTimestamp() {
        return this.modifiedTimestamp;
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

    public final boolean sameValue(@Nullable DBPhysicalMentalAchievement mapValue) {
        return mapValue != null && this.physicalMentalAvg == mapValue.physicalMentalAvg && this.level == mapValue.level && this.progress == mapValue.progress && this.statusLevel == mapValue.statusLevel && this.vitalityAvg == mapValue.vitalityAvg && this.vitalityGoal == mapValue.vitalityGoal && this.step == mapValue.step && this.stepGoal == mapValue.stepGoal && this.activityCount == mapValue.activityCount && this.activityCountGoal == mapValue.activityCountGoal && this.sleepDuration == mapValue.sleepDuration && this.sleepDurationGoalMin == mapValue.sleepDurationGoalMin && this.sleepDurationGoalMax == mapValue.sleepDurationGoalMax && this.relaxDuration == mapValue.relaxDuration && this.relaxDurationGoal == mapValue.relaxDurationGoal && this.statsVersion == mapValue.statsVersion && this.shouldSkipToday == mapValue.shouldSkipToday && this.todaySkipReason == mapValue.todaySkipReason && this.sunshine == mapValue.sunshine && this.sunshineGoal == mapValue.sunshineGoal && this.regularBedTime == mapValue.regularBedTime && this.regularBedTimeGoal == mapValue.regularBedTimeGoal && this.exercise == mapValue.exercise && this.exerciseGoal == mapValue.exerciseGoal && this.calorie == mapValue.calorie && this.calorieGoal == mapValue.calorieGoal && Intrinsics.areEqual(this.targetItemDisplay, mapValue.targetItemDisplay);
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

    public final void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
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
        return "DBPhysicalMentalAchievement(ssoid='" + this.ssoid + "', date=" + this.date + ", dataClient='" + this.dataClient + "', clientModel=" + this.clientModel + ", level=" + this.level + ", progress=" + this.progress + ", physicalMentalAvg=" + this.physicalMentalAvg + ", statusLevel=" + this.statusLevel + ", vitalityAvg=" + this.vitalityAvg + ", vitalityGoal=" + this.vitalityGoal + ", step=" + this.step + ", stepGoal=" + this.stepGoal + ", activityCount=" + this.activityCount + ", activityCountGoal=" + this.activityCountGoal + ", sleepDuration=" + this.sleepDuration + ", sleepDurationGoalMin=" + this.sleepDurationGoalMin + ", sleepDurationGoalMax=" + this.sleepDurationGoalMax + ", relaxDuration=" + this.relaxDuration + ", relaxDurationGoal=" + this.relaxDurationGoal + ", display=" + this.display + ", syncStatus=" + this.syncStatus + ", modifiedTimestamp=" + this.modifiedTimestamp + ", statsVersion=" + this.statsVersion + ", shouldSkipToday=" + this.shouldSkipToday + ", todaySkipReason=" + this.todaySkipReason + ", sunshine=" + this.sunshine + ", sunshineGoal=" + this.sunshineGoal + ", regularBedTime=" + this.regularBedTime + ", regularBedTimeGoal=" + this.regularBedTimeGoal + ", exercise=" + this.exercise + ", exerciseGoal=" + this.exerciseGoal + ", calorie=" + this.calorie + ", calorieGoal=" + this.calorieGoal + ", targetItemDisplay=" + this.targetItemDisplay + ")";
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
        parcel.writeLong(this.modifiedTimestamp);
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

    public DBPhysicalMentalAchievement(@NotNull String ssoid, int i, @NotNull String dataClient, @Nullable String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, long j2, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, @NotNull String targetItemDisplay) {
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
        this.modifiedTimestamp = j2;
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

    public DBPhysicalMentalAchievement() {
        this("", 0, "", null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0L, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    }
}
