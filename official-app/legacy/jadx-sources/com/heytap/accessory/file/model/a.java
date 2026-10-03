package com.heytap.accessory.file.model;

import com.heytap.log.consts.LogSenderConst;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class a {
    public long a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2568c;
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
        return this.f2568c;
    }

    public JSONObject c() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("msgId", this.b);
        jSONObject.put("transId", this.f2568c);
        jSONObject.put("progress", this.a);
        jSONObject.put(LogSenderConst.FILENAME, this.d);
        return jSONObject;
    }

    public void a(JSONObject jSONObject) throws JSONException {
        this.b = jSONObject.getString("msgId");
        this.f2568c = jSONObject.getInt("transId");
        this.a = jSONObject.getLong("progress");
        if (jSONObject.has(LogSenderConst.FILENAME)) {
            this.d = jSONObject.getString(LogSenderConst.FILENAME);
        }
    }

    public a(int i, long j2, String str) {
        this.b = "filetransfer-receive-progress";
        this.f2568c = i;
        this.a = j2;
        this.d = str;
    }
}
