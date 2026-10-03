package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public interface l2a<K, T> {
    void a(Iterable<K> iterable);

    void b(int i);

    boolean c(K k, T t);

    void clear();

    void d(K k, T t);

    T e(K k);

    T get(K k);

    void lock();

    void put(K k, T t);

    void remove(K k);

    void unlock();
}
