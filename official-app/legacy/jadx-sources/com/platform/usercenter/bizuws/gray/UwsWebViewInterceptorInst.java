package com.platform.usercenter.bizuws.gray;

import android.annotation.TargetApi;
import android.content.Context;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.platform.usercenter.BaseApp;

/* JADX INFO: loaded from: classes9.dex */
public class UwsWebViewInterceptorInst {
    private final UwsWebViewGrayInterceptor mInterceptor;

    public static class SingletonHolder {
        private static final UwsWebViewInterceptorInst INSTANCE = new UwsWebViewInterceptorInst();

        private SingletonHolder() {
        }
    }

    public static UwsWebViewInterceptorInst getInstance() {
        return SingletonHolder.INSTANCE;
    }

    @TargetApi(21)
    public WebResourceResponse interceptRequest(Context context, WebResourceRequest webResourceRequest) {
        return this.mInterceptor.grayInterceptRequest(webResourceRequest);
    }

    private UwsWebViewInterceptorInst() {
        this.mInterceptor = new UwsWebViewGrayInterceptor.Builder(BaseApp.mContext).build();
    }

    public WebResourceResponse interceptRequest(Context context, String str) {
        return this.mInterceptor.grayInterceptRequest(str);
    }
}
