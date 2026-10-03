package com.heytap.databaseengineservice.db.table.phycialmental;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.health.operation.ecg.business.PdfViewActivity;
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
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\t\n\u0002\b?\b\u0007\u0018\u0000 o2\u00020\u00012\u00020\u0002:\u0001pB\u0097\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\r\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0003\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010#\u001a\u00020\r\u0012\b\b\u0002\u0010&\u001a\u00020\r\u0012\b\b\u0002\u0010)\u001a\u00020\r\u0012\b\b\u0002\u0010,\u001a\u00020\r\u0012\b\b\u0002\u0010/\u001a\u00020\r\u0012\b\b\u0002\u00103\u001a\u000202\u0012\b\b\u0002\u00109\u001a\u00020\r\u0012\b\b\u0002\u0010<\u001a\u000202\u0012\b\b\u0002\u0010?\u001a\u00020\r\u0012\b\b\u0002\u0010B\u001a\u00020\r\u0012\b\b\u0002\u0010E\u001a\u00020\r\u0012\b\b\u0002\u0010H\u001a\u00020\r\u0012\b\b\u0002\u0010K\u001a\u00020\r\u0012\b\b\u0002\u0010N\u001a\u00020\r\u0012\b\b\u0002\u0010Q\u001a\u00020\r\u0012\b\b\u0002\u0010T\u001a\u00020\r\u0012\b\b\u0002\u0010W\u001a\u00020\r\u0012\b\b\u0002\u0010Z\u001a\u00020\r\u0012\b\b\u0002\u0010]\u001a\u00020\r\u0012\b\b\u0002\u0010`\u001a\u00020\r\u0012\b\b\u0002\u0010c\u001a\u00020\r\u0012\b\b\u0002\u0010f\u001a\u00020\r\u0012\b\b\u0002\u0010i\u001a\u000202¢\u0006\u0004\bl\u0010mB\t\b\u0016¢\u0006\u0004\bl\u0010nJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0003J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0000J\b\u0010\f\u001a\u00020\u0003H\u0016J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0019\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\rHÖ\u0001R\u0016\u0010\u0013\u001a\u00020\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\"\u0010\u0015\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010 \u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010\u0014\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR\"\u0010#\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0016\u001a\u0004\b$\u0010\u0018\"\u0004\b%\u0010\u001aR\"\u0010&\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b&\u0010\u0016\u001a\u0004\b'\u0010\u0018\"\u0004\b(\u0010\u001aR\"\u0010)\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b)\u0010\u0016\u001a\u0004\b*\u0010\u0018\"\u0004\b+\u0010\u001aR\"\u0010,\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b,\u0010\u0016\u001a\u0004\b-\u0010\u0018\"\u0004\b.\u0010\u001aR\"\u0010/\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b/\u0010\u0016\u001a\u0004\b0\u0010\u0018\"\u0004\b1\u0010\u001aR\"\u00103\u001a\u0002028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u00109\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b9\u0010\u0016\u001a\u0004\b:\u0010\u0018\"\u0004\b;\u0010\u001aR\"\u0010<\u001a\u0002028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b<\u00104\u001a\u0004\b=\u00106\"\u0004\b>\u00108R\"\u0010?\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b?\u0010\u0016\u001a\u0004\b@\u0010\u0018\"\u0004\bA\u0010\u001aR\"\u0010B\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bB\u0010\u0016\u001a\u0004\bC\u0010\u0018\"\u0004\bD\u0010\u001aR\"\u0010E\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bE\u0010\u0016\u001a\u0004\bF\u0010\u0018\"\u0004\bG\u0010\u001aR\"\u0010H\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bH\u0010\u0016\u001a\u0004\bI\u0010\u0018\"\u0004\bJ\u0010\u001aR\"\u0010K\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bK\u0010\u0016\u001a\u0004\bL\u0010\u0018\"\u0004\bM\u0010\u001aR\"\u0010N\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bN\u0010\u0016\u001a\u0004\bO\u0010\u0018\"\u0004\bP\u0010\u001aR\"\u0010Q\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bQ\u0010\u0016\u001a\u0004\bR\u0010\u0018\"\u0004\bS\u0010\u001aR\"\u0010T\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bT\u0010\u0016\u001a\u0004\bU\u0010\u0018\"\u0004\bV\u0010\u001aR\"\u0010W\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bW\u0010\u0016\u001a\u0004\bX\u0010\u0018\"\u0004\bY\u0010\u001aR\"\u0010Z\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bZ\u0010\u0016\u001a\u0004\b[\u0010\u0018\"\u0004\b\\\u0010\u001aR\"\u0010]\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b]\u0010\u0016\u001a\u0004\b^\u0010\u0018\"\u0004\b_\u0010\u001aR\"\u0010`\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b`\u0010\u0016\u001a\u0004\ba\u0010\u0018\"\u0004\bb\u0010\u001aR\"\u0010c\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bc\u0010\u0016\u001a\u0004\bd\u0010\u0018\"\u0004\be\u0010\u001aR\"\u0010f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bf\u0010\u0016\u001a\u0004\bg\u0010\u0018\"\u0004\bh\u0010\u001aR\"\u0010i\u001a\u0002028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bi\u00104\u001a\u0004\bj\u00106\"\u0004\bk\u00108¨\u0006q"}, d2 = {"Lcom/heytap/databaseengineservice/db/table/phycialmental/DBPhysicalMentalStat;", "Lcom/heytap/databaseengine/model/SportHealthData;", "Landroid/os/Parcelable;", "", "getSsoid", "getDeviceUniqueId", "mSsoid", "", "setSsoid", "newData", "", "sameValue", "toString", "", "describeContents", "Landroid/os/Parcel;", "parcel", UTraceSQLiteHelperKt.COL_FLAGS, "writeToParcel", "ssoid", "Ljava/lang/String;", "date", "I", "getDate", "()I", "setDate", "(I)V", "dataClient", "getDataClient", "()Ljava/lang/String;", "setDataClient", "(Ljava/lang/String;)V", "clientModel", "getClientModel", "setClientModel", "avgHrv", "getAvgHrv", "setAvgHrv", "minHrv", "getMinHrv", "setMinHrv", "maxHrv", "getMaxHrv", "setMaxHrv", "avgStress", "getAvgStress", "setAvgStress", "minStress", "getMinStress", "setMinStress", "", "minStressTimestamp", "J", "getMinStressTimestamp", "()J", "setMinStressTimestamp", "(J)V", "maxStress", "getMaxStress", "setMaxStress", "maxStressTimestamp", "getMaxStressTimestamp", "setMaxStressTimestamp", "stressState", "getStressState", "setStressState", "baseLineLow", "getBaseLineLow", "setBaseLineLow", "baseLineMiddle", "getBaseLineMiddle", "setBaseLineMiddle", "baseLineHigh", "getBaseLineHigh", "setBaseLineHigh", "baseHrv", "getBaseHrv", "setBaseHrv", "avgSleepHrv", "getAvgSleepHrv", "setAvgSleepHrv", "minSleepHrv", "getMinSleepHrv", "setMinSleepHrv", "maxSleepHrv", "getMaxSleepHrv", "setMaxSleepHrv", "hrvReasonableRangeLow", "getHrvReasonableRangeLow", "setHrvReasonableRangeLow", "hrvReasonableRangeHigh", "getHrvReasonableRangeHigh", "setHrvReasonableRangeHigh", "avgRestingHeartRate", "getAvgRestingHeartRate", "setAvgRestingHeartRate", "stressReminder", "getStressReminder", "setStressReminder", "display", "getDisplay", "setDisplay", "syncStatus", "getSyncStatus", "setSyncStatus", "modifiedTimestamp", "getModifiedTimestamp", "setModifiedTimestamp", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IIIIIJIJIIIIIIIIIIIIIIJ)V", "()V", "Companion", "a", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
@Entity(primaryKeys = {"ssoid", "data_client", "date"}, tableName = DBPhysicalMentalStat.TABLE_NAME)
public final class DBPhysicalMentalStat extends SportHealthData implements Parcelable {

