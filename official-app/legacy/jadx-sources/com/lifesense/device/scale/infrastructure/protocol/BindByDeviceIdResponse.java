package com.lifesense.device.scale.infrastructure.protocol;

import com.alibaba.fastjson.JSON;
import com.lifesense.device.scale.infrastructure.bean.BindRespondData;
import com.lifesense.weidong.lzsimplenetlibs.net.invoker.JsonResponse;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class BindByDeviceIdResponse extends JsonResponse {
    public BindRespondData mBindRespondData;

    public BindRespondData getBindRespondData() {
        return this.mBindRespondData;
    }

    @Override // com.lifesense.weidong.lzsimplenetlibs.net.invoker.JsonResponse
    public void parseJsonData(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.mBindRespondData = (BindRespondData) JSON.parseObject(jSONObject.toString(), BindRespondData.class);
    }
}
