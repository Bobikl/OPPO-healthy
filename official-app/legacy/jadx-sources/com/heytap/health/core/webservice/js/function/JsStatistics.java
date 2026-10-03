package com.heytap.health.core.webservice.js.function;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import androidx.annotation.Keep;
import com.heytap.health.base.track.a;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.pja;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
@pja(namespace = "NearMeStatistics")
@Keep
public class JsStatistics {
    private static final String TAG = "JsStatistics";

    @JavascriptInterface
    public void onCommon(String str, String str2, String str3) {
        JSONObject jSONObject;
        String.format("onCommon:\neventTag = %s\neventId = %s\nlogMap = %s", str, str2, str3);
        HashMap map = null;
        if (TextUtils.isEmpty(str3)) {
            jSONObject = null;
        } else {
            try {
                jSONObject = new JSONObject(str3);
            } catch (JSONException e2) {
                String.valueOf(e2);
                jSONObject = null;
            }
        }
        if (jSONObject != null) {
            map = new HashMap();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.optString(next));
            }
        }
        if (map != null) {
            a.G(str2, map);
        } else {
            a7b.b(TAG, "report value is null");
        }
    }
}
