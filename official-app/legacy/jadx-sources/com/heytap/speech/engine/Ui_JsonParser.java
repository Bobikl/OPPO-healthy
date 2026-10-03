package com.heytap.speech.engine;

import java.io.Serializable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class Ui_JsonParser implements Serializable {
    public static Ui parse(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Ui ui = new Ui();
        try {
            if (!jSONObject.has("id") || jSONObject.get("id") == null || jSONObject.get("id").toString().equalsIgnoreCase("null")) {
                ui.setId(null);
            } else {
                ui.setId(Integer.valueOf(jSONObject.optInt("id")));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        try {
            if (!jSONObject.has("type") || jSONObject.get("type") == null || jSONObject.get("type").toString().equalsIgnoreCase("null")) {
                ui.setType(null);
            } else {
                ui.setType(Integer.valueOf(jSONObject.optInt("type")));
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        try {
            if (!jSONObject.has("visible") || jSONObject.get("visible") == null || jSONObject.get("visible").toString().equalsIgnoreCase("null")) {
                ui.setVisible(null);
            } else {
                ui.setVisible(Boolean.valueOf(jSONObject.optBoolean("visible")));
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        return ui;
    }
}
