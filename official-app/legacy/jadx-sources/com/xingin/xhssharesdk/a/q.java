package com.xingin.xhssharesdk.a;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class q<K, V> extends LinkedHashMap<K, V> {
    public static final q b;
    public boolean a;

    static {
        q qVar = new q(Collections.emptyMap());
        b = qVar;
        qVar.a = false;
    }

    public q() {
        this.a = true;
    }

    public static <K, V> q<K, V> a() {
        return b;
    }

    public final void b() {
        if (!this.a) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        boolean z;
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this != map) {
            if (size() == map.size()) {
                Iterator<Map.Entry<K, V>> it = entrySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        Map.Entry<K, V> next = it.next();
                        if (map.containsKey(next.getKey())) {
                            V value = next.getValue();
                            Object obj2 = map.get(next.getKey());
                            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                            }
                        }
                    } else {
                        z = true;
                    }
                }
            }
            z = false;
        } else {
            z = true;
        }
        return z;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iHashCode;
        int i = 0;
        for (Map.Entry<K, V> entry : entrySet()) {
            K key = entry.getKey();
            int iHashCode2 = 1;
            if (key instanceof byte[]) {
                byte[] bArr = (byte[]) key;
                Charset charset = f.a;
                int length = bArr.length;
                iHashCode = length;
                for (int i2 = 0; i2 < 0 + length; i2++) {
                    iHashCode = (iHashCode * 31) + bArr[i2];
                }
                if (iHashCode == 0) {
                    iHashCode = 1;
                }
            } else {
                if (key instanceof f.a) {
                    throw new UnsupportedOperationException();
                }
                iHashCode = key.hashCode();
            }
            V value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr2 = (byte[]) value;
                Charset charset2 = f.a;
                int length2 = bArr2.length;
                int i3 = length2;
                for (int i4 = 0; i4 < 0 + length2; i4++) {
                    i3 = (i3 * 31) + bArr2[i4];
                }
                if (i3 != 0) {
                    iHashCode2 = i3;
                }
            } else {
                if (value instanceof f.a) {
                    throw new UnsupportedOperationException();
                }
                iHashCode2 = value.hashCode();
            }
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        b();
        return (V) super.put(k, v);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        b();
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        b();
        return (V) super.remove(obj);
    }

    public q(Map<K, V> map) {
        super(map);
        this.a = true;
    }

    public final void a(q<K, V> qVar) {
        b();
        if (qVar.isEmpty()) {
            return;
        }
        b();
        super.putAll(qVar);
    }
}
