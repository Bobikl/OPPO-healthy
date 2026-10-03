package com.oplus.aiunit.vision;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public class so5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final so5 f16669c = new so5();
    public static final long d = TimeUnit.HOURS.toMillis(1);
    public final npa a = new l9g();
    public final Handler b = new a(Looper.getMainLooper());

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                String str = (String) message.obj;
                long jCurrentTimeMillis = System.currentTimeMillis();
                so5.this.o(str, jCurrentTimeMillis);
                so5.this.n(str, true);
                wil.d("DeviceRecord", "record connect " + gdb.a(str) + " " + jCurrentTimeMillis);
                so5.this.b.sendMessageDelayed(so5.this.b.obtainMessage(1, str), so5.d);
                return;
            }
            if (i == 2) {
                String str2 = (String) message.obj;
                if (!so5.this.g(str2)) {
                    wil.d("DeviceRecord", "record disconnect, last is dis ignore");
                    return;
                }
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                so5.this.n(str2, false);
                so5.this.p(str2, jCurrentTimeMillis2);
                wil.d("DeviceRecord", "record disconnect " + gdb.a(str2) + " " + jCurrentTimeMillis2);
                so5.this.b.removeMessages(1, str2);
            }
        }
    }

    public static so5 h() {
        return f16669c;
    }

    public final boolean g(String str) {
        return this.a.getBoolean("S_" + str, false);
    }

    public final long i(String str) {
        return this.a.getLong("C_" + str, 0L);
    }

    public long j(String str) {
        long jCurrentTimeMillis;
        long jI;
        boolean zG = g(str);
        if (zG) {
            jCurrentTimeMillis = System.currentTimeMillis();
            jI = i(str);
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
            jI = k(str);
        }
        long j2 = jCurrentTimeMillis - jI;
        wil.d("DeviceRecord", "getLastDisConnectedDirection: conn=" + zG + " time=" + j2 + " " + gdb.a(str));
        return j2;
    }

    public final long k(String str) {
        return this.a.getLong("D_" + str, 0L);
    }

    public synchronized void l(String str) {
        this.b.removeMessages(1, str);
        this.b.removeMessages(2, str);
        this.b.obtainMessage(1, str).sendToTarget();
    }

    public synchronized void m(String str) {
        this.b.removeMessages(1, str);
        this.b.removeMessages(2, str);
        this.b.obtainMessage(2, str).sendToTarget();
    }

    public final void n(String str, boolean z) {
        this.a.putBoolean("S_" + str, z);
    }

    public final void o(String str, long j2) {
        this.a.putLong("D_" + str, j2);
    }

    public final void p(String str, long j2) {
        this.a.putLong("C_" + str, j2);
    }
}
