package com.oplus.aiunit.vision;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes19.dex */
public class ah0<K, V> {
    public final HashMap<K, ArrayList<V>> a = new HashMap<>();

    public ArrayList<V> a(K k) {
        return this.a.get(k);
    }

    public HashMap<K, ArrayList<V>> b() {
        return this.a;
    }

    public void c(K k, V v) {
        ArrayList<V> arrayList = this.a.get(k);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.a.put(k, arrayList);
        }
        arrayList.add(v);
    }
}
