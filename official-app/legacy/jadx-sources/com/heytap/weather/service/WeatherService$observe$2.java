package com.heytap.weather.service;

import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b78;
import com.oplus.weatherservicesdk.api.IWeatherNotify;
import com.oplus.weatherservicesdk.api.IWeatherObserve;
import com.oplus.weatherservicesdk.api.WeatherServiceApi;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/oplus/weatherservicesdk/api/IWeatherObserve;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class WeatherService$observe$2 extends Lambda implements Function0<IWeatherObserve> {
    public static final WeatherService$observe$2 INSTANCE = new WeatherService$observe$2();

    public WeatherService$observe$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p010kotlin.jvm.functions.Function0
    public final IWeatherObserve invoke() {
        return new WeatherServiceApi(b78.a()).weatherObserveClient(new IWeatherNotify() { // from class: com.heytap.weather.service.c
            @Override // com.oplus.weatherservicesdk.api.IWeatherNotify
            public final void onChanged() {
                a7b.f("HtWeather_WeatherService", "weather onChange");
            }
        });
    }
}
