package com.heytap.speech.engine;

import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class Vad_JsonSerializer implements Serializable {
    public static JSONObject serialize(Vad vad) throws JSONException {
        if (vad == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("enable", vad.getEnable());
        jSONObject.put("pausetime", vad.getPausetime());
        jSONObject.put("timeout", vad.getTimeout());
        jSONObject.put("visible", vad.getVisible());
        return jSONObject;
    }
}
