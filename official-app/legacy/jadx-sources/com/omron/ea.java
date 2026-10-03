package com.omron;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import androidx.camera.core.RetryPolicy;
import java.util.Date;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ea {
    private BluetoothAdapter a;
    protected final Context g;
    private long h;
    protected long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f8979j;
    protected boolean k;

    @NonNull
    protected final Handler p;

    @NonNull
    private final HandlerThread q;
    protected final dz r;
    protected boolean s;
    protected ee u;
    private long b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f8977c = 0;
    protected long d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f8978e = 0;
    private long f = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f8980l = false;
    private boolean m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f8981n = false;

    @NonNull
    protected final Handler o = new Handler(Looper.getMainLooper());
    protected boolean t = false;

    public ea(Context context, long j2, long j3, boolean z, dz dzVar) {
        this.h = j2;
        this.i = j3;
        this.g = context;
        this.r = dzVar;
        this.s = z;
        HandlerThread handlerThread = new HandlerThread("CycledBleScannerThread");
        this.q = handlerThread;
        handlerThread.start();
        this.p = new Handler(handlerThread.getLooper());
    }

    public static ea a(Context context, long j2, long j3, boolean z, dz dzVar) {
        ay.a("CycledBleScanner", "当前Android版本:8+，使用8.0 扫描API", new Object[0]);
        return new eb(context, j2, j3, z, dzVar);
    }

    private boolean b() {
        return a("android.permission.ACCESS_COARSE_LOCATION") || a("android.permission.ACCESS_FINE_LOCATION");
    }

    @MainThread
    private void e() {
        ay.a("CycledBleScanner", "一个扫描周期:完成", new Object[0]);
        try {
            this.r.onCycleEnd();
            if (this.f8979j) {
                if (f() != null) {
                    if (f().isEnabled()) {
                        if (this.i != 0) {
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            if (this.i + this.h >= RetryPolicy.DEFAULT_RETRY_TIMEOUT_IN_MILLIS || jElapsedRealtime - this.b >= RetryPolicy.DEFAULT_RETRY_TIMEOUT_IN_MILLIS) {
                                try {
                                    ay.a("CycledBleScanner", "蓝牙扫描-停止", new Object[0]);
                                    d();
                                    this.f8981n = false;
                                } catch (Exception e2) {
                                    ay.a("CycledBleScanner", "内部Android异常扫描信标", e2);
                                }
                                this.f8977c = SystemClock.elapsedRealtime();
                            } else {
                                ay.a("CycledBleScanner", "不停止扫描，因为 Android 7+版本，保持每次至少扫描6秒钟:" + (RetryPolicy.DEFAULT_RETRY_TIMEOUT_IN_MILLIS - (jElapsedRealtime - this.b)) + " 毫秒后停止", new Object[0]);
                            }
                        } else {
                            ay.a("CycledBleScanner", "不停止扫描。每次扫描都能进行多次模糊检测的设备。", new Object[0]);
                        }
                        this.f8981n = true;
                        this.f8977c = SystemClock.elapsedRealtime();
                    } else {
                        ay.a("CycledBleScanner", "蓝牙已禁用，无法扫描。", new Object[0]);
                        this.t = true;
                    }
                }
                this.d = g();
                ay.a("CycledBleScanner", "下次扫描周期时间:" + this.d, new Object[0]);
                if (this.m) {
                    a(Boolean.TRUE);
                }
            }
            if (this.m) {
                return;
            }
            ay.a("CycledBleScanner", "扫描被禁用。", new Object[0]);
            this.f8980l = false;
        } catch (SecurityException e3) {
            ay.a("CycledBleScanner", "访问蓝牙时出现安全异常", e3);
        }
    }

    private long g() {
        long j2 = this.i;
        if (j2 == 0) {
            return SystemClock.elapsedRealtime();
        }
        return SystemClock.elapsedRealtime() + (j2 - (SystemClock.elapsedRealtime() % (this.h + j2)));
    }

    public abstract boolean c();

    public abstract void d();

    public BluetoothAdapter f() {
        try {
            if (this.a == null) {
                BluetoothAdapter adapter = ((BluetoothManager) this.g.getApplicationContext().getSystemService("bluetooth")).getAdapter();
                this.a = adapter;
                if (adapter == null) {
                    ay.b("CycledBleScanner", "蓝牙适配器 初始化失败");
                }
            }
        } catch (SecurityException e2) {
            ay.a("CycledBleScanner", "蓝牙适配器 初始化失败", e2);
        }
        return this.a;
    }

    @MainThread
    public void h() {
        ay.a("CycledBleScanner", "周期扫描-停止", new Object[0]);
        this.m = false;
        if (!this.f8980l) {
            ay.a("CycledBleScanner", "扫描已经停止", new Object[0]);
            return;
        }
        ay.a("CycledBleScanner", "蓝牙扫描-停止", new Object[0]);
        this.f8979j = false;
        this.f8980l = false;
        n();
        this.f = 0L;
        this.f8977c = SystemClock.elapsedRealtime();
        this.o.removeCallbacksAndMessages(null);
        if (this.f8981n) {
            ay.a("CycledBleScanner", "停止之前打开的扫描。", new Object[0]);
            this.f8981n = false;
            try {
                ay.a("CycledBleScanner", "停止蓝牙扫描", new Object[0]);
                d();
            } catch (Exception e2) {
                ay.a("CycledBleScanner", "Android 内部扫描异常", e2);
            }
        }
    }

    public boolean i() {
        try {
            BluetoothAdapter bluetoothAdapterF = f();
            if (bluetoothAdapterF != null) {
                return bluetoothAdapterF.getState() == 12;
            }
            ay.b("无法获取蓝牙适配器");
            return false;
        } catch (SecurityException e2) {
            ay.b("安全异常检查蓝牙是否开启" + e2.getMessage());
        }
    }

    public boolean j() {
        return this.m;
    }

    @MainThread
    public void k() {
        long jElapsedRealtime = this.f8978e - SystemClock.elapsedRealtime();
        if (!this.m || jElapsedRealtime <= 0) {
            e();
            return;
        }
        ay.a("等待停止扫描:" + jElapsedRealtime + " 毫秒");
        Handler handler = this.o;
        Runnable runnable = new Runnable() { // from class: com.oplus.aiunit.vision.wsm
            @Override // java.lang.Runnable
            public final void run() {
                this.i.k();
            }
        };
        if (jElapsedRealtime > 1000) {
            jElapsedRealtime = 1000;
        }
        handler.postDelayed(runnable, jElapsedRealtime);
    }

    public abstract void l();

    @MainThread
    public void m() {
        ay.a("CycledBleScanner", "周期扫描-停止", new Object[0]);
        this.m = false;
        if (!this.f8980l) {
            ay.a("CycledBleScanner", "扫描已经停止", new Object[0]);
            return;
        }
        a(Boolean.FALSE);
        if (this.f8981n) {
            ay.a("CycledBleScanner", "停止之前打开的扫描。", new Object[0]);
            this.f8981n = false;
            try {
                ay.a("CycledBleScanner", "停止蓝牙扫描", new Object[0]);
                d();
            } catch (Exception e2) {
                ay.a("CycledBleScanner", "Android 内部扫描异常", e2);
            }
        }
    }

    public abstract void n();

    @MainThread
    public void a(long j2, long j3, boolean z) {
        ay.a("CycledBleScanner", "设置-扫描周期:" + j2 + ",扫描间隔: " + j3 + ",后台模式: " + z, new Object[0]);
        if (this.s != z) {
            this.t = true;
        }
        this.s = z;
        this.h = j2;
        this.i = j3;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j4 = this.d;
        if (j4 > jElapsedRealtime) {
            long j5 = this.f8977c + j3;
            if (j5 < j4) {
                this.d = j5;
                ay.a("CycledBleScanner", "下一个扫描开始时间:" + new Date((this.d - SystemClock.elapsedRealtime()) + System.currentTimeMillis()), new Object[0]);
            }
        }
        long j6 = this.f8978e;
        if (j6 > jElapsedRealtime) {
            long j7 = this.b + j2;
            if (j7 < j6) {
                this.f8978e = j7;
                ay.a("CycledBleScanner", "扫描停止时间:" + this.f8978e, new Object[0]);
            }
        }
    }

    @MainThread
    public void a(ee eeVar) {
        this.u = eeVar;
        this.m = true;
        if (this.f8980l) {
            ay.a("CycledBleScanner", "周期扫描-已经开始", new Object[0]);
        } else {
            a(Boolean.TRUE);
        }
    }

    @MainThread
    public void a(Boolean bool) {
        try {
            if (f() == null) {
                ay.b("CycledBleScanner", "蓝牙适配器为空-无法扫描");
            }
            if (!this.m || !bool.booleanValue()) {
                ay.a("CycledBleScanner", "蓝牙扫描-停止", new Object[0]);
                this.f8979j = false;
                this.f8980l = false;
                n();
                this.f = 0L;
                this.f8977c = SystemClock.elapsedRealtime();
                this.o.removeCallbacksAndMessages(null);
                e();
                return;
            }
            this.f8980l = true;
            if (c()) {
                return;
            }
            ay.a("CycledBleScanner", "新的扫描周期-开启", new Object[0]);
            if (!this.f8979j || this.k || this.t) {
                this.f8979j = true;
                this.k = false;
                try {
                    if (f() != null) {
                        if (f().isEnabled()) {
                            if (this.m) {
                                if (this.t) {
                                    this.t = false;
                                    ay.a("CycledBleScanner", "重新启动蓝牙扫描", new Object[0]);
                                } else {
                                    ay.a("CycledBleScanner", "开始新的蓝牙扫描", new Object[0]);
                                }
                                try {
                                    if (Build.VERSION.SDK_INT < 31 ? b() : a()) {
                                        this.f = SystemClock.elapsedRealtime();
                                        l();
                                    }
                                } catch (Exception e2) {
                                    ay.a("CycledBleScanner", "Android内部异常，扫描", e2);
                                }
                            } else {
                                ay.a("CycledBleScanner", "无需扫描。", new Object[0]);
                            }
                            this.b = SystemClock.elapsedRealtime();
                        } else {
                            ay.a("CycledBleScanner", "蓝牙已禁用。无法扫描", new Object[0]);
                        }
                    }
                } catch (Exception e3) {
                    ay.a("CycledBleScanner", "启动蓝牙扫描时出现异常。蓝牙可能已禁用或不可用", e3);
                }
            } else {
                ay.a("CycledBleScanner", "我们已经在扫描了，已经扫描了 " + (SystemClock.elapsedRealtime() - this.f) + " 秒", new Object[0]);
            }
            this.f8978e = SystemClock.elapsedRealtime() + this.h;
            k();
            ay.a("CycledBleScanner", "蓝牙扫描-开始", new Object[0]);
        } catch (SecurityException e4) {
            ay.a("CycledBleScanner", "访问蓝牙时出现安全异常。", e4);
        }
    }

    @RequiresApi(api = 31)
    private boolean a() {
        return a("android.permission.BLUETOOTH_SCAN") && a("android.permission.BLUETOOTH_CONNECT") && a("android.permission.BLUETOOTH_CONNECT");
    }

    private boolean a(String str) {
        return this.g.checkPermission(str, Process.myPid(), Process.myUid()) == 0;
    }
}
