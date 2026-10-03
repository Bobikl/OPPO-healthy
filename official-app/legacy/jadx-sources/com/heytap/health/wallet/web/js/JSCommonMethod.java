package com.heytap.health.wallet.web.js;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.heytap.health.wallet.jsbridge.JSBridgeInterface;
import com.heytap.health.wallet.jsbridge.JsCallback;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.drk;
import com.oplus.aiunit.vision.qe0;
import com.oplus.aiunit.vision.t6b;
import com.oplus.pantanal.seedling.constants.TraceConstants;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class JSCommonMethod {
    private static final String TAG = "JSCommonMethod";

    @JSBridgeInterface
    public static void onPackageInstalled(JSONObject jSONObject, JsCallback jsCallback) {
        if (jSONObject == null) {
            JsCallback.invokeJsCallback(jsCallback, false, null, null);
            return;
        }
        String strOptString = jSONObject.optString("packageName");
        t6b.b(TAG, "onPackageInstalled package = " + strOptString);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("packageNameArray");
        JSONObject jSONObject2 = new JSONObject();
        try {
            if (!TextUtils.isEmpty(strOptString)) {
                jSONObject2.put("versionCode", qe0.i(b78.a(), strOptString));
                jSONObject2.put(strOptString, strOptString);
                JsCallback.invokeJsCallback(jsCallback, true, jSONObject2, null);
            } else {
                if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
                    JsCallback.invokeJsCallback(jsCallback, false, null, "packageName and packageNameArray should not be null both");
                    return;
                }
                HashMap map = new HashMap();
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    String strOptString2 = jSONArrayOptJSONArray.optString(i);
                    map.put(strOptString2, Integer.valueOf(qe0.i(b78.a(), strOptString2)));
                }
                jSONObject2.put("packageNameArray", new JSONObject(map));
                JsCallback.invokeJsCallback(jsCallback, true, jSONObject2, null);
            }
        } catch (JSONException e2) {
            t6b.d(TAG, e2.getLocalizedMessage());
            JsCallback.invokeJsCallback(jsCallback, false, null, null);
        }
    }

    @JSBridgeInterface
    public static void openAppByPackageName(JSONObject jSONObject, JsCallback jsCallback) {
        String strOptString = jSONObject.optString(TraceConstants.KEY_PKG_NAME);
        t6b.b(TAG, "openAppByPackageName package = " + strOptString);
        if (drk.d(strOptString)) {
            JsCallback.invokeJsCallback(jsCallback, false, new JSONObject(), "data is null");
            return;
        }
        try {
            Intent launchIntentForPackage = b78.a().getPackageManager().getLaunchIntentForPackage(strOptString);
            if (launchIntentForPackage == null) {
                JsCallback.invokeJsCallback(jsCallback, false, new JSONObject(), "application no installed");
            } else {
                launchIntentForPackage.setPackage("");
                launchIntentForPackage.setFlags(268959744);
                b78.a().startActivity(launchIntentForPackage);
                JsCallback.invokeJsCallback(jsCallback, true, new JSONObject(), "");
            }
        } catch (Exception e2) {
            JsCallback.invokeJsCallback(jsCallback, false, new JSONObject(), e2.getLocalizedMessage());
        }
    }
}
