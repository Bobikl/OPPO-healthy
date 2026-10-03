package com.lifesense.android.bluetooth.core.business.sync;

import com.lifesense.android.bluetooth.core.OnDeviceReadListener;
import com.lifesense.android.bluetooth.core.ReceiveDataCallback;
import com.lifesense.android.bluetooth.core.bean.LsDeviceInfo;
import com.lifesense.android.bluetooth.core.bean.constant.DeviceConnectState;
import com.lifesense.android.bluetooth.core.bean.constant.GattServiceType;
import com.lifesense.android.bluetooth.core.bean.constant.ManagerStatus;
import com.lifesense.android.bluetooth.core.business.d;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b extends d {
    public static final int MSG_CALL_BACK_BLUETOOTH_GATT_STATUS_CHANGE = 14;
    public static final int MSG_CALL_BACK_DATA_UPLOAD_STATUS_CHANGE = 13;
    public static final int MSG_CALL_BACK_DEVICE_INFO = 7;
    public static final int MSG_CALL_BACK_MEASURE_DATA = 17;
    public static final int MSG_CALL_BACK_USER_INFO = 16;
    public static final int MSG_CALL_BACK_USER_INFO_WRITE_SUCCESS = 12;
    public static final int MSG_CALL_SERVICE_STATUS = 4;
    public static final int MSG_CONNECTION_STATUS = 5;
    public static final int MSG_DEVICE_INFO = 3;
    public static final int MSG_MEASURE_DATA = 2;
    public static final int MSG_MEASURE_DATA_LSA6 = 18;
    public static final int MSG_SCAN_RESULTS = 1;
    public static final int MSG_SEND_PHONE_STATE_MESSAGE = 15;

    public abstract boolean addDevice(LsDeviceInfo lsDeviceInfo);

    public abstract void cancelAllLongConnection();

    public abstract void cancelStartMeasuring(String str);

    public abstract DeviceConnectState checkConnectState(String str);

    public abstract boolean checkHandlePermission();

    public abstract void connectDevice(LsDeviceInfo lsDeviceInfo, ReceiveDataCallback receiveDataCallback);

    public abstract boolean deleteDevice(String str);

    public abstract void destoryInstance();

    public abstract ManagerStatus getDevicesCentreStatus();

    public abstract Map<String, LsDeviceInfo> getMeasuredDeviceMap();

    public abstract com.lifesense.android.bluetooth.core.protocol.worker.a getProtocolHandler(String str);

    public abstract boolean isDisableConnectDevice(String str);

    public abstract boolean isDisableDataSyncDevice(String str);

    public abstract void readDeviceVoltage(String str, OnDeviceReadListener onDeviceReadListener);

    public abstract void registerDataSyncListener(ReceiveDataCallback receiveDataCallback);

    public abstract void restartDataSyncService();

    public abstract boolean setDevicelist(List<LsDeviceInfo> list);

    public abstract boolean startDataSyncService(ReceiveDataCallback receiveDataCallback);

    public abstract boolean stopDataSyncService();

    public abstract void updateDeviceConnectionMode(List<String> list, GattServiceType gattServiceType);
}
