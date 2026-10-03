package com.oplus.aiunit.vision;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public class nh {
    public static final int VIDEO_REQUEST = 17;
    public ValueCallback<Uri> a;
    public ValueCallback<Uri[]> b;

    public static final class b {
        public static final nh a = new nh();
    }

    public static nh a() {
        return b.a;
    }

    public boolean b(@Nullable WebView webView, WebChromeClient.FileChooserParams fileChooserParams, String str) {
        if ("video/kyc".equals(str)) {
            return true;
        }
        return fileChooserParams != null && fileChooserParams.getAcceptTypes() != null && fileChooserParams.getAcceptTypes().length > 0 && "video/kyc".equals(fileChooserParams.getAcceptTypes()[0]);
    }

    public boolean c(String str) {
        return true;
    }

    public final void d(Activity activity) {
        try {
            Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
            intent.putExtra("android.intent.extra.videoQuality", 1);
            intent.addFlags(1);
            intent.putExtra("android.intent.extras.CAMERA_FACING", 1);
            activity.startActivityForResult(intent, 17);
        } catch (Exception e2) {
            bn.b("WBH5FaceVerifySDK", "recordVideo:" + e2.getMessage());
        }
    }

    @TargetApi(21)
    public boolean e(WebView webView, ValueCallback<Uri[]> valueCallback, Activity activity, WebChromeClient.FileChooserParams fileChooserParams) {
        bn.b("WBH5FaceVerifySDK", "recordVideoForApi21 ~");
        if (!b(webView, fileChooserParams, null)) {
            return false;
        }
        h(valueCallback);
        d(activity);
        return true;
    }

    public boolean f(ValueCallback<Uri> valueCallback, String str, Activity activity) {
        if (!b(null, null, str)) {
            return false;
        }
        i(valueCallback);
        d(activity);
        return true;
    }

    public void g() {
        ValueCallback<Uri[]> valueCallback = this.b;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(null);
        }
        ValueCallback<Uri> valueCallback2 = this.a;
        if (valueCallback2 != null) {
            valueCallback2.onReceiveValue(null);
        }
    }

    public void h(ValueCallback<Uri[]> valueCallback) {
        this.b = valueCallback;
    }

    public void i(ValueCallback<Uri> valueCallback) {
        this.a = valueCallback;
    }

    public void j(WebView webView, Context context) {
        if (webView == null) {
            return;
        }
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        settings.setUseWideViewPort(true);
        settings.setSupportMultipleWindows(true);
        settings.setLoadWithOverviewMode(true);
        settings.setDatabaseEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabasePath(context.getDir("databases", 0).getPath());
        settings.setPluginState(WebSettings.PluginState.ON_DEMAND);
        settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        webView.removeJavascriptInterface("searchBoxJavaBridge_");
        settings.setUserAgentString(settings.getUserAgentString() + ";kyc/h5face;kyc/2.0");
        settings.setMediaPlaybackRequiresUserGesture(false);
    }

    public nh() {
    }
}
