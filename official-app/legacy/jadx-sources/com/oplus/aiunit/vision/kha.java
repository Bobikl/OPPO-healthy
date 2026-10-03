package com.oplus.aiunit.vision;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes15.dex */
public final class kha {
    public static <T> boolean a(Collection<T> collection, Iterator<? extends T> it) {
        b(collection);
        b(it);
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= collection.add(it.next());
        }
        return zAdd;
    }

    public static <T> T b(T t) {
        t.getClass();
        return t;
    }
}
