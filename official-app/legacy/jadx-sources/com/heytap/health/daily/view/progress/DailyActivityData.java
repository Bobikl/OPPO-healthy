package com.heytap.health.daily.view.progress;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003JY\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\u0003HÖ\u0001J\t\u0010+\u001a\u00020,HÖ\u0001R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\r\"\u0004\b\u001d\u0010\u000f¨\u0006-"}, d2 = {"Lcom/heytap/health/daily/view/progress/DailyActivityData;", "", "currentStep", "", "targetStep", "currentCalorie", "targetCalorie", "currentTime", "targetTime", "currentActive", "targetActive", "(IIIIIIII)V", "getCurrentActive", "()I", "setCurrentActive", "(I)V", "getCurrentCalorie", "setCurrentCalorie", "getCurrentStep", "setCurrentStep", "getCurrentTime", "setCurrentTime", "getTargetActive", "setTargetActive", "getTargetCalorie", "setTargetCalorie", "getTargetStep", "setTargetStep", "getTargetTime", "setTargetTime", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "", "daily_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class DailyActivityData {
    public static final int $stable = 8;
    private int currentActive;
    private int currentCalorie;
    private int currentStep;
    private int currentTime;
    private int targetActive;
    private int targetCalorie;
    private int targetStep;
    private int targetTime;

    public DailyActivityData() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 255, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCurrentStep() {
        return this.currentStep;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTargetStep() {
        return this.targetStep;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getCurrentCalorie() {
        return this.currentCalorie;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getTargetCalorie() {
        return this.targetCalorie;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getCurrentTime() {
        return this.currentTime;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getTargetTime() {
        return this.targetTime;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getCurrentActive() {
        return this.currentActive;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getTargetActive() {
        return this.targetActive;
    }

    @NotNull
    public final DailyActivityData copy(int currentStep, int targetStep, int currentCalorie, int targetCalorie, int currentTime, int targetTime, int currentActive, int targetActive) {
        return new DailyActivityData(currentStep, targetStep, currentCalorie, targetCalorie, currentTime, targetTime, currentActive, targetActive);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DailyActivityData)) {
            return false;
        }
        DailyActivityData dailyActivityData = (DailyActivityData) other;
        return this.currentStep == dailyActivityData.currentStep && this.targetStep == dailyActivityData.targetStep && this.currentCalorie == dailyActivityData.currentCalorie && this.targetCalorie == dailyActivityData.targetCalorie && this.currentTime == dailyActivityData.currentTime && this.targetTime == dailyActivityData.targetTime && this.currentActive == dailyActivityData.currentActive && this.targetActive == dailyActivityData.targetActive;
    }

    public final int getCurrentActive() {
        return this.currentActive;
    }

    public final int getCurrentCalorie() {
        return this.currentCalorie;
    }

    public final int getCurrentStep() {
        return this.currentStep;
    }

    public final int getCurrentTime() {
        return this.currentTime;
    }

    public final int getTargetActive() {
        return this.targetActive;
    }

    public final int getTargetCalorie() {
        return this.targetCalorie;
    }

    public final int getTargetStep() {
        return this.targetStep;
    }

    public final int getTargetTime() {
        return this.targetTime;
    }

    public int hashCode() {
        return (((((((((((((Integer.hashCode(this.currentStep) * 31) + Integer.hashCode(this.targetStep)) * 31) + Integer.hashCode(this.currentCalorie)) * 31) + Integer.hashCode(this.targetCalorie)) * 31) + Integer.hashCode(this.currentTime)) * 31) + Integer.hashCode(this.targetTime)) * 31) + Integer.hashCode(this.currentActive)) * 31) + Integer.hashCode(this.targetActive);
    }

    public final void setCurrentActive(int i) {
        this.currentActive = i;
    }

    public final void setCurrentCalorie(int i) {
        this.currentCalorie = i;
    }

    public final void setCurrentStep(int i) {
        this.currentStep = i;
    }

    public final void setCurrentTime(int i) {
        this.currentTime = i;
    }

    public final void setTargetActive(int i) {
        this.targetActive = i;
    }

    public final void setTargetCalorie(int i) {
        this.targetCalorie = i;
    }

    public final void setTargetStep(int i) {
        this.targetStep = i;
    }

    public final void setTargetTime(int i) {
        this.targetTime = i;
    }

    @NotNull
    public String toString() {
        return "DailyActivityData(currentStep=" + this.currentStep + ", targetStep=" + this.targetStep + ", currentCalorie=" + this.currentCalorie + ", targetCalorie=" + this.targetCalorie + ", currentTime=" + this.currentTime + ", targetTime=" + this.targetTime + ", currentActive=" + this.currentActive + ", targetActive=" + this.targetActive + ")";
    }

    public DailyActivityData(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.currentStep = i;
        this.targetStep = i2;
        this.currentCalorie = i3;
        this.targetCalorie = i4;
        this.currentTime = i5;
        this.targetTime = i6;
        this.currentActive = i7;
        this.targetActive = i8;
    }

    public /* synthetic */ DailyActivityData(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? 0 : i, (i9 & 2) != 0 ? 8000 : i2, (i9 & 4) != 0 ? 0 : i3, (i9 & 8) != 0 ? 300 : i4, (i9 & 16) != 0 ? 0 : i5, (i9 & 32) != 0 ? 30 : i6, (i9 & 64) != 0 ? 0 : i7, (i9 & 128) != 0 ? 12 : i8);
    }
}
