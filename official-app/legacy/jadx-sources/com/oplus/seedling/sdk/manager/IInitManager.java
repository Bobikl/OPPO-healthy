package com.oplus.seedling.sdk.manager;

import android.content.Context;
import android.content.res.Configuration;
import androidx.annotation.Keep;
import com.oplus.aiunit.vision.sbe;
import com.oplus.channel.server.IUserContext;
import com.oplus.seedling.sdk.callback.InstallMonitorCallback;
import com.opos.process.bridge.base.BridgeConstant;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0007\bg\u0018\u0000  2\u00020\u0001:\u0001 J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH&J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H&J.\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00132\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001aH&J\u0010\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0015H&J\u0010\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\rH&J\b\u0010\u001f\u001a\u00020\u0003H&¨\u0006!"}, d2 = {"Lcom/oplus/seedling/sdk/manager/IInitManager;", "", "dispatchConfigurationChanged", "", "newConfig", "Landroid/content/res/Configuration;", "exchangeVersion", "", "", sbe.PAY_SDK_VERSION_NAME, sbe.PAY_SDK_VERSION_CODE, "initSdk", "appContext", "Landroid/content/Context;", "callback", "Lcom/oplus/seedling/sdk/callback/InstallMonitorCallback;", "userContext", "Lcom/oplus/channel/server/IUserContext;", "isPluginSupportFeature", "", "feature", "", "notifyHostBlurAbilityChanged", "isSupportBlur", "isLightColor", BridgeConstant.KEY_EXTRAS, "", "onTrimMemory", "level", "quitSdk", "context", "releaseSdk", "Companion", "pantanal-client_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface IInitManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int FEATURE_INIT_SDK_WITH_USER_CONTEXT = 1;
    public static final int FEATURE_PLUGIN_EXCHANGE_GIT_COMMIT_HASH = 2;
    public static final int FEATURE_PLUGIN_INIT_IN_CHILD_THREAD = 4;
    public static final int FEATURE_PLUGIN_SUPPORT_NOTIFY_GAS_BLUR = 3;
    public static final int FEATURE_SDK_INTERNAL_INIT_CALLBACK = 0;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/oplus/seedling/sdk/manager/IInitManager$Companion;", "", "()V", "FEATURE_INIT_SDK_WITH_USER_CONTEXT", "", "FEATURE_PLUGIN_EXCHANGE_GIT_COMMIT_HASH", "FEATURE_PLUGIN_INIT_IN_CHILD_THREAD", "FEATURE_PLUGIN_SUPPORT_NOTIFY_GAS_BLUR", "FEATURE_SDK_INTERNAL_INIT_CALLBACK", "pantanal-client_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int FEATURE_INIT_SDK_WITH_USER_CONTEXT = 1;
        public static final int FEATURE_PLUGIN_EXCHANGE_GIT_COMMIT_HASH = 2;
        public static final int FEATURE_PLUGIN_INIT_IN_CHILD_THREAD = 4;
        public static final int FEATURE_PLUGIN_SUPPORT_NOTIFY_GAS_BLUR = 3;
        public static final int FEATURE_SDK_INTERNAL_INIT_CALLBACK = 0;

        private Companion() {
        }
    }

    void dispatchConfigurationChanged(@NotNull Configuration newConfig);

    @NotNull
    List<String> exchangeVersion(@NotNull String sdkVersionName, @NotNull String sdkVersionCode);

    void initSdk(@NotNull Context appContext, @NotNull InstallMonitorCallback callback);

    void initSdk(@NotNull IUserContext userContext, @NotNull InstallMonitorCallback callback);

    boolean isPluginSupportFeature(int feature);

    void notifyHostBlurAbilityChanged(boolean isSupportBlur, boolean isLightColor, @NotNull Map<String, ? extends Object> extras);

    void onTrimMemory(int level);

    void quitSdk(@NotNull Context context);

    void releaseSdk();
}
