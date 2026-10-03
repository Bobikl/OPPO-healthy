package com.oplus.aiunit.vision;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes6.dex */
public class ava<E> implements Set<E> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f9501j;
    public final ConcurrentHashMap<E, Long> i = new ConcurrentHashMap<>();
    public final AtomicLong k = new AtomicLong(System.currentTimeMillis());

    public class a implements Iterator<E> {
        public final Iterator<E> i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public E f9502j;

        public a(Iterator<E> it) {
            this.i = it;
            a();
        }

        public final void a() {
            this.f9502j = null;
            while (this.i.hasNext() && this.f9502j == null) {
                E next = this.i.next();
                if (ava.this.contains(next)) {
                    this.f9502j = next;
                }
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f9502j != null;
        }

        @Override // java.util.Iterator
        public E next() {
            E e2 = this.f9502j;
            if (e2 == null) {
                throw new NoSuchElementException();
            }
            a();
            return e2;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Remove not supported");
        }
    }

    public ava(long j2) {
        this.f9501j = j2;
    }

    public boolean a(E e2, long j2) {
        this.i.put(e2, Long.valueOf(System.currentTimeMillis() + j2));
        b(false);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(E e2) {
        return a(e2, this.f9501j);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (add(it.next())) {
                z = true;
            }
        }
        return z;
    }

    public final void b(boolean z) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = this.k.get();
        if (z || jCurrentTimeMillis - j2 >= 300000) {
            if (this.k.compareAndSet(j2, jCurrentTimeMillis) || z) {
                int iMax = Math.max(10, this.i.size() / 10);
                Iterator<Map.Entry<E, Long>> it = this.i.entrySet().iterator();
                int i = 0;
                while (it.hasNext() && i < iMax) {
                    if (jCurrentTimeMillis > it.next().getValue().longValue()) {
                        it.remove();
                        i++;
                    }
                }
            }
        }
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.i.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        Long l2 = this.i.get(obj);
        if (l2 == null) {
            return false;
        }
        if (System.currentTimeMillis() <= l2.longValue()) {
            return true;
        }
        this.i.remove(obj);
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        b(false);
        return new a(this.i.keySet().iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        return this.i.remove(obj) != null;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (remove(it.next())) {
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (E e2 : this) {
            if (!collection.contains(e2)) {
                remove(e2);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    public int size() {
        b(false);
        return this.i.size();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        b(true);
        return this.i.keySet().toArray();
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        b(true);
        return (T[]) this.i.keySet().toArray(tArr);
    }
}
