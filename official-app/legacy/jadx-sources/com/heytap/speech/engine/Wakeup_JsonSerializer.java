package com.heytap.speech.engine;

import java.io.Serializable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class Wakeup_JsonSerializer implements Serializable {
    public static JSONObject serialize(Wakeup wakeup) throws JSONException {
        if (wakeup == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("cmdword", Cmdword_JsonSerializer.serialize(wakeup.getCmdword()));
        jSONObject.put("enable", wakeup.getEnable());
        if (wakeup.getMajorword() != null) {
            JSONArray jSONArray = new JSONArray();
            for (Majorword majorword : wakeup.getMajorword()) {
                if (majorword != null) {
                    jSONArray.put(Majorword_JsonSerializer.serialize(majorword));
                }
            }
            jSONObject.put("majorword", jSONArray);
        }
        jSONObject.put("visible", wakeup.getVisible());
        return jSONObject;
    }
}
