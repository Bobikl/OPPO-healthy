package com.heytap.speech.engine;

import java.io.Serializable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class Pickup_JsonParser implements Serializable {
    public static Pickup parse(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Pickup pickup = new Pickup();
        if (jSONObject.optString("displaytype") != null && !jSONObject.optString("displaytype").toString().equalsIgnoreCase("null")) {
            pickup.setDisplaytype(jSONObject.optString("displaytype"));
        }
        pickup.setEnable(jSONObject.optBoolean("enable", pickup.getEnable()));
        pickup.setFar(Far_JsonParser.parse(jSONObject.optJSONObject("far")));
        pickup.setNear(Near_JsonParser.parse(jSONObject.optJSONObject("near")));
        try {
            if (!jSONObject.has("visible") || jSONObject.get("visible") == null || jSONObject.get("visible").toString().equalsIgnoreCase("null")) {
                pickup.setVisible(null);
            } else {
                pickup.setVisible(Boolean.valueOf(jSONObject.optBoolean("visible")));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return pickup;
    }
}
