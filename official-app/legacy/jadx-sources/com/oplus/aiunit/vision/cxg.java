package com.oplus.aiunit.vision;

import java.util.Collections;
import java.util.HashSet;

/* JADX INFO: loaded from: classes15.dex */
public class cxg {
    public static final int MAX_POWER_OF_TWO = 1073741824;

    public static int a(int i) {
        if (i < 3) {
            b(i, "expectedSize");
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static int b(int i, String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }

    public static <E> HashSet<E> c(E... eArr) {
        HashSet<E> hashSetD = d(eArr.length);
        Collections.addAll(hashSetD, eArr);
        return hashSetD;
    }

    public static <E> HashSet<E> d(int i) {
        return new HashSet<>(a(i));
    }
}
