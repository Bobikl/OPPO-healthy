package com.oplus.aiunit.vision;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.ParcelUuid;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class mh1 implements Handler.Callback {
    public static final String TAG = "BleScanner";
    public ih1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public BluetoothAdapter f14066j;
    public Handler k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ScanCallback f14067l;
    public final int m;

    public class a extends ScanCallback {
        public a() {
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onBatchScanResults(List<ScanResult> list) {
            for (ScanResult scanResult : list) {
                if (scanResult != null) {
                    mh1.this.i(scanResult);
                }
            }
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onScanFailed(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append("onScanFailed: ");
            sb.append(i);
            if (i == 1 || mh1.this.i == null) {
                return;
            }
            mh1.this.i.b();
            mh1.this.i = null;
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onScanResult(int i, ScanResult scanResult) {
            StringBuilder sb = new StringBuilder();
            sb.append("onScanResult: ");
            sb.append(scanResult);
            mh1.this.i(scanResult);
        }
    }

    public static class b {
        public static final mh1 a = new mh1();
    }

    public static mh1 f() {
        return b.a;
    }

    public final ScanCallback g() {
        if (this.f14067l == null) {
            this.f14067l = new a();
        }
        return this.f14067l;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(@NonNull Message message) {
        if (message.what == 1) {
            n();
        }
        return true;
    }

    public final void i(ScanResult scanResult) {
        if (this.i != null) {
            ScanRecord scanRecord = scanResult.getScanRecord();
            this.i.a(scanResult.getDevice(), scanResult.getRssi(), scanRecord != null ? scanRecord.getBytes() : null);
        }
    }

    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final synchronized void h(@NonNull keg kegVar, ih1 ih1Var) {
        this.i = ih1Var;
        ScanSettings scanSettingsBuild = new ScanSettings.Builder().setScanMode(2).build();
        List<ScanFilter> listO = o(kegVar);
        BluetoothLeScanner bluetoothLeScanner = this.f14066j.getBluetoothLeScanner();
        if (bluetoothLeScanner != null) {
            bluetoothLeScanner.startScan(listO, scanSettingsBuild, g());
        }
        this.k.removeMessages(1);
        this.k.sendEmptyMessageDelayed(1, kegVar.d());
    }

    public void k(final keg kegVar, final ih1 ih1Var) {
        if (Looper.myLooper() == this.k.getLooper()) {
            h(kegVar, ih1Var);
        } else {
            this.k.post(new Runnable() { // from class: com.oplus.aiunit.vision.kh1
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.h(kegVar, ih1Var);
                }
            });
        }
    }

    public final void l() {
        m(true);
    }

    public final void m(boolean z) {
        ih1 ih1Var;
        this.k.removeMessages(1);
        BluetoothLeScanner bluetoothLeScanner = this.f14066j.getBluetoothLeScanner();
        if (bluetoothLeScanner != null) {
            bluetoothLeScanner.stopScan(g());
        }
        if (!z || (ih1Var = this.i) == null) {
            return;
        }
        ih1Var.c();
        this.i = null;
    }

    public void n() {
        if (Looper.myLooper() == this.k.getLooper()) {
            l();
        } else {
            this.k.post(new Runnable() { // from class: com.oplus.aiunit.vision.lh1
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.l();
                }
            });
        }
    }

    public final List<ScanFilter> o(keg kegVar) {
        List<keg.a> listC = kegVar.c();
        if (listC == null || listC.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(listC.size());
        for (keg.a aVar : listC) {
            ScanFilter.Builder builder = new ScanFilter.Builder();
            builder.setDeviceAddress(aVar.b());
            builder.setDeviceName(aVar.a());
            if (aVar.h() != null) {
                if (aVar.f() == null || aVar.g() == null) {
                    builder.setServiceUuid(new ParcelUuid(aVar.h()));
                } else if (aVar.g() != null) {
                    builder.setServiceData(new ParcelUuid(aVar.h()), aVar.f(), aVar.g());
                } else {
                    builder.setServiceData(new ParcelUuid(aVar.h()), aVar.f());
                }
            }
            if (aVar.i()) {
                if (aVar.d() != null) {
                    builder.setManufacturerData(aVar.e(), aVar.c(), aVar.d());
                } else {
                    builder.setManufacturerData(aVar.e(), aVar.c());
                }
            }
            arrayList.add(builder.build());
        }
        return arrayList;
    }

    public mh1() {
        this.m = 1;
        this.f14066j = BluetoothAdapter.getDefaultAdapter();
        this.k = new Handler(Looper.getMainLooper(), this);
    }
}
