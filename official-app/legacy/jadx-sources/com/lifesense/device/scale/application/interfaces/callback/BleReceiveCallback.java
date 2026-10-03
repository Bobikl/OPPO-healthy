package com.lifesense.device.scale.application.interfaces.callback;

import android.util.Log;
import com.lifesense.android.bluetooth.core.LsBleManager;
import com.lifesense.android.bluetooth.core.ReceiveDataCallback;
import com.lifesense.android.bluetooth.core.bean.BaseDeviceData;
import com.lifesense.android.bluetooth.core.bean.LsDeviceInfo;
import com.lifesense.android.bluetooth.core.bean.WifiInfo;
import com.lifesense.android.bluetooth.core.bean.constant.DeviceConnectState;
import com.lifesense.android.bluetooth.core.enums.WifiState;
import com.lifesense.android.bluetooth.scale.bean.WeightData_A3;
import com.lifesense.device.scale.application.interfaces.listener.OnDataReceiveListener;
import com.lifesense.device.scale.application.interfaces.listener.OnDeviceConnectStateListener;
import com.lifesense.device.scale.infrastructure.entity.Device;
import com.lifesense.device.scale.infrastructure.entity.DeviceSetting;
import com.lifesense.device.scale.infrastructure.net.DeviceNetManager;
import com.lifesense.device.scale.infrastructure.protocol.UploadDeviceInformationResponse;
import com.lifesense.device.scale.utils.b;
import com.lifesense.device.scale.utils.e;
import com.lifesense.weidong.lzsimplenetlibs.net.callback.IRequestCallBack;
import java.util.Arrays;
import java.util.Date;
import java.util.UUID;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes4.dex */
public class BleReceiveCallback extends ReceiveDataCallback {
    public OnDeviceConnectStateListener connectStateListener;
    public OnDataReceiveListener receiveListener;

    private void updateSettingsToServer(DeviceSetting deviceSetting) {
        DeviceNetManager.getInstance().updateDeviceInformation(null, Arrays.asList(deviceSetting), new IRequestCallBack<UploadDeviceInformationResponse>() { // from class: com.lifesense.device.scale.application.interfaces.callback.BleReceiveCallback.1
            @Override // com.lifesense.weidong.lzsimplenetlibs.net.callback.IRequestCallBack
            public void onRequestError(int i, String str, UploadDeviceInformationResponse uploadDeviceInformationResponse) {
            }

            @Override // com.lifesense.weidong.lzsimplenetlibs.net.callback.IRequestCallBack
            public void onRequestSuccess(UploadDeviceInformationResponse uploadDeviceInformationResponse) {
            }
        });
    }

    public OnDeviceConnectStateListener getConnectStateListener() {
        return this.connectStateListener;
    }

    public OnDataReceiveListener getReceiveListener() {
        return this.receiveListener;
    }

    @Override // com.lifesense.android.bluetooth.core.ReceiveDataCallback
    public void onDeviceConnectStateChange(DeviceConnectState deviceConnectState, String str) {
        Log.e("sky-test", "onDeviceManager callback >> mac=" + str + "   >>连接状态改变:" + deviceConnectState);
        b.a(deviceConnectState, str, this.connectStateListener);
    }

    @Override // com.lifesense.android.bluetooth.core.ReceiveDataCallback
    public void onReceiveDeviceInfo(LsDeviceInfo lsDeviceInfo) {
        super.onReceiveDeviceInfo(lsDeviceInfo);
        if (lsDeviceInfo != null) {
            e.a(lsDeviceInfo);
        } else {
            LsBleManager.getInstance().setLogMessage("onReceiveDeviceInfo :null");
        }
        b.a(lsDeviceInfo);
    }

    @Override // com.lifesense.android.bluetooth.core.ReceiveDataCallback
    public void onReceiveDeviceMeasureData(BaseDeviceData baseDeviceData) {
        boolean z = baseDeviceData instanceof WeightData_A3;
        OnDataReceiveListener onDataReceiveListener = this.receiveListener;
        if (z) {
            b.a(baseDeviceData, onDataReceiveListener);
        } else {
            baseDeviceData.onReceiveDataCallback(onDataReceiveListener);
        }
    }

