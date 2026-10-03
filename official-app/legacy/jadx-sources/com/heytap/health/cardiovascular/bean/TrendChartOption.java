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
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0011J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0016J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u0011\u0010'\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\tHÆ\u0003J\u0011\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tHÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0092\u0001\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010,J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u00020\u0005HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u001e\u0010\u0016R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001c¨\u00062"}, d2 = {"Lcom/heytap/health/cardiovascular/bean/TrendChartOption;", "", "title", "", y15.PARAMS_DATA_TYPE, "", "tagFieldEng", "chartType", "tagList", "", "Lcom/heytap/health/cardiovascular/bean/SingleChartTag;", "yValueList", "", "yLevelList", "upperValue", "lowerValue", "limitLine", "(Ljava/lang/String;ILjava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getChartType", "()I", "getDataType", "getLimitLine", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLowerValue", "getTagFieldEng", "()Ljava/lang/String;", "getTagList", "()Ljava/util/List;", "getTitle", "getUpperValue", "getYLevelList", "getYValueList", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;ILjava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/heytap/health/cardiovascular/bean/TrendChartOption;", "equals", "", "other", "hashCode", "toString", "cardiovascular_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class TrendChartOption {
    public static final int $stable = 8;
    private final int chartType;
    private final int dataType;

    @Nullable
    private final Integer limitLine;

    @Nullable
    private final Integer lowerValue;

    @Nullable
    private final String tagFieldEng;

    @Nullable
    private final List<SingleChartTag> tagList;

    @NotNull
    private final String title;

    @Nullable
    private final Integer upperValue;

    @Nullable
    private final List<String> yLevelList;

    @Nullable
    private final List<Float> yValueList;

    public TrendChartOption(@NotNull String title, int i, @Nullable String str, int i2, @Nullable List<SingleChartTag> list, @Nullable List<Float> list2, @Nullable List<String> list3, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.dataType = i;
        this.tagFieldEng = str;
        this.chartType = i2;
        this.tagList = list;
        this.yValueList = list2;
        this.yLevelList = list3;
        this.upperValue = num;
        this.lowerValue = num2;
        this.limitLine = num3;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getLimitLine() {
        return this.limitLine;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getDataType() {
        return this.dataType;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTagFieldEng() {
        return this.tagFieldEng;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getChartType() {
        return this.chartType;
    }

    @Nullable
    public final List<SingleChartTag> component5() {
        return this.tagList;
    }

    @Nullable
    public final List<Float> component6() {
        return this.yValueList;
    }

    @Nullable
    public final List<String> component7() {
        return this.yLevelList;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getUpperValue() {
        return this.upperValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getLowerValue() {
        return this.lowerValue;
    }

    @NotNull
    public final TrendChartOption copy(@NotNull String title, int dataType, @Nullable String tagFieldEng, int chartType, @Nullable List<SingleChartTag> tagList, @Nullable List<Float> yValueList, @Nullable List<String> yLevelList, @Nullable Integer upperValue, @Nullable Integer lowerValue, @Nullable Integer limitLine) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new TrendChartOption(title, dataType, tagFieldEng, chartType, tagList, yValueList, yLevelList, upperValue, lowerValue, limitLine);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrendChartOption)) {
            return false;
        }
        TrendChartOption trendChartOption = (TrendChartOption) other;
        return Intrinsics.areEqual(this.title, trendChartOption.title) && this.dataType == trendChartOption.dataType && Intrinsics.areEqual(this.tagFieldEng, trendChartOption.tagFieldEng) && this.chartType == trendChartOption.chartType && Intrinsics.areEqual(this.tagList, trendChartOption.tagList) && Intrinsics.areEqual(this.yValueList, trendChartOption.yValueList) && Intrinsics.areEqual(this.yLevelList, trendChartOption.yLevelList) && Intrinsics.areEqual(this.upperValue, trendChartOption.upperValue) && Intrinsics.areEqual(this.lowerValue, trendChartOption.lowerValue) && Intrinsics.areEqual(this.limitLine, trendChartOption.limitLine);
    }

    public final int getChartType() {
        return this.chartType;
    }

    public final int getDataType() {
        return this.dataType;
    }

    @Nullable
    public final Integer getLimitLine() {
        return this.limitLine;
    }

    @Nullable
    public final Integer getLowerValue() {
        return this.lowerValue;
    }

    @Nullable
    public final String getTagFieldEng() {
        return this.tagFieldEng;
    }

    @Nullable
    public final List<SingleChartTag> getTagList() {
        return this.tagList;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final Integer getUpperValue() {
        return this.upperValue;
    }

    @Nullable
    public final List<String> getYLevelList() {
        return this.yLevelList;
    }

    @Nullable
    public final List<Float> getYValueList() {
        return this.yValueList;
    }

    public int hashCode() {
        int iHashCode = ((this.title.hashCode() * 31) + Integer.hashCode(this.dataType)) * 31;
        String str = this.tagFieldEng;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.chartType)) * 31;
        List<SingleChartTag> list = this.tagList;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<Float> list2 = this.yValueList;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.yLevelList;
        int iHashCode5 = (iHashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Integer num = this.upperValue;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.lowerValue;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.limitLine;
        return iHashCode7 + (num3 != null ? num3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TrendChartOption(title=" + this.title + ", dataType=" + this.dataType + ", tagFieldEng=" + this.tagFieldEng + ", chartType=" + this.chartType + ", tagList=" + this.tagList + ", yValueList=" + this.yValueList + ", yLevelList=" + this.yLevelList + ", upperValue=" + this.upperValue + ", lowerValue=" + this.lowerValue + ", limitLine=" + this.limitLine + ")";
    }

    public /* synthetic */ TrendChartOption(String str, int i, String str2, int i2, List list, List list2, List list3, Integer num, Integer num2, Integer num3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, i2, list, (i3 & 32) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2, (i3 & 64) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list3, num, num2, num3);
    }
}
