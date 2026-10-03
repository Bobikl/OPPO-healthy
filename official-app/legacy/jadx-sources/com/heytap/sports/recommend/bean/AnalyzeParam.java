package com.heytap.sports.recommend.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.FrameMetricsAggregator;
import com.heytap.health.core.provider.adapter.open.SleepDataAdapter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003¢\u0006\u0002\u0010\u0011J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003Jm\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0003HÆ\u0001J\u0013\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010=\u001a\u00020\u0003HÖ\u0001J\t\u0010>\u001a\u00020?HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0013\"\u0004\b)\u0010\u0015R\u001a\u0010\u0010\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0013\"\u0004\b+\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u0006@"}, d2 = {"Lcom/heytap/sports/recommend/bean/AnalyzeParam;", "", "analysisType", "", "todaySportCommentType", "sportData", "Lcom/heytap/sports/recommend/bean/SportData;", "environment", "Lcom/heytap/sports/recommend/bean/Environment;", "vitalSignsData", "Lcom/heytap/sports/recommend/bean/VitalSignsData;", "sleepData", "Lcom/heytap/sports/recommend/bean/SleepData;", "healthArchiveData", "Lcom/heytap/sports/recommend/bean/HealthArchives;", "dataUpdateTime", "version", "(IILcom/heytap/sports/recommend/bean/SportData;Lcom/heytap/sports/recommend/bean/Environment;Lcom/heytap/sports/recommend/bean/VitalSignsData;Lcom/heytap/sports/recommend/bean/SleepData;Lcom/heytap/sports/recommend/bean/HealthArchives;II)V", "getAnalysisType", "()I", "setAnalysisType", "(I)V", "getDataUpdateTime", "setDataUpdateTime", "getEnvironment", "()Lcom/heytap/sports/recommend/bean/Environment;", "setEnvironment", "(Lcom/heytap/sports/recommend/bean/Environment;)V", "getHealthArchiveData", "()Lcom/heytap/sports/recommend/bean/HealthArchives;", "setHealthArchiveData", "(Lcom/heytap/sports/recommend/bean/HealthArchives;)V", SleepDataAdapter.GET_SLEEP_DATA_ITEM, "()Lcom/heytap/sports/recommend/bean/SleepData;", "setSleepData", "(Lcom/heytap/sports/recommend/bean/SleepData;)V", "getSportData", "()Lcom/heytap/sports/recommend/bean/SportData;", "setSportData", "(Lcom/heytap/sports/recommend/bean/SportData;)V", "getTodaySportCommentType", "setTodaySportCommentType", "getVersion", "setVersion", "getVitalSignsData", "()Lcom/heytap/sports/recommend/bean/VitalSignsData;", "setVitalSignsData", "(Lcom/heytap/sports/recommend/bean/VitalSignsData;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "", "recommend_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class AnalyzeParam {
    public static final int $stable = 8;
    private int analysisType;
    private int dataUpdateTime;

    @Nullable
    private Environment environment;

    @Nullable
    private HealthArchives healthArchiveData;

    @Nullable
    private SleepData sleepData;

    @Nullable
    private SportData sportData;
    private int todaySportCommentType;
    private int version;

    @Nullable
    private VitalSignsData vitalSignsData;

    public AnalyzeParam() {
        this(0, 0, null, null, null, null, null, 0, 0, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getAnalysisType() {
        return this.analysisType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTodaySportCommentType() {
        return this.todaySportCommentType;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SportData getSportData() {
        return this.sportData;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Environment getEnvironment() {
        return this.environment;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final VitalSignsData getVitalSignsData() {
        return this.vitalSignsData;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final SleepData getSleepData() {
        return this.sleepData;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final HealthArchives getHealthArchiveData() {
        return this.healthArchiveData;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getDataUpdateTime() {
        return this.dataUpdateTime;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    @NotNull
    public final AnalyzeParam copy(int analysisType, int todaySportCommentType, @Nullable SportData sportData, @Nullable Environment environment, @Nullable VitalSignsData vitalSignsData, @Nullable SleepData sleepData, @Nullable HealthArchives healthArchiveData, int dataUpdateTime, int version) {
        return new AnalyzeParam(analysisType, todaySportCommentType, sportData, environment, vitalSignsData, sleepData, healthArchiveData, dataUpdateTime, version);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnalyzeParam)) {
            return false;
        }
        AnalyzeParam analyzeParam = (AnalyzeParam) other;
        return this.analysisType == analyzeParam.analysisType && this.todaySportCommentType == analyzeParam.todaySportCommentType && Intrinsics.areEqual(this.sportData, analyzeParam.sportData) && Intrinsics.areEqual(this.environment, analyzeParam.environment) && Intrinsics.areEqual(this.vitalSignsData, analyzeParam.vitalSignsData) && Intrinsics.areEqual(this.sleepData, analyzeParam.sleepData) && Intrinsics.areEqual(this.healthArchiveData, analyzeParam.healthArchiveData) && this.dataUpdateTime == analyzeParam.dataUpdateTime && this.version == analyzeParam.version;
    }

    public final int getAnalysisType() {
        return this.analysisType;
    }

    public final int getDataUpdateTime() {
        return this.dataUpdateTime;
    }

    @Nullable
    public final Environment getEnvironment() {
        return this.environment;
    }

    @Nullable
    public final HealthArchives getHealthArchiveData() {
        return this.healthArchiveData;
    }

    @Nullable
    public final SleepData getSleepData() {
        return this.sleepData;
    }

    @Nullable
    public final SportData getSportData() {
        return this.sportData;
    }

    public final int getTodaySportCommentType() {
        return this.todaySportCommentType;
    }

    public final int getVersion() {
        return this.version;
    }

    @Nullable
    public final VitalSignsData getVitalSignsData() {
        return this.vitalSignsData;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.analysisType) * 31) + Integer.hashCode(this.todaySportCommentType)) * 31;
        SportData sportData = this.sportData;
        int iHashCode2 = (iHashCode + (sportData == null ? 0 : sportData.hashCode())) * 31;
        Environment environment = this.environment;
        int iHashCode3 = (iHashCode2 + (environment == null ? 0 : environment.hashCode())) * 31;
        VitalSignsData vitalSignsData = this.vitalSignsData;
        int iHashCode4 = (iHashCode3 + (vitalSignsData == null ? 0 : vitalSignsData.hashCode())) * 31;
        SleepData sleepData = this.sleepData;
        int iHashCode5 = (iHashCode4 + (sleepData == null ? 0 : sleepData.hashCode())) * 31;
        HealthArchives healthArchives = this.healthArchiveData;
        return ((((iHashCode5 + (healthArchives != null ? healthArchives.hashCode() : 0)) * 31) + Integer.hashCode(this.dataUpdateTime)) * 31) + Integer.hashCode(this.version);
    }

    public final void setAnalysisType(int i) {
        this.analysisType = i;
    }

    public final void setDataUpdateTime(int i) {
        this.dataUpdateTime = i;
    }

    public final void setEnvironment(@Nullable Environment environment) {
        this.environment = environment;
    }

    public final void setHealthArchiveData(@Nullable HealthArchives healthArchives) {
        this.healthArchiveData = healthArchives;
    }

    public final void setSleepData(@Nullable SleepData sleepData) {
        this.sleepData = sleepData;
    }

    public final void setSportData(@Nullable SportData sportData) {
        this.sportData = sportData;
    }

    public final void setTodaySportCommentType(int i) {
        this.todaySportCommentType = i;
    }

    public final void setVersion(int i) {
        this.version = i;
    }

    public final void setVitalSignsData(@Nullable VitalSignsData vitalSignsData) {
        this.vitalSignsData = vitalSignsData;
    }

    @NotNull
    public String toString() {
        return "AnalyzeParam(analysisType=" + this.analysisType + ", todaySportCommentType=" + this.todaySportCommentType + ", sportData=" + this.sportData + ", environment=" + this.environment + ", vitalSignsData=" + this.vitalSignsData + ", sleepData=" + this.sleepData + ", healthArchiveData=" + this.healthArchiveData + ", dataUpdateTime=" + this.dataUpdateTime + ", version=" + this.version + ")";
    }

    public AnalyzeParam(int i, int i2, @Nullable SportData sportData, @Nullable Environment environment, @Nullable VitalSignsData vitalSignsData, @Nullable SleepData sleepData, @Nullable HealthArchives healthArchives, int i3, int i4) {
        this.analysisType = i;
        this.todaySportCommentType = i2;
        this.sportData = sportData;
        this.environment = environment;
        this.vitalSignsData = vitalSignsData;
        this.sleepData = sleepData;
        this.healthArchiveData = healthArchives;
        this.dataUpdateTime = i3;
        this.version = i4;
    }

    public /* synthetic */ AnalyzeParam(int i, int i2, SportData sportData, Environment environment, VitalSignsData vitalSignsData, SleepData sleepData, HealthArchives healthArchives, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 1 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? null : sportData, (i5 & 8) != 0 ? null : environment, (i5 & 16) != 0 ? null : vitalSignsData, (i5 & 32) != 0 ? null : sleepData, (i5 & 64) == 0 ? healthArchives : null, (i5 & 128) != 0 ? 0 : i3, (i5 & 256) == 0 ? i4 : 0);
    }
}
