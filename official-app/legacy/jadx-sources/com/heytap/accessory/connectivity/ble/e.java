package com.heytap.accessory.connectivity.ble;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattServer;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.UUID;

/* JADX INFO: loaded from: classes14.dex */
public class e implements com.heytap.accessory.connectivity.ble.interfaces.a, com.heytap.accessory.connectivity.ble.interfaces.d {
    public static final String i = "e";
    public com.heytap.accessory.connectivity.ble.bean.a a;
    public BluetoothGattServer b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2491c;
    public com.heytap.accessory.connectivity.ble.callback.c d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.heytap.accessory.connectivity.ble.interfaces.b f2492e;
    public a f;
    public int g;
    public String h;

    public static final class a extends Handler {
        public final WeakReference<e> a;

        public a(Looper looper, e eVar) {
            super(looper);
            this.a = new WeakReference<>(eVar);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            e eVar = this.a.get();
            if (eVar == null) {
                com.heytap.accessory.base.logging.a.b(e.i, "MessageHandler() : reference to AFBleServerDevice is null! returning...");
                return;
            }
            if (message.what != 11) {
                com.heytap.accessory.base.logging.a.b(e.i, "Server gatt callback unknown event received =" + message);
                return;
            }
            int i = message.arg1;
            int i2 = message.arg2;
            if (i == 2) {
                com.heytap.accessory.base.logging.a.d(e.i, "BluetoothProfile.STATE_CONNECTED");
                return;
            }
            if (i == 0) {
                com.heytap.accessory.base.logging.a.d(e.i, "BluetoothProfile.STATE_DISCONNECTED");
                if (eVar.g != 2) {
                    if (i2 >= 0) {
                        eVar.g = 3;
                        com.heytap.accessory.base.logging.a.e(e.i, "Server onConnectionStateChanged called of IConnectionEventListener " + eVar.f2492e + " " + eVar.g + " " + eVar.f2491c);
                    } else {
                        eVar.g = 6;
                        eVar.f2491c = i2;
                    }
                    if (eVar.f2492e != null) {
                        eVar.f2492e.a(eVar.g, eVar.f2491c);
                    }
                }
            }
        }
    }

    public e(com.heytap.accessory.connectivity.ble.interfaces.b bVar) {
        this.f2492e = bVar;
        this.g = 0;
        this.f2491c = 0;
    }

    @Override // com.heytap.accessory.connectivity.ble.interfaces.a
    public void c() {
    }

    @Override // com.heytap.accessory.connectivity.ble.interfaces.d
    public void d(BluetoothDevice bluetoothDevice, int i2, int i3, byte[] bArr) {
        com.heytap.accessory.base.logging.a.e(i, "AFP : onCharacteristicReadRequest, This should not be called");
        a(bluetoothDevice, i2, 0, i3, bArr);
    }

    @Override // com.heytap.accessory.connectivity.ble.interfaces.a
    public String e() {
        com.heytap.accessory.connectivity.ble.bean.a aVar = this.a;
        if (aVar == null || aVar.a() == null) {
            return null;
        }
        return this.a.a().getName();
    }

    @Override // com.heytap.accessory.connectivity.ble.interfaces.d
    public void a(BluetoothDevice bluetoothDevice, int i2, int i3) {
        this.a.a(bluetoothDevice);
        a aVar = this.f;
        if (aVar != null) {
            Message messageObtainMessage = aVar.obtainMessage();
            messageObtainMessage.what = 11;
            messageObtainMessage.arg1 = i2;
            messageObtainMessage.arg2 = i3;
            this.f.sendMessage(messageObtainMessage);
        }
    }

    @Override // com.heytap.accessory.connectivity.ble.interfaces.a
    public void b() {
        if (this.g == 2) {
            com.heytap.accessory.base.logging.a.d(i, "Already Connection closed return");
            return;
        }
        if (this.d != null && this.a != null) {
            com.heytap.accessory.base.logging.a.c(i, "Deregister the GattServer Callback");
            this.d.a(this.a.a());
            this.d = null;
        }
        if (this.b != null) {
            com.heytap.accessory.base.logging.a.c(i, "mBluetoothGattServer cleaup");
            com.heytap.accessory.connectivity.ble.bean.a aVar = this.a;
            if (aVar != null && aVar.a() != null) {
                this.b.cancelConnection(this.a.a());
                String address = this.a.a().getAddress();
                if (c.a().b(address)) {
                    BluetoothGatt bluetoothGattA = c.a().a(address);
                    bluetoothGattA.disconnect();
                    bluetoothGattA.close();
                    c.a().c(address);
                }
                this.a.a((BluetoothGattCharacteristic) null);
                this.a = null;
            }
            this.b = null;
        }
        a aVar2 = this.f;
        if (aVar2 != null) {
            aVar2.removeCallbacksAndMessages(null);
            com.heytap.accessory.base.thread.a.b().e(this.h);
            this.f = null;
        }
        this.g = 2;
        this.f2491c = 0;
    }

