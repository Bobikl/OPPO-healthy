package com.oplus.aiunit.vision;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes13.dex */
public class zg0<T> implements Iterator<T>, Iterable<T> {
    public final T[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f19403j = 0;

    public zg0(T[] tArr) {
        this.i = tArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f19403j < this.i.length;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return this;
    }

    @Override // java.util.Iterator
    public T next() {
        int i = this.f19403j;
        T[] tArr = this.i;
        if (i >= tArr.length) {
            throw new NoSuchElementException();
        }
        this.f19403j = i + 1;
        return tArr[i];
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
