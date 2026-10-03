package com.heytap.databaseengineservice.db.table.healtharchives;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.health.health_archives.web.HealthArchiveWebViewActivity;
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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b#\b\u0087\b\u0018\u0000 I2\u00020\u00012\u00020\u0002:\u0001JBy\u0012\b\b\u0003\u0010\u0013\u001a\u00020\u0007\u0012\b\b\u0003\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0016\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0007¢\u0006\u0004\bG\u0010HJ\t\u0010\u0004\u001a\u00020\u0003HÂ\u0003J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0007HÆ\u0003J\t\u0010\u000f\u001a\u00020\u000eHÆ\u0003J\t\u0010\u0010\u001a\u00020\u000eHÆ\u0003J\t\u0010\u0011\u001a\u00020\u000eHÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J{\u0010\u001e\u001a\u00020\u00002\b\b\u0003\u0010\u0013\u001a\u00020\u00072\b\b\u0003\u0010\u0014\u001a\u00020\u00032\b\b\u0003\u0010\u0015\u001a\u00020\u00032\b\b\u0003\u0010\u0016\u001a\u00020\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u000e2\b\b\u0002\u0010\u001b\u001a\u00020\u000e2\b\b\u0002\u0010\u001c\u001a\u00020\u000e2\b\b\u0002\u0010\u001d\u001a\u00020\u0007HÆ\u0001J\t\u0010\u001f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010$\u001a\u00020\u000eHÖ\u0001J\u0019\u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u000eHÖ\u0001R\"\u0010\u0013\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0016\u0010\u0014\u001a\u00020\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010/R\"\u0010\u0015\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010\u0016\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010/\u001a\u0004\b4\u00101\"\u0004\b5\u00103R$\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010/\u001a\u0004\b6\u00101\"\u0004\b7\u00103R$\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010/\u001a\u0004\b8\u00101\"\u0004\b9\u00103R\"\u0010\u0019\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010*\u001a\u0004\b:\u0010,\"\u0004\b;\u0010.R\"\u0010\u001a\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010\u001b\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010<\u001a\u0004\bA\u0010>\"\u0004\bB\u0010@R\"\u0010\u001c\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010<\u001a\u0004\bC\u0010>\"\u0004\bD\u0010@R\"\u0010\u001d\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010*\u001a\u0004\bE\u0010,\"\u0004\bF\u0010.¨\u0006K"}, d2 = {"Lcom/heytap/databaseengineservice/db/table/healtharchives/DBHealthDiseaseRisk;", "Lcom/heytap/databaseengine/model/SportHealthData;", "Landroid/os/Parcelable;", "", "component2", "getSsoid", "toString", "", "component1", "component3", "component4", "component5", "component6", "component7", "", "component8", "component9", "component10", "component11", HealthArchiveWebViewActivity.H5_DATA_ID_KEY, "ssoid", "diseaseType", "riskRank", "aiSuggestions", "references", "dataCreatedTimestamp", "syncStatus", "updated", "deleted", "modifiedTimestamp", "copy", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", UTraceSQLiteHelperKt.COL_FLAGS, "", "writeToParcel", "J", "getDataId", "()J", "setDataId", "(J)V", "Ljava/lang/String;", "getDiseaseType", "()Ljava/lang/String;", "setDiseaseType", "(Ljava/lang/String;)V", "getRiskRank", "setRiskRank", "getAiSuggestions", "setAiSuggestions", "getReferences", "setReferences", "getDataCreatedTimestamp", "setDataCreatedTimestamp", "I", "getSyncStatus", "()I", "setSyncStatus", "(I)V", "getUpdated", "setUpdated", "getDeleted", "setDeleted", "getModifiedTimestamp", "setModifiedTimestamp", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JIIIJ)V", "Companion", "a", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
@Entity(tableName = DBHealthDiseaseRisk.TABLE_NAME)
public final /* data */ class DBHealthDiseaseRisk extends SportHealthData implements Parcelable {

    @NotNull
    public static final String AI_SUGGESTION = "ai_suggestion";

    @NotNull
    public static final String DATA_CREATED_TIMESTAMP = "data_created_timestamp";

    @NotNull
    public static final String DATA_ID = "data_id";

    @NotNull
    public static final String DELETED = "deleted";

    @NotNull
    public static final String DISEASE_TYPE = "disease_type";

    @NotNull
    public static final String MODIFIED_TIMESTAMP = "modified_timestamp";

    @NotNull
    public static final String REFERENCES = "disease_references";

    @NotNull
    public static final String RISK_RANK = "risk_rank";

    @NotNull
    public static final String SSOID = "ssoid";

    @NotNull
    public static final String SYNC_STATUS = "sync_status";

    @NotNull
    public static final String TABLE_NAME = "DBHealthDiseaseRisk";

    @NotNull
    public static final String UPDATED = "updated";

    @ColumnInfo(name = AI_SUGGESTION)
    @Nullable
    private String aiSuggestions;

    @ColumnInfo(name = "data_created_timestamp")
    private long dataCreatedTimestamp;

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "data_id")
    private long dataId;

    @ColumnInfo(name = "deleted")
    private int deleted;

    @ColumnInfo(name = DISEASE_TYPE)
    @NotNull
    private String diseaseType;

    @ColumnInfo(name = "modified_timestamp")
    private long modifiedTimestamp;

    @ColumnInfo(name = REFERENCES)
    @Nullable
    private String references;

    @ColumnInfo(name = "risk_rank")
    @NotNull
    private String riskRank;

    @ColumnInfo(name = "ssoid")
    @NotNull
    private String ssoid;

    @ColumnInfo(name = "sync_status")
    private int syncStatus;

    @ColumnInfo(name = "updated")
    private int updated;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<DBHealthDiseaseRisk> CREATOR = new b();

    /* JADX INFO: renamed from: com.heytap.databaseengineservice.db.table.healtharchives.DBHealthDiseaseRisk$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0005R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0005R\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0005R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0005R\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0005¨\u0006\u0013"}, d2 = {"Lcom/heytap/databaseengineservice/db/table/healtharchives/DBHealthDiseaseRisk$a;", "", "", "a", "AI_SUGGESTION", "Ljava/lang/String;", "DATA_CREATED_TIMESTAMP", "DATA_ID", "DELETED", "DISEASE_TYPE", "MODIFIED_TIMESTAMP", "REFERENCES", "RISK_RANK", PdfViewActivity.SSOID, "SYNC_STATUS", "TABLE_NAME", "UPDATED", "<init>", "()V", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final String a() {
            String str = "create table if not exists DBHealthDiseaseRisk(data_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,ssoid TEXT not null,disease_type TEXT not null,risk_rank TEXT not null,ai_suggestion TEXT,disease_references TEXT,data_created_timestamp INTEGER NOT NULL,sync_status INTEGER NOT NULL,updated INTEGER NOT NULL,deleted INTEGER NOT NULL,modified_timestamp INTEGER not null)";
            Intrinsics.checkNotNullExpressionValue(str, "strSql.toString()");
            return str;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<DBHealthDiseaseRisk> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DBHealthDiseaseRisk createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DBHealthDiseaseRisk(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final DBHealthDiseaseRisk[] newArray(int i) {
            return new DBHealthDiseaseRisk[i];
        }
    }

    public DBHealthDiseaseRisk() {
        this(0L, null, null, null, null, null, 0L, 0, 0, 0, 0L, 2047, null);
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    private final String getSsoid() {
        return this.ssoid;
    }

    @JvmStatic
    @NotNull
    public static final String createTable() {
        return INSTANCE.a();
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getDataId() {
        return this.dataId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getDeleted() {
        return this.deleted;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDiseaseType() {
        return this.diseaseType;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRiskRank() {
        return this.riskRank;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAiSuggestions() {
        return this.aiSuggestions;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getReferences() {
        return this.references;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getDataCreatedTimestamp() {
        return this.dataCreatedTimestamp;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getSyncStatus() {
        return this.syncStatus;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getUpdated() {
        return this.updated;
    }

    @NotNull
    public final DBHealthDiseaseRisk copy(@NonNull long dataId, @NonNull @NotNull String ssoid, @NonNull @NotNull String diseaseType, @NonNull @NotNull String riskRank, @Nullable String aiSuggestions, @Nullable String references, long dataCreatedTimestamp, int syncStatus, int updated, int deleted, long modifiedTimestamp) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(diseaseType, "diseaseType");
        Intrinsics.checkNotNullParameter(riskRank, "riskRank");
        return new DBHealthDiseaseRisk(dataId, ssoid, diseaseType, riskRank, aiSuggestions, references, dataCreatedTimestamp, syncStatus, updated, deleted, modifiedTimestamp);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DBHealthDiseaseRisk)) {
            return false;
        }
        DBHealthDiseaseRisk dBHealthDiseaseRisk = (DBHealthDiseaseRisk) other;
        return this.dataId == dBHealthDiseaseRisk.dataId && Intrinsics.areEqual(this.ssoid, dBHealthDiseaseRisk.ssoid) && Intrinsics.areEqual(this.diseaseType, dBHealthDiseaseRisk.diseaseType) && Intrinsics.areEqual(this.riskRank, dBHealthDiseaseRisk.riskRank) && Intrinsics.areEqual(this.aiSuggestions, dBHealthDiseaseRisk.aiSuggestions) && Intrinsics.areEqual(this.references, dBHealthDiseaseRisk.references) && this.dataCreatedTimestamp == dBHealthDiseaseRisk.dataCreatedTimestamp && this.syncStatus == dBHealthDiseaseRisk.syncStatus && this.updated == dBHealthDiseaseRisk.updated && this.deleted == dBHealthDiseaseRisk.deleted && this.modifiedTimestamp == dBHealthDiseaseRisk.modifiedTimestamp;
    }

    @Nullable
    public final String getAiSuggestions() {
        return this.aiSuggestions;
    }

    public final long getDataCreatedTimestamp() {
        return this.dataCreatedTimestamp;
    }

    public final long getDataId() {
        return this.dataId;
    }

    public final int getDeleted() {
        return this.deleted;
    }

    @NotNull
    public final String getDiseaseType() {
        return this.diseaseType;
    }

    public final long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    @Nullable
    public final String getReferences() {
        return this.references;
    }

    @NotNull
    public final String getRiskRank() {
        return this.riskRank;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String getSsoid() {
        return this.ssoid;
    }

    public final int getSyncStatus() {
        return this.syncStatus;
    }

    public final int getUpdated() {
        return this.updated;
    }

    public int hashCode() {
        int iHashCode = ((((((Long.hashCode(this.dataId) * 31) + this.ssoid.hashCode()) * 31) + this.diseaseType.hashCode()) * 31) + this.riskRank.hashCode()) * 31;
        String str = this.aiSuggestions;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.references;
        return ((((((((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Long.hashCode(this.dataCreatedTimestamp)) * 31) + Integer.hashCode(this.syncStatus)) * 31) + Integer.hashCode(this.updated)) * 31) + Integer.hashCode(this.deleted)) * 31) + Long.hashCode(this.modifiedTimestamp);
    }

    public final void setAiSuggestions(@Nullable String str) {
        this.aiSuggestions = str;
    }

    public final void setDataCreatedTimestamp(long j2) {
        this.dataCreatedTimestamp = j2;
    }

    public final void setDataId(long j2) {
        this.dataId = j2;
    }

    public final void setDeleted(int i) {
        this.deleted = i;
    }

    public final void setDiseaseType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.diseaseType = str;
    }

    public final void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
    }

    public final void setReferences(@Nullable String str) {
        this.references = str;
    }

    public final void setRiskRank(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.riskRank = str;
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
        return "DBHealthDiseaseRisk(dataId='" + this.dataId + "', ssoid='" + this.ssoid + "', diseaseType='" + this.diseaseType + "', riskRank='" + this.riskRank + "', aiSuggestions='" + this.aiSuggestions + "', references='" + this.references + "', dataCreatedTimestamp='" + this.dataCreatedTimestamp + "', syncStatus='" + this.syncStatus + "', updated='" + this.updated + "', deleted='" + this.deleted + "', modifiedTimestamp='" + this.modifiedTimestamp + "')";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeLong(this.dataId);
        parcel.writeString(this.ssoid);
        parcel.writeString(this.diseaseType);
        parcel.writeString(this.riskRank);
        parcel.writeString(this.aiSuggestions);
        parcel.writeString(this.references);
        parcel.writeLong(this.dataCreatedTimestamp);
        parcel.writeInt(this.syncStatus);
        parcel.writeInt(this.updated);
        parcel.writeInt(this.deleted);
        parcel.writeLong(this.modifiedTimestamp);
    }

    public /* synthetic */ DBHealthDiseaseRisk(long j2, String str, String str2, String str3, String str4, String str5, long j3, int i, int i2, int i3, long j4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0L : j2, (i4 & 2) != 0 ? "" : str, (i4 & 4) != 0 ? "" : str2, (i4 & 8) == 0 ? str3 : "", (i4 & 16) != 0 ? null : str4, (i4 & 32) == 0 ? str5 : null, (i4 & 64) != 0 ? 0L : j3, (i4 & 128) != 0 ? 0 : i, (i4 & 256) != 0 ? 0 : i2, (i4 & 512) == 0 ? i3 : 0, (i4 & 1024) == 0 ? j4 : 0L);
    }

    public DBHealthDiseaseRisk(@NonNull long j2, @NonNull @NotNull String ssoid, @NonNull @NotNull String diseaseType, @NonNull @NotNull String riskRank, @Nullable String str, @Nullable String str2, long j3, int i, int i2, int i3, long j4) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(diseaseType, "diseaseType");
        Intrinsics.checkNotNullParameter(riskRank, "riskRank");
        this.dataId = j2;
        this.ssoid = ssoid;
        this.diseaseType = diseaseType;
        this.riskRank = riskRank;
        this.aiSuggestions = str;
        this.references = str2;
        this.dataCreatedTimestamp = j3;
        this.syncStatus = i;
        this.updated = i2;
        this.deleted = i3;
        this.modifiedTimestamp = j4;
    }
}
