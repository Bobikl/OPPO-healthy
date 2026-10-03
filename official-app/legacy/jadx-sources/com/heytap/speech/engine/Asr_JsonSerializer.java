package com.heytap.speech.engine;

import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class Asr_JsonSerializer implements Serializable {
    public static JSONObject serialize(Asr asr) throws JSONException {
        if (asr == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("cloud", Cloud_JsonSerializer.serialize(asr.getCloud()));
        jSONObject.put("enable", asr.getEnable());
        jSONObject.put("local", Local_JsonSerializer.serialize(asr.getLocal()));
        jSONObject.put("visible", asr.getVisible());
        return jSONObject;
    }
}
