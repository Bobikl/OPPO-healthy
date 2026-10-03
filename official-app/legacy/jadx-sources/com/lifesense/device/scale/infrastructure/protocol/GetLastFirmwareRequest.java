package com.lifesense.device.scale.infrastructure.protocol;

import com.lifesense.device.scale.infrastructure.entity.Device;
import com.lifesense.weidong.lzsimplenetlibs.base.BaseRequest;

/* JADX INFO: loaded from: classes4.dex */
public class GetLastFirmwareRequest extends BaseRequest {
    public static final String kRequestParam_DeviceId = "deviceId";
    public static final String kRequestParam_HardwareVersion = "hardwareVersion";
    public static final String kRequestParam_Model = "model";
    public static final String kRequestParam_SoftwareVersion = "softwareVersion";

    public GetLastFirmwareRequest(Device device) {
        setRequestMethod("POST");
        addStringValue("model", "智能体脂秤");
        addStringValue("hardwareVersion", device.getHardwareVersion());
        addStringValue("softwareVersion", device.getOtaVersion());
        addStringValue("deviceId", device.getId());
    }

    @Override // com.lifesense.weidong.lzsimplenetlibs.base.BaseRequest
    public String getResponseClassName() {
        return GetLastFirmwareResponse.class.getName();
    }

    @Override // com.lifesense.weidong.lzsimplenetlibs.base.BaseRequest
    public String getUrlWithoutProtocol() {
        return "/device_service/device_info/getLastFirmware";
    }
}
