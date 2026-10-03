package com.coloros.sceneservice.n;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes13.dex */
public class b extends ThreadPoolExecutor {
    public static final String TAG = "DefaultPoolExecutor";
    public static final int ad;
    public static final int bd;
    public static final int cd;
    public static final int dd = 64;
    public static final long ed = 30;
    public static volatile b sInstance;

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        ad = iAvailableProcessors;
        int i = iAvailableProcessors + 1;
        bd = i;
        cd = i;
    }

    public b(int i, int i2, long j2, TimeUnit timeUnit, BlockingQueue blockingQueue, ThreadFactory threadFactory) {
        super(i, i2, j2, timeUnit, blockingQueue, threadFactory, new a());
    }

    public static b getInstance() {
        if (sInstance == null) {
            synchronized (b.class) {
                if (sInstance == null) {
                    sInstance = new b(bd, cd, 30L, TimeUnit.SECONDS, new ArrayBlockingQueue(64), new d());
                }
            }
        }
        return sInstance;
    }
}
