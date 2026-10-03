package com.oplus.statistics.data;

import android.content.Context;
import com.oplus.weatherservicesdk.data.Weather;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class DynamicEventBean extends TrackEvent {
    public String h;
    public int i;

    public DynamicEventBean(Context context, int i, String str) {
        super(context);
        this.i = i;
        this.h = str;
        b("uploadMode", i);
        d("eventBody", this.h);
    }

    public String getBody() {
        return this.h;
    }

    @Override // com.oplus.statistics.data.TrackEvent
    public int getEventType() {
        return 1007;
    }

    public int getUploadMode() {
        return this.i;
    }

    public void setBody(String str) {
        this.h = str;
        d("eventBody", str);
    }

    public void setUploadMode(int i) {
        this.i = i;
        b("uploadMode", i);
    }

    public String toString() {
        return "uploadMode is :" + this.i + Weather.SEPARATOR + "body is :" + getBody() + Weather.SEPARATOR;
    }
}
