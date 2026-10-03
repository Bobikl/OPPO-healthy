package com.oplus.aiunit.vision;

import com.oplus.pay.opensdk.web.jsapi.CheckAppInstallExecute;
import com.oplus.pay.opensdk.web.jsapi.DownloadChannelAppExecute;
import com.oplus.pay.opensdk.web.jsapi.NotifyPayResultExecute;
import com.oplus.web.container.comunication.jsapi.JsApiRegister;

/* JADX INFO: loaded from: classes8.dex */
public final class q48 {
    public static final void a() {
        JsApiRegister.getInstance().registerJsApiExecutor("pay.NotifyPayResult", NotifyPayResultExecute.class);
        JsApiRegister.getInstance().registerJsApiExecutor("pay.setClientStatusBar", bwg.class);
        JsApiRegister.getInstance().registerJsApiExecutor("pay.DownloadChannelApp", DownloadChannelAppExecute.class);
        JsApiRegister.getInstance().registerJsApiExecutor("pay.CheckAppInstall", CheckAppInstallExecute.class);
    }
}
