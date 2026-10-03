package com.heytap.speech.engine.connect.core.legacy;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class DirectiveBean_JsonParser implements Serializable {
    public static DirectiveBean parse(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        DirectiveBean directiveBean = new DirectiveBean();
        if (jSONObject.optString("cmd") != null && !jSONObject.optString("cmd").toString().equalsIgnoreCase("null")) {
            directiveBean.setCmd(jSONObject.optString("cmd"));
        }
        if (jSONObject.optString("type") != null && !jSONObject.optString("type").toString().equalsIgnoreCase("null")) {
            directiveBean.setType(jSONObject.optString("type"));
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("params");
        if (jSONObjectOptJSONObject != null) {
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            HashMap map = new HashMap();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObjectOptJSONObject.opt(next));
            }
            directiveBean.setParams(map);
        }
        return directiveBean;
    }
}
