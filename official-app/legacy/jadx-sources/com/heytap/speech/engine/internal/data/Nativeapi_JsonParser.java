package com.heytap.speech.engine.internal.data;

import com.heytap.store.business.rn.service.RnConstant;
import com.oplus.aiunit.vision.oea;
import java.io.Serializable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class Nativeapi_JsonParser implements Serializable {
    public static Nativeapi parse(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Nativeapi nativeapi = new Nativeapi();
        if (jSONObject.optString(oea.FEATURE_API_REQUEST) != null && !jSONObject.optString(oea.FEATURE_API_REQUEST).toString().equalsIgnoreCase("null")) {
            nativeapi.setApi(jSONObject.optString(oea.FEATURE_API_REQUEST));
        }
        nativeapi.setParam(Param_JsonParser.parse(jSONObject.optJSONObject(RnConstant.KEY_INIT_OPTIONS)));
        return nativeapi;
    }
}
