package com.oplus.aiunit.vision;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public class n55 implements ow9, Handler.Callback, Runnable {
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f14346j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public mw9 f14347l;
    public volatile int p;
    public ow9.a q;
    public volatile boolean r;
    public Handler m = new Handler(Looper.getMainLooper(), this);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f14348n = "Retry";
    public volatile int o = 0;
    public boolean s = false;
    public ys t = new ys(b78.a(), ark.AUTO_RETRY_ACTION, 60000, 0);

    public n55(String str, int i, boolean z, String str2) {
        this.f14348n += "_" + str;
        this.i = i;
        this.f14346j = z;
        this.k = str2;
        this.t.j(this);
    }

    @Override // com.oplus.aiunit.vision.ow9
    public void a(x95 x95Var, int i) {
        ow9.a aVar;
        wil.a(this.f14348n, "handleOnDisconnected: " + x95Var);
        if (this.r || this.p >= this.i) {
            ow9.a aVar2 = this.q;
            if (aVar2 != null) {
                aVar2.a(x95Var, i);
            }
        } else if (!i() && (aVar = this.q) != null) {
            aVar.a(x95Var, i);
        }
        this.r = false;
    }

    @Override // com.oplus.aiunit.vision.ow9
    public void b(x95 x95Var) {
        ow9.a aVar = this.q;
        if (aVar != null) {
            aVar.b(x95Var);
        }
        this.r = true;
    }

    @Override // com.oplus.aiunit.vision.ow9
    public void c(mw9 mw9Var) {
        synchronized (this) {
            this.f14347l = mw9Var;
        }
    }

    public void d() {
        synchronized (this) {
            mw9 mw9Var = this.f14347l;
            if (mw9Var != null && mw9Var.b()) {
                wil.d(this.f14348n, "handleMessage: retry Group:" + this.o + " retryCount:" + this.p);
                this.f14347l.retry();
            }
        }
    }

    public final long e(int i) {
        long j2 = so5.h().j(this.k);
        TimeUnit timeUnit = TimeUnit.DAYS;
        if (j2 >= timeUnit.toMillis(360L)) {
            wil.d(this.f14348n, "getReconnectingTime: direction too long reset retry, " + j2);
            j2 = 0;
        }
        if (j2 >= timeUnit.toMillis(30L)) {
            long millis = timeUnit.toMillis(10L);
            wil.a(this.f14348n, "getReconnectingTime: stop delta=" + j2);
            return millis;
        }
        if (j2 >= timeUnit.toMillis(7L)) {
            long millis2 = TimeUnit.HOURS.toMillis(1L);
            wil.a(this.f14348n, "getReconnectingTime: 1h delta=" + j2);
            return millis2;
        }
        if (j2 >= timeUnit.toMillis(3L)) {
            long millis3 = TimeUnit.MINUTES.toMillis(30L);
            wil.a(this.f14348n, "getReconnectingTime: 30min delta=" + j2);
            return millis3;
        }
        if (i < 6) {
            return TimeUnit.SECONDS.toMillis(8L);
        }
        int i2 = i - 6;
        long millis4 = i2 > 7 ? 600000L : 2000 << i2;
        if (this.f14346j) {
            TimeUnit timeUnit2 = TimeUnit.SECONDS;
            if (millis4 < timeUnit2.toMillis(10L)) {
                millis4 = timeUnit2.toMillis(10L);
            }
        }
        long j3 = millis4;
        wil.a(this.f14348n, "getReconnectingTime: group=" + i2 + " time=" + j3);
        return j3;
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
            b6l.e();
            b6l.d();
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
            mw9 mw9Var = this.f14347l;
            if (mw9Var != null && mw9Var.b() && (this.f14347l.a() || this.o == 0)) {
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
            wil.k(this.f14348n, "startReconnecting: shield auto connect");
            return false;
        }
        synchronized (this) {
            if (this.f14347l == null) {
                stop();
                return false;
            }
            this.m.removeMessages(100);
            if (this.p < this.i) {
                this.p++;
                l(2000L);
                wil.a(this.f14348n, "startReconnecting: mRetryCount:" + this.p + ",mRetryGroupCount = " + this.o + " ,delay: reconnectingTime = 2000");
                return true;
            }
            if (!this.f14347l.a()) {
                stop();
                return false;
            }
            this.p = 0;
            long jE = e(this.o);
            if (jE == 0) {
                this.f14347l.retry();
                stop();
                return true;
            }
            l(jE);
            wil.a(this.f14348n, "startReconnecting: mRetryCount:" + this.p + ",mRetryGroupCount = " + this.o + " delay: reconnectingTime = " + jE);
            this.o = this.o + 1;
            this.p = this.p + 1;
            return true;
        }
    }

    public void l(long j2) {
        int i = Calendar.getInstance().get(11);
        if (i < 6) {
            wil.d(this.f14348n, "updateRetryConnectTask: by handle for retry > interval:" + j2 + " RetryCount:" + this.p);
        } else if (j2 < 20000) {
            if (x3d.INSTANCE.f()) {
                b6l.c();
            }
            wil.d(this.f14348n, "updateRetryConnectTask: by wakeLock for retry > interval:" + j2 + " RetryCount:" + this.p);
            b6l.b(1000 + j2);
            if (!ilj.B()) {
                this.t.e(60000L);
                this.t.l();
            }
        } else {
            if (x3d.INSTANCE.f()) {
                b6l.d();
            }
            wil.d(this.f14348n, "updateRetryConnectTask: set alarm for retry > interval:" + j2 + " RetryCount:" + this.p + " sys time[hour]:" + i);
            this.t.e(j2);
            this.t.l();
        }
        this.m.sendEmptyMessageDelayed(100, j2);
    }

    @Override // com.oplus.aiunit.vision.ow9
    public void release() {
        stop();
        c(null);
        setOnConnectChangeHoldListener(null);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.m.hasMessages(100)) {
            wil.d(this.f14348n, "alarm callback, handle msg not callback");
            this.m.removeMessages(100);
            this.t.m();
            d();
        }
    }

    @Override // com.oplus.aiunit.vision.ow9
    public void setOnConnectChangeHoldListener(ow9.a aVar) {
        this.q = aVar;
    }

    @Override // com.oplus.aiunit.vision.ow9
    public void start() {
        if (this.s) {
            wil.k(this.f14348n, "start: shield auto connect");
        } else {
            wil.a(this.f14348n, "start: ");
            i();
        }
    }

    @Override // com.oplus.aiunit.vision.ow9
    public void stop() {
        wil.a(this.f14348n, "stop: ");
        h();
    }
}
