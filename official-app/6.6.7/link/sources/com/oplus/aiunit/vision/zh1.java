package com.oplus.aiunit.vision;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class zh1 {
    public boolean a;
    public d b;
    public BluetoothDevice e;
    public boolean c = false;
    public Handler d = new Handler(Looper.getMainLooper());
    public BluetoothAdapter.LeScanCallback g = new a();
    public Runnable h = new b();
    public ScanCallback i = new c();
    public ScanSettings f = new ScanSettings.Builder().setScanMode(2).build();

    public class a implements BluetoothAdapter.LeScanCallback {
        public a() {
        }

        @Override // android.bluetooth.BluetoothAdapter.LeScanCallback
        public void onLeScan(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
            zh1.this.e(bluetoothDevice);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            zh1.this.h();
            if (zh1.this.b != null) {
                zh1 zh1Var = zh1.this;
                zh1Var.f(zh1Var.b, null, 1);
                zh1.this.b = null;
            }
        }
    }

    public class c extends ScanCallback {
        public c() {
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onScanFailed(int i) {
            super.onScanFailed(i);
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onScanResult(int i, ScanResult scanResult) {
            super.onScanResult(i, scanResult);
            if (scanResult != null) {
                zh1.this.e(scanResult.getDevice());
            }
        }
    }

    public interface d {
        public static final int RESULT_BLUETOOTH_DISABLE = 2;
        public static final int RESULT_DEVICE_FOUND = 0;
        public static final int RESULT_DEVICE_NOT_FOUND = 1;
        public static final int RESULT_DEVICE_NULL = 3;

        void a(BluetoothDevice bluetoothDevice, int i);
    }

    public final void e(BluetoothDevice bluetoothDevice) {
        synchronized (this) {
            if (this.c) {
                uml.a("BleScanHelper", "checkIsTargetDevice: already ");
                return;
            }
            if (bluetoothDevice.equals(this.e)) {
                synchronized (this) {
                    this.c = true;
                }
                uml.d("BleScanHelper", "checkIsTargetDevice: find target device");
                h();
                d dVar = this.b;
                if (dVar != null) {
                    f(dVar, bluetoothDevice, 0);
                    this.b = null;
                }
            }
        }
    }

    public final void f(d dVar, BluetoothDevice bluetoothDevice, int i) {
        if (dVar != null) {
            dVar.a(bluetoothDevice, i);
        }
    }

    public synchronized void g() {
        this.b = null;
        h();
    }

    public void h() {
        this.a = false;
        this.d.removeCallbacks(this.h);
        uml.d("BleScanHelper", "stopScan ");
        i();
    }

    public final void i() {
        if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
            try {
                BluetoothLeScanner bluetoothLeScanner = BluetoothAdapter.getDefaultAdapter().getBluetoothLeScanner();
                if (bluetoothLeScanner != null) {
                    bluetoothLeScanner.stopScan(this.i);
                }
            } catch (Exception e) {
                uml.b("BleScanHelper", "stopScanInternal: " + e.getMessage());
            }
        }
    }
}
