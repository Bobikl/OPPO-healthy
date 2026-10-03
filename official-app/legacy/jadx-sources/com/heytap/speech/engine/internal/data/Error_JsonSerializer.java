package com.heytap.speech.engine.internal.data;

import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class Error_JsonSerializer implements Serializable {
    public static JSONObject serialize(Error error) throws JSONException {
        if (error == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errId", error.getErrId());
        jSONObject.put("errMsg", error.getErrMsg());
        jSONObject.put("errDetail", error.getErrDetail());
        jSONObject.put(SpeechConstant.KEY_RECORD_ID, error.getRecordId());
        return jSONObject;
    }
}
