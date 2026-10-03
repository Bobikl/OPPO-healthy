package com.heytap.speech.engine;

import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class Ui_JsonSerializer implements Serializable {
    public static JSONObject serialize(Ui ui) throws JSONException {
        if (ui == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", ui.getId());
        jSONObject.put("type", ui.getType());
        jSONObject.put("visible", ui.getVisible());
        return jSONObject;
    }
}
