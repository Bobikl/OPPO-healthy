package com.oplus.aiunit.vision;

import android.os.Handler;
import android.os.Looper;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public class zj {
    public ExecutorService a;
    public Handler b;

    public class a implements ThreadFactory {
        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "schedulerCallBackThread");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class b<T> implements d<T> {
        public final /* synthetic */ AtomicReference a;
        public final /* synthetic */ CountDownLatch b;

        public b(AtomicReference atomicReference, CountDownLatch countDownLatch) {
            this.a = atomicReference;
            this.b = countDownLatch;
        }

        @Override // com.oplus.aiunit.vision.zj.d
        public void a(T t) {
            this.a.set(t);
            this.b.countDown();
            AcLogUtil.i("AcThreadPoolUtils", "runInBlock unlock!!!");
        }
    }

    public static class c {
        public static final zj a = new zj(null);
    }

    public interface d<T> {
        void a(T t);
    }

    public /* synthetic */ zj(a aVar) {
        this();
    }

    public static zj a() {
        return c.a;
    }

    public final Handler b() {
        if (this.b == null) {
            this.b = new Handler(Looper.getMainLooper());
        }
        return this.b;
    }

    public final ExecutorService c() {
        if (this.a == null) {
            this.a = Executors.newCachedThreadPool(new a());
        }
        return this.a;
    }

    public boolean d() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public <T> T e(long j2, c8<d<T>> c8Var) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicReference atomicReference = new AtomicReference();
        try {
            c8Var.call(new b(atomicReference, countDownLatch));
            if (j2 == 0) {
                countDownLatch.await();
            } else {
                countDownLatch.await(j2, TimeUnit.MILLISECONDS);
            }
        } catch (Throwable th) {
            AcLogUtil.e("AcThreadPoolUtils", "runInBlock error: " + th.getMessage());
        }
        return (T) atomicReference.get();
    }

    public void f(Runnable runnable) {
        if (d()) {
            runnable.run();
        } else {
            b().post(runnable);
        }
    }

    public void g(Runnable runnable) {
        c().execute(runnable);
    }

    public zj() {
    }
}
