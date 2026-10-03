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
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b¢\u0006\u0002\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bHÆ\u0003J]\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0005HÖ\u0001J\t\u0010'\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011¨\u0006("}, d2 = {"Lcom/heytap/health/cardiovascular/bean/QueryAiCrossAnalysisReq;", "", "startTimestamp", "", y15.PARAMS_DATA_TYPE, "", "currentValue", "", "tagField", "tagFieldEng", "reportException", "", "Lcom/heytap/health/cardiovascular/bean/RecordRiskItem;", "reportData", "Lcom/heytap/health/cardiovascular/bean/RecordReportData;", "(JILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getCurrentValue", "()Ljava/lang/String;", "getDataType", "()I", "getReportData", "()Ljava/util/List;", "getReportException", "getStartTimestamp", "()J", "getTagField", "getTagFieldEng", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "cardiovascular_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class QueryAiCrossAnalysisReq {
    public static final int $stable = 8;

    @Nullable
    private final String currentValue;
    private final int dataType;

    @NotNull
    private final List<RecordReportData> reportData;

    @NotNull
    private final List<RecordRiskItem> reportException;
    private final long startTimestamp;

    @NotNull
    private final String tagField;

    @NotNull
    private final String tagFieldEng;

    public QueryAiCrossAnalysisReq(long j2, int i, @Nullable String str, @NotNull String tagField, @NotNull String tagFieldEng, @NotNull List<RecordRiskItem> reportException, @NotNull List<RecordReportData> reportData) {
        Intrinsics.checkNotNullParameter(tagField, "tagField");
        Intrinsics.checkNotNullParameter(tagFieldEng, "tagFieldEng");
        Intrinsics.checkNotNullParameter(reportException, "reportException");
        Intrinsics.checkNotNullParameter(reportData, "reportData");
        this.startTimestamp = j2;
        this.dataType = i;
        this.currentValue = str;
        this.tagField = tagField;
        this.tagFieldEng = tagFieldEng;
        this.reportException = reportException;
        this.reportData = reportData;
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
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTagField() {
        return this.tagField;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTagFieldEng() {
        return this.tagFieldEng;
    }

    @NotNull
    public final List<RecordRiskItem> component6() {
        return this.reportException;
    }

    @NotNull
    public final List<RecordReportData> component7() {
        return this.reportData;
    }

    @NotNull
    public final QueryAiCrossAnalysisReq copy(long startTimestamp, int dataType, @Nullable String currentValue, @NotNull String tagField, @NotNull String tagFieldEng, @NotNull List<RecordRiskItem> reportException, @NotNull List<RecordReportData> reportData) {
        Intrinsics.checkNotNullParameter(tagField, "tagField");
        Intrinsics.checkNotNullParameter(tagFieldEng, "tagFieldEng");
        Intrinsics.checkNotNullParameter(reportException, "reportException");
        Intrinsics.checkNotNullParameter(reportData, "reportData");
        return new QueryAiCrossAnalysisReq(startTimestamp, dataType, currentValue, tagField, tagFieldEng, reportException, reportData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QueryAiCrossAnalysisReq)) {
            return false;
        }
        QueryAiCrossAnalysisReq queryAiCrossAnalysisReq = (QueryAiCrossAnalysisReq) other;
        return this.startTimestamp == queryAiCrossAnalysisReq.startTimestamp && this.dataType == queryAiCrossAnalysisReq.dataType && Intrinsics.areEqual(this.currentValue, queryAiCrossAnalysisReq.currentValue) && Intrinsics.areEqual(this.tagField, queryAiCrossAnalysisReq.tagField) && Intrinsics.areEqual(this.tagFieldEng, queryAiCrossAnalysisReq.tagFieldEng) && Intrinsics.areEqual(this.reportException, queryAiCrossAnalysisReq.reportException) && Intrinsics.areEqual(this.reportData, queryAiCrossAnalysisReq.reportData);
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

    @NotNull
    public final String getTagField() {
        return this.tagField;
    }

    @NotNull
    public final String getTagFieldEng() {
        return this.tagFieldEng;
    }

    public int hashCode() {
        int iHashCode = ((Long.hashCode(this.startTimestamp) * 31) + Integer.hashCode(this.dataType)) * 31;
        String str = this.currentValue;
        return ((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.tagField.hashCode()) * 31) + this.tagFieldEng.hashCode()) * 31) + this.reportException.hashCode()) * 31) + this.reportData.hashCode();
    }

    @NotNull
    public String toString() {
        return "QueryAiCrossAnalysisReq(startTimestamp=" + this.startTimestamp + ", dataType=" + this.dataType + ", currentValue=" + this.currentValue + ", tagField=" + this.tagField + ", tagFieldEng=" + this.tagFieldEng + ", reportException=" + this.reportException + ", reportData=" + this.reportData + ")";
    }
}
