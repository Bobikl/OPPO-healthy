package com.oplus.aiunit.vision;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes15.dex */
public final class i0b {
    public static int a(int i, String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }

    public static <T> T b(T t) {
        t.getClass();
        return t;
    }

    public static int c(int i) {
        a(i, "arraySize");
        return g(((long) i) + 5 + ((long) (i / 10)));
    }

    public static <E> ArrayList<E> d(Iterable<? extends E> iterable) {
        b(iterable);
        return iterable instanceof Collection ? new ArrayList<>((Collection) iterable) : e(iterable.iterator());
    }

    public static <E> ArrayList<E> e(Iterator<? extends E> it) {
        ArrayList<E> arrayListF = f(new Object[0]);
        kha.a(arrayListF, it);
        return arrayListF;
    }

    public static <E> ArrayList<E> f(E... eArr) {
        b(eArr);
        ArrayList<E> arrayList = new ArrayList<>(c(eArr.length));
        Collections.addAll(arrayList, eArr);
        return arrayList;
    }

    public static int g(long j2) {
        if (j2 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j2 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j2;
    }
}
