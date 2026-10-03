package com.heytap.speech.engine.connect.core.legacy;

import java.io.Serializable;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class DirectiveBean_JsonSerializer implements Serializable {
    public static JSONObject serialize(DirectiveBean directiveBean) throws JSONException {
        if (directiveBean == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("cmd", directiveBean.getCmd());
        jSONObject.put("type", directiveBean.getType());
        if (directiveBean.getParams() != null) {
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry<String, Object> entry : directiveBean.getParams().entrySet()) {
                jSONObject2.put(entry.getKey(), entry.getValue());
            }
            jSONObject.put("params", jSONObject2);
        }
        return jSONObject;
    }
}
