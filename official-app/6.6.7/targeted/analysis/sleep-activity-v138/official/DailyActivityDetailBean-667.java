package com.heytap.health.daily.bean;

import androidx.annotation.Keep;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
@Keep
public class DailyActivityDetailBean {
    private List<TimeStampedData> actives;
    private List<TimeStampedData> calories;
    private List<TimeStampedData> steps;
    private List<TimeStampedData> times;

    public List<TimeStampedData> getActives() {
        return this.actives;
    }

    public List<TimeStampedData> getCalories() {
        return this.calories;
    }

    public List<TimeStampedData> getSteps() {
        return this.steps;
    }

    public List<TimeStampedData> getTimes() {
        return this.times;
    }

    public void setActives(List<TimeStampedData> list) {
        this.actives = list;
    }

    public void setCalories(List<TimeStampedData> list) {
        this.calories = list;
    }

    public void setSteps(List<TimeStampedData> list) {
        this.steps = list;
    }

    public void setTimes(List<TimeStampedData> list) {
        this.times = list;
    }
}