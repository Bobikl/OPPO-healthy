package com.heytap.health.cardiovascular.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.oplus.aiunit.vision.y15;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t¢\u0006\u0002\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\tHÆ\u0003JI\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0005HÖ\u0001J\t\u0010!\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\""}, d2 = {"Lcom/heytap/health/cardiovascular/bean/QueryAiTrendAnalysisReq;", "", "startTimestamp", "", y15.PARAMS_DATA_TYPE, "", "currentValue", "", "reportException", "", "Lcom/heytap/health/cardiovascular/bean/RecordRiskItem;", "reportData", "Lcom/heytap/health/cardiovascular/bean/RecordReportData;", "(JILjava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getCurrentValue", "()Ljava/lang/String;", "getDataType", "()I", "getReportData", "()Ljava/util/List;", "getReportException", "getStartTimestamp", "()J", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "cardiovascular_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class QueryAiTrendAnalysisReq {
    public static final int $stable = 8;

    @Nullable
    private final String currentValue;
    private final int dataType;

    @NotNull
    private final List<RecordReportData> reportData;

    @NotNull
    private final List<RecordRiskItem> reportException;
    private final long startTimestamp;

    public QueryAiTrendAnalysisReq(long j2, int i, @Nullable String str, @NotNull List<RecordRiskItem> reportException, @NotNull List<RecordReportData> reportData) {
        Intrinsics.checkNotNullParameter(reportException, "reportException");
        Intrinsics.checkNotNullParameter(reportData, "reportData");
        this.startTimestamp = j2;
        this.dataType = i;
        this.currentValue = str;
        this.reportException = reportException;
        this.reportData = reportData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QueryAiTrendAnalysisReq copy$default(QueryAiTrendAnalysisReq queryAiTrendAnalysisReq, long j2, int i, String str, List list, List list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = queryAiTrendAnalysisReq.startTimestamp;
        }
        long j3 = j2;
        if ((i2 & 2) != 0) {
            i = queryAiTrendAnalysisReq.dataType;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            str = queryAiTrendAnalysisReq.currentValue;
        }
        String str2 = str;
        if ((i2 & 8) != 0) {
            list = queryAiTrendAnalysisReq.reportException;
        }
        List list3 = list;
        if ((i2 & 16) != 0) {
            list2 = queryAiTrendAnalysisReq.reportData;
        }
        return queryAiTrendAnalysisReq.copy(j3, i3, str2, list3, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getStartTimestamp() {
        return this.startTimestamp;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getDataType() {
        return this.dataType;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCurrentValue() {
        return this.currentValue;
    }

    @NotNull
    public final List<RecordRiskItem> component4() {
        return this.reportException;
    }

    @NotNull
    public final List<RecordReportData> component5() {
        return this.reportData;
    }

    @NotNull
    public final QueryAiTrendAnalysisReq copy(long startTimestamp, int dataType, @Nullable String currentValue, @NotNull List<RecordRiskItem> reportException, @NotNull List<RecordReportData> reportData) {
        Intrinsics.checkNotNullParameter(reportException, "reportException");
        Intrinsics.checkNotNullParameter(reportData, "reportData");
        return new QueryAiTrendAnalysisReq(startTimestamp, dataType, currentValue, reportException, reportData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QueryAiTrendAnalysisReq)) {
            return false;
        }
        QueryAiTrendAnalysisReq queryAiTrendAnalysisReq = (QueryAiTrendAnalysisReq) other;
        return this.startTimestamp == queryAiTrendAnalysisReq.startTimestamp && this.dataType == queryAiTrendAnalysisReq.dataType && Intrinsics.areEqual(this.currentValue, queryAiTrendAnalysisReq.currentValue) && Intrinsics.areEqual(this.reportException, queryAiTrendAnalysisReq.reportException) && Intrinsics.areEqual(this.reportData, queryAiTrendAnalysisReq.reportData);
    }

    @Nullable
    public final String getCurrentValue() {
        return this.currentValue;
    }

    public final int getDataType() {
        return this.dataType;
    }

    @NotNull
    public final List<RecordReportData> getReportData() {
        return this.reportData;
    }

    @NotNull
    public final List<RecordRiskItem> getReportException() {
        return this.reportException;
    }

    public final long getStartTimestamp() {
        return this.startTimestamp;
    }

    public int hashCode() {
        int iHashCode = ((Long.hashCode(this.startTimestamp) * 31) + Integer.hashCode(this.dataType)) * 31;
        String str = this.currentValue;
        return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.reportException.hashCode()) * 31) + this.reportData.hashCode();
    }

    @NotNull
    public String toString() {
        return "QueryAiTrendAnalysisReq(startTimestamp=" + this.startTimestamp + ", dataType=" + this.dataType + ", currentValue=" + this.currentValue + ", reportException=" + this.reportException + ", reportData=" + this.reportData + ")";
    }
}
