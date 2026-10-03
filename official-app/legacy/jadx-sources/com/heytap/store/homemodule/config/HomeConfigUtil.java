package com.heytap.store.homemodule.config;

import com.heytap.store.business.configservice.IConfigService;
import com.heytap.store.business.personal.service.IPersonalService;
import com.heytap.store.platform.htrouter.launcher.business.HTAliasRouter;
import io.netty.util.internal.StringUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0004J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0002J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u0011J\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004J\u000e\u0010\u0014\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u0011J \u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0004H\u0002J\b\u0010\u0018\u001a\u00020\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/heytap/store/homemodule/config/HomeConfigUtil;", "", "()V", "COMMON_CONFIG_NAME", "", "personalService", "Lcom/heytap/store/business/personal/service/IPersonalService;", "getPersonalService", "()Lcom/heytap/store/business/personal/service/IPersonalService;", "personalService$delegate", "Lkotlin/Lazy;", "containRecTitle", "", "value", "geComRecTitle", "key", "getBubbleRequestTimeInterval", "", "getHomePullAutoScrollToTop", "getHomeReTitle", "getHomeRequestTimeInterval", "getStringConfig", "configName", "defaultString", "isRecommendSwitchOpen", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class HomeConfigUtil {

    @NotNull
    public static final String COMMON_CONFIG_NAME = "common_config";

    @NotNull
    public static final HomeConfigUtil INSTANCE = new HomeConfigUtil();

    /* JADX INFO: renamed from: personalService$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy personalService = LazyKt__LazyJVMKt.lazy(new Function0<IPersonalService>() { // from class: com.heytap.store.homemodule.config.HomeConfigUtil$personalService$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @Nullable
        public final IPersonalService invoke() {
            return (IPersonalService) HTAliasRouter.INSTANCE.getInstance().getService(IPersonalService.class);
        }
    });

    private HomeConfigUtil() {
    }

    private final String geComRecTitle(String key, String value) {
        boolean zIsRecommendSwitchOpen = isRecommendSwitchOpen();
        if (!zIsRecommendSwitchOpen) {
            key = Intrinsics.stringPlus(key, "_OFF");
        }
        if (!zIsRecommendSwitchOpen) {
            value = "热门推荐";
        }
        return HomeGlobalConfigViewModel.INSTANCE.getStringConfig(key, value);
    }

    private final IPersonalService getPersonalService() {
        return (IPersonalService) personalService.getValue();
    }

    private final String getStringConfig(String configName, String key, String defaultString) {
        String stringConfig;
        IConfigService configService = HomeGlobalConfigViewModel.INSTANCE.getConfigService();
        return (configService == null || (stringConfig = configService.getStringConfig(configName, key, defaultString)) == null) ? defaultString : stringConfig;
    }

    private final boolean isRecommendSwitchOpen() {
        IPersonalService personalService2 = getPersonalService();
        return (personalService2 == null ? 1 : personalService2.isRecommendSwitchOpen()) == 1;
    }

    public final boolean containRecTitle(@Nullable String value) {
        String stringConfig = getStringConfig("common_config", "COMMON_RECOMMEND_TITLE_LIST", ",为你推荐,猜你喜欢,");
        StringBuilder sb = new StringBuilder();
        sb.append(StringUtil.COMMA);
        if (value == null) {
            value = "";
        }
        sb.append(value);
        sb.append(StringUtil.COMMA);
        return StringsKt__StringsKt.contains$default((CharSequence) stringConfig, (CharSequence) sb.toString(), false, 2, (Object) null);
    }

    public final int getBubbleRequestTimeInterval(int value) {
        return HomeGlobalConfigViewModel.INSTANCE.getIntConfig("home_config", "BUBBLE_REQUEST_INTERVAL_TIME", value);
    }

    public final int getHomePullAutoScrollToTop(int value) {
        return HomeGlobalConfigViewModel.INSTANCE.getIntConfig("home_config", "HOME_PULL_AUTO_SCROLL_TO_TOP", value);
    }

    @NotNull
    public final String getHomeReTitle(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return geComRecTitle("HOME_RECOMMEND_TITLE_BOTTOM_TEXT", value);
    }

    public final int getHomeRequestTimeInterval(int value) {
        return HomeGlobalConfigViewModel.INSTANCE.getIntConfig("home_config", "HOME_REQUEST_TIME_INTERVAL", value);
    }
}
