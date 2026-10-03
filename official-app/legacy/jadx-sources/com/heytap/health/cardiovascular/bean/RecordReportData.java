package com.heytap.health.cardiovascular.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.oplus.aiunit.vision.y15;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/heytap/health/cardiovascular/bean/RecordReportData;", "", y15.PARAMS_DATA_TYPE, "", "metricValue", "", "healthStatus", "(ILjava/lang/String;I)V", "getDataType", "()I", "getHealthStatus", "getMetricValue", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "cardiovascular_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class RecordReportData {
    public static final int $stable = 0;
    private final int dataType;
    private final int healthStatus;

    @NotNull
    private final String metricValue;

    public RecordReportData(int i, @NotNull String metricValue, int i2) {
        Intrinsics.checkNotNullParameter(metricValue, "metricValue");
        this.dataType = i;
        this.metricValue = metricValue;
        this.healthStatus = i2;
    }

    public static /* synthetic */ RecordReportData copy$default(RecordReportData recordReportData, int i, String str, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = recordReportData.dataType;
        }
        if ((i3 & 2) != 0) {
            str = recordReportData.metricValue;
        }
        if ((i3 & 4) != 0) {
            i2 = recordReportData.healthStatus;
        }
        return recordReportData.copy(i, str, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getDataType() {
        return this.dataType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMetricValue() {
        return this.metricValue;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getHealthStatus() {
        return this.healthStatus;
    }

    @NotNull
    public final RecordReportData copy(int dataType, @NotNull String metricValue, int healthStatus) {
        Intrinsics.checkNotNullParameter(metricValue, "metricValue");
        return new RecordReportData(dataType, metricValue, healthStatus);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecordReportData)) {
            return false;
        }
        RecordReportData recordReportData = (RecordReportData) other;
        return this.dataType == recordReportData.dataType && Intrinsics.areEqual(this.metricValue, recordReportData.metricValue) && this.healthStatus == recordReportData.healthStatus;
    }

    public final int getDataType() {
        return this.dataType;
    }

    public final int getHealthStatus() {
        return this.healthStatus;
    }

    @NotNull
    public final String getMetricValue() {
        return this.metricValue;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.dataType) * 31) + this.metricValue.hashCode()) * 31) + Integer.hashCode(this.healthStatus);
    }

    @NotNull
    public String toString() {
        return "RecordReportData(dataType=" + this.dataType + ", metricValue=" + this.metricValue + ", healthStatus=" + this.healthStatus + ")";
    }
}
