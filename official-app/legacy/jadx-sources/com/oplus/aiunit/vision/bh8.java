package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public final class bh8 extends zeg {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Handler f9752j;
    public final boolean k;

    public static final class a extends zeg.c {
        public final Handler i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f9753j;
        public volatile boolean k;

        public a(Handler handler, boolean z) {
            this.i = handler;
            this.f9753j = z;
        }

        @Override // com.oplus.aiunit.vision.zeg.c
        @SuppressLint({"NewApi"})
        public cv5 c(Runnable runnable, long j2, TimeUnit timeUnit) {
            if (runnable == null) {
                throw new NullPointerException("run == null");
            }
            if (timeUnit == null) {
                throw new NullPointerException("unit == null");
            }
            if (this.k) {
                return io.reactivex.disposables.a.a();
            }
            b bVar = new b(this.i, h4g.t(runnable));
            Message messageObtain = Message.obtain(this.i, bVar);
            messageObtain.obj = this;
            if (this.f9753j) {
                messageObtain.setAsynchronous(true);
            }
            this.i.sendMessageDelayed(messageObtain, timeUnit.toMillis(j2));
            if (!this.k) {
                return bVar;
            }
            this.i.removeCallbacks(bVar);
            return io.reactivex.disposables.a.a();
        }

        @Override // com.oplus.aiunit.vision.cv5
        public void dispose() {
            this.k = true;
            this.i.removeCallbacksAndMessages(this);
        }

        @Override // com.oplus.aiunit.vision.cv5
        public boolean isDisposed() {
            return this.k;
        }
    }

    public static final class b implements Runnable, cv5 {
        public final Handler i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Runnable f9754j;
        public volatile boolean k;

        public b(Handler handler, Runnable runnable) {
            this.i = handler;
            this.f9754j = runnable;
        }

        @Override // com.oplus.aiunit.vision.cv5
        public void dispose() {
            this.i.removeCallbacks(this);
            this.k = true;
        }

        @Override // com.oplus.aiunit.vision.cv5
        public boolean isDisposed() {
            return this.k;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f9754j.run();
            } catch (Throwable th) {
                h4g.r(th);
            }
        }
    }

    public bh8(Handler handler, boolean z) {
        this.f9752j = handler;
        this.k = z;
    }

    @Override // com.oplus.aiunit.vision.zeg
    public zeg.c a() {
        return new a(this.f9752j, this.k);
    }

    @Override // com.oplus.aiunit.vision.zeg
    public cv5 d(Runnable runnable, long j2, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        b bVar = new b(this.f9752j, h4g.t(runnable));
        this.f9752j.postDelayed(bVar, timeUnit.toMillis(j2));
        return bVar;
    }
}
