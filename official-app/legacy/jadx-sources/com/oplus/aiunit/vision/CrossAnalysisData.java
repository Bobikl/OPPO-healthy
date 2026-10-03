package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.cardiovascular.bean.SceneInfo;
import com.heytap.health.cardiovascular.bean.TagInfo;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.le4, reason: from toString */
/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0013\u0012\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0019\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u0012\u0006\u0010!\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010#J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R%\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b\u0014\u0010\u001dR\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u000e\u0010\u0011R\u0017\u0010!\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u000f\u001a\u0004\b\t\u0010\u0011¨\u0006$"}, d2 = {"Lcom/oplus/aiunit/vision/le4;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", "getMainDataType", "()I", "mainDataType", "b", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "mainTagName", "Lcom/oplus/aiunit/vision/fnj;", "c", "Lcom/oplus/aiunit/vision/fnj;", MapSchema.FIELD_NAME_ENTRY, "()Lcom/oplus/aiunit/vision/fnj;", "subTag", "Lkotlin/Pair;", "Lcom/heytap/health/cardiovascular/bean/SceneInfo;", "Lcom/heytap/health/cardiovascular/bean/TagInfo;", "Lkotlin/Pair;", "()Lkotlin/Pair;", "chartData", "analysisTitle", "f", "analysisResult", "<init>", "(ILjava/lang/String;Lcom/oplus/aiunit/vision/fnj;Lkotlin/Pair;Ljava/lang/String;Ljava/lang/String;)V", "cardiovascular_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class CrossAnalysisData {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final int mainDataType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final String mainTagName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final TagSelectItemData subTag;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    public final Pair<SceneInfo, TagInfo> chartData;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final String analysisTitle;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @NotNull
    public final String analysisResult;

    public CrossAnalysisData(int i, @NotNull String mainTagName, @NotNull TagSelectItemData subTag, @Nullable Pair<SceneInfo, TagInfo> pair, @NotNull String analysisTitle, @NotNull String analysisResult) {
        Intrinsics.checkNotNullParameter(mainTagName, "mainTagName");
        Intrinsics.checkNotNullParameter(subTag, "subTag");
        Intrinsics.checkNotNullParameter(analysisTitle, "analysisTitle");
        Intrinsics.checkNotNullParameter(analysisResult, "analysisResult");
        this.mainDataType = i;
        this.mainTagName = mainTagName;
        this.subTag = subTag;
        this.chartData = pair;
        this.analysisTitle = analysisTitle;
        this.analysisResult = analysisResult;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAnalysisResult() {
        return this.analysisResult;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAnalysisTitle() {
        return this.analysisTitle;
    }

    @Nullable
    public final Pair<SceneInfo, TagInfo> c() {
        return this.chartData;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getMainTagName() {
        return this.mainTagName;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final TagSelectItemData getSubTag() {
        return this.subTag;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CrossAnalysisData)) {
            return false;
        }
        CrossAnalysisData crossAnalysisData = (CrossAnalysisData) other;
        return this.mainDataType == crossAnalysisData.mainDataType && Intrinsics.areEqual(this.mainTagName, crossAnalysisData.mainTagName) && Intrinsics.areEqual(this.subTag, crossAnalysisData.subTag) && Intrinsics.areEqual(this.chartData, crossAnalysisData.chartData) && Intrinsics.areEqual(this.analysisTitle, crossAnalysisData.analysisTitle) && Intrinsics.areEqual(this.analysisResult, crossAnalysisData.analysisResult);
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.mainDataType) * 31) + this.mainTagName.hashCode()) * 31) + this.subTag.hashCode()) * 31;
        Pair<SceneInfo, TagInfo> pair = this.chartData;
        return ((((iHashCode + (pair == null ? 0 : pair.hashCode())) * 31) + this.analysisTitle.hashCode()) * 31) + this.analysisResult.hashCode();
    }

    @NotNull
    public String toString() {
        return "CrossAnalysisData(mainDataType=" + this.mainDataType + ", mainTagName=" + this.mainTagName + ", subTag=" + this.subTag + ", chartData=" + this.chartData + ", analysisTitle=" + this.analysisTitle + ", analysisResult=" + this.analysisResult + ")";
    }
}
