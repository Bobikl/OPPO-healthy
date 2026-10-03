package com.heytap.health.cardiovascular.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\u0002\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u0005HÆ\u0003JC\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\nHÖ\u0001R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/heytap/health/cardiovascular/bean/QueryRecordAiAnalysisReq;", "", "startTimestamp", "", "reportException", "", "Lcom/heytap/health/cardiovascular/bean/RecordRiskItem;", "reportData", "Lcom/heytap/health/cardiovascular/bean/RecordReportData;", "ecgStat", "", "(JLjava/util/List;Ljava/util/List;Ljava/util/List;)V", "getEcgStat", "()Ljava/util/List;", "getReportData", "getReportException", "getStartTimestamp", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "cardiovascular_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class QueryRecordAiAnalysisReq {
    public static final int $stable = 8;

    @NotNull
    private final List<String> ecgStat;

    @NotNull
    private final List<RecordReportData> reportData;

    @NotNull
    private final List<RecordRiskItem> reportException;
    private final long startTimestamp;

    public QueryRecordAiAnalysisReq(long j2, @NotNull List<RecordRiskItem> reportException, @NotNull List<RecordReportData> reportData, @NotNull List<String> ecgStat) {
        Intrinsics.checkNotNullParameter(reportException, "reportException");
        Intrinsics.checkNotNullParameter(reportData, "reportData");
        Intrinsics.checkNotNullParameter(ecgStat, "ecgStat");
        this.startTimestamp = j2;
        this.reportException = reportException;
        this.reportData = reportData;
        this.ecgStat = ecgStat;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QueryRecordAiAnalysisReq copy$default(QueryRecordAiAnalysisReq queryRecordAiAnalysisReq, long j2, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            j2 = queryRecordAiAnalysisReq.startTimestamp;
        }
        long j3 = j2;
        if ((i & 2) != 0) {
            list = queryRecordAiAnalysisReq.reportException;
        }
        List list4 = list;
        if ((i & 4) != 0) {
            list2 = queryRecordAiAnalysisReq.reportData;
        }
        List list5 = list2;
        if ((i & 8) != 0) {
            list3 = queryRecordAiAnalysisReq.ecgStat;
        }
        return queryRecordAiAnalysisReq.copy(j3, list4, list5, list3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getStartTimestamp() {
        return this.startTimestamp;
    }

    @NotNull
    public final List<RecordRiskItem> component2() {
        return this.reportException;
    }

    @NotNull
    public final List<RecordReportData> component3() {
        return this.reportData;
    }

    @NotNull
    public final List<String> component4() {
        return this.ecgStat;
    }

    @NotNull
    public final QueryRecordAiAnalysisReq copy(long startTimestamp, @NotNull List<RecordRiskItem> reportException, @NotNull List<RecordReportData> reportData, @NotNull List<String> ecgStat) {
        Intrinsics.checkNotNullParameter(reportException, "reportException");
        Intrinsics.checkNotNullParameter(reportData, "reportData");
        Intrinsics.checkNotNullParameter(ecgStat, "ecgStat");
        return new QueryRecordAiAnalysisReq(startTimestamp, reportException, reportData, ecgStat);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QueryRecordAiAnalysisReq)) {
            return false;
        }
        QueryRecordAiAnalysisReq queryRecordAiAnalysisReq = (QueryRecordAiAnalysisReq) other;
        return this.startTimestamp == queryRecordAiAnalysisReq.startTimestamp && Intrinsics.areEqual(this.reportException, queryRecordAiAnalysisReq.reportException) && Intrinsics.areEqual(this.reportData, queryRecordAiAnalysisReq.reportData) && Intrinsics.areEqual(this.ecgStat, queryRecordAiAnalysisReq.ecgStat);
    }

    @NotNull
    public final List<String> getEcgStat() {
        return this.ecgStat;
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
        return (((((Long.hashCode(this.startTimestamp) * 31) + this.reportException.hashCode()) * 31) + this.reportData.hashCode()) * 31) + this.ecgStat.hashCode();
    }

    @NotNull
    public String toString() {
        return "QueryRecordAiAnalysisReq(startTimestamp=" + this.startTimestamp + ", reportException=" + this.reportException + ", reportData=" + this.reportData + ", ecgStat=" + this.ecgStat + ")";
    }

    public /* synthetic */ QueryRecordAiAnalysisReq(long j2, List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, list, list2, (i & 8) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list3);
    }
}
