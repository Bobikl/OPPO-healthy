package org.apache.commons.collections4.list;

import java.util.List;
import org.apache.commons.collections4.Factory;

/* JADX INFO: loaded from: classes11.dex */
public class LazyList<E> extends AbstractSerializableListDecorator<E> {
    private static final long serialVersionUID = -1708388017160694542L;
    private final Factory<? extends E> factory;

    public LazyList(List<E> list, Factory<? extends E> factory) {
        super(list);
        if (factory == null) {
            throw new IllegalArgumentException("Factory must not be null");
        }
        this.factory = factory;
    }

    public static <E> LazyList<E> lazyList(List<E> list, Factory<? extends E> factory) {
        return new LazyList<>(list, factory);
    }

    @Override // org.apache.commons.collections4.list.AbstractListDecorator, java.util.List
    public E get(int i) {
        int size = decorated().size();
        if (i < size) {
            E e2 = decorated().get(i);
            if (e2 != null) {
                return e2;
            }
            E eCreate = this.factory.create();
            decorated().set(i, eCreate);
            return eCreate;
        }
        while (size < i) {
            decorated().add(null);
            size++;
        }
        E eCreate2 = this.factory.create();
        decorated().add(eCreate2);
        return eCreate2;
    }

    @Override // org.apache.commons.collections4.list.AbstractListDecorator, java.util.List
    public List<E> subList(int i, int i2) {
        return new LazyList(decorated().subList(i, i2), this.factory);
    }
}
