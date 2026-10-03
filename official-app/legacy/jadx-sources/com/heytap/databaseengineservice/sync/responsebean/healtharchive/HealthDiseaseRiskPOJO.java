package com.heytap.databaseengineservice.sync.responsebean.healtharchive;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b¢\u0006\u0002\u0010\fJ\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010%\u001a\u00020\bHÆ\u0003J\t\u0010&\u001a\u00020\nHÆ\u0003J\t\u0010'\u001a\u00020\bHÆ\u0003JS\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\bHÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\nHÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u000b\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0016\"\u0004\b \u0010\u0018¨\u0006."}, d2 = {"Lcom/heytap/databaseengineservice/sync/responsebean/healtharchive/HealthDiseaseRiskPOJO;", "", "diseaseType", "", "riskRank", "suggestion", "references", "dataCreatedTimestamp", "", "del", "", "modifiedTimestamp", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JIJ)V", "getDataCreatedTimestamp", "()J", "setDataCreatedTimestamp", "(J)V", "getDel", "()I", "setDel", "(I)V", "getDiseaseType", "()Ljava/lang/String;", "setDiseaseType", "(Ljava/lang/String;)V", "getModifiedTimestamp", "setModifiedTimestamp", "getReferences", "setReferences", "getRiskRank", "setRiskRank", "getSuggestion", "setSuggestion", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class HealthDiseaseRiskPOJO {
    private long dataCreatedTimestamp;
    private int del;

    @NotNull
    private String diseaseType;
    private long modifiedTimestamp;

    @Nullable
    private String references;

    @NotNull
    private String riskRank;

    @Nullable
    private String suggestion;

    public HealthDiseaseRiskPOJO() {
        this(null, null, null, null, 0L, 0, 0L, 127, null);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDiseaseType() {
        return this.diseaseType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRiskRank() {
        return this.riskRank;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSuggestion() {
        return this.suggestion;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getReferences() {
        return this.references;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getDataCreatedTimestamp() {
        return this.dataCreatedTimestamp;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getDel() {
        return this.del;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    @NotNull
    public final HealthDiseaseRiskPOJO copy(@NotNull String diseaseType, @NotNull String riskRank, @Nullable String suggestion, @Nullable String references, long dataCreatedTimestamp, int del, long modifiedTimestamp) {
        Intrinsics.checkNotNullParameter(diseaseType, "diseaseType");
        Intrinsics.checkNotNullParameter(riskRank, "riskRank");
        return new HealthDiseaseRiskPOJO(diseaseType, riskRank, suggestion, references, dataCreatedTimestamp, del, modifiedTimestamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthDiseaseRiskPOJO)) {
            return false;
        }
        HealthDiseaseRiskPOJO healthDiseaseRiskPOJO = (HealthDiseaseRiskPOJO) other;
        return Intrinsics.areEqual(this.diseaseType, healthDiseaseRiskPOJO.diseaseType) && Intrinsics.areEqual(this.riskRank, healthDiseaseRiskPOJO.riskRank) && Intrinsics.areEqual(this.suggestion, healthDiseaseRiskPOJO.suggestion) && Intrinsics.areEqual(this.references, healthDiseaseRiskPOJO.references) && this.dataCreatedTimestamp == healthDiseaseRiskPOJO.dataCreatedTimestamp && this.del == healthDiseaseRiskPOJO.del && this.modifiedTimestamp == healthDiseaseRiskPOJO.modifiedTimestamp;
    }

    public final long getDataCreatedTimestamp() {
        return this.dataCreatedTimestamp;
    }

    public final int getDel() {
        return this.del;
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

    @Nullable
    public final String getSuggestion() {
        return this.suggestion;
    }

    public int hashCode() {
        int iHashCode = ((this.diseaseType.hashCode() * 31) + this.riskRank.hashCode()) * 31;
        String str = this.suggestion;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.references;
        return ((((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Long.hashCode(this.dataCreatedTimestamp)) * 31) + Integer.hashCode(this.del)) * 31) + Long.hashCode(this.modifiedTimestamp);
    }

    public final void setDataCreatedTimestamp(long j2) {
        this.dataCreatedTimestamp = j2;
    }

    public final void setDel(int i) {
        this.del = i;
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

    public final void setSuggestion(@Nullable String str) {
        this.suggestion = str;
    }

    @NotNull
    public String toString() {
        return "HealthDiseaseRiskPOJO(diseaseType=" + this.diseaseType + ", riskRank=" + this.riskRank + ", suggestion=" + this.suggestion + ", references=" + this.references + ", dataCreatedTimestamp=" + this.dataCreatedTimestamp + ", del=" + this.del + ", modifiedTimestamp=" + this.modifiedTimestamp + ")";
    }

    public HealthDiseaseRiskPOJO(@NotNull String diseaseType, @NotNull String riskRank, @Nullable String str, @Nullable String str2, long j2, int i, long j3) {
        Intrinsics.checkNotNullParameter(diseaseType, "diseaseType");
        Intrinsics.checkNotNullParameter(riskRank, "riskRank");
        this.diseaseType = diseaseType;
        this.riskRank = riskRank;
        this.suggestion = str;
        this.references = str2;
        this.dataCreatedTimestamp = j2;
        this.del = i;
        this.modifiedTimestamp = j3;
    }

    public /* synthetic */ HealthDiseaseRiskPOJO(String str, String str2, String str3, String str4, long j2, int i, long j3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : str4, (i2 & 16) != 0 ? 0L : j2, (i2 & 32) != 0 ? 0 : i, (i2 & 64) != 0 ? 0L : j3);
    }
}
