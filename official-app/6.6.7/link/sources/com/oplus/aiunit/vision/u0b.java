package com.oplus.aiunit.vision;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class u0b<K, V> {
    public final Object a = new Object();
    public final List<V> b = new ArrayList();
    public final Map<K, V> c = new HashMap();

    public void a() {
        synchronized (this.a) {
            this.c.clear();
            this.b.clear();
        }
    }

    public ArrayList<V> b() {
        ArrayList<V> arrayList;
        synchronized (this.a) {
            arrayList = new ArrayList<>(this.b);
        }
        return arrayList;
    }

    public V c(K k) {
        V v;
        synchronized (this.a) {
            v = this.c.get(k);
        }
        return v;
    }

    public int d(K k, V v) {
        int size;
        synchronized (this.a) {
            this.c.put(k, v);
            this.b.add(v);
            size = this.c.size();
        }
        return size;
    }

    public V e(K k) {
        V vRemove;
        synchronized (this.a) {
            vRemove = this.c.remove(k);
            this.b.remove(vRemove);
        }
        return vRemove;
    }
}
