package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import com.oplus.web.container.comunication.jsapi.JsApiRegister;
import com.oplus.web.container.comunication.jsapi.JsApiResponse;
import com.oplus.web.container.safe.model.HostSecurityLevel;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class p51 implements qr9 {
    public final String a;

    @NonNull
    public final String b;

    public p51(@NonNull String str, @NonNull String str2) {
        this.a = str;
        this.b = str2;
    }

    public HostSecurityLevel b(or9 or9Var) {
        dqg dqgVar = (dqg) JsApiRegister.getInstance().getJsApiExecutor(this.a + "." + this.b).getAnnotation(dqg.class);
        return dqgVar != null ? dqgVar.level() : HostSecurityLevel.NONE;
    }

    public void c(lr9 lr9Var) {
        e(lr9Var, com.alipay.sdk.m.u.h.i);
    }

    public void d(lr9 lr9Var, int i, String str) {
        JsApiResponse.invokeFailed(lr9Var, i, str);
    }

    public void e(lr9 lr9Var, String str) {
        d(lr9Var, 5999, str);
    }

    public void f(lr9 lr9Var, @NonNull JSONObject jSONObject) {
        lr9Var.success(jSONObject);
    }

    @Override // com.oplus.aiunit.vision.qr9
    @NonNull
    public String getJsApiMethod() {
        return this.b;
    }

    @Override // com.oplus.aiunit.vision.qr9
    @NonNull
    public String getJsApiProduct() {
        return this.a;
    }
}
