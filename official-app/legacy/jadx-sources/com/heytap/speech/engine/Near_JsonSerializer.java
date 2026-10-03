package com.heytap.speech.engine;

import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class Near_JsonSerializer implements Serializable {
    public static JSONObject serialize(Near near) throws JSONException {
        if (near == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("enable", near.getEnable());
        jSONObject.put("module", Module_JsonSerializer.serialize(near.getModule()));
        jSONObject.put("wakeup", Wakeup_JsonSerializer.serialize(near.getWakeup()));
        return jSONObject;
    }
}
