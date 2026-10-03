package org.apache.commons.collections4.comparators;

import java.io.Serializable;
import java.lang.Comparable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes11.dex */
public class ComparableComparator<E extends Comparable<? super E>> implements Comparator<E>, Serializable {
    public static final ComparableComparator INSTANCE = new ComparableComparator();
    private static final long serialVersionUID = -291439688585137865L;

    public static <E extends Comparable<? super E>> ComparableComparator<E> comparableComparator() {
        return INSTANCE;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        return this == obj || (obj != null && obj.getClass().equals(getClass()));
    }

    public int hashCode() {
        return 1769708912;
    }

    @Override // java.util.Comparator
    public int compare(E e2, E e3) {
        return e2.compareTo(e3);
    }
}
