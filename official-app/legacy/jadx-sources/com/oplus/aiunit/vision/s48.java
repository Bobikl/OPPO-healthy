package com.oplus.aiunit.vision;

import com.oplus.web.container.comunication.jsapi.JsApiRegister;
import com.oplus.web.container.jsbridge.account.GetTokenExecutor;
import com.oplus.web.container.jsbridge.account.IsLoginExecutor;
import com.oplus.web.container.jsbridge.account.RefreshTokenExecutor;
import com.oplus.web.container.jsbridge.account.ShowLoginExecutor;

/* JADX INFO: loaded from: classes2.dex */
public final class s48 {
    public static final void a() {
        JsApiRegister.getInstance().registerJsApiExecutor("vip.isLogin", IsLoginExecutor.class);
        JsApiRegister.getInstance().registerJsApiExecutor("vip.getToken", GetTokenExecutor.class);
        JsApiRegister.getInstance().registerJsApiExecutor("account.refreshToken", RefreshTokenExecutor.class);
        JsApiRegister.getInstance().registerJsApiExecutor("vip.showLogin", ShowLoginExecutor.class);
    }
}
