package io.netty.util.collection;

import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public interface LongObjectMap<V> extends Map<Long, V> {

    public interface PrimitiveEntry<V> {
        long key();

        void setValue(V v);

        V value();
    }

    boolean containsKey(long j2);

    Iterable<PrimitiveEntry<V>> entries();

    V get(long j2);

    V put(long j2, V v);

    V remove(long j2);
}
