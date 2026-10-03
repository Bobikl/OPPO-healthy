package com.heytap.accessory.pair.connectivity.ble.callback;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattServer;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothManager;
import com.heytap.accessory.pair.common.CoreConstants;
import com.heytap.accessory.pair.connectivity.ble.interfaces.IGattServerEventListener;
import com.heytap.accessory.pair.connectivity.interfaces.IServerEventListener;
import com.heytap.accessory.pair.connectivity.interfaces.IServerInterface;
import com.heytap.accessory.pair.connectivity.param.connect.FPBleConParam;
import com.heytap.accessory.pair.logging.PairLog;
import com.heytap.accessory.pair.logging.SensitiveLogUtils;
import com.oplus.aiunit.vision.b78;
import java.util.UUID;

/* JADX INFO: loaded from: classes14.dex */
public class BleServerListener implements IServerInterface {
    private static final String TAG = "BleServerListener";
    private static volatile BleServerListener sBleServerListener;
    private IServerEventListener mServerEventListener;
    private int mMtuSize = 20;
    private BluetoothGattServer mBluetoothGattServer = null;
    private BluetoothDevice mClientDevice = null;
    private GattServerCallback mGattServerCallback = null;
    private BluetoothAdapter mBtAdapter = BluetoothAdapter.getDefaultAdapter();

    private BleServerListener() {
    }

    private void addService() {
        BluetoothManager bluetoothManager = (BluetoothManager) b78.a().getSystemService("bluetooth");
        if (bluetoothManager == null) {
            PairLog.e(TAG, "Failed to initialize BluetoothManager");
            return;
        }
        BluetoothAdapter adapter = bluetoothManager.getAdapter();
        this.mBtAdapter = adapter;
        if (adapter == null) {
            PairLog.e(TAG, "Init Failed mBtAdapter == null");
            updateError();
            return;
        }
        GattServerCallback gattServerCallback = GattServerCallback.getInstance();
        this.mGattServerCallback = gattServerCallback;
        if (gattServerCallback == null) {
            PairLog.e(TAG, "Failed retrieving Server callback! returning...");
            return;
        }
        gattServerCallback.registerDefaultListener(createGattServerEventListener());
        BluetoothGattService bluetoothGattService = new BluetoothGattService(CoreConstants.UUID_SERVICE_FAST_PAIR, 0);
        BluetoothGattCharacteristic bluetoothGattCharacteristic = new BluetoothGattCharacteristic(CoreConstants.UUID_CHARACTERISTIC_INITIALIZATION, 26, 17);
        UUID uuid = CoreConstants.CLIENT_CHARACTERISTIC_CONFIG;
        bluetoothGattCharacteristic.addDescriptor(new BluetoothGattDescriptor(uuid, 32));
        bluetoothGattService.addCharacteristic(bluetoothGattCharacteristic);
        BluetoothGattCharacteristic bluetoothGattCharacteristic2 = new BluetoothGattCharacteristic(CoreConstants.UUID_CHARACTERISTIC_KEY_BASED_PAIRING, 26, 17);
        bluetoothGattCharacteristic2.addDescriptor(new BluetoothGattDescriptor(uuid, 16));
        bluetoothGattService.addCharacteristic(bluetoothGattCharacteristic2);
        BluetoothGattCharacteristic bluetoothGattCharacteristic3 = new BluetoothGattCharacteristic(CoreConstants.UUID_CHARACTERISTIC_KSC_GENERATING, 26, 17);
        bluetoothGattCharacteristic3.addDescriptor(new BluetoothGattDescriptor(uuid, 32));
        bluetoothGattService.addCharacteristic(bluetoothGattCharacteristic3);
        BluetoothGattServer bluetoothGattServerOpenGattServer = bluetoothManager.openGattServer(b78.a(), this.mGattServerCallback);
        this.mBluetoothGattServer = bluetoothGattServerOpenGattServer;
        if (bluetoothGattServerOpenGattServer == null) {
            PairLog.e(TAG, "Failed to get GATT Server connection");
            PairLog.w(TAG, "Check if BT is ON");
        } else if (bluetoothGattServerOpenGattServer.addService(bluetoothGattService)) {
            PairLog.d(TAG, "Service Successfully Added");
        } else {
            PairLog.d(TAG, "Service Added failed");
        }
    }

