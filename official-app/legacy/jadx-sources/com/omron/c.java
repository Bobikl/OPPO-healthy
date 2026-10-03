package com.omron;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import com.omron.lib.BleScanDevice;
import com.omron.lib.utils.OmronLogVisibleUtil;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class c {

    @Nullable
    protected static volatile c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Object f8857j = new Object();

    @NonNull
    private final Context a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    protected final Handler f8858c;

    @NonNull
    private final HandlerThread d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b f8859e;

    @Nullable
    private com.omron.a f;

    @Nullable
    private ea g;

    @NonNull
    protected final Handler b = new Handler(Looper.getMainLooper());
    private final dz h = new a();

    public class a implements dz {
        public a() {
        }

        @Override // com.omron.dz
        @MainThread
        public void a(BluetoothDevice bluetoothDevice, int i, byte[] bArr, long j2) {
            c.this.a(bluetoothDevice, i, bArr, j2);
        }

        @Override // com.omron.dz
        @MainThread
        public void onCycleEnd() {
            com.omron.a aVarA = c.this.a();
            if (aVarA != null) {
                aVarA.onCycleEnd();
            }
        }
    }

    public c(@NonNull Context context) {
        this.a = context.getApplicationContext();
        HandlerThread handlerThread = new HandlerThread("BleScanHelperThread");
        this.d = handlerThread;
        handlerThread.start();
        this.f8858c = new Handler(handlerThread.getLooper());
        a(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.b.removeCallbacksAndMessages(null);
        f();
    }

    @Nullable
    public ea b() {
        return this.g;
    }

    public boolean c() {
        ea eaVar = this.g;
        if (eaVar == null) {
            return false;
        }
        return eaVar.i();
    }

    public boolean d() {
        ea eaVar = this.g;
        if (eaVar == null) {
            return false;
        }
        return eaVar.j();
    }

    @MainThread
    public void f() {
        this.b.removeCallbacksAndMessages(null);
        ea eaVar = this.g;
        if (eaVar != null) {
            eaVar.m();
        }
    }

    @MainThread
    public void g() {
        this.b.removeCallbacksAndMessages(null);
        ea eaVar = this.g;
        if (eaVar != null) {
            eaVar.h();
        }
    }

    @Nullable
    public com.omron.a a() {
        return this.f;
    }

    public void b(boolean z) {
        if (b() != null) {
            b().a(31000L, 1000L, z);
        }
    }

    @NonNull
    public static c a(@NonNull Context context) {
        c cVar = i;
        if (cVar == null) {
            synchronized (f8857j) {
                cVar = i;
                if (cVar == null) {
                    cVar = new c(context);
                    i = cVar;
                    ay.a("BleScanHelper 初始化");
                }
            }
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(BluetoothDevice bluetoothDevice, int i2, byte[] bArr, long j2) {
        int i3;
        byte b;
        eg.a aVarA = eg.a(bArr);
        com.omron.a aVarA2 = a();
        if (aVarA2 == null) {
            ay.a("BleScanHelper", "error: 扫描设备 回调函数为空", new Object[0]);
            return;
        }
        b bVar = this.f8859e;
        if (bVar == null) {
            ay.a("BleScanHelper", "符合条件(过滤设备条件为空),设备名称:mac地址:" + OmronLogVisibleUtil.getMessage(bluetoothDevice.getAddress()) + " 设备名称：" + OmronLogVisibleUtil.getMessage(bluetoothDevice.getAddress()), new Object[0]);
            aVarA2.onBleScan(new BleScanDevice(bluetoothDevice, aVarA.a(), bluetoothDevice.getAddress()), i2, bArr);
            return;
        }
        if (!bVar.a(bluetoothDevice.getAddress())) {
            ay.a("BleScanHelper", "mac地址不符合搜索条件");
            return;
        }
        List<aq> listD = this.f8859e.d();
        if (listD == null || listD.isEmpty()) {
            ay.a("BleScanHelper", "符合条件(过滤设备设备型号列表条件为空),设备名称:mac地址:" + OmronLogVisibleUtil.getMessage(bluetoothDevice.getAddress()) + " 设备名称：" + OmronLogVisibleUtil.getMessage(bluetoothDevice.getName()), new Object[0]);
            aVarA2.onBleScan(new BleScanDevice(bluetoothDevice, aVarA.a(), bluetoothDevice.getAddress()), i2, bArr);
            return;
        }
        aq aqVarA = ao.a(listD, bluetoothDevice.getName());
        if (aqVarA == null) {
            ay.a("BleScanHelper", "设备名称前缀不符合条件");
            return;
        }
        ay.a("BleScanHelper", "符合条件,设备名称:mac地址:" + OmronLogVisibleUtil.getMessage(bluetoothDevice.getAddress()) + " 设备名称：" + OmronLogVisibleUtil.getMessage(bluetoothDevice.getName()), new Object[0]);
        if (this.f8859e.e() && ((aqVarA.b() == 1 || aqVarA.b() == 4) && bArr != null && bArr.length > 18)) {
            int i4 = bArr[0] + 1;
            byte b2 = bArr[i4];
            if (b2 != 17) {
                byte b3 = (byte) (b2 + 1);
                bArr[i4] = b3;
                int i5 = i4 + b3;
                byte b4 = (byte) (bArr[i5] + 1);
                bArr[i5] = b4;
                if (String.valueOf(a(bArr[i5 + b4 + 5])[4]).equals("0")) {
                    Log.d("血压计/体脂仪状态不正确：", "当前为同步状态！！");
                    return;
                }
            }
        } else if (!this.f8859e.e() && ((aqVarA.b() == 1 || aqVarA.b() == 4) && bArr != null && bArr.length > 18 && (b = bArr[(i3 = bArr[0] + 1)]) != 17)) {
            byte b5 = (byte) (b + 1);
            bArr[i3] = b5;
            int i6 = i3 + b5;
            byte b6 = (byte) (bArr[i6] + 1);
            bArr[i6] = b6;
            if (String.valueOf(a(bArr[i6 + b6 + 5])[4]).equals("1")) {
                Log.d("血压计/体脂仪状态不正确：", "当前为配对状态！！");
                return;
            }
        }
        aVarA2.onBleScan(new BleScanDevice(aqVarA.c(), bluetoothDevice, aVarA.a(), bluetoothDevice.getAddress()), i2, bArr);
    }

    public void a(@Nullable com.omron.a aVar) {
        this.f = aVar;
    }

    @MainThread
    public void a(b bVar, long j2) {
        if (this.g == null) {
            ay.a("BleScanHelper", "mCycledScanner-为空", new Object[0]);
            return;
        }
        this.f8859e = bVar;
        if (bVar == null) {
            ay.a("BleScanHelper", "mBleScanData:为空", new Object[0]);
        } else {
            ay.a("BleScanHelper", "mBleScanData:" + this.f8859e, new Object[0]);
            List<aq> listD = this.f8859e.d();
            if (listD == null || listD.isEmpty()) {
                ay.a("BleScanHelper", "mBleScanData:prefixList为空", new Object[0]);
            } else {
                StringBuilder sb = new StringBuilder();
                Iterator<aq> it = listD.iterator();
                while (it.hasNext()) {
                    sb.append(it.next().a());
                    sb.append(";");
                }
                ay.a("BleScanHelper", "mBleScanData:prefixList:" + ((Object) sb), new Object[0]);
            }
        }
        if (j2 > 0) {
            this.g.a(j2 + 1000, 0L, false);
            this.b.postDelayed(new Runnable() { // from class: com.oplus.aiunit.vision.fkm
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.e();
                }
            }, j2);
        } else {
            b(false);
        }
        this.g.a(this.f8859e);
    }

    private void a(boolean z) {
        this.g = ea.a(this.a, 31000L, 1000L, z, this.h);
    }

    private char[] a(int i2) {
        String binaryString = Integer.toBinaryString(i2);
        int length = binaryString.toCharArray().length;
        StringBuilder sb = new StringBuilder();
        if (length < 8) {
            for (int i3 = 0; i3 < 8 - length; i3++) {
                sb.append("0");
            }
        }
        return (((Object) sb) + binaryString).toCharArray();
    }
}
