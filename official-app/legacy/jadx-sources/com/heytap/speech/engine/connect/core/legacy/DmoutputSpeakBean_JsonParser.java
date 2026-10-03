package com.heytap.speech.engine.connect.core.legacy;

import com.heytap.speech.engine.constant.EngineConstant;
import java.io.Serializable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class DmoutputSpeakBean_JsonParser implements Serializable {
    public static DmoutputEntity.DmoutputSpeakBean parse(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        DmoutputEntity.DmoutputSpeakBean dmoutputSpeakBean = new DmoutputEntity.DmoutputSpeakBean();
        if (jSONObject.optString("type") != null && !jSONObject.optString("type").toString().equalsIgnoreCase("null")) {
            dmoutputSpeakBean.setType(jSONObject.optString("type"));
        }
        if (jSONObject.optString("text") != null && !jSONObject.optString("text").toString().equalsIgnoreCase("null")) {
            dmoutputSpeakBean.setText(jSONObject.optString("text"));
        }
        if (jSONObject.optString("audioUrl") != null && !jSONObject.optString("audioUrl").toString().equalsIgnoreCase("null")) {
            dmoutputSpeakBean.setAudioUrl(jSONObject.optString("audioUrl"));
        }
        if (jSONObject.optString(EngineConstant.TTS_TYPE_SSML) != null && !jSONObject.optString(EngineConstant.TTS_TYPE_SSML).toString().equalsIgnoreCase("null")) {
            dmoutputSpeakBean.setSsml(jSONObject.optString(EngineConstant.TTS_TYPE_SSML));
        }
        if (jSONObject.optString("emotion") != null && !jSONObject.optString("emotion").toString().equalsIgnoreCase("null")) {
            dmoutputSpeakBean.setEmotion(jSONObject.optString("emotion"));
        }
        if (jSONObject.optString(EngineConstant.TTS_TIMBRE) != null && !jSONObject.optString(EngineConstant.TTS_TIMBRE).toString().equalsIgnoreCase("null")) {
            dmoutputSpeakBean.setTimbre(jSONObject.optString(EngineConstant.TTS_TIMBRE));
        }
        if (jSONObject.optString("ttsLanguage") != null && !jSONObject.optString("ttsLanguage").toString().equalsIgnoreCase("null")) {
            dmoutputSpeakBean.setTtsLanguage(jSONObject.optString("ttsLanguage"));
        }
        if (jSONObject.optString("streamId") != null && !jSONObject.optString("streamId").toString().equalsIgnoreCase("null")) {
            dmoutputSpeakBean.setStreamId(jSONObject.optString("streamId"));
        }
        if (jSONObject.optString("micAct") != null && !jSONObject.optString("micAct").toString().equalsIgnoreCase("null")) {
            dmoutputSpeakBean.setMicAct(jSONObject.optString("micAct"));
        }
        dmoutputSpeakBean.setHandleBySelf(jSONObject.optBoolean("handleBySelf", dmoutputSpeakBean.getHandleBySelf()));
        return dmoutputSpeakBean;
    }
}
