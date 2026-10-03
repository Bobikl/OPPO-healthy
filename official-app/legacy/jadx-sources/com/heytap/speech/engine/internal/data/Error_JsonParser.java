package com.heytap.speech.engine.internal.data;

import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import java.io.Serializable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class Error_JsonParser implements Serializable {
    public static Error parse(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Error error = new Error();
        error.setErrId(jSONObject.optInt("errId", error.getErrId()));
        if (jSONObject.optString("errMsg") != null && !jSONObject.optString("errMsg").toString().equalsIgnoreCase("null")) {
            error.setErrMsg(jSONObject.optString("errMsg"));
        }
        if (jSONObject.optString("errDetail") != null && !jSONObject.optString("errDetail").toString().equalsIgnoreCase("null")) {
            error.setErrDetail(jSONObject.optString("errDetail"));
        }
        if (jSONObject.optString(SpeechConstant.KEY_RECORD_ID) != null && !jSONObject.optString(SpeechConstant.KEY_RECORD_ID).toString().equalsIgnoreCase("null")) {
            error.setRecordId(jSONObject.optString(SpeechConstant.KEY_RECORD_ID));
        }
        return error;
    }
}
