package com.heytap.speech.engine;

import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class Far_JsonSerializer implements Serializable {
    public static JSONObject serialize(Far far) throws JSONException {
        if (far == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("enable", far.getEnable());
        jSONObject.put("module", Module_JsonSerializer.serialize(far.getModule()));
        jSONObject.put("wakeup", Wakeup_JsonSerializer.serialize(far.getWakeup()));
        return jSONObject;
    }
}
