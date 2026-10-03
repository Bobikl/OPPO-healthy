package com.heytap.health.daily.bean;

import androidx.annotation.Keep;
import java.time.LocalDate;

/* JADX INFO: loaded from: classes16.dex */
@Keep
public class DailyActivityCalendarDayBean {
    private int GoalComplete;
    private int actives;
    private int activesTarget;
    private int calories;
    private int caloriesTarget;
    private LocalDate date;
    private int steps;
    private int stepsTarget;
    private int times;
    private int timesTarget;

    public DailyActivityCalendarDayBean() {
    }

    public int getActives() {
        return this.actives;
    }

    public int getActivesTarget() {
        return this.activesTarget;
    }

    public int getCalories() {
        return this.calories;
    }

    public int getCaloriesTarget() {
        return this.caloriesTarget;
    }

    public LocalDate getDate() {
        return this.date;
    }

    public int getGoalComplete() {
        return this.GoalComplete;
    }

    public int getSteps() {
        return this.steps;
    }

    public int getStepsTarget() {
        return this.stepsTarget;
    }

    public int getTimes() {
        return this.times;
    }

    public int getTimesTarget() {
        return this.timesTarget;
    }

    public void setActives(int i) {
        this.actives = i;
    }

    public void setActivesTarget(int i) {
        this.activesTarget = i;
    }

    public void setCalories(int i) {
        this.calories = i;
    }

    public void setCaloriesTarget(int i) {
        this.caloriesTarget = i;
    }

    public void setDate(LocalDate localDate) {
        this.date = localDate;
    }

    public void setGoalComplete(int i) {
        this.GoalComplete = i;
    }

    public void setSteps(int i) {
        this.steps = i;
    }

    public void setStepsTarget(int i) {
        this.stepsTarget = i;
    }

    public void setTimes(int i) {
        this.times = i;
    }

    public void setTimesTarget(int i) {
        this.timesTarget = i;
    }

    public String toString() {
        return "DailyActivityCalendarDayBean{date=" + this.date + ", calories=" + this.calories + ", steps=" + this.steps + ", actives=" + this.actives + ", times=" + this.times + ", caloriesTarget=" + this.caloriesTarget + ", stepsTarget=" + this.stepsTarget + ", activesTarget=" + this.activesTarget + ", timesTarget=" + this.timesTarget + ", GoalComplete=" + this.GoalComplete + '}';
    }

    public DailyActivityCalendarDayBean(LocalDate localDate, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.date = localDate;
        this.calories = i;
        this.steps = i2;
        this.actives = i3;
        this.times = i4;
        this.caloriesTarget = i5;
        this.stepsTarget = i6;
        this.activesTarget = i7;
        this.timesTarget = i8;
        this.GoalComplete = i9;
    }
}
