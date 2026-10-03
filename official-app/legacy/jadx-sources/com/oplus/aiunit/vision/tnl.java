package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.URLUtil;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.MutableLiveData;
import com.heytap.webpro.core.CheckWebView;
import com.heytap.webpro.core.WebProFragment;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class tnl extends WebViewClient {
    private static final String IS_HTML = ".html";
    private static final String TAG = "BaseWebViewClient";
    private MutableLiveData<JSONObject> mCacheData;
    private final WebProFragment mFragment;
    private MutableLiveData<Boolean> mParallel;
    private wre mPreloadInterface;

    public tnl(@NonNull WebProFragment webProFragment) {
        this.mFragment = webProFragment;
    }

    public boolean handleDeeplink(WebView webView, @Nullable String str, Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        try {
            intent.setAction("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            webView.getContext().startActivity(intent);
            return true;
        } catch (Exception e2) {
            q7b.f(TAG, "handleDeeplink start activity failed!", e2);
            return false;
        }
    }

    public WebResourceResponse interceptRequest(@NonNull WebView webView, @NonNull WebResourceRequest webResourceRequest) {
        return interceptRequest(webView, webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    public void onPageCommitVisible(@NonNull WebView webView, @NonNull String str) {
        super.onPageCommitVisible(webView, str);
        q7b.c(TAG, "onPageCommitVisible url: %s", str);
        this.mFragment.onPageCommitVisible();
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(@NonNull WebView webView, @NonNull String str) {
        super.onPageFinished(webView, str);
        q7b.c(TAG, "onPageFinished url: %s", str);
        this.mFragment.onPageFinished();
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(@NonNull WebView webView, @NonNull String str, @Nullable Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        if (webView instanceof CheckWebView) {
            ((CheckWebView) webView).setCurShowUrl(webView.getUrl());
        }
        q7b.c(TAG, "onPageStarted url: %s", str);
        this.mFragment.onPageStarted();
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(@NonNull WebView webView, int i, @NonNull String str, @NonNull String str2) {
        super.onReceivedError(webView, i, str, str2);
        q7b.c(TAG, "onReceivedError failingUrl: %s", str2);
        onl.f().b(this.mFragment, i, str);
        this.mFragment.onReceivedError(i, str);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(@NonNull WebView webView, @NonNull SslErrorHandler sslErrorHandler, @NonNull SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        q7b.c(TAG, "onReceivedSslError error: %s", sslError);
        onl.f().a(this.mFragment, sslError);
        this.mFragment.onReceivedSslError(sslErrorHandler, sslError);
    }

    public void preloadRequest(String str) {
        if (str == null || this.mCacheData == null) {
            return;
        }
        boolean zC = tse.c(str);
        q7b.c(TAG, "preloadRequest url=%s, isPreload=%s", str, Boolean.valueOf(zC));
        if (zC) {
            tse.e(this.mCacheData, str);
        }
        MutableLiveData<Boolean> mutableLiveData = this.mParallel;
        if (mutableLiveData != null) {
            mutableLiveData.postValue(Boolean.valueOf(zC));
        }
    }

    public void setCacheData(MutableLiveData<JSONObject> mutableLiveData) {
        this.mCacheData = mutableLiveData;
    }

    public void setParallel(MutableLiveData<Boolean> mutableLiveData) {
        this.mParallel = mutableLiveData;
    }

    public void setPreloadInterface(wre wreVar) {
        this.mPreloadInterface = wreVar;
    }

    @Override // android.webkit.WebViewClient
    @Nullable
    public WebResourceResponse shouldInterceptRequest(@NonNull WebView webView, @NonNull WebResourceRequest webResourceRequest) {
        WebResourceResponse webResourceResponseInterceptRequest = interceptRequest(webView, webResourceRequest);
        return webResourceResponseInterceptRequest != null ? webResourceResponseInterceptRequest : super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(@NonNull WebView webView, @Nullable String str) {
        Context context = webView.getContext();
        if (str != null && str.startsWith("tel:")) {
            try {
                context.startActivity(new Intent("android.intent.action.DIAL", Uri.parse(str)));
            } catch (Exception e2) {
                q7b.f(TAG, "shouldOverrideUrlLoading start activity failed! ", e2);
            }
            return true;
        }
        if (!URLUtil.isNetworkUrl(str) && handleDeeplink(webView, str, Uri.parse(str))) {
            return true;
        }
        preloadRequest(str);
        return (str == null || webView.getUrl() == null || TextUtils.equals(str, webView.getUrl())) ? super.shouldOverrideUrlLoading(webView, str) : onl.h().a(this.mFragment, Uri.parse(str), Uri.parse(webView.getUrl()));
    }

    public WebResourceResponse interceptRequest(@NonNull WebView webView, @NonNull String str) {
        q7b.a(TAG, "interceptRequest start");
        rse rseVarB = tse.b(str);
        WebResourceResponse webResourceResponseC = rseVarB.c();
        boolean z = webResourceResponseC != null;
        wre wreVar = this.mPreloadInterface;
        if (wreVar != null) {
            wreVar.a(z);
        }
        if (z) {
            q7b.c(TAG, "interceptRequest success! url: %s", str);
            return webResourceResponseC;
        }
        q7b.o(TAG, "interceptRequest failed! code: %s, msg: %s, url: %s.", Integer.valueOf(rseVarB.a()), rseVarB.b(), str);
        return null;
    }

    @Override // android.webkit.WebViewClient
    @Nullable
    public WebResourceResponse shouldInterceptRequest(@NonNull WebView webView, @NonNull String str) {
        WebResourceResponse webResourceResponseInterceptRequest = interceptRequest(webView, str);
        return webResourceResponseInterceptRequest != null ? webResourceResponseInterceptRequest : super.shouldInterceptRequest(webView, str);
    }
}
