package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public final class ch8 extends cfg {
    public final Handler k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f10083l;

    public static final class a extends cfg.c {
        public final Handler i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f10084j;
        public volatile boolean k;

        public a(Handler handler, boolean z) {
            this.i = handler;
            this.f10084j = z;
        }

        @Override // com.oplus.aiunit.vision.cfg.c
        @SuppressLint({"NewApi"})
        public io.reactivex.rxjava3.disposables.a c(Runnable runnable, long j2, TimeUnit timeUnit) {
            if (runnable == null) {
                throw new NullPointerException("run == null");
            }
            if (timeUnit == null) {
                throw new NullPointerException("unit == null");
            }
            if (this.k) {
                return io.reactivex.rxjava3.disposables.a.d();
            }
            b bVar = new b(this.i, g4g.x(runnable));
            Message messageObtain = Message.obtain(this.i, bVar);
            messageObtain.obj = this;
            if (this.f10084j) {
                messageObtain.setAsynchronous(true);
            }
            this.i.sendMessageDelayed(messageObtain, timeUnit.toMillis(j2));
            if (!this.k) {
                return bVar;
            }
            this.i.removeCallbacks(bVar);
            return io.reactivex.rxjava3.disposables.a.d();
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public void dispose() {
            this.k = true;
            this.i.removeCallbacksAndMessages(this);
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public boolean isDisposed() {
            return this.k;
        }
    }

    public static final class b implements Runnable, io.reactivex.rxjava3.disposables.a {
        public final Handler i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Runnable f10085j;
        public volatile boolean k;

        public b(Handler handler, Runnable runnable) {
            this.i = handler;
            this.f10085j = runnable;
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public void dispose() {
            this.i.removeCallbacks(this);
            this.k = true;
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public boolean isDisposed() {
            return this.k;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f10085j.run();
            } catch (Throwable th) {
                g4g.u(th);
            }
        }
    }

    public ch8(Handler handler, boolean z) {
        this.k = handler;
        this.f10083l = z;
    }

    @Override // com.oplus.aiunit.vision.cfg
    public cfg.c c() {
        return new a(this.k, this.f10083l);
    }

    @Override // com.oplus.aiunit.vision.cfg
    @SuppressLint({"NewApi"})
    public io.reactivex.rxjava3.disposables.a h(Runnable runnable, long j2, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        b bVar = new b(this.k, g4g.x(runnable));
        Message messageObtain = Message.obtain(this.k, bVar);
        if (this.f10083l) {
            messageObtain.setAsynchronous(true);
        }
        this.k.sendMessageDelayed(messageObtain, timeUnit.toMillis(j2));
        return bVar;
    }
}
