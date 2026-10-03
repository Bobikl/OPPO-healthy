package com.heytap.speech.engine;

import java.io.Serializable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class Vad_JsonParser implements Serializable {
    public static Vad parse(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Vad vad = new Vad();
        try {
            if (!jSONObject.has("enable") || jSONObject.get("enable") == null || jSONObject.get("enable").toString().equalsIgnoreCase("null")) {
                vad.setEnable(null);
            } else {
                vad.setEnable(Boolean.valueOf(jSONObject.optBoolean("enable")));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        try {
            if (!jSONObject.has("pausetime") || jSONObject.get("pausetime") == null || jSONObject.get("pausetime").toString().equalsIgnoreCase("null")) {
                vad.setPausetime(null);
            } else {
                vad.setPausetime(Integer.valueOf(jSONObject.optInt("pausetime")));
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        try {
            if (!jSONObject.has("timeout") || jSONObject.get("timeout") == null || jSONObject.get("timeout").toString().equalsIgnoreCase("null")) {
                vad.setTimeout(null);
            } else {
                vad.setTimeout(Integer.valueOf(jSONObject.optInt("timeout")));
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        try {
            if (!jSONObject.has("visible") || jSONObject.get("visible") == null || jSONObject.get("visible").toString().equalsIgnoreCase("null")) {
                vad.setVisible(null);
            } else {
                vad.setVisible(Boolean.valueOf(jSONObject.optBoolean("visible")));
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        return vad;
    }
}
