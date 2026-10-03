package com.heytap.speech.engine;

import java.io.Serializable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class Local_JsonParser implements Serializable {
    public static Local parse(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Local local = new Local();
        if (jSONObject.optString("type") != null && !jSONObject.optString("type").toString().equalsIgnoreCase("null")) {
            local.setType(jSONObject.optString("type"));
        }
        return local;
    }
}
