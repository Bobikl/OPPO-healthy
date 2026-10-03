package com.heytap.accessory.connectivity.ble.callback;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class b extends BluetoothGattCallback {
    public static final String b = "b";
    public com.heytap.accessory.connectivity.ble.interfaces.c a = null;

    public void a(com.heytap.accessory.connectivity.ble.interfaces.c cVar) {
        com.heytap.accessory.base.logging.a.d(b, "registerListener Called " + cVar);
        this.a = cVar;
    }

    public List<BluetoothGattService> b(BluetoothGatt bluetoothGatt) {
        return bluetoothGatt.getServices();
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        super.onCharacteristicChanged(bluetoothGatt, bluetoothGattCharacteristic);
        byte[] value = bluetoothGattCharacteristic.getValue();
        com.heytap.accessory.connectivity.ble.interfaces.c cVar = this.a;
        if (cVar != null) {
            cVar.b(value);
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        super.onCharacteristicRead(bluetoothGatt, bluetoothGattCharacteristic, i);
        com.heytap.accessory.connectivity.ble.interfaces.c cVar = this.a;
        if (cVar != null) {
            cVar.b(bluetoothGatt, bluetoothGattCharacteristic, i);
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        super.onCharacteristicWrite(bluetoothGatt, bluetoothGattCharacteristic, i);
        com.heytap.accessory.connectivity.ble.interfaces.c cVar = this.a;
        if (cVar == null || i != 0) {
            return;
        }
        cVar.a(bluetoothGatt, bluetoothGattCharacteristic, i);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
        super.onConnectionStateChange(bluetoothGatt, i, i2);
        com.heytap.accessory.base.logging.a.d(b, "onConnectionStateChange(client) : " + bluetoothGatt.getDevice().getName() + " state= " + i + " newState= " + i2);
        com.heytap.accessory.connectivity.ble.interfaces.c cVar = this.a;
        if (cVar != null) {
            cVar.a(i2, i);
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onDescriptorRead(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
        super.onDescriptorRead(bluetoothGatt, bluetoothGattDescriptor, i);
        com.heytap.accessory.base.logging.a.d(b, "onDescriptorRead EnterGatt=" + a(bluetoothGatt));
        com.heytap.accessory.connectivity.ble.interfaces.c cVar = this.a;
        if (cVar != null) {
            cVar.a(bluetoothGattDescriptor);
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
        super.onDescriptorWrite(bluetoothGatt, bluetoothGattDescriptor, i);
        com.heytap.accessory.base.logging.a.d(b, "onDescriptorWrite Enter/ExitGatt=" + a(bluetoothGatt));
        com.heytap.accessory.connectivity.ble.interfaces.c cVar = this.a;
        if (cVar != null) {
            cVar.d();
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onMtuChanged(BluetoothGatt bluetoothGatt, int i, int i2) {
        super.onMtuChanged(bluetoothGatt, i, i2);
        com.heytap.accessory.base.logging.a.d(b, "onMtuChanged mtu " + i + " status " + i2);
        com.heytap.accessory.connectivity.ble.interfaces.c cVar = this.a;
        if (cVar != null) {
            cVar.a(bluetoothGatt, i, i2);
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
        super.onServicesDiscovered(bluetoothGatt, i);
        if (i != 0) {
            com.heytap.accessory.base.logging.a.d(b, "onServicesDiscovered fail");
            return;
        }
        com.heytap.accessory.base.logging.a.d(b, "onServicesDiscovered success");
        for (BluetoothGattService bluetoothGattService : b(bluetoothGatt)) {
            String str = b;
            com.heytap.accessory.base.logging.a.d(str, "-----------New Service---------");
            com.heytap.accessory.base.logging.a.d(str, "Service UUID " + bluetoothGattService.getUuid());
            for (BluetoothGattCharacteristic bluetoothGattCharacteristic : bluetoothGattService.getCharacteristics()) {
                com.heytap.accessory.base.logging.a.d(b, "Char UUID " + bluetoothGattCharacteristic.getUuid());
                for (BluetoothGattDescriptor bluetoothGattDescriptor : bluetoothGattCharacteristic.getDescriptors()) {
                    com.heytap.accessory.base.logging.a.d(b, "desc UUID " + bluetoothGattDescriptor.getUuid());
                }
            }
        }
        com.heytap.accessory.connectivity.ble.interfaces.c cVar = this.a;
        if (cVar != null) {
            cVar.a(bluetoothGatt);
        }
    }

    public void a() {
        com.heytap.accessory.base.logging.a.d(b, "deregisterListener Called " + this.a);
        this.a = null;
    }

    public int a(BluetoothGatt bluetoothGatt) {
        return bluetoothGatt.hashCode();
    }
}
