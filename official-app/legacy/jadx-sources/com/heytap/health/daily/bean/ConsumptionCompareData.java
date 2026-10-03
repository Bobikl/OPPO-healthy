package com.heytap.health.daily.bean;

import android.text.format.DateFormat;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001a\u0010\u0018\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR\u001a\u0010\u001b\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u000e¨\u0006 "}, d2 = {"Lcom/heytap/health/daily/bean/ConsumptionCompareData;", "Lcom/heytap/health/core/widget/charts/data/TimeStampedData;", "()V", "calorie", "", "getCalorie", "()D", "setCalorie", "(D)V", "calorieGoal", "", "getCalorieGoal", "()I", "setCalorieGoal", "(I)V", "monthAverageCalorie", "getMonthAverageCalorie", "setMonthAverageCalorie", "monthTotalCalorie", "getMonthTotalCalorie", "setMonthTotalCalorie", "monthTotalValidDays", "getMonthTotalValidDays", "setMonthTotalValidDays", "reachGoalDays", "getReachGoalDays", "setReachGoalDays", "totalValidDays", "getTotalValidDays", "setTotalValidDays", "toString", "", "daily_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ConsumptionCompareData extends TimeStampedData {
    public static final int $stable = 8;
    private double calorie;
    private int calorieGoal = -1;
    private double monthAverageCalorie;
    private double monthTotalCalorie;
    private int monthTotalValidDays;
    private int reachGoalDays;
    private int totalValidDays;

    public final double getCalorie() {
        return this.calorie;
    }

    public final int getCalorieGoal() {
        return this.calorieGoal;
    }

    public final double getMonthAverageCalorie() {
        return this.monthAverageCalorie;
    }

    public final double getMonthTotalCalorie() {
        return this.monthTotalCalorie;
    }

    public final int getMonthTotalValidDays() {
        return this.monthTotalValidDays;
    }

    public final int getReachGoalDays() {
        return this.reachGoalDays;
    }

    public final int getTotalValidDays() {
        return this.totalValidDays;
    }

    public final void setCalorie(double d) {
        this.calorie = d;
    }

    public final void setCalorieGoal(int i) {
        this.calorieGoal = i;
    }

    public final void setMonthAverageCalorie(double d) {
        this.monthAverageCalorie = d;
    }

    public final void setMonthTotalCalorie(double d) {
        this.monthTotalCalorie = d;
    }

    public final void setMonthTotalValidDays(int i) {
        this.monthTotalValidDays = i;
    }

    public final void setReachGoalDays(int i) {
        this.reachGoalDays = i;
    }

    public final void setTotalValidDays(int i) {
        this.totalValidDays = i;
    }

    @Override // com.heytap.health.core.widget.charts.data.TimeStampedData
    @NotNull
    public String toString() {
        long j2 = this.timestamp;
        CharSequence charSequence = DateFormat.format("yyyy/MM/dd:HH:mm:ss", j2);
        return "ConsumptionCompareData{timestamp=" + j2 + "/" + ((Object) charSequence) + ", calorie=" + this.calorie + ", calorieGoal=" + this.calorieGoal + ", reachGoalDays=" + this.reachGoalDays + ", totalValidDays=" + this.totalValidDays + ", monthAverageCalorie=" + this.monthAverageCalorie + ", monthTotalCalorie=" + this.monthTotalCalorie + ", monthTotalValidDays=" + this.monthTotalValidDays + "}" + super.toString();
    }
}
