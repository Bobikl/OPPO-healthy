package com.oplus.aiunit.vision;

import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@mka(method = "sdk_version", uiThread = false)
public class hp3 implements ss9 {
    @Override // com.oplus.aiunit.vision.ss9
    public void execute(us9 us9Var, ska skaVar, rs9 rs9Var) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("version", "1.0.19");
            jSONObject.put("version_code", "1.0.19");
        } catch (Exception unused) {
        }
        rs9Var.success(jSONObject);
    }
}
