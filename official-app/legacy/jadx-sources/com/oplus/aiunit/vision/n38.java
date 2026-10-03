package com.oplus.aiunit.vision;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import java.lang.reflect.Method;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes15.dex */
public class n38 extends BluetoothGattCallback {
    public static final UUID CLIENT_CHARACTERISTIC_CONFIGURATION = UUID.fromString("00002902-0000-1000-8000-00805f9b34fb");
    public static final int STATE_CONNECTED = 2;
    public static final int STATE_CONNECTING = 1;
    public static final int STATE_DISCONNECTED = 4;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SERVICE_READY = 3;
    public final String a;
    public BluetoothGatt b;
    public a d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14324e = 0;
    public int f = 6;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BluetoothAdapter f14323c = BluetoothAdapter.getDefaultAdapter();

    public interface a {
        void a(int i, boolean z, byte[] bArr);

        void c(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic);

        void d(boolean z, int i);
    }

    public n38(String str) {
        this.a = str;
    }

    public void a() {
        BluetoothGatt bluetoothGatt = this.b;
        if (bluetoothGatt != null) {
            bluetoothGatt.disconnect();
            this.b.close();
            this.b = null;
        }
        int i = this.f14324e;
        this.f14324e = 0;
        g(i, 0, true);
    }

    public boolean b(Context context) {
        BluetoothDevice remoteDevice;
        if (f()) {
            a aVar = this.d;
            if (aVar != null) {
                aVar.a(1, true, this.a.getBytes());
            }
            return true;
        }
        try {
            remoteDevice = this.f14323c.getRemoteDevice(this.a);
        } catch (Exception e2) {
            a7b.b("GattChannel", "connect: error " + e2);
            remoteDevice = null;
        }
        if (remoteDevice == null) {
            return false;
        }
        BluetoothGatt bluetoothGatt = this.b;
        if (bluetoothGatt != null) {
            try {
                bluetoothGatt.close();
            } catch (Throwable unused) {
            }
            this.b = null;
            try {
                TimeUnit.MILLISECONDS.sleep(200L);
            } catch (InterruptedException e3) {
                a7b.b("GattChannel", "sleep: error " + e3);
            }
        }
        BluetoothGatt bluetoothGattConnectGatt = remoteDevice.connectGatt(context, false, this, 2);
        this.b = bluetoothGattConnectGatt;
        if (bluetoothGattConnectGatt == null) {
            return false;
        }
        k(bluetoothGattConnectGatt);
        this.f14324e = 1;
        return true;
    }

    public boolean c() {
        BluetoothGatt bluetoothGatt = this.b;
        if (bluetoothGatt == null) {
            return false;
        }
        int i = this.f14324e;
        if (i == 2 || i == 3) {
            return bluetoothGatt.discoverServices();
        }
        return false;
    }

    public BluetoothGattCharacteristic d(UUID uuid, UUID uuid2) {
        BluetoothGattService bluetoothGattServiceE = e(uuid);
        if (bluetoothGattServiceE != null) {
            return bluetoothGattServiceE.getCharacteristic(uuid2);
        }
        return null;
    }

    public BluetoothGattService e(UUID uuid) {
        if (f()) {
            return this.b.getService(uuid);
        }
        return null;
    }

    public boolean f() {
        int i = this.f14324e;
        return i == 2 || i == 3;
    }

    public final void g(int i, int i2, boolean z) {
        a aVar = this.d;
        if (aVar == null || i == i2) {
            return;
        }
        aVar.d(z, i2);
    }

    public boolean h(UUID uuid, UUID uuid2) {
        BluetoothGattCharacteristic bluetoothGattCharacteristicD;
        if (this.b == null || !f() || (bluetoothGattCharacteristicD = d(uuid, uuid2)) == null) {
            return false;
        }
        return this.b.readCharacteristic(bluetoothGattCharacteristicD);
    }

    public boolean i(UUID uuid, UUID uuid2, UUID uuid3) {
        BluetoothGattCharacteristic bluetoothGattCharacteristicD;
        BluetoothGattDescriptor descriptor;
        if (this.b == null || !f() || (bluetoothGattCharacteristicD = d(uuid, uuid2)) == null || !f() || (descriptor = bluetoothGattCharacteristicD.getDescriptor(uuid3)) == null || !f()) {
            return false;
        }
        return this.b.readDescriptor(descriptor);
    }

    public boolean j() {
        if (this.b == null || !f()) {
            return false;
        }
        return this.b.readRemoteRssi();
    }

    public final void k(BluetoothGatt bluetoothGatt) {
        if (bluetoothGatt != null) {
            try {
                Method method = BluetoothGatt.class.getMethod("refresh", new Class[0]);
                if (method != null) {
                    method.setAccessible(true);
                    boolean zBooleanValue = ((Boolean) method.invoke(bluetoothGatt, new Object[0])).booleanValue();
                    StringBuilder sb = new StringBuilder();
                    sb.append("refreshGatt--->refresh:");
                    sb.append(zBooleanValue);
                }
            } catch (Exception e2) {
                a7b.b("GattChannel", "refreshGatt--->" + e2.getMessage());
            }
        }
    }

    public boolean l(int i) {
        if (this.b == null || !f()) {
            return false;
        }
        return this.b.requestMtu(i);
    }

    public void m(a aVar) {
        this.d = aVar;
    }

