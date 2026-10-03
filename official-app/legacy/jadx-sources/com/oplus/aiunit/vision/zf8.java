package com.oplus.aiunit.vision;

import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class zf8 {
    public static void a(bed<?> bedVar, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable thTerminate = atomicThrowable.terminate();
            if (thTerminate != null) {
                bedVar.onError(thTerminate);
            } else {
                bedVar.onComplete();
            }
        }
    }

    public static void b(v2j<?> v2jVar, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable thTerminate = atomicThrowable.terminate();
            if (thTerminate != null) {
                v2jVar.onError(thTerminate);
            } else {
                v2jVar.onComplete();
            }
        }
    }

    public static void c(bed<?> bedVar, Throwable th, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (!atomicThrowable.addThrowable(th)) {
            h4g.r(th);
        } else if (atomicInteger.getAndIncrement() == 0) {
            bedVar.onError(atomicThrowable.terminate());
        }
    }

    public static void d(v2j<?> v2jVar, Throwable th, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (!atomicThrowable.addThrowable(th)) {
            h4g.r(th);
        } else if (atomicInteger.getAndIncrement() == 0) {
            v2jVar.onError(atomicThrowable.terminate());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void e(bed<? super T> bedVar, T t, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            bedVar.onNext(t);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable thTerminate = atomicThrowable.terminate();
                if (thTerminate != null) {
                    bedVar.onError(thTerminate);
                } else {
                    bedVar.onComplete();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void f(v2j<? super T> v2jVar, T t, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            v2jVar.onNext(t);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable thTerminate = atomicThrowable.terminate();
                if (thTerminate != null) {
                    v2jVar.onError(thTerminate);
                } else {
                    v2jVar.onComplete();
                }
            }
        }
    }
}
