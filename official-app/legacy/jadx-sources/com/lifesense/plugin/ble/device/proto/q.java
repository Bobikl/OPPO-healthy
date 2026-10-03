package com.lifesense.plugin.ble.device.proto;

import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import com.lifesense.plugin.ble.data.LSConnectState;
import com.lifesense.plugin.ble.data.LSDeviceInfo;
import com.lifesense.plugin.ble.data.LSUpgradeState;
import java.util.Queue;

/* JADX INFO: loaded from: classes5.dex */
public interface q {
    public static final String DEFAULT_PUSH_PACKET_SERILNUMBER = "8000";
    public static final String KEY_CHARACTERISTIC_UUID = "DataCharacteristic";
    public static final String KEY_DATA = "DataBytes";
    public static final String KEY_SERVICE_UUID = "DataService";
    public static final String MOMBO_PLUS_COMMAND_VERSION = "AA01";
    public static final int MSG_CALLBACKS_DATA_PACKET = 1;
    public static final int MSG_CALLBACK_IMAGE_INFO = 5;
    public static final int MSG_CALLBACK_MEASURE_DATA = 2;
    public static final int MSG_CALLBACK_UPGRADE_PROGRESS = 3;
    public static final int MSG_CALLBACK_USER_INFO = 4;
    public static final int MSG_CALLBACK_VOLTAGE = 3;
    public static final int MSG_PARSE_DATA_PACKAGE = 2;
    public static final int MSG_WRITE_FILE_DATA = 1;
    public static final String RESPONSE_FAILED = "00";
    public static final String RESPONSE_SUCCESS = "01";
    public static final int WRITE_CHARACTERISTIC_TIMEOUT = 15000;

    String a();

    void a(BluetoothDevice bluetoothDevice, Queue queue, boolean z, com.lifesense.plugin.ble.device.a.c cVar);

    void a(com.lifesense.plugin.ble.device.a.b bVar);

    void a(String str, Queue queue, com.lifesense.plugin.ble.device.a.c cVar);

    void b();

    int c();

    LSUpgradeState d();

    LSConnectState h();

    void k();

    LSDeviceInfo l();

    com.lifesense.plugin.ble.a.a.o m();

    Handler n();

    Queue o();
}
