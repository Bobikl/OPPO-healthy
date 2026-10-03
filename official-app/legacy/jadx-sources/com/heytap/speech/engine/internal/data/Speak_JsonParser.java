package com.heytap.speech.engine.internal.data;

import com.heytap.speech.engine.constant.EngineConstant;
import java.io.Serializable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class Speak_JsonParser implements Serializable {
    public static Speak parse(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Speak speak = new Speak();
        if (jSONObject.optString("audioUrl") != null && !jSONObject.optString("audioUrl").toString().equalsIgnoreCase("null")) {
            speak.setAudioUrl(jSONObject.optString("audioUrl"));
        }
        if (jSONObject.optString("speakUrl") != null && !jSONObject.optString("speakUrl").toString().equalsIgnoreCase("null")) {
            speak.setSpeakUrl(jSONObject.optString("speakUrl"));
        }
        if (jSONObject.optString(EngineConstant.TTS_TYPE_SSML) != null && !jSONObject.optString(EngineConstant.TTS_TYPE_SSML).toString().equalsIgnoreCase("null")) {
            speak.setSsml(jSONObject.optString(EngineConstant.TTS_TYPE_SSML));
        }
        if (jSONObject.optString("text") != null && !jSONObject.optString("text").toString().equalsIgnoreCase("null")) {
            speak.setText(jSONObject.optString("text"));
        }
        if (jSONObject.optString("type") != null && !jSONObject.optString("type").toString().equalsIgnoreCase("null")) {
            speak.setType(jSONObject.optString("type"));
        }
        return speak;
    }
}
