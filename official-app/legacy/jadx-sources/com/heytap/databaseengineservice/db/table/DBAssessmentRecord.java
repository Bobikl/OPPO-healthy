package com.heytap.databaseengineservice.db.table;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import com.heytap.databaseengine.apiv2.health.HeytapHealthParams;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.health.core.widget.charts.RecordCombinedLineChart;
import com.heytap.health.operation.ecg.business.PdfViewActivity;
import com.oplus.aiunit.vision.t04;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Entity(primaryKeys = {"ssoid", DBAssessmentRecord.DEVICE_UNIQUE_ID, DBAssessmentRecord.ECG_ID}, tableName = DBAssessmentRecord.TABLE_NAME)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u0007\n\u0002\bT\b\u0007\u0018\u0000 \u0084\u00012\u00020\u00012\u00020\u0002:\u0002\u0085\u0001B\u000b\b\u0016¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001B\u0014\b\u0016\u0012\u0007\u0010\u0082\u0001\u001a\u00020\u0015¢\u0006\u0006\b\u0080\u0001\u0010\u0083\u0001J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003J\b\u0010\b\u001a\u00020\u0003H\u0016J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0003J\b\u0010\f\u001a\u00020\u000bH\u0016J\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000bJ\b\u0010\u000f\u001a\u00020\u000bH\u0016J\u000e\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000bJ\b\u0010\u0012\u001a\u00020\u0003H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\u0018\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0013H\u0016R\u0016\u0010\u0005\u001a\u00020\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0016\u0010\t\u001a\u00020\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0019R\u0016\u0010\r\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001aR\u0016\u0010\u0010\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001aR$\u0010\u001b\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010!\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 R$\u0010$\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001c\u001a\u0004\b%\u0010\u001e\"\u0004\b&\u0010 R\"\u0010'\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0019\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R$\u0010,\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b,\u0010\u001c\u001a\u0004\b-\u0010\u001e\"\u0004\b.\u0010 R$\u0010/\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b/\u0010\u001c\u001a\u0004\b0\u0010\u001e\"\u0004\b1\u0010 R$\u00103\u001a\u0004\u0018\u0001028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u00109\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b9\u0010\u0019\u001a\u0004\b:\u0010)\"\u0004\b;\u0010+R$\u0010<\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b<\u0010\u0019\u001a\u0004\b=\u0010)\"\u0004\b>\u0010+R$\u0010?\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b?\u0010\u001c\u001a\u0004\b@\u0010\u001e\"\u0004\bA\u0010 R$\u0010B\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bB\u0010\u0019\u001a\u0004\bC\u0010)\"\u0004\bD\u0010+R$\u0010E\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bE\u0010\u001c\u001a\u0004\bF\u0010\u001e\"\u0004\bG\u0010 R$\u0010H\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bH\u0010\u0019\u001a\u0004\bI\u0010)\"\u0004\bJ\u0010+R$\u0010K\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bK\u0010\u001c\u001a\u0004\bL\u0010\u001e\"\u0004\bM\u0010 R$\u0010N\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bN\u0010\u0019\u001a\u0004\bO\u0010)\"\u0004\bP\u0010+R$\u0010Q\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bQ\u0010\u0019\u001a\u0004\bR\u0010)\"\u0004\bS\u0010+R$\u0010T\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bT\u0010\u0019\u001a\u0004\bU\u0010)\"\u0004\bV\u0010+R$\u0010W\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bW\u0010\u0019\u001a\u0004\bX\u0010)\"\u0004\bY\u0010+R$\u0010Z\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bZ\u0010\u0019\u001a\u0004\b[\u0010)\"\u0004\b\\\u0010+R$\u0010]\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b]\u0010\u0019\u001a\u0004\b^\u0010)\"\u0004\b_\u0010+R$\u0010`\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b`\u0010\u0019\u001a\u0004\ba\u0010)\"\u0004\bb\u0010+R$\u0010c\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bc\u0010\u0019\u001a\u0004\bd\u0010)\"\u0004\be\u0010+R$\u0010f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bf\u0010\u0019\u001a\u0004\bg\u0010)\"\u0004\bh\u0010+R$\u0010i\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bi\u0010\u0019\u001a\u0004\bj\u0010)\"\u0004\bk\u0010+R$\u0010l\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bl\u0010\u0019\u001a\u0004\bm\u0010)\"\u0004\bn\u0010+R$\u0010o\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bo\u0010\u0019\u001a\u0004\bp\u0010)\"\u0004\bq\u0010+R$\u0010r\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\br\u0010\u0019\u001a\u0004\bs\u0010)\"\u0004\bt\u0010+R\"\u0010u\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bu\u0010v\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR\"\u0010{\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b{\u0010\u001a\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007f¨\u0006\u0086\u0001"}, d2 = {"Lcom/heytap/databaseengineservice/db/table/DBAssessmentRecord;", "Lcom/heytap/databaseengine/model/SportHealthData;", "Landroid/os/Parcelable;", "", "getSsoid", "ssoid", "", "setSsoid", "getDeviceUniqueId", t04.DEVICE_UNIQUE_ID, "setDeviceUniqueId", "", "getStartTimestamp", "startTimestamp", "setStartTimestamp", "getEndTimestamp", "endTimestamp", "setEndTimestamp", "toString", "", "describeContents", "Landroid/os/Parcel;", "dest", UTraceSQLiteHelperKt.COL_FLAGS, "writeToParcel", "Ljava/lang/String;", "J", RecordCombinedLineChart.KEY_HEART_RATE, "Ljava/lang/Integer;", "getHeartRate", "()Ljava/lang/Integer;", "setHeartRate", "(Ljava/lang/Integer;)V", "stress", "getStress", "setStress", DBAssessmentRecord.SPO2, "getSpo2", "setSpo2", "ecgId", "getEcgId", "()Ljava/lang/String;", "setEcgId", "(Ljava/lang/String;)V", "ecgDiagnosisResults", "getEcgDiagnosisResults", "setEcgDiagnosisResults", "degreeVascularElasticity", "getDegreeVascularElasticity", "setDegreeVascularElasticity", "", DBAssessmentRecord.PWV, "Ljava/lang/Float;", "getPwv", "()Ljava/lang/Float;", "setPwv", "(Ljava/lang/Float;)V", "pwvId", "getPwvId", "setPwvId", "validMeasurementItems", "getValidMeasurementItems", "setValidMeasurementItems", "totalMeasurementItems", "getTotalMeasurementItems", "setTotalMeasurementItems", "focusMeasurementItems", "getFocusMeasurementItems", "setFocusMeasurementItems", "version", "getVersion", "setVersion", "extra", "getExtra", "setExtra", "del", "getDel", "setDel", "userBodyInfo", "getUserBodyInfo", "setUserBodyInfo", "wristTemperatureInfo", "getWristTemperatureInfo", "setWristTemperatureInfo", "singleSleepInfo", "getSingleSleepInfo", "setSingleSleepInfo", "singleOsaInfo", "getSingleOsaInfo", "setSingleOsaInfo", "sleepCrossAnalysis", "getSleepCrossAnalysis", "setSleepCrossAnalysis", "tempCrossAnalysis", "getTempCrossAnalysis", "setTempCrossAnalysis", "snoreAnalysis", "getSnoreAnalysis", "setSnoreAnalysis", "scoreAnalysis", "getScoreAnalysis", "setScoreAnalysis", "cardioHistoryInfo", "getCardioHistoryInfo", "setCardioHistoryInfo", "vascularAgeInfo", "getVascularAgeInfo", "setVascularAgeInfo", "bloodPressureInfo", "getBloodPressureInfo", "setBloodPressureInfo", "bodyRecoveryInfo", "getBodyRecoveryInfo", "setBodyRecoveryInfo", "hrvInfo", "getHrvInfo", "setHrvInfo", "syncStatus", "I", "getSyncStatus", "()I", "setSyncStatus", "(I)V", "modifiedTimestamp", "getModifiedTimestamp", "()J", "setModifiedTimestamp", "(J)V", "<init>", "()V", "in", "(Landroid/os/Parcel;)V", "CREATOR", "a", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
public final class DBAssessmentRecord extends SportHealthData implements Parcelable {

    @NotNull
    public static final String BLOOD_PRESSURE_INFO = "blood_pressure_info";

    @NotNull
    public static final String BODY_RECOVERY_INFO = "body_recovery_info";

    @NotNull
    public static final String CARDIO_HISTORY_INFO = "cardio_history_info";

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String DEGREE_VASCULAR_ELASTICITY = "degree_vascular_elasticity";

    @NotNull
    public static final String DEL = "del";

    @NotNull
    public static final String DEVICE_UNIQUE_ID = "device_unique_id";

    @NotNull
    public static final String ECG_DIAGNOSIS_RESULTS = "ecg_diagnosis_results";

    @NotNull
    public static final String ECG_ID = "ecg_id";

    @NotNull
    public static final String END_TIMESTAMP = "end_timestamp";

    @NotNull
    public static final String EXTRA = "extra";

    @NotNull
    public static final String FOCUS_MEASUREMENT_ITEMS = "focus_measurement_items";

    @NotNull
    public static final String HEART_RATE = "heart_rate";

    @NotNull
    public static final String HRV_INFO = "hrv_info";

    @NotNull
    public static final String MODIFIED_TIMESTAMP = "modified_timestamp";

    @NotNull
    public static final String PWV = "pwv";

    @NotNull
    public static final String PWV_ID = "pwv_id";

    @NotNull
    public static final String SCORE_ANALYSIS = "score_analysis";

    @NotNull
    public static final String SINGLE_OSA_INFO = "single_osa_info";

    @NotNull
    public static final String SINGLE_SLEEP_INFO = "single_sleep_info";

    @NotNull
    public static final String SLEEP_CROSS_ANALYSIS = "sleep_cross_analysis";

    @NotNull
    public static final String SNORE_ANALYSIS = "snore_analysis";

    @NotNull
    public static final String SPO2 = "spo2";

    @NotNull
    public static final String SSOID = "ssoid";

    @NotNull
    public static final String START_TIMESTAMP = "start_timestamp";

    @NotNull
    public static final String STRESS = "stress";

    @NotNull
    public static final String SYNC_STATUS = "sync_status";

    @NotNull
    public static final String TABLE_NAME = "DBAssessmentRecord";

    @NotNull
    public static final String TEMP_CROSS_ANALYSIS = "temp_cross_analysis";

    @NotNull
    public static final String TOTAL_MEASUREMENT_ITEMS = "total_measurement_items";

    @NotNull
    public static final String USER_BODY_INFO = "user_body_info";

    @NotNull
    public static final String VALID_MEASUREMENT_ITEMS = "valid_measurement_items";

    @NotNull
    public static final String VASCULAR_AGE_INFO = "vascular_age_info";

    @NotNull
    public static final String VERSION = "version";

    @NotNull
    public static final String WRIST_TEMPERATURE_INFO = "wrist_temperature_info";

    @ColumnInfo(name = BLOOD_PRESSURE_INFO)
    @Nullable
    private String bloodPressureInfo;

    @ColumnInfo(name = BODY_RECOVERY_INFO)
    @Nullable
    private String bodyRecoveryInfo;

    @ColumnInfo(name = CARDIO_HISTORY_INFO)
    @Nullable
    private String cardioHistoryInfo;

    @ColumnInfo(name = DEGREE_VASCULAR_ELASTICITY)
    @Nullable
    private Integer degreeVascularElasticity;

    @ColumnInfo(name = "del")
    @Nullable
    private Integer del;

    @ColumnInfo(name = DEVICE_UNIQUE_ID)
    @NotNull
    private String deviceUniqueId;

    @ColumnInfo(name = ECG_DIAGNOSIS_RESULTS)
    @Nullable
    private Integer ecgDiagnosisResults;

    @ColumnInfo(name = ECG_ID)
    @NotNull
    private String ecgId;

    @ColumnInfo(name = "end_timestamp")
    private long endTimestamp;

    @ColumnInfo(name = "extra")
    @Nullable
    private String extra;

    @ColumnInfo(name = FOCUS_MEASUREMENT_ITEMS)
    @Nullable
    private String focusMeasurementItems;

    @ColumnInfo(name = "heart_rate")
    @Nullable
    private Integer heartRate;

    @ColumnInfo(name = HRV_INFO)
    @Nullable
    private String hrvInfo;

    @ColumnInfo(name = "modified_timestamp")
    private long modifiedTimestamp;

    @ColumnInfo(name = PWV)
    @Nullable
    private Float pwv;

    @ColumnInfo(name = PWV_ID)
    @NotNull
    private String pwvId;

    @ColumnInfo(name = SCORE_ANALYSIS)
    @Nullable
    private String scoreAnalysis;

    @ColumnInfo(name = SINGLE_OSA_INFO)
    @Nullable
    private String singleOsaInfo;

    @ColumnInfo(name = SINGLE_SLEEP_INFO)
    @Nullable
    private String singleSleepInfo;

    @ColumnInfo(name = SLEEP_CROSS_ANALYSIS)
    @Nullable
    private String sleepCrossAnalysis;

    @ColumnInfo(name = SNORE_ANALYSIS)
    @Nullable
    private String snoreAnalysis;

    @ColumnInfo(name = SPO2)
    @Nullable
    private Integer spo2;

    @ColumnInfo(name = "ssoid")
    @NotNull
    private String ssoid;

    @ColumnInfo(name = "start_timestamp")
    private long startTimestamp;

    @ColumnInfo(name = "stress")
    @Nullable
    private Integer stress;

    @ColumnInfo(name = "sync_status")
    private int syncStatus;

    @ColumnInfo(name = TEMP_CROSS_ANALYSIS)
    @Nullable
    private String tempCrossAnalysis;

    @ColumnInfo(name = TOTAL_MEASUREMENT_ITEMS)
    @Nullable
    private Integer totalMeasurementItems;

    @ColumnInfo(name = USER_BODY_INFO)
    @Nullable
    private String userBodyInfo;

    @ColumnInfo(name = VALID_MEASUREMENT_ITEMS)
    @Nullable
    private String validMeasurementItems;

    @ColumnInfo(name = VASCULAR_AGE_INFO)
    @Nullable
    private String vascularAgeInfo;

    @ColumnInfo(name = "version")
    @Nullable
    private Integer version;

    @ColumnInfo(name = WRIST_TEMPERATURE_INFO)
    @Nullable
    private String wristTemperatureInfo;

    /* JADX INFO: renamed from: com.heytap.databaseengineservice.db.table.DBAssessmentRecord$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b(\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b0\u00101J\u0006\u0010\u0004\u001a\u00020\u0003J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001f\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000eR\u0014\u0010\u0014\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000eR\u0014\u0010\u0015\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000eR\u0014\u0010\u0016\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u000eR\u0014\u0010\u0017\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u000eR\u0014\u0010\u0018\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u000eR\u0014\u0010\u0019\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u000eR\u0014\u0010\u001a\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u000eR\u0014\u0010\u001b\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u000eR\u0014\u0010\u001c\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u000eR\u0014\u0010\u001d\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u000eR\u0014\u0010\u001e\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u000eR\u0014\u0010\u001f\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u000eR\u0014\u0010 \u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u000eR\u0014\u0010!\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u000eR\u0014\u0010\"\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u000eR\u0014\u0010#\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u000eR\u0014\u0010$\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u000eR\u0014\u0010%\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\u000eR\u0014\u0010&\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u000eR\u0014\u0010'\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\u000eR\u0014\u0010(\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010\u000eR\u0014\u0010)\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010\u000eR\u0014\u0010*\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010\u000eR\u0014\u0010+\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010\u000eR\u0014\u0010,\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b,\u0010\u000eR\u0014\u0010-\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b-\u0010\u000eR\u0014\u0010.\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b.\u0010\u000eR\u0014\u0010/\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b/\u0010\u000e¨\u00062"}, d2 = {"Lcom/heytap/databaseengineservice/db/table/DBAssessmentRecord$a;", "Landroid/os/Parcelable$Creator;", "Lcom/heytap/databaseengineservice/db/table/DBAssessmentRecord;", "", "b", "Landroid/os/Parcel;", "parcel", "a", "", "size", "", "c", "(I)[Lcom/heytap/databaseengineservice/db/table/DBAssessmentRecord;", "BLOOD_PRESSURE_INFO", "Ljava/lang/String;", "BODY_RECOVERY_INFO", "CARDIO_HISTORY_INFO", "DEGREE_VASCULAR_ELASTICITY", "DEL", "DEVICE_UNIQUE_ID", "ECG_DIAGNOSIS_RESULTS", "ECG_ID", "END_TIMESTAMP", "EXTRA", "FOCUS_MEASUREMENT_ITEMS", HeytapHealthParams.HEART_RATE, "HRV_INFO", "MODIFIED_TIMESTAMP", "PWV", "PWV_ID", "SCORE_ANALYSIS", "SINGLE_OSA_INFO", "SINGLE_SLEEP_INFO", "SLEEP_CROSS_ANALYSIS", "SNORE_ANALYSIS", HeytapHealthParams.SPO2, PdfViewActivity.SSOID, "START_TIMESTAMP", "STRESS", "SYNC_STATUS", "TABLE_NAME", "TEMP_CROSS_ANALYSIS", "TOTAL_MEASUREMENT_ITEMS", "USER_BODY_INFO", "VALID_MEASUREMENT_ITEMS", "VASCULAR_AGE_INFO", "VERSION", "WRIST_TEMPERATURE_INFO", "<init>", "()V", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion implements Parcelable.Creator<DBAssessmentRecord> {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DBAssessmentRecord createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DBAssessmentRecord(parcel);
        }

        @NotNull
        public final String b() {
            String str = "create table if not exists DBAssessmentRecord (ssoid TEXT not null,device_unique_id TEXT not null,start_timestamp INTEGER not null,end_timestamp INTEGER not null,heart_rate INTEGER,stress INTEGER,spo2 INTEGER,ecg_id TEXT not null,ecg_diagnosis_results INTEGER,degree_vascular_elasticity INTEGER,pwv REAL,pwv_id TEXT not null,valid_measurement_items TEXT,total_measurement_items INTEGER,focus_measurement_items TEXT,version INTEGER,extra TEXT,del INTEGER,sync_status INTEGER not null,modified_timestamp INTEGER not null,primary key(ssoid," + DBAssessmentRecord.DEVICE_UNIQUE_ID + "," + DBAssessmentRecord.ECG_ID + "))";
            Intrinsics.checkNotNullExpressionValue(str, "strSql.toString()");
            return str;
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public DBAssessmentRecord[] newArray(int size) {
            return new DBAssessmentRecord[size];
        }
    }

    public DBAssessmentRecord() {
        this.ssoid = "";
        this.deviceUniqueId = "";
        this.ecgId = "";
        this.pwvId = "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final String getBloodPressureInfo() {
        return this.bloodPressureInfo;
    }

    @Nullable
    public final String getBodyRecoveryInfo() {
        return this.bodyRecoveryInfo;
    }

    @Nullable
    public final String getCardioHistoryInfo() {
        return this.cardioHistoryInfo;
    }

    @Nullable
    public final Integer getDegreeVascularElasticity() {
        return this.degreeVascularElasticity;
    }

    @Nullable
    public final Integer getDel() {
        return this.del;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    @Nullable
    public final Integer getEcgDiagnosisResults() {
        return this.ecgDiagnosisResults;
    }

    @NotNull
    public final String getEcgId() {
        return this.ecgId;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public long getEndTimestamp() {
        return this.endTimestamp;
    }

    @Nullable
    public final String getExtra() {
        return this.extra;
    }

    @Nullable
    public final String getFocusMeasurementItems() {
        return this.focusMeasurementItems;
    }

    @Nullable
    public final Integer getHeartRate() {
        return this.heartRate;
    }

    @Nullable
    public final String getHrvInfo() {
        return this.hrvInfo;
    }

    public final long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    @Nullable
    public final Float getPwv() {
        return this.pwv;
    }

    @NotNull
    public final String getPwvId() {
        return this.pwvId;
    }

    @Nullable
    public final String getScoreAnalysis() {
        return this.scoreAnalysis;
    }

    @Nullable
    public final String getSingleOsaInfo() {
        return this.singleOsaInfo;
    }

    @Nullable
    public final String getSingleSleepInfo() {
        return this.singleSleepInfo;
    }

    @Nullable
    public final String getSleepCrossAnalysis() {
        return this.sleepCrossAnalysis;
    }

    @Nullable
    public final String getSnoreAnalysis() {
        return this.snoreAnalysis;
    }

    @Nullable
    public final Integer getSpo2() {
        return this.spo2;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String getSsoid() {
        return this.ssoid;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public long getStartTimestamp() {
        return this.startTimestamp;
    }

    @Nullable
    public final Integer getStress() {
        return this.stress;
    }

    public final int getSyncStatus() {
        return this.syncStatus;
    }

    @Nullable
    public final String getTempCrossAnalysis() {
        return this.tempCrossAnalysis;
    }

    @Nullable
    public final Integer getTotalMeasurementItems() {
        return this.totalMeasurementItems;
    }

    @Nullable
    public final String getUserBodyInfo() {
        return this.userBodyInfo;
    }

    @Nullable
    public final String getValidMeasurementItems() {
        return this.validMeasurementItems;
    }

    @Nullable
    public final String getVascularAgeInfo() {
        return this.vascularAgeInfo;
    }

    @Nullable
    public final Integer getVersion() {
        return this.version;
    }

    @Nullable
    public final String getWristTemperatureInfo() {
        return this.wristTemperatureInfo;
    }

    public final void setBloodPressureInfo(@Nullable String str) {
        this.bloodPressureInfo = str;
    }

    public final void setBodyRecoveryInfo(@Nullable String str) {
        this.bodyRecoveryInfo = str;
    }

    public final void setCardioHistoryInfo(@Nullable String str) {
        this.cardioHistoryInfo = str;
    }

    public final void setDegreeVascularElasticity(@Nullable Integer num) {
        this.degreeVascularElasticity = num;
    }

    public final void setDel(@Nullable Integer num) {
        this.del = num;
    }

    public final void setDeviceUniqueId(@NotNull String deviceUniqueId) {
        Intrinsics.checkNotNullParameter(deviceUniqueId, "deviceUniqueId");
        this.deviceUniqueId = deviceUniqueId;
    }

    public final void setEcgDiagnosisResults(@Nullable Integer num) {
        this.ecgDiagnosisResults = num;
    }

    public final void setEcgId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.ecgId = str;
    }

    public final void setEndTimestamp(long endTimestamp) {
        this.endTimestamp = endTimestamp;
    }

    public final void setExtra(@Nullable String str) {
        this.extra = str;
    }

    public final void setFocusMeasurementItems(@Nullable String str) {
        this.focusMeasurementItems = str;
    }

    public final void setHeartRate(@Nullable Integer num) {
        this.heartRate = num;
    }

    public final void setHrvInfo(@Nullable String str) {
        this.hrvInfo = str;
    }

    public final void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
    }

    public final void setPwv(@Nullable Float f) {
        this.pwv = f;
    }

    public final void setPwvId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.pwvId = str;
    }

    public final void setScoreAnalysis(@Nullable String str) {
        this.scoreAnalysis = str;
    }

    public final void setSingleOsaInfo(@Nullable String str) {
        this.singleOsaInfo = str;
    }

    public final void setSingleSleepInfo(@Nullable String str) {
        this.singleSleepInfo = str;
    }

    public final void setSleepCrossAnalysis(@Nullable String str) {
        this.sleepCrossAnalysis = str;
    }

    public final void setSnoreAnalysis(@Nullable String str) {
        this.snoreAnalysis = str;
    }

    public final void setSpo2(@Nullable Integer num) {
        this.spo2 = num;
    }

    public final void setSsoid(@NotNull String ssoid) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        this.ssoid = ssoid;
    }

    public final void setStartTimestamp(long startTimestamp) {
        this.startTimestamp = startTimestamp;
    }

    public final void setStress(@Nullable Integer num) {
        this.stress = num;
    }

    public final void setSyncStatus(int i) {
        this.syncStatus = i;
    }

    public final void setTempCrossAnalysis(@Nullable String str) {
        this.tempCrossAnalysis = str;
    }

    public final void setTotalMeasurementItems(@Nullable Integer num) {
        this.totalMeasurementItems = num;
    }

    public final void setUserBodyInfo(@Nullable String str) {
        this.userBodyInfo = str;
    }

    public final void setValidMeasurementItems(@Nullable String str) {
        this.validMeasurementItems = str;
    }

    public final void setVascularAgeInfo(@Nullable String str) {
        this.vascularAgeInfo = str;
    }

    public final void setVersion(@Nullable Integer num) {
        this.version = num;
    }

    public final void setWristTemperatureInfo(@Nullable String str) {
        this.wristTemperatureInfo = str;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String toString() {
        return "DBAssessmentRecord{ssoid='" + this.ssoid + "', deviceUniqueId='" + this.deviceUniqueId + "', startTimestamp=" + this.startTimestamp + ", endTimestamp=" + this.endTimestamp + ", heartRate=" + this.heartRate + ", stress=" + this.stress + ", spo2=" + this.spo2 + ", ecgId='" + this.ecgId + "', ecgDiagnosisResults=" + this.ecgDiagnosisResults + ", degreeVascularElasticity=" + this.degreeVascularElasticity + ", pwv=" + this.pwv + ", pwvId='" + this.pwvId + "', validMeasurementItems='" + this.validMeasurementItems + "', totalMeasurementItems=" + this.totalMeasurementItems + ", focusMeasurementItems='" + this.focusMeasurementItems + "', version=" + this.version + ", extra='" + this.extra + "', del=" + this.del + ", userBodyInfo='" + this.userBodyInfo + "', wristTemperatureInfo='" + this.wristTemperatureInfo + "', singleSleepInfo='" + this.singleSleepInfo + "', singleOsaInfo='" + this.singleOsaInfo + "', sleepCrossAnalysis='" + this.sleepCrossAnalysis + "', tempCrossAnalysis='" + this.tempCrossAnalysis + "', snoreAnalysis='" + this.snoreAnalysis + "', scoreAnalysis='" + this.scoreAnalysis + "', cardioHistoryInfo='" + this.cardioHistoryInfo + "', vascularAgeInfo='" + this.vascularAgeInfo + "', bloodPressureInfo='" + this.bloodPressureInfo + "', bodyRecoveryInfo='" + this.bodyRecoveryInfo + "', hrvInfo='" + this.hrvInfo + "', syncStatus=" + this.syncStatus + ", modifiedTimestamp=" + this.modifiedTimestamp + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.ssoid);
        dest.writeString(this.deviceUniqueId);
        dest.writeLong(this.startTimestamp);
        dest.writeLong(this.endTimestamp);
        dest.writeValue(this.heartRate);
        dest.writeValue(this.stress);
        dest.writeValue(this.spo2);
        dest.writeString(this.ecgId);
        dest.writeValue(this.ecgDiagnosisResults);
        dest.writeValue(this.degreeVascularElasticity);
        dest.writeValue(this.pwv);
        dest.writeString(this.pwvId);
        dest.writeString(this.validMeasurementItems);
        dest.writeValue(this.totalMeasurementItems);
        dest.writeString(this.focusMeasurementItems);
        dest.writeValue(this.version);
        dest.writeString(this.extra);
        dest.writeValue(this.del);
        dest.writeString(this.userBodyInfo);
        dest.writeString(this.wristTemperatureInfo);
        dest.writeString(this.singleSleepInfo);
        dest.writeString(this.singleOsaInfo);
        dest.writeString(this.sleepCrossAnalysis);
        dest.writeString(this.tempCrossAnalysis);
        dest.writeString(this.snoreAnalysis);
        dest.writeString(this.scoreAnalysis);
        dest.writeString(this.cardioHistoryInfo);
        dest.writeString(this.vascularAgeInfo);
        dest.writeString(this.bloodPressureInfo);
        dest.writeString(this.bodyRecoveryInfo);
        dest.writeString(this.hrvInfo);
        dest.writeInt(this.syncStatus);
        dest.writeLong(this.modifiedTimestamp);
    }

    public DBAssessmentRecord(@NotNull Parcel in) {
        Intrinsics.checkNotNullParameter(in, "in");
        this.ssoid = "";
        this.deviceUniqueId = "";
        this.ecgId = "";
        this.pwvId = "";
        String string = in.readString();
        Intrinsics.checkNotNull(string);
        this.ssoid = string;
        String string2 = in.readString();
        Intrinsics.checkNotNull(string2);
        this.deviceUniqueId = string2;
        this.startTimestamp = in.readLong();
        this.endTimestamp = in.readLong();
        Class cls = Integer.TYPE;
        this.heartRate = (Integer) in.readValue(cls.getClassLoader());
        this.stress = (Integer) in.readValue(cls.getClassLoader());
        this.spo2 = (Integer) in.readValue(cls.getClassLoader());
        String string3 = in.readString();
        Intrinsics.checkNotNull(string3);
        this.ecgId = string3;
        this.ecgDiagnosisResults = (Integer) in.readValue(cls.getClassLoader());
        this.degreeVascularElasticity = (Integer) in.readValue(cls.getClassLoader());
        this.pwv = (Float) in.readValue(Float.TYPE.getClassLoader());
        String string4 = in.readString();
        Intrinsics.checkNotNull(string4);
        this.pwvId = string4;
        this.validMeasurementItems = in.readString();
        this.totalMeasurementItems = (Integer) in.readValue(cls.getClassLoader());
        this.focusMeasurementItems = in.readString();
        this.version = (Integer) in.readValue(cls.getClassLoader());
        this.extra = in.readString();
        this.del = (Integer) in.readValue(cls.getClassLoader());
        this.userBodyInfo = in.readString();
        this.wristTemperatureInfo = in.readString();
        this.singleSleepInfo = in.readString();
        this.singleOsaInfo = in.readString();
        this.sleepCrossAnalysis = in.readString();
        this.tempCrossAnalysis = in.readString();
        this.snoreAnalysis = in.readString();
        this.scoreAnalysis = in.readString();
        this.cardioHistoryInfo = in.readString();
        this.vascularAgeInfo = in.readString();
        this.bloodPressureInfo = in.readString();
        this.bodyRecoveryInfo = in.readString();
        this.hrvInfo = in.readString();
        this.syncStatus = in.readInt();
        this.modifiedTimestamp = in.readLong();
    }
}
