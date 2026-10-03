package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.FrameMetricsAggregator;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.a20, reason: from toString */
/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0014\u0012\b\b\u0002\u0010\"\u001a\u00020\u0004\u0012\b\b\u0002\u0010$\u001a\u00020\u0004\u0012\b\b\u0002\u0010&\u001a\u00020\u0004\u0012\b\b\u0002\u0010(\u001a\u00020\u0004\u0012\b\b\u0002\u0010*\u001a\u00020\u0004¢\u0006\u0004\b+\u0010,J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0013\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001f\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR\"\u0010\"\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\n\u001a\u0004\b\u0015\u0010\f\"\u0004\b!\u0010\u000eR\"\u0010$\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\n\u001a\u0004\b\t\u0010\f\"\u0004\b#\u0010\u000eR\"\u0010&\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\n\u001a\u0004\b \u0010\f\"\u0004\b%\u0010\u000eR\"\u0010(\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0010\u0010\f\"\u0004\b'\u0010\u000eR\"\u0010*\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\n\u001a\u0004\b\u001c\u0010\f\"\u0004\b)\u0010\u000e¨\u0006-"}, d2 = {"Lcom/oplus/aiunit/vision/a20;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", "i", "()I", "r", "(I)V", "workDayAvg", "b", c7n.g, "q", "weekendAvg", "Lcom/oplus/aiunit/vision/o1j;", "c", "Lcom/oplus/aiunit/vision/o1j;", "f", "()Lcom/oplus/aiunit/vision/o1j;", "o", "(Lcom/oplus/aiunit/vision/o1j;)V", "mostRelax", "d", c7n.f, LogFieldKey.PROCESS_NAME_KEY, "mostStress", MapSchema.FIELD_NAME_ENTRY, LogFieldKey.LEVEL_KEY, "currentStressAvg", "j", "currentAvgIncrease", "n", "lastStressAvg", MapSchema.FIELD_NAME_KEY, "currentNotice", LogFieldKey.MESSAGE_KEY, "lastNotice", "<init>", "(IILcom/oplus/aiunit/vision/o1j;Lcom/oplus/aiunit/vision/o1j;IIIII)V", "hrv_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class AnalyzeData {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public int workDayAvg;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public int weekendAvg;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public StressDetailData mostRelax;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    public StressDetailData mostStress;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public int currentStressAvg;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    public int currentAvgIncrease;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    public int lastStressAvg;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    public int currentNotice;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    public int lastNotice;

    public AnalyzeData() {
        this(0, 0, null, null, 0, 0, 0, 0, 0, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getCurrentAvgIncrease() {
        return this.currentAvgIncrease;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getCurrentNotice() {
        return this.currentNotice;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getCurrentStressAvg() {
        return this.currentStressAvg;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getLastNotice() {
        return this.lastNotice;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getLastStressAvg() {
        return this.lastStressAvg;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnalyzeData)) {
            return false;
        }
        AnalyzeData analyzeData = (AnalyzeData) other;
        return this.workDayAvg == analyzeData.workDayAvg && this.weekendAvg == analyzeData.weekendAvg && Intrinsics.areEqual(this.mostRelax, analyzeData.mostRelax) && Intrinsics.areEqual(this.mostStress, analyzeData.mostStress) && this.currentStressAvg == analyzeData.currentStressAvg && this.currentAvgIncrease == analyzeData.currentAvgIncrease && this.lastStressAvg == analyzeData.lastStressAvg && this.currentNotice == analyzeData.currentNotice && this.lastNotice == analyzeData.lastNotice;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final StressDetailData getMostRelax() {
        return this.mostRelax;
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final StressDetailData getMostStress() {
        return this.mostStress;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getWeekendAvg() {
        return this.weekendAvg;
    }

    public int hashCode() {
        return (((((((((((((((Integer.hashCode(this.workDayAvg) * 31) + Integer.hashCode(this.weekendAvg)) * 31) + this.mostRelax.hashCode()) * 31) + this.mostStress.hashCode()) * 31) + Integer.hashCode(this.currentStressAvg)) * 31) + Integer.hashCode(this.currentAvgIncrease)) * 31) + Integer.hashCode(this.lastStressAvg)) * 31) + Integer.hashCode(this.currentNotice)) * 31) + Integer.hashCode(this.lastNotice);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getWorkDayAvg() {
        return this.workDayAvg;
    }

    public final void j(int i) {
        this.currentAvgIncrease = i;
    }

    public final void k(int i) {
        this.currentNotice = i;
    }

    public final void l(int i) {
        this.currentStressAvg = i;
    }

    public final void m(int i) {
        this.lastNotice = i;
    }

    public final void n(int i) {
        this.lastStressAvg = i;
    }

    public final void o(@NotNull StressDetailData stressDetailData) {
        Intrinsics.checkNotNullParameter(stressDetailData, "<set-?>");
        this.mostRelax = stressDetailData;
    }

    public final void p(@NotNull StressDetailData stressDetailData) {
        Intrinsics.checkNotNullParameter(stressDetailData, "<set-?>");
        this.mostStress = stressDetailData;
    }

    public final void q(int i) {
        this.weekendAvg = i;
    }

    public final void r(int i) {
        this.workDayAvg = i;
    }

    @NotNull
    public String toString() {
        return "AnalyzeData(workDayAvg=" + this.workDayAvg + ", weekendAvg=" + this.weekendAvg + ", mostRelax=" + this.mostRelax + ", mostStress=" + this.mostStress + ", currentStressAvg=" + this.currentStressAvg + ", currentAvgIncrease=" + this.currentAvgIncrease + ", lastStressAvg=" + this.lastStressAvg + ", currentNotice=" + this.currentNotice + ", lastNotice=" + this.lastNotice + ")";
    }

    public AnalyzeData(int i, int i2, @NotNull StressDetailData mostRelax, @NotNull StressDetailData mostStress, int i3, int i4, int i5, int i6, int i7) {
        Intrinsics.checkNotNullParameter(mostRelax, "mostRelax");
        Intrinsics.checkNotNullParameter(mostStress, "mostStress");
        this.workDayAvg = i;
        this.weekendAvg = i2;
        this.mostRelax = mostRelax;
        this.mostStress = mostStress;
        this.currentStressAvg = i3;
        this.currentAvgIncrease = i4;
        this.lastStressAvg = i5;
        this.currentNotice = i6;
        this.lastNotice = i7;
    }

    public /* synthetic */ AnalyzeData(int i, int i2, StressDetailData stressDetailData, StressDetailData stressDetailData2, int i3, int i4, int i5, int i6, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? 0 : i, (i8 & 2) != 0 ? 0 : i2, (i8 & 4) != 0 ? new StressDetailData(0L, 0, 3, null) : stressDetailData, (i8 & 8) != 0 ? new StressDetailData(0L, 0, 3, null) : stressDetailData2, (i8 & 16) != 0 ? 0 : i3, (i8 & 32) != 0 ? Integer.MIN_VALUE : i4, (i8 & 64) != 0 ? 0 : i5, (i8 & 128) != 0 ? 0 : i6, (i8 & 256) == 0 ? i7 : 0);
    }
}