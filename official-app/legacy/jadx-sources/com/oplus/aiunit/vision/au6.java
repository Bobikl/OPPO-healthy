package com.oplus.aiunit.vision;

import com.heytap.speech.engine.constant.EngineConstant;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class au6 {
    public String a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f9491c;
    public long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f9492e;

    public au6() {
    }

    public static au6 a(String str) {
        if (str != null && !str.isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                au6 au6Var = new au6();
                au6Var.a = jSONObject.optString("app_id", "");
                au6Var.b = jSONObject.optString("event_group", "");
                au6Var.f9491c = jSONObject.optString(of5.ARG_EVENT_ID, "");
                au6Var.d = jSONObject.optLong("event_time", 0L);
                au6Var.f9492e = jSONObject.optString(EngineConstant.REASON, "");
                return au6Var;
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public String b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }

    public String d() {
        return this.f9491c;
    }

    public long e() {
        return this.d;
    }

    public String f() {
        return this.f9492e;
    }

    public String g() {
        try {
            JSONObject jSONObject = new JSONObject();
            String str = this.a;
            if (str == null) {
                str = "";
            }
            jSONObject.put("app_id", str);
            String str2 = this.b;
            if (str2 == null) {
                str2 = "";
            }
            jSONObject.put("event_group", str2);
            String str3 = this.f9491c;
            if (str3 == null) {
                str3 = "";
            }
            jSONObject.put(of5.ARG_EVENT_ID, str3);
            jSONObject.put("event_time", this.d);
            String str4 = this.f9492e;
            jSONObject.put(EngineConstant.REASON, str4 != null ? str4 : "");
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "{}";
        }
    }

    public au6(String str, String str2, String str3, long j2, String str4) {
        this.a = str;
        this.b = str2;
        this.f9491c = str3;
        this.d = j2;
        this.f9492e = str4;
    }
}
