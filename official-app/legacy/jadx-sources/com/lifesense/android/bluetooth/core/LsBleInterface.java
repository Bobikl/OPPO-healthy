package com.lifesense.android.bluetooth.core;

import android.content.Context;
import com.lifesense.android.bluetooth.core.bean.LsDeviceInfo;
import com.lifesense.android.bluetooth.core.bean.constant.BroadcastType;
import com.lifesense.android.bluetooth.core.bean.constant.DeviceConfigInfoType;
import com.lifesense.android.bluetooth.core.bean.constant.DeviceConnectState;
import com.lifesense.android.bluetooth.core.bean.constant.DeviceRegisterState;
import com.lifesense.android.bluetooth.core.bean.constant.DeviceType;
import com.lifesense.android.bluetooth.core.bean.constant.GattServiceType;
import com.lifesense.android.bluetooth.core.bean.constant.ManagerStatus;
import com.lifesense.android.bluetooth.core.bean.constant.OperationCommand;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface LsBleInterface {
    public static final String BLUETOOTH_SDK_VERSION = "ble_module_v1.6.1 formal1 20180806 ";
    public static final int DEFAULT_BLUETOOTH_STATE = 255;
    public static final String PERMISSION_OBJECT_FILE_NAME = "AndroidPermission.ser";
    public static final boolean PERMISSION_SDK = false;
    public static final String PERMISSION_WRITE_LOG_FILE = "lifesense bluetooth";

    boolean addMeasureDevice(LsDeviceInfo lsDeviceInfo);

    boolean cancelDevicePairing(LsDeviceInfo lsDeviceInfo);

    boolean checkBluetoothScanFunction();

    DeviceConnectState checkDeviceConnectState(String str);

    void connectDeviceWithAddress(LsDeviceInfo lsDeviceInfo, ReceiveDataCallback receiveDataCallback);

    boolean deleteMeasureDevice(String str);

    void destroyAllResources();

    void disableDeviceDataSync(List<String> list);

    void enableDeviceDataSync(List<String> list);

    void enableWriteDebugMessageToFiles(boolean z, String str);

    void getDeviceConfigInfo(String str, DeviceConfigInfoType deviceConfigInfoType, OnConfigInfoListener onConfigInfoListener);

    ManagerStatus getLsBleManagerStatus();

    void getWifiConnectStatus(String str);

    boolean hasInitialized();

    boolean initialize(Context context);

    int inputOperationCommand(String str, OperationCommand operationCommand, Object obj);

    void interruptUpgradeProcess(String str);

    void isConfigWifi(String str);

    boolean isOpenBluetooth();

    boolean isSupportLowEnergy();

    boolean pairingWithDevice(LsDeviceInfo lsDeviceInfo, PairCallback pairCallback);

    void readDeviceVoltage(String str, OnDeviceReadListener onDeviceReadListener);

    void registerBluetoothBroadcastReceiver(Context context);

    void registerConnectExceptionListener(OnConnectExceptionListener onConnectExceptionListener);

    void registerDataSyncCallback(ReceiveDataCallback receiveDataCallback);

    void registeringDeviceID(String str, String str2, DeviceRegisterState deviceRegisterState);

    void resetWifi(String str);

    boolean searchLsDevice(SearchCallback searchCallback, List<DeviceType> list, BroadcastType broadcastType);

    void setBlelogFilePath(String str, String str2, String str3);

    void setDebugMode(String str);

    void setEnableGattServiceType(String str, GattServiceType gattServiceType);

    void setLogMessage(String str);

    boolean setMeasureDevice(List<LsDeviceInfo> list);

    void setReceiveDataCallback(ReceiveDataCallback receiveDataCallback);

    void startConfigWifi(String str, String str2, byte[] bArr, int i);

    boolean startDataReceiveService(ReceiveDataCallback receiveDataCallback);

    void startScanWifi(String str);

    boolean stopDataReceiveService();

    boolean stopSearch();

    boolean unbindWithDevice(LsDeviceInfo lsDeviceInfo, PairCallback pairCallback);

    void unregisterBluetoothBroadcastReceiver();

    void unregisterConnectExceptionListener();

    void updateWeightScaleSetting(String str, DeviceConfigInfoType deviceConfigInfoType, Object obj, OnSettingCallBack onSettingCallBack);

    void upgradeDeviceFirmware(LsDeviceInfo lsDeviceInfo, File file, OnDeviceUpgradeListener onDeviceUpgradeListener);
}
