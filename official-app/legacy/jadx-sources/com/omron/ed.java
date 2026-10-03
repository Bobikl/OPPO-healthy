package com.omron;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.support.annotation.MainThread;
import androidx.camera.core.RetryPolicy;
import com.omron.lib.utils.OmronLogVisibleUtil;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
@TargetApi(21)
public class ed extends ea {
    private BluetoothLeScanner v;
    private ScanCallback w;
    private long x;
    private long y;
    private boolean z;

    public class a extends ScanCallback {
        public a() {
        }

        @Override // android.bluetooth.le.ScanCallback
        @MainThread
        public void onBatchScanResults(List<ScanResult> list) {
            ay.a("CycledBleScannerForLollipop", "搜索到批量设备", new Object[0]);
            for (ScanResult scanResult : list) {
                ed.this.r.a(scanResult.getDevice(), scanResult.getRssi(), scanResult.getScanRecord().getBytes(), (System.currentTimeMillis() - SystemClock.elapsedRealtime()) + (scanResult.getTimestampNanos() / 1000000));
            }
            if (ed.this.x > 0) {
                ay.a("CycledBleScannerForLollipop", "已在后台获得筛选的批扫描结果。", new Object[0]);
            }
        }

        @Override // android.bluetooth.le.ScanCallback
        @MainThread
        public void onScanFailed(int i) {
            String str;
            if (i == 1) {
                str = "扫描失败：应用程序已启动具有相同设置的BLE扫描";
            } else if (i == 2) {
                str = "扫描失败：无法注册应用程序";
            } else if (i == 3) {
                str = "扫描失败：内部错误";
            } else if (i != 4) {
                str = "扫描失败，出现未知错误 (errorCode=" + i + ")";
            } else {
                str = "扫描失败：不支持电源优化扫描功能";
            }
            ay.b(str);
        }

        @Override // android.bluetooth.le.ScanCallback
        @MainThread
        public void onScanResult(int i, ScanResult scanResult) {
            ay.a("CycledBleScannerForLollipop", "搜索到设备:" + OmronLogVisibleUtil.getMessage(scanResult.getDevice().getName()), new Object[0]);
            dz dzVar = ed.this.r;
            BluetoothDevice device = scanResult.getDevice();
            int rssi = scanResult.getRssi();
            ScanRecord scanRecord = scanResult.getScanRecord();
            Objects.requireNonNull(scanRecord);
            dzVar.a(device, rssi, scanRecord.getBytes(), (System.currentTimeMillis() - SystemClock.elapsedRealtime()) + (scanResult.getTimestampNanos() / 1000000));
            if (ed.this.x > 0) {
                ay.a("CycledBleScannerForLollipop", "在后台得到一个过滤的扫描结果。", new Object[0]);
            }
        }
    }

    public ed(Context context, long j2, long j3, boolean z, dz dzVar) {
        super(context, j2, j3, z, dzVar);
        this.x = 0L;
        this.y = 0L;
        this.z = false;
    }

    private void r() {
        if (!i()) {
            ay.a("CycledBleScannerForLollipop", "不停止扫描，因为蓝牙已关闭", new Object[0]);
            return;
        }
        final BluetoothLeScanner bluetoothLeScannerP = p();
        if (bluetoothLeScannerP == null) {
            return;
        }
        final ScanCallback scanCallbackO = o();
        this.p.removeCallbacksAndMessages(null);
        this.p.post(new Runnable() { // from class: com.oplus.aiunit.vision.etm
            @Override // java.lang.Runnable
            public final void run() {
                com.omron.ed.a(bluetoothLeScannerP, scanCallbackO);
            }
        });
    }

