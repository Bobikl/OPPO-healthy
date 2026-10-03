package com.oplus.aiunit.vision;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes11.dex */
public class m2a<T> implements l2a<Long, T> {
    public final a9b<Reference<T>> a = new a9b<>();
    public final ReentrantLock b = new ReentrantLock();

    @Override // com.oplus.aiunit.vision.l2a
    public void a(Iterable<Long> iterable) {
        this.b.lock();
        try {
            Iterator<Long> it = iterable.iterator();
            while (it.hasNext()) {
                this.a.d(it.next().longValue());
            }
            this.b.unlock();
        } catch (Throwable th) {
            this.b.unlock();
            throw th;
        }
    }

    @Override // com.oplus.aiunit.vision.l2a
    public void b(int i) {
        this.a.e(i);
    }

    @Override // com.oplus.aiunit.vision.l2a
    public void clear() {
        this.b.lock();
        try {
            this.a.a();
        } finally {
            this.b.unlock();
        }
    }

    @Override // com.oplus.aiunit.vision.l2a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean c(Long l2, T t) {
        ReentrantLock reentrantLock;
        this.b.lock();
        try {
            if (get(l2) != t || t == null) {
                return false;
            }
            remove(l2);
            return true;
        } finally {
            this.b.unlock();
        }
    }

    @Override // com.oplus.aiunit.vision.l2a
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public T get(Long l2) {
        return h(l2.longValue());
    }

    public T h(long j2) {
        this.b.lock();
        try {
            Reference<T> referenceB = this.a.b(j2);
            this.b.unlock();
            if (referenceB != null) {
                return referenceB.get();
            }
            return null;
        } catch (Throwable th) {
            this.b.unlock();
            throw th;
        }
    }

    public T i(long j2) {
        Reference<T> referenceB = this.a.b(j2);
        if (referenceB != null) {
            return referenceB.get();
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.l2a
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public T e(Long l2) {
        return i(l2.longValue());
    }

    @Override // com.oplus.aiunit.vision.l2a
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void put(Long l2, T t) {
        l(l2.longValue(), t);
    }

    public void l(long j2, T t) {
        this.b.lock();
        try {
            this.a.c(j2, new WeakReference(t));
        } finally {
            this.b.unlock();
        }
    }

    @Override // com.oplus.aiunit.vision.l2a
    public void lock() {
        this.b.lock();
    }

    public void m(long j2, T t) {
        this.a.c(j2, new WeakReference(t));
    }

    @Override // com.oplus.aiunit.vision.l2a
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void d(Long l2, T t) {
        m(l2.longValue(), t);
    }

    @Override // com.oplus.aiunit.vision.l2a
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void remove(Long l2) {
        this.b.lock();
        try {
            this.a.d(l2.longValue());
        } finally {
            this.b.unlock();
        }
    }

    @Override // com.oplus.aiunit.vision.l2a
    public void unlock() {
        this.b.unlock();
    }
}
