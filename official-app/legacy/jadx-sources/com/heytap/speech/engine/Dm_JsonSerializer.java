package com.heytap.speech.engine;

import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class Dm_JsonSerializer implements Serializable {
    public static JSONObject serialize(Dm dm) throws JSONException {
        if (dm == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("enable", dm.getEnable());
        jSONObject.put("errorHandle", ErrorHandle_JsonSerializer.serialize(dm.getErrorHandle()));
        jSONObject.put("globalExit", GlobalExit_JsonSerializer.serialize(dm.getGlobalExit()));
        jSONObject.put("oneShot", OneShot_JsonSerializer.serialize(dm.getOneShot()));
        return jSONObject;
    }
}
