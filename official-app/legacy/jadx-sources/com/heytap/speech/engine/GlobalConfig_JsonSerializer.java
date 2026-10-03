package com.heytap.speech.engine;

import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class GlobalConfig_JsonSerializer implements Serializable {
    public static JSONObject serialize(GlobalConfig globalConfig) throws JSONException {
        if (globalConfig == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("asr", Asr_JsonSerializer.serialize(globalConfig.getAsr()));
        jSONObject.put("dm", Dm_JsonSerializer.serialize(globalConfig.getDm()));
        jSONObject.put("module", Module_JsonSerializer.serialize(globalConfig.getModule()));
        jSONObject.put("pickup", Pickup_JsonSerializer.serialize(globalConfig.getPickup()));
        jSONObject.put("tts", Tts_JsonSerializer.serialize(globalConfig.getTts()));
        jSONObject.put("vad", Vad_JsonSerializer.serialize(globalConfig.getVad()));
        jSONObject.put("wakeup", Wakeup_JsonSerializer.serialize(globalConfig.getWakeup()));
        return jSONObject;
    }
}
