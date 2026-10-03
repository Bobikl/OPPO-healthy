package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import com.oplus.web.container.comunication.jsapi.JsApiRegister;
import com.oplus.web.container.comunication.jsapi.JsApiResponse;
import com.oplus.web.container.safe.model.HostSecurityLevel;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public abstract class d61 implements ws9 {
    public final String a;

    @NonNull
    public final String b;

    public d61(@NonNull String str, @NonNull String str2) {
        this.a = str;
        this.b = str2;
    }

    public HostSecurityLevel b(us9 us9Var) {
        ttg ttgVar = (ttg) JsApiRegister.getInstance().getJsApiExecutor(this.a + d14.POINT_REGEX + this.b).getAnnotation(ttg.class);
        return ttgVar != null ? ttgVar.level() : HostSecurityLevel.NONE;
    }

    public void c(rs9 rs9Var) {
        e(rs9Var, "failed");
    }

    public void d(rs9 rs9Var, int i, String str) {
        JsApiResponse.invokeFailed(rs9Var, i, str);
    }

    public void e(rs9 rs9Var, String str) {
        d(rs9Var, 5999, str);
    }

    public void f(rs9 rs9Var, @NonNull JSONObject jSONObject) {
        rs9Var.success(jSONObject);
    }

    @Override // com.oplus.aiunit.vision.ws9
    @NonNull
    public String getJsApiMethod() {
        return this.b;
    }

    @Override // com.oplus.aiunit.vision.ws9
    @NonNull
    public String getJsApiProduct() {
        return this.a;
    }
}
