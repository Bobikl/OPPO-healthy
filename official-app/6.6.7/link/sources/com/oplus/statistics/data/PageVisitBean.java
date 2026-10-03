package com.oplus.statistics.data;

import android.content.Context;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import com.oplus.weatherservicesdk.data.Weather;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class PageVisitBean extends TrackEvent {
    public String h;
    public long i;
    public String j;

    public PageVisitBean(Context context) {
        super(context);
    }

    public String getActivities() {
        return this.j;
    }

    public long getDuration() {
        return this.i;
    }

    @Override // com.oplus.statistics.data.TrackEvent
    public int getEventType() {
        return 1003;
    }

    public String getTime() {
        return this.h;
    }

    public void setActivities(String str) {
        this.j = str;
        d("activities", str);
    }

    public void setDuration(long j) {
        this.i = j;
        c("duration", j);
    }

    public void setTime(String str) {
        this.h = str;
        d(ClickApiEntity.TIME, str);
    }

    public String toString() {
        return "time is :" + getTime() + Weather.SEPARATOR + "duration is :" + getDuration() + Weather.SEPARATOR + "activities is :" + getActivities() + Weather.SEPARATOR;
    }
}
