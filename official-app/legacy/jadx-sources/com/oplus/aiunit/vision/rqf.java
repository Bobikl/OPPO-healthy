package com.oplus.aiunit.vision;

import android.graphics.drawable.Drawable;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes13.dex */
public class rqf<R> implements v08<R>, uqf<R> {
    public static final a s = new a();
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f16310j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a f16311l;

    @Nullable
    @GuardedBy("this")
    public R m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    @GuardedBy("this")
    public dqf f16312n;

    @GuardedBy("this")
    public boolean o;

    @GuardedBy("this")
    public boolean p;

    @GuardedBy("this")
    public boolean q;

    @Nullable
    @GuardedBy("this")
    public GlideException r;

    @VisibleForTesting
    public static class a {
        public void a(Object obj) {
            obj.notifyAll();
        }

        public void b(Object obj, long j2) throws InterruptedException {
            obj.wait(j2);
        }
    }

    public rqf(int i, int i2) {
        this(i, i2, true, s);
    }

    public final synchronized R a(Long l2) throws ExecutionException, InterruptedException, TimeoutException {
        if (this.k && !isDone()) {
            uqk.a();
        }
        if (this.o) {
            throw new CancellationException();
        }
        if (this.q) {
            throw new ExecutionException(this.r);
        }
        if (this.p) {
            return this.m;
        }
        if (l2 == null) {
            this.f16311l.b(this, 0L);
        } else if (l2.longValue() > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jLongValue = l2.longValue() + jCurrentTimeMillis;
            while (!isDone() && jCurrentTimeMillis < jLongValue) {
                this.f16311l.b(this, jLongValue - jCurrentTimeMillis);
                jCurrentTimeMillis = System.currentTimeMillis();
            }
        }
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        if (this.q) {
            throw new ExecutionException(this.r);
        }
        if (this.o) {
            throw new CancellationException();
        }
        if (!this.p) {
            throw new TimeoutException();
        }
        return this.m;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        synchronized (this) {
            if (isDone()) {
                return false;
            }
            this.o = true;
            this.f16311l.a(this);
            dqf dqfVar = null;
            if (z) {
                dqf dqfVar2 = this.f16312n;
                this.f16312n = null;
                dqfVar = dqfVar2;
            }
            if (dqfVar != null) {
                dqfVar.clear();
            }
            return true;
        }
    }

    @Override // java.util.concurrent.Future
    public R get() throws ExecutionException, InterruptedException {
        try {
            return a(null);
        } catch (TimeoutException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // com.oplus.aiunit.vision.boj
    @Nullable
    public synchronized dqf getRequest() {
        return this.f16312n;
    }

    @Override // com.oplus.aiunit.vision.boj
    public void getSize(@NonNull l7h l7hVar) {
        l7hVar.d(this.i, this.f16310j);
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isCancelled() {
        return this.o;
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isDone() {
        return this.o || this.p || this.q;
    }

    @Override // com.oplus.aiunit.vision.bwa
    public void onDestroy() {
    }

    @Override // com.oplus.aiunit.vision.boj
    public void onLoadCleared(@Nullable Drawable drawable) {
    }

    @Override // com.oplus.aiunit.vision.boj
    public synchronized void onLoadFailed(@Nullable Drawable drawable) {
    }

    @Override // com.oplus.aiunit.vision.boj
    public void onLoadStarted(@Nullable Drawable drawable) {
    }

    @Override // com.oplus.aiunit.vision.boj
    public synchronized void onResourceReady(@NonNull R r, @Nullable oak<? super R> oakVar) {
    }

    @Override // com.oplus.aiunit.vision.bwa
    public void onStart() {
    }

    @Override // com.oplus.aiunit.vision.bwa
    public void onStop() {
    }

    @Override // com.oplus.aiunit.vision.boj
    public void removeCallback(@NonNull l7h l7hVar) {
    }

    @Override // com.oplus.aiunit.vision.boj
    public synchronized void setRequest(@Nullable dqf dqfVar) {
        this.f16312n = dqfVar;
    }

    public String toString() {
        dqf dqfVar;
        String str;
        String str2 = super.toString() + "[status=";
        synchronized (this) {
            dqfVar = null;
            if (this.o) {
                str = "CANCELLED";
            } else if (this.q) {
                str = "FAILURE";
            } else if (this.p) {
                str = "SUCCESS";
            } else {
                str = "PENDING";
                dqfVar = this.f16312n;
            }
        }
        if (dqfVar == null) {
            return str2 + str + "]";
        }
        return str2 + str + ", request=[" + dqfVar + "]]";
    }

    public rqf(int i, int i2, boolean z, a aVar) {
        this.i = i;
        this.f16310j = i2;
        this.k = z;
        this.f16311l = aVar;
    }

    @Override // com.oplus.aiunit.vision.uqf
    public synchronized boolean onLoadFailed(@Nullable GlideException glideException, Object obj, @NonNull boj<R> bojVar, boolean z) {
        this.q = true;
        this.r = glideException;
        this.f16311l.a(this);
        return false;
    }

    @Override // com.oplus.aiunit.vision.uqf
    public synchronized boolean onResourceReady(@NonNull R r, @NonNull Object obj, boj<R> bojVar, @NonNull DataSource dataSource, boolean z) {
        this.p = true;
        this.m = r;
        this.f16311l.a(this);
        return false;
    }

    @Override // java.util.concurrent.Future
    public R get(long j2, @NonNull TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return a(Long.valueOf(timeUnit.toMillis(j2)));
    }
}
