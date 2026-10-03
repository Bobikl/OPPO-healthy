package com.heytap.speech.engine;

import java.io.Serializable;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class GlobalExit_JsonSerializer implements Serializable {
    public static JSONObject serialize(GlobalExit globalExit) throws JSONException {
        if (globalExit == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        if (globalExit.getGlobalExitUtterances() != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator<String> it = globalExit.getGlobalExitUtterances().iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next());
            }
            jSONObject.put("globalExitUtterances", jSONArray);
        }
        if (globalExit.getGlobalExitWords() != null) {
            JSONArray jSONArray2 = new JSONArray();
            Iterator<String> it2 = globalExit.getGlobalExitWords().iterator();
            while (it2.hasNext()) {
                jSONArray2.put(it2.next());
            }
            jSONObject.put("globalExitWords", jSONArray2);
        }
        jSONObject.put("visible", globalExit.getVisible());
        return jSONObject;
    }
}
