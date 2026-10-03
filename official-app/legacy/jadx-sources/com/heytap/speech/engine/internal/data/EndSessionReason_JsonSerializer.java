package com.heytap.speech.engine.internal.data;

import com.heytap.speech.engine.constant.EngineConstant;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class EndSessionReason_JsonSerializer implements Serializable {
    public static JSONObject serialize(EndSessionReason endSessionReason) throws JSONException {
        if (endSessionReason == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errId", endSessionReason.getErrId());
        jSONObject.put("errMsg", endSessionReason.getErrMsg());
        jSONObject.put("errDetail", endSessionReason.getErrDetail());
        jSONObject.put(EngineConstant.REASON, endSessionReason.getReason());
        jSONObject.put("skillId", endSessionReason.getSkillId());
        jSONObject.put("taskId", endSessionReason.getTaskId());
        return jSONObject;
    }
}
