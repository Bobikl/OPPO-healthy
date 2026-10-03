package com.heytap.speech.engine.internal.data;

import java.io.Serializable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class InternalError_JsonParser implements Serializable {
    public static InternalError parse(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        InternalError internalError = new InternalError();
        if (jSONObject.optString("errId") != null && !jSONObject.optString("errId").toString().equalsIgnoreCase("null")) {
            internalError.setErrId(jSONObject.optString("errId"));
        }
        if (jSONObject.optString("errMsg") != null && !jSONObject.optString("errMsg").toString().equalsIgnoreCase("null")) {
            internalError.setErrMsg(jSONObject.optString("errMsg"));
        }
        if (jSONObject.optString("errDetail") != null && !jSONObject.optString("errDetail").toString().equalsIgnoreCase("null")) {
            internalError.setErrDetail(jSONObject.optString("errDetail"));
        }
        return internalError;
    }
}
