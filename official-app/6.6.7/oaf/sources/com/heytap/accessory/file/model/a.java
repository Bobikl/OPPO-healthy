package com.heytap.accessory.file.model;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class a {
    public long a;
    public String b;
    public int c;
    public String d;

    public a() {
        this.b = null;
        this.a = 0L;
        this.d = null;
    }

    public long a() {
        return this.a;
    }

    public int b() {
        return this.c;
    }

    public JSONObject c() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("msgId", this.b);
        jSONObject.put("transId", this.c);
        jSONObject.put(Constant.PROGRESS, this.a);
        jSONObject.put("fileName", this.d);
        return jSONObject;
    }

    public void a(JSONObject jSONObject) throws JSONException {
        this.b = jSONObject.getString("msgId");
        this.c = jSONObject.getInt("transId");
        this.a = jSONObject.getLong(Constant.PROGRESS);
        if (jSONObject.has("fileName")) {
            this.d = jSONObject.getString("fileName");
        }
    }

    public a(int i, long j, String str) {
        this.b = "filetransfer-receive-progress";
        this.c = i;
        this.a = j;
        this.d = str;
    }
}
