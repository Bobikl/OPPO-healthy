package com.heytap.speech.engine;

import java.io.Serializable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class Far_JsonParser implements Serializable {
    public static Far parse(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Far far = new Far();
        try {
            if (!jSONObject.has("enable") || jSONObject.get("enable") == null || jSONObject.get("enable").toString().equalsIgnoreCase("null")) {
                far.setEnable(null);
            } else {
                far.setEnable(Boolean.valueOf(jSONObject.optBoolean("enable")));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        far.setModule(Module_JsonParser.parse(jSONObject.optJSONObject("module")));
        far.setWakeup(Wakeup_JsonParser.parse(jSONObject.optJSONObject("wakeup")));
        return far;
    }
}
