package com.heytap.speech.engine;

import java.io.Serializable;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class Module_JsonSerializer implements Serializable {
    public static JSONObject serialize(Module module) throws JSONException {
        if (module == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("aecenable", module.getAecenable());
        jSONObject.put("enable", module.getEnable());
        jSONObject.put("type", module.getType());
        if (module.getUsing() != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator<String> it = module.getUsing().iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next());
            }
            jSONObject.put("using", jSONArray);
        }
        jSONObject.put("visible", module.getVisible());
        return jSONObject;
    }
}
