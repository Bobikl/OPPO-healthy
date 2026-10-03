package com.oplus.aiunit.vision;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class c9c<K1, K2, V> {
    public final Map<K1, Map<K2, V>> a = new HashMap();

    public interface a<T> {
        T create();
    }

    public interface b<K1, K2, V> {
        boolean a(K1 k1, K2 k2, V v);
    }

    public void a(b<K1, K2, V> bVar) {
        synchronized (this.a) {
            Iterator<Map.Entry<K1, Map<K2, V>>> it = this.a.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<K1, Map<K2, V>> next = it.next();
                K1 key = next.getKey();
                Iterator<Map.Entry<K2, V>> it2 = next.getValue().entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry<K2, V> next2 = it2.next();
                    if (bVar.a(key, next2.getKey(), next2.getValue())) {
                        it2.remove();
                    }
                }
                Map<K2, V> map = this.a.get(key);
                if ((map == null ? 0 : map.size()) == 0) {
                    it.remove();
                }
            }
        }
    }

    public V b(K1 k1, K2 k2) {
        synchronized (this.a) {
            Map<K2, V> map = this.a.get(k1);
            if (map == null) {
                return null;
            }
            return map.get(k2);
        }
    }

    public V c(K1 k1, K2 k2, a<V> aVar) {
        synchronized (this.a) {
            V vB = b(k1, k2);
            if (vB != null) {
                return vB;
            }
            V vCreate = aVar.create();
            d(k1, k2, vCreate);
            return vCreate;
        }
    }

    public void d(K1 k1, K2 k2, V v) {
        synchronized (this.a) {
            Map<K2, V> map = this.a.get(k1);
            if (map == null) {
                map = new HashMap<>();
                this.a.put(k1, map);
            }
            map.put(k2, v);
        }
    }

    public V e(K1 k1, K2 k2) {
        synchronized (this.a) {
            Map<K2, V> map = this.a.get(k1);
            if (map == null) {
                return null;
            }
            V vRemove = map.remove(k2);
            if (map.isEmpty()) {
                this.a.remove(k1);
            }
            return vRemove;
        }
    }
}
