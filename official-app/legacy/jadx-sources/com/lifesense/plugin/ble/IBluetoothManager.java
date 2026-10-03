package com.lifesense.plugin.ble;

import android.content.Context;
import com.lifesense.plugin.ble.data.IBManagerConfig;
import com.lifesense.plugin.ble.data.LSConnectState;
import com.lifesense.plugin.ble.data.LSDataQueryRequest;
import com.lifesense.plugin.ble.data.LSDeviceInfo;
import com.lifesense.plugin.ble.data.LSDeviceMessage;
import com.lifesense.plugin.ble.data.LSDevicePairSetting;
import com.lifesense.plugin.ble.data.LSDeviceSyncSetting;
import com.lifesense.plugin.ble.data.LSManagerStatus;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface IBluetoothManager {
    public static final boolean DEBUG_MODE_PERMISSION = false;
    public static final String DEBUG_MODE_PERMISSION_OF_FILE = "AndroidPermission.ser";
    public static final int DEFAULT_BLUETOOTH_STATE = 255;
    public static final String VERSION = "v2.2.4 build8-OTA";
    public static final String VERSION_TIMESTAMP = "20210129";

    boolean addDevice(LSDeviceInfo lSDeviceInfo);

    void appendDebugMessage(String str);

    boolean cancelDevicePairing(LSDeviceInfo lSDeviceInfo);

    void cancelDeviceUpgrading(String str);

    void cancelFileUpdating(String str, LSDeviceSyncSetting lSDeviceSyncSetting, OnSettingListener onSettingListener);

    LSConnectState checkConnectState(String str);

    byte[] computeCRC32(byte[] bArr);

    boolean deleteDevice(String str);

    void enableFileLogging(boolean z, String str, String str2);

    List getDevices();

    LSManagerStatus getManagerStatus();

    String getVersion();

    boolean initManager(Context context);

    boolean isBluetoothAvailable();

    boolean isSupportBLE();

    void openDebugMode(String str);

    boolean pairDevice(LSDeviceInfo lSDeviceInfo, OnPairingListener onPairingListener);

    @Deprecated
    void pushDeviceMessage(String str, LSDeviceMessage lSDeviceMessage);

    void pushDeviceMessage(String str, LSDeviceMessage lSDeviceMessage, OnSettingListener onSettingListener);

    int pushPairSetting(String str, LSDevicePairSetting lSDevicePairSetting);

    void pushSyncSetting(String str, LSDeviceSyncSetting lSDeviceSyncSetting, OnSettingListener onSettingListener);

    void queryDeviceData(String str, LSDataQueryRequest lSDataQueryRequest, OnSettingListener onSettingListener);

    void readDeviceBattery(String str, OnReadingListener onReadingListener);

    void readImageMessageAbility(String str, OnReadingListener onReadingListener);

    void registerBluetoothReceiver(Context context);

    void resetSyncingListener(OnSyncingListener onSyncingListener);

    boolean searchDevice(List list, OnSearchingListener onSearchingListener);

    boolean setDevices(List list);

    void setManagerConfig(IBManagerConfig iBManagerConfig);

    boolean startDeviceSync(OnSyncingListener onSyncingListener);

    boolean stopDeviceSync();

    boolean stopSearch();

    void unregisterBluetoothReceiver();

    void updatePhoneGpsStatus(boolean z);

    @Deprecated
    void upgradeDevice(String str, File file, OnUpgradingListener onUpgradingListener);
}
