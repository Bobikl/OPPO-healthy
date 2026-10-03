package com.oplus.aiunit.vision;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class h65 implements vx9, Handler.Callback, Runnable {
    public final int i;
    public final boolean j;
    public final String k;
    public tx9 l;
    public volatile int p;
    public vx9.a q;
    public volatile boolean r;
    public Handler m = new Handler(Looper.getMainLooper(), this);
    public String n = "Retry";
    public volatile int o = 0;
    public boolean s = false;
    public jt t = new jt(e88.a(), wuk.AUTO_RETRY_ACTION, 60000, 0);

    public h65(String str, int i, boolean z, String str2) {
        this.n += "_" + str;
        this.i = i;
        this.j = z;
        this.k = str2;
        this.t.j(this);
    }

    @Override // com.oplus.aiunit.vision.vx9
    public void a(sa5 sa5Var, int i) {
        vx9.a aVar;
        uml.a(this.n, "handleOnDisconnected: " + sa5Var);
        if (this.r || this.p >= this.i) {
            vx9.a aVar2 = this.q;
            if (aVar2 != null) {
                aVar2.a(sa5Var, i);
            }
        } else if (!i() && (aVar = this.q) != null) {
            aVar.a(sa5Var, i);
        }
        this.r = false;
    }

    @Override // com.oplus.aiunit.vision.vx9
    public void b(sa5 sa5Var) {
        vx9.a aVar = this.q;
        if (aVar != null) {
            aVar.b(sa5Var);
        }
        this.r = true;
    }

    @Override // com.oplus.aiunit.vision.vx9
    public void c(tx9 tx9Var) {
        synchronized (this) {
            this.l = tx9Var;
        }
    }

    public void d() {
        synchronized (this) {
            tx9 tx9Var = this.l;
            if (tx9Var != null && tx9Var.b()) {
                uml.d(this.n, "handleMessage: retry Group:" + this.o + " retryCount:" + this.p);
                this.l.retry();
            }
        }
    }

    public final long e(int i) {
        long j = op5.h().j(this.k);
        TimeUnit timeUnit = TimeUnit.DAYS;
        if (j >= timeUnit.toMillis(360L)) {
            uml.d(this.n, "getReconnectingTime: direction too long reset retry, " + j);
            j = 0;
        }
        if (j >= timeUnit.toMillis(30L)) {
            long millis = timeUnit.toMillis(10L);
            uml.a(this.n, "getReconnectingTime: stop delta=" + j);
            return millis;
        }
        if (j >= timeUnit.toMillis(7L)) {
            long millis2 = TimeUnit.HOURS.toMillis(1L);
            uml.a(this.n, "getReconnectingTime: 1h delta=" + j);
            return millis2;
        }
        if (j >= timeUnit.toMillis(3L)) {
            long millis3 = TimeUnit.MINUTES.toMillis(30L);
            uml.a(this.n, "getReconnectingTime: 30min delta=" + j);
            return millis3;
        }
        if (i < 6) {
            return TimeUnit.SECONDS.toMillis(8L);
        }
        int i2 = i - 6;
        long millis4 = i2 > 7 ? 600000L : 2000 << i2;
        if (this.j) {
            TimeUnit timeUnit2 = TimeUnit.SECONDS;
            if (millis4 < timeUnit2.toMillis(10L)) {
                millis4 = timeUnit2.toMillis(10L);
            }
        }
        long j2 = millis4;
        uml.a(this.n, "getReconnectingTime: group=" + i2 + " time=" + j2);
        return j2;
    }

    public int f() {
        return this.o;
    }

    public synchronized boolean g() {
        return this.m.hasMessages(100);
    }

    public final void h() {
        synchronized (this) {
            this.o = 0;
            this.p = 0;
            this.m.removeMessages(100);
            this.t.m();
            z9l.e();
            z9l.d();
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 100) {
            return false;
        }
        d();
        return false;
    }

    public final boolean i() {
        synchronized (this) {
            tx9 tx9Var = this.l;
            if (tx9Var != null && tx9Var.b() && (this.l.a() || this.o == 0)) {
                return k();
            }
            stop();
            return false;
        }
    }

    public void j(PrintWriter printWriter, boolean z) {
        this.s = z;
        if (!z) {
            printWriter.println("  open auto connect retried");
            return;
        }
        printWriter.println("  close auto connect retried=" + f());
        stop();
    }

    public final boolean k() {
        if (this.s) {
            uml.k(this.n, "startReconnecting: shield auto connect");
            return false;
        }
        synchronized (this) {
            if (this.l == null) {
                stop();
                return false;
            }
            this.m.removeMessages(100);
            if (this.p < this.i) {
                this.p++;
                l(2000L);
                uml.a(this.n, "startReconnecting: mRetryCount:" + this.p + ",mRetryGroupCount = " + this.o + " ,delay: reconnectingTime = 2000");
                return true;
            }
            if (!this.l.a()) {
                stop();
                return false;
            }
            this.p = 0;
            long jE = e(this.o);
            if (jE == 0) {
                this.l.retry();
                stop();
                return true;
            }
            l(jE);
            uml.a(this.n, "startReconnecting: mRetryCount:" + this.p + ",mRetryGroupCount = " + this.o + " delay: reconnectingTime = " + jE);
            this.o = this.o + 1;
            this.p = this.p + 1;
            return true;
        }
    }

    public void l(long j) {
        int i = Calendar.getInstance().get(11);
        if (i < 6) {
            uml.d(this.n, "updateRetryConnectTask: by handle for retry > interval:" + j + " RetryCount:" + this.p);
        } else if (j < 20000) {
            if (p5d.INSTANCE.f()) {
                z9l.c();
            }
            uml.d(this.n, "updateRetryConnectTask: by wakeLock for retry > interval:" + j + " RetryCount:" + this.p);
            z9l.b(1000 + j);
            if (!gpj.B()) {
                this.t.e(60000L);
                this.t.l();
            }
        } else {
            if (p5d.INSTANCE.f()) {
                z9l.d();
            }
            uml.d(this.n, "updateRetryConnectTask: set alarm for retry > interval:" + j + " RetryCount:" + this.p + " sys time[hour]:" + i);
            this.t.e(j);
            this.t.l();
        }
        this.m.sendEmptyMessageDelayed(100, j);
    }

    @Override // com.oplus.aiunit.vision.vx9
    public void release() {
        stop();
        c(null);
        setOnConnectChangeHoldListener(null);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.m.hasMessages(100)) {
            uml.d(this.n, "alarm callback, handle msg not callback");
            this.m.removeMessages(100);
            this.t.m();
            d();
        }
    }

    @Override // com.oplus.aiunit.vision.vx9
    public void setOnConnectChangeHoldListener(vx9.a aVar) {
        this.q = aVar;
    }

    @Override // com.oplus.aiunit.vision.vx9
    public void start() {
        if (this.s) {
            uml.k(this.n, "start: shield auto connect");
        } else {
            uml.a(this.n, "start: ");
            i();
        }
    }

    @Override // com.oplus.aiunit.vision.vx9
    public void stop() {
        uml.a(this.n, "stop: ");
        h();
    }
}
