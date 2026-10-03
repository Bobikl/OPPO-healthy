package com.oplus.statistics.data;

import android.content.Context;
import com.oplus.weatherservicesdk.data.Weather;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class DebugBean extends TrackEvent {
    public boolean h;

    public DebugBean(Context context, boolean z) {
        super(context);
        this.h = z;
        e("debug", z);
    }

    @Override // com.oplus.statistics.data.TrackEvent
    public int getEventType() {
        return 1009;
    }

    public boolean getFlag() {
        return this.h;
    }

    public void setFlag(boolean z) {
        this.h = z;
        e("debug", z);
    }

    public String toString() {
        return "type is :" + getEventType() + Weather.SEPARATOR + "flag is :" + getFlag() + Weather.SEPARATOR;
    }
}
