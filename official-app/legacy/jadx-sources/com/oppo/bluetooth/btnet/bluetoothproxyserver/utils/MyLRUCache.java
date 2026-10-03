package com.oppo.bluetooth.btnet.bluetoothproxyserver.utils;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class MyLRUCache<K, V> extends LinkedHashMap<K, V> {
    private transient a<V> callback;
    private int maxSize;

    public interface a<V> {
        void a(V v);
    }

    public MyLRUCache(int i, a<V> aVar) {
        super(i + 1, 1.0f, true);
        this.maxSize = i;
        this.callback = aVar;
    }

    @Override // java.util.LinkedHashMap
    public boolean removeEldestEntry(Map.Entry<K, V> entry) {
        if (size() <= this.maxSize) {
            return false;
        }
        this.callback.a(entry.getValue());
        return true;
    }
}
