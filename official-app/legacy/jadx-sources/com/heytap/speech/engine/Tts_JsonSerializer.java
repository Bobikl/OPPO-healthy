package com.heytap.speech.engine;

import com.heytap.speech.engine.protocol.directive.aicall.CallTextCard;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class Tts_JsonSerializer implements Serializable {
    public static JSONObject serialize(Tts tts) throws JSONException {
        if (tts == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("enable", tts.getEnable());
        jSONObject.put("speed", tts.getSpeed());
        jSONObject.put("test", tts.getTest());
        jSONObject.put("type", tts.getType());
        jSONObject.put("visible", tts.getVisible());
        jSONObject.put(CallTextCard.REQ_TYPE_VOICE, tts.getVoice());
        jSONObject.put(SpeechConstant.KEY_VOLUME, tts.getVolume());
        return jSONObject;
    }
}
