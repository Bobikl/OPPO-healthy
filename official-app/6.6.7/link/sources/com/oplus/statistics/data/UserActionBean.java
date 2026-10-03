package com.oplus.statistics.data;

import android.content.Context;
import com.oplus.weatherservicesdk.data.Weather;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class UserActionBean extends TrackEvent {
    public int h;
    public String i;
    public int j;

    public UserActionBean(Context context, int i, String str, int i2) {
        super(context);
        this.h = i;
        this.i = str;
        this.j = i2;
        b("actionCode", i);
        b("actionAmount", this.j);
        d("actionTime", this.i);
    }

    public int getActionAmount() {
        return this.j;
    }

    public int getActionCode() {
        return this.h;
    }

    public String getActionDate() {
        return this.i;
    }

    @Override // com.oplus.statistics.data.TrackEvent
    public int getEventType() {
        return 1001;
    }

    public void setActionAmount(int i) {
        this.j = i;
        b("actionAmount", i);
    }

    public void setActionCode(int i) {
        this.h = i;
        b("actionCode", i);
    }

    public void setActionDate(String str) {
        this.i = str;
        d("actionTime", str);
    }

    public String toString() {
        return "action code is: " + getActionCode() + Weather.SEPARATOR + "action amount is: " + getActionAmount() + Weather.SEPARATOR + "action date is: " + getActionDate() + Weather.SEPARATOR;
    }
}
