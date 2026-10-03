package com.heytap.speech.engine;

import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class OneShot_JsonSerializer implements Serializable {
    public static JSONObject serialize(OneShot oneShot) throws JSONException {
        if (oneShot == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("enable", oneShot.getEnable());
        jSONObject.put("visible", oneShot.getVisible());
        return jSONObject;
    }
}
