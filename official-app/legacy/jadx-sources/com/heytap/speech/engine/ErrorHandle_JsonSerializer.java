package com.heytap.speech.engine;

import com.heytap.speech.engine.constant.EngineConstant;
import java.io.Serializable;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class ErrorHandle_JsonSerializer implements Serializable {
    public static JSONObject serialize(ErrorHandle errorHandle) throws JSONException {
        if (errorHandle == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        if (errorHandle.getAsrEmptyWords() != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator<String> it = errorHandle.getAsrEmptyWords().iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next());
            }
            jSONObject.put(EngineConstant.PRODUCT_TIPS_ASR_EMPTY, jSONArray);
        }
        if (errorHandle.getExitWords() != null) {
            JSONArray jSONArray2 = new JSONArray();
            Iterator<String> it2 = errorHandle.getExitWords().iterator();
            while (it2.hasNext()) {
                jSONArray2.put(it2.next());
            }
            jSONObject.put(EngineConstant.PRODUCT_TIPS_EXIT, jSONArray2);
        }
        if (errorHandle.getNluEmptyWords() != null) {
            JSONArray jSONArray3 = new JSONArray();
            Iterator<String> it3 = errorHandle.getNluEmptyWords().iterator();
            while (it3.hasNext()) {
                jSONArray3.put(it3.next());
            }
            jSONObject.put(EngineConstant.PRODUCT_TIPS_NLU_EMPTY, jSONArray3);
        }
        if (errorHandle.getOfflineWords() != null) {
            JSONArray jSONArray4 = new JSONArray();
            Iterator<String> it4 = errorHandle.getOfflineWords().iterator();
            while (it4.hasNext()) {
                jSONArray4.put(it4.next());
            }
            jSONObject.put(EngineConstant.PRODUCT_TIPS_OFFLINE, jSONArray4);
        }
        jSONObject.put("retryTimes", errorHandle.getRetryTimes());
        jSONObject.put("visible", errorHandle.getVisible());
        return jSONObject;
    }
}
