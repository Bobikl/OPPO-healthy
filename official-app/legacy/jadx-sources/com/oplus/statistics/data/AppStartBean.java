package com.oplus.statistics.data;

import android.content.Context;
import com.oplus.weatherservicesdk.data.Weather;

/* JADX INFO: loaded from: classes8.dex */
public class AppStartBean extends TrackEvent {
    public String h;

    public AppStartBean(Context context, String str) {
        super(context);
        this.h = str;
        d("loginTime", str);
    }

    @Override // com.oplus.statistics.data.TrackEvent
    public int getEventType() {
        return 1000;
    }

    public String getTime() {
        return this.h;
    }

    public void setTime(String str) {
        this.h = str;
        d("loginTime", str);
    }

    public String toString() {
        return "loginTime is :" + getTime() + Weather.SEPARATOR;
    }
}
