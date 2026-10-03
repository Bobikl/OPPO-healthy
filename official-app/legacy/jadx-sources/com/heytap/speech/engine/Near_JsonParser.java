package com.heytap.speech.engine;

import java.io.Serializable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class Near_JsonParser implements Serializable {
    public static Near parse(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Near near = new Near();
        near.setEnable(jSONObject.optBoolean("enable", near.getEnable()));
        near.setModule(Module_JsonParser.parse(jSONObject.optJSONObject("module")));
        near.setWakeup(Wakeup_JsonParser.parse(jSONObject.optJSONObject("wakeup")));
        return near;
    }
}
