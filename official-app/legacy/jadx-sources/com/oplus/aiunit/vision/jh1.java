package com.oplus.aiunit.vision;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes5.dex */
public class jh1 {
    public boolean a;
    public d b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public BluetoothDevice f12902e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12901c = false;
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
            jh1.this.e(bluetoothDevice);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            jh1.this.h();
            if (jh1.this.b != null) {
                jh1 jh1Var = jh1.this;
                jh1Var.f(jh1Var.b, null, 1);
                jh1.this.b = null;
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
                jh1.this.e(scanResult.getDevice());
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
            if (this.f12901c) {
                wil.a("BleScanHelper", "checkIsTargetDevice: already ");
                return;
            }
            if (bluetoothDevice.equals(this.f12902e)) {
                synchronized (this) {
                    this.f12901c = true;
                }
                wil.d("BleScanHelper", "checkIsTargetDevice: find target device");
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
        wil.d("BleScanHelper", "stopScan ");
        i();
    }

    public final void i() {
        if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
            try {
                BluetoothLeScanner bluetoothLeScanner = BluetoothAdapter.getDefaultAdapter().getBluetoothLeScanner();
                if (bluetoothLeScanner != null) {
                    bluetoothLeScanner.stopScan(this.i);
                }
            } catch (Exception e2) {
                wil.b("BleScanHelper", "stopScanInternal: " + e2.getMessage());
            }
        }
    }
}
