package com.xingin.xhssharesdk.a;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class h extends i {

    public static class a<K> implements Map.Entry<K, Object> {
        public final Map.Entry<K, h> i;

        public a(Map.Entry<K, h> entry) {
            this.i = entry;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.i.getKey();
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            h value = this.i.getValue();
            if (value == null) {
                return null;
            }
            return value.a();
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            if (!(obj instanceof l)) {
                throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
            }
            h value = this.i.getValue();
            l lVar = value.a;
            value.b = null;
            value.a = (l) obj;
            return lVar;
        }
    }

    public static class b<K> implements Iterator<Map.Entry<K, Object>> {
        public final Iterator<Map.Entry<K, Object>> i;

        public b(Iterator<Map.Entry<K, Object>> it) {
            this.i = it;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.i.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            Map.Entry<K, Object> next = this.i.next();
            return next.getValue() instanceof h ? new a(next) : next;
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.i.remove();
        }
    }

    public final l a() {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    try {
                        this.a = null;
                        this.b = e.b;
                    } catch (m unused) {
                        this.a = null;
                        this.b = e.b;
                    }
                }
            }
        }
        return this.a;
    }

    public final boolean equals(Object obj) {
        return a().equals(obj);
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a().toString();
    }
}
