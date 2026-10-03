package com.heytap.databaseengineservice.db.table.weight;

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
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b,\b\u0087\b\u0018\u0000 X2\u00020\u00012\u00020\u0002:\u0001YB\u0093\u0001\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\r\u0012\b\b\u0002\u0010\u001d\u001a\u00020\r\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u000b\u0012\b\b\u0002\u0010 \u001a\u00020\r\u0012\b\b\u0002\u0010!\u001a\u00020\r\u0012\b\b\u0002\u0010\"\u001a\u00020\u000b\u0012\b\b\u0002\u0010#\u001a\u00020\r\u0012\b\b\u0002\u0010$\u001a\u00020\u000b\u0012\b\b\u0002\u0010%\u001a\u00020\r\u0012\b\b\u0002\u0010&\u001a\u00020\u000b¢\u0006\u0004\bU\u0010VB\t\b\u0016¢\u0006\u0004\bU\u0010WJ\t\u0010\u0004\u001a\u00020\u0003HÂ\u0003J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0003J\b\u0010\t\u001a\u00020\u0003H\u0016J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\u000e\u001a\u00020\rHÆ\u0003J\t\u0010\u000f\u001a\u00020\rHÆ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÆ\u0003J\t\u0010\u0011\u001a\u00020\u000bHÆ\u0003J\t\u0010\u0012\u001a\u00020\rHÆ\u0003J\t\u0010\u0013\u001a\u00020\rHÆ\u0003J\t\u0010\u0014\u001a\u00020\u000bHÆ\u0003J\t\u0010\u0015\u001a\u00020\rHÆ\u0003J\t\u0010\u0016\u001a\u00020\u000bHÆ\u0003J\t\u0010\u0017\u001a\u00020\rHÆ\u0003J\t\u0010\u0018\u001a\u00020\u000bHÆ\u0003J\u0095\u0001\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010\u001c\u001a\u00020\r2\b\b\u0002\u0010\u001d\u001a\u00020\r2\b\b\u0002\u0010\u001e\u001a\u00020\u000b2\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\r2\b\b\u0002\u0010!\u001a\u00020\r2\b\b\u0002\u0010\"\u001a\u00020\u000b2\b\b\u0002\u0010#\u001a\u00020\r2\b\b\u0002\u0010$\u001a\u00020\u000b2\b\b\u0002\u0010%\u001a\u00020\r2\b\b\u0002\u0010&\u001a\u00020\u000bHÆ\u0001J\t\u0010(\u001a\u00020\rHÖ\u0001J\u0013\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010-\u001a\u00020\rHÖ\u0001J\u0019\u00101\u001a\u00020\u00072\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\rHÖ\u0001R\u0016\u0010\u0019\u001a\u00020\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u00102R\"\u0010\u001a\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010\u001b\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010\u001c\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010\u001d\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010<\u001a\u0004\bA\u0010>\"\u0004\bB\u0010@R\"\u0010\u001e\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u00107\u001a\u0004\bC\u00109\"\u0004\bD\u0010;R\"\u0010\u001f\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u00107\u001a\u0004\bE\u00109\"\u0004\bF\u0010;R\"\u0010 \u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010<\u001a\u0004\bG\u0010>\"\u0004\bH\u0010@R\"\u0010!\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010<\u001a\u0004\bI\u0010>\"\u0004\bJ\u0010@R\"\u0010\"\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u00107\u001a\u0004\bK\u00109\"\u0004\bL\u0010;R\"\u0010#\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b#\u0010<\u001a\u0004\bM\u0010>\"\u0004\bN\u0010@R\"\u0010$\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b$\u00107\u001a\u0004\bO\u00109\"\u0004\bP\u0010;R\"\u0010%\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b%\u0010<\u001a\u0004\bQ\u0010>\"\u0004\bR\u0010@R\"\u0010&\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b&\u00107\u001a\u0004\bS\u00109\"\u0004\bT\u0010;¨\u0006Z"}, d2 = {"Lcom/heytap/databaseengineservice/db/table/weight/DBWeightGoal;", "Lcom/heytap/databaseengine/model/SportHealthData;", "Landroid/os/Parcelable;", "", "component1", "getSsoid", "mSsoid", "", "setSsoid", "toString", "component2", "", "component3", "", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "ssoid", "userTagId", "effectiveDate", "initialWeightG", "targetWeightG", "expectedAchieveDate", "createdAt", "goalDirection", "latestWeightG", "latestWeightTimestamp", "state", "actualEndDate", "syncStatus", "modifiedTimestamp", "copy", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", UTraceSQLiteHelperKt.COL_FLAGS, "writeToParcel", "Ljava/lang/String;", "getUserTagId", "()Ljava/lang/String;", "setUserTagId", "(Ljava/lang/String;)V", "J", "getEffectiveDate", "()J", "setEffectiveDate", "(J)V", "I", "getInitialWeightG", "()I", "setInitialWeightG", "(I)V", "getTargetWeightG", "setTargetWeightG", "getExpectedAchieveDate", "setExpectedAchieveDate", "getCreatedAt", "setCreatedAt", "getGoalDirection", "setGoalDirection", "getLatestWeightG", "setLatestWeightG", "getLatestWeightTimestamp", "setLatestWeightTimestamp", "getState", "setState", "getActualEndDate", "setActualEndDate", "getSyncStatus", "setSyncStatus", "getModifiedTimestamp", "setModifiedTimestamp", "<init>", "(Ljava/lang/String;Ljava/lang/String;JIIJJIIJIJIJ)V", "()V", "Companion", "a", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
@Entity(primaryKeys = {"ssoid", DBWeightGoal.USER_TAG_ID, "created_at"}, tableName = DBWeightGoal.TABLE_NAME)
public final /* data */ class DBWeightGoal extends SportHealthData implements Parcelable {

    @NotNull
    public static final String ACTUAL_END_DATE = "actual_end_date";

    @NotNull
    public static final String CREATED_AT = "created_at";

    @NotNull
    public static final String EFFECTIVE_DATE = "effective_date";

    @NotNull
    public static final String EXPECTED_ACHIEVE_DATE = "expected_achieve_date";

    @NotNull
    public static final String GOAL_DIRECTION = "goal_direction";

    @NotNull
    public static final String INITIAL_WEIGHT_G = "initial_weight_g";

    @NotNull
    public static final String LATEST_WEIGHT_G = "latest_weight_g";

    @NotNull
    public static final String LATEST_WEIGHT_TIMESTAMP = "latest_weight_timestamp";

    @NotNull
    public static final String MODIFIED_TIMESTAMP = "modified_timestamp";

    @NotNull
    public static final String SSOID = "ssoid";

    @NotNull
    public static final String STATE = "state";

    @NotNull
    public static final String SYNC_STATUS = "sync_status";

    @NotNull
    public static final String TABLE_NAME = "DBWeightGoal";

    @NotNull
    public static final String TARGET_WEIGHT_G = "target_weight_g";

    @NotNull
    public static final String USER_TAG_ID = "user_tag_id";

    @ColumnInfo(name = ACTUAL_END_DATE)
    private long actualEndDate;

    @ColumnInfo(name = "created_at")
    private long createdAt;

    @ColumnInfo(name = EFFECTIVE_DATE)
    private long effectiveDate;

    @ColumnInfo(name = EXPECTED_ACHIEVE_DATE)
    private long expectedAchieveDate;

    @ColumnInfo(name = GOAL_DIRECTION)
    private int goalDirection;

    @ColumnInfo(name = INITIAL_WEIGHT_G)
    private int initialWeightG;

    @ColumnInfo(name = LATEST_WEIGHT_G)
    private int latestWeightG;

    @ColumnInfo(name = LATEST_WEIGHT_TIMESTAMP)
    private long latestWeightTimestamp;

    @ColumnInfo(name = "modified_timestamp")
    private long modifiedTimestamp;

    @ColumnInfo(name = "ssoid")
    @NotNull
    private String ssoid;

    @ColumnInfo(name = "state")
    private int state;

    @ColumnInfo(name = "sync_status")
    private int syncStatus;

    @ColumnInfo(name = TARGET_WEIGHT_G)
    private int targetWeightG;

    @ColumnInfo(name = USER_TAG_ID)
    @NotNull
    private String userTagId;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<DBWeightGoal> CREATOR = new b();

    /* JADX INFO: renamed from: com.heytap.databaseengineservice.db.table.weight.DBWeightGoal$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0005R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0005R\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0005R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0005R\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0005R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0005R\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0005R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0005¨\u0006\u0016"}, d2 = {"Lcom/heytap/databaseengineservice/db/table/weight/DBWeightGoal$a;", "", "", "a", "ACTUAL_END_DATE", "Ljava/lang/String;", "CREATED_AT", "EFFECTIVE_DATE", "EXPECTED_ACHIEVE_DATE", "GOAL_DIRECTION", "INITIAL_WEIGHT_G", "LATEST_WEIGHT_G", "LATEST_WEIGHT_TIMESTAMP", "MODIFIED_TIMESTAMP", PdfViewActivity.SSOID, "STATE", "SYNC_STATUS", "TABLE_NAME", "TARGET_WEIGHT_G", "USER_TAG_ID", "<init>", "()V", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final String a() {
            String str = "create table if not exists DBWeightGoal(ssoid TEXT not null,user_tag_id TEXT not null,effective_date INTEGER not null,initial_weight_g INTEGER not null,target_weight_g INTEGER not null,expected_achieve_date INTEGER not null,created_at INTEGER not null,goal_direction INTEGER not null,latest_weight_g INTEGER not null,latest_weight_timestamp INTEGER not null,state INTEGER not null,actual_end_date INTEGER not null,sync_status INTEGER not null,modified_timestamp INTEGER not null,primary key(ssoid," + DBWeightGoal.USER_TAG_ID + ",created_at))";
            Intrinsics.checkNotNullExpressionValue(str, "strSql.toString()");
            return str;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<DBWeightGoal> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DBWeightGoal createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DBWeightGoal(parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readLong(), parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readLong(), parcel.readInt(), parcel.readLong(), parcel.readInt(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final DBWeightGoal[] newArray(int i) {
            return new DBWeightGoal[i];
        }
    }

    public /* synthetic */ DBWeightGoal(String str, String str2, long j2, int i, int i2, long j3, long j4, int i3, int i4, long j5, int i5, long j6, int i6, long j7, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? "" : str, (i7 & 2) == 0 ? str2 : "", (i7 & 4) != 0 ? 0L : j2, (i7 & 8) != 0 ? 0 : i, (i7 & 16) != 0 ? 0 : i2, (i7 & 32) != 0 ? 0L : j3, (i7 & 64) != 0 ? 0L : j4, (i7 & 128) != 0 ? 0 : i3, (i7 & 256) != 0 ? 0 : i4, (i7 & 512) != 0 ? 0L : j5, (i7 & 1024) != 0 ? 0 : i5, (i7 & 2048) != 0 ? 0L : j6, (i7 & 4096) != 0 ? 0 : i6, (i7 & 8192) != 0 ? 0L : j7);
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

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final long getLatestWeightTimestamp() {
        return this.latestWeightTimestamp;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final long getActualEndDate() {
        return this.actualEndDate;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getSyncStatus() {
        return this.syncStatus;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUserTagId() {
        return this.userTagId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getEffectiveDate() {
        return this.effectiveDate;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getInitialWeightG() {
        return this.initialWeightG;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getTargetWeightG() {
        return this.targetWeightG;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getExpectedAchieveDate() {
        return this.expectedAchieveDate;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getGoalDirection() {
        return this.goalDirection;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getLatestWeightG() {
        return this.latestWeightG;
    }

    @NotNull
    public final DBWeightGoal copy(@NotNull String ssoid, @NotNull String userTagId, long effectiveDate, int initialWeightG, int targetWeightG, long expectedAchieveDate, long createdAt, int goalDirection, int latestWeightG, long latestWeightTimestamp, int state, long actualEndDate, int syncStatus, long modifiedTimestamp) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(userTagId, "userTagId");
        return new DBWeightGoal(ssoid, userTagId, effectiveDate, initialWeightG, targetWeightG, expectedAchieveDate, createdAt, goalDirection, latestWeightG, latestWeightTimestamp, state, actualEndDate, syncStatus, modifiedTimestamp);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DBWeightGoal)) {
            return false;
        }
        DBWeightGoal dBWeightGoal = (DBWeightGoal) other;
        return Intrinsics.areEqual(this.ssoid, dBWeightGoal.ssoid) && Intrinsics.areEqual(this.userTagId, dBWeightGoal.userTagId) && this.effectiveDate == dBWeightGoal.effectiveDate && this.initialWeightG == dBWeightGoal.initialWeightG && this.targetWeightG == dBWeightGoal.targetWeightG && this.expectedAchieveDate == dBWeightGoal.expectedAchieveDate && this.createdAt == dBWeightGoal.createdAt && this.goalDirection == dBWeightGoal.goalDirection && this.latestWeightG == dBWeightGoal.latestWeightG && this.latestWeightTimestamp == dBWeightGoal.latestWeightTimestamp && this.state == dBWeightGoal.state && this.actualEndDate == dBWeightGoal.actualEndDate && this.syncStatus == dBWeightGoal.syncStatus && this.modifiedTimestamp == dBWeightGoal.modifiedTimestamp;
    }

    public final long getActualEndDate() {
        return this.actualEndDate;
    }

    public final long getCreatedAt() {
        return this.createdAt;
    }

    public final long getEffectiveDate() {
        return this.effectiveDate;
    }

    public final long getExpectedAchieveDate() {
        return this.expectedAchieveDate;
    }

    public final int getGoalDirection() {
        return this.goalDirection;
    }

    public final int getInitialWeightG() {
        return this.initialWeightG;
    }

    public final int getLatestWeightG() {
        return this.latestWeightG;
    }

    public final long getLatestWeightTimestamp() {
        return this.latestWeightTimestamp;
    }

    public final long getModifiedTimestamp() {
        return this.modifiedTimestamp;
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

    public final int getTargetWeightG() {
        return this.targetWeightG;
    }

    @NotNull
    public final String getUserTagId() {
        return this.userTagId;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((this.ssoid.hashCode() * 31) + this.userTagId.hashCode()) * 31) + Long.hashCode(this.effectiveDate)) * 31) + Integer.hashCode(this.initialWeightG)) * 31) + Integer.hashCode(this.targetWeightG)) * 31) + Long.hashCode(this.expectedAchieveDate)) * 31) + Long.hashCode(this.createdAt)) * 31) + Integer.hashCode(this.goalDirection)) * 31) + Integer.hashCode(this.latestWeightG)) * 31) + Long.hashCode(this.latestWeightTimestamp)) * 31) + Integer.hashCode(this.state)) * 31) + Long.hashCode(this.actualEndDate)) * 31) + Integer.hashCode(this.syncStatus)) * 31) + Long.hashCode(this.modifiedTimestamp);
    }

    public final void setActualEndDate(long j2) {
        this.actualEndDate = j2;
    }

    public final void setCreatedAt(long j2) {
        this.createdAt = j2;
    }

    public final void setEffectiveDate(long j2) {
        this.effectiveDate = j2;
    }

    public final void setExpectedAchieveDate(long j2) {
        this.expectedAchieveDate = j2;
    }

    public final void setGoalDirection(int i) {
        this.goalDirection = i;
    }

    public final void setInitialWeightG(int i) {
        this.initialWeightG = i;
    }

    public final void setLatestWeightG(int i) {
        this.latestWeightG = i;
    }

    public final void setLatestWeightTimestamp(long j2) {
        this.latestWeightTimestamp = j2;
    }

    public final void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
    }

    public final void setSsoid(@NotNull String mSsoid) {
        Intrinsics.checkNotNullParameter(mSsoid, "mSsoid");
        this.ssoid = mSsoid;
    }

    public final void setState(int i) {
        this.state = i;
    }

    public final void setSyncStatus(int i) {
        this.syncStatus = i;
    }

    public final void setTargetWeightG(int i) {
        this.targetWeightG = i;
    }

    public final void setUserTagId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userTagId = str;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String toString() {
        return "DBWeightGoal(ssoid='" + this.ssoid + "', userTagId='" + this.userTagId + "', effectiveDate=" + this.effectiveDate + ", initialWeightG=" + this.initialWeightG + ", targetWeightG=" + this.targetWeightG + ", expectedAchieveDate=" + this.expectedAchieveDate + ", createdAt=" + this.createdAt + ", goalDirection=" + this.goalDirection + ", latestWeightG=" + this.latestWeightG + ", latestWeightTimestamp=" + this.latestWeightTimestamp + ", state=" + this.state + ", actualEndDate=" + this.actualEndDate + ", syncStatus=" + this.syncStatus + ", modifiedTimestamp=" + this.modifiedTimestamp + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.ssoid);
        parcel.writeString(this.userTagId);
        parcel.writeLong(this.effectiveDate);
        parcel.writeInt(this.initialWeightG);
        parcel.writeInt(this.targetWeightG);
        parcel.writeLong(this.expectedAchieveDate);
        parcel.writeLong(this.createdAt);
        parcel.writeInt(this.goalDirection);
        parcel.writeInt(this.latestWeightG);
        parcel.writeLong(this.latestWeightTimestamp);
        parcel.writeInt(this.state);
        parcel.writeLong(this.actualEndDate);
        parcel.writeInt(this.syncStatus);
        parcel.writeLong(this.modifiedTimestamp);
    }

    public DBWeightGoal(@NotNull String ssoid, @NotNull String userTagId, long j2, int i, int i2, long j3, long j4, int i3, int i4, long j5, int i5, long j6, int i6, long j7) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(userTagId, "userTagId");
        this.ssoid = ssoid;
        this.userTagId = userTagId;
        this.effectiveDate = j2;
        this.initialWeightG = i;
        this.targetWeightG = i2;
        this.expectedAchieveDate = j3;
        this.createdAt = j4;
        this.goalDirection = i3;
        this.latestWeightG = i4;
        this.latestWeightTimestamp = j5;
        this.state = i5;
        this.actualEndDate = j6;
        this.syncStatus = i6;
        this.modifiedTimestamp = j7;
    }

    public DBWeightGoal() {
        this("", "", 0L, 0, 0, 0L, 0L, 0, 0, 0L, 0, 0L, 0, 0L);
    }
}
