package com.lifesense.device.scale.infrastructure.protocol;

import com.lifesense.weidong.lzsimplenetlibs.base.BaseRequest;

/* JADX INFO: loaded from: classes4.dex */
public class SetUnitRequest extends BaseRequest {
    public static final String kRequestParam_DeviceId = "deviceId";
    public static final String kRequestParam_Unit = "unit";

    public SetUnitRequest(int i, String str) {
        setRequestMethod("POST");
        addStringValue("deviceId", str);
        addIntValue("unit", i);
    }

    @Override // com.lifesense.weidong.lzsimplenetlibs.base.BaseRequest
    public String getResponseClassName() {
        return SetUnitResponse.class.getName();
    }

    @Override // com.lifesense.weidong.lzsimplenetlibs.base.BaseRequest
    public String getUrlWithoutProtocol() {
        return "/device_service/device_info/setUnit";
    }
}