    @NotNull
    public static final String AVG_HRV = "avg_hrv";

    @NotNull
    public static final String AVG_RESTING_HEART_RATE = "avg_resting_heart_rate";

    @NotNull
    public static final String AVG_SLEEP_HRV = "avg_sleep_hrv";

    @NotNull
    public static final String AVG_STRESS = "avg_stress";

    @NotNull
    public static final String BASELINE_HIGH = "baseline_high";

    @NotNull
    public static final String BASELINE_LOW = "baseline_low";

    @NotNull
    public static final String BASELINE_MIDDLE = "baseline_middle";

    @NotNull
    public static final String BASE_HRV = "base_hrv";

    @NotNull
    public static final String CLIENT_MODEL = "client_model";

    @NotNull
    public static final String DATA_CLIENT = "data_client";

    @NotNull
    public static final String DATE = "date";

    @NotNull
    public static final String DISPLAY = "display";

    @NotNull
    public static final String HRV_REASONABLE_RANGE_HIGH = "hrv_reasonable_range_high";

    @NotNull
    public static final String HRV_REASONABLE_RANGE_LOW = "hrv_reasonable_range_low";

    @NotNull
    public static final String MAX_HRV = "max_hrv";

    @NotNull
    public static final String MAX_SLEEP_HRV = "max_sleep_hrv";