    @Override // com.omron.ea
    public boolean c() {
        long jElapsedRealtime = this.d - SystemClock.elapsedRealtime();
        boolean z = jElapsedRealtime > 0;
        boolean z2 = this.z;
        this.z = !z;
        if (z) {
            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - eh.a().b();
            if (z2) {
                if (jElapsedRealtime2 > 10000) {
                    this.x = SystemClock.elapsedRealtime();
                    this.y = 0L;
                    ay.a("CycledBleScannerForLollipop", "Android 5+. 正在准备对背景进行过滤扫描。", new Object[0]);
                    if (this.i > RetryPolicy.DEFAULT_RETRY_TIMEOUT_IN_MILLIS) {
                        l();
                    } else {
                        ay.a("CycledBleScannerForLollipop", "周期间扫描太短", new Object[0]);
                    }
                } else {
                    ay.a("CycledBleScannerForLollipop", "Android 5+ 但是上次扫描在:" + jElapsedRealtime2 + "之前,不会一直在后台扫描。", new Object[0]);
                }
            }
            if (this.x > 0 && eh.a().b() > this.x) {
                if (this.y == 0) {
                    this.y = eh.a().b();
                }
                if (SystemClock.elapsedRealtime() - this.y >= 10000) {
                    ay.a("CycledBleScannerForLollipop", "我们已经检测了一段时间了。停止Android 5+ 后台扫描", new Object[0]);
                    n();
                    this.x = 0L;
                } else {
                    ay.a("CycledBleScannerForLollipop", "提供Android 5+后台扫描结果", new Object[0]);
                    this.r.onCycleEnd();
                }
            }
            ay.a("CycledBleScannerForLollipop", "正在等待启动，另一个完整的蓝牙扫描 " + jElapsedRealtime + " 毫秒", new Object[0]);
            Handler handler = this.o;
            Runnable runnable = new Runnable() { // from class: com.oplus.aiunit.vision.dtm
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.q();
                }
            };
            if (jElapsedRealtime > 1000) {
                jElapsedRealtime = 1000;
            }
            handler.postDelayed(runnable, jElapsedRealtime);
        } else if (this.x > 0) {
            n();
            this.x = 0L;
        }
        return z;
    }

    @Override // com.omron.ea
    public void d() {
        ay.a("CycledBleScannerForLollipop", "停止扫描,扫描结束", new Object[0]);
        n();
        this.k = true;
    }

    @Override // com.omron.ea
    public void l() {
        if (!i()) {
            ay.a("CycledBleScannerForLollipop", "由于蓝牙已关闭，无法启动扫描", new Object[0]);
            return;
        }
        List<ScanFilter> listA = new ef().a(this.u);
        ScanSettings scanSettingsBuild = (!this.z ? new ScanSettings.Builder().setScanMode(0) : new ScanSettings.Builder().setScanMode(2)).build();
        if (scanSettingsBuild != null) {
            a(listA, scanSettingsBuild);
        }
    }

    @Override // com.omron.ea
    public void n() {
        r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(BluetoothLeScanner bluetoothLeScanner, ScanCallback scanCallback) {
        String str;
        try {
            ay.a("CycledBleScannerForLollipop", "正在扫描处理程序上停止LE扫描", new Object[0]);
            bluetoothLeScanner.stopScan(scanCallback);
        } catch (IllegalStateException e2) {
            e = e2;
            str = "无法停止扫描。蓝牙可能已关闭：";
            ay.a("CycledBleScannerForLollipop", str, e);
        } catch (NullPointerException e3) {
            e = e3;
            str = "无法停止扫描，异常信息:";
            ay.a("CycledBleScannerForLollipop", str, e);
        } catch (SecurityException e4) {
            e = e4;
            str = "无法停止扫，异常信息:";
            ay.a("CycledBleScannerForLollipop", str, e);
        }
    }

    private ScanCallback o() {
        if (this.w == null) {
            this.w = new a();
        }
        return this.w;
    }

    private BluetoothLeScanner p() {
        try {
            if (this.v == null && f() != null) {
                this.v = f().getBluetoothLeScanner();
            }
        } catch (SecurityException e2) {
            ay.b("扫描器获取异常：" + e2.getMessage(), new Object[0]);
        }
        return this.v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q() {
        a(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(BluetoothLeScanner bluetoothLeScanner, List list, ScanSettings scanSettings, ScanCallback scanCallback) {
        String str;
        try {
            bluetoothLeScanner.startScan((List<ScanFilter>) list, scanSettings, scanCallback);
        } catch (IllegalStateException e2) {
            e = e2;
            str = "无法启动扫描。蓝牙可能已关闭：";
            ay.a("CycledBleScannerForLollipop", str, e);
        } catch (NullPointerException e3) {
            e = e3;
            str = "无法启动扫描，异常信息:";
            ay.a("CycledBleScannerForLollipop", str, e);
        } catch (SecurityException e4) {
            ay.b("CycledBleScannerForLollipop", "无法启动扫描，异常信息: " + e4.getMessage());
        }
    }

    private void a(final List<ScanFilter> list, final ScanSettings scanSettings) {
        final BluetoothLeScanner bluetoothLeScannerP = p();
        if (bluetoothLeScannerP == null) {
            return;
        }
        final ScanCallback scanCallbackO = o();
        this.p.removeCallbacksAndMessages(null);
        this.p.post(new Runnable() { // from class: com.oplus.aiunit.vision.ftm
            @Override // java.lang.Runnable
            public final void run() {
                com.omron.ed.a(bluetoothLeScannerP, list, scanSettings, scanCallbackO);
            }
        });
    }
}
