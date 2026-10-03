package org.apache.commons.collections4.set;

import java.util.Iterator;
import java.util.NavigableSet;
import org.apache.commons.collections4.Predicate;

/* JADX INFO: loaded from: classes11.dex */
public class PredicatedNavigableSet<E> extends PredicatedSortedSet<E> implements NavigableSet<E> {
    private static final long serialVersionUID = 20150528;

    public PredicatedNavigableSet(NavigableSet<E> navigableSet, Predicate<? super E> predicate) {
        super(navigableSet, predicate);
    }

    public static <E> PredicatedNavigableSet<E> predicatedNavigableSet(NavigableSet<E> navigableSet, Predicate<? super E> predicate) {
        return new PredicatedNavigableSet<>(navigableSet, predicate);
    }

    @Override // java.util.NavigableSet
    public E ceiling(E e2) {
        return decorated().ceiling(e2);
    }

    @Override // java.util.NavigableSet
    public Iterator<E> descendingIterator() {
        return decorated().descendingIterator();
    }

    @Override // java.util.NavigableSet
    public NavigableSet<E> descendingSet() {
        return predicatedNavigableSet(decorated().descendingSet(), this.predicate);
    }

    @Override // java.util.NavigableSet
    public E floor(E e2) {
        return decorated().floor(e2);
    }

    @Override // java.util.NavigableSet
    public NavigableSet<E> headSet(E e2, boolean z) {
        return predicatedNavigableSet(decorated().headSet(e2, z), this.predicate);
    }

    @Override // java.util.NavigableSet
    public E higher(E e2) {
        return decorated().higher(e2);
    }

    @Override // java.util.NavigableSet
    public E lower(E e2) {
        return decorated().lower(e2);
    }

    @Override // java.util.NavigableSet
    public E pollFirst() {
        return decorated().pollFirst();
    }

    @Override // java.util.NavigableSet
    public E pollLast() {
        return decorated().pollLast();
    }

    @Override // java.util.NavigableSet
    public NavigableSet<E> subSet(E e2, boolean z, E e3, boolean z2) {
        return predicatedNavigableSet(decorated().subSet(e2, z, e3, z2), this.predicate);
    }

    @Override // java.util.NavigableSet
    public NavigableSet<E> tailSet(E e2, boolean z) {
        return predicatedNavigableSet(decorated().tailSet(e2, z), this.predicate);
    }

    @Override // org.apache.commons.collections4.set.PredicatedSortedSet, org.apache.commons.collections4.set.PredicatedSet, org.apache.commons.collections4.collection.AbstractCollectionDecorator
    public NavigableSet<E> decorated() {
        return (NavigableSet) super.decorated();
    }
}
