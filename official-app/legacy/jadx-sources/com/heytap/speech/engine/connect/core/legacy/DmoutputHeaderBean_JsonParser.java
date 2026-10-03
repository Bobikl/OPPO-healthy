package com.heytap.speech.engine.connect.core.legacy;

import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.platform.usercenter.bizuws.executor.dialog.ShowDialogExecutor;
import java.io.Serializable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class DmoutputHeaderBean_JsonParser implements Serializable {
    public static DmoutputEntity.DmoutputHeaderBean parse(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        DmoutputEntity.DmoutputHeaderBean dmoutputHeaderBean = new DmoutputEntity.DmoutputHeaderBean();
        if (jSONObject.optString("topic") != null && !jSONObject.optString("topic").toString().equalsIgnoreCase("null")) {
            dmoutputHeaderBean.setTopic(jSONObject.optString("topic"));
        }
        if (jSONObject.optString(SpeechConstant.KEY_RECORD_ID) != null && !jSONObject.optString(SpeechConstant.KEY_RECORD_ID).toString().equalsIgnoreCase("null")) {
            dmoutputHeaderBean.setRecordId(jSONObject.optString(SpeechConstant.KEY_RECORD_ID));
        }
        if (jSONObject.optString("sessionId") != null && !jSONObject.optString("sessionId").toString().equalsIgnoreCase("null")) {
            dmoutputHeaderBean.setSessionId(jSONObject.optString("sessionId"));
        }
        if (jSONObject.optString(SpeechConstant.KEY_CONTEXT_ID) != null && !jSONObject.optString(SpeechConstant.KEY_CONTEXT_ID).toString().equalsIgnoreCase("null")) {
            dmoutputHeaderBean.setContextId(jSONObject.optString(SpeechConstant.KEY_CONTEXT_ID));
        }
        if (jSONObject.optString("skill") != null && !jSONObject.optString("skill").toString().equalsIgnoreCase("null")) {
            dmoutputHeaderBean.setSkill(jSONObject.optString("skill"));
        }
        if (jSONObject.optString("intent") != null && !jSONObject.optString("intent").toString().equalsIgnoreCase("null")) {
            dmoutputHeaderBean.setIntent(jSONObject.optString("intent"));
        }
        if (jSONObject.optString(ShowDialogExecutor.JSON_DIALOG_ID_KEY) != null && !jSONObject.optString(ShowDialogExecutor.JSON_DIALOG_ID_KEY).toString().equalsIgnoreCase("null")) {
            dmoutputHeaderBean.setDialogId(jSONObject.optString(ShowDialogExecutor.JSON_DIALOG_ID_KEY));
        }
        dmoutputHeaderBean.setSkillId(jSONObject.optInt("skillId", dmoutputHeaderBean.getSkillId()));
        if (jSONObject.optString("userTimbreId") != null && !jSONObject.optString("userTimbreId").toString().equalsIgnoreCase("null")) {
            dmoutputHeaderBean.setUserTimbreId(jSONObject.optString("userTimbreId"));
        }
        return dmoutputHeaderBean;
    }
}
