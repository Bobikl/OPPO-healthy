package com.omron;

import android.support.annotation.NonNull;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes5.dex */
public class en {

    @NonNull
    private final CountDownLatch a = new CountDownLatch(1);
    private Object b;

    public Object a() {
        return this.b;
    }

    public void b() {
        try {
            a(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | TimeoutException e2) {
            e2.printStackTrace();
        }
    }

    public void c() {
        this.a.countDown();
    }

    private void a(long j2, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        this.a.await(j2, timeUnit);
        if (0 < this.a.getCount()) {
            throw new TimeoutException("CountDownLatch.await() is timeout.");
        }
    }

    public void a(Object obj) {
        this.b = obj;
    }
}
