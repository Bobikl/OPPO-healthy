package com.heytap.databaseengineservice.db.table.healtharchives;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.sqlite.db.SupportSQLiteDatabase;
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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b9\b\u0087\b\u0018\u0000 u2\u00020\u00012\u00020\u0002:\u0001vBõ\u0001\u0012\b\b\u0003\u0010\u001e\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u001f\u001a\u00020\u0003\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0003\u0010#\u001a\u00020\u0003\u0012\b\b\u0002\u0010$\u001a\u00020\u0003\u0012\b\b\u0002\u0010%\u001a\u00020\r\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010'\u001a\u00020\r\u0012\b\b\u0002\u0010(\u001a\u00020\u0003\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010*\u001a\u00020\u0013\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010.\u001a\u00020\u0013\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u00100\u001a\u00020\r\u0012\b\b\u0002\u00101\u001a\u00020\r\u0012\b\b\u0002\u00102\u001a\u00020\r\u0012\b\b\u0002\u00103\u001a\u00020\u0013¢\u0006\u0004\bs\u0010tJ\t\u0010\u0004\u001a\u00020\u0003HÂ\u0003J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\rHÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\rHÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0013HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\rHÆ\u0003J\t\u0010\u001b\u001a\u00020\rHÆ\u0003J\t\u0010\u001c\u001a\u00020\rHÆ\u0003J\t\u0010\u001d\u001a\u00020\u0013HÆ\u0003J÷\u0001\u00104\u001a\u00020\u00002\b\b\u0003\u0010\u001e\u001a\u00020\u00032\b\b\u0003\u0010\u001f\u001a\u00020\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010#\u001a\u00020\u00032\b\b\u0002\u0010$\u001a\u00020\u00032\b\b\u0002\u0010%\u001a\u00020\r2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010'\u001a\u00020\r2\b\b\u0002\u0010(\u001a\u00020\u00032\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010*\u001a\u00020\u00132\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010.\u001a\u00020\u00132\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u00100\u001a\u00020\r2\b\b\u0002\u00101\u001a\u00020\r2\b\b\u0002\u00102\u001a\u00020\r2\b\b\u0002\u00103\u001a\u00020\u0013HÆ\u0001J\t\u00105\u001a\u00020\rHÖ\u0001J\u0013\u00109\u001a\u0002082\b\u00107\u001a\u0004\u0018\u000106HÖ\u0003J\t\u0010:\u001a\u00020\rHÖ\u0001J\u0019\u0010?\u001a\u00020>2\u0006\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u00020\rHÖ\u0001R\u0016\u0010\u001e\u001a\u00020\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010@R\"\u0010\u001f\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR$\u0010 \u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010@\u001a\u0004\bE\u0010B\"\u0004\bF\u0010DR$\u0010!\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010@\u001a\u0004\bG\u0010B\"\u0004\bH\u0010DR$\u0010\"\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010@\u001a\u0004\bI\u0010B\"\u0004\bJ\u0010DR\"\u0010#\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b#\u0010@\u001a\u0004\bK\u0010B\"\u0004\bL\u0010DR\"\u0010$\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b$\u0010@\u001a\u0004\bM\u0010B\"\u0004\bN\u0010DR\"\u0010%\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b%\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR$\u0010&\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b&\u0010@\u001a\u0004\bT\u0010B\"\u0004\bU\u0010DR\"\u0010'\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b'\u0010O\u001a\u0004\bV\u0010Q\"\u0004\bW\u0010SR\"\u0010(\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b(\u0010@\u001a\u0004\bX\u0010B\"\u0004\bY\u0010DR$\u0010)\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b)\u0010@\u001a\u0004\bZ\u0010B\"\u0004\b[\u0010DR\"\u0010*\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b*\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R$\u0010+\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b+\u0010@\u001a\u0004\ba\u0010B\"\u0004\bb\u0010DR$\u0010,\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b,\u0010@\u001a\u0004\bc\u0010B\"\u0004\bd\u0010DR$\u0010-\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b-\u0010@\u001a\u0004\be\u0010B\"\u0004\bf\u0010DR\"\u0010.\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b.\u0010\\\u001a\u0004\bg\u0010^\"\u0004\bh\u0010`R$\u0010/\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b/\u0010@\u001a\u0004\bi\u0010B\"\u0004\bj\u0010DR\"\u00100\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b0\u0010O\u001a\u0004\bk\u0010Q\"\u0004\bl\u0010SR\"\u00101\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b1\u0010O\u001a\u0004\bm\u0010Q\"\u0004\bn\u0010SR\"\u00102\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b2\u0010O\u001a\u0004\bo\u0010Q\"\u0004\bp\u0010SR\"\u00103\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b3\u0010\\\u001a\u0004\bq\u0010^\"\u0004\br\u0010`¨\u0006w"}, d2 = {"Lcom/heytap/databaseengineservice/db/table/healtharchives/DBHealthIndicatorStat;", "Lcom/heytap/databaseengine/model/SportHealthData;", "Landroid/os/Parcelable;", "", "component1", "getSsoid", "toString", "component2", "component3", "component4", "component5", "component6", "component7", "", "component8", "component9", "component10", "component11", "component12", "", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "ssoid", "indicatorName", "type", "bodySystem", "category", "trendList", "owner", "state", "uniformValueType", "tag", "trendTag", "analysis", "analysisTimestamp", "suggestion", "guessQuestions", "explain", "dataUpdateTime", "dataExtends", "syncStatus", "updated", "deleted", "modifiedTimestamp", "copy", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", UTraceSQLiteHelperKt.COL_FLAGS, "", "writeToParcel", "Ljava/lang/String;", "getIndicatorName", "()Ljava/lang/String;", "setIndicatorName", "(Ljava/lang/String;)V", "getType", "setType", "getBodySystem", "setBodySystem", "getCategory", "setCategory", "getTrendList", "setTrendList", "getOwner", "setOwner", "I", "getState", "()I", "setState", "(I)V", "getUniformValueType", "setUniformValueType", "getTag", "setTag", "getTrendTag", "setTrendTag", "getAnalysis", "setAnalysis", "J", "getAnalysisTimestamp", "()J", "setAnalysisTimestamp", "(J)V", "getSuggestion", "setSuggestion", "getGuessQuestions", "setGuessQuestions", "getExplain", "setExplain", "getDataUpdateTime", "setDataUpdateTime", "getDataExtends", "setDataExtends", "getSyncStatus", "setSyncStatus", "getUpdated", "setUpdated", "getDeleted", "setDeleted", "getModifiedTimestamp", "setModifiedTimestamp", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;IIIJ)V", "Companion", "a", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
@Entity(primaryKeys = {"ssoid", "indicator_name", "owner"}, tableName = DBHealthIndicatorStat.TABLE_NAME)
public final /* data */ class DBHealthIndicatorStat extends SportHealthData implements Parcelable {

    @NotNull
    public static final String ANALYSIS = "analysis";

    @NotNull
    public static final String ANALYSIS_TIMESTAMP = "analysis_timestamp";

    @NotNull
    public static final String BODY_SYSTEM = "body_system";

    @NotNull
    public static final String CATEGORY = "category";

    @NotNull
    public static final String DATA_EXTENDS = "data_extends";

    @NotNull
    public static final String DATA_UPDATE_TIME = "data_update_time";

    @NotNull
    public static final String DELETED = "deleted";

    @NotNull
    public static final String GUESS_QUESTIONS = "guess_questions";

    @NotNull
    public static final String INDICATOR_EXPLAIN = "explain";

    @NotNull
    public static final String INDICATOR_NAME = "indicator_name";

    @NotNull
    public static final String INDICATOR_TYPE = "type";

    @NotNull
    public static final String MODIFIED_TIMESTAMP = "modified_timestamp";

    @NotNull
    public static final String OWNER = "owner";

    @NotNull
    public static final String SSOID = "ssoid";

    @NotNull
    public static final String STATE = "state";

    @NotNull
    public static final String SUGGESTION = "suggestion";

    @NotNull
    public static final String SYNC_STATUS = "sync_status";

    @NotNull
    public static final String TABLE_NAME = "DBHealthIndicatorStat";

    @NotNull
    public static final String TAG = "tag";

    @NotNull
    public static final String TREND_LIST = "trend_list";

    @NotNull
    public static final String TREND_TAG = "trend_tag";

    @NotNull
    public static final String UNIFORM_VALUE_TYPE = "uniform_value_type";

    @NotNull
    public static final String UPDATED = "updated";

    /* JADX INFO: renamed from: analysis, reason: from kotlin metadata and from toString */
    @ColumnInfo(name = "analysis")
    @Nullable
    private String analyze;

    @ColumnInfo(name = "analysis_timestamp")
    private long analysisTimestamp;

    @ColumnInfo(name = "body_system")
    @Nullable
    private String bodySystem;

    @ColumnInfo(name = "category")
    @Nullable
    private String category;

    @ColumnInfo(name = "data_extends")
    @Nullable
    private String dataExtends;

    /* JADX INFO: renamed from: dataUpdateTime, reason: from kotlin metadata and from toString */
    @ColumnInfo(name = DATA_UPDATE_TIME)
    private long updateTime;

    @ColumnInfo(name = "deleted")
    private int deleted;

    @ColumnInfo(name = "explain")
    @Nullable
    private String explain;

    @ColumnInfo(name = "guess_questions")
    @Nullable
    private String guessQuestions;

    @ColumnInfo(name = "indicator_name")
    @NotNull
    private String indicatorName;

    @ColumnInfo(name = "modified_timestamp")
    private long modifiedTimestamp;

    @ColumnInfo(name = "owner")
    @NotNull
    private String owner;

    @ColumnInfo(name = "ssoid")
    @NotNull
    private String ssoid;

    @ColumnInfo(name = "state")
    private int state;

    @ColumnInfo(name = "suggestion")
    @Nullable
    private String suggestion;

    @ColumnInfo(name = "sync_status")
    private int syncStatus;

    @ColumnInfo(name = "tag")
    private int tag;

    @ColumnInfo(name = TREND_LIST)
    @NotNull
    private String trendList;

    @ColumnInfo(name = TREND_TAG)
    @NotNull
    private String trendTag;

    @ColumnInfo(name = "type")
    @Nullable
    private String type;

    @ColumnInfo(name = "uniform_value_type")
    @Nullable
    private String uniformValueType;

    @ColumnInfo(name = "updated")
    private int updated;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<DBHealthIndicatorStat> CREATOR = new b();

    /* JADX INFO: renamed from: com.heytap.databaseengineservice.db.table.healtharchives.DBHealthIndicatorStat$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001c\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b \u0010!J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\tR\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\tR\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\tR\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\tR\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\tR\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\tR\u0014\u0010\u0014\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\tR\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\tR\u0014\u0010\u0016\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\tR\u0014\u0010\u0017\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\tR\u0014\u0010\u0018\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\tR\u0014\u0010\u0019\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\tR\u0014\u0010\u001a\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\tR\u0014\u0010\u001b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\tR\u0014\u0010\u001c\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\tR\u0014\u0010\u001d\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\tR\u0014\u0010\u001e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\tR\u0014\u0010\u001f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\t¨\u0006\""}, d2 = {"Lcom/heytap/databaseengineservice/db/table/healtharchives/DBHealthIndicatorStat$a;", "", "", "b", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "database", "", "a", "ANALYSIS", "Ljava/lang/String;", "ANALYSIS_TIMESTAMP", "BODY_SYSTEM", "CATEGORY", "DATA_EXTENDS", "DATA_UPDATE_TIME", "DELETED", "GUESS_QUESTIONS", "INDICATOR_EXPLAIN", "INDICATOR_NAME", "INDICATOR_TYPE", "MODIFIED_TIMESTAMP", "OWNER", PdfViewActivity.SSOID, "STATE", "SUGGESTION", "SYNC_STATUS", "TABLE_NAME", "TAG", "TREND_LIST", "TREND_TAG", "UNIFORM_VALUE_TYPE", "UPDATED", "<init>", "()V", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void a(@NotNull SupportSQLiteDatabase database) {
            Intrinsics.checkNotNullParameter(database, "database");
            String str = "DROP TABLE " + DBHealthIndicatorStat.TABLE_NAME + ";";
            Intrinsics.checkNotNullExpressionValue(str, "dropTable.toString()");
            database.execSQL(str);
            String str2 = "create table if not exists DBHealthIndicatorStat(ssoid TEXT not null,indicator_name TEXT not null,type TEXT,body_system TEXT,category TEXT,trend_list TEXT not null,tag INTEGER not null,owner TEXT not null,uniform_value_type TEXT,state INTEGER NOT NULL,analysis TEXT,analysis_timestamp INTEGER NOT NULL,suggestion TEXT,guess_questions TEXT,data_extends TEXT,sync_status INTEGER NOT NULL,updated INTEGER NOT NULL,deleted INTEGER NOT NULL,modified_timestamp INTEGER not null,primary key(ssoid,indicator_name,owner))";
            Intrinsics.checkNotNullExpressionValue(str2, "strSql.toString()");
            database.execSQL(str2);
        }

        @JvmStatic
        @NotNull
        public final String b() {
            String str = "create table if not exists DBHealthIndicatorStat(ssoid TEXT not null,indicator_name TEXT not null,type TEXT,body_system TEXT,category TEXT,trend_list TEXT not null,tag INTEGER not null,owner TEXT,uniform_value_type TEXT,state INTEGER NOT NULL,analysis TEXT,analysis_timestamp INTEGER NOT NULL,suggestion TEXT,guess_questions TEXT,data_extends TEXT,sync_status INTEGER NOT NULL,updated INTEGER NOT NULL,deleted INTEGER NOT NULL,modified_timestamp INTEGER not null,primary key(ssoid,indicator_name))";
            Intrinsics.checkNotNullExpressionValue(str, "strSql.toString()");
            return str;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<DBHealthIndicatorStat> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DBHealthIndicatorStat createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DBHealthIndicatorStat(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final DBHealthIndicatorStat[] newArray(int i) {
            return new DBHealthIndicatorStat[i];
        }
    }

    public DBHealthIndicatorStat() {
        this(null, null, null, null, null, null, null, 0, null, 0, null, null, 0L, null, null, null, 0L, null, 0, 0, 0, 0L, 4194303, null);
    }

    @JvmStatic
    public static final void changePrimaryKey(@NotNull SupportSQLiteDatabase supportSQLiteDatabase) {
        INSTANCE.a(supportSQLiteDatabase);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final String getSsoid() {
        return this.ssoid;
    }

    public static /* synthetic */ DBHealthIndicatorStat copy$default(DBHealthIndicatorStat dBHealthIndicatorStat, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, String str8, int i2, String str9, String str10, long j2, String str11, String str12, String str13, long j3, String str14, int i3, int i4, int i5, long j4, int i6, Object obj) {
        String str15 = (i6 & 1) != 0 ? dBHealthIndicatorStat.ssoid : str;
        String str16 = (i6 & 2) != 0 ? dBHealthIndicatorStat.indicatorName : str2;
        String str17 = (i6 & 4) != 0 ? dBHealthIndicatorStat.type : str3;
        String str18 = (i6 & 8) != 0 ? dBHealthIndicatorStat.bodySystem : str4;
        String str19 = (i6 & 16) != 0 ? dBHealthIndicatorStat.category : str5;
        String str20 = (i6 & 32) != 0 ? dBHealthIndicatorStat.trendList : str6;
        String str21 = (i6 & 64) != 0 ? dBHealthIndicatorStat.owner : str7;
        int i7 = (i6 & 128) != 0 ? dBHealthIndicatorStat.state : i;
        String str22 = (i6 & 256) != 0 ? dBHealthIndicatorStat.uniformValueType : str8;
        int i8 = (i6 & 512) != 0 ? dBHealthIndicatorStat.tag : i2;
        String str23 = (i6 & 1024) != 0 ? dBHealthIndicatorStat.trendTag : str9;
        String str24 = (i6 & 2048) != 0 ? dBHealthIndicatorStat.analyze : str10;
        long j5 = (i6 & 4096) != 0 ? dBHealthIndicatorStat.analysisTimestamp : j2;
        String str25 = (i6 & 8192) != 0 ? dBHealthIndicatorStat.suggestion : str11;
        return dBHealthIndicatorStat.copy(str15, str16, str17, str18, str19, str20, str21, i7, str22, i8, str23, str24, j5, str25, (i6 & 16384) != 0 ? dBHealthIndicatorStat.guessQuestions : str12, (i6 & 32768) != 0 ? dBHealthIndicatorStat.explain : str13, (i6 & 65536) != 0 ? dBHealthIndicatorStat.updateTime : j3, (i6 & 131072) != 0 ? dBHealthIndicatorStat.dataExtends : str14, (262144 & i6) != 0 ? dBHealthIndicatorStat.syncStatus : i3, (i6 & 524288) != 0 ? dBHealthIndicatorStat.updated : i4, (i6 & 1048576) != 0 ? dBHealthIndicatorStat.deleted : i5, (i6 & 2097152) != 0 ? dBHealthIndicatorStat.modifiedTimestamp : j4);
    }

    @JvmStatic
    @NotNull
    public static final String createTable() {
        return INSTANCE.b();
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getTag() {
        return this.tag;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getTrendTag() {
        return this.trendTag;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getAnalyze() {
        return this.analyze;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final long getAnalysisTimestamp() {
        return this.analysisTimestamp;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getSuggestion() {
        return this.suggestion;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getGuessQuestions() {
        return this.guessQuestions;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getExplain() {
        return this.explain;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final long getUpdateTime() {
        return this.updateTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getDataExtends() {
        return this.dataExtends;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final int getSyncStatus() {
        return this.syncStatus;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIndicatorName() {
        return this.indicatorName;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final int getUpdated() {
        return this.updated;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final int getDeleted() {
        return this.deleted;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBodySystem() {
        return this.bodySystem;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTrendList() {
        return this.trendList;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getOwner() {
        return this.owner;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getState() {
        return this.state;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getUniformValueType() {
        return this.uniformValueType;
    }

    @NotNull
    public final DBHealthIndicatorStat copy(@NonNull @NotNull String ssoid, @NonNull @NotNull String indicatorName, @Nullable String type, @Nullable String bodySystem, @Nullable String category, @NonNull @NotNull String trendList, @NotNull String owner, int state, @Nullable String uniformValueType, int tag, @NotNull String trendTag, @Nullable String analysis, long analysisTimestamp, @Nullable String suggestion, @Nullable String guessQuestions, @Nullable String explain, long dataUpdateTime, @Nullable String dataExtends, int syncStatus, int updated, int deleted, long modifiedTimestamp) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(indicatorName, "indicatorName");
        Intrinsics.checkNotNullParameter(trendList, "trendList");
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(trendTag, "trendTag");
        return new DBHealthIndicatorStat(ssoid, indicatorName, type, bodySystem, category, trendList, owner, state, uniformValueType, tag, trendTag, analysis, analysisTimestamp, suggestion, guessQuestions, explain, dataUpdateTime, dataExtends, syncStatus, updated, deleted, modifiedTimestamp);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DBHealthIndicatorStat)) {
            return false;
        }
        DBHealthIndicatorStat dBHealthIndicatorStat = (DBHealthIndicatorStat) other;
        return Intrinsics.areEqual(this.ssoid, dBHealthIndicatorStat.ssoid) && Intrinsics.areEqual(this.indicatorName, dBHealthIndicatorStat.indicatorName) && Intrinsics.areEqual(this.type, dBHealthIndicatorStat.type) && Intrinsics.areEqual(this.bodySystem, dBHealthIndicatorStat.bodySystem) && Intrinsics.areEqual(this.category, dBHealthIndicatorStat.category) && Intrinsics.areEqual(this.trendList, dBHealthIndicatorStat.trendList) && Intrinsics.areEqual(this.owner, dBHealthIndicatorStat.owner) && this.state == dBHealthIndicatorStat.state && Intrinsics.areEqual(this.uniformValueType, dBHealthIndicatorStat.uniformValueType) && this.tag == dBHealthIndicatorStat.tag && Intrinsics.areEqual(this.trendTag, dBHealthIndicatorStat.trendTag) && Intrinsics.areEqual(this.analyze, dBHealthIndicatorStat.analyze) && this.analysisTimestamp == dBHealthIndicatorStat.analysisTimestamp && Intrinsics.areEqual(this.suggestion, dBHealthIndicatorStat.suggestion) && Intrinsics.areEqual(this.guessQuestions, dBHealthIndicatorStat.guessQuestions) && Intrinsics.areEqual(this.explain, dBHealthIndicatorStat.explain) && this.updateTime == dBHealthIndicatorStat.updateTime && Intrinsics.areEqual(this.dataExtends, dBHealthIndicatorStat.dataExtends) && this.syncStatus == dBHealthIndicatorStat.syncStatus && this.updated == dBHealthIndicatorStat.updated && this.deleted == dBHealthIndicatorStat.deleted && this.modifiedTimestamp == dBHealthIndicatorStat.modifiedTimestamp;
    }

    @Nullable
    public final String getAnalysis() {
        return this.analyze;
    }

    public final long getAnalysisTimestamp() {
        return this.analysisTimestamp;
    }

    @Nullable
    public final String getBodySystem() {
        return this.bodySystem;
    }

    @Nullable
    public final String getCategory() {
        return this.category;
    }

    @Nullable
    public final String getDataExtends() {
        return this.dataExtends;
    }

    public final long getDataUpdateTime() {
        return this.updateTime;
    }

    public final int getDeleted() {
        return this.deleted;
    }

    @Nullable
    public final String getExplain() {
        return this.explain;
    }

    @Nullable
    public final String getGuessQuestions() {
        return this.guessQuestions;
    }

    @NotNull
    public final String getIndicatorName() {
        return this.indicatorName;
    }

    public final long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    @NotNull
    public final String getOwner() {
        return this.owner;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String getSsoid() {
        return this.ssoid;
    }

    public final int getState() {
        return this.state;
    }

    @Nullable
    public final String getSuggestion() {
        return this.suggestion;
    }

    public final int getSyncStatus() {
        return this.syncStatus;
    }

    public final int getTag() {
        return this.tag;
    }

    @NotNull
    public final String getTrendList() {
        return this.trendList;
    }

    @NotNull
    public final String getTrendTag() {
        return this.trendTag;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final String getUniformValueType() {
        return this.uniformValueType;
    }

    public final int getUpdated() {
        return this.updated;
    }

    public int hashCode() {
        int iHashCode = ((this.ssoid.hashCode() * 31) + this.indicatorName.hashCode()) * 31;
        String str = this.type;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.bodySystem;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.category;
        int iHashCode4 = (((((((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.trendList.hashCode()) * 31) + this.owner.hashCode()) * 31) + Integer.hashCode(this.state)) * 31;
        String str4 = this.uniformValueType;
        int iHashCode5 = (((((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + Integer.hashCode(this.tag)) * 31) + this.trendTag.hashCode()) * 31;
        String str5 = this.analyze;
        int iHashCode6 = (((iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31) + Long.hashCode(this.analysisTimestamp)) * 31;
        String str6 = this.suggestion;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.guessQuestions;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.explain;
        int iHashCode9 = (((iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31) + Long.hashCode(this.updateTime)) * 31;
        String str9 = this.dataExtends;
        return ((((((((iHashCode9 + (str9 != null ? str9.hashCode() : 0)) * 31) + Integer.hashCode(this.syncStatus)) * 31) + Integer.hashCode(this.updated)) * 31) + Integer.hashCode(this.deleted)) * 31) + Long.hashCode(this.modifiedTimestamp);
    }

    public final void setAnalysis(@Nullable String str) {
        this.analyze = str;
    }

    public final void setAnalysisTimestamp(long j2) {
        this.analysisTimestamp = j2;
    }

    public final void setBodySystem(@Nullable String str) {
        this.bodySystem = str;
    }

    public final void setCategory(@Nullable String str) {
        this.category = str;
    }

    public final void setDataExtends(@Nullable String str) {
        this.dataExtends = str;
    }

    public final void setDataUpdateTime(long j2) {
        this.updateTime = j2;
    }

    public final void setDeleted(int i) {
        this.deleted = i;
    }

    public final void setExplain(@Nullable String str) {
        this.explain = str;
    }

    public final void setGuessQuestions(@Nullable String str) {
        this.guessQuestions = str;
    }

    public final void setIndicatorName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.indicatorName = str;
    }

    public final void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
    }

    public final void setOwner(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.owner = str;
    }

    public final void setState(int i) {
        this.state = i;
    }

    public final void setSuggestion(@Nullable String str) {
        this.suggestion = str;
    }

    public final void setSyncStatus(int i) {
        this.syncStatus = i;
    }

    public final void setTag(int i) {
        this.tag = i;
    }

    public final void setTrendList(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.trendList = str;
    }

    public final void setTrendTag(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.trendTag = str;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }

    public final void setUniformValueType(@Nullable String str) {
        this.uniformValueType = str;
    }

    public final void setUpdated(int i) {
        this.updated = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String toString() {
        return "DBHealthIndicatorStat(ssoid='" + this.ssoid + "', indicatorName=" + this.indicatorName + ", type='" + this.type + "', bodySystem='" + this.bodySystem + "', category='" + this.category + "', trendList='" + this.trendList + "', state='" + this.state + "', owner='" + this.owner + "', uniformValueType='" + this.uniformValueType + "', tag='" + this.tag + "', trendTag='" + this.trendTag + "', analyze='" + this.analyze + "', analysisTimestamp='" + this.analysisTimestamp + "', suggestion='" + this.suggestion + "', guessQuestions='" + this.guessQuestions + "', explain='" + this.explain + "', updateTime='" + this.updateTime + "' syncStatus='" + this.syncStatus + "', updated='" + this.updated + "', deleted='" + this.deleted + "',modifiedTimestamp='" + this.modifiedTimestamp + "')";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.ssoid);
        parcel.writeString(this.indicatorName);
        parcel.writeString(this.type);
        parcel.writeString(this.bodySystem);
        parcel.writeString(this.category);
        parcel.writeString(this.trendList);
        parcel.writeString(this.owner);
        parcel.writeInt(this.state);
        parcel.writeString(this.uniformValueType);
        parcel.writeInt(this.tag);
        parcel.writeString(this.trendTag);
        parcel.writeString(this.analyze);
        parcel.writeLong(this.analysisTimestamp);
        parcel.writeString(this.suggestion);
        parcel.writeString(this.guessQuestions);
        parcel.writeString(this.explain);
        parcel.writeLong(this.updateTime);
        parcel.writeString(this.dataExtends);
        parcel.writeInt(this.syncStatus);
        parcel.writeInt(this.updated);
        parcel.writeInt(this.deleted);
        parcel.writeLong(this.modifiedTimestamp);
    }

    public /* synthetic */ DBHealthIndicatorStat(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, String str8, int i2, String str9, String str10, long j2, String str11, String str12, String str13, long j3, String str14, int i3, int i4, int i5, long j4, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? "" : str, (i6 & 2) != 0 ? "" : str2, (i6 & 4) != 0 ? null : str3, (i6 & 8) != 0 ? null : str4, (i6 & 16) != 0 ? null : str5, (i6 & 32) != 0 ? "" : str6, (i6 & 64) != 0 ? "" : str7, (i6 & 128) != 0 ? 0 : i, (i6 & 256) != 0 ? null : str8, (i6 & 512) != 0 ? 0 : i2, (i6 & 1024) == 0 ? str9 : "", (i6 & 2048) != 0 ? null : str10, (i6 & 4096) != 0 ? 0L : j2, (i6 & 8192) != 0 ? null : str11, (i6 & 16384) != 0 ? null : str12, (i6 & 32768) != 0 ? null : str13, (i6 & 65536) != 0 ? 0L : j3, (i6 & 131072) != 0 ? null : str14, (i6 & 262144) != 0 ? 0 : i3, (i6 & 524288) != 0 ? 0 : i4, (i6 & 1048576) == 0 ? i5 : 0, (i6 & 2097152) == 0 ? j4 : 0L);
    }

    public DBHealthIndicatorStat(@NonNull @NotNull String ssoid, @NonNull @NotNull String indicatorName, @Nullable String str, @Nullable String str2, @Nullable String str3, @NonNull @NotNull String trendList, @NotNull String owner, int i, @Nullable String str4, int i2, @NotNull String trendTag, @Nullable String str5, long j2, @Nullable String str6, @Nullable String str7, @Nullable String str8, long j3, @Nullable String str9, int i3, int i4, int i5, long j4) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(indicatorName, "indicatorName");
        Intrinsics.checkNotNullParameter(trendList, "trendList");
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(trendTag, "trendTag");
        this.ssoid = ssoid;
        this.indicatorName = indicatorName;
        this.type = str;
        this.bodySystem = str2;
        this.category = str3;
        this.trendList = trendList;
        this.owner = owner;
        this.state = i;
        this.uniformValueType = str4;
        this.tag = i2;
        this.trendTag = trendTag;
        this.analyze = str5;
        this.analysisTimestamp = j2;
        this.suggestion = str6;
        this.guessQuestions = str7;
        this.explain = str8;
        this.updateTime = j3;
        this.dataExtends = str9;
        this.syncStatus = i3;
        this.updated = i4;
        this.deleted = i5;
        this.modifiedTimestamp = j4;
    }
}
