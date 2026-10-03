package com.oppo.store.web.component.service;

import android.app.Activity;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import com.heytap.store.platform.htrouter.facade.template.IProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&JT\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0013H&J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0007H&J\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007H&J\u001a\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0018\u001a\u00020\u0019H&J\u001a\u0010\u001a\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001b\u001a\u00020\u001cH&J\u0018\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H&¨\u0006\u001e"}, d2 = {"Lcom/oppo/store/web/component/service/IWebService;", "Lcom/heytap/store/platform/htrouter/facade/template/IProvider;", "cachePreViewWeb", "", "key", "", "webFragment", "Landroidx/fragment/app/Fragment;", "createWebFragment", "url", "reserveToolbarHeight", "", "hideDarkPadding", "bgTransparent", "sourceType", "sChannel", "sVersion", "getCurrentUrl", "activity", "Landroid/app/Activity;", "fragment", "getWebViewByFragment", "Landroid/webkit/WebView;", "registerIWebChromeClient", "iWebChromeClient", "Lcom/oppo/store/web/component/service/IWebChromeClient;", "registerIWebClient", "iWebClient", "Lcom/oppo/store/web/component/service/IWebClient;", "updateUrl", "webbrowser-service_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface IWebService extends IProvider {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Fragment createWebFragment$default(IWebService iWebService, String str, boolean z, boolean z2, boolean z3, String str2, String str3, String str4, int i, Object obj) {
            if (obj == null) {
                return iWebService.createWebFragment(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) == 0 ? z3 : false, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) == 0 ? str4 : null);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createWebFragment");
        }
    }

    void cachePreViewWeb(@NotNull String key, @NotNull Fragment webFragment);

    @NotNull
    Fragment createWebFragment(@Nullable String url, boolean reserveToolbarHeight, boolean hideDarkPadding, boolean bgTransparent, @Nullable String sourceType, @Nullable String sChannel, @Nullable String sVersion);

    @NotNull
    String getCurrentUrl(@NotNull Activity activity);

    @NotNull
    String getCurrentUrl(@NotNull Fragment fragment);

    @Nullable
    WebView getWebViewByFragment(@Nullable Activity activity, @Nullable Fragment fragment);

    boolean registerIWebChromeClient(@Nullable Fragment fragment, @NotNull IWebChromeClient iWebChromeClient);

    boolean registerIWebClient(@Nullable Fragment fragment, @NotNull IWebClient iWebClient);

    void updateUrl(@NotNull Fragment webFragment, @NotNull String url);
}
