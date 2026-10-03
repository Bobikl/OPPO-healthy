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
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J/\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/heytap/health/cardiovascular/bean/TagInfo;", "", "tagFieldEng", "", "chartRule", "detailData", "", "Lcom/heytap/health/cardiovascular/bean/AnalysisChartData;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getChartRule", "()Ljava/lang/String;", "getDetailData", "()Ljava/util/List;", "getTagFieldEng", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "cardiovascular_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class TagInfo {
    public static final int $stable = 8;

    @NotNull
    private final String chartRule;

    @Nullable
    private final List<AnalysisChartData> detailData;

    @NotNull
    private final String tagFieldEng;

    public TagInfo() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TagInfo copy$default(TagInfo tagInfo, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tagInfo.tagFieldEng;
        }
        if ((i & 2) != 0) {
            str2 = tagInfo.chartRule;
        }
        if ((i & 4) != 0) {
            list = tagInfo.detailData;
        }
        return tagInfo.copy(str, str2, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTagFieldEng() {
        return this.tagFieldEng;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getChartRule() {
        return this.chartRule;
    }

    @Nullable
    public final List<AnalysisChartData> component3() {
        return this.detailData;
    }

    @NotNull
    public final TagInfo copy(@NotNull String tagFieldEng, @NotNull String chartRule, @Nullable List<AnalysisChartData> detailData) {
        Intrinsics.checkNotNullParameter(tagFieldEng, "tagFieldEng");
        Intrinsics.checkNotNullParameter(chartRule, "chartRule");
        return new TagInfo(tagFieldEng, chartRule, detailData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TagInfo)) {
            return false;
        }
        TagInfo tagInfo = (TagInfo) other;
        return Intrinsics.areEqual(this.tagFieldEng, tagInfo.tagFieldEng) && Intrinsics.areEqual(this.chartRule, tagInfo.chartRule) && Intrinsics.areEqual(this.detailData, tagInfo.detailData);
    }

    @NotNull
    public final String getChartRule() {
        return this.chartRule;
    }

    @Nullable
    public final List<AnalysisChartData> getDetailData() {
        return this.detailData;
    }

    @NotNull
    public final String getTagFieldEng() {
        return this.tagFieldEng;
    }

    public int hashCode() {
        int iHashCode = ((this.tagFieldEng.hashCode() * 31) + this.chartRule.hashCode()) * 31;
        List<AnalysisChartData> list = this.detailData;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        return "TagInfo(tagFieldEng=" + this.tagFieldEng + ", chartRule=" + this.chartRule + ", detailData=" + this.detailData + ")";
    }

    public TagInfo(@NotNull String tagFieldEng, @NotNull String chartRule, @Nullable List<AnalysisChartData> list) {
        Intrinsics.checkNotNullParameter(tagFieldEng, "tagFieldEng");
        Intrinsics.checkNotNullParameter(chartRule, "chartRule");
        this.tagFieldEng = tagFieldEng;
        this.chartRule = chartRule;
        this.detailData = list;
    }

    public /* synthetic */ TagInfo(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
