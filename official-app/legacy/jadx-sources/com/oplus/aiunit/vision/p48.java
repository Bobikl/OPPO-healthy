package com.oplus.aiunit.vision;

import com.heytap.webpro.executor.GetPreloadInfoExecutor;
import com.heytap.webpro.executor.GetStartTimeExecutor;
import com.heytap.webpro.executor.GetVisibleInfoExecutor;
import com.heytap.webpro.jsapi.JsApiRegister;

/* JADX INFO: loaded from: classes3.dex */
public final class p48 {
    public static final void a() {
        JsApiRegister jsApiRegister = JsApiRegister.INSTANCE;
        jsApiRegister.registerJsApiExecutor("vip.getVisibleInfo", GetVisibleInfoExecutor.class);
        jsApiRegister.registerJsApiExecutor("vip.getStartTime", GetStartTimeExecutor.class);
        jsApiRegister.registerJsApiExecutor("vip.getCacheData", GetPreloadInfoExecutor.class);
    }
}
