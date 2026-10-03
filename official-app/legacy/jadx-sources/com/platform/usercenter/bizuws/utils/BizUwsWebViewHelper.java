package com.platform.usercenter.bizuws.utils;

import android.content.Context;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.oplus.aiunit.vision.onl;
import com.platform.usercenter.tools.log.UCLogUtil;
import com.platform.usercenter.tools.os.UCRuntimeEnvironment;
import com.platform.usercenter.uws.util.UwsNoNetworkUtil;
import com.platform.usercenter.uws.view.UwsCheckWebView;
import com.sensorsdata.analytics.android.sdk.jsbridge.JSHookAop;

/* JADX INFO: loaded from: classes9.dex */
public class BizUwsWebViewHelper {
    public static void checkAndLoadUrl(@NonNull WebView webView, String str, int i, UwsCheckWebView.NetCheckWebViewClient netCheckWebViewClient) {
        Context context = webView.getContext();
        if (!UCRuntimeEnvironment.sIsExp && !onl.i()) {
            webView.loadUrl(str);
            JSHookAop.loadUrl(webView, str);
            return;
        }
        if (UwsNoNetworkUtil.isConnectNet(context)) {
            webView.loadUrl(str);
            JSHookAop.loadUrl(webView, str);
            return;
        }
        int deviceNetStatus = BizUwsNetUtils.getDeviceNetStatus(context);
        UCLogUtil.d("checkTimeout fail errorCode = " + deviceNetStatus + " , msg = " + UwsNoNetworkUtil.getNetStatusMessage(context, deviceNetStatus));
        netCheckWebViewClient.onReceiveNetError(deviceNetStatus, str);
    }
}
