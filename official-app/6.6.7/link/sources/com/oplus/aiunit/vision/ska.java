package com.oplus.aiunit.vision;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class ska {
    public JSONObject a;

    public ska(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    public static ska e(String str) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException unused) {
            jSONObject = new JSONObject();
        }
        return new ska(jSONObject);
    }

    public JSONObject a() {
        return this.a;
    }

    public boolean b(String str, boolean z) {
        return this.a.optBoolean(str, z);
    }

    public String c(String str) {
        return this.a.optString(str);
    }

    public String d(String str, String str2) {
        return this.a.optString(str, str2);
    }

    public String toString() {
        return this.a.toString();
    }

    public ska() {
        this.a = new JSONObject();
    }
}
