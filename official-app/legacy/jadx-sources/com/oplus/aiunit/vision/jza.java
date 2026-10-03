package com.oplus.aiunit.vision;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class jza<K, V> {
    public final Object a = new Object();
    public final List<V> b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<K, V> f13092c = new HashMap();

    public void a() {
        synchronized (this.a) {
            this.f13092c.clear();
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
            v = this.f13092c.get(k);
        }
        return v;
    }

    public int d(K k, V v) {
        int size;
        synchronized (this.a) {
            this.f13092c.put(k, v);
            this.b.add(v);
            size = this.f13092c.size();
        }
        return size;
    }

    public V e(K k) {
        V vRemove;
        synchronized (this.a) {
            vRemove = this.f13092c.remove(k);
            this.b.remove(vRemove);
        }
        return vRemove;
    }
}
