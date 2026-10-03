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

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class a implements com.heytap.accessory.connectivity.interfaces.c {
    public static final String n = "a";
    public static volatile a o;
    public com.heytap.accessory.connectivity.interfaces.b b;
    public BluetoothGattDescriptor e;
    public BluetoothGattService h;
    public int l = 20;
    public int m = 1;
    public BluetoothGattCharacteristic c = null;
    public BluetoothGattCharacteristic f = null;
    public BluetoothGattDescriptor d = null;
    public BluetoothGattServer g = null;
    public BluetoothDevice j = null;
    public c k = null;
    public BluetoothAdapter i = BluetoothAdapter.getDefaultAdapter();
    public Context a = PlatformUtils.getContext();

    public int e() {
        return this.l;
    }

    public final void f() {
        com.heytap.accessory.connectivity.ble.a aVar = new com.heytap.accessory.connectivity.ble.a(this.j.getAddress());
        aVar.a(this.g);
        aVar.c(this.j.getAddress());
        aVar.d(this.j.getName());
        aVar.f(4);
        this.b.a(aVar, this.m);
    }

    public final void g() {
        this.b.a(-1107, (com.heytap.accessory.base.bean.b) null, this.m);
    }

    public class a implements d {

        public class a extends BluetoothGattCallback {
            public a(a aVar) {
            }

            @Override // android.bluetooth.BluetoothGattCallback
            public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
                super.onConnectionStateChange(bluetoothGatt, i, i2);
                com.heytap.accessory.base.logging.a.a(a.n, "remote connect gatt callback:" + i2);
            }
        }

        public a() {
        }

        @Override // com.heytap.accessory.connectivity.ble.interfaces.d
        public void a(BluetoothDevice bluetoothDevice, int i, int i2) {
            String address = bluetoothDevice.getAddress();
            com.heytap.accessory.base.logging.a.d(a.n, "Discovery : onConnectionStateChanged newState = " + i + " device:" + HexUtils.hideAddress(address));
            if (i == 2) {
                com.heytap.accessory.base.logging.a.a(a.n, "BluetoothProfile.STATE_CONNECTED");
            } else if (i == 0) {
                com.heytap.accessory.base.logging.a.a(a.n, "BluetoothProfile.STATE_DISCONNECTED");
            }
        }

        @Override // com.heytap.accessory.connectivity.ble.interfaces.d
        public void b(BluetoothDevice bluetoothDevice, int i, int i2, byte[] bArr) {
            com.heytap.accessory.base.logging.a.d(a.n, "Discovery : onDescriptorReadRequest");
            a.this.g.sendResponse(bluetoothDevice, i, 0, i2, bArr);
        }

        @Override // com.heytap.accessory.connectivity.ble.interfaces.d
        public void c(BluetoothDevice bluetoothDevice, int i, int i2, byte[] bArr) {
            com.heytap.accessory.base.logging.a.d(a.n, "Discovery : onCharacteristicWriteRequest");
        }

        @Override // com.heytap.accessory.connectivity.ble.interfaces.d
        public void d(BluetoothDevice bluetoothDevice, int i, int i2, byte[] bArr) {
            com.heytap.accessory.base.logging.a.d(a.n, "Discovery : onCharacteristicReadRequest");
            a.this.g.sendResponse(bluetoothDevice, i, 0, i2, bArr);
        }

        @Override // com.heytap.accessory.connectivity.ble.interfaces.d
        public void d() {
            com.heytap.accessory.base.logging.a.d(a.n, "Discovery : onServiceAdded");
        }

        @Override // com.heytap.accessory.connectivity.ble.interfaces.d
        public void a(BluetoothDevice bluetoothDevice, int i, int i2, byte[] bArr) {
            com.heytap.accessory.base.logging.a.d(a.n, "Discovery : onDescriptorWriteRequest");
            a.this.g.sendResponse(bluetoothDevice, i, 0, i2, bArr);
            a.this.j = bluetoothDevice;
            a.this.f();
            if (com.heytap.accessory.connectivity.ble.c.a().b(bluetoothDevice.getAddress())) {
                return;
            }
            com.heytap.accessory.base.logging.a.a(a.n, "start server connect");
            com.heytap.accessory.connectivity.ble.c.a().a(bluetoothDevice.connectGatt(PlatformUtils.getContext(), false, new a(this), 2));
        }

        @Override // com.heytap.accessory.connectivity.ble.interfaces.d
        public void a(int i) {
            com.heytap.accessory.base.logging.a.d(a.n, "onMtuChanged : " + i);
            if (i != a.this.l) {
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
            com.heytap.accessory.base.logging.a.e(n, "Bt Adapter is null");
            this.b.a(-1104, (com.heytap.accessory.base.bean.b) null, this.m);
            return false;
        }
        if (this.g != null) {
            com.heytap.accessory.base.logging.a.a(n, "server already started!");
            return false;
        }
        if (!bluetoothAdapter.isEnabled()) {
            com.heytap.accessory.base.logging.a.a(n, "BT Is OFF");
            return false;
        }
        com.heytap.accessory.base.logging.a.a(n, "BT Is ON");
        b();
        return true;
    }

    public void c(int i) {
        this.l = i;
    }

    public final d c() {
        return new a();
    }

    @Override // com.heytap.accessory.connectivity.interfaces.c
    public void a(int i) {
        com.heytap.accessory.base.logging.a.d(n, "Stop BLE Server");
        BluetoothGattServer bluetoothGattServer = this.g;
        if (bluetoothGattServer != null) {
            BluetoothDevice bluetoothDevice = this.j;
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
            com.heytap.accessory.base.logging.a.b(n, "Failed to initialize BluetoothManager");
            return;
        }
        BluetoothAdapter adapter = bluetoothManager.getAdapter();
        this.i = adapter;
        if (adapter == null) {
            com.heytap.accessory.base.logging.a.b(n, "Init Failed mBtAdapter == null");
            g();
            return;
        }
        c cVarA = c.a();
        this.k = cVarA;
        if (cVarA == null) {
            com.heytap.accessory.base.logging.a.b(n, "Failed retrieving Server callback! returning...");
            return;
        }
        cVarA.a(c());
        BluetoothGattCharacteristic bluetoothGattCharacteristic = new BluetoothGattCharacteristic(com.heytap.accessory.connectivity.constant.a.b, 16, 2);
        this.c = bluetoothGattCharacteristic;
        bluetoothGattCharacteristic.setWriteType(4);
        this.d = new BluetoothGattDescriptor(com.heytap.accessory.connectivity.constant.a.d, 17);
        this.e = new BluetoothGattDescriptor(com.heytap.accessory.connectivity.constant.a.e, 16);
        this.c.addDescriptor(this.d);
        this.c.addDescriptor(this.e);
        BluetoothGattCharacteristic bluetoothGattCharacteristic2 = new BluetoothGattCharacteristic(com.heytap.accessory.connectivity.constant.a.c, 4, 16);
        this.f = bluetoothGattCharacteristic2;
        bluetoothGattCharacteristic2.setWriteType(4);
        BluetoothGattService bluetoothGattService = new BluetoothGattService(com.heytap.accessory.connectivity.constant.a.a, 0);
        this.h = bluetoothGattService;
        bluetoothGattService.addCharacteristic(this.c);
        this.h.addCharacteristic(this.f);
        BluetoothGattServer bluetoothGattServerOpenGattServer = bluetoothManager.openGattServer(this.a, this.k);
        this.g = bluetoothGattServerOpenGattServer;
        if (bluetoothGattServerOpenGattServer == null) {
            String str = n;
            com.heytap.accessory.base.logging.a.b(str, "Failed to get GATT Server connection");
            com.heytap.accessory.base.logging.a.e(str, "Check if BT is ON");
        } else if (!bluetoothGattServerOpenGattServer.addService(this.h)) {
            com.heytap.accessory.base.logging.a.a(n, "Service Added failed");
        } else {
            com.heytap.accessory.base.logging.a.a(n, "Service Successfully Added");
        }
    }
}
