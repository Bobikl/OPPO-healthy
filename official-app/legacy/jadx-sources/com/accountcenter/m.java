package com.accountcenter;

import android.content.Context;
import com.heytap.webview.extension.activity.RouterKey;
import com.oplus.aiunit.vision.qnl;
import com.platform.sdk.center.deprecated.AcDispatcherManager;
import com.platform.sdk.center.webview.AcWebExtFragment;
import com.platform.sdk.center.webview.WebExtCompatActivity;
import com.platform.usercenter.account.router.interfaces.IRouterService;
import com.platform.usercenter.account.router.util.RouterIntentUtil;
import com.platform.usercenter.account.router.wrapper.IntentWrapper;
import com.platform.usercenter.tools.log.UCLogUtil;
import java.net.URISyntaxException;

/* JADX INFO: loaded from: classes12.dex */
public final class m implements IRouterService {
    @Override // com.platform.usercenter.account.router.interfaces.IRouterService
    public final void openInstant(Context context, String str, String str2) {
        AcDispatcherManager.getInstance().startInstant(context.getApplicationContext(), str, str2);
    }

    @Override // com.platform.usercenter.account.router.interfaces.IRouterService
    public final void openOaps(Context context, String str) {
        if (!str.startsWith("oaps://theme")) {
            AcDispatcherManager.getInstance().openByOaps(context, str);
            return;
        }
        try {
            RouterIntentUtil.openInstalledApp(context, IntentWrapper.parseUriSecurity(context, str, 1), null);
        } catch (URISyntaxException e2) {
            UCLogUtil.e("VipRouterService", e2.getMessage());
        }
    }

    @Override // com.platform.usercenter.account.router.interfaces.IRouterService
    public final void openWebView(Context context, String str) {
        if (context == null || str == null) {
            UCLogUtil.e("VipRouterService", "context1 or linkUrl is null");
        } else {
            new qnl().g(str).d(AcWebExtFragment.class, WebExtCompatActivity.class).b(RouterKey.TITLE, " ").h(context);
        }
    }
}
