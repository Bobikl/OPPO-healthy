package com.heytap.speech.engine;

import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class Pickup_JsonSerializer implements Serializable {
    public static JSONObject serialize(Pickup pickup) throws JSONException {
        if (pickup == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("displaytype", pickup.getDisplaytype());
        jSONObject.put("enable", pickup.getEnable());
        jSONObject.put("far", Far_JsonSerializer.serialize(pickup.getFar()));
        jSONObject.put("near", Near_JsonSerializer.serialize(pickup.getNear()));
        jSONObject.put("visible", pickup.getVisible());
        return jSONObject;
    }
}
