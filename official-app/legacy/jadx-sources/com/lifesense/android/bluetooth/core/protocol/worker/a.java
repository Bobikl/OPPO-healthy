package com.lifesense.android.bluetooth.core.protocol.worker;

import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import com.lifesense.android.bluetooth.core.OnDeviceReadListener;
import com.lifesense.android.bluetooth.core.bean.LsDeviceInfo;
import com.lifesense.android.bluetooth.core.bean.constant.DeviceConnectState;
import com.lifesense.android.bluetooth.core.bean.constant.DeviceRegisterState;
import com.lifesense.android.bluetooth.core.bean.constant.DeviceUpgradeStatus;
import com.lifesense.android.bluetooth.core.bean.constant.PairedConfirmState;
import java.util.Queue;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public interface a {
    public static final String DEFAULT_PUSH_PACKET_SERILNUMBER = "8000";
    public static final String KEY_CHARACTERISTIC_UUID = "DataCharacteristic";
    public static final String KEY_DATA = "DataBytes";
    public static final String KEY_SERVICE_UUID = "DataService";
    public static final String MOMBO_PLUS_COMMAND_VERSION = "AA01";
    public static final int MSG_BLE_WIFI_CONFIG_DATA = 6;
    public static final int MSG_CALLBACKS_DATA_PACKET = 1;
    public static final int MSG_CALLBACK_MEASURE_DATA = 2;
    public static final int MSG_CALLBACK_UPGRADE_PROGRESS = 3;
    public static final int MSG_CALLBACK_USER_INFO = 4;
    public static final int MSG_CALLBACK_VOLTAGE = 3;
    public static final int MSG_PARSE_DATA_PACKAGE = 2;
    public static final int MSG_SENTREQUEST_TIMEOUT = 5;
    public static final int MSG_WRITE_FILE_DATA = 1;
    public static final String RESPONSE_FAILED = "00";
    public static final String RESPONSE_SUCCESS = "01";
    public static final int WRITE_CHARACTERISTIC_TIMEOUT = 15000;

    void clearWorkerHandler();

    void connectBluetoothDevice(BluetoothDevice bluetoothDevice, Queue<com.lifesense.android.bluetooth.core.protocol.stack.a> queue, boolean z, com.lifesense.android.bluetooth.core.business.b bVar);

    void connectDevice(String str, Queue<com.lifesense.android.bluetooth.core.protocol.stack.a> queue, com.lifesense.android.bluetooth.core.business.b bVar);

    void disconnect();

    LsDeviceInfo getCurrentDevice();

    DeviceConnectState getDeviceConnectState();

    String getSourceMacAddress();

    Queue<com.lifesense.android.bluetooth.core.protocol.stack.a> getUpgradeProtocolStack();

    DeviceUpgradeStatus getUpgradeStatus();

    Handler getWorkerHandler();

    void interrupt();

    void readDeviceVoltage(OnDeviceReadListener onDeviceReadListener);

    void registerDeviceCentreCallback(com.lifesense.android.bluetooth.core.business.a aVar);

    void setDeviceConnect(DeviceConnectState deviceConnectState);

    void setPairingConfirm(int i, PairedConfirmState pairedConfirmState);

    void setPairingDeviceId(String str, DeviceRegisterState deviceRegisterState);

    void setUnbindState(boolean z);

    void writeCommandToDevice(byte[] bArr, UUID uuid, UUID uuid2);
}
