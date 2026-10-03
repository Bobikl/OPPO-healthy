package com.heytap.accessory.pair.connectivity.ble.callback;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattServerCallback;
import android.bluetooth.BluetoothGattService;
import android.util.ArrayMap;
import com.heytap.accessory.pair.connectivity.ble.interfaces.IGattServerEventListener;
import com.heytap.accessory.pair.logging.PairLog;
import com.heytap.accessory.pair.logging.SensitiveLogUtils;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public class GattServerCallback extends BluetoothGattServerCallback {
    private static final String TAG = "GattServerCallback";
    private static volatile GattServerCallback sInstance;
    private Map<String, IGattServerEventListener> mGattServerEventListenerList = new ArrayMap();
    private IGattServerEventListener mGattServerListener;

    private GattServerCallback() {
    }

    public static GattServerCallback getInstance() {
        if (sInstance == null) {
            synchronized (GattServerCallback.class) {
                if (sInstance == null) {
                    sInstance = new GattServerCallback();
                }
            }
        }
        return sInstance;
    }

    public void deregisterListener(BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice == null) {
            PairLog.w(TAG, "deregisterListener failed: device is null");
            return;
        }
        if (this.mGattServerEventListenerList.get(bluetoothDevice.getAddress()) != null) {
            PairLog.v(TAG, "deregisterListener address:" + SensitiveLogUtils.toHiddenIfNeed(bluetoothDevice.getAddress()));
            this.mGattServerEventListenerList.remove(bluetoothDevice.getAddress());
        }
    }

    @Override // android.bluetooth.BluetoothGattServerCallback
    public void onCharacteristicReadRequest(BluetoothDevice bluetoothDevice, int i, int i2, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        PairLog.v(TAG, "onCharacteristicReadRequest : " + bluetoothDevice.getName());
        IGattServerEventListener iGattServerEventListener = this.mGattServerEventListenerList.get(bluetoothDevice.getAddress());
        if (iGattServerEventListener != null) {
            iGattServerEventListener.onCharacteristicReadRequest(bluetoothDevice, i, i2, bluetoothGattCharacteristic.getValue());
        } else {
            this.mGattServerListener.onCharacteristicReadRequest(bluetoothDevice, i, i2, bluetoothGattCharacteristic.getValue());
        }
    }

    @Override // android.bluetooth.BluetoothGattServerCallback
    public void onCharacteristicWriteRequest(BluetoothDevice bluetoothDevice, int i, BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z, boolean z2, int i2, byte[] bArr) {
        PairLog.v(TAG, "onCharacteristicWriteRequest : " + bluetoothDevice.getName());
        IGattServerEventListener iGattServerEventListener = this.mGattServerEventListenerList.get(bluetoothDevice.getAddress());
        if (iGattServerEventListener != null) {
            iGattServerEventListener.onCharacteristicWriteRequest(bluetoothDevice, i, z2, i2, bArr);
        } else {
            this.mGattServerListener.onCharacteristicWriteRequest(bluetoothDevice, i, z2, i2, bArr);
        }
    }

    @Override // android.bluetooth.BluetoothGattServerCallback
    public void onConnectionStateChange(BluetoothDevice bluetoothDevice, int i, int i2) {
        PairLog.v(TAG, "onConnectionStateChange(server) : " + bluetoothDevice.getName() + " status = " + i + " newState= " + i2);
        IGattServerEventListener iGattServerEventListener = this.mGattServerEventListenerList.get(bluetoothDevice.getAddress());
        if (iGattServerEventListener != null) {
            iGattServerEventListener.onConnectionStateChanged(bluetoothDevice, i2);
        } else {
            this.mGattServerListener.onConnectionStateChanged(bluetoothDevice, i2);
        }
    }

    @Override // android.bluetooth.BluetoothGattServerCallback
    public void onDescriptorReadRequest(BluetoothDevice bluetoothDevice, int i, int i2, BluetoothGattDescriptor bluetoothGattDescriptor) {
        PairLog.v(TAG, "onDescriptorReadRequest : " + bluetoothDevice.getName());
        IGattServerEventListener iGattServerEventListener = this.mGattServerEventListenerList.get(bluetoothDevice.getAddress());
        if (iGattServerEventListener != null) {
            iGattServerEventListener.onDescriptorReadRequest(bluetoothDevice, i, i2, bluetoothGattDescriptor.getValue());
        } else {
            this.mGattServerListener.onDescriptorReadRequest(bluetoothDevice, i, i2, bluetoothGattDescriptor.getValue());
        }
    }

    @Override // android.bluetooth.BluetoothGattServerCallback
    public void onDescriptorWriteRequest(BluetoothDevice bluetoothDevice, int i, BluetoothGattDescriptor bluetoothGattDescriptor, boolean z, boolean z2, int i2, byte[] bArr) {
        PairLog.v(TAG, "onDescriptorWriteRequest : " + bluetoothDevice.getName());
        IGattServerEventListener iGattServerEventListener = this.mGattServerEventListenerList.get(bluetoothDevice.getAddress());
        if (iGattServerEventListener != null) {
            iGattServerEventListener.onDescriptorWriteRequest(bluetoothDevice, i, z2, i2, bArr);
        } else {
            this.mGattServerListener.onDescriptorWriteRequest(bluetoothDevice, i, z2, i2, bArr);
        }
    }

    @Override // android.bluetooth.BluetoothGattServerCallback
    public void onExecuteWrite(BluetoothDevice bluetoothDevice, int i, boolean z) {
        PairLog.v(TAG, "onExecuteWrite : " + bluetoothDevice.getName());
    }

    @Override // android.bluetooth.BluetoothGattServerCallback
    public void onMtuChanged(BluetoothDevice bluetoothDevice, int i) {
        PairLog.v(TAG, "onMtuChanged(server) : mtuSize =" + i);
        super.onMtuChanged(bluetoothDevice, i);
        IGattServerEventListener iGattServerEventListener = this.mGattServerEventListenerList.get(bluetoothDevice.getAddress());
        if (iGattServerEventListener != null) {
            iGattServerEventListener.onMtuChanged(i);
        } else {
            this.mGattServerListener.onMtuChanged(i);
        }
    }

    @Override // android.bluetooth.BluetoothGattServerCallback
    public void onNotificationSent(BluetoothDevice bluetoothDevice, int i) {
        super.onNotificationSent(bluetoothDevice, i);
        PairLog.v(TAG, "onNotificationSent status : " + i);
        if (i != 0) {
            return;
        }
        IGattServerEventListener iGattServerEventListener = this.mGattServerEventListenerList.get(bluetoothDevice.getAddress());
        if (iGattServerEventListener != null) {
            iGattServerEventListener.onNotificationSent(bluetoothDevice, i);
        } else {
            this.mGattServerListener.onNotificationSent(bluetoothDevice, i);
        }
    }

    @Override // android.bluetooth.BluetoothGattServerCallback
    public void onServiceAdded(int i, BluetoothGattService bluetoothGattService) {
        PairLog.v(TAG, "onServiceAdded : status =" + i + "Service UUID =" + bluetoothGattService.getUuid());
        PairLog.v(TAG, "-----------New Service---------");
        StringBuilder sb = new StringBuilder();
        sb.append("Service UUID ");
        sb.append(bluetoothGattService.getUuid());
        PairLog.v(TAG, sb.toString());
        for (BluetoothGattCharacteristic bluetoothGattCharacteristic : bluetoothGattService.getCharacteristics()) {
            PairLog.v(TAG, "Char UUID " + bluetoothGattCharacteristic.getUuid());
            Iterator<BluetoothGattDescriptor> it = bluetoothGattCharacteristic.getDescriptors().iterator();
            while (it.hasNext()) {
                PairLog.v(TAG, "desc UUID " + it.next().getUuid());
            }
        }
        this.mGattServerListener.onServiceAdded(i, bluetoothGattService);
    }

    public void registerDefaultListener(IGattServerEventListener iGattServerEventListener) {
        this.mGattServerListener = iGattServerEventListener;
    }

    public void registerListener(String str, IGattServerEventListener iGattServerEventListener) {
        this.mGattServerEventListenerList.put(str, iGattServerEventListener);
    }
}
