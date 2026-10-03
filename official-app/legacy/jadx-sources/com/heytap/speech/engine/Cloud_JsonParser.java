package com.heytap.speech.engine;

import java.io.Serializable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class Cloud_JsonParser implements Serializable {
    public static Cloud parse(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Cloud cloud = new Cloud();
        if (jSONObject.optString("type") != null && !jSONObject.optString("type").toString().equalsIgnoreCase("null")) {
            cloud.setType(jSONObject.optString("type"));
        }
        return cloud;
    }
}