    public boolean n(UUID uuid, UUID uuid2, boolean z) {
        BluetoothGattCharacteristic bluetoothGattCharacteristicD;
        BluetoothGattDescriptor descriptor;
        if (this.b == null || !f() || (bluetoothGattCharacteristicD = d(uuid, uuid2)) == null || !this.b.setCharacteristicNotification(bluetoothGattCharacteristicD, z) || (descriptor = bluetoothGattCharacteristicD.getDescriptor(CLIENT_CHARACTERISTIC_CONFIGURATION)) == null || !f()) {
            return false;
        }
        if (!descriptor.setValue(z ? BluetoothGattDescriptor.ENABLE_INDICATION_VALUE : BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE)) {
            return false;
        }
        this.f = z ? 9 : 10;
        return this.b.writeDescriptor(descriptor);
    }

    public boolean o(UUID uuid, UUID uuid2, boolean z) {
        BluetoothGattCharacteristic bluetoothGattCharacteristicD;
        BluetoothGattDescriptor descriptor;
        if (this.b == null || !f() || (bluetoothGattCharacteristicD = d(uuid, uuid2)) == null || !this.b.setCharacteristicNotification(bluetoothGattCharacteristicD, z) || (descriptor = bluetoothGattCharacteristicD.getDescriptor(CLIENT_CHARACTERISTIC_CONFIGURATION)) == null) {
            return false;
        }
        if (!descriptor.setValue(z ? BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE : BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE)) {
            return false;
        }
        this.f = z ? 7 : 8;
        return this.b.writeDescriptor(descriptor);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        a aVar = this.d;
        if (aVar == null) {
            return;
        }
        aVar.c(bluetoothGatt, bluetoothGattCharacteristic);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        a aVar = this.d;
        if (aVar == null) {
            return;
        }
        if (i == 0) {
            aVar.a(3, true, bluetoothGattCharacteristic.getValue());
        } else {
            aVar.a(3, false, null);
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        a aVar = this.d;
        if (aVar == null) {
            return;
        }
        if (i != 0) {
            aVar.a(4, false, null);
        } else {
            this.d.a(4, true, bluetoothGattCharacteristic.getValue());
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append("onConnectionStateChange--->status:");
        sb.append(i);
        sb.append("    newState:");
        sb.append(i2);
        sb.append("    gattState:");
        sb.append(this.f14324e);
        if (i != 0) {
            int i3 = this.f14324e;
            this.f14324e = 4;
            bluetoothGatt.close();
            this.b = null;
            a aVar = this.d;
            if (aVar != null) {
                if (i3 == 1) {
                    aVar.a(1, false, null);
                }
                g(i3, this.f14324e, false);
                return;
            }
            return;
        }
        int i4 = this.f14324e;
        if (i2 == 2) {
            this.f14324e = 2;
            byte[] bytes = (bluetoothGatt == null || bluetoothGatt.getDevice() == null) ? new byte[0] : bluetoothGatt.getDevice().getAddress().getBytes();
            a aVar2 = this.d;
            if (aVar2 != null) {
                aVar2.a(1, true, bytes);
                g(i4, this.f14324e, false);
                return;
            }
            return;
        }
        if (i2 == 0) {
            bluetoothGatt.close();
            this.b = null;
            this.f14324e = 4;
            a aVar3 = this.d;
            if (aVar3 != null) {
                if (i4 == 1) {
                    aVar3.a(1, false, null);
                }
                g(i4, this.f14324e, false);
            }
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onDescriptorRead(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
        a aVar = this.d;
        if (aVar == null) {
            return;
        }
        if (i == 0) {
            aVar.a(5, true, bluetoothGattDescriptor.getValue());
        } else {
            aVar.a(5, false, null);
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
        a aVar = this.d;
        if (aVar == null) {
            return;
        }
        if (i == 0) {
            aVar.a(this.f, true, null);
        } else {
            aVar.a(this.f, false, null);
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onMtuChanged(BluetoothGatt bluetoothGatt, int i, int i2) {
        a aVar = this.d;
        if (aVar == null) {
            return;
        }
        if (i2 == 0) {
            aVar.a(12, true, qd2.d(i));
        } else {
            aVar.a(12, false, qd2.d(i));
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onReadRemoteRssi(BluetoothGatt bluetoothGatt, int i, int i2) {
        a aVar = this.d;
        if (aVar == null) {
            return;
        }
        if (i2 == 0) {
            aVar.a(11, true, qd2.d(i));
        } else {
            aVar.a(11, false, null);
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
        if (i != 0) {
            a aVar = this.d;
            if (aVar != null) {
                aVar.a(2, false, null);
                return;
            }
            return;
        }
        int i2 = this.f14324e;
        this.f14324e = 3;
        a aVar2 = this.d;
        if (aVar2 != null) {
            aVar2.a(2, true, null);
            g(i2, this.f14324e, false);
        }
    }

    public boolean p(UUID uuid, UUID uuid2, byte[] bArr) {
        BluetoothGattCharacteristic bluetoothGattCharacteristicD;
        if (this.b == null || !f() || (bluetoothGattCharacteristicD = d(uuid, uuid2)) == null) {
            return false;
        }
        bluetoothGattCharacteristicD.setValue(bArr);
        return this.b.writeCharacteristic(bluetoothGattCharacteristicD);
    }

    public boolean q(UUID uuid, UUID uuid2, UUID uuid3, byte[] bArr) {
        BluetoothGattDescriptor descriptor;
        if (this.b == null || !f()) {
            return false;
        }
        this.f = 6;
        BluetoothGattCharacteristic bluetoothGattCharacteristicD = d(uuid, uuid2);
        if (bluetoothGattCharacteristicD == null || (descriptor = bluetoothGattCharacteristicD.getDescriptor(uuid3)) == null) {
            return false;
        }
        if (bArr == null) {
            bArr = new byte[0];
        }
        descriptor.setValue(bArr);
        return this.b.writeDescriptor(descriptor);
    }
}
