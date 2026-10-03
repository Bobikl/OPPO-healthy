package com.heytap.speech.engine.internal.data;

import com.heytap.store.business.rn.service.RnConstant;
import com.oplus.aiunit.vision.oea;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class Nativeapi_JsonSerializer implements Serializable {
    public static JSONObject serialize(Nativeapi nativeapi) throws JSONException {
        if (nativeapi == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(oea.FEATURE_API_REQUEST, nativeapi.getApi());
        jSONObject.put(RnConstant.KEY_INIT_OPTIONS, Param_JsonSerializer.serialize(nativeapi.getParam()));
        return jSONObject;
    }
}
