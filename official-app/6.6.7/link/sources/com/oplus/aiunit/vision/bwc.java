package com.oplus.aiunit.vision;

import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class bwc implements rs9 {
    @Override // com.oplus.aiunit.vision.rs9
    public void a(Object obj, String str, JSONObject jSONObject) {
    }

    public void b(Object obj, String str) {
        a(obj, str, new JSONObject());
    }

    @Override // com.oplus.aiunit.vision.rs9
    public void fail(Object obj, String str) {
        b(obj, str);
    }

    @Override // com.oplus.aiunit.vision.rs9
    public void success(JSONObject jSONObject) {
        a(0, rs9.SUCCESS_MESSAGE, jSONObject);
    }

    @Override // com.oplus.aiunit.vision.rs9
    public void success() {
        a(0, rs9.SUCCESS_MESSAGE, new JSONObject());
    }
}
