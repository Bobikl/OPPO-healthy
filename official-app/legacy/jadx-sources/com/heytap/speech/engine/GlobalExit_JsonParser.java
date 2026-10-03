package com.heytap.speech.engine;

import java.io.Serializable;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class GlobalExit_JsonParser implements Serializable {
    public static GlobalExit parse(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        GlobalExit globalExit = new GlobalExit();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("globalExitUtterances");
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                arrayList.add(jSONArrayOptJSONArray.optString(i));
            }
            globalExit.setGlobalExitUtterances(arrayList);
        }
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("globalExitWords");
        if (jSONArrayOptJSONArray2 != null) {
            int length2 = jSONArrayOptJSONArray2.length();
            ArrayList arrayList2 = new ArrayList(length2);
            for (int i2 = 0; i2 < length2; i2++) {
                arrayList2.add(jSONArrayOptJSONArray2.optString(i2));
            }
            globalExit.setGlobalExitWords(arrayList2);
        }
        try {
            if (!jSONObject.has("visible") || jSONObject.get("visible") == null || jSONObject.get("visible").toString().equalsIgnoreCase("null")) {
                globalExit.setVisible(null);
            } else {
                globalExit.setVisible(Boolean.valueOf(jSONObject.optBoolean("visible")));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return globalExit;
    }
}
