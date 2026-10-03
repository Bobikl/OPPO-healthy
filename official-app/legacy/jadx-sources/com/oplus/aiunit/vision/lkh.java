package com.oplus.aiunit.vision;

import android.content.Context;
import androidx.annotation.NonNull;
import com.github.mikephil.charting.data.Entry;
import com.heytap.health.core.widget.charts.data.SleepBarData;
import com.heytap.health.sleep.R$string;

/* JADX INFO: loaded from: classes18.dex */
public class lkh extends zfb {
    public final String a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f13746c = "yyyMMMd";

    public lkh(@NonNull Context context) {
        this.a = context.getString(R$string.health_sleep_charts_unit_hour);
        this.b = context.getString(R$string.health_sleep_charts_unit_minute);
    }

    @Override // com.oplus.aiunit.vision.zfb
    public String a(Entry entry) {
        SleepBarData sleepBarDataC = c(entry);
        if (sleepBarDataC == null) {
            return "";
        }
        long deepSleep = ((sleepBarDataC.getDeepSleep() + sleepBarDataC.getLightSleep()) + sleepBarDataC.getEyeMovement()) / 60000;
        long j2 = deepSleep / 60;
        long j3 = deepSleep % 60;
        if (j2 > 0) {
            return j2 + this.a + j3 + this.b;
        }
        if (j3 <= 0) {
            return "--" + this.b;
        }
        return j3 + this.b;
    }

    @Override // com.oplus.aiunit.vision.zfb
    public String b(Entry entry) {
        SleepBarData sleepBarDataC = c(entry);
        return sleepBarDataC == null ? "" : mq8.INSTANCE.y(sleepBarDataC.getTimestamp(), this.f13746c);
    }

    public final SleepBarData c(Entry entry) {
        Object data = entry.getData();
        if (data instanceof SleepBarData) {
            return (SleepBarData) data;
        }
        return null;
    }

    public void d(String str) {
        this.f13746c = str;
    }
}