    @Override // com.heytap.accessory.connectivity.ble.interfaces.d
    public void c(BluetoothDevice bluetoothDevice, int i2, int i3, byte[] bArr) {
        this.a.a(bluetoothDevice);
        this.f2492e.a(bArr);
        a(bluetoothDevice, i2, 0, i3, com.heytap.accessory.connectivity.ble.constant.a.a);
    }

    @Override // com.heytap.accessory.connectivity.ble.interfaces.d
    public void d() {
        com.heytap.accessory.base.logging.a.e(i, "AFP : onServiceAdded, This should not be called");
    }

    public e(com.heytap.accessory.connectivity.ble.interfaces.b bVar, BluetoothGattServer bluetoothGattServer) {
        this(bVar);
        this.b = bluetoothGattServer;
    }

    @Override // com.heytap.accessory.connectivity.ble.interfaces.a
    public int a(com.heytap.accessory.base.bean.b bVar) {
        this.g = 0;
        this.f2491c = 0;
        this.h = com.heytap.accessory.base.thread.a.b().a(4, "S", "MESSAGE_HANDLER", 1);
        Looper looperB = com.heytap.accessory.base.thread.a.b().b(this.h);
        if (looperB != null) {
            this.f = new a(looperB, this);
        }
        this.a = new com.heytap.accessory.connectivity.ble.bean.a();
        this.b = (BluetoothGattServer) bVar.z();
        this.a.a(BluetoothAdapter.getDefaultAdapter().getRemoteDevice(bVar.d()));
        if (this.b == null) {
            com.heytap.accessory.base.logging.a.b(i, "BluetoothGattServer instance is null");
        } else {
            String str = i;
            com.heytap.accessory.base.logging.a.c(str, "Retrieved DD's BluetoothGattServer");
            this.g = 1;
            com.heytap.accessory.base.logging.a.d(str, "Register to GattServer Callback");
            com.heytap.accessory.connectivity.ble.callback.c cVarA = com.heytap.accessory.connectivity.ble.callback.c.a();
            this.d = cVarA;
            cVarA.a(bVar.d(), this);
            BluetoothGattServer bluetoothGattServer = this.b;
            UUID uuid = com.heytap.accessory.connectivity.constant.a.a;
            if (bluetoothGattServer.getService(uuid) != null) {
                this.a.a(this.b.getService(uuid).getCharacteristic(com.heytap.accessory.connectivity.constant.a.b));
            }
        }
        return this.g;
    }

    @Override // com.heytap.accessory.connectivity.ble.interfaces.a
    public boolean a(byte[] bArr) {
        com.heytap.accessory.base.logging.a.c("BleServerConnection", "Server: write length = " + bArr.length);
        BluetoothGattCharacteristic bluetoothGattCharacteristicB = this.a.b();
        bluetoothGattCharacteristicB.setValue(bArr);
        if (this.b != null) {
            return a(this.a.a(), bluetoothGattCharacteristicB);
        }
        return false;
    }

    @Override // com.heytap.accessory.connectivity.ble.interfaces.d
    public void b(BluetoothDevice bluetoothDevice, int i2, int i3, byte[] bArr) {
        com.heytap.accessory.base.logging.a.e(i, "AFP : onDescriptorReadRequest, This should not be called");
        a(bluetoothDevice, i2, 0, i3, bArr);
    }

    @Override // com.heytap.accessory.connectivity.ble.interfaces.a
    public boolean a() {
        if (this.b != null) {
            return true;
        }
        com.heytap.accessory.base.logging.a.b(i, "BluetoothGattServer instance is null");
        return false;
    }

    @Override // com.heytap.accessory.connectivity.ble.interfaces.d
    public void a(int i2) {
        com.heytap.accessory.base.logging.a.e(i, "onMtuChanged :" + i2);
    }

    @Override // com.heytap.accessory.connectivity.ble.interfaces.d
    public void a(BluetoothDevice bluetoothDevice, int i2) {
        this.f2492e.a();
    }

    @Override // com.heytap.accessory.connectivity.ble.interfaces.d
    public void a(BluetoothDevice bluetoothDevice, int i2, int i3, byte[] bArr) {
        com.heytap.accessory.base.logging.a.e(i, "AFP : onDescriptorWriteRequest, This should not be called");
        a(bluetoothDevice, i2, 0, i3, bArr);
    }

    public boolean a(BluetoothDevice bluetoothDevice, int i2, int i3, int i4, byte[] bArr) {
        return this.b.sendResponse(bluetoothDevice, i2, i3, i4, bArr);
    }

    public boolean a(BluetoothDevice bluetoothDevice, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return this.b.notifyCharacteristicChanged(bluetoothDevice, bluetoothGattCharacteristic, false);
    }
}
