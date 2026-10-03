package com.heytap.speech.engine.internal.data;

import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class InternalError_JsonSerializer implements Serializable {
    public static JSONObject serialize(InternalError internalError) throws JSONException {
        if (internalError == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errId", internalError.getErrId());
        jSONObject.put("errMsg", internalError.getErrMsg());
        jSONObject.put("errDetail", internalError.getErrDetail());
        return jSONObject;
    }
}
