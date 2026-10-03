package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.sunshine.constant.VitaminLevel;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.p10, reason: from toString */
/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0004\u0012\b\b\u0002\u0010%\u001a\u00020 \u0012\b\b\u0002\u0010'\u001a\u00020\u0004¢\u0006\u0004\b(\u0010)J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000e\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0019\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\n\u001a\u0004\b\u0017\u0010\u000b\"\u0004\b\u0018\u0010\rR\"\u0010\u001c\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u001a\u0010\u0012\"\u0004\b\u001b\u0010\u0014R\"\u0010\u001f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\n\u001a\u0004\b\u001d\u0010\u000b\"\u0004\b\u001e\u0010\rR\"\u0010%\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010!\u001a\u0004\b\u000f\u0010\"\"\u0004\b#\u0010$R\"\u0010'\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\n\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b&\u0010\r¨\u0006*"}, d2 = {"Lcom/oplus/aiunit/vision/p10;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", "()I", b2n.g, "(I)V", "avgDuration", "b", "Ljava/lang/String;", "f", "()Ljava/lang/String;", LogFieldKey.MESSAGE_KEY, "(Ljava/lang/String;)V", "reachGoalCount", "c", "d", MapSchema.FIELD_NAME_KEY, "compareWithLast", MapSchema.FIELD_NAME_ENTRY, LogFieldKey.LEVEL_KEY, "mostLike", b2n.f, "n", "type", "Lcom/heytap/health/sunshine/constant/VitaminLevel;", "Lcom/heytap/health/sunshine/constant/VitaminLevel;", "()Lcom/heytap/health/sunshine/constant/VitaminLevel;", "i", "(Lcom/heytap/health/sunshine/constant/VitaminLevel;)V", "avgVitaminD", "j", "bestMonth", "<init>", "(ILjava/lang/String;ILjava/lang/String;ILcom/heytap/health/sunshine/constant/VitaminLevel;I)V", "sunshine_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class AnalyzeData {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public int avgDuration;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public String reachGoalCount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public int compareWithLast;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    public String mostLike;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public int type;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @NotNull
    public VitaminLevel avgVitaminD;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    public int bestMonth;

    public AnalyzeData() {
        this(0, null, 0, null, 0, null, 0, 127, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getAvgDuration() {
        return this.avgDuration;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final VitaminLevel getAvgVitaminD() {
        return this.avgVitaminD;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getBestMonth() {
        return this.bestMonth;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getCompareWithLast() {
        return this.compareWithLast;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getMostLike() {
        return this.mostLike;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnalyzeData)) {
            return false;
        }
        AnalyzeData analyzeData = (AnalyzeData) other;
        return this.avgDuration == analyzeData.avgDuration && Intrinsics.areEqual(this.reachGoalCount, analyzeData.reachGoalCount) && this.compareWithLast == analyzeData.compareWithLast && Intrinsics.areEqual(this.mostLike, analyzeData.mostLike) && this.type == analyzeData.type && this.avgVitaminD == analyzeData.avgVitaminD && this.bestMonth == analyzeData.bestMonth;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getReachGoalCount() {
        return this.reachGoalCount;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getType() {
        return this.type;
    }

    public final void h(int i) {
        this.avgDuration = i;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.avgDuration) * 31) + this.reachGoalCount.hashCode()) * 31) + Integer.hashCode(this.compareWithLast)) * 31) + this.mostLike.hashCode()) * 31) + Integer.hashCode(this.type)) * 31) + this.avgVitaminD.hashCode()) * 31) + Integer.hashCode(this.bestMonth);
    }

    public final void i(@NotNull VitaminLevel vitaminLevel) {
        Intrinsics.checkNotNullParameter(vitaminLevel, "<set-?>");
        this.avgVitaminD = vitaminLevel;
    }

    public final void j(int i) {
        this.bestMonth = i;
    }

    public final void k(int i) {
        this.compareWithLast = i;
    }

    public final void l(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mostLike = str;
    }

    public final void m(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.reachGoalCount = str;
    }

    public final void n(int i) {
        this.type = i;
    }

    @NotNull
    public String toString() {
        return "AnalyzeData(avgDuration=" + this.avgDuration + ", reachGoalCount=" + this.reachGoalCount + ", compareWithLast=" + this.compareWithLast + ", mostLike=" + this.mostLike + ", type=" + this.type + ", avgVitaminD=" + this.avgVitaminD + ", bestMonth=" + this.bestMonth + ")";
    }

    public AnalyzeData(int i, @NotNull String reachGoalCount, int i2, @NotNull String mostLike, int i3, @NotNull VitaminLevel avgVitaminD, int i4) {
        Intrinsics.checkNotNullParameter(reachGoalCount, "reachGoalCount");
        Intrinsics.checkNotNullParameter(mostLike, "mostLike");
        Intrinsics.checkNotNullParameter(avgVitaminD, "avgVitaminD");
        this.avgDuration = i;
        this.reachGoalCount = reachGoalCount;
        this.compareWithLast = i2;
        this.mostLike = mostLike;
        this.type = i3;
        this.avgVitaminD = avgVitaminD;
        this.bestMonth = i4;
    }

    public /* synthetic */ AnalyzeData(int i, String str, int i2, String str2, int i3, VitaminLevel vitaminLevel, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? Integer.MIN_VALUE : i, (i5 & 2) != 0 ? "--" : str, (i5 & 4) != 0 ? Integer.MIN_VALUE : i2, (i5 & 8) != 0 ? "--" : str2, (i5 & 16) != 0 ? 0 : i3, (i5 & 32) != 0 ? VitaminLevel.NONE : vitaminLevel, (i5 & 64) != 0 ? Integer.MIN_VALUE : i4);
    }
}