    @NotNull
    public static final String MAX_STRESS = "max_stress";

    @NotNull
    public static final String MAX_STRESS_TIMESTAMP = "max_stress_timestamp";

    @NotNull
    public static final String MIN_HRV = "min_hrv";

    @NotNull
    public static final String MIN_SLEEP_HRV = "min_sleep_hrv";

    @NotNull
    public static final String MIN_STRESS = "min_stress";

    @NotNull
    public static final String MIN_STRESS_TIMESTAMP = "min_stress_timestamp";

    @NotNull
    public static final String MODIFIED_TIMESTAMP = "modified_timestamp";

    @NotNull
    public static final String SSOID = "ssoid";

    @NotNull
    public static final String STRESS_REMINDER = "stress_reminder";

    @NotNull
    public static final String STRESS_STATE = "stress_state";

    @NotNull
    public static final String SYNC_STATUS = "sync_status";

    @NotNull
    public static final String TABLE_NAME = "DBPhysicalMentalStat";

    @ColumnInfo(name = AVG_HRV)
    private int avgHrv;

    @ColumnInfo(name = AVG_RESTING_HEART_RATE)
    private int avgRestingHeartRate;

    @ColumnInfo(name = AVG_SLEEP_HRV)
    private int avgSleepHrv;

    @ColumnInfo(name = AVG_STRESS)
    private int avgStress;

    @ColumnInfo(name = BASE_HRV)
    private int baseHrv;

    @ColumnInfo(name = BASELINE_HIGH)
    private int baseLineHigh;

    @ColumnInfo(name = BASELINE_LOW)
    private int baseLineLow;

    @ColumnInfo(name = BASELINE_MIDDLE)
    private int baseLineMiddle;

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

    @ColumnInfo(name = HRV_REASONABLE_RANGE_HIGH)
    private int hrvReasonableRangeHigh;

    @ColumnInfo(name = HRV_REASONABLE_RANGE_LOW)
    private int hrvReasonableRangeLow;

    @ColumnInfo(name = MAX_HRV)
    private int maxHrv;

    @ColumnInfo(name = MAX_SLEEP_HRV)
    private int maxSleepHrv;

    @ColumnInfo(name = MAX_STRESS)
    private int maxStress;

    @ColumnInfo(name = MAX_STRESS_TIMESTAMP)
    private long maxStressTimestamp;

    @ColumnInfo(name = MIN_HRV)
    private int minHrv;

    @ColumnInfo(name = MIN_SLEEP_HRV)
    private int minSleepHrv;

    @ColumnInfo(name = MIN_STRESS)
    private int minStress;

    @ColumnInfo(name = MIN_STRESS_TIMESTAMP)
    private long minStressTimestamp;

    @ColumnInfo(name = "modified_timestamp")
    private long modifiedTimestamp;

    @ColumnInfo(name = "ssoid")
    @NotNull
    private String ssoid;

    @ColumnInfo(name = STRESS_REMINDER)
    private int stressReminder;

    @ColumnInfo(name = "stress_state")
    private int stressState;

    @ColumnInfo(name = "sync_status")
    private int syncStatus;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<DBPhysicalMentalStat> CREATOR = new b();

