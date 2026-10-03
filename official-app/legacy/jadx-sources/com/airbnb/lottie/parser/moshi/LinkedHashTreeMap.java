package com.airbnb.lottie.parser.moshi;

import com.heytap.store.base.core.http.HttpUtils;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
final class LinkedHashTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Comparator<Comparable> NATURAL_ORDER = new a();
    Comparator<? super K> comparator;
    private LinkedHashTreeMap<K, V>.d entrySet;
    final g<K, V> header;
    private LinkedHashTreeMap<K, V>.e keySet;
    int modCount;
    int size;
    g<K, V>[] table;
    int threshold;

    public class a implements Comparator<Comparable> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    public static final class b<K, V> {
        public g<K, V> a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f534c;
        public int d;

        public void a(g<K, V> gVar) {
            gVar.k = null;
            gVar.i = null;
            gVar.f537j = null;
            gVar.q = 1;
            int i = this.b;
            if (i > 0) {
                int i2 = this.d;
                if ((i2 & 1) == 0) {
                    this.d = i2 + 1;
                    this.b = i - 1;
                    this.f534c++;
                }
            }
            gVar.i = this.a;
            this.a = gVar;
            int i3 = this.d + 1;
            this.d = i3;
            int i4 = this.b;
            if (i4 > 0 && (i3 & 1) == 0) {
                this.d = i3 + 1;
                this.b = i4 - 1;
                this.f534c++;
            }
            int i5 = 4;
            while (true) {
                int i6 = i5 - 1;
                if ((this.d & i6) != i6) {
                    return;
                }
                int i7 = this.f534c;
                if (i7 == 0) {
                    g<K, V> gVar2 = this.a;
                    g<K, V> gVar3 = gVar2.i;
                    g<K, V> gVar4 = gVar3.i;
                    gVar3.i = gVar4.i;
                    this.a = gVar3;
                    gVar3.f537j = gVar4;
                    gVar3.k = gVar2;
                    gVar3.q = gVar2.q + 1;
                    gVar4.i = gVar3;
                    gVar2.i = gVar3;
                } else if (i7 == 1) {
                    g<K, V> gVar5 = this.a;
                    g<K, V> gVar6 = gVar5.i;
                    this.a = gVar6;
                    gVar6.k = gVar5;
                    gVar6.q = gVar5.q + 1;
                    gVar5.i = gVar6;
                    this.f534c = 0;
                } else if (i7 == 2) {
                    this.f534c = 0;
                }
                i5 *= 2;
            }
        }

        public void b(int i) {
            this.b = ((Integer.highestOneBit(i) * 2) - 1) - i;
            this.d = 0;
            this.f534c = 0;
            this.a = null;
        }

        public g<K, V> c() {
            g<K, V> gVar = this.a;
            if (gVar.i == null) {
                return gVar;
            }
            throw new IllegalStateException();
        }
    }

    public static class c<K, V> {
        public g<K, V> a;

        public g<K, V> a() {
            g<K, V> gVar = this.a;
            if (gVar == null) {
                return null;
            }
            g<K, V> gVar2 = gVar.i;
            gVar.i = null;
            g<K, V> gVar3 = gVar.k;
            while (true) {
                g<K, V> gVar4 = gVar2;
                gVar2 = gVar3;
                if (gVar2 == null) {
                    this.a = gVar4;
                    return gVar;
                }
                gVar2.i = gVar4;
                gVar3 = gVar2.f537j;
            }
        }

        public void b(g<K, V> gVar) {
            g<K, V> gVar2 = null;
            while (gVar != null) {
                gVar.i = gVar2;
                gVar2 = gVar;
                gVar = gVar.f537j;
            }
            this.a = gVar2;
        }
    }

    public final class d extends AbstractSet<Map.Entry<K, V>> {

        public class a extends LinkedHashTreeMap<K, V>.f<Map.Entry<K, V>> {
            public a() {
                super();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> next() {
                return a();
            }
        }

        public d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            LinkedHashTreeMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && LinkedHashTreeMap.this.findByEntry((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            g<K, V> gVarFindByEntry;
            if (!(obj instanceof Map.Entry) || (gVarFindByEntry = LinkedHashTreeMap.this.findByEntry((Map.Entry) obj)) == null) {
                return false;
            }
            LinkedHashTreeMap.this.removeInternal(gVarFindByEntry, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return LinkedHashTreeMap.this.size;
        }
    }

    public final class e extends AbstractSet<K> {

        public class a extends LinkedHashTreeMap<K, V>.f<K> {
            public a() {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return a().f539n;
            }
        }

        public e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            LinkedHashTreeMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return LinkedHashTreeMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return LinkedHashTreeMap.this.removeInternalByKey(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return LinkedHashTreeMap.this.size;
        }
    }

    public abstract class f<T> implements Iterator<T> {
        public g<K, V> i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public g<K, V> f535j = null;
        public int k;

        public f() {
            this.i = LinkedHashTreeMap.this.header.f538l;
            this.k = LinkedHashTreeMap.this.modCount;
        }

        public final g<K, V> a() {
            g<K, V> gVar = this.i;
            LinkedHashTreeMap linkedHashTreeMap = LinkedHashTreeMap.this;
            if (gVar == linkedHashTreeMap.header) {
                throw new NoSuchElementException();
            }
            if (linkedHashTreeMap.modCount != this.k) {
                throw new ConcurrentModificationException();
            }
            this.i = gVar.f538l;
            this.f535j = gVar;
            return gVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.i != LinkedHashTreeMap.this.header;
        }

        @Override // java.util.Iterator
        public final void remove() {
            g<K, V> gVar = this.f535j;
            if (gVar == null) {
                throw new IllegalStateException();
            }
            LinkedHashTreeMap.this.removeInternal(gVar, true);
            this.f535j = null;
            this.k = LinkedHashTreeMap.this.modCount;
        }
    }

    public LinkedHashTreeMap() {
        this(null);
    }

    private void doubleCapacity() {
        g<K, V>[] gVarArrDoubleCapacity = doubleCapacity(this.table);
        this.table = gVarArrDoubleCapacity;
        this.threshold = (gVarArrDoubleCapacity.length / 2) + (gVarArrDoubleCapacity.length / 4);
    }

    private boolean equal(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    private void rebalance(g<K, V> gVar, boolean z) {
        while (gVar != null) {
            g<K, V> gVar2 = gVar.f537j;
            g<K, V> gVar3 = gVar.k;
            int i = gVar2 != null ? gVar2.q : 0;
            int i2 = gVar3 != null ? gVar3.q : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                g<K, V> gVar4 = gVar3.f537j;
                g<K, V> gVar5 = gVar3.k;
                int i4 = (gVar4 != null ? gVar4.q : 0) - (gVar5 != null ? gVar5.q : 0);
                if (i4 == -1 || (i4 == 0 && !z)) {
                    rotateLeft(gVar);
                } else {
                    rotateRight(gVar3);
                    rotateLeft(gVar);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                g<K, V> gVar6 = gVar2.f537j;
                g<K, V> gVar7 = gVar2.k;
                int i5 = (gVar6 != null ? gVar6.q : 0) - (gVar7 != null ? gVar7.q : 0);
                if (i5 == 1 || (i5 == 0 && !z)) {
                    rotateRight(gVar);
                } else {
                    rotateLeft(gVar2);
                    rotateRight(gVar);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                gVar.q = i + 1;
                if (z) {
                    return;
                }
            } else {
                gVar.q = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            gVar = gVar.i;
        }
    }

    private void replaceInParent(g<K, V> gVar, g<K, V> gVar2) {
        g<K, V> gVar3 = gVar.i;
        gVar.i = null;
        if (gVar2 != null) {
            gVar2.i = gVar3;
        }
        if (gVar3 == null) {
            int i = gVar.o;
            g<K, V>[] gVarArr = this.table;
            gVarArr[i & (gVarArr.length - 1)] = gVar2;
        } else if (gVar3.f537j == gVar) {
            gVar3.f537j = gVar2;
        } else {
            gVar3.k = gVar2;
        }
    }

    private void rotateLeft(g<K, V> gVar) {
        g<K, V> gVar2 = gVar.f537j;
        g<K, V> gVar3 = gVar.k;
        g<K, V> gVar4 = gVar3.f537j;
        g<K, V> gVar5 = gVar3.k;
        gVar.k = gVar4;
        if (gVar4 != null) {
            gVar4.i = gVar;
        }
        replaceInParent(gVar, gVar3);
        gVar3.f537j = gVar;
        gVar.i = gVar3;
        int iMax = Math.max(gVar2 != null ? gVar2.q : 0, gVar4 != null ? gVar4.q : 0) + 1;
        gVar.q = iMax;
        gVar3.q = Math.max(iMax, gVar5 != null ? gVar5.q : 0) + 1;
    }

    private void rotateRight(g<K, V> gVar) {
        g<K, V> gVar2 = gVar.f537j;
        g<K, V> gVar3 = gVar.k;
        g<K, V> gVar4 = gVar2.f537j;
        g<K, V> gVar5 = gVar2.k;
        gVar.f537j = gVar5;
        if (gVar5 != null) {
            gVar5.i = gVar;
        }
        replaceInParent(gVar, gVar2);
        gVar2.k = gVar;
        gVar.i = gVar2;
        int iMax = Math.max(gVar3 != null ? gVar3.q : 0, gVar5 != null ? gVar5.q : 0) + 1;
        gVar.q = iMax;
        gVar2.q = Math.max(iMax, gVar4 != null ? gVar4.q : 0) + 1;
    }

    private static int secondaryHash(int i) {
        int i2 = i ^ ((i >>> 20) ^ (i >>> 12));
        return (i2 >>> 4) ^ ((i2 >>> 7) ^ i2);
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Arrays.fill(this.table, (Object) null);
        this.size = 0;
        this.modCount++;
        g<K, V> gVar = this.header;
        g<K, V> gVar2 = gVar.f538l;
        while (gVar2 != gVar) {
            g<K, V> gVar3 = gVar2.f538l;
            gVar2.m = null;
            gVar2.f538l = null;
            gVar2 = gVar3;
        }
        gVar.m = gVar;
        gVar.f538l = gVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return findByObject(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        LinkedHashTreeMap<K, V>.d dVar = this.entrySet;
        if (dVar != null) {
            return dVar;
        }
        LinkedHashTreeMap<K, V>.d dVar2 = new d();
        this.entrySet = dVar2;
        return dVar2;
    }

    public g<K, V> find(K k, boolean z) {
        int iCompareTo;
        g<K, V> gVar;
        Comparator<? super K> comparator = this.comparator;
        g<K, V>[] gVarArr = this.table;
        int iSecondaryHash = secondaryHash(k.hashCode());
        int length = (gVarArr.length - 1) & iSecondaryHash;
        g<K, V> gVar2 = gVarArr[length];
        if (gVar2 != null) {
            Comparable comparable = comparator == NATURAL_ORDER ? (Comparable) k : null;
            while (true) {
                iCompareTo = comparable != null ? comparable.compareTo(gVar2.f539n) : comparator.compare(k, gVar2.f539n);
                if (iCompareTo == 0) {
                    return gVar2;
                }
                g<K, V> gVar3 = iCompareTo < 0 ? gVar2.f537j : gVar2.k;
                if (gVar3 == null) {
                    break;
                }
                gVar2 = gVar3;
            }
        } else {
            iCompareTo = 0;
        }
        g<K, V> gVar4 = gVar2;
        int i = iCompareTo;
        if (!z) {
            return null;
        }
        g<K, V> gVar5 = this.header;
        if (gVar4 != null) {
            gVar = new g<>(gVar4, k, iSecondaryHash, gVar5, gVar5.m);
            if (i < 0) {
                gVar4.f537j = gVar;
            } else {
                gVar4.k = gVar;
            }
            rebalance(gVar4, true);
        } else {
            if (comparator == NATURAL_ORDER && !(k instanceof Comparable)) {
                throw new ClassCastException(k.getClass().getName() + " is not Comparable");
            }
            gVar = new g<>(gVar4, k, iSecondaryHash, gVar5, gVar5.m);
            gVarArr[length] = gVar;
        }
        int i2 = this.size;
        this.size = i2 + 1;
        if (i2 > this.threshold) {
            doubleCapacity();
        }
        this.modCount++;
        return gVar;
    }

    public g<K, V> findByEntry(Map.Entry<?, ?> entry) {
        g<K, V> gVarFindByObject = findByObject(entry.getKey());
        if (gVarFindByObject != null && equal(gVarFindByObject.p, entry.getValue())) {
            return gVarFindByObject;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g<K, V> findByObject(Object obj) {
        if (obj == 0) {
            return null;
        }
        try {
            return find(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        g<K, V> gVarFindByObject = findByObject(obj);
        if (gVarFindByObject != null) {
            return gVarFindByObject.p;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        LinkedHashTreeMap<K, V>.e eVar = this.keySet;
        if (eVar != null) {
            return eVar;
        }
        LinkedHashTreeMap<K, V>.e eVar2 = new e();
        this.keySet = eVar2;
        return eVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        g<K, V> gVarFind = find(k, true);
        V v2 = gVarFind.p;
        gVarFind.p = v;
        return v2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        g<K, V> gVarRemoveInternalByKey = removeInternalByKey(obj);
        if (gVarRemoveInternalByKey != null) {
            return gVarRemoveInternalByKey.p;
        }
        return null;
    }

    public void removeInternal(g<K, V> gVar, boolean z) {
        int i;
        if (z) {
            g<K, V> gVar2 = gVar.m;
            gVar2.f538l = gVar.f538l;
            gVar.f538l.m = gVar2;
            gVar.m = null;
            gVar.f538l = null;
        }
        g<K, V> gVar3 = gVar.f537j;
        g<K, V> gVar4 = gVar.k;
        g<K, V> gVar5 = gVar.i;
        int i2 = 0;
        if (gVar3 == null || gVar4 == null) {
            if (gVar3 != null) {
                replaceInParent(gVar, gVar3);
                gVar.f537j = null;
            } else if (gVar4 != null) {
                replaceInParent(gVar, gVar4);
                gVar.k = null;
            } else {
                replaceInParent(gVar, null);
            }
            rebalance(gVar5, false);
            this.size--;
            this.modCount++;
            return;
        }
        g<K, V> gVarB = gVar3.q > gVar4.q ? gVar3.b() : gVar4.a();
        removeInternal(gVarB, false);
        g<K, V> gVar6 = gVar.f537j;
        if (gVar6 != null) {
            i = gVar6.q;
            gVarB.f537j = gVar6;
            gVar6.i = gVarB;
            gVar.f537j = null;
        } else {
            i = 0;
        }
        g<K, V> gVar7 = gVar.k;
        if (gVar7 != null) {
            i2 = gVar7.q;
            gVarB.k = gVar7;
            gVar7.i = gVarB;
            gVar.k = null;
        }
        gVarB.q = Math.max(i, i2) + 1;
        replaceInParent(gVar, gVarB);
    }

    public g<K, V> removeInternalByKey(Object obj) {
        g<K, V> gVarFindByObject = findByObject(obj);
        if (gVarFindByObject != null) {
            removeInternal(gVarFindByObject, true);
        }
        return gVarFindByObject;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.size;
    }

    public LinkedHashTreeMap(Comparator<? super K> comparator) {
        this.size = 0;
        this.modCount = 0;
        this.comparator = comparator == null ? NATURAL_ORDER : comparator;
        this.header = new g<>();
        g<K, V>[] gVarArr = new g[16];
        this.table = gVarArr;
        this.threshold = (gVarArr.length / 2) + (gVarArr.length / 4);
    }

    public static <K, V> g<K, V>[] doubleCapacity(g<K, V>[] gVarArr) {
        int length = gVarArr.length;
        g<K, V>[] gVarArr2 = new g[length * 2];
        c cVar = new c();
        b bVar = new b();
        b bVar2 = new b();
        for (int i = 0; i < length; i++) {
            g<K, V> gVar = gVarArr[i];
            if (gVar != null) {
                cVar.b(gVar);
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    g<K, V> gVarA = cVar.a();
                    if (gVarA == null) {
                        break;
                    }
                    if ((gVarA.o & length) == 0) {
                        i2++;
                    } else {
                        i3++;
                    }
                }
                bVar.b(i2);
                bVar2.b(i3);
                cVar.b(gVar);
                while (true) {
                    g<K, V> gVarA2 = cVar.a();
                    if (gVarA2 == null) {
                        break;
                    }
                    if ((gVarA2.o & length) == 0) {
                        bVar.a(gVarA2);
                    } else {
                        bVar2.a(gVarA2);
                    }
                }
                gVarArr2[i] = i2 > 0 ? bVar.c() : null;
                gVarArr2[i + length] = i3 > 0 ? bVar2.c() : null;
            }
        }
        return gVarArr2;
    }

    public static final class g<K, V> implements Map.Entry<K, V> {
        public g<K, V> i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public g<K, V> f537j;
        public g<K, V> k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public g<K, V> f538l;
        public g<K, V> m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final K f539n;
        public final int o;
        public V p;
        public int q;

        public g() {
            this.f539n = null;
            this.o = -1;
            this.m = this;
            this.f538l = this;
        }

        public g<K, V> a() {
            g<K, V> gVar = this.f537j;
            while (true) {
                g<K, V> gVar2 = gVar;
                g<K, V> gVar3 = this;
                this = gVar2;
                if (this == null) {
                    return gVar3;
                }
                gVar = this.f537j;
            }
        }

        public g<K, V> b() {
            g<K, V> gVar = this.k;
            while (true) {
                g<K, V> gVar2 = gVar;
                g<K, V> gVar3 = this;
                this = gVar2;
                if (this == null) {
                    return gVar3;
                }
                gVar = this.k;
            }
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k = this.f539n;
            if (k == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!k.equals(entry.getKey())) {
                return false;
            }
            V v = this.p;
            if (v == null) {
                if (entry.getValue() != null) {
                    return false;
                }
            } else if (!v.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f539n;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.p;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k = this.f539n;
            int iHashCode = k == null ? 0 : k.hashCode();
            V v = this.p;
            return iHashCode ^ (v != null ? v.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            V v2 = this.p;
            this.p = v;
            return v2;
        }

        public String toString() {
            return this.f539n + HttpUtils.EQUAL_SIGN + this.p;
        }

        public g(g<K, V> gVar, K k, int i, g<K, V> gVar2, g<K, V> gVar3) {
            this.i = gVar;
            this.f539n = k;
            this.o = i;
            this.q = 1;
            this.f538l = gVar2;
            this.m = gVar3;
            gVar3.f538l = this;
            gVar2.m = this;
        }
    }
}
