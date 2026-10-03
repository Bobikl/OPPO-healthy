package com.heytap.speech.engine.internal.data;

import com.heytap.speech.engine.constant.EngineConstant;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class Speak_JsonSerializer implements Serializable {
    public static JSONObject serialize(Speak speak) throws JSONException {
        if (speak == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("audioUrl", speak.getAudioUrl());
        jSONObject.put("speakUrl", speak.getSpeakUrl());
        jSONObject.put(EngineConstant.TTS_TYPE_SSML, speak.getSsml());
        jSONObject.put("text", speak.getText());
        jSONObject.put("type", speak.getType());
        return jSONObject;
    }
}
