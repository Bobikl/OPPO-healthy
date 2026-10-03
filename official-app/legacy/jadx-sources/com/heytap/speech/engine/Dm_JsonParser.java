package com.heytap.speech.engine;

import java.io.Serializable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class Dm_JsonParser implements Serializable {
    public static Dm parse(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Dm dm = new Dm();
        try {
            if (!jSONObject.has("enable") || jSONObject.get("enable") == null || jSONObject.get("enable").toString().equalsIgnoreCase("null")) {
                dm.setEnable(null);
            } else {
                dm.setEnable(Boolean.valueOf(jSONObject.optBoolean("enable")));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        dm.setErrorHandle(ErrorHandle_JsonParser.parse(jSONObject.optJSONObject("errorHandle")));
        dm.setGlobalExit(GlobalExit_JsonParser.parse(jSONObject.optJSONObject("globalExit")));
        dm.setOneShot(OneShot_JsonParser.parse(jSONObject.optJSONObject("oneShot")));
        return dm;
    }
}
