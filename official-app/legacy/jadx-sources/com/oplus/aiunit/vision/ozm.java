package com.oplus.aiunit.vision;

import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class ozm {
    public static Object a(JSONArray jSONArray, int i) {
        if (jSONArray != null && i < jSONArray.length() && i >= 0) {
            try {
                return jSONArray.get(i);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }

    public static String b(JSONObject jSONObject, String str) {
        if (d(jSONObject, str)) {
            try {
                return jSONObject.getString(str);
            } catch (Exception unused) {
                f1n.d("uppay", ozm.class.toString() + " get " + str + " failed!!");
            }
        }
        return "";
    }

    public static JSONArray c(JSONObject jSONObject, String str) {
        if (d(jSONObject, str)) {
            try {
                return jSONObject.getJSONArray(str);
            } catch (Exception unused) {
                f1n.d("uppay", ozm.class.toString() + " get " + str + " failed!!");
            }
        }
        return null;
    }

    public static boolean d(JSONObject jSONObject, String str) {
        return jSONObject != null && jSONObject.has(str);
    }
}