    @Override // com.lifesense.android.bluetooth.core.ReceiveDataCallback
    public void onReceiveWifiConfigInfo(String str, int i, String str2) {
        Device deviceB = com.lifesense.device.scale.infrastructure.repository.e.a().b(str);
        if (deviceB != null && StringUtils.isNotEmpty(str2)) {
            DeviceSetting deviceSettingA = com.lifesense.device.scale.infrastructure.repository.e.b().a(deviceB.getId(), WifiInfo.class.getSimpleName());
            if (deviceSettingA == null) {
                deviceSettingA = new DeviceSetting();
                deviceSettingA.setContent(str2);
                deviceSettingA.setDeviceId(deviceB.getId());
                deviceSettingA.setSettingTime(System.currentTimeMillis());
                deviceSettingA.setUpdated(System.currentTimeMillis());
                deviceSettingA.setSettingClass(WifiInfo.class.getSimpleName());
                deviceSettingA.setId(UUID.randomUUID().toString());
                deviceSettingA.setCreated(new Date());
            } else if (!str2.equals(deviceSettingA.getContent())) {
                deviceSettingA.setContent(str2);
            }
            com.lifesense.device.scale.infrastructure.repository.e.b().a(deviceSettingA);
            updateSettingsToServer(deviceSettingA);
        }
        this.connectStateListener.onReceiveWifiConfigInfo(i, str2);
    }

    @Override // com.lifesense.android.bluetooth.core.ReceiveDataCallback
    public void onReceiveWifiConnectState(String str, WifiState wifiState) {
        Device deviceB = com.lifesense.device.scale.infrastructure.repository.e.a().b(str);
        if (deviceB != null && wifiState == WifiState.CONNECTED) {
            DeviceSetting deviceSettingA = com.lifesense.device.scale.infrastructure.repository.e.b().a(deviceB.getId(), WifiInfo.class.getSimpleName() + "-temp");
            DeviceSetting deviceSettingA2 = com.lifesense.device.scale.infrastructure.repository.e.b().a(deviceB.getId(), WifiInfo.class.getSimpleName());
            if (deviceSettingA != null && System.currentTimeMillis() - deviceSettingA.getSettingTime() < 10000 && (deviceSettingA2 == null || !deviceSettingA.getContent().equals(deviceSettingA2.getContent()))) {
                deviceSettingA.setContent(deviceSettingA.getContent());
                deviceSettingA.setDeviceId(deviceB.getId());
                deviceSettingA.setSettingTime(System.currentTimeMillis());
                deviceSettingA.setUpdated(System.currentTimeMillis());
                deviceSettingA.setSettingClass(WifiInfo.class.getSimpleName());
                deviceSettingA.setId(UUID.randomUUID().toString());
                deviceSettingA.setCreated(new Date());
                com.lifesense.device.scale.infrastructure.repository.e.b().a(deviceSettingA);
                updateSettingsToServer(deviceSettingA);
            }
        }
        this.connectStateListener.onReceiveWifiConnectState(wifiState);
    }

    @Override // com.lifesense.android.bluetooth.core.ReceiveDataCallback
    public void onReceiveWifiScanEnd() {
        this.connectStateListener.onReceiveWifiScanEnd();
    }

    @Override // com.lifesense.android.bluetooth.core.ReceiveDataCallback
    public void onReceiveWifiScanResult(String str, WifiInfo wifiInfo) {
        this.connectStateListener.onReceiveWifiScanResult(wifiInfo);
    }

    public void setConnectStateListener(OnDeviceConnectStateListener onDeviceConnectStateListener) {
        this.connectStateListener = onDeviceConnectStateListener;
    }

    public void setReceiveListener(OnDataReceiveListener onDataReceiveListener) {
        this.receiveListener = onDataReceiveListener;
    }
}
