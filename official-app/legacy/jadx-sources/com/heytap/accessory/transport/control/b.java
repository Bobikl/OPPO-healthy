package com.heytap.accessory.transport.control;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class b {
    public long a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f2779c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f2780e;

    public b(long j2, int i, int i2, long j3) {
        this.a = j2;
        this.b = i;
        this.f2779c = "filetransfer-window-size";
        this.d = i2;
        this.f2780e = j3;
    }

    public long a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public long c() {
        return this.f2780e;
    }

    public JSONObject d() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("msgId", this.f2779c);
        jSONObject.put("transId", this.d);
        jSONObject.put("windowSize", this.f2780e);
        return jSONObject;
    }

    public void a(JSONObject jSONObject) throws JSONException {
        this.f2779c = jSONObject.getString("msgId");
        this.d = jSONObject.getInt("transId");
        this.f2780e = jSONObject.getLong("windowSize");
    }

    public b(long j2, int i, JSONObject jSONObject) throws JSONException {
        this.a = j2;
        this.b = i;
        a(jSONObject);
    }
}
