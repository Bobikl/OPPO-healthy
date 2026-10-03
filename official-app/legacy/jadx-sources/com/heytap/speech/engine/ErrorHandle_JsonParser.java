package com.heytap.speech.engine;

import com.heytap.speech.engine.constant.EngineConstant;
import java.io.Serializable;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class ErrorHandle_JsonParser implements Serializable {
    public static ErrorHandle parse(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        ErrorHandle errorHandle = new ErrorHandle();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(EngineConstant.PRODUCT_TIPS_ASR_EMPTY);
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                arrayList.add(jSONArrayOptJSONArray.optString(i));
            }
            errorHandle.setAsrEmptyWords(arrayList);
        }
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray(EngineConstant.PRODUCT_TIPS_EXIT);
        if (jSONArrayOptJSONArray2 != null) {
            int length2 = jSONArrayOptJSONArray2.length();
            ArrayList arrayList2 = new ArrayList(length2);
            for (int i2 = 0; i2 < length2; i2++) {
                arrayList2.add(jSONArrayOptJSONArray2.optString(i2));
            }
            errorHandle.setExitWords(arrayList2);
        }
        JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray(EngineConstant.PRODUCT_TIPS_NLU_EMPTY);
        if (jSONArrayOptJSONArray3 != null) {
            int length3 = jSONArrayOptJSONArray3.length();
            ArrayList arrayList3 = new ArrayList(length3);
            for (int i3 = 0; i3 < length3; i3++) {
                arrayList3.add(jSONArrayOptJSONArray3.optString(i3));
            }
            errorHandle.setNluEmptyWords(arrayList3);
        }
        JSONArray jSONArrayOptJSONArray4 = jSONObject.optJSONArray(EngineConstant.PRODUCT_TIPS_OFFLINE);
        if (jSONArrayOptJSONArray4 != null) {
            int length4 = jSONArrayOptJSONArray4.length();
            ArrayList arrayList4 = new ArrayList(length4);
            for (int i4 = 0; i4 < length4; i4++) {
                arrayList4.add(jSONArrayOptJSONArray4.optString(i4));
            }
            errorHandle.setOfflineWords(arrayList4);
        }
        try {
            if (!jSONObject.has("retryTimes") || jSONObject.get("retryTimes") == null || jSONObject.get("retryTimes").toString().equalsIgnoreCase("null")) {
                errorHandle.setRetryTimes(null);
            } else {
                errorHandle.setRetryTimes(Integer.valueOf(jSONObject.optInt("retryTimes")));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        try {
            if (!jSONObject.has("visible") || jSONObject.get("visible") == null || jSONObject.get("visible").toString().equalsIgnoreCase("null")) {
                errorHandle.setVisible(null);
            } else {
                errorHandle.setVisible(Boolean.valueOf(jSONObject.optBoolean("visible")));
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        return errorHandle;
    }
}
