package com.oplus.statistics.data;

import android.content.Context;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import com.oplus.weatherservicesdk.data.Weather;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class ExceptionBean extends TrackEvent {
    public long h;
    public String i;
    public int j;

    public ExceptionBean(Context context) {
        super(context);
    }

    public int getCount() {
        return this.j;
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
        this.j = i;
        b(ClickApiEntity.TIME, i);
    }

    public void setEventTime(long j) {
        this.h = j;
        c(ClickApiEntity.TIME, j);
    }

    public void setException(String str) {
        this.i = str;
        d("exception", str);
    }

    public String toString() {
        return "exception is :" + getException() + Weather.SEPARATOR + "count is :" + getCount() + Weather.SEPARATOR + "time is :" + getEventTime() + Weather.SEPARATOR;
    }
}
