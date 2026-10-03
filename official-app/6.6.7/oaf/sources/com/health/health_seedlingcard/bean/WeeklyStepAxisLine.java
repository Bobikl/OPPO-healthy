package com.health.health_seedlingcard.bean;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J'\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, d2 = {"Lcom/health/health_seedlingcard/bean/WeeklyStepAxisLine;", "", "show", "", "lineStyle", "Lcom/health/health_seedlingcard/bean/WeeklyStepLineStyle;", "axisTick", "Lcom/health/health_seedlingcard/bean/WeeklyStepAxisTick;", "(ZLcom/health/health_seedlingcard/bean/WeeklyStepLineStyle;Lcom/health/health_seedlingcard/bean/WeeklyStepAxisTick;)V", "getAxisTick", "()Lcom/health/health_seedlingcard/bean/WeeklyStepAxisTick;", "setAxisTick", "(Lcom/health/health_seedlingcard/bean/WeeklyStepAxisTick;)V", "getLineStyle", "()Lcom/health/health_seedlingcard/bean/WeeklyStepLineStyle;", "setLineStyle", "(Lcom/health/health_seedlingcard/bean/WeeklyStepLineStyle;)V", "getShow", "()Z", "setShow", "(Z)V", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "health_seedlingcard_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class WeeklyStepAxisLine {

    @NotNull
    private WeeklyStepAxisTick axisTick;

    @NotNull
    private WeeklyStepLineStyle lineStyle;
    private boolean show;

    public WeeklyStepAxisLine(boolean z, @NotNull WeeklyStepLineStyle weeklyStepLineStyle, @NotNull WeeklyStepAxisTick weeklyStepAxisTick) {
        Intrinsics.checkNotNullParameter(weeklyStepLineStyle, "lineStyle");
        Intrinsics.checkNotNullParameter(weeklyStepAxisTick, "axisTick");
        this.show = z;
        this.lineStyle = weeklyStepLineStyle;
        this.axisTick = weeklyStepAxisTick;
    }

    public static /* synthetic */ WeeklyStepAxisLine copy$default(WeeklyStepAxisLine weeklyStepAxisLine, boolean z, WeeklyStepLineStyle weeklyStepLineStyle, WeeklyStepAxisTick weeklyStepAxisTick, int i, Object obj) {
        if ((i & 1) != 0) {
            z = weeklyStepAxisLine.show;
        }
        if ((i & 2) != 0) {
            weeklyStepLineStyle = weeklyStepAxisLine.lineStyle;
        }
        if ((i & 4) != 0) {
            weeklyStepAxisTick = weeklyStepAxisLine.axisTick;
        }
        return weeklyStepAxisLine.copy(z, weeklyStepLineStyle, weeklyStepAxisTick);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getShow() {
        return this.show;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final WeeklyStepLineStyle getLineStyle() {
        return this.lineStyle;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final WeeklyStepAxisTick getAxisTick() {
        return this.axisTick;
    }

    @NotNull
    public final WeeklyStepAxisLine copy(boolean show, @NotNull WeeklyStepLineStyle lineStyle, @NotNull WeeklyStepAxisTick axisTick) {
        Intrinsics.checkNotNullParameter(lineStyle, "lineStyle");
        Intrinsics.checkNotNullParameter(axisTick, "axisTick");
        return new WeeklyStepAxisLine(show, lineStyle, axisTick);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WeeklyStepAxisLine)) {
            return false;
        }
        WeeklyStepAxisLine weeklyStepAxisLine = (WeeklyStepAxisLine) other;
        return this.show == weeklyStepAxisLine.show && Intrinsics.areEqual(this.lineStyle, weeklyStepAxisLine.lineStyle) && Intrinsics.areEqual(this.axisTick, weeklyStepAxisLine.axisTick);
    }

    @NotNull
    public final WeeklyStepAxisTick getAxisTick() {
        return this.axisTick;
    }

    @NotNull
    public final WeeklyStepLineStyle getLineStyle() {
        return this.lineStyle;
    }

    public final boolean getShow() {
        return this.show;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z = this.show;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (((r0 * 31) + this.lineStyle.hashCode()) * 31) + this.axisTick.hashCode();
    }

    public final void setAxisTick(@NotNull WeeklyStepAxisTick weeklyStepAxisTick) {
        Intrinsics.checkNotNullParameter(weeklyStepAxisTick, "<set-?>");
        this.axisTick = weeklyStepAxisTick;
    }

    public final void setLineStyle(@NotNull WeeklyStepLineStyle weeklyStepLineStyle) {
        Intrinsics.checkNotNullParameter(weeklyStepLineStyle, "<set-?>");
        this.lineStyle = weeklyStepLineStyle;
    }

    public final void setShow(boolean z) {
        this.show = z;
    }

    @NotNull
    public String toString() {
        return "WeeklyStepAxisLine(show=" + this.show + ", lineStyle=" + this.lineStyle + ", axisTick=" + this.axisTick + ")";
    }

    public /* synthetic */ WeeklyStepAxisLine(boolean z, WeeklyStepLineStyle weeklyStepLineStyle, WeeklyStepAxisTick weeklyStepAxisTick, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, weeklyStepLineStyle, weeklyStepAxisTick);
    }
}
