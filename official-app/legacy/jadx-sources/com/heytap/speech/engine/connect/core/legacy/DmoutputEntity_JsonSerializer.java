package com.heytap.speech.engine.connect.core.legacy;

import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class DmoutputEntity_JsonSerializer implements Serializable {
    public static JSONObject serialize(DmoutputEntity dmoutputEntity) throws JSONException {
        if (dmoutputEntity == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(SpeechConstant.KEY_TTS_REQUEST_HEADER, DmoutputHeaderBean_JsonSerializer.serialize(dmoutputEntity.getHeader()));
        jSONObject.put("speak", DmoutputSpeakBean_JsonSerializer.serialize(dmoutputEntity.getSpeak()));
        jSONObject.put("payload", DmoutputPayloadBean_JsonSerializer.serialize(dmoutputEntity.getPayload()));
        jSONObject.put("conditional", DmoutputConditionalBean_JsonSerializer.serialize(dmoutputEntity.getConditional()));
        jSONObject.put("originData", dmoutputEntity.getOriginData());
        return jSONObject;
    }
}
