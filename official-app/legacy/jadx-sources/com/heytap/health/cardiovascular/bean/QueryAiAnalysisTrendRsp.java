package com.heytap.health.cardiovascular.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.oplus.aiunit.vision.y15;
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
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b¢\u0006\u0002\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bHÆ\u0003JV\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0005HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006\""}, d2 = {"Lcom/heytap/health/cardiovascular/bean/QueryAiAnalysisTrendRsp;", "", "text", "", y15.PARAMS_DATA_TYPE, "", "chartRule", "crossTag", "", "Lcom/heytap/health/cardiovascular/bean/RiskTag;", "detailData", "Lcom/heytap/health/cardiovascular/bean/AnalysisChartData;", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getChartRule", "()Ljava/lang/String;", "getCrossTag", "()Ljava/util/List;", "getDataType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDetailData", "getText", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lcom/heytap/health/cardiovascular/bean/QueryAiAnalysisTrendRsp;", "equals", "", "other", "hashCode", "toString", "cardiovascular_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class QueryAiAnalysisTrendRsp {
    public static final int $stable = 8;

    @Nullable
    private final String chartRule;

    @Nullable
    private final List<RiskTag> crossTag;

    @Nullable
    private final Integer dataType;

    @Nullable
    private final List<AnalysisChartData> detailData;

    @Nullable
    private final String text;

    public QueryAiAnalysisTrendRsp() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QueryAiAnalysisTrendRsp copy$default(QueryAiAnalysisTrendRsp queryAiAnalysisTrendRsp, String str, Integer num, String str2, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = queryAiAnalysisTrendRsp.text;
        }
        if ((i & 2) != 0) {
            num = queryAiAnalysisTrendRsp.dataType;
        }
        Integer num2 = num;
        if ((i & 4) != 0) {
            str2 = queryAiAnalysisTrendRsp.chartRule;
        }
        String str3 = str2;
        if ((i & 8) != 0) {
            list = queryAiAnalysisTrendRsp.crossTag;
        }
        List list3 = list;
        if ((i & 16) != 0) {
            list2 = queryAiAnalysisTrendRsp.detailData;
        }
        return queryAiAnalysisTrendRsp.copy(str, num2, str3, list3, list2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getDataType() {
        return this.dataType;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getChartRule() {
        return this.chartRule;
    }

    @Nullable
    public final List<RiskTag> component4() {
        return this.crossTag;
    }

    @Nullable
    public final List<AnalysisChartData> component5() {
        return this.detailData;
    }

    @NotNull
    public final QueryAiAnalysisTrendRsp copy(@Nullable String text, @Nullable Integer dataType, @Nullable String chartRule, @Nullable List<RiskTag> crossTag, @Nullable List<AnalysisChartData> detailData) {
        return new QueryAiAnalysisTrendRsp(text, dataType, chartRule, crossTag, detailData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QueryAiAnalysisTrendRsp)) {
            return false;
        }
        QueryAiAnalysisTrendRsp queryAiAnalysisTrendRsp = (QueryAiAnalysisTrendRsp) other;
        return Intrinsics.areEqual(this.text, queryAiAnalysisTrendRsp.text) && Intrinsics.areEqual(this.dataType, queryAiAnalysisTrendRsp.dataType) && Intrinsics.areEqual(this.chartRule, queryAiAnalysisTrendRsp.chartRule) && Intrinsics.areEqual(this.crossTag, queryAiAnalysisTrendRsp.crossTag) && Intrinsics.areEqual(this.detailData, queryAiAnalysisTrendRsp.detailData);
    }

    @Nullable
    public final String getChartRule() {
        return this.chartRule;
    }

    @Nullable
    public final List<RiskTag> getCrossTag() {
        return this.crossTag;
    }

    @Nullable
    public final Integer getDataType() {
        return this.dataType;
    }

    @Nullable
    public final List<AnalysisChartData> getDetailData() {
        return this.detailData;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        String str = this.text;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.dataType;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.chartRule;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<RiskTag> list = this.crossTag;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<AnalysisChartData> list2 = this.detailData;
        return iHashCode4 + (list2 != null ? list2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "QueryAiAnalysisTrendRsp(text=" + this.text + ", dataType=" + this.dataType + ", chartRule=" + this.chartRule + ", crossTag=" + this.crossTag + ", detailData=" + this.detailData + ")";
    }

    public QueryAiAnalysisTrendRsp(@Nullable String str, @Nullable Integer num, @Nullable String str2, @Nullable List<RiskTag> list, @Nullable List<AnalysisChartData> list2) {
        this.text = str;
        this.dataType = num;
        this.chartRule = str2;
        this.crossTag = list;
        this.detailData = list2;
    }

    public /* synthetic */ QueryAiAnalysisTrendRsp(String str, Integer num, String str2, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, (i & 8) == 0 ? list : null, (i & 16) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2);
    }
}
