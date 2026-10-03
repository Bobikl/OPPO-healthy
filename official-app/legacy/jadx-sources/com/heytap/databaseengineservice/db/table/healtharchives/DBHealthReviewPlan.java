package com.heytap.databaseengineservice.db.table.healtharchives;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.health.operation.ecg.business.PdfViewActivity;
import com.heytap.speech.engine.EngineConfig;
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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b1\b\u0087\b\u0018\u0000 e2\u00020\u00012\u00020\u0002:\u0001fBË\u0001\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\"\u001a\u00020\u0007\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010%\u001a\u00020\u0012\u0012\b\b\u0002\u0010&\u001a\u00020\u0012\u0012\b\b\u0002\u0010'\u001a\u00020\u0012\u0012\b\b\u0002\u0010(\u001a\u00020\u0012\u0012\b\b\u0002\u0010)\u001a\u00020\u0012\u0012\b\b\u0002\u0010*\u001a\u00020\u0012\u0012\b\b\u0002\u0010+\u001a\u00020\u0007¢\u0006\u0004\bc\u0010dJ\t\u0010\u0004\u001a\u00020\u0003HÂ\u0003J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0012HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0012HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0012HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0012HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0012HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003JÍ\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00072\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\"\u001a\u00020\u00072\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010%\u001a\u00020\u00122\b\b\u0002\u0010&\u001a\u00020\u00122\b\b\u0002\u0010'\u001a\u00020\u00122\b\b\u0002\u0010(\u001a\u00020\u00122\b\b\u0002\u0010)\u001a\u00020\u00122\b\b\u0002\u0010*\u001a\u00020\u00122\b\b\u0002\u0010+\u001a\u00020\u0007HÆ\u0001J\t\u0010-\u001a\u00020\u0012HÖ\u0001J\u0013\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u00102\u001a\u00020\u0012HÖ\u0001J\u0019\u00107\u001a\u0002062\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u00020\u0012HÖ\u0001R\u0016\u0010\u001a\u001a\u00020\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001a\u00108R\"\u0010\u001b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R$\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u00108\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR$\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u00108\u001a\u0004\bB\u0010?\"\u0004\bC\u0010AR$\u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u00108\u001a\u0004\bD\u0010?\"\u0004\bE\u0010AR$\u0010\u001f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u00108\u001a\u0004\bF\u0010?\"\u0004\bG\u0010AR$\u0010 \u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b \u00108\u001a\u0004\bH\u0010?\"\u0004\bI\u0010AR$\u0010!\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u00108\u001a\u0004\bJ\u0010?\"\u0004\bK\u0010AR\"\u0010\"\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u00109\u001a\u0004\bL\u0010;\"\u0004\bM\u0010=R$\u0010#\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b#\u00108\u001a\u0004\bN\u0010?\"\u0004\bO\u0010AR$\u0010$\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b$\u00108\u001a\u0004\bP\u0010?\"\u0004\bQ\u0010AR\"\u0010%\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b%\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\"\u0010&\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b&\u0010R\u001a\u0004\bW\u0010T\"\u0004\bX\u0010VR\"\u0010'\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b'\u0010R\u001a\u0004\bY\u0010T\"\u0004\bZ\u0010VR\"\u0010(\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b(\u0010R\u001a\u0004\b[\u0010T\"\u0004\b\\\u0010VR\"\u0010)\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b)\u0010R\u001a\u0004\b]\u0010T\"\u0004\b^\u0010VR\"\u0010*\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b*\u0010R\u001a\u0004\b_\u0010T\"\u0004\b`\u0010VR\"\u0010+\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b+\u00109\u001a\u0004\ba\u0010;\"\u0004\bb\u0010=¨\u0006g"}, d2 = {"Lcom/heytap/databaseengineservice/db/table/healtharchives/DBHealthReviewPlan;", "Lcom/heytap/databaseengine/model/SportHealthData;", "Landroid/os/Parcelable;", "", "component1", "getSsoid", "toString", "", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "ssoid", "planId", "owner", "docId", "category", "title", "indicatorName", DBHealthReviewPlan.DEPARTMENT, "reviewTime", DBHealthReviewPlan.DESC, "calendarRemind", "state", "source", "ignoreState", "syncStatus", "updated", "deleted", "modifiedTimestamp", "copy", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", UTraceSQLiteHelperKt.COL_FLAGS, "", "writeToParcel", "Ljava/lang/String;", "J", "getPlanId", "()J", "setPlanId", "(J)V", "getOwner", "()Ljava/lang/String;", "setOwner", "(Ljava/lang/String;)V", "getDocId", "setDocId", "getCategory", "setCategory", "getTitle", "setTitle", "getIndicatorName", "setIndicatorName", "getDepartment", "setDepartment", "getReviewTime", "setReviewTime", "getDesc", "setDesc", "getCalendarRemind", "setCalendarRemind", "I", "getState", "()I", "setState", "(I)V", "getSource", "setSource", "getIgnoreState", "setIgnoreState", "getSyncStatus", "setSyncStatus", "getUpdated", "setUpdated", "getDeleted", "setDeleted", "getModifiedTimestamp", "setModifiedTimestamp", "<init>", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;IIIIIIJ)V", "Companion", "a", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
@Entity(primaryKeys = {"ssoid", DBHealthReviewPlan.PLAN_ID}, tableName = DBHealthReviewPlan.TABLE_NAME)
public final /* data */ class DBHealthReviewPlan extends SportHealthData implements Parcelable {

    @NotNull
    public static final String CALENDAR_REMIND = "calendar_remind";

    @NotNull
    public static final String CATEGORY = "category";

    @NotNull
    public static final String DELETED = "deleted";

    @NotNull
    public static final String DEPARTMENT = "department";

    @NotNull
    public static final String DESC = "desc";

    @NotNull
    public static final String DOC_ID = "doc_id";

    @NotNull
    public static final String IGNORE_STATE = "ignore_state";

    @NotNull
    public static final String INDICATOR_NAME = "indicator_name";

    @NotNull
    public static final String MODIFIED_TIMESTAMP = "modified_timestamp";

    @NotNull
    public static final String OWNER = "owner";

    @NotNull
    public static final String PLAN_ID = "plan_id";

    @NotNull
    public static final String REVIEW_TIME = "review_time";

    @NotNull
    public static final String SOURCE = "source";

    @NotNull
    public static final String SSOID = "ssoid";

    @NotNull
    public static final String STATE = "state";

    @NotNull
    public static final String SYNC_STATUS = "sync_status";

    @NotNull
    public static final String TABLE_NAME = "DBHealthReviewPlan";

    @NotNull
    public static final String TITLE = "title";

    @NotNull
    public static final String UPDATED = "updated";

    @ColumnInfo(name = CALENDAR_REMIND)
    @Nullable
    private String calendarRemind;

    @ColumnInfo(name = "category")
    @Nullable
    private String category;

    @ColumnInfo(name = "deleted")
    private int deleted;

    @ColumnInfo(name = DEPARTMENT)
    @Nullable
    private String department;

    @ColumnInfo(name = DESC)
    @Nullable
    private String desc;

    @ColumnInfo(name = "doc_id")
    @Nullable
    private String docId;

    @ColumnInfo(name = IGNORE_STATE)
    private int ignoreState;

    @ColumnInfo(name = "indicator_name")
    @Nullable
    private String indicatorName;

    @ColumnInfo(name = "modified_timestamp")
    private long modifiedTimestamp;

    @ColumnInfo(name = "owner")
    @Nullable
    private String owner;

    @ColumnInfo(name = PLAN_ID)
    private long planId;

    @ColumnInfo(name = REVIEW_TIME)
    private long reviewTime;

    @ColumnInfo(name = "source")
    private int source;

    @ColumnInfo(name = "ssoid")
    @NotNull
    private String ssoid;

    @ColumnInfo(name = "state")
    private int state;

    @ColumnInfo(name = "sync_status")
    private int syncStatus;

    @ColumnInfo(name = "title")
    @Nullable
    private String title;

    @ColumnInfo(name = "updated")
    private int updated;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<DBHealthReviewPlan> CREATOR = new b();

    /* JADX INFO: renamed from: com.heytap.databaseengineservice.db.table.healtharchives.DBHealthReviewPlan$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0005R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0005R\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0005R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0005R\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0005R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0005R\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0005R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0005R\u0014\u0010\u0014\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0005R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0005R\u0014\u0010\u0016\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0005R\u0014\u0010\u0017\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0005¨\u0006\u001a"}, d2 = {"Lcom/heytap/databaseengineservice/db/table/healtharchives/DBHealthReviewPlan$a;", "", "", "a", "CALENDAR_REMIND", "Ljava/lang/String;", "CATEGORY", "DELETED", "DEPARTMENT", "DESC", "DOC_ID", "IGNORE_STATE", "INDICATOR_NAME", "MODIFIED_TIMESTAMP", "OWNER", "PLAN_ID", "REVIEW_TIME", EngineConfig.K_SOURCE, PdfViewActivity.SSOID, "STATE", "SYNC_STATUS", "TABLE_NAME", "TITLE", "UPDATED", "<init>", "()V", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final String a() {
            String str = "create table if not exists DBHealthReviewPlan(ssoid TEXT not null,plan_id INTEGER not null,owner TEXT,doc_id TEXT,category TEXT,title TEXT,indicator_name TEXT,department TEXT,review_time INTEGER not null,desc TEXT,calendar_remind TEXT,state INTEGER NOT NULL,source INTEGER NOT NULL,ignore_state INTEGER NOT NULL,sync_status INTEGER NOT NULL,updated INTEGER NOT NULL,deleted INTEGER NOT NULL,modified_timestamp INTEGER not null,primary key(ssoid," + DBHealthReviewPlan.PLAN_ID + "))";
            Intrinsics.checkNotNullExpressionValue(str, "strSql.toString()");
            return str;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<DBHealthReviewPlan> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DBHealthReviewPlan createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DBHealthReviewPlan(parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final DBHealthReviewPlan[] newArray(int i) {
            return new DBHealthReviewPlan[i];
        }
    }

    public DBHealthReviewPlan() {
        this(null, 0L, null, null, null, null, null, null, 0L, null, null, 0, 0, 0, 0, 0, 0, 0L, 262143, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final String getSsoid() {
        return this.ssoid;
    }

    @JvmStatic
    @NotNull
    public static final String createTable() {
        return INSTANCE.a();
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getCalendarRemind() {
        return this.calendarRemind;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getIgnoreState() {
        return this.ignoreState;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final int getSyncStatus() {
        return this.syncStatus;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final int getUpdated() {
        return this.updated;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final int getDeleted() {
        return this.deleted;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getPlanId() {
        return this.planId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOwner() {
        return this.owner;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDocId() {
        return this.docId;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getIndicatorName() {
        return this.indicatorName;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDepartment() {
        return this.department;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getReviewTime() {
        return this.reviewTime;
    }

    @NotNull
    public final DBHealthReviewPlan copy(@NotNull String ssoid, long planId, @Nullable String owner, @Nullable String docId, @Nullable String category, @Nullable String title, @Nullable String indicatorName, @Nullable String department, long reviewTime, @Nullable String desc, @Nullable String calendarRemind, int state, int source, int ignoreState, int syncStatus, int updated, int deleted, long modifiedTimestamp) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        return new DBHealthReviewPlan(ssoid, planId, owner, docId, category, title, indicatorName, department, reviewTime, desc, calendarRemind, state, source, ignoreState, syncStatus, updated, deleted, modifiedTimestamp);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DBHealthReviewPlan)) {
            return false;
        }
        DBHealthReviewPlan dBHealthReviewPlan = (DBHealthReviewPlan) other;
        return Intrinsics.areEqual(this.ssoid, dBHealthReviewPlan.ssoid) && this.planId == dBHealthReviewPlan.planId && Intrinsics.areEqual(this.owner, dBHealthReviewPlan.owner) && Intrinsics.areEqual(this.docId, dBHealthReviewPlan.docId) && Intrinsics.areEqual(this.category, dBHealthReviewPlan.category) && Intrinsics.areEqual(this.title, dBHealthReviewPlan.title) && Intrinsics.areEqual(this.indicatorName, dBHealthReviewPlan.indicatorName) && Intrinsics.areEqual(this.department, dBHealthReviewPlan.department) && this.reviewTime == dBHealthReviewPlan.reviewTime && Intrinsics.areEqual(this.desc, dBHealthReviewPlan.desc) && Intrinsics.areEqual(this.calendarRemind, dBHealthReviewPlan.calendarRemind) && this.state == dBHealthReviewPlan.state && this.source == dBHealthReviewPlan.source && this.ignoreState == dBHealthReviewPlan.ignoreState && this.syncStatus == dBHealthReviewPlan.syncStatus && this.updated == dBHealthReviewPlan.updated && this.deleted == dBHealthReviewPlan.deleted && this.modifiedTimestamp == dBHealthReviewPlan.modifiedTimestamp;
    }

    @Nullable
    public final String getCalendarRemind() {
        return this.calendarRemind;
    }

    @Nullable
    public final String getCategory() {
        return this.category;
    }

    public final int getDeleted() {
        return this.deleted;
    }

    @Nullable
    public final String getDepartment() {
        return this.department;
    }

    @Nullable
    public final String getDesc() {
        return this.desc;
    }

    @Nullable
    public final String getDocId() {
        return this.docId;
    }

    public final int getIgnoreState() {
        return this.ignoreState;
    }

    @Nullable
    public final String getIndicatorName() {
        return this.indicatorName;
    }

    public final long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    @Nullable
    public final String getOwner() {
        return this.owner;
    }

    public final long getPlanId() {
        return this.planId;
    }

    public final long getReviewTime() {
        return this.reviewTime;
    }

    public final int getSource() {
        return this.source;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String getSsoid() {
        return this.ssoid;
    }

    public final int getState() {
        return this.state;
    }

    public final int getSyncStatus() {
        return this.syncStatus;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final int getUpdated() {
        return this.updated;
    }

    public int hashCode() {
        int iHashCode = ((this.ssoid.hashCode() * 31) + Long.hashCode(this.planId)) * 31;
        String str = this.owner;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.docId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.category;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.title;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.indicatorName;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.department;
        int iHashCode7 = (((iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31) + Long.hashCode(this.reviewTime)) * 31;
        String str7 = this.desc;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.calendarRemind;
        return ((((((((((((((iHashCode8 + (str8 != null ? str8.hashCode() : 0)) * 31) + Integer.hashCode(this.state)) * 31) + Integer.hashCode(this.source)) * 31) + Integer.hashCode(this.ignoreState)) * 31) + Integer.hashCode(this.syncStatus)) * 31) + Integer.hashCode(this.updated)) * 31) + Integer.hashCode(this.deleted)) * 31) + Long.hashCode(this.modifiedTimestamp);
    }

    public final void setCalendarRemind(@Nullable String str) {
        this.calendarRemind = str;
    }

    public final void setCategory(@Nullable String str) {
        this.category = str;
    }

    public final void setDeleted(int i) {
        this.deleted = i;
    }

    public final void setDepartment(@Nullable String str) {
        this.department = str;
    }

    public final void setDesc(@Nullable String str) {
        this.desc = str;
    }

    public final void setDocId(@Nullable String str) {
        this.docId = str;
    }

    public final void setIgnoreState(int i) {
        this.ignoreState = i;
    }

    public final void setIndicatorName(@Nullable String str) {
        this.indicatorName = str;
    }

    public final void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
    }

    public final void setOwner(@Nullable String str) {
        this.owner = str;
    }

    public final void setPlanId(long j2) {
        this.planId = j2;
    }

    public final void setReviewTime(long j2) {
        this.reviewTime = j2;
    }

    public final void setSource(int i) {
        this.source = i;
    }

    public final void setState(int i) {
        this.state = i;
    }

    public final void setSyncStatus(int i) {
        this.syncStatus = i;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setUpdated(int i) {
        this.updated = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String toString() {
        return "DBHealthReviewPlan(ssoid='" + this.ssoid + "', planId=" + this.planId + ", owner='" + this.owner + "', docId='" + this.docId + "', category='" + this.category + "', title='" + this.title + "', indicatorName='" + this.indicatorName + "', department='" + this.department + "', reviewTime='" + this.reviewTime + "', desc='" + this.desc + "', calendarRemind='" + this.calendarRemind + "', state='" + this.state + "', source='" + this.source + "', ignoreState ='" + this.ignoreState + "', syncStatus='" + this.syncStatus + "', updated='" + this.updated + "', deleted='" + this.deleted + "',modifiedTimestamp='" + this.modifiedTimestamp + "')";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.ssoid);
        parcel.writeLong(this.planId);
        parcel.writeString(this.owner);
        parcel.writeString(this.docId);
        parcel.writeString(this.category);
        parcel.writeString(this.title);
        parcel.writeString(this.indicatorName);
        parcel.writeString(this.department);
        parcel.writeLong(this.reviewTime);
        parcel.writeString(this.desc);
        parcel.writeString(this.calendarRemind);
        parcel.writeInt(this.state);
        parcel.writeInt(this.source);
        parcel.writeInt(this.ignoreState);
        parcel.writeInt(this.syncStatus);
        parcel.writeInt(this.updated);
        parcel.writeInt(this.deleted);
        parcel.writeLong(this.modifiedTimestamp);
    }

    public /* synthetic */ DBHealthReviewPlan(String str, long j2, String str2, String str3, String str4, String str5, String str6, String str7, long j3, String str8, String str9, int i, int i2, int i3, int i4, int i5, int i6, long j4, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? "" : str, (i7 & 2) != 0 ? 0L : j2, (i7 & 4) != 0 ? null : str2, (i7 & 8) != 0 ? null : str3, (i7 & 16) != 0 ? null : str4, (i7 & 32) != 0 ? null : str5, (i7 & 64) != 0 ? null : str6, (i7 & 128) != 0 ? null : str7, (i7 & 256) != 0 ? 0L : j3, (i7 & 512) != 0 ? null : str8, (i7 & 1024) == 0 ? str9 : null, (i7 & 2048) != 0 ? -1 : i, (i7 & 4096) != 0 ? 0 : i2, (i7 & 8192) != 0 ? 0 : i3, (i7 & 16384) != 0 ? 0 : i4, (i7 & 32768) != 0 ? 0 : i5, (i7 & 65536) == 0 ? i6 : 0, (i7 & 131072) != 0 ? 0L : j4);
    }

    public DBHealthReviewPlan(@NotNull String ssoid, long j2, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, long j3, @Nullable String str7, @Nullable String str8, int i, int i2, int i3, int i4, int i5, int i6, long j4) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        this.ssoid = ssoid;
        this.planId = j2;
        this.owner = str;
        this.docId = str2;
        this.category = str3;
        this.title = str4;
        this.indicatorName = str5;
        this.department = str6;
        this.reviewTime = j3;
        this.desc = str7;
        this.calendarRemind = str8;
        this.state = i;
        this.source = i2;
        this.ignoreState = i3;
        this.syncStatus = i4;
        this.updated = i5;
        this.deleted = i6;
        this.modifiedTimestamp = j4;
    }
}
