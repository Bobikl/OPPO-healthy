package com.platform.account.oauth.web.web;

import android.os.Handler;
import android.os.Looper;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import androidx.annotation.Keep;
import androidx.fragment.app.Fragment;
import com.heytap.webview.extension.protocol.Const;
import com.heytap.webview.extension.protocol.ThemeConst;
import com.platform.account.oauth.web.bean.AcOauthH5EmptyResult;
import com.platform.account.oauth.web.bean.AcOauthH5JsResult;
import com.platform.account.oauth.web.executor.IJsExecutor;
import com.platform.account.oauth.web.util.AcOauthDarkUtil;
import com.platform.account.oauth.web.util.WebUaHelper;
import com.platform.usercenter.oauth.util.AcOauthLogUtil;
import java.util.HashMap;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class OAuthWebView extends WebView {
    private static final String TAG = "OAuthWebView";
    private HashMap<String, IJsExecutor> mExecutorMap;
    private Fragment mFragment;
    private Handler mHandler;

    /* JADX INFO: renamed from: com.platform.account.oauth.web.web.OAuthWebView$1, reason: invalid class name */
    public class AnonymousClass1 {
        public AnonymousClass1() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(IJsExecutor iJsExecutor, String str, String str2) {
            if (iJsExecutor != null) {
                iJsExecutor.execute(OAuthWebView.this.mFragment, str);
            }
            AcOauthH5JsResult acOauthH5JsResult = new AcOauthH5JsResult(0, "success!", new AcOauthH5EmptyResult());
            OAuthWebView.this.evaluateJavascript("window.HeytapJsApi.callback('" + str2 + "', " + acOauthH5JsResult + ");", null);
        }

        @JavascriptInterface
        @Keep
        public boolean invoke(String str, final String str2, final String str3) {
            AcOauthLogUtil.i(OAuthWebView.TAG, "method = " + str + " arguments = " + str2 + " callbackId = " + str3);
            if (OAuthWebView.this.mHandler == null) {
                AcOauthLogUtil.i(OAuthWebView.TAG, "Javascript call, but mHandler = null");
                return true;
            }
            final IJsExecutor iJsExecutor = (IJsExecutor) OAuthWebView.this.mExecutorMap.get(str);
            OAuthWebView.this.mHandler.post(new Runnable() { // from class: com.platform.account.oauth.web.web.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.b(iJsExecutor, str2, str3);
                }
            });
            if (iJsExecutor != null) {
                return true;
            }
            AcOauthLogUtil.e(OAuthWebView.TAG, "not support js: + " + str);
            return false;
        }
    }

    public OAuthWebView(Fragment fragment) {
        super(fragment.requireContext());
        this.mFragment = fragment;
        init();
    }

    private void init() {
        this.mExecutorMap = new HashMap<>();
        getSettings().setJavaScriptEnabled(true);
        getSettings().setCacheMode(2);
        getSettings().setAllowContentAccess(false);
        getSettings().setAllowFileAccess(false);
        getSettings().setAllowFileAccessFromFileURLs(false);
        getSettings().setAllowUniversalAccessFromFileURLs(false);
        getSettings().setTextZoom(100);
        getSettings().setDomStorageEnabled(true);
        getSettings().setUserAgentString(WebUaHelper.getUserAgent(getContext(), getSettings().getUserAgentString()));
        CookieManager.getInstance().setAcceptCookie(true);
        CookieManager.getInstance().setAcceptThirdPartyCookies(this, true);
        addJavascriptInterface(new AnonymousClass1(), Const.ObjectName.JS_API_OBJECT);
        addJavascriptInterface(new Object() { // from class: com.platform.account.oauth.web.web.OAuthWebView.2
            @JavascriptInterface
            @Keep
            public boolean isNight() {
                return AcOauthDarkUtil.isNightMode(OAuthWebView.this.getContext());
            }
        }, ThemeConst.ObjectName.JS_INTERFACE_THEME);
        this.mHandler = new Handler(Looper.getMainLooper());
    }

    public void setExecutor(IJsExecutor iJsExecutor) {
        HashMap<String, IJsExecutor> map = this.mExecutorMap;
        if (map != null && iJsExecutor != null) {
            map.put(iJsExecutor.getMethodName(), iJsExecutor);
            return;
        }
        AcOauthLogUtil.e(TAG, "setExecutor fail: mExecutorMap = " + this.mExecutorMap + " executor = " + iJsExecutor);
    }
}
