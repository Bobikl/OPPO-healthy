package com.lifesense.device.scale.application.interfaces;

import android.content.Context;
import com.lifesense.android.bluetooth.core.OnDeviceReadListener;
import com.lifesense.android.bluetooth.core.OnSettingCallBack;
import com.lifesense.android.bluetooth.scale.enums.HeartRateSwitch;
import com.lifesense.android.bluetooth.scale.enums.UnitType;
import com.lifesense.device.scale.application.interfaces.callback.BleReceiveCallback;
import com.lifesense.device.scale.application.interfaces.callback.OnCheckUpgradeCallback;
import com.lifesense.device.scale.application.interfaces.listener.UpgradeStateListener;
import com.lifesense.device.scale.infrastructure.entity.Device;
import com.lifesense.device.scale.login.User;
import com.lifesense.weidong.lzsimplenetlibs.net.callback.IRequestCallBack;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface ILZDeviceService extends ILZDeviceBindService {

    public interface OnSyncDeviceCallback {
        void onSyncDeviceFailed(int i, String str);

        void onSyncDeviceSuccess(List<Device> list);
    }

    void checkDeviceFirmwareUpgrade(String str, OnCheckUpgradeCallback onCheckUpgradeCallback);

    void destroy();

    void getConnectedWifiInfo(String str);

    User getCurrentUser();

    int getHeartRateSwitch(String str);

    int getUnit(String str);

    void getWifiConnectStatus(String str);

    void init(Context context, BleReceiveCallback bleReceiveCallback);

    void interruptUpgradeDeviceFirmware(String str);

    void login(Context context, int i, int i2, String str, IRequestCallBack iRequestCallBack);

    void logout();

    String queryConfigedWifiSsid(String str);

    void readDeviceVoltage(String str, OnDeviceReadListener onDeviceReadListener);

    void resetWifi(String str);

    void setHeartRateSwitch(String str, HeartRateSwitch heartRateSwitch, OnSettingCallBack onSettingCallBack);

    void setUnit(String str, UnitType unitType, OnSettingCallBack onSettingCallBack);

    void startConfigWifi(String str, String str2, String str3, byte[] bArr, int i);

    void startScanWifi(String str);

    void syncDeviceFromService(OnSyncDeviceCallback onSyncDeviceCallback);

    void upgradeDeviceFirmware(String str, String str2, UpgradeStateListener upgradeStateListener);
}
