package com.heytap.accessory.pair.connectivity.ble;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattServer;
import android.bluetooth.BluetoothGattService;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.heytap.accessory.pair.common.CoreConstants;
import com.heytap.accessory.pair.connectivity.ble.bean.FPBleDeviceInfo;
import com.heytap.accessory.pair.connectivity.ble.callback.GattServerCallback;
import com.heytap.accessory.pair.connectivity.ble.constant.BleConstants;
import com.heytap.accessory.pair.connectivity.ble.interfaces.IBleConnectionInterface;
import com.heytap.accessory.pair.connectivity.ble.interfaces.IBleConnectionListener;
import com.heytap.accessory.pair.connectivity.ble.interfaces.IGattServerEventListener;
import com.heytap.accessory.pair.connectivity.param.connect.FPBleConParam;
import com.heytap.accessory.pair.connectivity.param.message.FPBleMessageParam;
import com.heytap.accessory.pair.logging.PairLog;
import com.heytap.accessory.pair.provider.bleserver.utils.ProviderThreadManager;
import java.lang.ref.WeakReference;
import java.util.UUID;

/* JADX INFO: loaded from: classes14.dex */
public class BleServerConnection implements IBleConnectionInterface, IGattServerEventListener {
    private static final String TAG = "BleServerConnection";
    private FPBleDeviceInfo mBleDevice;
    private BluetoothGattServer mBluetoothGattServer;
    private FPBleConParam mFPBleConParam;
    private GattServerCallback mGattServerCallback;
    private IBleConnectionListener mListener;
    private ServerMessageHandler mServerMessageHandler;
    private String mThreadName;
    private int mStatus = 0;
    private int mErrorCode = 0;

    public static final class ServerMessageHandler extends Handler {
        private final WeakReference<BleServerConnection> mServer;

        public ServerMessageHandler(Looper looper, BleServerConnection bleServerConnection) {
            super(looper);
            this.mServer = new WeakReference<>(bleServerConnection);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            BleServerConnection bleServerConnection = this.mServer.get();
            if (bleServerConnection == null) {
                PairLog.e(BleServerConnection.TAG, "MessageHandler() : reference to AFBleServerDevice is null! returning...");
                return;
            }
            if (message.what != 11) {
                PairLog.e(BleServerConnection.TAG, "Server gatt callback unknown event received =" + message);
                return;
            }
            int i = message.arg1;
            if (i == 2) {
                PairLog.v(BleServerConnection.TAG, "BluetoothProfile.STATE_CONNECTED");
                return;
            }
            if (i == 0) {
                PairLog.v(BleServerConnection.TAG, "BluetoothProfile.STATE_DISCONNECTED");
                if (bleServerConnection.mStatus != 2) {
                    bleServerConnection.mStatus = 3;
                    PairLog.w(BleServerConnection.TAG, "Server onConnectionStateChanged called of IConnectionEventListener " + bleServerConnection.mListener + " " + bleServerConnection.mStatus + " " + bleServerConnection.mErrorCode);
                    if (bleServerConnection.mListener != null) {
                        bleServerConnection.mListener.onConnectionStateChanged(bleServerConnection.mStatus, bleServerConnection.mErrorCode);
                    }
                }
            }
        }
    }

    public BleServerConnection(FPBleConParam fPBleConParam, IBleConnectionListener iBleConnectionListener) {
        this.mFPBleConParam = fPBleConParam;
        this.mListener = iBleConnectionListener;
    }

