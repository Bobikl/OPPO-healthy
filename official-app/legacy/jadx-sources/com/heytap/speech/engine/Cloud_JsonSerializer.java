package com.heytap.speech.engine;

import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class Cloud_JsonSerializer implements Serializable {
    public static JSONObject serialize(Cloud cloud) throws JSONException {
        if (cloud == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", cloud.getType());
        return jSONObject;
    }
}
