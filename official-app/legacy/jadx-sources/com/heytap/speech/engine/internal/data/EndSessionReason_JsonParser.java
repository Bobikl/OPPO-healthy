package com.heytap.speech.engine.internal.data;

import com.heytap.speech.engine.constant.EngineConstant;
import java.io.Serializable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class EndSessionReason_JsonParser implements Serializable {
    public static EndSessionReason parse(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        EndSessionReason endSessionReason = new EndSessionReason();
        endSessionReason.setErrId(jSONObject.optInt("errId", endSessionReason.getErrId()));
        if (jSONObject.optString("errMsg") != null && !jSONObject.optString("errMsg").toString().equalsIgnoreCase("null")) {
            endSessionReason.setErrMsg(jSONObject.optString("errMsg"));
        }
        if (jSONObject.optString("errDetail") != null && !jSONObject.optString("errDetail").toString().equalsIgnoreCase("null")) {
            endSessionReason.setErrDetail(jSONObject.optString("errDetail"));
        }
        if (jSONObject.optString(EngineConstant.REASON) != null && !jSONObject.optString(EngineConstant.REASON).toString().equalsIgnoreCase("null")) {
            endSessionReason.setReason(jSONObject.optString(EngineConstant.REASON));
        }
        if (jSONObject.optString("skillId") != null && !jSONObject.optString("skillId").toString().equalsIgnoreCase("null")) {
            endSessionReason.setSkillId(jSONObject.optString("skillId"));
        }
        if (jSONObject.optString("taskId") != null && !jSONObject.optString("taskId").toString().equalsIgnoreCase("null")) {
            endSessionReason.setTaskId(jSONObject.optString("taskId"));
        }
        return endSessionReason;
    }
}
