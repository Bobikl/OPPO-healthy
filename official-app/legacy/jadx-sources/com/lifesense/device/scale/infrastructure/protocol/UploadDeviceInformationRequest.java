package com.lifesense.device.scale.infrastructure.protocol;

import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.lifesense.android.bluetooth.scale.bean.WeightData_A3;
import com.lifesense.device.scale.infrastructure.entity.Device;
import com.lifesense.device.scale.infrastructure.entity.DeviceSetting;
import com.lifesense.weidong.lzsimplenetlibs.base.BaseRequest;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.collections4.CollectionUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class UploadDeviceInformationRequest extends BaseRequest {
    public static final String kRequestParam_DeviceSettings = "deviceSettings";
    public static final String kRequestParam_Devices = "devices";
    public List<DeviceSetting> deviceSettings;
    public List<Device> devices;

    public UploadDeviceInformationRequest(List<Device> list, List<DeviceSetting> list2) {
        setRequestMethod("POST");
        if (CollectionUtils.isNotEmpty(list)) {
            JSONArray jSONArray = new JSONArray();
            Iterator<Device> it = list.iterator();
            while (it.hasNext()) {
                try {
                    jSONArray.put(new JSONObject(JSON.toJSONString(it.next())));
                } catch (JSONException e2) {
                    Log.e(WeightData_A3.IMPEDANCE_STATUS_ERROR, e2.getMessage(), e2);
                }
            }
            addValue("devices", jSONArray);
        }
        if (CollectionUtils.isNotEmpty(list2)) {
            JSONArray jSONArray2 = new JSONArray();
            Iterator<DeviceSetting> it2 = list2.iterator();
            while (it2.hasNext()) {
                try {
                    jSONArray2.put(new JSONObject(JSON.toJSONString(it2.next())));
                } catch (JSONException e3) {
                    Log.e(WeightData_A3.IMPEDANCE_STATUS_ERROR, e3.getMessage(), e3);
                }
            }
            addValue(kRequestParam_DeviceSettings, jSONArray2);
        }
        this.devices = list;
        this.deviceSettings = list2;
    }

    public List<DeviceSetting> getDeviceSettings() {
        return this.deviceSettings;
    }

    public List<Device> getDevices() {
        return this.devices;
    }

    @Override // com.lifesense.weidong.lzsimplenetlibs.base.BaseRequest
    public String getResponseClassName() {
        return UploadDeviceInformationResponse.class.getName();
    }

    @Override // com.lifesense.weidong.lzsimplenetlibs.base.BaseRequest
    public String getUrlWithoutProtocol() {
        return "/device_service/sync/upload";
    }
}
