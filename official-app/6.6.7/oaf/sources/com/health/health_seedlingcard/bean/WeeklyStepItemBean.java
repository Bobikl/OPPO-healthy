package com.health.health_seedlingcard.bean;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J;\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0007HÖ\u0001R\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000e¨\u0006'"}, d2 = {"Lcom/health/health_seedlingcard/bean/WeeklyStepItemBean;", "", "stepBarInfo", "Lcom/health/health_seedlingcard/bean/WeeklyStepBarInfo;", "stepBarOpt", "Lcom/health/health_seedlingcard/bean/StepBarOpt;", "stepBarInfotitle", "", "stepBarInfotips", "stepBarDarkOpt", "(Lcom/health/health_seedlingcard/bean/WeeklyStepBarInfo;Lcom/health/health_seedlingcard/bean/StepBarOpt;Ljava/lang/String;Ljava/lang/String;Lcom/health/health_seedlingcard/bean/StepBarOpt;)V", "getStepBarDarkOpt", "()Lcom/health/health_seedlingcard/bean/StepBarOpt;", "setStepBarDarkOpt", "(Lcom/health/health_seedlingcard/bean/StepBarOpt;)V", "getStepBarInfo", "()Lcom/health/health_seedlingcard/bean/WeeklyStepBarInfo;", "setStepBarInfo", "(Lcom/health/health_seedlingcard/bean/WeeklyStepBarInfo;)V", "getStepBarInfotips", "()Ljava/lang/String;", "setStepBarInfotips", "(Ljava/lang/String;)V", "getStepBarInfotitle", "setStepBarInfotitle", "getStepBarOpt", "setStepBarOpt", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "health_seedlingcard_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class WeeklyStepItemBean {

    @NotNull
    private StepBarOpt stepBarDarkOpt;

    @NotNull
    private WeeklyStepBarInfo stepBarInfo;

    @NotNull
    private String stepBarInfotips;

    @NotNull
    private String stepBarInfotitle;

    @NotNull
    private StepBarOpt stepBarOpt;

    public WeeklyStepItemBean(@NotNull WeeklyStepBarInfo weeklyStepBarInfo, @NotNull StepBarOpt stepBarOpt, @NotNull String str, @NotNull String str2, @NotNull StepBarOpt stepBarOpt2) {
        Intrinsics.checkNotNullParameter(weeklyStepBarInfo, "stepBarInfo");
        Intrinsics.checkNotNullParameter(stepBarOpt, "stepBarOpt");
        Intrinsics.checkNotNullParameter(str, "stepBarInfotitle");
        Intrinsics.checkNotNullParameter(str2, "stepBarInfotips");
        Intrinsics.checkNotNullParameter(stepBarOpt2, "stepBarDarkOpt");
        this.stepBarInfo = weeklyStepBarInfo;
        this.stepBarOpt = stepBarOpt;
        this.stepBarInfotitle = str;
        this.stepBarInfotips = str2;
        this.stepBarDarkOpt = stepBarOpt2;
    }

    public static /* synthetic */ WeeklyStepItemBean copy$default(WeeklyStepItemBean weeklyStepItemBean, WeeklyStepBarInfo weeklyStepBarInfo, StepBarOpt stepBarOpt, String str, String str2, StepBarOpt stepBarOpt2, int i, Object obj) {
        if ((i & 1) != 0) {
            weeklyStepBarInfo = weeklyStepItemBean.stepBarInfo;
        }
        if ((i & 2) != 0) {
            stepBarOpt = weeklyStepItemBean.stepBarOpt;
        }
        StepBarOpt stepBarOpt3 = stepBarOpt;
        if ((i & 4) != 0) {
            str = weeklyStepItemBean.stepBarInfotitle;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            str2 = weeklyStepItemBean.stepBarInfotips;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            stepBarOpt2 = weeklyStepItemBean.stepBarDarkOpt;
        }
        return weeklyStepItemBean.copy(weeklyStepBarInfo, stepBarOpt3, str3, str4, stepBarOpt2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final WeeklyStepBarInfo getStepBarInfo() {
        return this.stepBarInfo;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final StepBarOpt getStepBarOpt() {
        return this.stepBarOpt;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStepBarInfotitle() {
        return this.stepBarInfotitle;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStepBarInfotips() {
        return this.stepBarInfotips;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final StepBarOpt getStepBarDarkOpt() {
        return this.stepBarDarkOpt;
    }

    @NotNull
    public final WeeklyStepItemBean copy(@NotNull WeeklyStepBarInfo stepBarInfo, @NotNull StepBarOpt stepBarOpt, @NotNull String stepBarInfotitle, @NotNull String stepBarInfotips, @NotNull StepBarOpt stepBarDarkOpt) {
        Intrinsics.checkNotNullParameter(stepBarInfo, "stepBarInfo");
        Intrinsics.checkNotNullParameter(stepBarOpt, "stepBarOpt");
        Intrinsics.checkNotNullParameter(stepBarInfotitle, "stepBarInfotitle");
        Intrinsics.checkNotNullParameter(stepBarInfotips, "stepBarInfotips");
        Intrinsics.checkNotNullParameter(stepBarDarkOpt, "stepBarDarkOpt");
        return new WeeklyStepItemBean(stepBarInfo, stepBarOpt, stepBarInfotitle, stepBarInfotips, stepBarDarkOpt);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WeeklyStepItemBean)) {
            return false;
        }
        WeeklyStepItemBean weeklyStepItemBean = (WeeklyStepItemBean) other;
        return Intrinsics.areEqual(this.stepBarInfo, weeklyStepItemBean.stepBarInfo) && Intrinsics.areEqual(this.stepBarOpt, weeklyStepItemBean.stepBarOpt) && Intrinsics.areEqual(this.stepBarInfotitle, weeklyStepItemBean.stepBarInfotitle) && Intrinsics.areEqual(this.stepBarInfotips, weeklyStepItemBean.stepBarInfotips) && Intrinsics.areEqual(this.stepBarDarkOpt, weeklyStepItemBean.stepBarDarkOpt);
    }

    @NotNull
    public final StepBarOpt getStepBarDarkOpt() {
        return this.stepBarDarkOpt;
    }

    @NotNull
    public final WeeklyStepBarInfo getStepBarInfo() {
        return this.stepBarInfo;
    }

    @NotNull
    public final String getStepBarInfotips() {
        return this.stepBarInfotips;
    }

    @NotNull
    public final String getStepBarInfotitle() {
        return this.stepBarInfotitle;
    }

    @NotNull
    public final StepBarOpt getStepBarOpt() {
        return this.stepBarOpt;
    }

    public int hashCode() {
        return (((((((this.stepBarInfo.hashCode() * 31) + this.stepBarOpt.hashCode()) * 31) + this.stepBarInfotitle.hashCode()) * 31) + this.stepBarInfotips.hashCode()) * 31) + this.stepBarDarkOpt.hashCode();
    }

    public final void setStepBarDarkOpt(@NotNull StepBarOpt stepBarOpt) {
        Intrinsics.checkNotNullParameter(stepBarOpt, "<set-?>");
        this.stepBarDarkOpt = stepBarOpt;
    }

    public final void setStepBarInfo(@NotNull WeeklyStepBarInfo weeklyStepBarInfo) {
        Intrinsics.checkNotNullParameter(weeklyStepBarInfo, "<set-?>");
        this.stepBarInfo = weeklyStepBarInfo;
    }

    public final void setStepBarInfotips(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.stepBarInfotips = str;
    }

    public final void setStepBarInfotitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.stepBarInfotitle = str;
    }

    public final void setStepBarOpt(@NotNull StepBarOpt stepBarOpt) {
        Intrinsics.checkNotNullParameter(stepBarOpt, "<set-?>");
        this.stepBarOpt = stepBarOpt;
    }

    @NotNull
    public String toString() {
        return "WeeklyStepItemBean(stepBarInfo=" + this.stepBarInfo + ", stepBarOpt=" + this.stepBarOpt + ", stepBarInfotitle=" + this.stepBarInfotitle + ", stepBarInfotips=" + this.stepBarInfotips + ", stepBarDarkOpt=" + this.stepBarDarkOpt + ")";
    }
}
