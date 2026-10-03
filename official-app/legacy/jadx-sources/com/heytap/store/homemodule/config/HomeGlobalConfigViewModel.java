package com.heytap.store.homemodule.config;

import android.content.Context;
import androidx.annotation.ColorRes;
import androidx.annotation.StringRes;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.MutableLiveData;
import com.heytap.store.business.configservice.IConfigService;
import com.heytap.store.business.configservice.IConfigViewModel;
import com.heytap.store.platform.htrouter.launcher.business.HTAliasRouter;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00042\b\b\u0001\u0010\u0017\u001a\u00020\u0013J \u0010\u0018\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0013J\u001c\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u0004J\u0018\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u0013J\u001e\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0013J\"\u0010 \u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00042\b\b\u0001\u0010\u0017\u001a\u00020\u0013J\u0018\u0010 \u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010!\u001a\u00020\u0004J\u0018\u0010\"\u001a\u00020#2\u0006\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020#J\u000e\u0010$\u001a\u00020%2\u0006\u0010\u001c\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006&"}, d2 = {"Lcom/heytap/store/homemodule/config/HomeGlobalConfigViewModel;", "", "()V", "COMMON_CONFIG_NAME", "", "CONFIG_NAME", "configService", "Lcom/heytap/store/business/configservice/IConfigService;", "getConfigService", "()Lcom/heytap/store/business/configservice/IConfigService;", "setConfigService", "(Lcom/heytap/store/business/configservice/IConfigService;)V", "configViewModel", "Lcom/heytap/store/business/configservice/IConfigViewModel;", "getConfigViewModel", "()Lcom/heytap/store/business/configservice/IConfigViewModel;", "setConfigViewModel", "(Lcom/heytap/store/business/configservice/IConfigViewModel;)V", "getColorConfig", "", "context", "Landroid/content/Context;", "key", "resId", "getColorConfigWithDefaultColor", "defaultColor", "getConfigTab", "", "config", "getIntConfig", "default", "defaultInt", "getStringConfig", "defaultString", "getSwitchConfig", "", "requestData", "", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class HomeGlobalConfigViewModel {

    @NotNull
    public static final String COMMON_CONFIG_NAME = "common_config";

    @NotNull
    public static final String CONFIG_NAME = "home_config";

    @NotNull
    public static final HomeGlobalConfigViewModel INSTANCE = new HomeGlobalConfigViewModel();

    @Nullable
    private static IConfigService configService;

    @Nullable
    private static IConfigViewModel configViewModel;

    static {
        IConfigService iConfigService = (IConfigService) HTAliasRouter.INSTANCE.getInstance().getService(IConfigService.class);
        configService = iConfigService;
        configViewModel = iConfigService == null ? null : iConfigService.getConfigViewModel();
    }

    private HomeGlobalConfigViewModel() {
    }

    public static /* synthetic */ int getIntConfig$default(HomeGlobalConfigViewModel homeGlobalConfigViewModel, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return homeGlobalConfigViewModel.getIntConfig(str, i);
    }

    public static /* synthetic */ String getStringConfig$default(HomeGlobalConfigViewModel homeGlobalConfigViewModel, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        return homeGlobalConfigViewModel.getStringConfig(str, str2);
    }

    public static /* synthetic */ boolean getSwitchConfig$default(HomeGlobalConfigViewModel homeGlobalConfigViewModel, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return homeGlobalConfigViewModel.getSwitchConfig(str, z);
    }

    public final int getColorConfig(@Nullable Context context, @NotNull String key, @ColorRes int resId) {
        Intrinsics.checkNotNullParameter(key, "key");
        IConfigService iConfigService = configService;
        if (iConfigService != null) {
            return iConfigService.getColorConfig("home_config", context, key, resId);
        }
        if (context == null) {
            return 0;
        }
        return ContextCompat.getColor(context, resId);
    }

    public final int getColorConfigWithDefaultColor(@Nullable Context context, @NotNull String key, int defaultColor) {
        Intrinsics.checkNotNullParameter(key, "key");
        IConfigService iConfigService = configService;
        return iConfigService == null ? defaultColor : iConfigService.getColorConfigWithDefaultColor("home_config", key, defaultColor);
    }

    @Nullable
    public final IConfigService getConfigService() {
        return configService;
    }

    @Nullable
    public final Map<String, String> getConfigTab(@NotNull String config) {
        Intrinsics.checkNotNullParameter(config, "config");
        IConfigService iConfigService = configService;
        if (iConfigService == null) {
            return null;
        }
        return iConfigService.getCacheConfig(config);
    }

    @Nullable
    public final IConfigViewModel getConfigViewModel() {
        return configViewModel;
    }

    public final int getIntConfig(@NotNull String key, int i) {
        Object objM5287constructorimpl;
        MutableLiveData<Map<String, String>> configLiveData;
        Map<String, String> value;
        String str;
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            Result.Companion companion = Result.INSTANCE;
            IConfigViewModel configViewModel2 = getConfigViewModel();
            objM5287constructorimpl = Result.m5287constructorimpl((configViewModel2 == null || (configLiveData = configViewModel2.getConfigLiveData()) == null || (value = configLiveData.getValue()) == null || (str = value.get(key)) == null) ? null : Integer.valueOf(Integer.parseInt(str)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        Integer num = (Integer) (Result.m5293isFailureimpl(objM5287constructorimpl) ? null : objM5287constructorimpl);
        return num == null ? i : num.intValue();
    }

    @NotNull
    public final String getStringConfig(@NotNull String key, @NotNull String defaultString) {
        String stringConfig;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultString, "defaultString");
        IConfigService iConfigService = configService;
        return (iConfigService == null || (stringConfig = iConfigService.getStringConfig("home_config", key, defaultString)) == null) ? defaultString : stringConfig;
    }

    public final boolean getSwitchConfig(@NotNull String key, boolean z) {
        Intrinsics.checkNotNullParameter(key, "key");
        IConfigService iConfigService = configService;
        return iConfigService == null ? z : iConfigService.getSwitchConfig("home_config", key, z);
    }

    public final void requestData(@NotNull String config) {
        Intrinsics.checkNotNullParameter(config, "config");
        IConfigViewModel iConfigViewModel = configViewModel;
        if (iConfigViewModel == null) {
            return;
        }
        iConfigViewModel.requestConfig(config);
    }

    public final void setConfigService(@Nullable IConfigService iConfigService) {
        configService = iConfigService;
    }

    public final void setConfigViewModel(@Nullable IConfigViewModel iConfigViewModel) {
        configViewModel = iConfigViewModel;
    }

    @NotNull
    public final String getStringConfig(@Nullable Context context, @NotNull String key, @StringRes int resId) {
        String string;
        Intrinsics.checkNotNullParameter(key, "key");
        IConfigService iConfigService = configService;
        String stringConfig = iConfigService == null ? null : iConfigService.getStringConfig("home_config", context, key, resId);
        if (stringConfig == null) {
            return (context == null || (string = context.getString(resId)) == null) ? "" : string;
        }
        return stringConfig;
    }

    public final int getIntConfig(@NotNull String config, @NotNull String key, int defaultInt) {
        String stringConfig;
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(key, "key");
        IConfigService iConfigService = configService;
        if (iConfigService == null || (stringConfig = iConfigService.getStringConfig(config, key, "-1")) == null) {
            stringConfig = "-1";
        }
        if (!Intrinsics.areEqual(stringConfig, "-1")) {
            try {
                Result.Companion companion = Result.INSTANCE;
                return Integer.parseInt(stringConfig);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m5287constructorimpl(ResultKt.createFailure(th));
            }
        }
        return defaultInt;
    }
}
