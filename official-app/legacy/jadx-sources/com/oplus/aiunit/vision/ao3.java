package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.heytap.webview.extension.activity.FragmentStyle;
import com.heytap.webview.extension.activity.WebExtRouter;
import com.heytap.webview.extension.jsapi.IJsApiCallback;
import com.heytap.webview.extension.jsapi.IJsApiFragmentInterface;
import com.heytap.webview.extension.jsapi.JsApiObject;
import com.heytap.webview.extension.protocol.Const;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class ao3 implements bq9 {
    @Override // com.oplus.aiunit.vision.bq9
    public void a(IJsApiFragmentInterface iJsApiFragmentInterface, JsApiObject jsApiObject, IJsApiCallback iJsApiCallback, String str) {
        String string = jsApiObject.getString("url");
        if (TextUtils.isEmpty(string)) {
            bn.c("CommonOpenImpl", str + ", url is empty");
            iJsApiCallback.fail(2, "url is empty");
            return;
        }
        Uri uri = Uri.parse(string);
        String string2 = jsApiObject.getString(Const.Arguments.Open.STYLE, "default");
        if (b(uri) && !FragmentStyle.BROWSER.equals(string2)) {
            new WebExtRouter().setUri(uri).setStyle(string2).addExt(d(jsApiObject.getJsonObject())).startUrl(iJsApiFragmentInterface.getActivity());
            iJsApiCallback.success(new JSONObject());
        } else {
            if (c(iJsApiFragmentInterface.getActivity(), uri, str)) {
                iJsApiCallback.success(new JSONObject());
                return;
            }
            bn.c("CommonOpenImpl", str + ", unsupported operation");
            iJsApiCallback.fail(1, Const.JsApiResponse.UnsupportedOperation.MESSAGE);
        }
    }

    public final boolean b(Uri uri) {
        if (uri == null) {
            return false;
        }
        return URLUtil.isNetworkUrl(uri.toString()) || URLUtil.isFileUrl(uri.toString());
    }

    public final boolean c(Context context, Uri uri, String str) {
        if (uri == null) {
            return false;
        }
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", uri));
            return true;
        } catch (Exception e2) {
            bn.c("CommonOpenImpl", str + ", " + e2.getMessage());
            return false;
        }
    }

    public final Bundle d(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            bundle.putString(next, jSONObject.optString(next));
        }
        return bundle;
    }
}
