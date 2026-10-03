package com.heytap.health.cardiovascular.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J7\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/heytap/health/cardiovascular/bean/AnalysisChartData;", "", "healthStatus", "", "date", "", "metricValue", "signValue", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDate", "()Ljava/lang/String;", "getHealthStatus", "()I", "getMetricValue", "getSignValue", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "cardiovascular_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class AnalysisChartData {
    public static final int $stable = 0;

    @Nullable
    private final String date;
    private final int healthStatus;

    @Nullable
    private final String metricValue;

    @Nullable
    private final String signValue;

    public AnalysisChartData(int i, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.healthStatus = i;
        this.date = str;
        this.metricValue = str2;
        this.signValue = str3;
    }

    public static /* synthetic */ AnalysisChartData copy$default(AnalysisChartData analysisChartData, int i, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = analysisChartData.healthStatus;
        }
        if ((i2 & 2) != 0) {
            str = analysisChartData.date;
        }
        if ((i2 & 4) != 0) {
            str2 = analysisChartData.metricValue;
        }
        if ((i2 & 8) != 0) {
            str3 = analysisChartData.signValue;
        }
        return analysisChartData.copy(i, str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getHealthStatus() {
        return this.healthStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMetricValue() {
        return this.metricValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSignValue() {
        return this.signValue;
    }

    @NotNull
    public final AnalysisChartData copy(int healthStatus, @Nullable String date, @Nullable String metricValue, @Nullable String signValue) {
        return new AnalysisChartData(healthStatus, date, metricValue, signValue);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnalysisChartData)) {
            return false;
        }
        AnalysisChartData analysisChartData = (AnalysisChartData) other;
        return this.healthStatus == analysisChartData.healthStatus && Intrinsics.areEqual(this.date, analysisChartData.date) && Intrinsics.areEqual(this.metricValue, analysisChartData.metricValue) && Intrinsics.areEqual(this.signValue, analysisChartData.signValue);
    }

    @Nullable
    public final String getDate() {
        return this.date;
    }

    public final int getHealthStatus() {
        return this.healthStatus;
    }

    @Nullable
    public final String getMetricValue() {
        return this.metricValue;
    }

    @Nullable
    public final String getSignValue() {
        return this.signValue;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.healthStatus) * 31;
        String str = this.date;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.metricValue;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.signValue;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AnalysisChartData(healthStatus=" + this.healthStatus + ", date=" + this.date + ", metricValue=" + this.metricValue + ", signValue=" + this.signValue + ")";
    }

    public /* synthetic */ AnalysisChartData(int i, String str, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, str, str2, str3);
    }
}
