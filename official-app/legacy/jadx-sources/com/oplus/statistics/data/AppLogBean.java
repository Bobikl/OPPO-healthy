package com.oplus.statistics.data;

import android.content.Context;
import com.oplus.weatherservicesdk.data.Weather;

/* JADX INFO: loaded from: classes8.dex */
public class AppLogBean extends TrackEvent {
    public String h;
    public String i;

    public AppLogBean(Context context, String str, String str2) {
        super(context);
        this.h = str;
        this.i = str2;
        d("eventType", str);
        d("eventBody", this.i);
    }

    public String getBody() {
        return this.i;
    }

    @Override // com.oplus.statistics.data.TrackEvent
    public int getEventType() {
        return 1002;
    }

    public String getType() {
        return this.h;
    }

    public void setAppLog(String str) {
        this.i = str;
        d("eventBody", str);
    }

    public void setType(String str) {
        this.h = str;
        d("eventType", str);
    }

    public String toString() {
        return "type is :" + getEventType() + Weather.SEPARATOR + "body is :" + getBody() + Weather.SEPARATOR;
    }
}
