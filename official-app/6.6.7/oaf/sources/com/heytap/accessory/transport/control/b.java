package com.heytap.accessory.transport.control;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class b {
    public long a;
    public int b;
    public String c;
    public int d;
    public long e;

    public b(long j, int i, int i2, long j2) {
        this.a = j;
        this.b = i;
        this.c = "filetransfer-window-size";
        this.d = i2;
        this.e = j2;
    }

    public long a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public long c() {
        return this.e;
    }

    public JSONObject d() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("msgId", this.c);
        jSONObject.put("transId", this.d);
        jSONObject.put("windowSize", this.e);
        return jSONObject;
    }

    public void a(JSONObject jSONObject) throws JSONException {
        this.c = jSONObject.getString("msgId");
        this.d = jSONObject.getInt("transId");
        this.e = jSONObject.getLong("windowSize");
    }

    public b(long j, int i, JSONObject jSONObject) throws JSONException {
        this.a = j;
        this.b = i;
        a(jSONObject);
    }
}
