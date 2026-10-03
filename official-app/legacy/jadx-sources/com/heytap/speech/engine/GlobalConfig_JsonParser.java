package com.heytap.speech.engine;

import java.io.Serializable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class GlobalConfig_JsonParser implements Serializable {
    public static GlobalConfig parse(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        GlobalConfig globalConfig = new GlobalConfig();
        globalConfig.setAsr(Asr_JsonParser.parse(jSONObject.optJSONObject("asr")));
        globalConfig.setDm(Dm_JsonParser.parse(jSONObject.optJSONObject("dm")));
        globalConfig.setModule(Module_JsonParser.parse(jSONObject.optJSONObject("module")));
        globalConfig.setPickup(Pickup_JsonParser.parse(jSONObject.optJSONObject("pickup")));
        globalConfig.setTts(Tts_JsonParser.parse(jSONObject.optJSONObject("tts")));
        globalConfig.setVad(Vad_JsonParser.parse(jSONObject.optJSONObject("vad")));
        globalConfig.setWakeup(Wakeup_JsonParser.parse(jSONObject.optJSONObject("wakeup")));
        return globalConfig;
    }
}
