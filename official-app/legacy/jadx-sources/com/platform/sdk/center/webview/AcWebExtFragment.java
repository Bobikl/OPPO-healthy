package com.platform.sdk.center.webview;

import android.content.Context;
import android.net.Uri;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import com.accountcenter.r;
import com.heytap.webpro.core.WebProFragment;
import com.oplus.aiunit.vision.u1j;
import com.platform.sdk.center.sdk.AcCenterAgent;
import com.platform.usercenter.basic.annotation.Keep;
import com.platform.usercenter.tools.os.UCRuntimeEnvironment;
import com.platform.usercenter.tools.os.Version;
import com.platform.usercenter.uws.util.UwsUaBuilder;
import com.platform.usercenter.uws.view.UwsWebExtFragment;
import com.platform.usercenter.uws.view.web_client.UwsWebViewChromeClient;
import com.platform.usercenter.uws.view.web_client.UwsWebViewClient;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
@u1j(activity = WebExtCompatActivity.class)
@Keep
public class AcWebExtFragment extends AcWebFragment {
    public static AcWebExtFragment newInstance(Context context, String str) {
        return (AcWebExtFragment) new WebProFragment.a().c(Uri.parse(str)).b(context, AcWebExtFragment.class);
    }

    private void setAcceptCookie() {
        CookieManager.getInstance().setAcceptCookie(true);
        if (Version.hasL()) {
            CookieManager.getInstance().setAcceptThirdPartyCookies(((UwsWebExtFragment) this).mWebView, true);
        }
    }

    @Override // com.platform.sdk.center.webview.AcWebFragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
    }

    @Override // com.platform.usercenter.uws.view.UwsWebExtFragment
    @NotNull
    public UwsWebViewChromeClient onCreateUcWebChromeClient() {
        return new AcWebViewChromeClient(this);
    }

    @Override // com.platform.usercenter.bizuws.view.BizUwsWebExtFragment, com.platform.usercenter.uws.view.UwsWebExtFragment
    public UwsWebViewClient onCreateUcWebViewClient() {
        return new AcWebViewClient(this, !this.mIsLoadingDefault);
    }

    @Override // com.platform.sdk.center.webview.AcWebFragment, com.heytap.webpro.core.WebProFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        r preloadResStatistic = AcCenterAgent.getPreloadResStatistic();
        if (preloadResStatistic != null) {
            r.a("success_url", "preload_res_interceptor_success", new JSONObject(preloadResStatistic.a).toString());
            preloadResStatistic.a.clear();
            r.a("failed_url", "preload_res_interceptor_failed", new JSONObject(preloadResStatistic.b).toString());
            preloadResStatistic.b.clear();
        }
    }

    @Override // com.platform.usercenter.bizuws.view.BizUwsWebExtFragment, com.platform.usercenter.uws.view.UwsWebExtFragment
    public void setWebViewSettings(WebSettings webSettings) {
        super.setWebViewSettings(webSettings);
        webSettings.setAllowContentAccess(false);
        webSettings.setAllowFileAccess(false);
        webSettings.setAllowFileAccessFromFileURLs(false);
        webSettings.setAllowUniversalAccessFromFileURLs(false);
        webSettings.setTextZoom(100);
        webSettings.setDomStorageEnabled(true);
        StringBuilder sb = new StringBuilder();
        sb.append(webSettings.getUserAgentString());
        sb.append(UwsUaBuilder.with((Context) requireActivity(), ((UwsWebExtFragment) this).mWebView == null ? "" : webSettings.getUserAgentString()).appendCommon().append("JSWebExt", "2").appendJsExt("2").appendSdkVersion("3.3.0").appendBrand(UCRuntimeEnvironment.getXBusinessSystem()).appendEncrypt("1").appendClientType("VipSDK").buildString());
        webSettings.setUserAgentString(sb.toString());
        setAcceptCookie();
    }
}
