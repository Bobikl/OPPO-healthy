package com.lifesense.device.scale.infrastructure.protocol;

import com.lifesense.weidong.lzsimplenetlibs.base.BaseRequest;

/* JADX INFO: loaded from: classes4.dex */
public class UnBindDeviceRequest extends BaseRequest {
    public static final String kRequestParam_DeviceId = "deviceId";
    public static final String kRequestParam_UserId = "userId";

    public UnBindDeviceRequest(String str, long j2) {
        setRequestMethod("POST");
        addStringValue("deviceId", str);
        addLongValue("userId", Long.valueOf(j2));
    }

    @Override // com.lifesense.weidong.lzsimplenetlibs.base.BaseRequest
    public String getResponseClassName() {
        return UnBindDeviceResponse.class.getName();
    }

    @Override // com.lifesense.weidong.lzsimplenetlibs.base.BaseRequest
    public String getUrlWithoutProtocol() {
        return "/device_service/device_user/unbind";
    }
}
