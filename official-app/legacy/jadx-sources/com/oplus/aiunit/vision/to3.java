package com.oplus.aiunit.vision;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@eja(method = "sdk_version", uiThread = false)
public class to3 implements mr9 {
    @Override // com.oplus.aiunit.vision.mr9
    public void execute(or9 or9Var, kja kjaVar, lr9 lr9Var) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("version", "1.0.19");
            jSONObject.put("version_code", "1.0.19");
        } catch (Exception unused) {
        }
        lr9Var.success(jSONObject);
    }
}
