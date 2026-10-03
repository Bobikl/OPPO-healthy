package com.oplus.pay.opensdk.web.ui;

import android.os.Bundle;
import com.oplus.aiunit.vision.l2a;
import com.oplus.aiunit.vision.s65;
import com.oplus.aiunit.vision.wz9;
import com.oplus.web.container.engine.config.IWebViewSettings;
import com.oplus.web.container.webview.core.WebContainerFragment;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\f"}, d2 = {"Lcom/oplus/pay/opensdk/web/ui/PluginPayWebContainerFragment;", "Lcom/oplus/web/container/webview/core/WebContainerFragment;", "Lcom/oplus/aiunit/vision/wz9;", "onCreateStateViewAdapter", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "<init>", "()V", "Companion", "a", "paysdk_web_release"}, k = 1, mv = {1, 8, 0})
public final class PluginPayWebContainerFragment extends WebContainerFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.oplus.pay.opensdk.web.ui.PluginPayWebContainerFragment$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¨\u0006\b"}, d2 = {"Lcom/oplus/pay/opensdk/web/ui/PluginPayWebContainerFragment$a;", "", "Landroid/os/Bundle;", "webContainerRouterData", "Lcom/oplus/pay/opensdk/web/ui/PluginPayWebContainerFragment;", "a", "<init>", "()V", "paysdk_web_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final PluginPayWebContainerFragment a(@Nullable Bundle webContainerRouterData) {
            PluginPayWebContainerFragment pluginPayWebContainerFragment = new PluginPayWebContainerFragment();
            if (webContainerRouterData != null) {
                pluginPayWebContainerFragment.setArguments(webContainerRouterData);
            }
            return pluginPayWebContainerFragment;
        }
    }

    @JvmStatic
    @NotNull
    public static final PluginPayWebContainerFragment Z(@Nullable Bundle bundle) {
        return INSTANCE.a(bundle);
    }

    @Override // com.oplus.web.container.webview.core.WebContainerFragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        IWebViewSettings settings;
        super.onCreate(savedInstanceState);
        setWebViewSaveInstanceState(false);
        l2a webView = getWebView();
        if (webView == null || (settings = webView.getSettings()) == null) {
            return;
        }
        settings.u(false);
    }

    @Override // com.oplus.web.container.webview.core.WebContainerFragment
    @NotNull
    public wz9 onCreateStateViewAdapter() {
        return new s65(this);
    }
}
