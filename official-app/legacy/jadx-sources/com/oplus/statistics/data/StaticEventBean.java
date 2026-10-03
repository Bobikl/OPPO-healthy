package com.oplus.statistics.data;

import android.content.Context;
import com.oplus.weatherservicesdk.data.Weather;

/* JADX INFO: loaded from: classes8.dex */
public class StaticEventBean extends TrackEvent {
    public int h;
    public String i;

    public StaticEventBean(Context context, int i, String str) {
        super(context);
        this.h = i;
        this.i = str;
        b("uploadMode", i);
        d("eventBody", this.i);
    }

    public String getBody() {
        return this.i;
    }

    @Override // com.oplus.statistics.data.TrackEvent
    public int getEventType() {
        return 1008;
    }

    public int getUploadMode() {
        return this.h;
    }

    public void setBody(String str) {
        this.i = str;
        d("eventBody", str);
    }

    public void setUploadMode(int i) {
        this.h = i;
        b("uploadMode", i);
    }

    public String toString() {
        return "uploadMode is :" + this.h + Weather.SEPARATOR + "body is :" + getBody() + Weather.SEPARATOR;
    }
}
