package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.cardiovascular.bean.SceneInfo;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.d7h, reason: from toString */
/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\u000e\u0010\u0011R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000f\u001a\u0004\b\t\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/oplus/aiunit/vision/d7h;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", "d", "()I", y15.PARAMS_DATA_TYPE, "b", "Ljava/lang/String;", MapSchema.FIELD_NAME_ENTRY, "()Ljava/lang/String;", "tagName", "Lcom/heytap/health/cardiovascular/bean/SceneInfo;", "c", "Lcom/heytap/health/cardiovascular/bean/SceneInfo;", "()Lcom/heytap/health/cardiovascular/bean/SceneInfo;", "chartData", "analysisTitle", "analysisResult", "<init>", "(ILjava/lang/String;Lcom/heytap/health/cardiovascular/bean/SceneInfo;Ljava/lang/String;Ljava/lang/String;)V", "cardiovascular_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class SingleTypeData {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final int dataType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final String tagName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final SceneInfo chartData;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    public final String analysisTitle;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final String analysisResult;

    public SingleTypeData(int i, @NotNull String tagName, @Nullable SceneInfo sceneInfo, @NotNull String analysisTitle, @NotNull String analysisResult) {
        Intrinsics.checkNotNullParameter(tagName, "tagName");
        Intrinsics.checkNotNullParameter(analysisTitle, "analysisTitle");
        Intrinsics.checkNotNullParameter(analysisResult, "analysisResult");
        this.dataType = i;
        this.tagName = tagName;
        this.chartData = sceneInfo;
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
    /* JADX INFO: renamed from: c, reason: from getter */
    public final SceneInfo getChartData() {
        return this.chartData;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getDataType() {
        return this.dataType;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTagName() {
        return this.tagName;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SingleTypeData)) {
            return false;
        }
        SingleTypeData singleTypeData = (SingleTypeData) other;
        return this.dataType == singleTypeData.dataType && Intrinsics.areEqual(this.tagName, singleTypeData.tagName) && Intrinsics.areEqual(this.chartData, singleTypeData.chartData) && Intrinsics.areEqual(this.analysisTitle, singleTypeData.analysisTitle) && Intrinsics.areEqual(this.analysisResult, singleTypeData.analysisResult);
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.dataType) * 31) + this.tagName.hashCode()) * 31;
        SceneInfo sceneInfo = this.chartData;
        return ((((iHashCode + (sceneInfo == null ? 0 : sceneInfo.hashCode())) * 31) + this.analysisTitle.hashCode()) * 31) + this.analysisResult.hashCode();
    }

    @NotNull
    public String toString() {
        return "SingleTypeData(dataType=" + this.dataType + ", tagName=" + this.tagName + ", chartData=" + this.chartData + ", analysisTitle=" + this.analysisTitle + ", analysisResult=" + this.analysisResult + ")";
    }
}