    /* JADX INFO: renamed from: com.heytap.databaseengineservice.db.table.phycialmental.DBPhysicalMentalStat$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b!\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b!\u0010\"J\b\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0005R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0005R\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0005R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0005R\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0005R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0005R\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0005R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0005R\u0014\u0010\u0014\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0005R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0005R\u0014\u0010\u0016\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0005R\u0014\u0010\u0017\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0005R\u0014\u0010\u0018\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0005R\u0014\u0010\u0019\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0005R\u0014\u0010\u001a\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0005R\u0014\u0010\u001b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0005R\u0014\u0010\u001c\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0005R\u0014\u0010\u001d\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0005R\u0014\u0010\u001e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0005R\u0014\u0010\u001f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0005R\u0014\u0010 \u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0005¨\u0006#"}, d2 = {"Lcom/heytap/databaseengineservice/db/table/phycialmental/DBPhysicalMentalStat$a;", "", "", "a", "AVG_HRV", "Ljava/lang/String;", "AVG_RESTING_HEART_RATE", "AVG_SLEEP_HRV", "AVG_STRESS", "BASELINE_HIGH", "BASELINE_LOW", "BASELINE_MIDDLE", "BASE_HRV", "CLIENT_MODEL", "DATA_CLIENT", "DATE", "DISPLAY", "HRV_REASONABLE_RANGE_HIGH", "HRV_REASONABLE_RANGE_LOW", "MAX_HRV", "MAX_SLEEP_HRV", "MAX_STRESS", "MAX_STRESS_TIMESTAMP", "MIN_HRV", "MIN_SLEEP_HRV", "MIN_STRESS", "MIN_STRESS_TIMESTAMP", "MODIFIED_TIMESTAMP", PdfViewActivity.SSOID, "STRESS_REMINDER", "STRESS_STATE", "SYNC_STATUS", "TABLE_NAME", "<init>", "()V", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final String a() {
            String str = "create table if not exists DBPhysicalMentalStat(ssoid TEXT not null,data_client TEXT not null,client_model TEXT,date INTEGER not null,avg_hrv INTEGER not null,min_hrv INTEGER not null,max_hrv INTEGER not null,avg_stress INTEGER not null,min_stress INTEGER not null,max_stress INTEGER not null,stress_state INTEGER not null,baseline_low INTEGER not null,baseline_middle INTEGER not null,baseline_high INTEGER not null,base_hrv INTEGER not null,avg_sleep_hrv INTEGER not null,min_sleep_hrv INTEGER not null,max_sleep_hrv INTEGER not null,hrv_reasonable_range_low INTEGER not null,hrv_reasonable_range_high INTEGER not null,avg_resting_heart_rate INTEGER not null,stress_reminder INTEGER not null,display INTEGER not null,sync_status INTEGER not null,modified_timestamp INTEGER not null,primary key(ssoid,data_client,date))";
            Intrinsics.checkNotNullExpressionValue(str, "strSql.toString()");
            return str;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<DBPhysicalMentalStat> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DBPhysicalMentalStat createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DBPhysicalMentalStat(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readLong(), parcel.readInt(), parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final DBPhysicalMentalStat[] newArray(int i) {
            return new DBPhysicalMentalStat[i];
        }
    }

    public /* synthetic */ DBPhysicalMentalStat(String str, int i, String str2, String str3, int i2, int i3, int i4, int i5, int i6, long j2, int i7, long j3, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, long j4, int i22, DefaultConstructorMarker defaultConstructorMarker) {
        this((i22 & 1) != 0 ? "" : str, (i22 & 2) != 0 ? 0 : i, (i22 & 4) == 0 ? str2 : "", (i22 & 8) != 0 ? null : str3, (i22 & 16) != 0 ? 0 : i2, (i22 & 32) != 0 ? 0 : i3, (i22 & 64) != 0 ? 0 : i4, (i22 & 128) != 0 ? 0 : i5, (i22 & 256) != 0 ? 0 : i6, (i22 & 512) != 0 ? 0L : j2, (i22 & 1024) != 0 ? 0 : i7, (i22 & 2048) != 0 ? 0L : j3, (i22 & 4096) != 0 ? 0 : i8, (i22 & 8192) != 0 ? 0 : i9, (i22 & 16384) != 0 ? 0 : i10, (i22 & 32768) != 0 ? 0 : i11, (i22 & 65536) != 0 ? 0 : i12, (i22 & 131072) != 0 ? 0 : i13, (i22 & 262144) != 0 ? 0 : i14, (i22 & 524288) != 0 ? 0 : i15, (i22 & 1048576) != 0 ? 0 : i16, (i22 & 2097152) != 0 ? 0 : i17, (i22 & 4194304) != 0 ? 0 : i18, (i22 & 8388608) != 0 ? 0 : i19, (i22 & 16777216) != 0 ? 1 : i20, (i22 & 33554432) != 0 ? 0 : i21, (i22 & 67108864) != 0 ? 0L : j4);
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

    public final int getAvgHrv() {
        return this.avgHrv;
    }

    public final int getAvgRestingHeartRate() {
        return this.avgRestingHeartRate;
    }

    public final int getAvgSleepHrv() {
        return this.avgSleepHrv;
    }

    public final int getAvgStress() {
        return this.avgStress;
    }

    public final int getBaseHrv() {
        return this.baseHrv;
    }

    public final int getBaseLineHigh() {
        return this.baseLineHigh;
    }

    public final int getBaseLineLow() {
        return this.baseLineLow;
    }

    public final int getBaseLineMiddle() {
        return this.baseLineMiddle;
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

    public final int getHrvReasonableRangeHigh() {
        return this.hrvReasonableRangeHigh;
    }

    public final int getHrvReasonableRangeLow() {
        return this.hrvReasonableRangeLow;
    }

    public final int getMaxHrv() {
        return this.maxHrv;
    }

    public final int getMaxSleepHrv() {
        return this.maxSleepHrv;
    }

    public final int getMaxStress() {
        return this.maxStress;
    }

    public final long getMaxStressTimestamp() {
        return this.maxStressTimestamp;
    }

    public final int getMinHrv() {
        return this.minHrv;
    }

    public final int getMinSleepHrv() {
        return this.minSleepHrv;
    }

    public final int getMinStress() {
        return this.minStress;
    }

    public final long getMinStressTimestamp() {
        return this.minStressTimestamp;
    }

    public final long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String getSsoid() {
        return this.ssoid;
    }

    public final int getStressReminder() {
        return this.stressReminder;
    }

    public final int getStressState() {
        return this.stressState;
    }

    public final int getSyncStatus() {
        return this.syncStatus;
    }

    public final boolean sameValue(@NotNull DBPhysicalMentalStat newData) {
        Intrinsics.checkNotNullParameter(newData, "newData");
        return this.avgHrv == newData.avgHrv && this.minHrv == newData.minHrv && this.maxHrv == newData.maxHrv && this.avgStress == newData.avgStress && this.minStress == newData.minStress && this.minStressTimestamp == newData.minStressTimestamp && this.maxStress == newData.maxStress && this.maxStressTimestamp == newData.maxStressTimestamp && this.stressState == newData.stressState && this.baseLineLow == newData.baseLineLow && this.baseLineMiddle == newData.baseLineMiddle && this.baseLineHigh == newData.baseLineHigh && this.baseHrv == newData.baseHrv && this.avgSleepHrv == newData.avgSleepHrv && this.minSleepHrv == newData.minSleepHrv && this.maxSleepHrv == newData.maxSleepHrv && this.hrvReasonableRangeLow == newData.hrvReasonableRangeLow && this.hrvReasonableRangeHigh == newData.hrvReasonableRangeHigh && this.avgRestingHeartRate == newData.avgRestingHeartRate && this.stressReminder == newData.stressReminder && this.modifiedTimestamp == newData.modifiedTimestamp;
    }

    public final void setAvgHrv(int i) {
        this.avgHrv = i;
    }

    public final void setAvgRestingHeartRate(int i) {
        this.avgRestingHeartRate = i;
    }

    public final void setAvgSleepHrv(int i) {
        this.avgSleepHrv = i;
    }

    public final void setAvgStress(int i) {
        this.avgStress = i;
    }

    public final void setBaseHrv(int i) {
        this.baseHrv = i;
    }

    public final void setBaseLineHigh(int i) {
        this.baseLineHigh = i;
    }

    public final void setBaseLineLow(int i) {
        this.baseLineLow = i;
    }

    public final void setBaseLineMiddle(int i) {
        this.baseLineMiddle = i;
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

    public final void setHrvReasonableRangeHigh(int i) {
        this.hrvReasonableRangeHigh = i;
    }

    public final void setHrvReasonableRangeLow(int i) {
        this.hrvReasonableRangeLow = i;
    }

    public final void setMaxHrv(int i) {
        this.maxHrv = i;
    }

    public final void setMaxSleepHrv(int i) {
        this.maxSleepHrv = i;
    }

    public final void setMaxStress(int i) {
        this.maxStress = i;
    }

    public final void setMaxStressTimestamp(long j2) {
        this.maxStressTimestamp = j2;
    }

    public final void setMinHrv(int i) {
        this.minHrv = i;
    }

    public final void setMinSleepHrv(int i) {
        this.minSleepHrv = i;
    }

    public final void setMinStress(int i) {
        this.minStress = i;
    }

    public final void setMinStressTimestamp(long j2) {
        this.minStressTimestamp = j2;
    }

    public final void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
    }

    public final void setSsoid(@NotNull String mSsoid) {
        Intrinsics.checkNotNullParameter(mSsoid, "mSsoid");
        this.ssoid = mSsoid;
    }

    public final void setStressReminder(int i) {
        this.stressReminder = i;
    }

    public final void setStressState(int i) {
        this.stressState = i;
    }

    public final void setSyncStatus(int i) {
        this.syncStatus = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String toString() {
        return "DBPhysicalMentalStat(ssoid='" + this.ssoid + "', date=" + this.date + ", dataClient='" + this.dataClient + "', clientModel=" + this.clientModel + ", avgHrv=" + this.avgHrv + ", minHrv=" + this.minHrv + ", maxHrv=" + this.maxHrv + ", avgStress=" + this.avgStress + ", minStress=" + this.minStress + ", minStressTimestamp=" + this.minStressTimestamp + ", maxStress=" + this.maxStress + ", maxStressTimestamp=" + this.maxStressTimestamp + ", stressState=" + this.stressState + ", baseLineLow=" + this.baseLineLow + ", baseLineMiddle=" + this.baseLineMiddle + ", baseLineHigh=" + this.baseLineHigh + ", baseHrv=" + this.baseHrv + ", avgSleepHrv=" + this.avgSleepHrv + ", minSleepHrv=" + this.minSleepHrv + ", maxSleepHrv=" + this.maxSleepHrv + ", hrvReasonableRangeLow=" + this.hrvReasonableRangeLow + ", hrvReasonableRangeHigh=" + this.hrvReasonableRangeHigh + ", avgRestingHeartRate=" + this.avgRestingHeartRate + ", stressReminder=" + this.stressReminder + ", display=" + this.display + ", syncStatus=" + this.syncStatus + ", modifiedTimestamp=" + this.modifiedTimestamp + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.ssoid);
        parcel.writeInt(this.date);
        parcel.writeString(this.dataClient);
        parcel.writeString(this.clientModel);
        parcel.writeInt(this.avgHrv);
        parcel.writeInt(this.minHrv);
        parcel.writeInt(this.maxHrv);
        parcel.writeInt(this.avgStress);
        parcel.writeInt(this.minStress);
        parcel.writeLong(this.minStressTimestamp);
        parcel.writeInt(this.maxStress);
        parcel.writeLong(this.maxStressTimestamp);
        parcel.writeInt(this.stressState);
        parcel.writeInt(this.baseLineLow);
        parcel.writeInt(this.baseLineMiddle);
        parcel.writeInt(this.baseLineHigh);
        parcel.writeInt(this.baseHrv);
        parcel.writeInt(this.avgSleepHrv);
        parcel.writeInt(this.minSleepHrv);
        parcel.writeInt(this.maxSleepHrv);
        parcel.writeInt(this.hrvReasonableRangeLow);
        parcel.writeInt(this.hrvReasonableRangeHigh);
        parcel.writeInt(this.avgRestingHeartRate);
        parcel.writeInt(this.stressReminder);
        parcel.writeInt(this.display);
        parcel.writeInt(this.syncStatus);
        parcel.writeLong(this.modifiedTimestamp);
    }

    public DBPhysicalMentalStat(@NotNull String ssoid, int i, @NotNull String dataClient, @Nullable String str, int i2, int i3, int i4, int i5, int i6, long j2, int i7, long j3, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, long j4) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(dataClient, "dataClient");
        this.ssoid = ssoid;
        this.date = i;
        this.dataClient = dataClient;
        this.clientModel = str;
        this.avgHrv = i2;
        this.minHrv = i3;
        this.maxHrv = i4;
        this.avgStress = i5;
        this.minStress = i6;
        this.minStressTimestamp = j2;
        this.maxStress = i7;
        this.maxStressTimestamp = j3;
        this.stressState = i8;
        this.baseLineLow = i9;
        this.baseLineMiddle = i10;
        this.baseLineHigh = i11;
        this.baseHrv = i12;
        this.avgSleepHrv = i13;
        this.minSleepHrv = i14;
        this.maxSleepHrv = i15;
        this.hrvReasonableRangeLow = i16;
        this.hrvReasonableRangeHigh = i17;
        this.avgRestingHeartRate = i18;
        this.stressReminder = i19;
        this.display = i20;
        this.syncStatus = i21;
        this.modifiedTimestamp = j4;
    }

    public DBPhysicalMentalStat() {
        this("", 0, "", null, 0, 0, 0, 0, 0, 0L, 0, 0L, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0L);
    }
}
