package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.heytap.webview.extension.jsapi.IJsApiCallback;
import com.heytap.webview.extension.jsapi.IJsApiFragmentInterface;
import com.heytap.webview.extension.jsapi.JsApiObject;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class nue implements bq9 {
    @Override // com.oplus.aiunit.vision.bq9
    public void a(IJsApiFragmentInterface iJsApiFragmentInterface, JsApiObject jsApiObject, IJsApiCallback iJsApiCallback, String str) {
        String string = jsApiObject.getString("log", "");
        if (TextUtils.isEmpty(string)) {
            iJsApiCallback.fail(3, "param log is empty");
        } else {
            b(string, str);
            iJsApiCallback.success(new JSONObject());
        }
    }

    public final void b(String str, String str2) {
        bn.f("PrintLogImpl", str2 + ", " + str);
    }
}
