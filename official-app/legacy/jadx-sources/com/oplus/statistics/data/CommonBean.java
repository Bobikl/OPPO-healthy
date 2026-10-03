package com.oplus.statistics.data;

import android.content.Context;
import androidx.annotation.NonNull;
import com.oplus.statistics.util.CastUtil;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class CommonBean extends TrackEvent {
    public String h;
    public String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f20110j;
    public int k;

    public CommonBean(@NonNull Context context) {
        super(context);
        this.h = "";
        this.i = "";
        this.f20110j = "";
        this.k = 0;
    }

    public int getAppID() {
        return this.k;
    }

    public String getEventID() {
        return this.f20110j;
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
        this.f20110j = str;
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
        return " type is :" + getEventType() + ", tag is :" + getLogTag() + ", eventID is :" + getEventID() + ", map is :" + getLogMap();
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
        this.f20110j = str2;
        d("logTag", str);
        d("eventID", this.f20110j);
    }

    public CommonBean(@NonNull Context context, String str, String str2, String str3) {
        super(context);
        this.h = "";
        this.k = 0;
        this.i = str2;
        this.f20110j = str3;
        setAppId(str);
        d("logTag", this.i);
        d("eventID", this.f20110j);
    }
}
