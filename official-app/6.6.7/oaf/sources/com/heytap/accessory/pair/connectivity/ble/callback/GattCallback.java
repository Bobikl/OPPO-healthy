package com.heytap.accessory.pair.connectivity.ble.callback;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import com.heytap.accessory.pair.connectivity.ble.interfaces.IGattEventListener;
import com.heytap.accessory.pair.logging.PairLog;
import com.oplus.aiunit.vision.veb;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class GattCallback extends BluetoothGattCallback {
    private static final String TAG = "GattCallback";
    private IGattEventListener mGattListener = null;

    public void deregisterListener() {
        PairLog.v(TAG, "deregisterListener Called " + this.mGattListener);
        this.mGattListener = null;
    }

    public int getHashCode(BluetoothGatt bluetoothGatt) {
        return bluetoothGatt.hashCode();
    }

    public List<BluetoothGattService> getServices(BluetoothGatt bluetoothGatt) {
        return bluetoothGatt.getServices();
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        super.onCharacteristicChanged(bluetoothGatt, bluetoothGattCharacteristic);
        byte[] value = bluetoothGattCharacteristic.getValue();
        IGattEventListener iGattEventListener = this.mGattListener;
        if (iGattEventListener != null) {
            iGattEventListener.onCharacteristicChanged(value);
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        super.onCharacteristicRead(bluetoothGatt, bluetoothGattCharacteristic, i);
        IGattEventListener iGattEventListener = this.mGattListener;
        if (iGattEventListener != null) {
            iGattEventListener.onCharacteristicRead(bluetoothGatt, bluetoothGattCharacteristic, i);
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        super.onCharacteristicWrite(bluetoothGatt, bluetoothGattCharacteristic, i);
        IGattEventListener iGattEventListener = this.mGattListener;
        if (iGattEventListener == null || i != 0) {
            return;
        }
        iGattEventListener.onCharacteristicWrite(bluetoothGatt, bluetoothGattCharacteristic, i);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
        super.onConnectionStateChange(bluetoothGatt, i, i2);
        PairLog.i(TAG, "onConnectionStateChange(client) : " + veb.a((bluetoothGatt == null || bluetoothGatt.getDevice() == null) ? null : bluetoothGatt.getDevice().getAddress()) + " state= " + i + " newState= " + i2);
        IGattEventListener iGattEventListener = this.mGattListener;
        if (iGattEventListener != null) {
            iGattEventListener.onConnectionStateChanged(i2, i);
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onDescriptorRead(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
        super.onDescriptorRead(bluetoothGatt, bluetoothGattDescriptor, i);
        PairLog.v(TAG, "onDescriptorRead EnterGatt=" + getHashCode(bluetoothGatt));
        IGattEventListener iGattEventListener = this.mGattListener;
        if (iGattEventListener != null) {
            iGattEventListener.onDescriptorRead(bluetoothGattDescriptor);
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
        super.onDescriptorWrite(bluetoothGatt, bluetoothGattDescriptor, i);
        PairLog.v(TAG, "onDescriptorWrite Enter/ExitGatt=" + getHashCode(bluetoothGatt));
        IGattEventListener iGattEventListener = this.mGattListener;
        if (iGattEventListener != null) {
            iGattEventListener.onDescriptorWrite(bluetoothGatt, bluetoothGattDescriptor);
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onMtuChanged(BluetoothGatt bluetoothGatt, int i, int i2) {
        super.onMtuChanged(bluetoothGatt, i, i2);
        PairLog.v(TAG, "onMtuChanged mtu " + i + " status " + i2);
        IGattEventListener iGattEventListener = this.mGattListener;
        if (iGattEventListener != null) {
            iGattEventListener.onMtuChanged(bluetoothGatt, i, i2);
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
        super.onServicesDiscovered(bluetoothGatt, i);
        if (i != 0) {
            PairLog.v(TAG, "onServicesDiscovered fail");
            return;
        }
        PairLog.v(TAG, "onServicesDiscovered success");
        for (BluetoothGattService bluetoothGattService : getServices(bluetoothGatt)) {
            PairLog.v(TAG, "-----------New Service---------");
            PairLog.v(TAG, "Service UUID " + bluetoothGattService.getUuid());
            for (BluetoothGattCharacteristic bluetoothGattCharacteristic : bluetoothGattService.getCharacteristics()) {
                PairLog.v(TAG, "Char UUID " + bluetoothGattCharacteristic.getUuid());
                Iterator<BluetoothGattDescriptor> it = bluetoothGattCharacteristic.getDescriptors().iterator();
                while (it.hasNext()) {
                    PairLog.v(TAG, "desc UUID " + it.next().getUuid());
                }
            }
        }
        IGattEventListener iGattEventListener = this.mGattListener;
        if (iGattEventListener != null) {
            iGattEventListener.onServicesDiscovered(bluetoothGatt);
        }
    }

    public void registerListener(IGattEventListener iGattEventListener) {
        PairLog.v(TAG, "registerListener Called " + iGattEventListener);
        this.mGattListener = iGattEventListener;
    }
}
