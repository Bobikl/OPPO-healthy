package com.heytap.databaseengineservice.db.table.healtharchives;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
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
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b!\b\u0087\b\u0018\u0000 E2\u00020\u00012\u00020\u0002:\u0001FBo\u0012\b\b\u0003\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0013\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0018\u001a\u00020\r\u0012\b\b\u0002\u0010\u0019\u001a\u00020\r\u0012\b\b\u0002\u0010\u001a\u001a\u00020\r\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u000b¢\u0006\u0004\bC\u0010DJ\t\u0010\u0004\u001a\u00020\u0003HÂ\u0003J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\u000e\u001a\u00020\rHÆ\u0003J\t\u0010\u000f\u001a\u00020\rHÆ\u0003J\t\u0010\u0010\u001a\u00020\rHÆ\u0003J\t\u0010\u0011\u001a\u00020\u000bHÆ\u0003Jq\u0010\u001c\u001a\u00020\u00002\b\b\u0003\u0010\u0012\u001a\u00020\u00032\b\b\u0003\u0010\u0013\u001a\u00020\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\r2\b\b\u0002\u0010\u0019\u001a\u00020\r2\b\b\u0002\u0010\u001a\u001a\u00020\r2\b\b\u0002\u0010\u001b\u001a\u00020\u000bHÆ\u0001J\t\u0010\u001d\u001a\u00020\rHÖ\u0001J\u0013\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\"\u001a\u00020\rHÖ\u0001J\u0019\u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\rHÖ\u0001R\u0016\u0010\u0012\u001a\u00020\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010(R\"\u0010\u0013\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010(\u001a\u0004\b-\u0010*\"\u0004\b.\u0010,R$\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010(\u001a\u0004\b/\u0010*\"\u0004\b0\u0010,R\"\u0010\u0016\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010(\u001a\u0004\b1\u0010*\"\u0004\b2\u0010,R\"\u0010\u0017\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010\u0018\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010\u0019\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u00108\u001a\u0004\b=\u0010:\"\u0004\b>\u0010<R\"\u0010\u001a\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u00108\u001a\u0004\b?\u0010:\"\u0004\b@\u0010<R\"\u0010\u001b\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u00103\u001a\u0004\bA\u00105\"\u0004\bB\u00107¨\u0006G"}, d2 = {"Lcom/heytap/databaseengineservice/db/table/healtharchives/DBHealthIndicatorFocus;", "Lcom/heytap/databaseengine/model/SportHealthData;", "Landroid/os/Parcelable;", "", "component1", "getSsoid", "toString", "component2", "component3", "component4", "component5", "", "component6", "", "component7", "component8", "component9", "component10", "ssoid", "indicatorName", "indicatorDetail", "owner", "summary", "dataCreatedTimestamp", "syncStatus", "updated", "deleted", "modifiedTimestamp", "copy", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", UTraceSQLiteHelperKt.COL_FLAGS, "", "writeToParcel", "Ljava/lang/String;", "getIndicatorName", "()Ljava/lang/String;", "setIndicatorName", "(Ljava/lang/String;)V", "getIndicatorDetail", "setIndicatorDetail", "getOwner", "setOwner", "getSummary", "setSummary", "J", "getDataCreatedTimestamp", "()J", "setDataCreatedTimestamp", "(J)V", "I", "getSyncStatus", "()I", "setSyncStatus", "(I)V", "getUpdated", "setUpdated", "getDeleted", "setDeleted", "getModifiedTimestamp", "setModifiedTimestamp", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JIIIJ)V", "Companion", "a", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
@Entity(primaryKeys = {"ssoid", "indicator_name"}, tableName = DBHealthIndicatorFocus.TABLE_NAME)
public final /* data */ class DBHealthIndicatorFocus extends SportHealthData implements Parcelable {

    @NotNull
    public static final String DATA_CREATED_TIMESTAMP = "data_created_timestamp";

    @NotNull
    public static final String DELETED = "deleted";

    @NotNull
    public static final String INDICATOR_DETAIL = "indicator_detail";

    @NotNull
    public static final String INDICATOR_NAME = "indicator_name";

    @NotNull
    public static final String INDICATOR_SUMMARY = "indicator_summary";

    @NotNull
    public static final String MODIFIED_TIMESTAMP = "modified_timestamp";

    @NotNull
    public static final String OWNER = "owner";

    @NotNull
    public static final String SSOID = "ssoid";

    @NotNull
    public static final String SYNC_STATUS = "sync_status";

    @NotNull
    public static final String TABLE_NAME = "DBHealthIndicatorFocus";

    @NotNull
    public static final String UPDATED = "updated";

    @ColumnInfo(name = "data_created_timestamp")
    private long dataCreatedTimestamp;

    @ColumnInfo(name = "deleted")
    private int deleted;

    @ColumnInfo(name = INDICATOR_DETAIL)
    @Nullable
    private String indicatorDetail;

    @ColumnInfo(name = "indicator_name")
    @NotNull
    private String indicatorName;

    @ColumnInfo(name = "modified_timestamp")
    private long modifiedTimestamp;

    @ColumnInfo(name = "owner")
    @Nullable
    private String owner;

    @ColumnInfo(name = "ssoid")
    @NotNull
    private String ssoid;

    @ColumnInfo(name = INDICATOR_SUMMARY)
    @NotNull
    private String summary;

    @ColumnInfo(name = "sync_status")
    private int syncStatus;

    @ColumnInfo(name = "updated")
    private int updated;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<DBHealthIndicatorFocus> CREATOR = new b();

    /* JADX INFO: renamed from: com.heytap.databaseengineservice.db.table.healtharchives.DBHealthIndicatorFocus$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0005R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0005R\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0005R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0005¨\u0006\u0012"}, d2 = {"Lcom/heytap/databaseengineservice/db/table/healtharchives/DBHealthIndicatorFocus$a;", "", "", "a", "DATA_CREATED_TIMESTAMP", "Ljava/lang/String;", "DELETED", "INDICATOR_DETAIL", "INDICATOR_NAME", "INDICATOR_SUMMARY", "MODIFIED_TIMESTAMP", "OWNER", PdfViewActivity.SSOID, "SYNC_STATUS", "TABLE_NAME", "UPDATED", "<init>", "()V", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final String a() {
            String str = "create table if not exists DBHealthIndicatorFocus(ssoid TEXT not null,indicator_name TEXT not null,indicator_summary TEXT not null ,indicator_detail TEXT,owner TEXT,data_created_timestamp INTEGER not null,sync_status INTEGER NOT NULL,updated INTEGER NOT NULL,deleted INTEGER NOT NULL,modified_timestamp INTEGER not null,primary key(ssoid,indicator_name))";
            Intrinsics.checkNotNullExpressionValue(str, "strSql.toString()");
            return str;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<DBHealthIndicatorFocus> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DBHealthIndicatorFocus createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DBHealthIndicatorFocus(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final DBHealthIndicatorFocus[] newArray(int i) {
            return new DBHealthIndicatorFocus[i];
        }
    }

    public DBHealthIndicatorFocus() {
        this(null, null, null, null, null, 0L, 0, 0, 0, 0L, 1023, null);
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
    public final long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIndicatorName() {
        return this.indicatorName;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIndicatorDetail() {
        return this.indicatorDetail;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getOwner() {
        return this.owner;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSummary() {
        return this.summary;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getDataCreatedTimestamp() {
        return this.dataCreatedTimestamp;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getSyncStatus() {
        return this.syncStatus;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getUpdated() {
        return this.updated;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getDeleted() {
        return this.deleted;
    }

    @NotNull
    public final DBHealthIndicatorFocus copy(@NonNull @NotNull String ssoid, @NonNull @NotNull String indicatorName, @Nullable String indicatorDetail, @Nullable String owner, @NotNull String summary, long dataCreatedTimestamp, int syncStatus, int updated, int deleted, long modifiedTimestamp) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(indicatorName, "indicatorName");
        Intrinsics.checkNotNullParameter(summary, "summary");
        return new DBHealthIndicatorFocus(ssoid, indicatorName, indicatorDetail, owner, summary, dataCreatedTimestamp, syncStatus, updated, deleted, modifiedTimestamp);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DBHealthIndicatorFocus)) {
            return false;
        }
        DBHealthIndicatorFocus dBHealthIndicatorFocus = (DBHealthIndicatorFocus) other;
        return Intrinsics.areEqual(this.ssoid, dBHealthIndicatorFocus.ssoid) && Intrinsics.areEqual(this.indicatorName, dBHealthIndicatorFocus.indicatorName) && Intrinsics.areEqual(this.indicatorDetail, dBHealthIndicatorFocus.indicatorDetail) && Intrinsics.areEqual(this.owner, dBHealthIndicatorFocus.owner) && Intrinsics.areEqual(this.summary, dBHealthIndicatorFocus.summary) && this.dataCreatedTimestamp == dBHealthIndicatorFocus.dataCreatedTimestamp && this.syncStatus == dBHealthIndicatorFocus.syncStatus && this.updated == dBHealthIndicatorFocus.updated && this.deleted == dBHealthIndicatorFocus.deleted && this.modifiedTimestamp == dBHealthIndicatorFocus.modifiedTimestamp;
    }

    public final long getDataCreatedTimestamp() {
        return this.dataCreatedTimestamp;
    }

    public final int getDeleted() {
        return this.deleted;
    }

    @Nullable
    public final String getIndicatorDetail() {
        return this.indicatorDetail;
    }

    @NotNull
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

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String getSsoid() {
        return this.ssoid;
    }

    @NotNull
    public final String getSummary() {
        return this.summary;
    }

    public final int getSyncStatus() {
        return this.syncStatus;
    }

    public final int getUpdated() {
        return this.updated;
    }

    public int hashCode() {
        int iHashCode = ((this.ssoid.hashCode() * 31) + this.indicatorName.hashCode()) * 31;
        String str = this.indicatorDetail;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.owner;
        return ((((((((((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.summary.hashCode()) * 31) + Long.hashCode(this.dataCreatedTimestamp)) * 31) + Integer.hashCode(this.syncStatus)) * 31) + Integer.hashCode(this.updated)) * 31) + Integer.hashCode(this.deleted)) * 31) + Long.hashCode(this.modifiedTimestamp);
    }

    public final void setDataCreatedTimestamp(long j2) {
        this.dataCreatedTimestamp = j2;
    }

    public final void setDeleted(int i) {
        this.deleted = i;
    }

    public final void setIndicatorDetail(@Nullable String str) {
        this.indicatorDetail = str;
    }

    public final void setIndicatorName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.indicatorName = str;
    }

    public final void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
    }

    public final void setOwner(@Nullable String str) {
        this.owner = str;
    }

    public final void setSummary(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.summary = str;
    }

    public final void setSyncStatus(int i) {
        this.syncStatus = i;
    }

    public final void setUpdated(int i) {
        this.updated = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String toString() {
        return "DBHealthIndicatorFocus(ssoid='" + this.ssoid + "', indicatorName=" + this.indicatorName + ", indicatorDetail='" + this.indicatorDetail + "', summary='" + this.summary + "',   owner='" + this.owner + "', dataCreatedTimestamp='" + this.dataCreatedTimestamp + "',  syncStatus='" + this.syncStatus + "', updated='" + this.updated + "', deleted='" + this.deleted + "',modifiedTimestamp='" + this.modifiedTimestamp + "')";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.ssoid);
        parcel.writeString(this.indicatorName);
        parcel.writeString(this.indicatorDetail);
        parcel.writeString(this.owner);
        parcel.writeString(this.summary);
        parcel.writeLong(this.dataCreatedTimestamp);
        parcel.writeInt(this.syncStatus);
        parcel.writeInt(this.updated);
        parcel.writeInt(this.deleted);
        parcel.writeLong(this.modifiedTimestamp);
    }

    public /* synthetic */ DBHealthIndicatorFocus(String str, String str2, String str3, String str4, String str5, long j2, int i, int i2, int i3, long j3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? "" : str2, (i4 & 4) != 0 ? null : str3, (i4 & 8) == 0 ? str4 : null, (i4 & 16) == 0 ? str5 : "", (i4 & 32) != 0 ? 0L : j2, (i4 & 64) != 0 ? 0 : i, (i4 & 128) != 0 ? 0 : i2, (i4 & 256) == 0 ? i3 : 0, (i4 & 512) == 0 ? j3 : 0L);
    }

    public DBHealthIndicatorFocus(@NonNull @NotNull String ssoid, @NonNull @NotNull String indicatorName, @Nullable String str, @Nullable String str2, @NotNull String summary, long j2, int i, int i2, int i3, long j3) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(indicatorName, "indicatorName");
        Intrinsics.checkNotNullParameter(summary, "summary");
        this.ssoid = ssoid;
        this.indicatorName = indicatorName;
        this.indicatorDetail = str;
        this.owner = str2;
        this.summary = summary;
        this.dataCreatedTimestamp = j2;
        this.syncStatus = i;
        this.updated = i2;
        this.deleted = i3;
        this.modifiedTimestamp = j3;
    }
}
