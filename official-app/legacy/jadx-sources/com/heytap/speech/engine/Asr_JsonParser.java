package com.heytap.speech.engine;

import java.io.Serializable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class Asr_JsonParser implements Serializable {
    public static Asr parse(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Asr asr = new Asr();
        asr.setCloud(Cloud_JsonParser.parse(jSONObject.optJSONObject("cloud")));
        try {
            if (!jSONObject.has("enable") || jSONObject.get("enable") == null || jSONObject.get("enable").toString().equalsIgnoreCase("null")) {
                asr.setEnable(null);
            } else {
                asr.setEnable(Boolean.valueOf(jSONObject.optBoolean("enable")));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        asr.setLocal(Local_JsonParser.parse(jSONObject.optJSONObject("local")));
        try {
            if (!jSONObject.has("visible") || jSONObject.get("visible") == null || jSONObject.get("visible").toString().equalsIgnoreCase("null")) {
                asr.setVisible(null);
            } else {
                asr.setVisible(Boolean.valueOf(jSONObject.optBoolean("visible")));
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        return asr;
    }
}
