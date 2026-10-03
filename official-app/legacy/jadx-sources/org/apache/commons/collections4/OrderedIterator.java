package org.apache.commons.collections4;

import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public interface OrderedIterator<E> extends Iterator<E> {
    boolean hasPrevious();

    E previous();
}
