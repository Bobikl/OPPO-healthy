package com.heytap.health.interconnection.weather;

import com.alibaba.android.arouter.facade.template.IProvider;
import com.oplus.aiunit.vision.c8l;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J+\u0010\n\u001a\u00020\u00022!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00020\u0004H&J$\u0010\u000e\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00020\u0004H&¨\u0006\u000f"}, d2 = {"Lcom/heytap/health/interconnection/weather/IWeatherRouterService;", "Lcom/alibaba/android/arouter/facade/template/IProvider;", "", "syncAfterPermissionGrant", "Lkotlin/Function1;", "Lcom/heytap/health/interconnection/weather/HealthWeather;", "Lkotlin/ParameterName;", "name", "data", "code", c8l.KEY_D1, "", "forceUpdate", "Lcom/heytap/health/interconnection/weather/UltraVioleBean;", "a2", "device_interconnection_release"}, k = 1, mv = {1, 8, 0})
public interface IWeatherRouterService extends IProvider {
    void D1(@NotNull Function1<? super HealthWeather, Unit> code);

    void a2(boolean forceUpdate, @NotNull Function1<? super UltraVioleBean, Unit> data);

    void syncAfterPermissionGrant();
}
