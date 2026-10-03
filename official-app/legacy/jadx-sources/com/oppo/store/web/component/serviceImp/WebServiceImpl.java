package com.oppo.store.web.component.serviceImp;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import com.heytap.store.base.core.http.HttpConst;
import com.heytap.store.platform.htrouter.facade.annotations.Route;
import com.oppo.store.web.WebBrowserActivity;
import com.oppo.store.web.WebBrowserFragment;
import com.oppo.store.web.component.service.IWebChromeClient;
import com.oppo.store.web.component.service.IWebClient;
import com.oppo.store.web.component.service.IWebService;
import com.oppo.store.web.constant.Constants;
import com.oppo.store.web.helper.WebFragmentCache;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Route(path = Constants.SERVICE_PATH)
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016JH\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\bH\u0016J\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\u0018\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u001a\u0010\u001b\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u001a\u0010\u001e\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0018\u0010!\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006H\u0016¨\u0006\""}, d2 = {"Lcom/oppo/store/web/component/serviceImp/WebServiceImpl;", "Lcom/oppo/store/web/component/service/IWebService;", "()V", "cachePreViewWeb", "", "key", "", "webFragment", "Landroidx/fragment/app/Fragment;", "createWebFragment", "url", "reserveToolbarHeight", "", "hideDarkPadding", "bgTransparent", "sourceType", "sChannel", "sVersion", "getCurrentUrl", "activity", "Landroid/app/Activity;", "fragment", "getWebViewByFragment", "Landroid/webkit/WebView;", "init", "context", "Landroid/content/Context;", "registerIWebChromeClient", "iWebChromeClient", "Lcom/oppo/store/web/component/service/IWebChromeClient;", "registerIWebClient", "webClient", "Lcom/oppo/store/web/component/service/IWebClient;", "updateUrl", "webbrowser-impl_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class WebServiceImpl implements IWebService {
    @Override // com.oppo.store.web.component.service.IWebService
    public void cachePreViewWeb(@NotNull String key, @NotNull Fragment webFragment) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(webFragment, "webFragment");
        if (webFragment instanceof WebBrowserFragment) {
            WebBrowserFragment webBrowserFragment = (WebBrowserFragment) webFragment;
            webBrowserFragment.cacheWebView();
            WebFragmentCache.INSTANCE.addWebBrowserFragment(key, webBrowserFragment);
        }
    }

    @Override // com.oppo.store.web.component.service.IWebService
    @NotNull
    public Fragment createWebFragment(@Nullable String url, boolean reserveToolbarHeight, boolean hideDarkPadding, boolean bgTransparent, @Nullable String sourceType, @Nullable String sChannel, @Nullable String sVersion) {
        WebBrowserFragment webBrowserFragment = new WebBrowserFragment();
        Bundle bundle = new Bundle();
        bundle.putString("url", url);
        bundle.putBoolean("reserveToolbarHeight", reserveToolbarHeight);
        bundle.putBoolean("hideDarkPadding", hideDarkPadding);
        bundle.putBoolean("bgTransparent", bgTransparent);
        bundle.putString(HttpConst.SOURCE_TYPE, sourceType);
        bundle.putString(HttpConst.CHANNEL, sChannel);
        bundle.putString(HttpConst.APK_VERSION, sVersion);
        webBrowserFragment.setArguments(bundle);
        return webBrowserFragment;
    }

    @Override // com.oppo.store.web.component.service.IWebService
    @NotNull
    public String getCurrentUrl(@NotNull Activity activity) {
        WebBrowserFragment mWebBrowserFragment;
        String currentUrl;
        Intrinsics.checkNotNullParameter(activity, "activity");
        return (!(activity instanceof WebBrowserActivity) || (mWebBrowserFragment = ((WebBrowserActivity) activity).getMWebBrowserFragment()) == null || (currentUrl = mWebBrowserFragment.getCurrentUrl()) == null) ? "" : currentUrl;
    }

    @Override // com.oppo.store.web.component.service.IWebService
    @Nullable
    public WebView getWebViewByFragment(@Nullable Activity activity, @Nullable Fragment fragment) {
        if (fragment instanceof WebBrowserFragment) {
            return ((WebBrowserFragment) fragment).preCreatedWebView(activity);
        }
        return null;
    }

    @Override // com.heytap.store.platform.htrouter.facade.template.IProvider
    public void init(@Nullable Context context) {
    }

    @Override // com.oppo.store.web.component.service.IWebService
    public boolean registerIWebChromeClient(@Nullable Fragment fragment, @NotNull IWebChromeClient iWebChromeClient) {
        Intrinsics.checkNotNullParameter(iWebChromeClient, "iWebChromeClient");
        if (!(fragment instanceof WebBrowserFragment)) {
            return false;
        }
        ((WebBrowserFragment) fragment).registerIWebChromeClient(iWebChromeClient);
        return true;
    }

    @Override // com.oppo.store.web.component.service.IWebService
    public boolean registerIWebClient(@Nullable Fragment fragment, @NotNull IWebClient webClient) {
        Intrinsics.checkNotNullParameter(webClient, "webClient");
        if (!(fragment instanceof WebBrowserFragment)) {
            return false;
        }
        ((WebBrowserFragment) fragment).registerIWebClient(webClient);
        return true;
    }

    @Override // com.oppo.store.web.component.service.IWebService
    public void updateUrl(@NotNull Fragment webFragment, @NotNull String url) {
        Intrinsics.checkNotNullParameter(webFragment, "webFragment");
        Intrinsics.checkNotNullParameter(url, "url");
        if (webFragment instanceof WebBrowserFragment) {
            ((WebBrowserFragment) webFragment).checkLoginBeforeLoadUrl(url, null);
        }
    }

    @Override // com.oppo.store.web.component.service.IWebService
    @NotNull
    public String getCurrentUrl(@NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        return fragment instanceof WebBrowserFragment ? ((WebBrowserFragment) fragment).getCurrentUrl() : "";
    }
}
