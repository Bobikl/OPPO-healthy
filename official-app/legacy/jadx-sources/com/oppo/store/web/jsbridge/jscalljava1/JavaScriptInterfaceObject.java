package com.oppo.store.web.jsbridge.jscalljava1;

import android.app.Activity;
import android.os.Message;
import android.webkit.JavascriptInterface;
import com.heytap.store.base.core.util.WeakActivityHandler;
import com.oppo.store.web.jsbridge.jscalljava.JsCallJavaMessageHandler;

/* JADX INFO: loaded from: classes9.dex */
public final class JavaScriptInterfaceObject {
    private String currentUrl;
    private JsCallJavaMessageHandler jsCallJavaMessageHandler;

    public JavaScriptInterfaceObject(JsCallJavaMessageHandler jsCallJavaMessageHandler) {
        this.jsCallJavaMessageHandler = jsCallJavaMessageHandler;
    }

    @JavascriptInterface
    public void analyzeInnerLink(String str) {
        JsCallJavaMessageHandler jsCallJavaMessageHandler = this.jsCallJavaMessageHandler;
        if (jsCallJavaMessageHandler == null || jsCallJavaMessageHandler.checkNotSafe()) {
            return;
        }
        WeakActivityHandler<Activity> weakHandler = this.jsCallJavaMessageHandler.getWeakHandler();
        Message messageObtainMessage = weakHandler.obtainMessage();
        messageObtainMessage.what = 0;
        messageObtainMessage.obj = str;
        weakHandler.sendMessage(messageObtainMessage);
    }

    public void setCurrentUrl(String str) {
        this.currentUrl = str;
    }
}
