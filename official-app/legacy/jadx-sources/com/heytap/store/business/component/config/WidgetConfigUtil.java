package com.heytap.store.business.component.config;

import android.util.Log;
import com.heytap.store.business.configservice.IConfigService;
import com.heytap.store.platform.htrouter.launcher.business.HTAliasRouter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004J\u001a\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/heytap/store/business/component/config/WidgetConfigUtil;", "", "()V", "COMMON_CONFIG_NAME", "", "KEY_LIVE_SWITCH", "configService", "Lcom/heytap/store/business/configservice/IConfigService;", "getConfigService", "()Lcom/heytap/store/business/configservice/IConfigService;", "setConfigService", "(Lcom/heytap/store/business/configservice/IConfigService;)V", "getLiveSwitch", "defValue", "getStringConfig", "key", "defaultString", "widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class WidgetConfigUtil {

    @NotNull
    public static final String COMMON_CONFIG_NAME = "common_config";

    @NotNull
    public static final String KEY_LIVE_SWITCH = "LIVE_CARD_SWITCH";

    @NotNull
    public static final WidgetConfigUtil INSTANCE = new WidgetConfigUtil();

    @Nullable
    private static IConfigService configService = (IConfigService) HTAliasRouter.INSTANCE.getInstance().getService(IConfigService.class);

    private WidgetConfigUtil() {
    }

    private final String getStringConfig(String key, String defaultString) {
        String stringConfig;
        IConfigService iConfigService = configService;
        return (iConfigService == null || (stringConfig = iConfigService.getStringConfig("common_config", key, defaultString)) == null) ? defaultString : stringConfig;
    }

    public static /* synthetic */ String getStringConfig$default(WidgetConfigUtil widgetConfigUtil, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        return widgetConfigUtil.getStringConfig(str, str2);
    }

    @Nullable
    public final IConfigService getConfigService() {
        return configService;
    }

    @NotNull
    public final String getLiveSwitch(@NotNull String defValue) {
        Intrinsics.checkNotNullParameter(defValue, "defValue");
        String stringConfig = getStringConfig(KEY_LIVE_SWITCH, defValue);
        Log.d("WidgetConfigUtil", Intrinsics.stringPlus("开关:", stringConfig));
        return stringConfig;
    }

    public final void setConfigService(@Nullable IConfigService iConfigService) {
        configService = iConfigService;
    }
}
