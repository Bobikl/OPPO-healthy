package com.heytap.databaseengineservice.sync.responsebean.healtharchive;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\bHÆ\u0003J\t\u0010&\u001a\u00020\bHÆ\u0003J\t\u0010'\u001a\u00020\u000bHÆ\u0003JS\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\u000bHÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\t\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0016\"\u0004\b \u0010\u0018¨\u0006."}, d2 = {"Lcom/heytap/databaseengineservice/sync/responsebean/healtharchive/HealthIndicatorFocusPOJO;", "", "name", "", "indicatorDetail", "owner", "summary", "dataCreatedTimestamp", "", "modifiedTimestamp", "del", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJI)V", "getDataCreatedTimestamp", "()J", "setDataCreatedTimestamp", "(J)V", "getDel", "()I", "setDel", "(I)V", "getIndicatorDetail", "()Ljava/lang/String;", "setIndicatorDetail", "(Ljava/lang/String;)V", "getModifiedTimestamp", "setModifiedTimestamp", "getName", "setName", "getOwner", "setOwner", "getSummary", "setSummary", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class HealthIndicatorFocusPOJO {
    private long dataCreatedTimestamp;
    private int del;

    @Nullable
    private String indicatorDetail;
    private long modifiedTimestamp;

    @NotNull
    private String name;

    @Nullable
    private String owner;

    @NotNull
    private String summary;

    public HealthIndicatorFocusPOJO() {
        this(null, null, null, null, 0L, 0L, 0, 127, null);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIndicatorDetail() {
        return this.indicatorDetail;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOwner() {
        return this.owner;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSummary() {
        return this.summary;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getDataCreatedTimestamp() {
        return this.dataCreatedTimestamp;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getDel() {
        return this.del;
    }

    @NotNull
    public final HealthIndicatorFocusPOJO copy(@NotNull String name, @Nullable String indicatorDetail, @Nullable String owner, @NotNull String summary, long dataCreatedTimestamp, long modifiedTimestamp, int del) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(summary, "summary");
        return new HealthIndicatorFocusPOJO(name, indicatorDetail, owner, summary, dataCreatedTimestamp, modifiedTimestamp, del);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthIndicatorFocusPOJO)) {
            return false;
        }
        HealthIndicatorFocusPOJO healthIndicatorFocusPOJO = (HealthIndicatorFocusPOJO) other;
        return Intrinsics.areEqual(this.name, healthIndicatorFocusPOJO.name) && Intrinsics.areEqual(this.indicatorDetail, healthIndicatorFocusPOJO.indicatorDetail) && Intrinsics.areEqual(this.owner, healthIndicatorFocusPOJO.owner) && Intrinsics.areEqual(this.summary, healthIndicatorFocusPOJO.summary) && this.dataCreatedTimestamp == healthIndicatorFocusPOJO.dataCreatedTimestamp && this.modifiedTimestamp == healthIndicatorFocusPOJO.modifiedTimestamp && this.del == healthIndicatorFocusPOJO.del;
    }

    public final long getDataCreatedTimestamp() {
        return this.dataCreatedTimestamp;
    }

    public final int getDel() {
        return this.del;
    }

    @Nullable
    public final String getIndicatorDetail() {
        return this.indicatorDetail;
    }

    public final long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getOwner() {
        return this.owner;
    }

    @NotNull
    public final String getSummary() {
        return this.summary;
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        String str = this.indicatorDetail;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.owner;
        return ((((((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.summary.hashCode()) * 31) + Long.hashCode(this.dataCreatedTimestamp)) * 31) + Long.hashCode(this.modifiedTimestamp)) * 31) + Integer.hashCode(this.del);
    }

    public final void setDataCreatedTimestamp(long j2) {
        this.dataCreatedTimestamp = j2;
    }

    public final void setDel(int i) {
        this.del = i;
    }

    public final void setIndicatorDetail(@Nullable String str) {
        this.indicatorDetail = str;
    }

    public final void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final void setOwner(@Nullable String str) {
        this.owner = str;
    }

    public final void setSummary(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.summary = str;
    }

    @NotNull
    public String toString() {
        return "HealthIndicatorFocusPOJO(name=" + this.name + ", indicatorDetail=" + this.indicatorDetail + ", owner=" + this.owner + ", summary=" + this.summary + ", dataCreatedTimestamp=" + this.dataCreatedTimestamp + ", modifiedTimestamp=" + this.modifiedTimestamp + ", del=" + this.del + ")";
    }

    public HealthIndicatorFocusPOJO(@NotNull String name, @Nullable String str, @Nullable String str2, @NotNull String summary, long j2, long j3, int i) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(summary, "summary");
        this.name = name;
        this.indicatorDetail = str;
        this.owner = str2;
        this.summary = summary;
        this.dataCreatedTimestamp = j2;
        this.modifiedTimestamp = j3;
        this.del = i;
    }

    public /* synthetic */ HealthIndicatorFocusPOJO(String str, String str2, String str3, String str4, long j2, long j3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? 0L : j2, (i2 & 32) != 0 ? 0L : j3, (i2 & 64) != 0 ? 0 : i);
    }
}
