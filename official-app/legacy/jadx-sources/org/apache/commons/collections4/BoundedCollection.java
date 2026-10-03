package org.apache.commons.collections4;

import java.util.Collection;

/* JADX INFO: loaded from: classes11.dex */
public interface BoundedCollection<E> extends Collection<E> {
    boolean isFull();

    int maxSize();
}
