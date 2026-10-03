package com.omron;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.ParcelUuid;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.omron.lib.OMRONLib;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
class ah {

    @NonNull
    private final el a;

    @NonNull
    private final i b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private final BluetoothAdapter f8800c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f8801e;

    @Nullable
    private ScanCallback f;

    @NonNull
    private final BluetoothAdapter.LeScanCallback d = new a();

    @NonNull
    private final Runnable g = new b();

    public class a implements BluetoothAdapter.LeScanCallback {
        public a() {
        }

        @Override // android.bluetooth.BluetoothAdapter.LeScanCallback
        public void onLeScan(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
            aa.d(bluetoothDevice.getAddress());
            ah.this.a.a(1, new Object[]{bluetoothDevice, Integer.valueOf(i), bArr});
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ah.this.a(h.Timeout);
        }
    }

    public class c extends el {
        public c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Object[] objArr = (Object[]) message.obj;
            ah.this.a((BluetoothDevice) objArr[0], ((Integer) objArr[1]).intValue(), (byte[]) objArr[2]);
        }
    }

    public class d extends BroadcastReceiver {

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                ah.this.a(h.PoweredOff);
            }
        }

        public d() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@NonNull Context context, @NonNull Intent intent) {
            PushAutoTrackHelper.onBroadcastReceiver(this, context, intent);
            if (10 != intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 10)) {
                return;
            }
            if (ah.this.a.a()) {
                ah.this.a(h.PoweredOff);
            } else {
                ah.this.a.post(new a());
            }
        }
    }

    public class e implements Runnable {
        final /* synthetic */ List a;
        final /* synthetic */ int b;

        public e(List list, int i) {
            this.a = list;
            this.b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            ah.this.a((List<aj>) this.a, this.b);
        }
    }

    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ah.this.a(h.StopRequest);
        }
    }

    public class g extends ScanCallback {
        public g() {
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onBatchScanResults(List<ScanResult> list) {
            super.onBatchScanResults(list);
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onScanFailed(int i) {
            super.onScanFailed(i);
        }

        @Override // android.bluetooth.le.ScanCallback
        @TargetApi(21)
        public void onScanResult(int i, ScanResult scanResult) {
            super.onScanResult(i, scanResult);
            if (scanResult.getScanRecord() == null) {
                ah.this.d.onLeScan(scanResult.getDevice(), scanResult.getRssi(), null);
            } else if (!OMRONLib.getInstance().n()) {
                ah.this.d.onLeScan(scanResult.getDevice(), scanResult.getRssi(), scanResult.getScanRecord().getBytes());
            } else if (OMRONLib.getInstance().m().equals(scanResult.getDevice().getAddress())) {
                ah.this.d.onLeScan(scanResult.getDevice(), scanResult.getRssi(), scanResult.getScanRecord().getBytes());
            }
        }
    }

    public enum h {
        PoweredOff,
        AlreadyScanning,
        OSNativeError,
        StopRequest,
        Timeout
    }

    public static abstract class i {
        public void a() {
        }

        public abstract void a(@NonNull BluetoothDevice bluetoothDevice, int i, @NonNull byte[] bArr);

        public void b(@NonNull h hVar) {
        }

        public void a(@NonNull h hVar) {
        }
    }

    public ah(@NonNull Context context, @NonNull i iVar, @Nullable Looper looper) {
        if (looper == null) {
            HandlerThread handlerThread = new HandlerThread("ScannerThread");
            handlerThread.start();
            looper = handlerThread.getLooper();
        }
        this.a = new c(looper);
        this.b = iVar;
        this.f8800c = ((BluetoothManager) context.getSystemService("bluetooth")).getAdapter();
        context.registerReceiver(new d(), new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
    }

    @TargetApi(21)
    private void a() {
        if (this.f == null) {
            aa.b("null == mScanCallback");
            return;
        }
        if (this.f8800c.getBluetoothLeScanner() != null) {
            aa.d("stopScan() exec.");
            this.f8800c.getBluetoothLeScanner().stopScan(this.f);
            aa.a("stopScan() called.");
        } else {
            aa.b("null == mBluetoothAdapter.getBluetoothLeScanner()");
        }
        this.f = null;
    }

    public void b() {
        if (this.a.a()) {
            a(h.StopRequest);
        } else {
            this.a.post(new f());
        }
    }

    @TargetApi(18)
    private void a(@NonNull BluetoothAdapter.LeScanCallback leScanCallback) {
        aa.d("stopLeScan() exec.");
        this.f8800c.stopLeScan(leScanCallback);
        aa.a("stopLeScan() called.");
    }

    public void b(@NonNull List<aj> list, int i2) {
        if (this.a.a()) {
            a(list, i2);
        } else {
            this.a.post(new e(list, i2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(BluetoothDevice bluetoothDevice, int i2, byte[] bArr) {
        if (this.f8801e) {
            this.b.a(bluetoothDevice, i2, bArr);
        } else {
            aa.f("Already stopped.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(h hVar) {
        aa.e(hVar.name());
        if (this.f8801e) {
            a();
            this.a.removeCallbacks(this.g);
            this.f8801e = false;
            this.b.b(hVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(@NonNull List<aj> list, int i2) {
        aa.e(list.toString());
        if (12 != this.f8800c.getState()) {
            this.b.a(h.PoweredOff);
            return;
        }
        if (this.f8801e) {
            this.b.a(h.AlreadyScanning);
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<aj> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().a());
        }
        if (!a(arrayList)) {
            this.b.a(h.OSNativeError);
            return;
        }
        this.a.removeMessages(1);
        if (i2 > 0) {
            this.a.postDelayed(this.g, i2);
        }
        this.f8801e = true;
        this.b.a();
    }

    @TargetApi(21)
    private boolean a(@NonNull List<UUID> list) {
        String str;
        if (this.f != null) {
            str = "null != mScanCallback";
        } else {
            if (this.f8800c.getBluetoothLeScanner() != null) {
                ArrayList arrayList = new ArrayList();
                Iterator<UUID> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new ScanFilter.Builder().setServiceUuid(new ParcelUuid(it.next())).build());
                }
                ScanSettings scanSettingsBuild = new ScanSettings.Builder().setScanMode(2).build();
                g gVar = new g();
                aa.d("scanForPeripherals() exec.");
                try {
                    this.f8800c.getBluetoothLeScanner().startScan(arrayList, scanSettingsBuild, gVar);
                    aa.a("scanForPeripherals() called. ret=true");
                    this.f = gVar;
                    return true;
                } catch (Exception e2) {
                    aa.b(e2.getMessage());
                    aa.b("scanForPeripherals() called. ret=false");
                    return false;
                }
            }
            str = "null == mBluetoothAdapter.getBluetoothLeScanner()";
        }
        aa.b(str);
        return false;
    }

    @TargetApi(18)
    private boolean a(@NonNull List<UUID> list, @NonNull BluetoothAdapter.LeScanCallback leScanCallback) {
        aa.d("startLeScan() exec.");
        boolean zIsEmpty = list.isEmpty();
        BluetoothAdapter bluetoothAdapter = this.f8800c;
        boolean zStartLeScan = zIsEmpty ? bluetoothAdapter.startLeScan(leScanCallback) : bluetoothAdapter.startLeScan((UUID[]) list.toArray(new UUID[0]), leScanCallback);
        if (zStartLeScan) {
            aa.a("startLeScan() called. ret=true");
        } else {
            aa.b("startLeScan() called. ret=false");
        }
        return zStartLeScan;
    }
}
