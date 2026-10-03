package com.heytap.webview.extension.cache;

import android.content.Context;
import android.net.Uri;
import android.webkit.URLUtil;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.CallSuper;
import androidx.annotation.RequiresApi;
import com.oplus.smartenginehelper.ParserTag;
import java.net.URL;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0015\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0011H\u0003J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0016\u001a\u00020\u001eJ\u001a\u0010 \u001a\u0004\u0018\u00010\u001c2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0017J\u001a\u0010 \u001a\u0004\u0018\u00010\u001c2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u001eH\u0017R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n \u0012*\u0004\u0018\u00010\u00110\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/heytap/webview/extension/cache/WebExtCacheClient;", "Landroid/webkit/WebViewClient;", "()V", "cacheBean", "Lcom/heytap/webview/extension/cache/CacheBean;", "value", "", "cacheMacro", "getCacheMacro", "()Z", "setCacheMacro", "(Z)V", "hasInit", "isconfig", "mDbhelperforSearch", "Lcom/heytap/webview/extension/cache/CacheInfoDBHelper;", "srcUri", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "synObj", "Ljava/lang/Object;", "appointTargar", ParserTag.TAG_URI, "initCacheConfigContext", "", "context", "Landroid/content/Context;", "loadCacheData", "Landroid/webkit/WebResourceResponse;", "url", "", "matchConfigByUrl", "shouldInterceptRequest", "view", "Landroid/webkit/WebView;", "request", "Landroid/webkit/WebResourceRequest;", "lib_webcache_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WebExtCacheClient extends WebViewClient {

    @Nullable
    private static CacheBean cacheBean;
    private static boolean cacheMacro;
    private static boolean hasInit;
    private static CacheInfoDBHelper mDbhelperforSearch;

    @NotNull
    public static final WebExtCacheClient INSTANCE = new WebExtCacheClient();
    private static Uri srcUri = Uri.parse("");
    private static boolean isconfig = true;

    @NotNull
    private static Object synObj = new Object();

    private WebExtCacheClient() {
    }

    @CallSuper
    private final boolean appointTargar(Uri uri) {
        if (uri == null) {
            return false;
        }
        srcUri = uri;
        if (!hasInit) {
            return false;
        }
        String string = uri.toString();
        Intrinsics.checkNotNullExpressionValue(string, "srcUri.toString()");
        CacheBean cacheBeanMatchConfigByUrl = matchConfigByUrl(string);
        cacheBean = cacheBeanMatchConfigByUrl;
        if (cacheBeanMatchConfigByUrl == null) {
            isconfig = false;
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("cacheBean.uri = ");
        CacheBean cacheBean2 = cacheBean;
        Intrinsics.checkNotNull(cacheBean2);
        sb.append(cacheBean2.getUri());
        sb.append(" cacheBean.configId = ");
        CacheBean cacheBean3 = cacheBean;
        Intrinsics.checkNotNull(cacheBean3);
        sb.append(cacheBean3.getConfigId());
        sb.append("cacheBean.uriMD5 = ");
        CacheBean cacheBean4 = cacheBean;
        Intrinsics.checkNotNull(cacheBean4);
        sb.append(cacheBean4.getUriMD5());
        sb.append(" cacheBean.versionId = ");
        CacheBean cacheBean5 = cacheBean;
        Intrinsics.checkNotNull(cacheBean5);
        sb.append(cacheBean5.getVersionId());
        LogUtil.d(CacheConstants.Debug.MODEL_TAG, sb.toString());
        cacheBean = cacheBean;
        isconfig = true;
        return true;
    }

    private final WebResourceResponse loadCacheData(CacheBean cacheBean2, String url) {
        WebResourceResponse webResourceResponseInterceptRequest;
        if (!cacheMacro) {
            return null;
        }
        LogUtil.d(CacheConstants.Debug.MODEL_TAG, "request " + url);
        if (cacheBean2 == null || !isconfig) {
            LogUtil.d(CacheConstants.Debug.MODEL_TAG, "没有配置信息 ");
            return null;
        }
        LogUtil.d(CacheConstants.Debug.MODEL_TAG, "target uri " + cacheBean2.getUri());
        synchronized (synObj) {
            webResourceResponseInterceptRequest = WebExtCacheManager.INSTANCE.interceptRequest(cacheBean2, url);
        }
        return webResourceResponseInterceptRequest;
    }

    public final boolean getCacheMacro() {
        return cacheMacro;
    }

    public final void initCacheConfigContext(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        mDbhelperforSearch = new CacheInfoDBHelper(context, CacheConstants.Word.CACHECONFIGDATABASE);
        if (hasInit) {
            return;
        }
        WebExtCacheManager.INSTANCE.initManager(context);
        hasInit = true;
    }

    @Nullable
    public final CacheBean matchConfigByUrl(@NotNull String uri) {
        CacheBean cacheBeanQueryByUrl;
        Intrinsics.checkNotNullParameter(uri, "uri");
        synchronized (this) {
            CacheInfoDBHelper cacheInfoDBHelper = mDbhelperforSearch;
            if (cacheInfoDBHelper == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDbhelperforSearch");
                cacheInfoDBHelper = null;
            }
            cacheBeanQueryByUrl = cacheInfoDBHelper.queryByUrl(uri);
        }
        return cacheBeanQueryByUrl;
    }

    public final void setCacheMacro(boolean z) {
        if (!z || hasInit) {
            cacheMacro = z;
        }
    }

    @Override // android.webkit.WebViewClient
    @CallSuper
    @Nullable
    public WebResourceResponse shouldInterceptRequest(@NotNull WebView view, @NotNull String url) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        return URLUtil.isNetworkUrl(url) ? loadCacheData(url) : super.shouldInterceptRequest(view, url);
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(21)
    @CallSuper
    @Nullable
    public WebResourceResponse shouldInterceptRequest(@NotNull WebView view, @NotNull WebResourceRequest request) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        if (URLUtil.isNetworkUrl(request.getUrl().toString())) {
            String string = request.getUrl().toString();
            Intrinsics.checkNotNullExpressionValue(string, "request.url.toString()");
            return loadCacheData(string);
        }
        return super.shouldInterceptRequest(view, request);
    }

    @Nullable
    public final WebResourceResponse loadCacheData(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        appointTargar(Uri.parse(new URL(url).getHost()));
        return loadCacheData(cacheBean, url);
    }
}