    private IGattServerEventListener createGattServerEventListener() {
        return new IGattServerEventListener() { // from class: com.heytap.accessory.pair.connectivity.ble.callback.BleServerListener.1
            @Override // com.heytap.accessory.pair.connectivity.ble.interfaces.IGattServerEventListener
            public void onCharacteristicReadRequest(BluetoothDevice bluetoothDevice, int i, int i2, byte[] bArr) {
                PairLog.v(BleServerListener.TAG, "Discovery : onCharacteristicReadRequest");
                BleServerListener.this.mBluetoothGattServer.sendResponse(bluetoothDevice, i, 0, i2, bArr);
            }

            @Override // com.heytap.accessory.pair.connectivity.ble.interfaces.IGattServerEventListener
            public void onCharacteristicWriteRequest(BluetoothDevice bluetoothDevice, int i, boolean z, int i2, byte[] bArr) {
                PairLog.v(BleServerListener.TAG, "Discovery : onCharacteristicWriteRequest");
                if (z) {
                    BleServerListener.this.mBluetoothGattServer.sendResponse(bluetoothDevice, i, 0, i2, bArr);
                }
            }

            @Override // com.heytap.accessory.pair.connectivity.ble.interfaces.IGattServerEventListener
            public void onConnectionStateChanged(BluetoothDevice bluetoothDevice, int i) {
                PairLog.v(BleServerListener.TAG, "Discovery : onConnectionStateChanged newState = " + i + " device:" + SensitiveLogUtils.toHiddenIfNeed(bluetoothDevice.getAddress()));
                if (i == 2) {
                    PairLog.d(BleServerListener.TAG, "BluetoothProfile.STATE_CONNECTED");
                } else if (i == 0) {
                    PairLog.d(BleServerListener.TAG, "BluetoothProfile.STATE_DISCONNECTED");
                }
            }

            @Override // com.heytap.accessory.pair.connectivity.ble.interfaces.IGattServerEventListener
            public void onDescriptorReadRequest(BluetoothDevice bluetoothDevice, int i, int i2, byte[] bArr) {
                PairLog.v(BleServerListener.TAG, " onDescriptorReadRequest");
                BleServerListener.this.mBluetoothGattServer.sendResponse(bluetoothDevice, i, 0, i2, bArr);
            }

            @Override // com.heytap.accessory.pair.connectivity.ble.interfaces.IGattServerEventListener
            public void onDescriptorWriteRequest(BluetoothDevice bluetoothDevice, int i, boolean z, int i2, byte[] bArr) {
                PairLog.v(BleServerListener.TAG, "Discovery : onDescriptorWriteRequest");
                if (z) {
                    BleServerListener.this.mBluetoothGattServer.sendResponse(bluetoothDevice, i, 0, i2, bArr);
                }
                BleServerListener.this.mClientDevice = bluetoothDevice;
                BleServerListener.this.updateDevice();
            }

            @Override // com.heytap.accessory.pair.connectivity.ble.interfaces.IGattServerEventListener
            public void onMtuChanged(int i) {
                PairLog.v(BleServerListener.TAG, "onMtuChanged : " + i);
                if (i != BleServerListener.this.mMtuSize) {
                    BleServerListener.this.setMtuSize(i - 3);
                }
            }

            @Override // com.heytap.accessory.pair.connectivity.ble.interfaces.IGattServerEventListener
            public void onNotificationSent(BluetoothDevice bluetoothDevice, int i) {
                BleServerListener.this.mGattServerCallback.onNotificationSent(bluetoothDevice, i);
            }

            @Override // com.heytap.accessory.pair.connectivity.ble.interfaces.IGattServerEventListener
            public void onServiceAdded(int i, BluetoothGattService bluetoothGattService) {
                PairLog.v(BleServerListener.TAG, "Discovery : onServiceAdded " + bluetoothGattService.getUuid());
                if (CoreConstants.UUID_SERVICE_FAST_PAIR.equals(bluetoothGattService.getUuid())) {
                    BleServerListener.getInstance().mServerEventListener.onServicePrepared();
                }
            }
        };
    }

    public static BleServerListener getInstance() {
        if (sBleServerListener == null) {
            synchronized (BleServerListener.class) {
                if (sBleServerListener == null) {
                    sBleServerListener = new BleServerListener();
                }
            }
        }
        return sBleServerListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateDevice() {
        FPBleConParam fPBleConParam = new FPBleConParam(this.mClientDevice.getAddress());
        fPBleConParam.mDeviceName = this.mClientDevice.getName();
        fPBleConParam.mGattServer = this.mBluetoothGattServer;
        this.mServerEventListener.onConnectionAccepted(fPBleConParam);
    }

    private void updateError() {
        this.mServerEventListener.onError(-1107, null);
    }

    public int getMtuSize() {
        return this.mMtuSize;
    }

    @Override // com.heytap.accessory.pair.connectivity.interfaces.IServerInterface
    public void registerCallback(IServerEventListener iServerEventListener) {
        if (this.mServerEventListener == null) {
            this.mServerEventListener = iServerEventListener;
        }
    }

    public void setMtuSize(int i) {
        this.mMtuSize = i;
    }

    @Override // com.heytap.accessory.pair.connectivity.interfaces.IServerInterface
    public boolean start() {
        BluetoothAdapter bluetoothAdapter = this.mBtAdapter;
        if (bluetoothAdapter == null) {
            PairLog.w(TAG, "Bt Adapter is null");
            this.mServerEventListener.onError(-1104, null);
            return false;
        }
        if (!bluetoothAdapter.isEnabled()) {
            PairLog.d(TAG, "BT Is OFF");
            return false;
        }
        PairLog.d(TAG, "BT Is ON");
        addService();
        return true;
    }

    @Override // com.heytap.accessory.pair.connectivity.interfaces.IServerInterface
    public void stop() {
        PairLog.v(TAG, "Stop BLE Server");
        BluetoothGattServer bluetoothGattServer = this.mBluetoothGattServer;
        if (bluetoothGattServer != null) {
            BluetoothDevice bluetoothDevice = this.mClientDevice;
            if (bluetoothDevice != null) {
                bluetoothGattServer.cancelConnection(bluetoothDevice);
            }
            this.mBluetoothGattServer.clearServices();
            this.mBluetoothGattServer.close();
            this.mBluetoothGattServer = null;
        }
    }

    @Override // com.heytap.accessory.pair.connectivity.interfaces.IServerInterface
    public void unregisterCallback() {
        this.mServerEventListener = null;
    }
}