    @Override // com.heytap.accessory.pair.connectivity.ble.interfaces.IBleConnectionInterface
    public void close() {
        if (this.mStatus == 2) {
            PairLog.v(TAG, "Already Connection closed return");
            return;
        }
        if (this.mGattServerCallback != null && this.mBleDevice != null) {
            PairLog.i(TAG, "Deregister the GattServer Callback");
            this.mGattServerCallback.deregisterListener(this.mBleDevice.getBLEDevice());
            this.mGattServerCallback = null;
        }
        if (this.mBluetoothGattServer != null) {
            PairLog.i(TAG, "mBluetoothGattServer cleaup");
            FPBleDeviceInfo fPBleDeviceInfo = this.mBleDevice;
            if (fPBleDeviceInfo != null && fPBleDeviceInfo.getBLEDevice() != null) {
                this.mBluetoothGattServer.cancelConnection(this.mBleDevice.getBLEDevice());
                this.mBleDevice.clear();
                this.mBleDevice = null;
            }
            this.mBluetoothGattServer = null;
        }
        ServerMessageHandler serverMessageHandler = this.mServerMessageHandler;
        if (serverMessageHandler != null) {
            serverMessageHandler.removeCallbacksAndMessages(null);
            ProviderThreadManager.getInstance().quitThread(this.mThreadName);
            this.mServerMessageHandler = null;
        }
        this.mStatus = 2;
        this.mErrorCode = 0;
    }

    @Override // com.heytap.accessory.pair.connectivity.ble.interfaces.IBleConnectionInterface
    public int connect() {
        this.mStatus = 0;
        this.mErrorCode = 0;
        this.mThreadName = ProviderThreadManager.getInstance().getThreadNameForConnection(1, "S", "MESSAGE_HANDLER", 0);
        Looper looper = ProviderThreadManager.getInstance().getLooper(this.mThreadName);
        if (looper != null) {
            this.mServerMessageHandler = new ServerMessageHandler(looper, this);
        }
        FPBleDeviceInfo fPBleDeviceInfo = new FPBleDeviceInfo();
        this.mBleDevice = fPBleDeviceInfo;
        this.mBluetoothGattServer = (BluetoothGattServer) this.mFPBleConParam.mGattServer;
        fPBleDeviceInfo.setBLEDevice(BluetoothAdapter.getDefaultAdapter().getRemoteDevice(this.mFPBleConParam.mAddress));
        if (this.mBluetoothGattServer == null) {
            PairLog.e(TAG, "BluetoothGattServer instance is null");
        } else {
            PairLog.i(TAG, "Retrieved DD's BluetoothGattServer");
            this.mStatus = 1;
            PairLog.v(TAG, "Register to GattServer Callback");
            GattServerCallback gattServerCallback = GattServerCallback.getInstance();
            this.mGattServerCallback = gattServerCallback;
            gattServerCallback.registerListener(this.mFPBleConParam.mAddress, this);
            BluetoothGattService service = this.mBluetoothGattServer.getService(CoreConstants.UUID_SERVICE_FAST_PAIR);
            if (service != null) {
                UUID[] uuidArr = {CoreConstants.UUID_CHARACTERISTIC_INITIALIZATION, CoreConstants.UUID_CHARACTERISTIC_KEY_BASED_PAIRING, CoreConstants.UUID_CHARACTERISTIC_KSC_GENERATING};
                for (int i = 0; i < 3; i++) {
                    UUID uuid = uuidArr[i];
                    this.mBleDevice.addCharac(uuid, service.getCharacteristic(uuid));
                }
            }
        }
        return this.mStatus;
    }

    @Override // com.heytap.accessory.pair.connectivity.ble.interfaces.IBleConnectionInterface
    public String getRemoteDeviceName() {
        FPBleDeviceInfo fPBleDeviceInfo = this.mBleDevice;
        if (fPBleDeviceInfo == null || fPBleDeviceInfo.getBLEDevice() == null) {
            return null;
        }
        return this.mBleDevice.getBLEDevice().getName();
    }

    @Override // com.heytap.accessory.pair.connectivity.ble.interfaces.IBleConnectionInterface
    public boolean isConnectionProper() {
        if (this.mBluetoothGattServer != null) {
            return true;
        }
        PairLog.e(TAG, "BluetoothGattServer instance is null");
        return false;
    }

    public boolean notifyCharacteristicChanged(BluetoothDevice bluetoothDevice, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return this.mBluetoothGattServer.notifyCharacteristicChanged(bluetoothDevice, bluetoothGattCharacteristic, false);
    }

