package com.lifesense.device.scale.infrastructure.protocol;

import com.alibaba.fastjson.JSON;
import com.lifesense.device.scale.device.dto.device.FirmwareInfo;
import com.lifesense.weidong.lzsimplenetlibs.net.invoker.JsonResponse;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class GetLastFirmwareResponse extends JsonResponse {
    public FirmwareInfo info;

    public FirmwareInfo getFirmwareInfo() {
        return this.info;
    }

    @Override // com.lifesense.weidong.lzsimplenetlibs.net.invoker.JsonResponse
    public void parseJsonData(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.info = (FirmwareInfo) JSON.parseObject(jSONObject.toString(), FirmwareInfo.class);
    }
}
