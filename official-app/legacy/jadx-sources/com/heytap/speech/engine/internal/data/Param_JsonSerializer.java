package com.heytap.speech.engine.internal.data;

import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class Param_JsonSerializer implements Serializable {
    public static JSONObject serialize(Param param) throws JSONException {
        if (param == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("intentName", param.getIntentName());
        jSONObject.put("nlu", param.getNlu());
        jSONObject.put("skillId", param.getSkillId());
        jSONObject.put("pinyin", param.getPinyin());
        jSONObject.put("duiWidget", param.getDuiWidget());
        jSONObject.put("channel", param.getChannel());
        jSONObject.put("data", param.getData());
        jSONObject.put("script", param.getScript());
        return jSONObject;
    }
}
