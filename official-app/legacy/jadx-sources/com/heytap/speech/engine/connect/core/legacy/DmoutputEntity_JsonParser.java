package com.heytap.speech.engine.connect.core.legacy;

import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import java.io.Serializable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class DmoutputEntity_JsonParser implements Serializable {
    public static DmoutputEntity parse(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        DmoutputEntity dmoutputEntity = new DmoutputEntity();
        dmoutputEntity.setHeader(DmoutputHeaderBean_JsonParser.parse(jSONObject.optJSONObject(SpeechConstant.KEY_TTS_REQUEST_HEADER)));
        dmoutputEntity.setSpeak(DmoutputSpeakBean_JsonParser.parse(jSONObject.optJSONObject("speak")));
        dmoutputEntity.setPayload(DmoutputPayloadBean_JsonParser.parse(jSONObject.optJSONObject("payload")));
        dmoutputEntity.setConditional(DmoutputConditionalBean_JsonParser.parse(jSONObject.optJSONObject("conditional")));
        if (jSONObject.optString("originData") != null && !jSONObject.optString("originData").toString().equalsIgnoreCase("null")) {
            dmoutputEntity.setOriginData(jSONObject.optString("originData"));
        }
        return dmoutputEntity;
    }
}
