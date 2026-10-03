package com.platform.usercenter.bizuws;

import com.heytap.webpro.jsapi.JsApiRegister;
import com.platform.usercenter.bizuws.executor.dialog.ShowDialogExecutor;
import com.platform.usercenter.bizuws.executor.jump.OpenOapsUrlExecutor;
import com.platform.usercenter.bizuws.executor.jump.OpenWebViewExecutor;
import com.platform.usercenter.bizuws.executor.other.NavigationBarExecutor;
import com.platform.usercenter.bizuws.executor.other.RecoveryExecutor;

/* JADX INFO: loaded from: classes9.dex */
public final class GeneratedRegister {
    public static final void init() {
        JsApiRegister jsApiRegister = JsApiRegister.INSTANCE;
        jsApiRegister.registerJsApiExecutor("vip.recover", RecoveryExecutor.class);
        jsApiRegister.registerJsApiExecutor("vip.setNavigationBar", NavigationBarExecutor.class);
        jsApiRegister.registerJsApiExecutor("vip.showDialog", ShowDialogExecutor.class);
        jsApiRegister.registerJsApiExecutor("vip.openWebView", OpenWebViewExecutor.class);
        jsApiRegister.registerJsApiExecutor("vip.openOapsUrl", OpenOapsUrlExecutor.class);
    }
}
