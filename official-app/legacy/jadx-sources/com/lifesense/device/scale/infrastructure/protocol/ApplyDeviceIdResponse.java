package com.lifesense.device.scale.infrastructure.protocol;

import com.lifesense.weidong.lzsimplenetlibs.net.invoker.JsonResponse;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class ApplyDeviceIdResponse extends JsonResponse {
    public String deviceId;
    public String mac;

    public String getDeviceId() {
        return this.deviceId;
    }

    public String getMac() {
        return this.mac;
    }

    @Override // com.lifesense.weidong.lzsimplenetlibs.net.invoker.JsonResponse
    public void parseJsonData(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            this.deviceId = jSONObject.getString("deviceId");
            this.mac = jSONObject.getString("mac");
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }
}
