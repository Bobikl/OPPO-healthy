package com.oplus.aiunit.vision;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class op5 {
    public static final op5 c = new op5();
    public static final long d = TimeUnit.HOURS.toMillis(1);
    public final wqa a = new ucg();
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
                op5.this.o(str, jCurrentTimeMillis);
                op5.this.n(str, true);
                uml.d("DeviceRecord", "record connect " + veb.a(str) + " " + jCurrentTimeMillis);
                op5.this.b.sendMessageDelayed(op5.this.b.obtainMessage(1, str), op5.d);
                return;
            }
            if (i == 2) {
                String str2 = (String) message.obj;
                if (!op5.this.g(str2)) {
                    uml.d("DeviceRecord", "record disconnect, last is dis ignore");
                    return;
                }
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                op5.this.n(str2, false);
                op5.this.p(str2, jCurrentTimeMillis2);
                uml.d("DeviceRecord", "record disconnect " + veb.a(str2) + " " + jCurrentTimeMillis2);
                op5.this.b.removeMessages(1, str2);
            }
        }
    }

    public static op5 h() {
        return c;
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
        long j = jCurrentTimeMillis - jI;
        uml.d("DeviceRecord", "getLastDisConnectedDirection: conn=" + zG + " time=" + j + " " + veb.a(str));
        return j;
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

    public final void o(String str, long j) {
        this.a.putLong("D_" + str, j);
    }

    public final void p(String str, long j) {
        this.a.putLong("C_" + str, j);
    }
}
