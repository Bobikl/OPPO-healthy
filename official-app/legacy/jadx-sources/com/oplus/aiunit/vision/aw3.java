package com.oplus.aiunit.vision;

import com.heytap.health.annotation.ProcessName;
import com.heytap.weather.module.WeatherTransportApi;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class aw3 {
    public static final void a(List<i70> list) {
        list.add(new i70(WeatherTransportApi.class, "api_provider_weather_transport", ProcessName.TRANSPORT, 2, new luc()));
    }
}
