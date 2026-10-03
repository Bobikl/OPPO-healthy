package com.oplus.statistics.data;

import android.content.Context;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import com.oplus.weatherservicesdk.data.Weather;

/* JADX INFO: loaded from: classes8.dex */
public class ExceptionBean extends TrackEvent {
    public long h;
    public String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f20111j;

    public ExceptionBean(Context context) {
        super(context);
    }

    public int getCount() {
        return this.f20111j;
    }

    public long getEventTime() {
        return this.h;
    }

    @Override // com.oplus.statistics.data.TrackEvent
    public int getEventType() {
        return 1004;
    }

    public String getException() {
        return this.i;
    }

    public void setCount(int i) {
        this.f20111j = i;
        b(ClickApiEntity.TIME, i);
    }

    public void setEventTime(long j2) {
        this.h = j2;
        c(ClickApiEntity.TIME, j2);
    }

    public void setException(String str) {
        this.i = str;
        d("exception", str);
    }

    public String toString() {
        return "exception is :" + getException() + Weather.SEPARATOR + "count is :" + getCount() + Weather.SEPARATOR + "time is :" + getEventTime() + Weather.SEPARATOR;
    }
}
