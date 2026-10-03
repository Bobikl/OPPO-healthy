package com.oplus.aiunit.vision;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes10.dex */
public final class oi1 {
    public static void a(CountDownLatch countDownLatch, io.reactivex.rxjava3.disposables.a aVar) {
        if (countDownLatch.getCount() == 0) {
            return;
        }
        try {
            b();
            countDownLatch.await();
        } catch (InterruptedException e2) {
            aVar.dispose();
            Thread.currentThread().interrupt();
            throw new IllegalStateException("Interrupted while waiting for subscription to complete.", e2);
        }
    }

    public static void b() {
        if (g4g.k()) {
            if ((Thread.currentThread() instanceof guc) || g4g.s()) {
                throw new IllegalStateException("Attempt to block on a Scheduler " + Thread.currentThread().getName() + " that doesn't support blocking operators as they may lead to deadlock");
            }
        }
    }
}
