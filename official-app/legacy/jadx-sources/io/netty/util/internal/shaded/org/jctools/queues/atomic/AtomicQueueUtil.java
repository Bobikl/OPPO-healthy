package io.netty.util.internal.shaded.org.jctools.queues.atomic;

import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes10.dex */
final class AtomicQueueUtil {
    public static AtomicLongArray allocateLongArray(int i) {
        return new AtomicLongArray(i);
    }

    public static <E> AtomicReferenceArray<E> allocateRefArray(int i) {
        return new AtomicReferenceArray<>(i);
    }

    public static int calcCircularLongElementOffset(long j2, int i) {
        return (int) (j2 & ((long) i));
    }

    public static int calcCircularRefElementOffset(long j2, long j3) {
        return (int) (j2 & j3);
    }

    public static int calcLongElementOffset(long j2) {
        return (int) j2;
    }

    public static int calcRefElementOffset(long j2) {
        return (int) j2;
    }

    public static int length(AtomicReferenceArray<?> atomicReferenceArray) {
        return atomicReferenceArray.length();
    }

    public static long lpLongElement(AtomicLongArray atomicLongArray, int i) {
        return atomicLongArray.get(i);
    }

    public static <E> E lpRefElement(AtomicReferenceArray<E> atomicReferenceArray, int i) {
        return atomicReferenceArray.get(i);
    }

    public static long lvLongElement(AtomicLongArray atomicLongArray, int i) {
        return atomicLongArray.get(i);
    }

    public static <E> E lvRefElement(AtomicReferenceArray<E> atomicReferenceArray, int i) {
        return atomicReferenceArray.get(i);
    }

    public static int modifiedCalcCircularRefElementOffset(long j2, long j3) {
        return ((int) (j2 & j3)) >> 1;
    }

    public static int nextArrayOffset(AtomicReferenceArray<?> atomicReferenceArray) {
        return length(atomicReferenceArray) - 1;
    }

    public static void soLongElement(AtomicLongArray atomicLongArray, int i, long j2) {
        atomicLongArray.lazySet(i, j2);
    }

    public static void soRefElement(AtomicReferenceArray atomicReferenceArray, int i, Object obj) {
        atomicReferenceArray.lazySet(i, obj);
    }

    public static void spLongElement(AtomicLongArray atomicLongArray, int i, long j2) {
        atomicLongArray.lazySet(i, j2);
    }

    public static <E> void spRefElement(AtomicReferenceArray<E> atomicReferenceArray, int i, E e2) {
        atomicReferenceArray.lazySet(i, e2);
    }

    public static <E> void svRefElement(AtomicReferenceArray<E> atomicReferenceArray, int i, E e2) {
        atomicReferenceArray.set(i, e2);
    }
}
