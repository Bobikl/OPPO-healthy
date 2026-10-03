package com.heytap.speech.engine.nodes;

import com.heytap.speech.engine.constant.EngineConstant;
import com.heytap.speech.engine.internal.data.InternalError;
import com.heytap.speech.engine.internal.data.InternalError_JsonParser;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import java.io.Serializable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class DmParameter_JsonParser implements Serializable {
    public static DmParameter parse(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        DmParameter dmParameter = new DmParameter("", "", "", new InternalError());
        if (jSONObject.optString("requestType") != null && !jSONObject.optString("requestType").toString().equalsIgnoreCase("null")) {
            dmParameter.setRequestType(jSONObject.optString("requestType"));
        }
        if (jSONObject.optString("wakeupWord") != null && !jSONObject.optString("wakeupWord").toString().equalsIgnoreCase("null")) {
            dmParameter.setWakeupWord(jSONObject.optString("wakeupWord"));
        }
        if (jSONObject.optString("data") != null && !jSONObject.optString("data").toString().equalsIgnoreCase("null")) {
            dmParameter.setData(jSONObject.optString("data"));
        }
        dmParameter.setError(InternalError_JsonParser.parse(jSONObject.optJSONObject("error")));
        if (jSONObject.optString("sessionId") != null && !jSONObject.optString("sessionId").toString().equalsIgnoreCase("null")) {
            dmParameter.setSessionId(jSONObject.optString("sessionId"));
        }
        if (jSONObject.optString(SpeechConstant.KEY_RECORD_ID) != null && !jSONObject.optString(SpeechConstant.KEY_RECORD_ID).toString().equalsIgnoreCase("null")) {
            dmParameter.setRecordId(jSONObject.optString(SpeechConstant.KEY_RECORD_ID));
        }
        if (jSONObject.optString("aiType") != null && !jSONObject.optString("aiType").toString().equalsIgnoreCase("null")) {
            dmParameter.setAiType(jSONObject.optString("aiType"));
        }
        if (jSONObject.optString("round") != null && !jSONObject.optString("round").toString().equalsIgnoreCase("null")) {
            dmParameter.setRound(jSONObject.optString("round"));
        }
        try {
            if (!jSONObject.has(EngineConstant.START_VAD) || jSONObject.get(EngineConstant.START_VAD) == null || jSONObject.get(EngineConstant.START_VAD).toString().equalsIgnoreCase("null")) {
                dmParameter.setStartVAD(null);
            } else {
                dmParameter.setStartVAD(Boolean.valueOf(jSONObject.optBoolean(EngineConstant.START_VAD)));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (jSONObject.optString("route") != null && !jSONObject.optString("route").toString().equalsIgnoreCase("null")) {
            dmParameter.setRoute(jSONObject.optString("route"));
        }
        if (jSONObject.optString("echo") != null && !jSONObject.optString("echo").toString().equalsIgnoreCase("null")) {
            dmParameter.setEcho(jSONObject.optString("echo"));
        }
        return dmParameter;
    }
}
