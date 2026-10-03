package com.lifesense.device.scale.infrastructure.protocol;

import com.lifesense.android.bluetooth.core.bean.LsDeviceInfo;
import com.lifesense.weidong.lzsimplenetlibs.base.BaseRequest;

/* JADX INFO: loaded from: classes4.dex */
public class ApplyDeviceIdRequest extends BaseRequest {
    public static final String kRequestParam_CommunicationType = "communicationType";
    public static final String kRequestParam_HardwareVersion = "hardwareVersion";
    public static final String kRequestParam_Mac = "mac";
    public static final String kRequestParam_Model = "model";
    public static final String kRequestParam_Name = "name";
    public static final String kRequestParam_ProductTypeCode = "productTypeCode";
    public static final String kRequestParam_SalesModel = "salesModel";
    public static final String kRequestParam_VenderId = "venderId";
    public static final String kRequestParam_softwareVersion = "softwareVersion";

    public ApplyDeviceIdRequest(LsDeviceInfo lsDeviceInfo) {
        setRequestMethod("POST");
        addStringValue("mac", lsDeviceInfo.getMacAddress().replace(":", ""));
        addStringValue("hardwareVersion", lsDeviceInfo.getHardwareVersion());
        addStringValue("softwareVersion", lsDeviceInfo.getSoftwareVersion());
        addStringValue(kRequestParam_VenderId, lsDeviceInfo.getManufactureId());
        addStringValue("model", lsDeviceInfo.getDeviceName());
        addStringValue(kRequestParam_SalesModel, lsDeviceInfo.getManufactureName());
        addStringValue(kRequestParam_ProductTypeCode, lsDeviceInfo.getDeviceType());
        addStringValue("name", lsDeviceInfo.getModelNumber());
        addIntValue(kRequestParam_CommunicationType, 4);
    }

    @Override // com.lifesense.weidong.lzsimplenetlibs.base.BaseRequest
    public String getResponseClassName() {
        return ApplyDeviceIdResponse.class.getName();
    }

    @Override // com.lifesense.weidong.lzsimplenetlibs.base.BaseRequest
    public String getUrlWithoutProtocol() {
        return "/device_service/device_info/apply_device_id";
    }
}
