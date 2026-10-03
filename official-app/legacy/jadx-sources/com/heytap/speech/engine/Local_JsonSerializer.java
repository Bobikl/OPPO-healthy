package com.heytap.speech.engine;

import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class Local_JsonSerializer implements Serializable {
    public static JSONObject serialize(Local local) throws JSONException {
        if (local == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", local.getType());
        return jSONObject;
    }
}
