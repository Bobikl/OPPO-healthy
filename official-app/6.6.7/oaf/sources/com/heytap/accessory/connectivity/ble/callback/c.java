package com.heytap.accessory.connectivity.ble.callback;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattServerCallback;
import android.bluetooth.BluetoothGattService;
import android.util.ArrayMap;
import com.heytap.accessory.connectivity.ble.interfaces.d;
import com.heytap.accessory.connectivity.constant.ConnectConstant;
import com.heytap.accessory.utils.HexUtils;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class c extends BluetoothGattServerCallback {
    public static final String c = "c";
    public static volatile c d;
    public d a;
    public Map<String, d> b = new ArrayMap();

    public static c a() {
        if (d == null) {
            synchronized (c.class) {
                if (d == null) {
                    d = new c();
                }
            }
        }
        return d;
    }

    @Override // android.bluetooth.BluetoothGattServerCallback
    public void onCharacteristicReadRequest(BluetoothDevice bluetoothDevice, int i, int i2, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        com.heytap.accessory.base.logging.a.d(c, "onCharacteristicReadRequest : " + bluetoothDevice.getName());
        d dVar = this.b.get(bluetoothDevice.getAddress());
        if (dVar != null) {
            dVar.d(bluetoothDevice, i, i2, bluetoothGattCharacteristic.getValue());
        } else {
            this.a.d(bluetoothDevice, i, i2, bluetoothGattCharacteristic.getValue());
        }
    }

    @Override // android.bluetooth.BluetoothGattServerCallback
    public void onCharacteristicWriteRequest(BluetoothDevice bluetoothDevice, int i, BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z, boolean z2, int i2, byte[] bArr) {
        com.heytap.accessory.base.logging.a.d(c, "onCharacteristicWriteRequest : " + bluetoothDevice.getName());
        d dVar = this.b.get(bluetoothDevice.getAddress());
        if (dVar != null) {
            dVar.c(bluetoothDevice, i, i2, bArr);
        } else {
            this.a.c(bluetoothDevice, i, i2, bArr);
        }
    }

    @Override // android.bluetooth.BluetoothGattServerCallback
    public void onConnectionStateChange(BluetoothDevice bluetoothDevice, int i, int i2) {
        com.heytap.accessory.base.logging.a.d(c, "onConnectionStateChange(server) : " + bluetoothDevice.getName() + " status = " + i + " newState= " + i2);
        d dVar = this.b.get(bluetoothDevice.getAddress());
        if (dVar != null) {
            dVar.a(bluetoothDevice, i2, 0);
        } else {
            this.a.a(bluetoothDevice, i2, 0);
        }
    }

    @Override // android.bluetooth.BluetoothGattServerCallback
    public void onDescriptorReadRequest(BluetoothDevice bluetoothDevice, int i, int i2, BluetoothGattDescriptor bluetoothGattDescriptor) {
        com.heytap.accessory.base.logging.a.d(c, "onDescriptorReadRequest : " + bluetoothDevice.getName());
        d dVar = this.b.get(bluetoothDevice.getAddress());
        if (dVar != null) {
            dVar.b(bluetoothDevice, i, i2, bluetoothGattDescriptor.getValue());
        } else {
            this.a.b(bluetoothDevice, i, i2, bluetoothGattDescriptor.getValue());
        }
    }

    @Override // android.bluetooth.BluetoothGattServerCallback
    public void onDescriptorWriteRequest(BluetoothDevice bluetoothDevice, int i, BluetoothGattDescriptor bluetoothGattDescriptor, boolean z, boolean z2, int i2, byte[] bArr) {
        String str = c;
        com.heytap.accessory.base.logging.a.c(str, "onDescriptorWriteRequest uuid: " + bluetoothGattDescriptor.getUuid() + ",value:" + Arrays.toString(bArr));
        String address = bluetoothDevice.getAddress();
        d dVar = this.b.get(address);
        boolean zEquals = Arrays.equals(BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE, bArr);
        if (com.heytap.accessory.connectivity.constant.a.b.equals(bluetoothGattDescriptor.getCharacteristic().getUuid())) {
            if (!zEquals) {
                if (dVar != null) {
                    dVar.a(bluetoothDevice, i, i2, bArr);
                    return;
                } else {
                    this.a.a(bluetoothDevice, i, i2, bArr);
                    return;
                }
            }
            if (dVar != null) {
                dVar.a(bluetoothDevice, i, i2, bArr);
                this.b.remove(address);
                com.heytap.accessory.base.logging.a.c(str, "iOS unsubscribe, addr:" + HexUtils.hideAddress(bluetoothDevice.getAddress()));
                dVar.a(bluetoothDevice, 0, ConnectConstant.ERROR_DISCOVERY_BLE_UNSUBSCRIBE);
            }
        }
    }

    @Override // android.bluetooth.BluetoothGattServerCallback
    public void onExecuteWrite(BluetoothDevice bluetoothDevice, int i, boolean z) {
        com.heytap.accessory.base.logging.a.d(c, "onExecuteWrite : " + bluetoothDevice.getName());
    }

    @Override // android.bluetooth.BluetoothGattServerCallback
    public void onMtuChanged(BluetoothDevice bluetoothDevice, int i) {
        com.heytap.accessory.base.logging.a.d(c, "onMtuChanged(server) : mtuSize =" + i);
        super.onMtuChanged(bluetoothDevice, i);
        d dVar = this.b.get(bluetoothDevice.getAddress());
        if (dVar != null) {
            dVar.a(i);
        } else {
            this.a.a(i);
        }
    }

    @Override // android.bluetooth.BluetoothGattServerCallback
    public void onNotificationSent(BluetoothDevice bluetoothDevice, int i) {
        super.onNotificationSent(bluetoothDevice, i);
        com.heytap.accessory.base.logging.a.d(c, "onNotificationSent status : " + i);
        if (i != 0) {
            return;
        }
        d dVar = this.b.get(bluetoothDevice.getAddress());
        if (dVar != null) {
            dVar.a(bluetoothDevice, i);
        }
    }

    @Override // android.bluetooth.BluetoothGattServerCallback
    public void onServiceAdded(int i, BluetoothGattService bluetoothGattService) {
        String str = c;
        com.heytap.accessory.base.logging.a.d(str, "onServiceAdded : status =" + i + "Service UUID =" + bluetoothGattService.getUuid());
        com.heytap.accessory.base.logging.a.d(str, "-----------New Service---------");
        StringBuilder sb = new StringBuilder();
        sb.append("Service UUID ");
        sb.append(bluetoothGattService.getUuid());
        com.heytap.accessory.base.logging.a.d(str, sb.toString());
        for (BluetoothGattCharacteristic bluetoothGattCharacteristic : bluetoothGattService.getCharacteristics()) {
            com.heytap.accessory.base.logging.a.d(c, "Char UUID " + bluetoothGattCharacteristic.getUuid());
            for (BluetoothGattDescriptor bluetoothGattDescriptor : bluetoothGattCharacteristic.getDescriptors()) {
                com.heytap.accessory.base.logging.a.d(c, "desc UUID " + bluetoothGattDescriptor.getUuid());
            }
        }
        this.a.d();
    }

    public void a(String str, d dVar) {
        this.b.put(str, dVar);
    }

    public void a(d dVar) {
        this.a = dVar;
    }

    public void a(BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice == null) {
            com.heytap.accessory.base.logging.a.e(c, "deregisterListener failed: device is null");
            return;
        }
        if (this.b.get(bluetoothDevice.getAddress()) != null) {
            com.heytap.accessory.base.logging.a.d(c, "deregisterListener address:" + HexUtils.hideAddress(bluetoothDevice.getAddress()));
            this.b.remove(bluetoothDevice.getAddress());
        }
    }
}
