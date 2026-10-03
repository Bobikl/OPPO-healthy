package com.oplus.aiunit.vision;

import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class yf8 {
    public static void a(aed<?> aedVar, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.getAndIncrement() == 0) {
            atomicThrowable.tryTerminateConsumer(aedVar);
        }
    }

    public static void b(v2j<?> v2jVar, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.getAndIncrement() == 0) {
            atomicThrowable.tryTerminateConsumer(v2jVar);
        }
    }

    public static void c(aed<?> aedVar, Throwable th, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicThrowable.tryAddThrowableOrReport(th) && atomicInteger.getAndIncrement() == 0) {
            atomicThrowable.tryTerminateConsumer(aedVar);
        }
    }

    public static void d(v2j<?> v2jVar, Throwable th, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicThrowable.tryAddThrowableOrReport(th) && atomicInteger.getAndIncrement() == 0) {
            atomicThrowable.tryTerminateConsumer(v2jVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void e(aed<? super T> aedVar, T t, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            aedVar.onNext(t);
            if (atomicInteger.decrementAndGet() != 0) {
                atomicThrowable.tryTerminateConsumer(aedVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> boolean f(v2j<? super T> v2jVar, T t, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            v2jVar.onNext(t);
            if (atomicInteger.decrementAndGet() == 0) {
                return true;
            }
            atomicThrowable.tryTerminateConsumer(v2jVar);
        }
        return false;
    }
}
