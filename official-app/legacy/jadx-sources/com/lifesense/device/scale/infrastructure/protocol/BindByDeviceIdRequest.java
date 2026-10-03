package com.lifesense.device.scale.infrastructure.protocol;

import com.lifesense.weidong.lzsimplenetlibs.base.BaseRequest;

/* JADX INFO: loaded from: classes4.dex */
public class BindByDeviceIdRequest extends BaseRequest {
    public static final String kRequestParam_DeviceId = "deviceId";
    public static final String kRequestParam_UserId = "userId";

    public BindByDeviceIdRequest(String str, long j2) {
        setRequestMethod("POST");
        addStringValue("deviceId", str);
        addLongValue("userId", Long.valueOf(j2));
    }

    @Override // com.lifesense.weidong.lzsimplenetlibs.base.BaseRequest
    public String getResponseClassName() {
        return BindByDeviceIdResponse.class.getName();
    }

    @Override // com.lifesense.weidong.lzsimplenetlibs.base.BaseRequest
    public String getUrlWithoutProtocol() {
        return "/device_service/device_user/bind_by_deviceid";
    }
}
