package com.lifesense.device.scale.utils;

import android.text.TextUtils;
import android.util.Log;
import com.lifesense.android.bluetooth.core.LsBleManager;
import com.lifesense.android.bluetooth.core.bean.LsDeviceInfo;
import com.lifesense.android.bluetooth.core.bean.constant.DeviceType;
import com.lifesense.device.scale.infrastructure.entity.Device;

/* JADX INFO: loaded from: classes4.dex */
public class e {
    public static LsDeviceInfo a(Device device) {
        LsDeviceInfo lsDeviceInfo = new LsDeviceInfo();
        lsDeviceInfo.setDeviceId(device.getId());
        DeviceType deviceType = device.getDeviceType();
        lsDeviceInfo.setDeviceType(deviceType.getId());
        lsDeviceInfo.setBroadcastID(device.getMac());
        lsDeviceInfo.setModelNumber(device.getModel());
        lsDeviceInfo.setHardwareVersion(device.getHardwareVersion());
        lsDeviceInfo.setFirmwareVersion(device.getOtaVersion());
        lsDeviceInfo.setMacAddress(device.getMacConvert());
        lsDeviceInfo.setSn(device.getSn());
        lsDeviceInfo.setProtocolType(deviceType.getProtocolTypeList().get(0).name());
        if (TextUtils.isEmpty(lsDeviceInfo.getProtocolType())) {
            Log.e("ObjectConvertTools ", "failed to parse device protocol....");
        }
        return lsDeviceInfo;
    }

    public static void a(Object obj) {
        String str = "onReceive" + obj.getClass().getSimpleName() + ":" + obj.toString();
        a.b(str);
        LsBleManager.getInstance().setLogMessage(str);
    }
}
