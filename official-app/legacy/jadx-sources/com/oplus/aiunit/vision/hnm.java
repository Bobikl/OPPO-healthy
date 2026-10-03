package com.oplus.aiunit.vision;

import android.content.Context;
import com.oplus.omes.srp.sysintegrity.BuildConfig;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes12.dex */
public class hnm {
    public static hnm c_d;
    public ExecutorService b;
    public String a = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12209c = false;

    public static class a implements ThreadFactory {
        public final AtomicInteger i = new AtomicInteger(1);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public ThreadFactory f12210j = Executors.defaultThreadFactory();

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = this.f12210j.newThread(runnable);
            threadNewThread.setName("sysinteg_pl-thd-" + this.i.getAndIncrement());
            return threadNewThread;
        }
    }

    public hnm(Context context) {
        b();
    }

    public static synchronized hnm a(Context context) {
        if (c_d == null) {
            c_d = new hnm(context);
        }
        return c_d;
    }

    public void b() {
        if (this.f12209c) {
            return;
        }
        this.a = BuildConfig.stdsrpVersion;
        this.b = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new a());
        this.f12209c = true;
    }
}
