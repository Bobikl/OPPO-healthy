package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import com.heytap.webview.extension.jsapi.IJsApiCallback;
import com.heytap.webview.extension.jsapi.IJsApiFragmentInterface;
import com.heytap.webview.extension.jsapi.JsApiObject;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class ueb implements bq9 {
    @Override // com.oplus.aiunit.vision.bq9
    public void a(IJsApiFragmentInterface iJsApiFragmentInterface, JsApiObject jsApiObject, IJsApiCallback iJsApiCallback, String str) {
        b(iJsApiFragmentInterface.getActivity(), jsApiObject.getString("content"));
        iJsApiCallback.success(new JSONObject());
    }

    public final void b(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Toast.makeText(context.getApplicationContext(), str, 0).show();
    }
}
