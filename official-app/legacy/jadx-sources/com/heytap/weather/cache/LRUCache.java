package com.heytap.weather.cache;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class LRUCache<K, V> {
    public final int a;
    public final float b = 0.75f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap<K, V> f8521c;

    public LRUCache(int i) {
        float f = 0.75f;
        if (i <= 0) {
            throw new IllegalArgumentException("cacheSize <= 0");
        }
        this.a = i;
        this.f8521c = new LinkedHashMap<K, V>(((int) Math.ceil(i / 0.75f)) + 1, f, true) { // from class: com.heytap.weather.cache.LRUCache.1
            @Override // java.util.LinkedHashMap
            public boolean removeEldestEntry(Map.Entry<K, V> entry) {
                return super.size() > LRUCache.this.a;
            }
        };
    }

    public synchronized V b(K k) {
        return this.f8521c.get(k);
    }

    public Boolean c(K k) {
        return Boolean.valueOf(this.f8521c.containsKey(k));
    }

    public synchronized void d(K k, V v) {
        this.f8521c.put(k, v);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<K, V> entry : this.f8521c.entrySet()) {
            sb.append(String.format("%s: %s  ", entry.getKey(), entry.getValue()));
        }
        return sb.toString();
    }
}
