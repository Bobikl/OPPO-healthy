package com.oplus.aiunit.vision;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.cardiovascular.bean.QueryAiAnalysisTextRsp;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.dr, reason: from toString */
/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\t\u0012\u000e\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\t\u0012\u000e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\t\u0012\u000e\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\t\u0012\u0012\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\t\u0012\u0012\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\t¢\u0006\u0004\b#\u0010$J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\rR\u001f\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\t8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\n\u0010\rR\u001f\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\t8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u000b\u001a\u0004\b\u0018\u0010\rR\u001f\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\t8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u000b\u001a\u0004\b\u000f\u0010\rR#\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0012\u0010\rR.\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u001b\u0010\r\"\u0004\b \u0010!¨\u0006%"}, d2 = {"Lcom/oplus/aiunit/vision/dr;", "", "", "toString", "", "hashCode", "other", "", "equals", "Landroidx/compose/runtime/MutableState;", "a", "Landroidx/compose/runtime/MutableState;", b2n.g, "()Landroidx/compose/runtime/MutableState;", "isShowAnalysisTextDone", "b", b2n.f, "isLoadingChartData", "c", "d", "selectTagIndex", "Lcom/heytap/health/cardiovascular/bean/QueryAiAnalysisTextRsp;", "aiResultText", "Lcom/oplus/aiunit/vision/d7h;", MapSchema.FIELD_NAME_ENTRY, "singleTypeData", "Lcom/oplus/aiunit/vision/le4;", "f", "crossAnalysisData", "", "Lcom/oplus/aiunit/vision/fnj;", "mainTagList", "setSubTagList", "(Landroidx/compose/runtime/MutableState;)V", "subTagList", "<init>", "(Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V", "cardiovascular_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class AiAnalysisCardData {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final MutableState<Boolean> isShowAnalysisTextDone;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final MutableState<Boolean> isLoadingChartData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final MutableState<Integer> selectTagIndex;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    public final MutableState<QueryAiAnalysisTextRsp> aiResultText;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final MutableState<SingleTypeData> singleTypeData;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @NotNull
    public final MutableState<CrossAnalysisData> crossAnalysisData;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @NotNull
    public final MutableState<List<TagSelectItemData>> mainTagList;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @NotNull
    public MutableState<List<TagSelectItemData>> subTagList;

    public AiAnalysisCardData(@NotNull MutableState<Boolean> isShowAnalysisTextDone, @NotNull MutableState<Boolean> isLoadingChartData, @NotNull MutableState<Integer> selectTagIndex, @NotNull MutableState<QueryAiAnalysisTextRsp> aiResultText, @NotNull MutableState<SingleTypeData> singleTypeData, @NotNull MutableState<CrossAnalysisData> crossAnalysisData, @NotNull MutableState<List<TagSelectItemData>> mainTagList, @NotNull MutableState<List<TagSelectItemData>> subTagList) {
        Intrinsics.checkNotNullParameter(isShowAnalysisTextDone, "isShowAnalysisTextDone");
        Intrinsics.checkNotNullParameter(isLoadingChartData, "isLoadingChartData");
        Intrinsics.checkNotNullParameter(selectTagIndex, "selectTagIndex");
        Intrinsics.checkNotNullParameter(aiResultText, "aiResultText");
        Intrinsics.checkNotNullParameter(singleTypeData, "singleTypeData");
        Intrinsics.checkNotNullParameter(crossAnalysisData, "crossAnalysisData");
        Intrinsics.checkNotNullParameter(mainTagList, "mainTagList");
        Intrinsics.checkNotNullParameter(subTagList, "subTagList");
        this.isShowAnalysisTextDone = isShowAnalysisTextDone;
        this.isLoadingChartData = isLoadingChartData;
        this.selectTagIndex = selectTagIndex;
        this.aiResultText = aiResultText;
        this.singleTypeData = singleTypeData;
        this.crossAnalysisData = crossAnalysisData;
        this.mainTagList = mainTagList;
        this.subTagList = subTagList;
    }

    @NotNull
    public final MutableState<QueryAiAnalysisTextRsp> a() {
        return this.aiResultText;
    }

    @NotNull
    public final MutableState<CrossAnalysisData> b() {
        return this.crossAnalysisData;
    }

    @NotNull
    public final MutableState<List<TagSelectItemData>> c() {
        return this.mainTagList;
    }

    @NotNull
    public final MutableState<Integer> d() {
        return this.selectTagIndex;
    }

    @NotNull
    public final MutableState<SingleTypeData> e() {
        return this.singleTypeData;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AiAnalysisCardData)) {
            return false;
        }
        AiAnalysisCardData aiAnalysisCardData = (AiAnalysisCardData) other;
        return Intrinsics.areEqual(this.isShowAnalysisTextDone, aiAnalysisCardData.isShowAnalysisTextDone) && Intrinsics.areEqual(this.isLoadingChartData, aiAnalysisCardData.isLoadingChartData) && Intrinsics.areEqual(this.selectTagIndex, aiAnalysisCardData.selectTagIndex) && Intrinsics.areEqual(this.aiResultText, aiAnalysisCardData.aiResultText) && Intrinsics.areEqual(this.singleTypeData, aiAnalysisCardData.singleTypeData) && Intrinsics.areEqual(this.crossAnalysisData, aiAnalysisCardData.crossAnalysisData) && Intrinsics.areEqual(this.mainTagList, aiAnalysisCardData.mainTagList) && Intrinsics.areEqual(this.subTagList, aiAnalysisCardData.subTagList);
    }

    @NotNull
    public final MutableState<List<TagSelectItemData>> f() {
        return this.subTagList;
    }

    @NotNull
    public final MutableState<Boolean> g() {
        return this.isLoadingChartData;
    }

    @NotNull
    public final MutableState<Boolean> h() {
        return this.isShowAnalysisTextDone;
    }

    public int hashCode() {
        return (((((((((((((this.isShowAnalysisTextDone.hashCode() * 31) + this.isLoadingChartData.hashCode()) * 31) + this.selectTagIndex.hashCode()) * 31) + this.aiResultText.hashCode()) * 31) + this.singleTypeData.hashCode()) * 31) + this.crossAnalysisData.hashCode()) * 31) + this.mainTagList.hashCode()) * 31) + this.subTagList.hashCode();
    }

    @NotNull
    public String toString() {
        return "AiAnalysisCardData(isShowAnalysisTextDone=" + this.isShowAnalysisTextDone + ", isLoadingChartData=" + this.isLoadingChartData + ", selectTagIndex=" + this.selectTagIndex + ", aiResultText=" + this.aiResultText + ", singleTypeData=" + this.singleTypeData + ", crossAnalysisData=" + this.crossAnalysisData + ", mainTagList=" + this.mainTagList + ", subTagList=" + this.subTagList + ")";
    }
}
