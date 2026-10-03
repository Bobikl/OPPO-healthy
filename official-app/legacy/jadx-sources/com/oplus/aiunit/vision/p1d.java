package com.oplus.aiunit.vision;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class p1d {
    public int a;
    public n1d[] b;

    public p1d() {
        this.a = 0;
        this.b = null;
    }

    public String a() {
        if (this.b == null) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("angle", 0);
            JSONArray jSONArray = new JSONArray();
            for (n1d n1dVar : this.b) {
                if (n1dVar != null) {
                    jSONArray.put(n1dVar.b());
                }
            }
            jSONObject.put("items", jSONArray);
            return jSONObject.toString();
        } catch (JSONException e2) {
            i0.c("OcrResult", "toJsonString - convert to json string failed: " + e2.toString());
            return "";
        }
    }

    public p1d(String str) {
        this.a = 0;
        this.b = null;
        if (str == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("items");
            this.a = jSONObject.getInt("angle");
            this.b = new n1d[jSONArray.length()];
            for (int i = 0; i < jSONArray.length(); i++) {
                this.b[i] = new n1d(jSONArray.getJSONObject(i));
            }
        } catch (JSONException unused) {
            i0.c("OcrResult", "parse json failed.");
            this.a = -1;
            this.b = null;
        }
    }
}
