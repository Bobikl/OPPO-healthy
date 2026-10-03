package com.heytap.speech.engine;

import java.io.Serializable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class OneShot_JsonParser implements Serializable {
    public static OneShot parse(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        OneShot oneShot = new OneShot();
        try {
            if (!jSONObject.has("enable") || jSONObject.get("enable") == null || jSONObject.get("enable").toString().equalsIgnoreCase("null")) {
                oneShot.setEnable(null);
            } else {
                oneShot.setEnable(Boolean.valueOf(jSONObject.optBoolean("enable")));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        try {
            if (!jSONObject.has("visible") || jSONObject.get("visible") == null || jSONObject.get("visible").toString().equalsIgnoreCase("null")) {
                oneShot.setVisible(null);
            } else {
                oneShot.setVisible(Boolean.valueOf(jSONObject.optBoolean("visible")));
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        return oneShot;
    }
}
