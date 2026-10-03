package com.oplus.aiunit.vision;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes18.dex */
public class nye implements Runnable {
    public int i;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f14692n;
    public long o;
    public long p;
    public long q;
    public boolean r;
    public a s;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList f14690j = new ArrayList();
    public long k = 90000;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f14691l = 1.0f;
    public Handler t = null;

    public interface a {
        void a(int i);
    }

    public static class b implements a {
        public WeakReference<a> a;

        public b(a aVar) {
            this.a = new WeakReference<>(aVar);
        }

        @Override // com.oplus.aiunit.vision.nye.a
        public void a(int i) {
            WeakReference<a> weakReference = this.a;
            a aVar = weakReference != null ? weakReference.get() : null;
            if (aVar != null) {
                aVar.a(i);
            }
        }
    }

    public void a(int i) {
        if (i <= 0) {
            return;
        }
        this.f14690j.add(Integer.valueOf(e() + i));
    }

    public void b(int i, int i2) {
        if (i2 < 1) {
            i2 = 1;
        }
        int i3 = i / i2;
        for (int i4 = 0; i4 < i2; i4++) {
            a(i3);
        }
    }

    public final void c() {
        this.r = true;
        Handler handler = this.t;
        if (handler != null) {
            handler.removeCallbacks(this);
        }
    }

    public final int d(int i) {
        if (i < 0 || i >= this.f14690j.size()) {
            return 0;
        }
        return ((Integer) this.f14690j.get(i)).intValue();
    }

    public final int e() {
        return d(this.f14690j.size() - 1);
    }

    public final void f() {
        this.t.post(this);
    }

    public void g() {
        this.f14691l = 1.0f;
        this.m = 0;
        this.o = 0L;
        this.p = 0L;
        this.f14692n = 0L;
        this.q = 0L;
        this.r = false;
        j(this.k);
    }

    public void h(a aVar) {
        this.s = aVar;
    }

    public void i(int i) {
        this.i = i;
        int iE = e();
        if (iE > 0) {
            long j2 = iE;
            this.p = (((long) this.i) * this.k) / j2;
            for (int i2 = 0; i2 < this.f14690j.size(); i2++) {
                if (this.i < ((Integer) this.f14690j.get(i2)).intValue()) {
                    this.o = (((long) ((Integer) this.f14690j.get(i2)).intValue()) * this.k) / j2;
                    if (this.m > i2) {
                        this.f14692n = d(i2 - 1);
                    }
                    this.m = i2;
                    break;
                }
            }
        }
        long j3 = this.p - this.f14692n;
        if (j3 > 1000) {
            float f = ((j3 * 1.0f) / 50.0f) + 1.0f;
            if (f > 1.0f) {
                this.f14691l = f;
            } else {
                this.f14691l = 1.0f;
            }
        }
    }

    public void j(long j2) {
        this.k = j2;
        if (this.t == null) {
            this.t = new Handler(Looper.getMainLooper());
        }
        i(0);
        f();
    }

    public void k() {
        c();
    }

    public final void l() {
        if (this.r) {
            return;
        }
        long jElapsedRealtime = this.q > 0 ? SystemClock.elapsedRealtime() - this.q : 50L;
        this.q = SystemClock.elapsedRealtime();
        long j2 = this.f14692n;
        long j3 = (long) (j2 + (jElapsedRealtime * this.f14691l));
        if (j3 > this.p) {
            this.f14691l = 1.0f;
        }
        long j4 = this.o;
        if (j3 > j4) {
            j3 = j4;
        }
        if (j2 != j3) {
            this.f14692n = j3;
            a aVar = this.s;
            if (aVar != null) {
                int i = (int) ((j3 * 100) / this.k);
                if (i > 100) {
                    i = 100;
                } else if (i < 0) {
                    i = 0;
                }
                aVar.a(i);
            }
        }
        if (this.f14692n >= this.k) {
            c();
        } else {
            if (this.r) {
                return;
            }
            f();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        l();
    }
}
