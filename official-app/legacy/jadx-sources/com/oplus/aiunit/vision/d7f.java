package com.oplus.aiunit.vision;

import io.reactivex.internal.queue.SpscArrayQueue;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes10.dex */
public final class d7f {
    public static <T> g4h<T> a(int i) {
        return i < 0 ? new yki(-i) : new SpscArrayQueue(i);
    }

    public static boolean b(z12 z12Var) {
        try {
            return z12Var.getAsBoolean();
        } catch (Throwable th) {
            iu6.b(th);
            return true;
        }
    }

    public static <T> void c(v2j<? super T> v2jVar, Queue<T> queue, AtomicLong atomicLong, z12 z12Var) {
        long j2;
        long j3;
        if (queue.isEmpty()) {
            v2jVar.onComplete();
            return;
        }
        if (d(atomicLong.get(), v2jVar, queue, atomicLong, z12Var)) {
            return;
        }
        do {
            j2 = atomicLong.get();
            if ((j2 & Long.MIN_VALUE) != 0) {
                return;
            } else {
                j3 = j2 | Long.MIN_VALUE;
            }
        } while (!atomicLong.compareAndSet(j2, j3));
        if (j2 != 0) {
            d(j3, v2jVar, queue, atomicLong, z12Var);
        }
    }

    public static <T> boolean d(long j2, v2j<? super T> v2jVar, Queue<T> queue, AtomicLong atomicLong, z12 z12Var) {
        long j3 = j2 & Long.MIN_VALUE;
        while (true) {
            if (j3 != j2) {
                if (b(z12Var)) {
                    return true;
                }
                T tPoll = queue.poll();
                if (tPoll == null) {
                    v2jVar.onComplete();
                    return true;
                }
                v2jVar.onNext(tPoll);
                j3++;
            } else {
                if (b(z12Var)) {
                    return true;
                }
                if (queue.isEmpty()) {
                    v2jVar.onComplete();
                    return true;
                }
                j2 = atomicLong.get();
                if (j2 == j3) {
                    long jAddAndGet = atomicLong.addAndGet(-(j3 & Long.MAX_VALUE));
                    if ((Long.MAX_VALUE & jAddAndGet) == 0) {
                        return false;
                    }
                    j2 = jAddAndGet;
                    j3 = jAddAndGet & Long.MIN_VALUE;
                } else {
                    continue;
                }
            }
        }
    }

    public static <T> boolean e(long j2, v2j<? super T> v2jVar, Queue<T> queue, AtomicLong atomicLong, z12 z12Var) {
        long j3;
        do {
            j3 = atomicLong.get();
        } while (!atomicLong.compareAndSet(j3, wr0.c(Long.MAX_VALUE & j3, j2) | (j3 & Long.MIN_VALUE)));
        if (j3 != Long.MIN_VALUE) {
            return false;
        }
        d(j2 | Long.MIN_VALUE, v2jVar, queue, atomicLong, z12Var);
        return true;
    }

    public static void f(c3j c3jVar, int i) {
        c3jVar.request(i < 0 ? Long.MAX_VALUE : i);
    }
}
