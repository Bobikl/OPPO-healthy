package com.oplus.statistics.data;

import android.content.Context;
import androidx.annotation.NonNull;
import com.oplus.aiunit.vision.d14;
import com.oplus.statistics.util.CastUtil;
import java.util.Map;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class CommonBean extends TrackEvent {
    public String h;
    public String i;
    public String j;
    public int k;

    public CommonBean(@NonNull Context context) {
        super(context);
        this.h = "";
        this.i = "";
        this.j = "";
        this.k = 0;
    }

    public int getAppID() {
        return this.k;
    }

    public String getEventID() {
        return this.j;
    }

    @Override // com.oplus.statistics.data.TrackEvent
    public int getEventType() {
        return 1006;
    }

    public String getLogMap() {
        return this.h;
    }

    public String getLogTag() {
        return this.i;
    }

    public void setAppId(int i) {
        this.k = i;
        b("appId", i);
    }

    public void setEventID(String str) {
        this.j = str;
        d("eventID", str);
    }

    public void setLogMap(Map<String, String> map) {
        String string = CastUtil.map2JsonObject(map).toString();
        this.h = string;
        d("logMap", string);
    }

    public void setLogTag(String str) {
        this.i = str;
        d("logTag", str);
    }

    public String toString() {
        return " type is :" + getEventType() + d14.COMMA_REGEX + " tag is :" + getLogTag() + d14.COMMA_REGEX + " eventID is :" + getEventID() + d14.COMMA_REGEX + " map is :" + getLogMap();
    }

    public void setLogMap(String str) {
        this.h = str;
        d("logMap", str);
    }

    public CommonBean(@NonNull Context context, String str, String str2) {
        super(context);
        this.h = "";
        this.k = 0;
        this.i = str;
        this.j = str2;
        d("logTag", str);
        d("eventID", this.j);
    }

    public CommonBean(@NonNull Context context, String str, String str2, String str3) {
        super(context);
        this.h = "";
        this.k = 0;
        this.i = str2;
        this.j = str3;
        setAppId(str);
        d("logTag", this.i);
        d("eventID", this.j);
    }
}
