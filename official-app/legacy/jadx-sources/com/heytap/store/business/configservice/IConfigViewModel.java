package com.heytap.store.business.configservice;

import androidx.lifecycle.MutableLiveData;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\nH&R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R#\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/heytap/store/business/configservice/IConfigViewModel;", "", "()V", "configErrorData", "Landroidx/lifecycle/MutableLiveData;", "", "getConfigErrorData", "()Landroidx/lifecycle/MutableLiveData;", "configLiveData", "", "", "getConfigLiveData", "requestConfig", "", "configName", "Companion", "config-service_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class IConfigViewModel {

    @NotNull
    public static final String CONFIG_CENTER_CHANNEL = "android_app";

    @NotNull
    public static final String CONFIG_CENTER_URL = "/fuxi/config/v1/queryConfigCenterValuesV2";

    @NotNull
    private final MutableLiveData<Map<String, String>> configLiveData = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<Throwable> configErrorData = new MutableLiveData<>();

    @NotNull
    public final MutableLiveData<Throwable> getConfigErrorData() {
        return this.configErrorData;
    }

    @NotNull
    public final MutableLiveData<Map<String, String>> getConfigLiveData() {
        return this.configLiveData;
    }

    public abstract void requestConfig(@NotNull String configName);
}
