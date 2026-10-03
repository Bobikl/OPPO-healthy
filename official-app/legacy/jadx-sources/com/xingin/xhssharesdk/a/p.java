package com.xingin.xhssharesdk.a;

import com.heytap.store.base.core.http.HttpUtils;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes10.dex */
public class p<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    public static final /* synthetic */ int f = 0;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<p<K, V>.b> f20431j;
    public Map<K, V> k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f20432l;
    public volatile p<K, V>.d m;

    public static class a {
        public static final C1020a a = new C1020a();
        public static final b b = new b();

        /* JADX INFO: renamed from: com.xingin.xhssharesdk.a.p$a$a, reason: collision with other inner class name */
        public static class C1020a implements Iterator<Object> {
            @Override // java.util.Iterator
            public final boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public final Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException();
            }
        }

        public static class b implements Iterable<Object> {
            @Override // java.lang.Iterable
            public final Iterator<Object> iterator() {
                return a.a;
            }
        }
    }

    public class b implements Map.Entry<K, V>, Comparable<p<K, V>.b> {
        public final K i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public V f20433j;

        public b() {
            throw null;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.i.compareTo(((b) obj).i);
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            boolean zEquals;
            boolean zEquals2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k = this.i;
            Object key = entry.getKey();
            if (k == null) {
                zEquals = key == null;
            } else {
                zEquals = k.equals(key);
            }
            if (zEquals) {
                V v = this.f20433j;
                Object value = entry.getValue();
                if (v == null) {
                    zEquals2 = value == null;
                } else {
                    zEquals2 = v.equals(value);
                }
                if (zEquals2) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.i;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f20433j;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k = this.i;
            int iHashCode = k == null ? 0 : k.hashCode();
            V v = this.f20433j;
            return iHashCode ^ (v != null ? v.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            p pVar = p.this;
            int i = p.f;
            pVar.d();
            V v2 = this.f20433j;
            this.f20433j = v;
            return v2;
        }

        public final String toString() {
            return this.i + HttpUtils.EQUAL_SIGN + this.f20433j;
        }

        public b(K k, V v) {
            this.i = k;
            this.f20433j = v;
        }
    }

    public class c implements Iterator<Map.Entry<K, V>> {
        public int i = -1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f20434j;
        public Iterator<Map.Entry<K, V>> k;

        public c() {
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.i + 1 < p.this.f20431j.size()) {
                return true;
            }
            if (this.k == null) {
                this.k = p.this.k.entrySet().iterator();
            }
            return this.k.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            this.f20434j = true;
            int i = this.i + 1;
            this.i = i;
            if (i < p.this.f20431j.size()) {
                return p.this.f20431j.get(this.i);
            }
            if (this.k == null) {
                this.k = p.this.k.entrySet().iterator();
            }
            return this.k.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.f20434j) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f20434j = false;
            p pVar = p.this;
            int i = p.f;
            pVar.d();
            if (this.i >= p.this.f20431j.size()) {
                if (this.k == null) {
                    this.k = p.this.k.entrySet().iterator();
                }
                this.k.remove();
                return;
            }
            p pVar2 = p.this;
            int i2 = this.i;
            this.i = i2 - 1;
            pVar2.d();
            V v = pVar2.f20431j.remove(i2).f20433j;
            if (pVar2.k.isEmpty()) {
                return;
            }
            pVar2.d();
            if (pVar2.k.isEmpty() && !(pVar2.k instanceof TreeMap)) {
                pVar2.k = new TreeMap();
            }
            Iterator it = ((SortedMap) pVar2.k).entrySet().iterator();
            List<p<K, V>.b> list = pVar2.f20431j;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new b((Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
    }

    public class d extends AbstractSet<Map.Entry<K, V>> {
        public d() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                return false;
            }
            p.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            p.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = p.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new c();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            p.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return p.this.size();
        }
    }

    public p(int i) {
        this.i = i;
        this.f20431j = Collections.emptyList();
        this.k = Collections.emptyMap();
    }

    public static o b(int i) {
        return new o(i);
    }

    public final int a(K k) {
        int size = this.f20431j.size() - 1;
        if (size >= 0) {
            int iCompareTo = k.compareTo(this.f20431j.get(size).i);
            if (iCompareTo > 0) {
                return -(size + 2);
            }
            if (iCompareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int iCompareTo2 = k.compareTo(this.f20431j.get(i2).i);
            if (iCompareTo2 < 0) {
                size = i2 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i2;
                }
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final V put(K k, V v) {
        d();
        int iA = a(k);
        if (iA >= 0) {
            return this.f20431j.get(iA).setValue(v);
        }
        d();
        if (this.f20431j.isEmpty() && !(this.f20431j instanceof ArrayList)) {
            this.f20431j = new ArrayList(this.i);
        }
        int i = -(iA + 1);
        if (i >= this.i) {
            d();
            if (this.k.isEmpty() && !(this.k instanceof TreeMap)) {
                this.k = new TreeMap();
            }
            return (V) ((SortedMap) this.k).put(k, v);
        }
        int size = this.f20431j.size();
        int i2 = this.i;
        if (size == i2) {
            p<K, V>.b bVarRemove = this.f20431j.remove(i2 - 1);
            d();
            if (this.k.isEmpty() && !(this.k instanceof TreeMap)) {
                this.k = new TreeMap();
            }
            ((SortedMap) this.k).put(bVarRemove.i, bVarRemove.f20433j);
        }
        this.f20431j.add(i, new b(k, v));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        d();
        if (!this.f20431j.isEmpty()) {
            this.f20431j.clear();
        }
        if (this.k.isEmpty()) {
            return;
        }
        this.k.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.k.containsKey(comparable);
    }

    public final void d() {
        if (this.f20432l) {
            throw new UnsupportedOperationException();
        }
    }

    public void e() {
        if (this.f20432l) {
            return;
        }
        this.k = this.k.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.k);
        this.f20432l = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.m == null) {
            this.m = new d();
        }
        return this.m;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return super.equals(obj);
        }
        p pVar = (p) obj;
        int size = size();
        if (size != pVar.size()) {
            return false;
        }
        int size2 = this.f20431j.size();
        if (size2 != pVar.f20431j.size()) {
            return ((AbstractSet) entrySet()).equals(pVar.entrySet());
        }
        for (int i = 0; i < size2; i++) {
            if (!this.f20431j.get(i).equals(pVar.f20431j.get(i))) {
                return false;
            }
        }
        if (size2 != size) {
            return this.k.equals(pVar.k);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? this.f20431j.get(iA).f20433j : this.k.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f20431j.size();
        int iHashCode = 0;
        for (int i = 0; i < size; i++) {
            iHashCode += this.f20431j.get(i).hashCode();
        }
        return this.k.size() > 0 ? iHashCode + this.k.hashCode() : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        d();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA < 0) {
            if (this.k.isEmpty()) {
                return null;
            }
            return this.k.remove(comparable);
        }
        d();
        V v = this.f20431j.remove(iA).f20433j;
        if (!this.k.isEmpty()) {
            d();
            if (this.k.isEmpty() && !(this.k instanceof TreeMap)) {
                this.k = new TreeMap();
            }
            Iterator it = ((SortedMap) this.k).entrySet().iterator();
            List<p<K, V>.b> list = this.f20431j;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new b((Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.k.size() + this.f20431j.size();
    }

    public /* synthetic */ p(int i, int i2) {
        this(i);
    }
}
