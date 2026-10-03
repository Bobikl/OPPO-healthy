package com.oplus.aiunit.vision;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class juc implements lr9 {
    @Override // com.oplus.aiunit.vision.lr9
    public void a(Object obj, String str, JSONObject jSONObject) {
    }

    public void b(Object obj, String str) {
        a(obj, str, new JSONObject());
    }

    @Override // com.oplus.aiunit.vision.lr9
    public void fail(Object obj, String str) {
        b(obj, str);
    }

    @Override // com.oplus.aiunit.vision.lr9
    public void success(JSONObject jSONObject) {
        a(0, "success!", jSONObject);
    }

    @Override // com.oplus.aiunit.vision.lr9
    public void success() {
        a(0, "success!", new JSONObject());
    }
}
