package com.oplus.aiunit.vision;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes11.dex */
public class n2a<K, T> implements l2a<K, T> {
    public final HashMap<K, Reference<T>> a = new HashMap<>();
    public final ReentrantLock b = new ReentrantLock();

    @Override // com.oplus.aiunit.vision.l2a
    public void a(Iterable<K> iterable) {
        this.b.lock();
        try {
            Iterator<K> it = iterable.iterator();
            while (it.hasNext()) {
                this.a.remove(it.next());
            }
            this.b.unlock();
        } catch (Throwable th) {
            this.b.unlock();
            throw th;
        }
    }

    @Override // com.oplus.aiunit.vision.l2a
    public void b(int i) {
    }

    @Override // com.oplus.aiunit.vision.l2a
    public boolean c(K k, T t) {
        ReentrantLock reentrantLock;
        this.b.lock();
        try {
            if (get(k) != t || t == null) {
                return false;
            }
            remove(k);
            return true;
        } finally {
            this.b.unlock();
        }
    }

    @Override // com.oplus.aiunit.vision.l2a
    public void clear() {
        this.b.lock();
        try {
            this.a.clear();
        } finally {
            this.b.unlock();
        }
    }

    @Override // com.oplus.aiunit.vision.l2a
    public void d(K k, T t) {
        this.a.put(k, new WeakReference(t));
    }

    @Override // com.oplus.aiunit.vision.l2a
    public T e(K k) {
        Reference<T> reference = this.a.get(k);
        if (reference != null) {
            return reference.get();
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.l2a
    public T get(K k) {
        this.b.lock();
        try {
            Reference<T> reference = this.a.get(k);
            this.b.unlock();
            if (reference != null) {
                return reference.get();
            }
            return null;
        } catch (Throwable th) {
            this.b.unlock();
            throw th;
        }
    }

    @Override // com.oplus.aiunit.vision.l2a
    public void lock() {
        this.b.lock();
    }

    @Override // com.oplus.aiunit.vision.l2a
    public void put(K k, T t) {
        this.b.lock();
        try {
            this.a.put(k, new WeakReference(t));
        } finally {
            this.b.unlock();
        }
    }

    @Override // com.oplus.aiunit.vision.l2a
    public void remove(K k) {
        this.b.lock();
        try {
            this.a.remove(k);
        } finally {
            this.b.unlock();
        }
    }

    @Override // com.oplus.aiunit.vision.l2a
    public void unlock() {
        this.b.unlock();
    }
}