    @Override // com.heytap.accessory.pair.connectivity.ble.interfaces.IGattServerEventListener
    public void onCharacteristicReadRequest(BluetoothDevice bluetoothDevice, int i, int i2, byte[] bArr) {
        PairLog.w(TAG, "AFP : onCharacteristicReadRequest, This should not be called");
        sendResponse(bluetoothDevice, i, 0, i2, bArr);
    }

    @Override // com.heytap.accessory.pair.connectivity.ble.interfaces.IGattServerEventListener
    public void onCharacteristicWriteRequest(BluetoothDevice bluetoothDevice, int i, boolean z, int i2, byte[] bArr) {
        this.mBleDevice.setBLEDevice(bluetoothDevice);
        this.mListener.onMessageReceived(bArr);
        if (z) {
            sendResponse(bluetoothDevice, i, 0, i2, BleConstants.DEFAULT_RETURN_VALUE);
        }
    }

    @Override // com.heytap.accessory.pair.connectivity.ble.interfaces.IGattServerEventListener
    public void onConnectionStateChanged(BluetoothDevice bluetoothDevice, int i) {
        this.mBleDevice.setBLEDevice(bluetoothDevice);
        ServerMessageHandler serverMessageHandler = this.mServerMessageHandler;
        if (serverMessageHandler != null) {
            Message messageObtainMessage = serverMessageHandler.obtainMessage();
            messageObtainMessage.what = 11;
            messageObtainMessage.arg1 = i;
            this.mServerMessageHandler.sendMessage(messageObtainMessage);
        }
    }

    @Override // com.heytap.accessory.pair.connectivity.ble.interfaces.IGattServerEventListener
    public void onDescriptorReadRequest(BluetoothDevice bluetoothDevice, int i, int i2, byte[] bArr) {
        PairLog.w(TAG, "AFP : onDescriptorReadRequest, This should not be called");
        sendResponse(bluetoothDevice, i, 0, i2, bArr);
    }

    @Override // com.heytap.accessory.pair.connectivity.ble.interfaces.IGattServerEventListener
    public void onDescriptorWriteRequest(BluetoothDevice bluetoothDevice, int i, boolean z, int i2, byte[] bArr) {
        PairLog.w(TAG, "AFP : onDescriptorWriteRequest, This should not be called");
        if (z) {
            sendResponse(bluetoothDevice, i, 0, i2, bArr);
        }
    }

    @Override // com.heytap.accessory.pair.connectivity.ble.interfaces.IGattServerEventListener
    public void onMtuChanged(int i) {
        PairLog.w(TAG, "onMtuChanged :" + i);
    }

    @Override // com.heytap.accessory.pair.connectivity.ble.interfaces.IGattServerEventListener
    public void onNotificationSent(BluetoothDevice bluetoothDevice, int i) {
    }

    @Override // com.heytap.accessory.pair.connectivity.ble.interfaces.IGattServerEventListener
    public void onServiceAdded(int i, BluetoothGattService bluetoothGattService) {
        PairLog.w(TAG, "AFP : onServiceAdded, This should not be called");
    }

    public boolean sendResponse(BluetoothDevice bluetoothDevice, int i, int i2, int i3, byte[] bArr) {
        return this.mBluetoothGattServer.sendResponse(bluetoothDevice, i, i2, i3, bArr);
    }

    @Override // com.heytap.accessory.pair.connectivity.ble.interfaces.IBleConnectionInterface
    public boolean write(byte[] bArr, FPBleMessageParam fPBleMessageParam) {
        PairLog.v(TAG, "Server: write length = " + bArr.length);
        BluetoothGattCharacteristic charac = this.mBleDevice.getCharac(fPBleMessageParam.mCharacter);
        charac.setValue(bArr);
        if (this.mBluetoothGattServer == null) {
            return false;
        }
        boolean zNotifyCharacteristicChanged = notifyCharacteristicChanged(this.mBleDevice.getBLEDevice(), charac);
        this.mListener.onMessageSent(fPBleMessageParam.mAddress, bArr);
        return zNotifyCharacteristicChanged;
    }
}
