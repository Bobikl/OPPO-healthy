package com.heytap.accessory.connectivity.ble.callback;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattServer;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import com.heytap.accessory.connectivity.ble.interfaces.d;
import com.heytap.accessory.misc.utils.PlatformUtils;
import com.heytap.accessory.utils.HexUtils;

/* JADX INFO: loaded from: classes14.dex */
public class a implements com.heytap.accessory.connectivity.interfaces.c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f2478n = "a";
    public static volatile a o;
    public com.heytap.accessory.connectivity.interfaces.b b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public BluetoothGattDescriptor f2480e;
    public BluetoothGattService h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2482l = 20;
    public int m = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BluetoothGattCharacteristic f2479c = null;
    public BluetoothGattCharacteristic f = null;
    public BluetoothGattDescriptor d = null;
    public BluetoothGattServer g = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public BluetoothDevice f2481j = null;
    public c k = null;
    public BluetoothAdapter i = BluetoothAdapter.getDefaultAdapter();
    public Context a = PlatformUtils.getContext();

    public int e() {
        return this.f2482l;
    }

    public final void f() {
        com.heytap.accessory.connectivity.ble.a aVar = new com.heytap.accessory.connectivity.ble.a(this.f2481j.getAddress());
        aVar.a(this.g);
        aVar.c(this.f2481j.getAddress());
        aVar.d(this.f2481j.getName());
        aVar.f(4);
        this.b.a(aVar, this.m);
    }

    public final void g() {
        this.b.a(-1107, (com.heytap.accessory.base.bean.b) null, this.m);
    }

    /* JADX INFO: renamed from: com.heytap.accessory.connectivity.ble.callback.a$a, reason: collision with other inner class name */
    public class C0232a implements d {

        /* JADX INFO: renamed from: com.heytap.accessory.connectivity.ble.callback.a$a$a, reason: collision with other inner class name */
        public class C0233a extends BluetoothGattCallback {
            public C0233a(C0232a c0232a) {
            }

            @Override // android.bluetooth.BluetoothGattCallback
            public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
                super.onConnectionStateChange(bluetoothGatt, i, i2);
                com.heytap.accessory.base.logging.a.a(a.f2478n, "remote connect gatt callback:" + i2);
            }
        }

        public C0232a() {
        }

        @Override // com.heytap.accessory.connectivity.ble.interfaces.d
        public void a(BluetoothDevice bluetoothDevice, int i, int i2) {
            String address = bluetoothDevice.getAddress();
            com.heytap.accessory.base.logging.a.d(a.f2478n, "Discovery : onConnectionStateChanged newState = " + i + " device:" + HexUtils.hideAddress(address));
            if (i == 2) {
                com.heytap.accessory.base.logging.a.a(a.f2478n, "BluetoothProfile.STATE_CONNECTED");
            } else if (i == 0) {
                com.heytap.accessory.base.logging.a.a(a.f2478n, "BluetoothProfile.STATE_DISCONNECTED");
            }
        }

        @Override // com.heytap.accessory.connectivity.ble.interfaces.d
        public void b(BluetoothDevice bluetoothDevice, int i, int i2, byte[] bArr) {
            com.heytap.accessory.base.logging.a.d(a.f2478n, "Discovery : onDescriptorReadRequest");
            a.this.g.sendResponse(bluetoothDevice, i, 0, i2, bArr);
        }

        @Override // com.heytap.accessory.connectivity.ble.interfaces.d
        public void c(BluetoothDevice bluetoothDevice, int i, int i2, byte[] bArr) {
            com.heytap.accessory.base.logging.a.d(a.f2478n, "Discovery : onCharacteristicWriteRequest");
        }

        @Override // com.heytap.accessory.connectivity.ble.interfaces.d
        public void d(BluetoothDevice bluetoothDevice, int i, int i2, byte[] bArr) {
            com.heytap.accessory.base.logging.a.d(a.f2478n, "Discovery : onCharacteristicReadRequest");
            a.this.g.sendResponse(bluetoothDevice, i, 0, i2, bArr);
        }

        @Override // com.heytap.accessory.connectivity.ble.interfaces.d
        public void d() {
            com.heytap.accessory.base.logging.a.d(a.f2478n, "Discovery : onServiceAdded");
        }

        @Override // com.heytap.accessory.connectivity.ble.interfaces.d
        public void a(BluetoothDevice bluetoothDevice, int i, int i2, byte[] bArr) {
            com.heytap.accessory.base.logging.a.d(a.f2478n, "Discovery : onDescriptorWriteRequest");
            a.this.g.sendResponse(bluetoothDevice, i, 0, i2, bArr);
            a.this.f2481j = bluetoothDevice;
            a.this.f();
            if (com.heytap.accessory.connectivity.ble.c.a().b(bluetoothDevice.getAddress())) {
                return;
            }
            com.heytap.accessory.base.logging.a.a(a.f2478n, "start server connect");
            com.heytap.accessory.connectivity.ble.c.a().a(bluetoothDevice.connectGatt(PlatformUtils.getContext(), false, new C0233a(this), 2));
        }

        @Override // com.heytap.accessory.connectivity.ble.interfaces.d
        public void a(int i) {
            com.heytap.accessory.base.logging.a.d(a.f2478n, "onMtuChanged : " + i);
            if (i != a.this.f2482l) {
                a.this.c(i - 3);
            }
        }

        @Override // com.heytap.accessory.connectivity.ble.interfaces.d
        public void a(BluetoothDevice bluetoothDevice, int i) {
            a.this.k.onNotificationSent(bluetoothDevice, i);
        }
    }

    public static a d() {
        if (o == null) {
            synchronized (a.class) {
                if (o == null) {
                    o = new a();
                }
            }
        }
        return o;
    }

    @Override // com.heytap.accessory.connectivity.interfaces.c
    public boolean b(int i) {
        BluetoothAdapter bluetoothAdapter = this.i;
        if (bluetoothAdapter == null) {
            com.heytap.accessory.base.logging.a.e(f2478n, "Bt Adapter is null");
            this.b.a(-1104, (com.heytap.accessory.base.bean.b) null, this.m);
            return false;
        }
        if (this.g != null) {
            com.heytap.accessory.base.logging.a.a(f2478n, "server already started!");
            return false;
        }
        if (!bluetoothAdapter.isEnabled()) {
            com.heytap.accessory.base.logging.a.a(f2478n, "BT Is OFF");
            return false;
        }
        com.heytap.accessory.base.logging.a.a(f2478n, "BT Is ON");
        b();
        return true;
    }

    public void c(int i) {
        this.f2482l = i;
    }

    public final d c() {
        return new C0232a();
    }

    @Override // com.heytap.accessory.connectivity.interfaces.c
    public void a(int i) {
        com.heytap.accessory.base.logging.a.d(f2478n, "Stop BLE Server");
        BluetoothGattServer bluetoothGattServer = this.g;
        if (bluetoothGattServer != null) {
            BluetoothDevice bluetoothDevice = this.f2481j;
            if (bluetoothDevice != null) {
                bluetoothGattServer.cancelConnection(bluetoothDevice);
            }
            this.g.clearServices();
            this.g.close();
            this.g = null;
        }
    }

    @Override // com.heytap.accessory.connectivity.interfaces.c
    public void a(com.heytap.accessory.connectivity.interfaces.b bVar, int i) {
        this.b = bVar;
    }

    public final void b() {
        BluetoothManager bluetoothManager = (BluetoothManager) this.a.getSystemService("bluetooth");
        if (bluetoothManager == null) {
            com.heytap.accessory.base.logging.a.b(f2478n, "Failed to initialize BluetoothManager");
            return;
        }
        BluetoothAdapter adapter = bluetoothManager.getAdapter();
        this.i = adapter;
        if (adapter == null) {
            com.heytap.accessory.base.logging.a.b(f2478n, "Init Failed mBtAdapter == null");
            g();
            return;
        }
        c cVarA = c.a();
        this.k = cVarA;
        if (cVarA == null) {
            com.heytap.accessory.base.logging.a.b(f2478n, "Failed retrieving Server callback! returning...");
            return;
        }
        cVarA.a(c());
        BluetoothGattCharacteristic bluetoothGattCharacteristic = new BluetoothGattCharacteristic(com.heytap.accessory.connectivity.constant.a.b, 16, 2);
        this.f2479c = bluetoothGattCharacteristic;
        bluetoothGattCharacteristic.setWriteType(4);
        this.d = new BluetoothGattDescriptor(com.heytap.accessory.connectivity.constant.a.d, 17);
        this.f2480e = new BluetoothGattDescriptor(com.heytap.accessory.connectivity.constant.a.f2513e, 16);
        this.f2479c.addDescriptor(this.d);
        this.f2479c.addDescriptor(this.f2480e);
        BluetoothGattCharacteristic bluetoothGattCharacteristic2 = new BluetoothGattCharacteristic(com.heytap.accessory.connectivity.constant.a.f2512c, 4, 16);
        this.f = bluetoothGattCharacteristic2;
        bluetoothGattCharacteristic2.setWriteType(4);
        BluetoothGattService bluetoothGattService = new BluetoothGattService(com.heytap.accessory.connectivity.constant.a.a, 0);
        this.h = bluetoothGattService;
        bluetoothGattService.addCharacteristic(this.f2479c);
        this.h.addCharacteristic(this.f);
        BluetoothGattServer bluetoothGattServerOpenGattServer = bluetoothManager.openGattServer(this.a, this.k);
        this.g = bluetoothGattServerOpenGattServer;
        if (bluetoothGattServerOpenGattServer == null) {
            String str = f2478n;
            com.heytap.accessory.base.logging.a.b(str, "Failed to get GATT Server connection");
            com.heytap.accessory.base.logging.a.e(str, "Check if BT is ON");
        } else if (!bluetoothGattServerOpenGattServer.addService(this.h)) {
            com.heytap.accessory.base.logging.a.a(f2478n, "Service Added failed");
        } else {
            com.heytap.accessory.base.logging.a.a(f2478n, "Service Successfully Added");
        }
    }
}
