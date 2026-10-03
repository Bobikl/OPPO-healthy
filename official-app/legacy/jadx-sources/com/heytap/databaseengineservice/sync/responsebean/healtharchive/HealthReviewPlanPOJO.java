package com.heytap.databaseengineservice.sync.responsebean.healtharchive;

import androidx.annotation.Keep;
import com.heytap.databaseengineservice.db.table.healtharchives.DBHealthReviewPlan;
import com.heytap.health.health_archives.web.HealthArchiveWebViewActivity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b3\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003¢\u0006\u0002\u0010\u0012J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u000eHÆ\u0003J\t\u00105\u001a\u00020\u000eHÆ\u0003J\t\u00106\u001a\u00020\u000eHÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0099\u0001\u0010@\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0003HÆ\u0001J\u0013\u0010A\u001a\u00020B2\b\u0010C\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010D\u001a\u00020\u000eHÖ\u0001J\t\u0010E\u001a\u00020\u0005HÖ\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0010\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0014\"\u0004\b \u0010\u0016R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0014\"\u0004\b$\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0014\"\u0004\b&\u0010\u0016R\u001a\u0010\u0011\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0018\"\u0004\b(\u0010\u001aR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0014\"\u0004\b*\u0010\u0016R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0018\"\u0004\b,\u0010\u001aR\u001a\u0010\u000f\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001c\"\u0004\b.\u0010\u001eR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001c\"\u0004\b0\u0010\u001eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0014\"\u0004\b2\u0010\u0016¨\u0006F"}, d2 = {"Lcom/heytap/databaseengineservice/sync/responsebean/healtharchive/HealthReviewPlanPOJO;", "", HealthArchiveWebViewActivity.H5_DATA_ID_KEY, "", "owner", "", "docId", "category", "title", "indicatorName", DBHealthReviewPlan.DEPARTMENT, "reviewTime", DBHealthReviewPlan.DESC, "state", "", "source", "deleted", "modifiedTimestamp", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;IIIJ)V", "getCategory", "()Ljava/lang/String;", "setCategory", "(Ljava/lang/String;)V", "getDataId", "()J", "setDataId", "(J)V", "getDeleted", "()I", "setDeleted", "(I)V", "getDepartment", "setDepartment", "getDesc", "setDesc", "getDocId", "setDocId", "getIndicatorName", "setIndicatorName", "getModifiedTimestamp", "setModifiedTimestamp", "getOwner", "setOwner", "getReviewTime", "setReviewTime", "getSource", "setSource", "getState", "setState", "getTitle", "setTitle", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class HealthReviewPlanPOJO {

    @Nullable
    private String category;
    private long dataId;
    private int deleted;

    @Nullable
    private String department;

    @Nullable
    private String desc;

    @Nullable
    private String docId;

    @Nullable
    private String indicatorName;
    private long modifiedTimestamp;

    @Nullable
    private String owner;
    private long reviewTime;
    private int source;
    private int state;

    @Nullable
    private String title;

    public HealthReviewPlanPOJO() {
        this(0L, null, null, null, null, null, null, 0L, null, 0, 0, 0, 0L, 8191, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getDataId() {
        return this.dataId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getDeleted() {
        return this.deleted;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOwner() {
        return this.owner;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDocId() {
        return this.docId;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getIndicatorName() {
        return this.indicatorName;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDepartment() {
        return this.department;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getReviewTime() {
        return this.reviewTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    @NotNull
    public final HealthReviewPlanPOJO copy(long dataId, @Nullable String owner, @Nullable String docId, @Nullable String category, @Nullable String title, @Nullable String indicatorName, @Nullable String department, long reviewTime, @Nullable String desc, int state, int source, int deleted, long modifiedTimestamp) {
        return new HealthReviewPlanPOJO(dataId, owner, docId, category, title, indicatorName, department, reviewTime, desc, state, source, deleted, modifiedTimestamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthReviewPlanPOJO)) {
            return false;
        }
        HealthReviewPlanPOJO healthReviewPlanPOJO = (HealthReviewPlanPOJO) other;
        return this.dataId == healthReviewPlanPOJO.dataId && Intrinsics.areEqual(this.owner, healthReviewPlanPOJO.owner) && Intrinsics.areEqual(this.docId, healthReviewPlanPOJO.docId) && Intrinsics.areEqual(this.category, healthReviewPlanPOJO.category) && Intrinsics.areEqual(this.title, healthReviewPlanPOJO.title) && Intrinsics.areEqual(this.indicatorName, healthReviewPlanPOJO.indicatorName) && Intrinsics.areEqual(this.department, healthReviewPlanPOJO.department) && this.reviewTime == healthReviewPlanPOJO.reviewTime && Intrinsics.areEqual(this.desc, healthReviewPlanPOJO.desc) && this.state == healthReviewPlanPOJO.state && this.source == healthReviewPlanPOJO.source && this.deleted == healthReviewPlanPOJO.deleted && this.modifiedTimestamp == healthReviewPlanPOJO.modifiedTimestamp;
    }

    @Nullable
    public final String getCategory() {
        return this.category;
    }

    public final long getDataId() {
        return this.dataId;
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

    public final long getReviewTime() {
        return this.reviewTime;
    }

    public final int getSource() {
        return this.source;
    }

    public final int getState() {
        return this.state;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.dataId) * 31;
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
        return ((((((((iHashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31) + Integer.hashCode(this.state)) * 31) + Integer.hashCode(this.source)) * 31) + Integer.hashCode(this.deleted)) * 31) + Long.hashCode(this.modifiedTimestamp);
    }

    public final void setCategory(@Nullable String str) {
        this.category = str;
    }

    public final void setDataId(long j2) {
        this.dataId = j2;
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

    public final void setIndicatorName(@Nullable String str) {
        this.indicatorName = str;
    }

    public final void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
    }

    public final void setOwner(@Nullable String str) {
        this.owner = str;
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

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    @NotNull
    public String toString() {
        return "HealthReviewPlanPOJO(dataId=" + this.dataId + ", owner=" + this.owner + ", docId=" + this.docId + ", category=" + this.category + ", title=" + this.title + ", indicatorName=" + this.indicatorName + ", department=" + this.department + ", reviewTime=" + this.reviewTime + ", desc=" + this.desc + ", state=" + this.state + ", source=" + this.source + ", deleted=" + this.deleted + ", modifiedTimestamp=" + this.modifiedTimestamp + ")";
    }

    public HealthReviewPlanPOJO(long j2, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, long j3, @Nullable String str7, int i, int i2, int i3, long j4) {
        this.dataId = j2;
        this.owner = str;
        this.docId = str2;
        this.category = str3;
        this.title = str4;
        this.indicatorName = str5;
        this.department = str6;
        this.reviewTime = j3;
        this.desc = str7;
        this.state = i;
        this.source = i2;
        this.deleted = i3;
        this.modifiedTimestamp = j4;
    }

    public /* synthetic */ HealthReviewPlanPOJO(long j2, String str, String str2, String str3, String str4, String str5, String str6, long j3, String str7, int i, int i2, int i3, long j4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0L : j2, (i4 & 2) != 0 ? null : str, (i4 & 4) != 0 ? null : str2, (i4 & 8) != 0 ? null : str3, (i4 & 16) != 0 ? null : str4, (i4 & 32) != 0 ? null : str5, (i4 & 64) != 0 ? null : str6, (i4 & 128) != 0 ? 0L : j3, (i4 & 256) == 0 ? str7 : null, (i4 & 512) != 0 ? -1 : i, (i4 & 1024) != 0 ? 0 : i2, (i4 & 2048) == 0 ? i3 : 0, (i4 & 4096) != 0 ? 0L : j4);
    }
}
