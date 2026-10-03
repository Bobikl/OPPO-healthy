package com.heytap.speech.engine;

import com.heytap.speech.engine.protocol.directive.aicall.CallTextCard;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import java.io.Serializable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class Tts_JsonParser implements Serializable {
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0042 -> B:66:0x0045). Please report as a decompilation issue!!! */
    public static Tts parse(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Tts tts = new Tts();
        try {
            if (!jSONObject.has("enable") || jSONObject.get("enable") == null || jSONObject.get("enable").toString().equalsIgnoreCase("null")) {
                tts.setEnable(null);
            } else {
                tts.setEnable(Boolean.valueOf(jSONObject.optBoolean("enable")));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        try {
            if (!jSONObject.has("speed") || jSONObject.get("speed") == null || jSONObject.get("speed").toString().equalsIgnoreCase("null")) {
                tts.setSpeed(null);
            } else {
                tts.setSpeed(Double.valueOf(jSONObject.optDouble("speed")));
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        if (jSONObject.optString("test") != null && !jSONObject.optString("test").toString().equalsIgnoreCase("null")) {
            tts.setTest(jSONObject.optString("test"));
        }
        if (jSONObject.optString("type") != null && !jSONObject.optString("type").toString().equalsIgnoreCase("null")) {
            tts.setType(jSONObject.optString("type"));
        }
        try {
            if (!jSONObject.has("visible") || jSONObject.get("visible") == null || jSONObject.get("visible").toString().equalsIgnoreCase("null")) {
                tts.setVisible(null);
            } else {
                tts.setVisible(Boolean.valueOf(jSONObject.optBoolean("visible")));
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        if (jSONObject.optString(CallTextCard.REQ_TYPE_VOICE) != null && !jSONObject.optString(CallTextCard.REQ_TYPE_VOICE).toString().equalsIgnoreCase("null")) {
            tts.setVoice(jSONObject.optString(CallTextCard.REQ_TYPE_VOICE));
        }
        try {
            if (!jSONObject.has(SpeechConstant.KEY_VOLUME) || jSONObject.get(SpeechConstant.KEY_VOLUME) == null || jSONObject.get(SpeechConstant.KEY_VOLUME).toString().equalsIgnoreCase("null")) {
                tts.setVolume(null);
            } else {
                tts.setVolume(Integer.valueOf(jSONObject.optInt(SpeechConstant.KEY_VOLUME)));
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        return tts;
    }
}
