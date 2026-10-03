package com.heytap.speech.engine.nodes;

import com.heytap.speech.engine.constant.EngineConstant;
import com.heytap.speech.engine.internal.data.InternalError_JsonSerializer;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class DmParameter_JsonSerializer implements Serializable {
    public static JSONObject serialize(DmParameter dmParameter) throws JSONException {
        if (dmParameter == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("requestType", dmParameter.getRequestType());
        jSONObject.put("wakeupWord", dmParameter.getWakeupWord());
        jSONObject.put("data", dmParameter.getData());
        jSONObject.put("error", InternalError_JsonSerializer.serialize(dmParameter.getError()));
        jSONObject.put("sessionId", dmParameter.getSessionId());
        jSONObject.put(SpeechConstant.KEY_RECORD_ID, dmParameter.getRecordId());
        jSONObject.put("aiType", dmParameter.getAiType());
        jSONObject.put("round", dmParameter.getRound());
        jSONObject.put(EngineConstant.START_VAD, dmParameter.getStartVAD());
        jSONObject.put("route", dmParameter.getRoute());
        jSONObject.put("echo", dmParameter.getEcho());
        return jSONObject;
    }
}
