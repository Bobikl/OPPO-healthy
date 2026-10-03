package org.apache.commons.collections4.iterators;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public class PushbackIterator<E> implements Iterator<E> {
    private Deque<E> items = new ArrayDeque();
    private final Iterator<? extends E> iterator;

    public PushbackIterator(Iterator<? extends E> it) {
        this.iterator = it;
    }

    public static <E> PushbackIterator<E> pushbackIterator(Iterator<? extends E> it) {
        if (it != null) {
            return it instanceof PushbackIterator ? (PushbackIterator) it : new PushbackIterator<>(it);
        }
        throw new NullPointerException("Iterator must not be null");
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.items.isEmpty()) {
            return this.iterator.hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public E next() {
        return !this.items.isEmpty() ? this.items.pop() : this.iterator.next();
    }

    public void pushback(E e2) {
        this.items.push(e2);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
