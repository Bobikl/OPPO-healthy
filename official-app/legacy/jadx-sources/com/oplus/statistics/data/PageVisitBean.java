package com.oplus.statistics.data;

import android.content.Context;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import com.oplus.weatherservicesdk.data.Weather;

/* JADX INFO: loaded from: classes8.dex */
public class PageVisitBean extends TrackEvent {
    public String h;
    public long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f20112j;

    public PageVisitBean(Context context) {
        super(context);
    }

    public String getActivities() {
        return this.f20112j;
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
        this.f20112j = str;
        d("activities", str);
    }

    public void setDuration(long j2) {
        this.i = j2;
        c("duration", j2);
    }

    public void setTime(String str) {
        this.h = str;
        d(ClickApiEntity.TIME, str);
    }

    public String toString() {
        return "time is :" + getTime() + Weather.SEPARATOR + "duration is :" + getDuration() + Weather.SEPARATOR + "activities is :" + getActivities() + Weather.SEPARATOR;
    }
}
