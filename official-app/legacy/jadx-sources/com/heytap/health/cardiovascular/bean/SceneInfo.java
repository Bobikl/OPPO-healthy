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
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/heytap/health/cardiovascular/bean/SceneInfo;", "", y15.PARAMS_DATA_TYPE, "", "chartRule", "", "detailData", "", "Lcom/heytap/health/cardiovascular/bean/AnalysisChartData;", "(ILjava/lang/String;Ljava/util/List;)V", "getChartRule", "()Ljava/lang/String;", "getDataType", "()I", "getDetailData", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "cardiovascular_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SceneInfo {
    public static final int $stable = 8;

    @Nullable
    private final String chartRule;
    private final int dataType;

    @Nullable
    private final List<AnalysisChartData> detailData;

    public SceneInfo(int i, @Nullable String str, @Nullable List<AnalysisChartData> list) {
        this.dataType = i;
        this.chartRule = str;
        this.detailData = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SceneInfo copy$default(SceneInfo sceneInfo, int i, String str, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = sceneInfo.dataType;
        }
        if ((i2 & 2) != 0) {
            str = sceneInfo.chartRule;
        }
        if ((i2 & 4) != 0) {
            list = sceneInfo.detailData;
        }
        return sceneInfo.copy(i, str, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getDataType() {
        return this.dataType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getChartRule() {
        return this.chartRule;
    }

    @Nullable
    public final List<AnalysisChartData> component3() {
        return this.detailData;
    }

    @NotNull
    public final SceneInfo copy(int dataType, @Nullable String chartRule, @Nullable List<AnalysisChartData> detailData) {
        return new SceneInfo(dataType, chartRule, detailData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SceneInfo)) {
            return false;
        }
        SceneInfo sceneInfo = (SceneInfo) other;
        return this.dataType == sceneInfo.dataType && Intrinsics.areEqual(this.chartRule, sceneInfo.chartRule) && Intrinsics.areEqual(this.detailData, sceneInfo.detailData);
    }

    @Nullable
    public final String getChartRule() {
        return this.chartRule;
    }

    public final int getDataType() {
        return this.dataType;
    }

    @Nullable
    public final List<AnalysisChartData> getDetailData() {
        return this.detailData;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.dataType) * 31;
        String str = this.chartRule;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<AnalysisChartData> list = this.detailData;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SceneInfo(dataType=" + this.dataType + ", chartRule=" + this.chartRule + ", detailData=" + this.detailData + ")";
    }

    public /* synthetic */ SceneInfo(int i, String str, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
