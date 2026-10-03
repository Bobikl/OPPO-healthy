package org.apache.commons.collections4.set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.OrderedIterator;
import org.apache.commons.collections4.functors.UniquePredicate;
import org.apache.commons.collections4.iterators.AbstractIteratorDecorator;
import org.apache.commons.collections4.list.UnmodifiableList;

/* JADX INFO: loaded from: classes11.dex */
public class ListOrderedSet<E> extends AbstractSerializableSetDecorator<E> {
    private static final long serialVersionUID = -228664372470420141L;
    private final List<E> setOrder;

    public static class OrderedSetIterator<E> extends AbstractIteratorDecorator<E> implements OrderedIterator<E> {
        private E last;
        private final Collection<E> set;

        @Override // org.apache.commons.collections4.OrderedIterator
        public boolean hasPrevious() {
            return ((ListIterator) getIterator()).hasPrevious();
        }

        @Override // org.apache.commons.collections4.iterators.AbstractIteratorDecorator, java.util.Iterator
        public E next() {
            E next = getIterator().next();
            this.last = next;
            return next;
        }

        @Override // org.apache.commons.collections4.OrderedIterator
        public E previous() {
            E e2 = (E) ((ListIterator) getIterator()).previous();
            this.last = e2;
            return e2;
        }

        @Override // org.apache.commons.collections4.iterators.AbstractUntypedIteratorDecorator, java.util.Iterator
        public void remove() {
            this.set.remove(this.last);
            getIterator().remove();
            this.last = null;
        }

        private OrderedSetIterator(ListIterator<E> listIterator, Collection<E> collection) {
            super(listIterator);
            this.set = collection;
        }
    }

    public ListOrderedSet() {
        super(new HashSet());
        this.setOrder = new ArrayList();
    }

    public static <E> ListOrderedSet<E> listOrderedSet(Set<E> set, List<E> list) {
        if (set == null) {
            throw new NullPointerException("Set must not be null");
        }
        if (list == null) {
            throw new NullPointerException("List must not be null");
        }
        if (set.size() > 0 || list.size() > 0) {
            throw new IllegalArgumentException("Set and List must be empty");
        }
        return new ListOrderedSet<>(set, list);
    }

    @Override // org.apache.commons.collections4.collection.AbstractCollectionDecorator, java.util.Collection, org.apache.commons.collections4.Bag
    public boolean add(E e2) {
        if (!decorated().add(e2)) {
            return false;
        }
        this.setOrder.add(e2);
        return true;
    }

    @Override // org.apache.commons.collections4.collection.AbstractCollectionDecorator, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    public List<E> asList() {
        return UnmodifiableList.unmodifiableList(this.setOrder);
    }

    @Override // org.apache.commons.collections4.collection.AbstractCollectionDecorator, java.util.Collection
    public void clear() {
        decorated().clear();
        this.setOrder.clear();
    }

    public E get(int i) {
        return this.setOrder.get(i);
    }

    public int indexOf(Object obj) {
        return this.setOrder.indexOf(obj);
    }

    @Override // org.apache.commons.collections4.collection.AbstractCollectionDecorator, java.util.Collection, org.apache.commons.collections4.Bag
    public boolean remove(Object obj) {
        boolean zRemove = decorated().remove(obj);
        if (zRemove) {
            this.setOrder.remove(obj);
        }
        return zRemove;
    }

    @Override // org.apache.commons.collections4.collection.AbstractCollectionDecorator, java.util.Collection, org.apache.commons.collections4.Bag
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // org.apache.commons.collections4.collection.AbstractCollectionDecorator, java.util.Collection, org.apache.commons.collections4.Bag
    public boolean retainAll(Collection<?> collection) {
        boolean zRetainAll = decorated().retainAll(collection);
        if (!zRetainAll) {
            return false;
        }
        if (decorated().size() == 0) {
            this.setOrder.clear();
        } else {
            Iterator<E> it = this.setOrder.iterator();
            while (it.hasNext()) {
                if (!decorated().contains(it.next())) {
                    it.remove();
                }
            }
        }
        return zRetainAll;
    }

    @Override // org.apache.commons.collections4.collection.AbstractCollectionDecorator, java.util.Collection
    public Object[] toArray() {
        return this.setOrder.toArray();
    }

    @Override // org.apache.commons.collections4.collection.AbstractCollectionDecorator
    public String toString() {
        return this.setOrder.toString();
    }

    @Override // org.apache.commons.collections4.collection.AbstractCollectionDecorator, java.util.Collection, java.lang.Iterable, org.apache.commons.collections4.Bag
    public OrderedIterator<E> iterator() {
        return new OrderedSetIterator(this.setOrder.listIterator(), decorated());
    }

    @Override // org.apache.commons.collections4.collection.AbstractCollectionDecorator, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) this.setOrder.toArray(tArr);
    }

    public ListOrderedSet(Set<E> set) {
        super(set);
        this.setOrder = new ArrayList(set);
    }

    public void add(int i, E e2) {
        if (contains(e2)) {
            return;
        }
        decorated().add(e2);
        this.setOrder.add(i, e2);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (E e2 : collection) {
            if (!contains(e2)) {
                decorated().add(e2);
                arrayList.add(e2);
                z = true;
            }
        }
        if (z) {
            this.setOrder.addAll(i, arrayList);
        }
        return z;
    }

    public E remove(int i) {
        E eRemove = this.setOrder.remove(i);
        remove(eRemove);
        return eRemove;
    }

    public ListOrderedSet(Set<E> set, List<E> list) {
        super(set);
        if (list != null) {
            this.setOrder = list;
            return;
        }
        throw new NullPointerException("List must not be null");
    }

    public static <E> ListOrderedSet<E> listOrderedSet(Set<E> set) {
        return new ListOrderedSet<>(set);
    }

    public static <E> ListOrderedSet<E> listOrderedSet(List<E> list) {
        if (list != null) {
            CollectionUtils.filter(list, UniquePredicate.uniquePredicate());
            return new ListOrderedSet<>(new HashSet(list), list);
        }
        throw new NullPointerException("List must not be null");
    }
}
