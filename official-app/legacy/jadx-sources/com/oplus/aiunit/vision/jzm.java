package com.oplus.aiunit.vision;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes12.dex */
public class jzm {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile jzm f13095c;
    public BlockingQueue<Runnable> a = new LinkedBlockingQueue();
    public ExecutorService b;

    public jzm() {
        this.b = null;
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        this.b = new ThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors * 2, 1L, TimeUnit.SECONDS, this.a, new ThreadPoolExecutor.AbortPolicy());
    }

    public static jzm a() {
        if (f13095c == null) {
            synchronized (jzm.class) {
                if (f13095c == null) {
                    f13095c = new jzm();
                }
            }
        }
        return f13095c;
    }

    public final void b(Runnable runnable) {
        ExecutorService executorService = this.b;
        if (executorService != null) {
            executorService.execute(runnable);
        }
    }
}
