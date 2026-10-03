package com.heytap.speech.engine;

import java.io.Serializable;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class Wakeup_JsonParser implements Serializable {
    public static Wakeup parse(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Wakeup wakeup = new Wakeup();
        wakeup.setCmdword(Cmdword_JsonParser.parse(jSONObject.optJSONObject("cmdword")));
        try {
            if (!jSONObject.has("enable") || jSONObject.get("enable") == null || jSONObject.get("enable").toString().equalsIgnoreCase("null")) {
                wakeup.setEnable(null);
            } else {
                wakeup.setEnable(Boolean.valueOf(jSONObject.optBoolean("enable")));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("majorword");
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                arrayList.add(Majorword_JsonParser.parse(jSONArrayOptJSONArray.optJSONObject(i)));
            }
            wakeup.setMajorword(arrayList);
        }
        try {
            if (!jSONObject.has("visible") || jSONObject.get("visible") == null || jSONObject.get("visible").toString().equalsIgnoreCase("null")) {
                wakeup.setVisible(null);
            } else {
                wakeup.setVisible(Boolean.valueOf(jSONObject.optBoolean("visible")));
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        return wakeup;
    }
}
