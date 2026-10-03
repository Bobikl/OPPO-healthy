package com.heytap.speech.engine.connect.core.legacy;

import com.heytap.speech.engine.constant.EngineConstant;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class DmoutputSpeakBean_JsonSerializer implements Serializable {
    public static JSONObject serialize(DmoutputEntity.DmoutputSpeakBean dmoutputSpeakBean) throws JSONException {
        if (dmoutputSpeakBean == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", dmoutputSpeakBean.getType());
        jSONObject.put("text", dmoutputSpeakBean.getText());
        jSONObject.put("audioUrl", dmoutputSpeakBean.getAudioUrl());
        jSONObject.put(EngineConstant.TTS_TYPE_SSML, dmoutputSpeakBean.getSsml());
        jSONObject.put("emotion", dmoutputSpeakBean.getEmotion());
        jSONObject.put(EngineConstant.TTS_TIMBRE, dmoutputSpeakBean.getTimbre());
        jSONObject.put("ttsLanguage", dmoutputSpeakBean.getTtsLanguage());
        jSONObject.put("streamId", dmoutputSpeakBean.getStreamId());
        jSONObject.put("micAct", dmoutputSpeakBean.getMicAct());
        jSONObject.put("handleBySelf", dmoutputSpeakBean.getHandleBySelf());
        return jSONObject;
    }
}
