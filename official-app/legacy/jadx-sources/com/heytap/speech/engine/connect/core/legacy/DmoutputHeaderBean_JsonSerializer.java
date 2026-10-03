package com.heytap.speech.engine.connect.core.legacy;

import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.platform.usercenter.bizuws.executor.dialog.ShowDialogExecutor;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class DmoutputHeaderBean_JsonSerializer implements Serializable {
    public static JSONObject serialize(DmoutputEntity.DmoutputHeaderBean dmoutputHeaderBean) throws JSONException {
        if (dmoutputHeaderBean == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("topic", dmoutputHeaderBean.getTopic());
        jSONObject.put(SpeechConstant.KEY_RECORD_ID, dmoutputHeaderBean.getRecordId());
        jSONObject.put("sessionId", dmoutputHeaderBean.getSessionId());
        jSONObject.put(SpeechConstant.KEY_CONTEXT_ID, dmoutputHeaderBean.getContextId());
        jSONObject.put("skill", dmoutputHeaderBean.getSkill());
        jSONObject.put("intent", dmoutputHeaderBean.getIntent());
        jSONObject.put(ShowDialogExecutor.JSON_DIALOG_ID_KEY, dmoutputHeaderBean.getDialogId());
        jSONObject.put("skillId", dmoutputHeaderBean.getSkillId());
        jSONObject.put("userTimbreId", dmoutputHeaderBean.getUserTimbreId());
        return jSONObject;
    }
}
