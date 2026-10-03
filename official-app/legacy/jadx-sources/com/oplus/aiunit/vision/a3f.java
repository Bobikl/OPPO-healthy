package com.oplus.aiunit.vision;

import com.danikula.videocache.InterruptedProxyCacheException;
import com.danikula.videocache.ProxyCacheException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes13.dex */
public class a3f {
    public final r3i a;
    public final uo2 b;
    public volatile Thread f;
    public volatile boolean g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f9175c = new Object();
    public final Object d = new Object();
    public volatile int h = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicInteger f9176e = new AtomicInteger();

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a3f.this.k();
        }
    }

    public a3f(r3i r3iVar, uo2 uo2Var) {
        this.a = (r3i) voe.d(r3iVar);
        this.b = (uo2) voe.d(uo2Var);
    }

    public final void b() throws ProxyCacheException {
        int i = this.f9176e.get();
        if (i < 1) {
            return;
        }
        this.f9176e.set(0);
        throw new ProxyCacheException("Error reading source " + i + " times");
    }

    public final void c() {
        try {
            this.a.close();
        } catch (ProxyCacheException e2) {
            h(new ProxyCacheException("Error closing source " + this.a, e2));
        }
    }

    public final boolean d() {
        return Thread.currentThread().isInterrupted() || this.g;
    }

    public final void e(long j2, long j3) {
        f(j2, j3);
        synchronized (this.f9175c) {
            this.f9175c.notifyAll();
        }
    }

    public void f(long j2, long j3) {
        int i = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1)) == 0 ? 100 : (int) ((j2 / j3) * 100.0f);
        boolean z = i != this.h;
        if ((j3 >= 0) && z) {
            g(i);
        }
        this.h = i;
    }

    public void g(int i) {
        throw null;
    }

    public final void h(Throwable th) {
        boolean z = th instanceof InterruptedProxyCacheException;
    }

    public final void i() {
        this.h = 100;
        g(this.h);
    }

    public int j(byte[] bArr, long j2, int i) throws ProxyCacheException {
        b3f.a(bArr, j2, i);
        while (!this.b.isCompleted() && this.b.available() < ((long) i) + j2 && !this.g) {
            l();
            o();
            b();
        }
        int iB = this.b.b(bArr, j2, i);
        if (this.b.isCompleted() && this.h != 100) {
            this.h = 100;
            g(100);
        }
        return iB;
    }

    public final void k() {
        long length = -1;
        long jAvailable = 0;
        try {
            jAvailable = this.b.available();
            this.a.a(jAvailable);
            length = this.a.length();
            byte[] bArr = new byte[8192];
            while (true) {
                int i = this.a.read(bArr);
                if (i == -1) {
                    n();
                    i();
                    break;
                }
                synchronized (this.d) {
                    if (d()) {
                        c();
                        e(jAvailable, length);
                        return;
                    }
                    this.b.a(bArr, i);
                }
                jAvailable += (long) i;
                e(jAvailable, length);
            }
        } catch (Throwable th) {
            try {
                this.f9176e.incrementAndGet();
                h(th);
            } finally {
                c();
                e(jAvailable, length);
            }
        }
    }

    public final synchronized void l() throws ProxyCacheException {
        boolean z = (this.f == null || this.f.getState() == Thread.State.TERMINATED) ? false : true;
        if (!this.g && !this.b.isCompleted() && !z) {
            this.f = new Thread(new b(), "Source reader for " + this.a);
            this.f.start();
        }
    }

    public void m() {
        synchronized (this.d) {
            try {
                this.g = true;
                if (this.f != null) {
                    this.f.interrupt();
                }
                this.b.close();
            } catch (ProxyCacheException e2) {
                h(e2);
            }
        }
    }

    public final void n() throws ProxyCacheException {
        synchronized (this.d) {
            if (!d() && this.b.available() == this.a.length()) {
                this.b.complete();
            }
        }
    }

    public final void o() throws ProxyCacheException {
        synchronized (this.f9175c) {
            try {
                try {
                    this.f9175c.wait(1000L);
                } catch (InterruptedException e2) {
                    throw new ProxyCacheException("Waiting source data is interrupted!", e2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
