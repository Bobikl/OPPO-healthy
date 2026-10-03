package com.oplus.aiunit.vision;

import android.content.Context;
import com.heytap.wearable.watch.clock.ClockOobeReceiver;
import com.heytap.weather.module.WeatherOobeReceiver;

/* JADX INFO: loaded from: classes3.dex */
public class aea {
    public static void a(Context context) {
        b(context);
    }

    public static void b(Context context) {
        ClockOobeReceiver.a(context);
        WeatherOobeReceiver.c(context);
    }
}
