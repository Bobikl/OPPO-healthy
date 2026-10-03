package com.heytap.health.device_app_store.impl.appstore.business.store.js;

import android.webkit.WebView;
import androidx.annotation.Keep;
import com.google.gson.JsonObject;
import com.oplus.aiunit.vision.rc0;

/* JADX INFO: loaded from: classes16.dex */
@Keep
public class AppStoreOldJsInterfaceImpl extends AbsJsInterface {
    public static final String TAG = "AppStoreOldJsInterfaceImpl";

    public AppStoreOldJsInterfaceImpl() {
        super(rc0.DOMAIN_SAFE_URL_OLD_STORE);
    }

    private void goBack(JsonObject jsonObject) {
        final WebView webView = getWebView();
        if (webView != null) {
            webView.post(new Runnable() { // from class: com.oplus.aiunit.vision.de0
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.lambda$goBack$0(webView);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$goBack$0(WebView webView) {
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            finishActivity();
        }
    }

    private void onBackPressed(JsonObject jsonObject) {
        goBack(jsonObject);
    }

    @Override // com.heytap.health.device_app_store.impl.appstore.business.store.js.AbsJsInterface
    public Object getChildInstance() {
        return this;
    }
}
