package com.heytap.speech.engine;

import java.io.Serializable;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class Module_JsonParser implements Serializable {
    public static Module parse(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Module module = new Module();
        module.setAecenable(jSONObject.optBoolean("aecenable", module.getAecenable()));
        module.setEnable(jSONObject.optBoolean("enable", module.getEnable()));
        module.setType(jSONObject.optInt("type", module.getType()));
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("using");
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                arrayList.add(jSONArrayOptJSONArray.optString(i));
            }
            module.setUsing(arrayList);
        }
        module.setVisible(jSONObject.optBoolean("visible", module.getVisible()));
        return module;
    }
}
