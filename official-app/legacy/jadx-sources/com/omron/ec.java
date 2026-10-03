package com.omron;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes5.dex */
@TargetApi(18)
public class ec extends ea {
    private BluetoothAdapter.LeScanCallback v;

    public ec(Context context, long j2, long j3, boolean z, dz dzVar) {
        super(context, j2, j3, z, dzVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(BluetoothAdapter bluetoothAdapter, BluetoothAdapter.LeScanCallback leScanCallback) {
        try {
            bluetoothAdapter.startLeScan(leScanCallback);
        } catch (Exception e2) {
            ay.a("CycledBleScannerForJellyBeanMr2", "startLeScan() 内部异常", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(BluetoothAdapter bluetoothAdapter, BluetoothAdapter.LeScanCallback leScanCallback) {
        try {
            bluetoothAdapter.stopLeScan(leScanCallback);
        } catch (Exception e2) {
            ay.a("CycledBleScannerForJellyBeanMr2", "stopLeScan() 内部异常", e2);
        }
    }

    @Override // com.omron.ea
    public boolean c() {
        long jElapsedRealtime = this.d - SystemClock.elapsedRealtime();
        if (jElapsedRealtime <= 0) {
            return false;
        }
        ay.a("CycledBleScannerForJellyBeanMr2", "正在等待下一次蓝牙扫描，等待时间为 " + jElapsedRealtime + " 毫秒", new Object[0]);
        Handler handler = this.o;
        Runnable runnable = new Runnable() { // from class: com.oplus.aiunit.vision.ysm
            @Override // java.lang.Runnable
            public final void run() {
                this.i.p();
            }
        };
        if (jElapsedRealtime > 1000) {
            jElapsedRealtime = 1000;
        }
        handler.postDelayed(runnable, jElapsedRealtime);
        return true;
    }

    @Override // com.omron.ea
    public void d() {
        r();
        this.k = true;
    }

    @Override // com.omron.ea
    public void l() {
        q();
    }

    @Override // com.omron.ea
    public void n() {
        r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
        ay.a("CycledBleScannerForJellyBeanMr2", "扫描到设备", new Object[0]);
        ee eeVar = this.u;
        if (eeVar == null) {
            this.r.a(bluetoothDevice, i, bArr, System.currentTimeMillis());
        } else if (eeVar.a(bluetoothDevice.getName(), bluetoothDevice.getAddress())) {
            this.r.a(bluetoothDevice, i, bArr, System.currentTimeMillis());
        }
    }

    private BluetoothAdapter.LeScanCallback o() {
        if (this.v == null) {
            this.v = new BluetoothAdapter.LeScanCallback() { // from class: com.oplus.aiunit.vision.btm
                @Override // android.bluetooth.BluetoothAdapter.LeScanCallback
                public final void onLeScan(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
                    this.a.a(bluetoothDevice, i, bArr);
                }
            };
        }
        return this.v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p() {
        a(Boolean.TRUE);
    }

    private void q() {
        final BluetoothAdapter bluetoothAdapterF = f();
        if (bluetoothAdapterF == null) {
            return;
        }
        final BluetoothAdapter.LeScanCallback leScanCallbackO = o();
        this.p.removeCallbacksAndMessages(null);
        this.p.post(new Runnable() { // from class: com.oplus.aiunit.vision.zsm
            @Override // java.lang.Runnable
            public final void run() {
                com.omron.ec.a(bluetoothAdapterF, leScanCallbackO);
            }
        });
    }

    private void r() {
        final BluetoothAdapter bluetoothAdapterF = f();
        if (bluetoothAdapterF == null) {
            return;
        }
        final BluetoothAdapter.LeScanCallback leScanCallbackO = o();
        this.p.removeCallbacksAndMessages(null);
        this.p.post(new Runnable() { // from class: com.oplus.aiunit.vision.atm
            @Override // java.lang.Runnable
            public final void run() {
                com.omron.ec.b(bluetoothAdapterF, leScanCallbackO);
            }
        });
    }
}
