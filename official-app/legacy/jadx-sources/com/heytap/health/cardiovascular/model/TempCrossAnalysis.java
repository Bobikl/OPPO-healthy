package com.heytap.health.cardiovascular.model;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/heytap/health/cardiovascular/model/TempCrossAnalysis;", "", "state", "", "analysisResult", "Lcom/heytap/health/cardiovascular/model/MultipleSignsAnalysis;", "(Ljava/lang/Integer;Lcom/heytap/health/cardiovascular/model/MultipleSignsAnalysis;)V", "getAnalysisResult", "()Lcom/heytap/health/cardiovascular/model/MultipleSignsAnalysis;", "getState", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/lang/Integer;Lcom/heytap/health/cardiovascular/model/MultipleSignsAnalysis;)Lcom/heytap/health/cardiovascular/model/TempCrossAnalysis;", "equals", "", "other", "hashCode", "toString", "", "cardiovascular_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class TempCrossAnalysis {
    public static final int $stable = 8;

    @Nullable
    private final MultipleSignsAnalysis analysisResult;

    @Nullable
    private final Integer state;

    /* JADX WARN: Multi-variable type inference failed */
    public TempCrossAnalysis() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ TempCrossAnalysis copy$default(TempCrossAnalysis tempCrossAnalysis, Integer num, MultipleSignsAnalysis multipleSignsAnalysis, int i, Object obj) {
        if ((i & 1) != 0) {
            num = tempCrossAnalysis.state;
        }
        if ((i & 2) != 0) {
            multipleSignsAnalysis = tempCrossAnalysis.analysisResult;
        }
        return tempCrossAnalysis.copy(num, multipleSignsAnalysis);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getState() {
        return this.state;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final MultipleSignsAnalysis getAnalysisResult() {
        return this.analysisResult;
    }

    @NotNull
    public final TempCrossAnalysis copy(@Nullable Integer state, @Nullable MultipleSignsAnalysis analysisResult) {
        return new TempCrossAnalysis(state, analysisResult);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TempCrossAnalysis)) {
            return false;
        }
        TempCrossAnalysis tempCrossAnalysis = (TempCrossAnalysis) other;
        return Intrinsics.areEqual(this.state, tempCrossAnalysis.state) && Intrinsics.areEqual(this.analysisResult, tempCrossAnalysis.analysisResult);
    }

    @Nullable
    public final MultipleSignsAnalysis getAnalysisResult() {
        return this.analysisResult;
    }

    @Nullable
    public final Integer getState() {
        return this.state;
    }

    public int hashCode() {
        Integer num = this.state;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        MultipleSignsAnalysis multipleSignsAnalysis = this.analysisResult;
        return iHashCode + (multipleSignsAnalysis != null ? multipleSignsAnalysis.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TempCrossAnalysis(state=" + this.state + ", analysisResult=" + this.analysisResult + ")";
    }

    public TempCrossAnalysis(@Nullable Integer num, @Nullable MultipleSignsAnalysis multipleSignsAnalysis) {
        this.state = num;
        this.analysisResult = multipleSignsAnalysis;
    }

    public /* synthetic */ TempCrossAnalysis(Integer num, MultipleSignsAnalysis multipleSignsAnalysis, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : multipleSignsAnalysis);
    }
}
